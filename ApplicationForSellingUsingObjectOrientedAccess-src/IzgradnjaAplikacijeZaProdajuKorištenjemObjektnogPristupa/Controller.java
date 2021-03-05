/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IzgradnjaAplikacijeZaProdajuKorištenjemObjektnogPristupa;

/**
 *
 * @author Shpekula
 */
public class Controller {
    
    
    public float IznosStavke(int PDV, int kolicinaStavke, float cijenaProizvoda){
        float iznos;
        float PDVa = (float) 1.25;
        float PDVb = (float)(PDV/100)+1;
        iznos = cijenaProizvoda * kolicinaStavke * PDVa;
        float izracun;
        izracun = (float) (Math.round(iznos*100.0)/100.0);
        return izracun;
    }
    public float IznosPDVa(int PDV, int kolicinaStavke, float ukupnoStavka, float cijenaProizvoda){
        float PDVStavke;
        float iznos;
        iznos = cijenaProizvoda * kolicinaStavke;
        PDVStavke = iznos / 100 * PDV;
        return PDVStavke;
    }
    public float ukupanIznos(float iznosStavke, float ukupno){
        ukupno = ukupno + iznosStavke;
        return ukupno;
    }
    public int izracunKolicineOduzimanje(int kolicinaStavke, int kolicinaProizvoda){
        int ukupnaKolicina = 0;
        ukupnaKolicina = kolicinaProizvoda - kolicinaStavke; //+5*kolicinaStavke; //+5*kolicinaStavke da ne oduzme više iz baze nego što treba
        return ukupnaKolicina;
    }
    public int izracunKolicineZbrajanje(int dodanaKolicina, int kolicinaProizvoda){
        int ukupnaKolicina = 0;
        ukupnaKolicina = kolicinaProizvoda + dodanaKolicina;
        return ukupnaKolicina;
    }
}
