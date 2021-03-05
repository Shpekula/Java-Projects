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
public class GotovProizvod {
    int sifraProizvoda;
    String nazivProizvoda;
    int kolicinaProizvoda;

    public int getSifraProizvoda() {
        return sifraProizvoda;
    }

    public void setSifraProizvoda(int sifraProizvoda) {
        this.sifraProizvoda = sifraProizvoda;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public int getKolicinaProizvoda() {
        return kolicinaProizvoda;
    }

    public void setKolicinaProizvoda(int kolicinaProizvoda) {
        this.kolicinaProizvoda = kolicinaProizvoda;
    }

    public String toString()
    {
        return sifraProizvoda + "" + nazivProizvoda;
    }
}
