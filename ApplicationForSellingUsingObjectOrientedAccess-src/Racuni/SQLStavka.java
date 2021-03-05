/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Racuni;


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
public class SQLStavka {
    
    int SifraR=0;

    public int getSifraR() {
        return SifraR;
    }

    public void setSifraR(int SifraR) {
        this.SifraR = SifraR;
    }
    String osvjezi="";
    
    public void spremi(Stavka stavka){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
            String sql = "INSERT INTO StavkaRacuna (Sifra_stavke, Sifra_proizvoda, Kolicina_stavke, Cijena_stavke, Sifra_pdv, Sifra_racuna) VALUES(?,?,?,?,?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, stavka.getSifraStavke());
            stmt.setInt(2, stavka.getSifraProizvoda());
            stmt.setInt(3, stavka.getKolicinaStavke());
            stmt.setFloat(4,stavka.getCijenaStavke()); 
            stmt.setInt(5, stavka.getSifraPDV());
            stmt.setInt(6, stavka.getSifraRacuna());
                        
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<Stavka> listaStavke(String sifraRacuna) {
        ArrayList<Stavka> popisStavki = new ArrayList<Stavka>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
            String sql = "SELECT * FROM StavkaRacuna WHERE Sifra_racuna="+sifraRacuna+";";         
          
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                Stavka stavka = new Stavka();
                stavka.setSifraStavke(rs.getInt("Sifra_stavke"));
                stavka.setSifraProizvoda(rs.getInt("Sifra_proizvoda"));
                stavka.setKolicinaStavke(rs.getInt("Kolicina_stavke"));
                stavka.setSifraPDV(rs.getInt("Sifra_pdv"));
                stavka.setCijenaStavke(rs.getFloat("Cijena_stavke"));  
                stavka.setSifraRacuna(rs.getInt("Sifra_racuna"));     
                popisStavki.add(stavka);
                
            }            
            conn.close();
            return popisStavki;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
 
    
     public void Brisanje(Stavka stavka){
         
          System.out.print(stavka.getSifraStavke());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
            String sql = "DELETE FROM StavkaRacuna WHERE Sifra_stavke = "+stavka.getSifraStavke()+";";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.executeUpdate();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod brisanja... "+ex.toString());
        }
        }
     public void BrisanjePoSifriRac(Stavka stavka){
         
          System.out.print(stavka.getSifraStavke());
            
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
            String sql = "DELETE FROM StavkaRacuna WHERE Sifra_racuna = "+stavka.getSifraRacuna()+";";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.executeUpdate();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod brisanja... "+ex.toString());
        }
        }
      
     public ArrayList<Stavka> listaStavk() {
        ArrayList<Stavka> popisStavki = new ArrayList<Stavka>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
                String sql = "SELECT * FROM StavkaRacuna;";               
                
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()){
                    Stavka stavka = new Stavka();
                    stavka.setSifraStavke(rs.getInt("Sifra_stavke"));
                    stavka.setSifraProizvoda(rs.getInt("Sifra_proizvoda"));
                    stavka.setKolicinaStavke(rs.getInt("Kolicina_Stavke"));
                    stavka.setCijenaStavke(rs.getFloat("Cijena_stavke"));
                    stavka.setSifraPDV(rs.getInt("Sifra_pdv"));
                    stavka.setSifraRacuna(rs.getInt("Sifra_racuna"));
                    popisStavki.add(stavka);
            }
            conn.close();
            return popisStavki;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
     public void setNews(String osvjezi) {
        this.osvjezi = osvjezi;
        for (Stavka stavka : this.listaStavkeR()) {
            stavka.update(this.osvjezi);
        }
    }
     public ArrayList<Stavka> listaStavkeR() {
        ArrayList<Stavka> popisStavki = new ArrayList<Stavka>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://ucka.veleri.hr/tsimurda",
                    "tsimurda","11");
                String sql = "SELECT * FROM StavkaRacuna WHERE Sifra_racuna="+SifraR+";";      
               
                
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()){
                    Stavka stavka = new Stavka();
                    stavka.setSifraStavke(rs.getInt("Sifra_stavke"));
                    stavka.setSifraProizvoda(rs.getInt("Sifra_proizvoda"));
                    stavka.setKolicinaStavke(rs.getInt("Kolicina_Stavke"));
                    stavka.setCijenaStavke(rs.getFloat("Cijena_stavke"));
                    stavka.setSifraPDV(rs.getInt("Sifra_pdv"));
                    stavka.setSifraRacuna(rs.getInt("Sifra_racuna"));
                    popisStavki.add(stavka);
            }
            conn.close();
            return popisStavki;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
     
      }
