/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Racuni;

import IzgradnjaAplikacijeZaProdajuKorištenjemObjektnogPristupa.Controller;
import Kupac.Kupac;
import Kupac.SQLKupac;
import PDV.PDV;
import PDV.SQLPDV;
import Proizvod.Proizvod;
import Proizvod.SQLProizvod;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Freeware Sys
 */
public class KreiranjeRacuna extends javax.swing.JFrame {
SQLKupac sqlKupac = new SQLKupac();
SQLProizvod sqlProizvod = new SQLProizvod();
SQLPDV sqlPDV = new SQLPDV();
SQLRacun sqlRacun = new SQLRacun();
SQLStavka sqlStavka = new SQLStavka();
Controller controll = new Controller();
IspisRacuna ispisR = new IspisRacuna();
    public static KreiranjeRacuna instance;
    
    ArrayList<Proizvod>listaProizvoda = sqlProizvod.listaProizvoda();
    
    /**
     * Creates new form KreiranjeRacuna
     */
    public KreiranjeRacuna() {
        initComponents();
        popuniKupca();
        popuniProizvod();
        //popuniPDV();
        autoinkrementacijaRacuna();
        autoinkrementacijaStavke();
        //datum();
        datum();
        dodajPDV();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSifraRacuna = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSifraKupca = new javax.swing.JTextField();
        cmbKupac = new javax.swing.JComboBox<>();
        txtDatum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablicaStavke = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtSifraProizvoda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCijenaProizvoda = new javax.swing.JTextField();
        cmbProizvod = new javax.swing.JComboBox<>();
        txtKolicinaProizvoda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSifraPDV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPDV = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnKreirajRacun = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();
        btnOdustani = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSifraStavke = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtKolicinaStavke = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtIznosStavke = new javax.swing.JTextField();
        btnIzracunStavke = new javax.swing.JButton();
        txtUkupanIznos = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnOsvjezi = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Šifra računa:");

        txtSifraRacuna.setEditable(false);

        jLabel2.setText("Šifra kupca:");

        txtSifraKupca.setEditable(false);

        cmbKupac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKupacActionPerformed(evt);
            }
        });

        txtDatum.setEditable(false);

        TablicaStavke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Šifra stavke", "Šifra proizvoda", "Količina stavke", "Iznos stavke", "Šifra PDV", "Šifra računa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablicaStavke);

        jLabel3.setText("Šifra proizvoda:");

        txtSifraProizvoda.setEditable(false);

        jLabel4.setText("Cijena proizvoda:");

        txtCijenaProizvoda.setEditable(false);

        cmbProizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProizvodActionPerformed(evt);
            }
        });

        txtKolicinaProizvoda.setEditable(false);

        jLabel5.setText("Šifra PDV:");

        txtSifraPDV.setEditable(false);

        jLabel6.setText("PDV:");

        txtPDV.setEditable(false);

        jLabel7.setText("Ukupan iznos:");

        btnKreirajRacun.setText("Kreiraj račun");
        btnKreirajRacun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajRacunActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnOdustani.setText("Odustani");
        btnOdustani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdustaniActionPerformed(evt);
            }
        });

        jLabel8.setText("Šifra stavke:");

        txtSifraStavke.setEditable(false);

        jLabel9.setText("Količina stavke:");

        jLabel10.setText("Iznos stavke:");

        txtIznosStavke.setEditable(false);

        btnIzracunStavke.setText("Izračunaj stavku");
        btnIzracunStavke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzracunStavkeActionPerformed(evt);
            }
        });

        txtUkupanIznos.setEditable(false);
        txtUkupanIznos.setText("0");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setText("Kreiranje računa");

        btnOsvjezi.setText("Osvježi");
        btnOsvjezi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOsvjeziActionPerformed(evt);
            }
        });

        jLabel12.setText("Količina proizvoda:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnOdustani, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnOsvjezi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKreirajRacun)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIznosStavke, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnIzracunStavke))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtSifraRacuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtSifraStavke, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtKolicinaStavke, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel12)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCijenaProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtKolicinaProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSifraPDV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnDodaj)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtSifraProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cmbProizvod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtSifraKupca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cmbKupac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(106, 106, 106))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSifraRacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtSifraKupca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKupac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSifraProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProizvod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSifraStavke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCijenaProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSifraPDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtKolicinaStavke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKolicinaProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(jLabel10)
                    .addComponent(txtIznosStavke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIzracunStavke))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnKreirajRacun)
                    .addComponent(txtUkupanIznos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOdustani)
                    .addComponent(btnOsvjezi))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbKupacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKupacActionPerformed
        cmbKupac.getSelectedItem().toString();
        Kupac selKupac = (Kupac) cmbKupac.getSelectedItem();
        txtSifraKupca.setText(Integer.toString(selKupac.getSifraKupca()));
    }//GEN-LAST:event_cmbKupacActionPerformed

    private void cmbProizvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProizvodActionPerformed
        cmbProizvod.getSelectedItem().toString();
        Proizvod selProizvod = (Proizvod)cmbProizvod.getSelectedItem();
        txtCijenaProizvoda.setText(Float.toString(selProizvod.getCijenaProizvoda()));
        txtSifraProizvoda.setText(Integer.toString(selProizvod.getSifraProizvoda()));
        txtKolicinaProizvoda.setText(Integer.toString(selProizvod.getKolicinaProizvoda()));
    }//GEN-LAST:event_cmbProizvodActionPerformed

    private void btnIzracunStavkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzracunStavkeActionPerformed
    cmbKupac.setEnabled(false);
    float cijenaProizvoda = Float.parseFloat(txtCijenaProizvoda.getText());
    int kolicinaStavke = Integer.parseInt(txtKolicinaStavke.getText());
    int PDV = Integer.parseInt(txtPDV.getText());
    
    float iznos = controll.IznosStavke(PDV, kolicinaStavke, cijenaProizvoda);
    txtIznosStavke.setText(Float.toString(iznos));
    txtIznosStavke.toString();
    int kolicinaProizvoda = Integer.parseInt(txtKolicinaProizvoda.getText());
    float ukupno = Float.parseFloat(txtUkupanIznos.getText());
    if(kolicinaStavke <= kolicinaProizvoda){
    ukupno = controll.ukupanIznos(iznos, ukupno);
    txtUkupanIznos.setText(Float.toString(ukupno));
    
    txtKolicinaStavke.setEditable(false);
    btnIzracunStavke.setVisible(false);
    btnKreirajRacun.setVisible(false);
    btnDodaj.setVisible(true);}
    else{
        txtKolicinaStavke.setText("");
        txtIznosStavke.setText("");
        JOptionPane.showMessageDialog(null, "količina stavke ne može biti veća od količine proizvoda");
    }
    }//GEN-LAST:event_btnIzracunStavkeActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        // TODO add your handling code here:
    int sifraStavke = Integer.parseInt(txtSifraStavke.getText());
    int sifraProizvoda = Integer.parseInt(txtSifraProizvoda.getText());
    int kolicinaStavke = Integer.parseInt(txtKolicinaStavke.getText());
    int sifraPDV = Integer.parseInt(txtSifraPDV.getText());
    float iznosStavke = Float.parseFloat(txtIznosStavke.getText());
    int sifraRacuna = Integer.parseInt(txtSifraRacuna.getText());
    
    
    float cijenaProizvoda = Float.parseFloat(txtCijenaProizvoda.getText());   
    
    
    DefaultTableModel model = (DefaultTableModel)TablicaStavke.getModel();
    model.addRow(new Object[]{sifraStavke, sifraProizvoda,kolicinaStavke, 
    iznosStavke, sifraPDV, sifraRacuna});
    
    txtSifraProizvoda.setText("");
    txtSifraStavke.setText("");
    txtKolicinaStavke.setText("");
    txtCijenaProizvoda.setText("");
    txtIznosStavke.setText("");
    
    btnIzracunStavke.setVisible(true);
    btnDodaj.setVisible(false);
    btnKreirajRacun.setVisible(true);
    sifraStavke+=1;
    txtSifraStavke.setText(Integer.toString(sifraStavke));
    txtKolicinaStavke.setEditable(true);
    Proizvod selProizvod = (Proizvod)cmbProizvod.getSelectedItem();
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnOdustaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdustaniActionPerformed
        dispose();
    }//GEN-LAST:event_btnOdustaniActionPerformed

    private void btnKreirajRacunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajRacunActionPerformed
    
        int sifraRacuna = Integer.parseInt(txtSifraRacuna.getText());
        String datum = new SimpleDateFormat("dd-MM-yyyy", Locale.FRANCE).format(new Date());
        int sifraKupca = Integer.parseInt(txtSifraKupca.getText());
        float iznosRacuna = Float.parseFloat(txtUkupanIznos.getText());
        
        Racun racun = new Racun();
        racun.setSifraRacuna(sifraRacuna);
        racun.setDatum(datum);
        racun.setSifraKupca(sifraKupca);
        racun.setCijenaRacuna(iznosRacuna);
        sqlRacun.spremi(racun);
        
        int b = TablicaStavke.getRowCount();
        int c = TablicaStavke.getColumnCount();
        
            ArrayList<Stavka>listaStavki = sqlStavka.listaStavk();
            ArrayList<Proizvod>listaProizvoda = sqlProizvod.listaProizvoda();

            for(int j = 0; j < b; j++){
                int sifraStavke = 0;
                int sifraProizvoda = 0;
                int kolicinaStavke = 0;
                float cijenaStavke = 0;
                int sifraPDV = 0;
                int sifraRac = 0;
                int z = 0;
                int a = 4;
                int d = 5;
                for(z = 0; z < c; z++){//ako stavim c na 1 onda mi sprema samo jednom
                    
                    sifraStavke = (int) (TablicaStavke.getValueAt(j, 0));
                    sifraProizvoda = (int) (TablicaStavke.getValueAt(j, 1));
                    kolicinaStavke = (int) (TablicaStavke.getValueAt(j, 2));
                    cijenaStavke = (float) (TablicaStavke.getValueAt(j, 3));
                    sifraPDV = (int) (TablicaStavke.getValueAt(j, 4));
                    sifraRac = (int) (TablicaStavke.getValueAt(j, 5));
                 
                    
        for(Stavka stavka: listaStavki){
            if(d<c){
                    stavka.setSifraStavke(sifraStavke);
                    stavka.setSifraProizvoda(sifraProizvoda);
                    stavka.setKolicinaStavke(kolicinaStavke);
                    stavka.setCijenaStavke(cijenaStavke);
                    stavka.setSifraPDV(sifraPDV);
                    stavka.setSifraRacuna(sifraRac);
                    sqlStavka.spremi(stavka);
            d++;
            break;
            }
                }
                }    
                    for(Proizvod proizvod: listaProizvoda){
                        int kolicinaProizvoda = proizvod.getKolicinaProizvoda();
                        
                        if(sifraProizvoda == sifraProizvoda){
                            int kolicinaUK = controll.izracunKolicineOduzimanje(kolicinaStavke, kolicinaProizvoda);
                            proizvod.setSifraProizvoda(sifraProizvoda);
                            proizvod.setKolicinaProizvoda(kolicinaUK);
                            sqlProizvod.Izmjena(proizvod);
                            break;
                        }
                        
                    }
        }
        dispose();
        ispisR.setVisible(true);
    }//GEN-LAST:event_btnKreirajRacunActionPerformed

    private void btnOsvjeziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOsvjeziActionPerformed
        // TODO add your handling code here:
        txtSifraRacuna.setText("");
        txtSifraStavke.setText("");
        txtDatum.setText("");
        txtUkupanIznos.setText("0");
        cmbProizvod.setModel(new DefaultComboBoxModel());
        cmbKupac.setModel(new DefaultComboBoxModel());
        DefaultTableModel model = (DefaultTableModel)TablicaStavke.getModel();
        model.setRowCount(0);
        cmbKupac.setEnabled(true);
        popuniKupca();
        popuniProizvod();
        autoinkrementacijaRacuna();
        autoinkrementacijaStavke();
        datum();
        
        txtKolicinaStavke.setEditable(true);
        txtKolicinaStavke.setText("");
        txtIznosStavke.setText("");
        btnIzracunStavke.setVisible(true);
    }//GEN-LAST:event_btnOsvjeziActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KreiranjeRacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KreiranjeRacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KreiranjeRacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KreiranjeRacuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KreiranjeRacuna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablicaStavke;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnIzracunStavke;
    private javax.swing.JButton btnKreirajRacun;
    private javax.swing.JButton btnOdustani;
    private javax.swing.JButton btnOsvjezi;
    private javax.swing.JComboBox<Kupac> cmbKupac;
    private javax.swing.JComboBox<Proizvod> cmbProizvod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCijenaProizvoda;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtIznosStavke;
    private javax.swing.JTextField txtKolicinaProizvoda;
    private javax.swing.JTextField txtKolicinaStavke;
    private javax.swing.JTextField txtPDV;
    private javax.swing.JTextField txtSifraKupca;
    private javax.swing.JTextField txtSifraPDV;
    private javax.swing.JTextField txtSifraProizvoda;
    private javax.swing.JTextField txtSifraRacuna;
    private javax.swing.JTextField txtSifraStavke;
    private javax.swing.JTextField txtUkupanIznos;
    // End of variables declaration//GEN-END:variables
private void popuniKupca(){
    ArrayList<Kupac>listaKupca = sqlKupac.listaKupaca();
    for(Kupac kupac: listaKupca){
        cmbKupac.addItem(kupac);
    }
}
    private void popuniProizvod(){
    ArrayList<Proizvod>listaProizvodi = sqlProizvod.listaProizvoda();
    for(Proizvod proizvod: listaProizvodi){
        cmbProizvod.addItem(proizvod);
    }
}
    private void autoinkrementacijaRacuna(){
        int sifra = 0;
        ArrayList<Racun>listaRacuna = sqlRacun.listaRacuna();
        for(Racun racun: listaRacuna){
            
            sifra = racun.getSifraRacuna();
        }
        if(sifra == 0){
        sifra = 1;
        txtSifraRacuna.setText(Integer.toString(sifra));
        }
        else{
            txtSifraRacuna.setText(Integer.toString(sifra+1));
        }
    }
    private void autoinkrementacijaStavke(){
        int sifra = 0;
        ArrayList<Stavka>listaStavki = sqlStavka.listaStavk();
        for(Stavka stavka: listaStavki){
            
            sifra = stavka.getSifraStavke();
        }
        if(sifra == 0){
        sifra = 1;
        txtSifraStavke.setText(Integer.toString(sifra));
        }
        else{
            txtSifraStavke.setText(Integer.toString(sifra+1));
        }
    }
    
    public static LocalDate getLocalDate() {
        LocalDate datum = LocalDate.now();
        
    return datum;
}
    public void dodajPDV(){
        ArrayList<PDV>listaPDVa = sqlPDV.listaPDV();
    for(PDV pdv: listaPDVa){
        int sifraPDV = pdv.getSifraPDV();
        int postotakPDV = pdv.getPDV();
        txtPDV.setText(Integer.toString(postotakPDV));
        txtSifraPDV.setText(Integer.toString(sifraPDV));
    }
    }
    
    public void datum(){
String txtDat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).format(new Date());
txtDatum.setText(txtDat);    
            }
}