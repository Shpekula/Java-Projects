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
public class Poluproizvod {
    int sifraPP;
    String nazivPP;
    int kolicinaPP;

    public int getSifraPP() {
        return sifraPP;
    }

    public void setSifraPP(int sifraPP) {
        this.sifraPP = sifraPP;
    }

    public String getNazivPP() {
        return nazivPP;
    }

    public void setNazivPP(String nazivPP) {
        this.nazivPP = nazivPP;
    }

    public int getKolicinaPP() {
        return kolicinaPP;
    }

    public void setKolicinaPP(int kolicinaPP) {
        this.kolicinaPP = kolicinaPP;
    }
    public String toString()
    {
        return sifraPP + "" + nazivPP;
    }
    
}