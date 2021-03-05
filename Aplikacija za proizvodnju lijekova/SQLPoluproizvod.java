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
public class SQLPoluproizvod {
    public void spremi(Poluproizvod poluproizvod){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://");//HIDDEN
            //String sql = "INSERT INTO Poluproizvod (Sifra_poluproizvoda,Naziv_poluproizvoda,KB_poluproizvoda, Kolicina_poluproizvoda, Datum_proizvodnje, Rok_valjanosti) VALUES(?,?,?,?,?,?);";
            String sql = "INSERT INTO Poluproizvod (Sifra_poluproizvoda,Naziv_poluproizvoda, Kolicina_poluproizvoda) VALUES(?,?,?);";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setInt(1, poluproizvod.getSifraPP());
            stmt.setString(2, poluproizvod.getNazivPP());
            stmt.setInt(3, 0);
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<Poluproizvod> listaPoluproizvoda() {
        ArrayList<Poluproizvod> popisPoluproizvoda = new ArrayList<Poluproizvod>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://");//HIDDEN
                String sql = "SELECT * FROM Poluproizvod;";               
                
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){
                    Poluproizvod poluproizvod = new Poluproizvod();
                    poluproizvod.setSifraPP(rs.getInt("Sifra_poluproizvoda"));
                    poluproizvod.setNazivPP(rs.getString("Naziv_poluproizvoda"));
                    poluproizvod.setKolicinaPP(rs.getInt("Kolicina_poluproizvoda"));
                    popisPoluproizvoda.add(poluproizvod);
            }
            conn.close();
            return popisPoluproizvoda;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
    
    public void Brisanje(Poluproizvod poluproizvod){
         
          System.out.print(poluproizvod.getSifraPP());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "DELETE FROM Poluproizvod WHERE Sifra_poluproizvoda = "+poluproizvod.getSifraPP()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod brisanja... "+ex.toString());
        }
        }
     
   public void Izmjena(Poluproizvod poluproizvod){
         
          System.out.print(poluproizvod.getSifraPP());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "UPDATE Poluproizvod SET Kolicina_poluproizvoda = '"+poluproizvod.getKolicinaPP()+"'WHERE Sifra_poluproizvoda = "+poluproizvod.getSifraPP()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
     public void IzmjenaSVE(Poluproizvod poluproizvod){
         
          System.out.print(poluproizvod.getSifraPP());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "UPDATE Poluproizvod SET Naziv_poluproizvoda = '" + poluproizvod.getNazivPP()+"',Kolicina_poluproizvoda= '"+poluproizvod.getKolicinaPP() + "'WHERE Sifra_poluproizvoda = "+poluproizvod.getSifraPP()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
}