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
public class Sirovine {
    int sifraSirovine;
    String nazivSirovine;
    int kolicinaSirovine;

    public int getSifraSirovine() {
        return sifraSirovine;
    }

    public void setSifraSirovine(int sifraSirovine) {
        this.sifraSirovine = sifraSirovine;
    }

    public String getNazivSirovine() {
        return nazivSirovine;
    }

    public void setNazivSirovine(String nazivSirovine) {
        this.nazivSirovine = nazivSirovine;
    }

    public int getKolicinaSirovine() {
        return kolicinaSirovine;
    }

    public void setKolicinaSirovine(int kolicinaSirovine) {
        this.kolicinaSirovine = kolicinaSirovine;
    }
    public String toString()
    {
        return sifraSirovine + "" + nazivSirovine;
    }
}
