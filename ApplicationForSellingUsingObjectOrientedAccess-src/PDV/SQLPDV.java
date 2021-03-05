/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDV;

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
public class SQLPDV {
    public void spremi(PDV pdv){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://");
            String sql = "INSERT INTO PDV (Sifra_PDV, Postotak) VALUES(?,?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, pdv.getSifraPDV());
            stmt.setInt(2, pdv.getPDV());        
                        
            stmt.execute();
            
            conn.close();
        }catch (Exception ex){
            System.out.println("Greška kod spremanja... "+ex.toString());
        }
    }

    public ArrayList<PDV> listaPDV() {
        ArrayList<PDV> popisPDV = new ArrayList<PDV>();
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://");
                String sql = "SELECT * FROM PDV;";               
                
                //PreparedStatement stmt = conn.prepareStatement(sql);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                
                while (rs.next()){
                    PDV pdv = new PDV();
                    pdv.setSifraPDV(rs.getInt("Sifra_PDV"));
                    pdv.setPDV(rs.getInt("Postotak"));
                    popisPDV.add(pdv);
                    
            }
            conn.close();
            return popisPDV;

        }catch (Exception ex){
            System.out.println("Greška kod dohvata... "+ex.toString());
            return null;
        }
    }
}
