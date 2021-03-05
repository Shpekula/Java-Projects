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
public class SQLGotovProizvod {
    public void spremi(GotovProizvod proizvod){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://");//HIDDEN
            String sql = "INSERT INTO GotovProizvod (Sifra_gp, Naziv_gp, kolicina_gp, ) VALUES(?,?,?);";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setInt(1, proizvod.getSifraProizvoda());
            stmt.setString(2, proizvod.getNazivProizvoda());
            stmt.setInt(3, 0);
            
            /*
            stmt.setInt(3, proizvod.getKolicinaProizvoda());
            stmt.setString(4, proizvod.getDatumProizvodnje());
            stmt.setString(5, proizvod.getRokValjanosti());
              */          
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<GotovProizvod> listaGotovProizvoda() {
        ArrayList<GotovProizvod> popisGotovihProizvoda = new ArrayList<GotovProizvod>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://");//HIDDEN
                String sql = "SELECT * FROM GotovProizvod;";               
                
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){
                    GotovProizvod proizvod = new GotovProizvod();
                    proizvod.setSifraProizvoda(rs.getInt("Sifra_gp"));
                    proizvod.setNazivProizvoda(rs.getString("Naziv_gp"));
                    proizvod.setKolicinaProizvoda(rs.getInt("Kolicina_gp"));
                    popisGotovihProizvoda.add(proizvod);
            }
            conn.close();
            return popisGotovihProizvoda;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
    
    public void Brisanje(GotovProizvod proizvod){
         
          System.out.print(proizvod);
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "DELETE FROM GotovProizvod WHERE Sifra_gp = "+proizvod.getSifraProizvoda()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod brisanja... "+ex.toString());
        }
        }
     
   public void Izmjena(GotovProizvod proizvod){
         
          System.out.print(proizvod.getSifraProizvoda());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "UPDATE GotovProizvod SET kolicina_gp = '" + proizvod.getKolicinaProizvoda() +"'WHERE Sifra_gp = " + proizvod.getSifraProizvoda() +";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
     public void IzmjenaSVE(GotovProizvod proizvod){
         
          System.out.print(proizvod.getSifraProizvoda());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "UPDATE GotovProizvod SET Sifra_gp = '" + proizvod.getSifraProizvoda() + "',Naziv_gp = '"+ proizvod.getNazivProizvoda() + "', Kolicina_gp = '"+ proizvod.getKolicinaProizvoda() + "'WHERE Sifra_gp = " + proizvod.getSifraProizvoda() +";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
}
