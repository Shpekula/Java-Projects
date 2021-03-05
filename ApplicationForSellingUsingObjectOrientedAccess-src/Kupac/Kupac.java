/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kupac;

/**
 *
 * @author Freeware Sys
 */
public class Kupac {
    int sifraKupca;
    String nazivKupca;
    String OIBKupca;
    String AdresaKupca;
    String mailKupca;
    Integer KontaktBrojKupca;

    public int getSifraKupca() {
        return sifraKupca;
    }

    public void setSifraKupca(int sifraKupca) {
        this.sifraKupca = sifraKupca;
    }

    public String getNazivKupca() {
        return nazivKupca;
    }

    public void setNazivKupca(String nazivKupca) {
        this.nazivKupca = nazivKupca;
    }

    public String getOIBKupca() {
        return OIBKupca;
    }

    public void setOIBKupca(String OIBKupca) {
        this.OIBKupca = OIBKupca;
    }

    public String getAdresaKupca() {
        return AdresaKupca;
    }

    public void setAdresaKupca(String AdresaKupca) {
        this.AdresaKupca = AdresaKupca;
    }

    public String getMailKupca() {
        return mailKupca;
    }

    public void setMailKupca(String mailKupca) {
        this.mailKupca = mailKupca;
    }

    public Integer getKontaktBrojKupca() {
        return KontaktBrojKupca;
    }

    public void setKontaktBrojKupca(Integer KontaktBrojKupca) {
        this.KontaktBrojKupca = KontaktBrojKupca;
    }

public String toString(){
        return sifraKupca+" "+nazivKupca;    
}
}
