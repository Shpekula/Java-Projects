/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Racuni;

import Kupac.Kupac;
import Kupac.SQLKupac;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Shpekula
 */
public class SQLRacun {
    int SifraR=0;

    public int getSifraR() {
        return SifraR;
    }

    public void setSifraR(int SifraR) {
        this.SifraR = SifraR;
    }
    String osvjezi="";
SQLKupac sqlKupac = new SQLKupac();    
    
        public void spremi(Racun racun){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://");
            String sql = "INSERT INTO Racun (Sifra_racuna, Datum, Sifra_kupca, Cijena_racuna) VALUES(?,?,?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, racun.getSifraRacuna());
            stmt.setString(2, racun.getDatum());
            stmt.setInt(3, racun.getSifraKupca());
            stmt.setFloat(4,racun.getCijenaRacuna()); 

            
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<Racun> listaRacuna() {
        ArrayList<Racun> popisRacuna = new ArrayList<Racun>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://");
            String sql = "SELECT * FROM Racun;";
          
            //PreparedStatement stmt = conn.prepareStatement(sql);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                Racun racun = new Racun();
                racun.setSifraRacuna(rs.getInt("Sifra_racuna"));
                racun.setDatum(rs.getString("Datum"));     
                racun.setSifraKupca(rs.getInt("Sifra_kupca"));
                racun.setCijenaRacuna(rs.getFloat("Cijena_racuna"));
                popisRacuna.add(racun);
                
            }            
            conn.close();
            return popisRacuna;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }

    public void setNews(String osvjezi) {
        this.osvjezi = osvjezi;
        for (Racun racun : this.listaRacunaKD()) {
            racun.update(this.osvjezi);
        }
    }
    
    
 public ArrayList<Racun> listaRacunaKD() {
        ArrayList<Racun> popisRacuna = new ArrayList<Racun>();
        
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://");
            
            String sql = "SELECT * FROM Racun WHERE Sifra_racuna ="+SifraR+";";  
            
          
            //PreparedStatement stmt = conn.prepareStatement(sql);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()){
                Racun racun = new Racun();
                racun.setSifraRacuna(rs.getInt("Sifra_racuna"));
                racun.setDatum(rs.getString("Datum"));     
                racun.setSifraKupca(rs.getInt("Sifra_kupca"));
                racun.setCijenaRacuna(rs.getFloat("Cijena_racuna"));
                popisRacuna.add(racun);
                
            }            
            conn.close();
            return popisRacuna;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
    
     public void Brisanje(Racun racun){
         
          System.out.print(racun.getSifraRacuna());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://");
            String sql = "DELETE FROM Racun WHERE Sifra_racuna = "+racun.getSifraRacuna()+";";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.executeUpdate();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod brisanja... "+ex.toString());
        }
        }
     public void Izmjena(Racun racun){
         
          System.out.print(racun.getSifraRacuna());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://");
            String sql = "UPDATE Racun SET Cijena_racuna ='"+racun.getCijenaRacuna() +"'WHERE Sifra_racuna = "+racun.getSifraRacuna()+";";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.executeUpdate();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod izmjene... "+ex.toString());
        }
        }
}
