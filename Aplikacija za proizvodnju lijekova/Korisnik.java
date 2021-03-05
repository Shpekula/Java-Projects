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
public class Korisnik {
    int sifraKorisnika;
    String nazivKorisnika;
    String lozinkaKorisnika;
    String statusKorisnika;

    public int getSifraKorisnika() {
        return sifraKorisnika;
    }

    public void setSifraKorisnika(int sifraKorisnika) {
        this.sifraKorisnika = sifraKorisnika;
    }

    public String getNazivKorisnika() {
        return nazivKorisnika;
    }

    public void setNazivKorisnika(String nazivKorisnika) {
        this.nazivKorisnika = nazivKorisnika;
    }

    public String getLozinkaKorisnika() {
        return lozinkaKorisnika;
    }

    public void setLozinkaKorisnika(String lozinkaKorisnika) {
        this.lozinkaKorisnika = lozinkaKorisnika;
    }

    public String getStatusKorisnika() {
        return statusKorisnika;
    }

    public void setStatusKorisnika(String statusKorisnika) {
        this.statusKorisnika = statusKorisnika;
    }
    public String toString()
    {
        return sifraKorisnika + "" + nazivKorisnika;
    }
    
}
