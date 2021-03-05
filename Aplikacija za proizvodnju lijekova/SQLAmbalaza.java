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
public class SQLAmbalaza {
    public void spremi(Ambalaza ambalaza){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql:);//HIDDEN
            String sql = "INSERT INTO Ambalaza (Sifra_ambalaze, Sifra_gp, Sifra_Poluproizvoda, kolicina_za_pakiranje) VALUES(?,?,?,?);";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setInt(1, ambalaza.getSifraAmbalaze());
            stmt.setInt(2, ambalaza.getSifraProizvoda());
            stmt.setInt(3,ambalaza.getSifraPP());
            stmt.setInt(4, ambalaza.getKolicinaZP());
                        
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<Ambalaza> listaAmbalaze() {
        ArrayList<Ambalaza> popisAmbalaza = new ArrayList<Ambalaza>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://");//HIDDEN
                String sql = "SELECT * FROM Ambalaza;";               
                
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){
                    Ambalaza ambalaza = new Ambalaza();
                    ambalaza.setSifraAmbalaze(rs.getInt("Sifra_ambalaze"));
                    ambalaza.setSifraProizvoda(rs.getInt("Sifra_gp"));
                    ambalaza.setSifraPP(rs.getInt("Sifra_poluproizvoda"));
                    ambalaza.setKolicinaZP(rs.getInt("kolicina_za_pakiranje"));
                    popisAmbalaza.add(ambalaza);
            }
            conn.close();
            return popisAmbalaza;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
    
    public void Brisanje(Ambalaza ambalaza){
         
          System.out.print(ambalaza.getSifraAmbalaze());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "DELETE FROM Ambalaza WHERE Sifra_ambalaze = "+ambalaza.getSifraAmbalaze()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod brisanja... "+ex.toString());
        }
        }
     
   public void Izmjena(Ambalaza ambalaza){
         
          System.out.print(ambalaza.getSifraAmbalaze());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "UPDATE Ambalaza SET kolicina_za_pakiranje = '" + ambalaza.getKolicinaZP() +"'WHERE Sifra_ambalaze = " + ambalaza.getSifraAmbalaze()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
     public void IzmjenaSVE(Ambalaza ambalaza){
         
          System.out.print(ambalaza.getSifraAmbalaze());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "UPDATE Ambalaza SET Sifra_ambalaze = '" + ambalaza.getSifraAmbalaze() + "',Sifra_gp = '"+ ambalaza.getSifraProizvoda() +"',Sifra_poluproizvoda = '" + ambalaza.getSifraPP()+ "',kolicina_za_pakiranje  =" + ambalaza.getKolicinaZP() + "'WHERE Sifra_ambalaze = " + ambalaza.getSifraAmbalaze()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
}