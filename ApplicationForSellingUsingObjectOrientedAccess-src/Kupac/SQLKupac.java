/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kupac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Shpekula
 */
public class SQLKupac {
    int SifraA=0;

    public int getSifraA() {
        return SifraA;
    }

    public void setSifraA(int SifraA) {
        this.SifraA = SifraA;
    }
         public void spremi(Kupac kupac){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
            String sql = "INSERT INTO Kupac (Sifra_kupca,Naziv_kupca,OIB_kupca, Adresa_kupca, Mail_kupca, Kontakt_broj_kupca) VALUES(?,?,?,?,?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, kupac.getSifraKupca());
            stmt.setString(2, kupac.getNazivKupca());
            stmt.setString(3,kupac.getOIBKupca());
            stmt.setString(4,kupac.getAdresaKupca());
            stmt.setString(5,kupac.getMailKupca());
            stmt.setInt(6, kupac.getKontaktBrojKupca());        
                        
            stmt.execute();
            conn.close();
        
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<Kupac> listaKupaca() {
        ArrayList<Kupac> popisKupaca = new ArrayList<Kupac>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
            String sql = "SELECT * FROM Kupac;";         
          
            //PreparedStatement stmt = conn.prepareStatement(sql);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                Kupac kupac = new Kupac();
                kupac.setSifraKupca(rs.getInt("Sifra_kupca"));
                kupac.setNazivKupca(rs.getString("Naziv_kupca"));
                kupac.setOIBKupca(rs.getString("OIB_Kupca"));
                kupac.setAdresaKupca(rs.getString("Adresa_Kupca"));
                kupac.setMailKupca(rs.getString("Mail_kupca"));
                kupac.setKontaktBrojKupca(rs.getInt("Kontakt_broj_kupca"));
                popisKupaca.add(kupac);
            }            
            conn.close();
            return popisKupaca;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
    
    public ArrayList<Kupac> listaKupacaS() {
        ArrayList<Kupac> popisKupaca = new ArrayList<Kupac>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
            String sql = "SELECT * FROM Kupac WHERE Sifra_kupca="+SifraA+";";         
          
            //PreparedStatement stmt = conn.prepareStatement(sql);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                Kupac kupac = new Kupac();
                kupac.setSifraKupca(rs.getInt("Sifra_kupca"));
                kupac.setNazivKupca(rs.getString("Naziv_kupca"));
                kupac.setOIBKupca(rs.getString("OIB_Kupca"));
                kupac.setAdresaKupca(rs.getString("Adresa_Kupca"));
                kupac.setMailKupca(rs.getString("Mail_kupca"));
                kupac.setKontaktBrojKupca(rs.getInt("Kontakt_broj_kupca"));
                popisKupaca.add(kupac);
            }            
            conn.close();
            return popisKupaca;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
 
    
     public void Brisanje(Kupac kupac){
         
          System.out.print(kupac.getSifraKupca());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
            String sql = "DELETE FROM Kupac WHERE Sifra_kupca = "+kupac.getSifraKupca()+";";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.executeUpdate();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod brisanja... "+ex.toString());
        }
        }
     
     public void Izmjena(Kupac kupac){
                 System.out.print(kupac.getSifraKupca());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11")){
            String sql = "UPDATE Kupac SET Naziv_kupca = '"+kupac.getNazivKupca()+"',OIB_kupca = '"+kupac.getOIBKupca()+"',Adresa_kupca = '"+kupac.getAdresaKupca()+"',Mail_kupca = '"+kupac.getMailKupca()+"',Kontakt_broj_kupca = '"+kupac.getKontaktBrojKupca()+"'WHERE Sifra_kupca = "+kupac.getSifraKupca()+";";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.executeUpdate();
            }
            //conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod Izmjene... "+ex.toString());
        }  
        
                
        
     }
}
