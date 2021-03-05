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
public class SQLIzrada {
    public void spremi(Izrada izrada){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://");//HIDDEN
            
            String sql = "INSERT INTO Izrada (Sifra_izrade, Sifra_poluproizvoda, Kolicina_izradenih, Datum_izrade, Rok_valjanosti) VALUES(?,?,?,?,?);";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setInt(1, izrada.getSifraIzrade());
            stmt.setInt(2, izrada.getSifraPP());
            stmt.setInt(3, izrada.getKolicinaIzradenih());
            stmt.setString(4, izrada.getDatumIzrade());
            stmt.setString(5, izrada.getRokValjanosti());
                    
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<Izrada> listaIzrade() {
        ArrayList<Izrada> popisIzrade = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://");//HIDDEN
                String sql = "SELECT * FROM Izrada;";               
                
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){
                    Izrada izrada = new Izrada();
                    izrada.setSifraIzrade(rs.getInt("Sifra_izrade"));
                    izrada.setSifraPP(rs.getInt("Sifra_poluproizvoda"));
                    izrada.setKolicinaIzradenih(rs.getInt("Kolicina_izradenih"));
                    izrada.setDatumIzrade(rs.getString("Datum_izrade"));
                    izrada.setRokValjanosti(rs.getString("Rok_valjanosti"));
                    
                    popisIzrade.add(izrada);
            }
            conn.close();
            return popisIzrade;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
}
