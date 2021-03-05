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
public class SQLSUP {
    public void spremi(SUP sup){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://");//HIDDEN
            String sql = "INSERT INTO SirovineUPoluproizvodu (Sifra_poluproizvoda,Kolicina_sup, Sifra_sirovine) VALUES(?,?,?);";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setInt(1,sup.getSifraPP());
            stmt.setInt(2, sup.getKolicinaSUP());
            stmt.setInt(3, sup.getSifraSirovine());
                        
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<SUP> listaSUP() {
        ArrayList<SUP> popisSUP = new ArrayList<SUP>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://");//HIDDEN
                String sql = "SELECT * FROM SirovineUPoluproizvodu;";               
                
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){
                    SUP sup = new SUP();
                    sup.setSifraPP(rs.getInt("Sifra_poluproizvoda"));
                    sup.setKolicinaSUP(rs.getInt("Kolicina_sup"));
                    sup.setSifraSirovine(rs.getInt("Sifra_sirovine"));
                    popisSUP.add(sup);
            }
            conn.close();
            return popisSUP;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
    
    public void Brisanje(SUP sup){
         
          System.out.print(sup.getSifraSirovine());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "DELETE FROM SirovineUPoluproizvodu WHERE Sifra_poluproizvoda = "+sup.getSifraPP()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod brisanja... "+ex.toString());
        }
        }
     
   public void Izmjena(SUP sup){
         
          System.out.print(sup.getSifraSirovine());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "UPDATE SirovineUPoluproizvodu SET Kolicina_sup = '" + sup.getKolicinaSUP()+"'WHERE Sifra_poluproizvoda = " + sup.getSifraPP()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
     public void IzmjenaSVE(SUP sup){
         
          System.out.print(sup.getSifraSirovine());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {
                  String sql = "UPDATE SirovineUPoluproizvodu SET Sifra_poluproizvoda = '" + sup.getSifraPP() +"',Kolicina_sup = '"+sup.getKolicinaSUP() + "'Sifra_sirovine = '" + sup.getSifraSirovine()+ "'WHERE Sifra_poluproizvoda = " + sup.getSifraPP()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
}
