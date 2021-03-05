/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isproizvodnjelijekova;

/**
 *
 * @author Shpekula
 */
public class Pakiranje {
    int sifraPakiranja;
    int sifraAmbalaze;
    int kolicinaPakiranih;
    String datumProizvodnje;
    String rokValjanosti;

    public int getSifraPakiranja() {
        return sifraPakiranja;
    }

    public void setSifraPakiranja(int sifraPakiranja) {
        this.sifraPakiranja = sifraPakiranja;
    }

    public int getSifraAmbalaze() {
        return sifraAmbalaze;
    }

    public void setSifraAmbalaze(int sifraAmbalaze) {
        this.sifraAmbalaze = sifraAmbalaze;
    }

    public int getKolicinaPakiranih() {
        return kolicinaPakiranih;
    }

    public void setKolicinaPakiranih(int kolicinaPakiranih) {
        this.kolicinaPakiranih = kolicinaPakiranih;
    }

    public String getDatumProizvodnje() {
        return datumProizvodnje;
    }

    public void setDatumProizvodnje(String datumProizvodnje) {
        this.datumProizvodnje = datumProizvodnje;
    }

    public String getRokValjanosti() {
        return rokValjanosti;
    }

    public void setRokValjanosti(String rokValjanosti) {
        this.rokValjanosti = rokValjanosti;
    }
    
}
