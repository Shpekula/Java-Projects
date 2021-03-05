/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proizvod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Freeware Sys
 */
public class SQLProizvod {
    
            int sifraA=0;
            String nazivA="prvi";

    public String getNazivA() {
        return nazivA;
    }

    public void setNazivA(String nazivA) {
        this.nazivA = nazivA;
    }

    public int getSifraA() {
        return sifraA;
    }

    public void setSifraA(int sifraA) {
        this.sifraA = sifraA;
    }
    
     public void spremi(Proizvod proizvod){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
            String sql = "INSERT INTO Proizvod (Sifra_proizvoda,Naziv_proizvoda,Cijena_proizvoda, Kolicina_proizvoda) VALUES(?,?,?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, proizvod.getSifraProizvoda());
            stmt.setString(2, proizvod.getNazivProizvoda());
            stmt.setFloat(3,proizvod.getCijenaProizvoda());
            stmt.setInt(4, proizvod.getKolicinaProizvoda());        
                        
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<Proizvod> listaProizvoda() {
        ArrayList<Proizvod> popisProizvoda = new ArrayList<Proizvod>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
                String sql = "SELECT * FROM Proizvod;";               
                
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){
                    Proizvod proizvod = new Proizvod();
                    proizvod.setSifraProizvoda(rs.getInt("Sifra_proizvoda"));
                    proizvod.setNazivProizvoda(rs.getString("Naziv_proizvoda"));
                    proizvod.setCijenaProizvoda(rs.getFloat("Cijena_proizvoda"));
                    proizvod.setKolicinaProizvoda(rs.getInt("Kolicina_proizvoda"));
                    popisProizvoda.add(proizvod);
            }
            conn.close();
            return popisProizvoda;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
    
    public ArrayList<Proizvod> listaProizvodaS() {
        

        
        ArrayList<Proizvod> popisProizvoda = new ArrayList<Proizvod>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
                String sql = "SELECT * FROM Proizvod WHERE Sifra_Proizvoda = "+sifraA+";";          
                
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){
                    Proizvod proizvod = new Proizvod();
                    proizvod.setSifraProizvoda(rs.getInt("Sifra_proizvoda"));
                    proizvod.setNazivProizvoda(rs.getString("Naziv_proizvoda"));
                    proizvod.setCijenaProizvoda(rs.getFloat("Cijena_proizvoda"));
                    proizvod.setKolicinaProizvoda(rs.getInt("Kolicina_proizvoda"));
                    popisProizvoda.add(proizvod);
            }
            conn.close();
            return popisProizvoda;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }

    public void Brisanje(Proizvod proizvod){
         
          System.out.print(proizvod.getSifraProizvoda());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                      "tsimurda","11")) {
                  String sql = "DELETE FROM Proizvod WHERE Sifra_proizvoda = "+proizvod.getSifraProizvoda()+";";
                  PreparedStatement stmt = conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod brisanja... "+ex.toString());
        }
        }
     
   public void Izmjena(Proizvod proizvod){
         
          System.out.print(proizvod.getSifraProizvoda());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                      "tsimurda","11")) {
                  String sql = "UPDATE Proizvod SET Kolicina_proizvoda = '"+proizvod.getKolicinaProizvoda()+"'WHERE Sifra_proizvoda = "+proizvod.getSifraProizvoda()+";";
                  PreparedStatement stmt = conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
     public void IzmjenaSVE(Proizvod proizvod){
         
          System.out.print(proizvod.getSifraProizvoda());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
              try (Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                      "tsimurda","11")) {
                  String sql = "UPDATE Proizvod SET Naziv_proizvoda = '"+proizvod.getNazivProizvoda()+"',Cijena_proizvoda = '"+proizvod.getCijenaProizvoda()+"',Kolicina_proizvoda = '"+proizvod.getKolicinaProizvoda()+"'WHERE Sifra_proizvoda = "+proizvod.getSifraProizvoda()+";";
                  PreparedStatement stmt = conn.prepareStatement(sql);
                  
                  stmt.executeUpdate();
              }
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
     public void IzmjenaSvihProizvoda(Proizvod proizvod){
         System.out.print(proizvod.getSifraProizvoda());
     }
}