/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PDV;

/**
 *
 * @author Freeware Sys
 */
public class PDV {
    int sifraPDV;
    int PDV;

    public int getSifraPDV() {
        return sifraPDV;
    }

    public void setSifraPDV(int sifraPDV) {
        this.sifraPDV = sifraPDV;
    }

    public int getPDV() {
        return PDV;
    }

    public void setPDV(int PDV) {
        this.PDV = PDV;
    }
    public String toString(){
        return PDV+" "+sifraPDV;    
}  
    
}
