/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isproizvodnjelijekova;

import java.awt.Dialog;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Shpekula
 */
public class GlavniIzbornik extends javax.swing.JFrame {
SQLKorisnik sqlkorisnik = new SQLKorisnik();
    /**
     * Creates new form GlavniIzbornik
     */
    public GlavniIzbornik() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKorisnickoIme = new javax.swing.JTextField();
        txtLozinka = new javax.swing.JTextField();
        btnPrijava = new javax.swing.JButton();
        btnSirovine = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPoluproizvod = new javax.swing.JButton();
        btnGotovProizvod = new javax.swing.JButton();
        btnOdjava = new javax.swing.JButton();

        jLabel2.setText("Autentifikacija");

        jLabel3.setText("Korisnicko ime:");

        jLabel4.setText("Lozinka:");

        btnPrijava.setText("Prijavi me");
        btnPrijava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrijavaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogLayout = new javax.swing.GroupLayout(Dialog.getContentPane());
        Dialog.getContentPane().setLayout(DialogLayout);
        DialogLayout.setHorizontalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogLayout.createSequentialGroup()
                .addGroup(DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(DialogLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKorisnickoIme)
                            .addComponent(txtLozinka, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addGroup(DialogLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnPrijava)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        DialogLayout.setVerticalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKorisnickoIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPrijava)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSirovine.setText("Sirovine");
        btnSirovine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSirovineActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Glavni izbornik");

        btnPoluproizvod.setText("Poluproizvod");
        btnPoluproizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoluproizvodActionPerformed(evt);
            }
        });

        btnGotovProizvod.setText("Gotov proizvod");
        btnGotovProizvod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGotovProizvodActionPerformed(evt);
            }
        });

        btnOdjava.setText("Odjava");
        btnOdjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOdjavaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSirovine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPoluproizvod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGotovProizvod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(btnOdjava)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(btnSirovine)
                .addGap(18, 18, 18)
                .addComponent(btnPoluproizvod)
                .addGap(18, 18, 18)
                .addComponent(btnGotovProizvod)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOdjava))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSirovineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSirovineActionPerformed
        // TODO add your handling code here:
        EvidencijaSirovine es = new EvidencijaSirovine();
        es.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSirovineActionPerformed

    private void btnPoluproizvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoluproizvodActionPerformed
        // TODO add your handling code here:
        IzbornikPoluproizvod izbornikPP = new IzbornikPoluproizvod();
        izbornikPP.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPoluproizvodActionPerformed

    private void btnGotovProizvodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGotovProizvodActionPerformed
        // TODO add your handling code here:
        IzbornikGotovProizvod igp = new IzbornikGotovProizvod();
        igp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnGotovProizvodActionPerformed

    private void btnPrijavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrijavaActionPerformed
        // TODO add your handling code here:
        
        String naziv = txtKorisnickoIme.getText();
        String lozinka = txtLozinka.getText();
        ArrayList<Korisnik> listaKorisnika = sqlkorisnik.listaKorisnika();
        for(Korisnik korisnik: listaKorisnika)
        {
            int sifraKorisnika = korisnik.getSifraKorisnika();
            String nazivKorisnika = korisnik.getNazivKorisnika();
            String lozinkaKorisnika = korisnik.getLozinkaKorisnika();
            String statusKorisnika = korisnik.getStatusKorisnika();
            
            if(naziv.equals(nazivKorisnika) && lozinka.equals(lozinkaKorisnika))
            {
                    GlavniIzbornikVoditelja giv = new GlavniIzbornikVoditelja();
                    giv.setVisible(true);
                    dispose();
            }
            else
            {
                txtKorisnickoIme.setText("");
                txtLozinka.setText("");
            }
        }
        
    }//GEN-LAST:event_btnPrijavaActionPerformed

    private void btnOdjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOdjavaActionPerformed
        // TODO add your handling code here:
        Autentifikacija a = new Autentifikacija();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnOdjavaActionPerformed

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
            java.util.logging.Logger.getLogger(GlavniIzbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavniIzbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavniIzbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavniIzbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavniIzbornik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialog;
    private javax.swing.JButton btnGotovProizvod;
    private javax.swing.JButton btnOdjava;
    private javax.swing.JButton btnPoluproizvod;
    private javax.swing.JButton btnPrijava;
    private javax.swing.JButton btnSirovine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtKorisnickoIme;
    private javax.swing.JTextField txtLozinka;
    // End of variables declaration//GEN-END:variables
}
