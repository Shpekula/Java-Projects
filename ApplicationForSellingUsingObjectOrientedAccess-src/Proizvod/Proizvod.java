/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proizvod;

/**
 *
 * @author Freeware Sys
 */
public class Proizvod {
    int sifraProizvoda;
    String nazivProizvoda;
    float cijenaProizvoda;
    int kolicinaProizvoda;
    /**
     *
     * @return
     */
    public int getSifraProizvoda() {
        return sifraProizvoda;
    }
    /**
     *
     * @param sifraProizvoda
     */
    public void setSifraProizvoda(int sifraProizvoda) {
        this.sifraProizvoda = sifraProizvoda;
    }
    /**
     *
     * @return
     */
    public String getNazivProizvoda() {
        return nazivProizvoda;
    }
    /**
     *
     * @param nazivProizvoda
     */
    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }
    /**
     *
     * @return
     */
    public float getCijenaProizvoda() {
        return cijenaProizvoda;
    }
    /**
     *
     * @param cijenaProizvoda
     */
    public void setCijenaProizvoda(float cijenaProizvoda) {
        this.cijenaProizvoda = cijenaProizvoda;
    }
    /**
     *
     * @return
     */
    public int getKolicinaProizvoda() {
        return kolicinaProizvoda;
    }
    /**
     *
     * @param kolicinaProizvoda
     */
    public void setKolicinaProizvoda(int kolicinaProizvoda) {
        this.kolicinaProizvoda = kolicinaProizvoda;
    }
    /**
     *
     * @return
     */
    public String toString(){
        return nazivProizvoda;    
}        
    
}
