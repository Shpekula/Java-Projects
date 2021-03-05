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
public class SQLKorisnik {
    public void spremi(Korisnik korisnik){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://");//HIDDEN
            
            String sql = "INSERT INTO Korisnici (Sifra_korisnika,Naziv_korisnika, Lozinka_korisnika, Status_korisnika) VALUES(?,?,?,?);";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
            stmt.setInt(1, korisnik.getSifraKorisnika());
            stmt.setString(2, korisnik.getNazivKorisnika());
            stmt.setString(3, korisnik.getLozinkaKorisnika());
            stmt.setString(4, korisnik.getStatusKorisnika());
                    
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<Korisnik> listaKorisnika() {
        ArrayList<Korisnik> popisKorisnika = new ArrayList<Korisnik>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://");//HIDDEN
                String sql = "SELECT * FROM Korisnici;";               
                
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){
                    Korisnik korisnik = new Korisnik();
                    korisnik.setSifraKorisnika(rs.getInt("Sifra_korisnika"));
                    korisnik.setNazivKorisnika(rs.getString("Naziv_korisnika"));
                    korisnik.setLozinkaKorisnika(rs.getString("Lozinka_korisnika"));
                    korisnik.setStatusKorisnika(rs.getString("Status_korisnika"));
                    
                    popisKorisnika.add(korisnik);
            }
            conn.close();
            return popisKorisnika;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
    
    public void Brisanje(Korisnik korisnik){
         
          System.out.print(korisnik.getSifraKorisnika());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "DELETE FROM Korisnici WHERE Sifra_korisnika = " + korisnik.getSifraKorisnika()+ ";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod brisanja... "+ex.toString());
        }
        }
     
   public void Izmjena(Korisnik korisnik){
         
          System.out.print(korisnik.getSifraKorisnika());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "UPDATE Korisnici SET Lozinka_korisnika = '" + korisnik.getLozinkaKorisnika()+"'WHERE Sifra_korisnika = " + korisnik.getSifraKorisnika()+ ";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
     public void IzmjenaSVE(Korisnik korisnik){            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://")) {//HIDDEN
                  String sql = "UPDATE Korisnici SET Naziv_korisnika = '" + korisnik.getNazivKorisnika()+ "',Lozinka_korisnika = '" + korisnik.getLozinkaKorisnika() + "',Status_korisnika = '" + korisnik.getStatusKorisnika() +"'WHERE Sifra_korisnika = " + korisnik.getSifraKorisnika()+";";
                  PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
}