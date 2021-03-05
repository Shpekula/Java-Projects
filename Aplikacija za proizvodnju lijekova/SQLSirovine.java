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
public class SQLSirovine {
    public void spremi(Sirovine sirovine){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://");//HIDDEN
            String sql = "INSERT INTO Sirovine (Sifra_sirovine,Naziv_sirovine, Kolicina_sirovine) VALUES(?,?,?,?);";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setInt(1, sirovine.getSifraSirovine());
            stmt.setString(2, sirovine.getNazivSirovine());
            stmt.setInt(4, sirovine.getKolicinaSirovine());        
                        
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<Sirovine> listaSirovina() {
        ArrayList<Sirovine> popisSirovina = new ArrayList<Sirovine>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection
        ("jdbc:mysql://");//HIDDEN
                String sql = "SELECT * FROM Sirovine;";               
                
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){
                    Sirovine sirovine = new Sirovine();
                    sirovine.setSifraSirovine(rs.getInt("Sifra_sirovine"));
                    sirovine.setNazivSirovine(rs.getString("Naziv_sirovine"));
                    sirovine.setKolicinaSirovine(rs.getInt("Kolicina_sirovine"));
                    popisSirovina.add(sirovine);
            }
            conn.close();
            return popisSirovina;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
    
    public void Brisanje(Sirovine sirovine){
         
          System.out.print(sirovine.getSifraSirovine());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "DELETE FROM Sirovine WHERE Sifra_sirovine = "+sirovine.getSifraSirovine()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod brisanja... "+ex.toString());
        }
        }
     
   public void Izmjena(Sirovine sirovine){
         
          System.out.print(sirovine.getSifraSirovine());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "UPDATE Sirovine SET Kolicina_sirovine = '"+sirovine.getKolicinaSirovine()+"'WHERE Sifra_sirovine = "+sirovine.getSifraSirovine()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
     public void IzmjenaSVE(Sirovine sirovine){
         
          System.out.print(sirovine.getSifraSirovine());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "UPDATE Sirovine SET Naziv_sirovine = '" + sirovine.getNazivSirovine()+"',Kolicina_sirovine = '"+sirovine.getKolicinaSirovine()+"'WHERE Sifra_sirovine = "+sirovine.getSifraSirovine()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
}