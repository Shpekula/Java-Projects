/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isproizvodnjelijekova;

import java.util.ArrayList;

/**
 *
 * @author Shpekula
 */
public class PoluproizvodiZaPakiranje extends javax.swing.JFrame {
SQLPoluproizvod sqlpoluproizvod = new SQLPoluproizvod();
SQLGotovProizvod sqlproizvod = new SQLGotovProizvod();
SQLAmbalaza sqlambalaza = new SQLAmbalaza();
    /**
     * Creates new form PoluproizvodiNaAmbalazi
     */
    public PoluproizvodiZaPakiranje() {
        initComponents();
        popuniPoluproizvod();
        btnSpremi.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSifraA = new javax.swing.JTextField();
        txtSifraProizvoda = new javax.swing.JTextField();
        txtSifraPP = new javax.swing.JTextField();
        txtPotrebnaKZP = new javax.swing.JTextField();
        cmbPP = new javax.swing.JComboBox<>();
        btnOcisti = new javax.swing.JButton();
        btnSpremi = new javax.swing.JButton();
        btnPovratakaNaIzbornik = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNazivProizvoda = new javax.swing.JTextField();
        btnKreirajProizvod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Šifra ambalaže:");

        jLabel2.setText("Šifra proizvoda:");

        jLabel4.setText("Šifra poluproizvoda:");

        jLabel5.setText("Potrebna količina za pakiranje:");

        cmbPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPPActionPerformed(evt);
            }
        });

        btnOcisti.setText("Očisti");
        btnOcisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcistiActionPerformed(evt);
            }
        });

        btnSpremi.setText("Spremi");
        btnSpremi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpremiActionPerformed(evt);
            }
        });

        btnPovratakaNaIzbornik.setText("Povratak na izbornik");
        btnPovratakaNaIzbornik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPovratakaNaIzbornikActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Poluproizvodi za pakiranje");

        jLabel3.setText("Naziv proizvoda:");

        btnKreirajProizvod.setText("Kreiraj proizvod");
        btnKreirajProizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajProizvodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNazivProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnOcisti, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnSpremi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnKreirajProizvod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtSifraProizvoda)
                                            .addComponent(txtSifraPP)
                                            .addComponent(txtPotrebnaKZP)
                                            .addComponent(txtSifraA))))
                                .addGap(18, 18, 18)
                                .addComponent(cmbPP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPovratakaNaIzbornik)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSifraProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNazivProizvoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnKreirajProizvod)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSifraA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSifraPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPotrebnaKZP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpremi)
                    .addComponent(btnOcisti))
                .addGap(18, 18, 18)
                .addComponent(btnPovratakaNaIzbornik)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPPActionPerformed
        // TODO add your handling code here:
        Poluproizvod selPoluproizvod = (Poluproizvod)cmbPP.getSelectedItem();
        
        txtSifraPP.setText(Integer.toString(selPoluproizvod.getSifraPP()));
        
    }//GEN-LAST:event_cmbPPActionPerformed

    private void btnSpremiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpremiActionPerformed
        // TODO add your handling code here:
        int sifraA = Integer.parseInt(txtSifraA.getText());
        int sifraProizvoda = Integer.parseInt(txtSifraProizvoda.getText());
        String nazivA = txtSifraProizvoda.getText();
        int sifraPP = Integer.parseInt(txtSifraPP.getText());
        int kolicinaPP = Integer.parseInt(txtPotrebnaKZP.getText());
        
        SQLAmbalaza sqlambalaza = new SQLAmbalaza();
        
        Ambalaza ambalaza = new Ambalaza();
        ambalaza.setSifraAmbalaze(sifraA);
        ambalaza.setSifraProizvoda(sifraProizvoda);
        ambalaza.setSifraPP(sifraPP);
        ambalaza.setKolicinaZP(kolicinaPP);
        sqlambalaza.spremi(ambalaza);
        
        txtSifraA.setText(Integer.toString(sifraA +1));
        txtSifraProizvoda.setText(Integer.toString(sifraProizvoda + 1));
        txtNazivProizvoda.setText("");
        txtSifraPP.setText("");
        txtPotrebnaKZP.setText("");
        
        btnSpremi.setVisible(false);
        btnOcisti.setVisible(true);
        btnKreirajProizvod.setVisible(true);
        
    }//GEN-LAST:event_btnSpremiActionPerformed

    private void btnPovratakaNaIzbornikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPovratakaNaIzbornikActionPerformed
        // TODO add your handling code here:
        GlavniIzbornik gi = new GlavniIzbornik();
        gi.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPovratakaNaIzbornikActionPerformed

    private void btnKreirajProizvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajProizvodActionPerformed
        // TODO add your handling code here:
        int sifraProizvoda = Integer.parseInt(txtSifraProizvoda.getText());
        String nazivProizvoda = txtNazivProizvoda.getText();
        
        GotovProizvod proizvod = new GotovProizvod();
        proizvod.setSifraProizvoda(sifraProizvoda);
        proizvod.setNazivProizvoda(nazivProizvoda);
        
        sqlproizvod.spremi(proizvod);
        
        btnSpremi.setVisible(true);
        btnOcisti.setVisible(false);
        btnKreirajProizvod.setVisible(false);
        
    }//GEN-LAST:event_btnKreirajProizvodActionPerformed

    private void btnOcistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcistiActionPerformed
        // TODO add your handling code here:
        int sifraA = Integer.parseInt(txtSifraA.getText());
        int sifraProizvoda = Integer.parseInt(txtSifraProizvoda.getText());
        
        txtSifraA.setText(Integer.toString(sifraA +1));
        txtSifraProizvoda.setText(Integer.toString(sifraProizvoda + 1));
        txtNazivProizvoda.setText("");
        txtSifraPP.setText("");
        txtPotrebnaKZP.setText("");
        
        autoIProizvod();
        
        btnSpremi.setVisible(true);
        
    }//GEN-LAST:event_btnOcistiActionPerformed

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
            java.util.logging.Logger.getLogger(PoluproizvodiZaPakiranje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PoluproizvodiZaPakiranje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PoluproizvodiZaPakiranje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PoluproizvodiZaPakiranje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PoluproizvodiZaPakiranje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKreirajProizvod;
    private javax.swing.JButton btnOcisti;
    private javax.swing.JButton btnPovratakaNaIzbornik;
    private javax.swing.JButton btnSpremi;
    private javax.swing.JComboBox<Poluproizvod> cmbPP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtNazivProizvoda;
    private javax.swing.JTextField txtPotrebnaKZP;
    private javax.swing.JTextField txtSifraA;
    private javax.swing.JTextField txtSifraPP;
    private javax.swing.JTextField txtSifraProizvoda;
    // End of variables declaration//GEN-END:variables
private void popuniPoluproizvod(){
    ArrayList<Poluproizvod>listaPoluproizvoda = sqlpoluproizvod.listaPoluproizvoda();
    for(Poluproizvod poluproizvod: listaPoluproizvoda){
        cmbPP.addItem(poluproizvod);
    }
}

private void autoIAmbalaza()
{
    ArrayList<Ambalaza> listaAmbalaze = sqlambalaza.listaAmbalaze();
    int sifra = 0;
    for(Ambalaza ambalaza: listaAmbalaze)
    {
        sifra = ambalaza.getSifraAmbalaze();
        
        if(sifra == 0)
        {
            sifra = 1;
            txtSifraA.setText(Integer.toString(sifra));
        }
        else
        {
            txtSifraA.setText(Integer.toString(sifra + 1));
        }
    }
}

private void autoIProizvod()
{
    ArrayList<GotovProizvod> listaProizvoda = sqlproizvod.listaGotovProizvoda();
    int sifra = 0;
    for(GotovProizvod gp: listaProizvoda)
    {
        sifra = gp.getSifraProizvoda();
        if(sifra == 0)
        {
            sifra = 1;
            txtSifraProizvoda.setText(Integer.toString(sifra));
        }
        else
        {
            txtSifraProizvoda.setText(Integer.toString(sifra + 1));
        }
    }
}

}
