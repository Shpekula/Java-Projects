/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isproizvodnjelijekova;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Shpekula
 */
public class SQLPakiranje {
    public void spremi(Pakiranje pakiranje){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://");//HIDDEN
            
            String sql = "INSERT INTO Pakiranje (Sifra_pakiranja,Sifra_ambalaze, Kolicina_pakiranih, Datum_proizvodnje, Rok_valjanosti) VALUES(?,?,?,?,?);";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setInt(1, pakiranje.getSifraPakiranja());
            stmt.setInt(2, pakiranje.getSifraAmbalaze());
            stmt.setInt(3, pakiranje.getKolicinaPakiranih());
            stmt.setString(4, pakiranje.getDatumProizvodnje());
            stmt.setString(5, pakiranje.getRokValjanosti());
                    
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<Pakiranje> listaPakiranja() {
        ArrayList<Pakiranje> popisPakiranja = new ArrayList<Pakiranje>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://");//HIDDEN
                String sql = "SELECT * FROM Pakiranje;";               
                
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){
                    Pakiranje pakiranje = new Pakiranje();
                    pakiranje.setSifraPakiranja(rs.getInt("Sifra_pakiranja"));
                    pakiranje.setSifraAmbalaze(rs.getInt("Sifra_ambalaze"));
                    pakiranje.setKolicinaPakiranih(rs.getInt("Kolicina_pakiranih"));
                    pakiranje.setDatumProizvodnje(rs.getString("Datum_proizvodnje"));
                    pakiranje.setRokValjanosti(rs.getString("Rok_valjanosti"));
                    
                    popisPakiranja.add(pakiranje);
            }
            conn.close();
            return popisPakiranja;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
}