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
public class GlavniIzbornikVoditelja extends javax.swing.JFrame {

    /**
     * Creates new form GlavniIzbornikVoditelja
     */
    public GlavniIzbornikVoditelja() {
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

        btnKreirajZaposlenika = new javax.swing.JButton();
        btnIzvjestajS = new javax.swing.JButton();
        btnIzvjestajP = new javax.swing.JButton();
        btnIzvjestajI = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnOdjava = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKreirajZaposlenika.setText("Kreiranje zaposlenika");
        btnKreirajZaposlenika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajZaposlenikaActionPerformed(evt);
            }
        });

        btnIzvjestajS.setText("Izvještaj o sirovini");
        btnIzvjestajS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzvjestajSActionPerformed(evt);
            }
        });

        btnIzvjestajP.setText("Izvještaj o pakiranju");
        btnIzvjestajP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzvjestajPActionPerformed(evt);
            }
        });

        btnIzvjestajI.setText("Izvještaj o izradi");
        btnIzvjestajI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzvjestajIActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Glavni izbornik voditelja");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnKreirajZaposlenika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIzvjestajS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIzvjestajI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIzvjestajP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 90, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOdjava)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnIzvjestajS)
                .addGap(18, 18, 18)
                .addComponent(btnIzvjestajI)
                .addGap(20, 20, 20)
                .addComponent(btnIzvjestajP)
                .addGap(18, 18, 18)
                .addComponent(btnKreirajZaposlenika)
                .addGap(18, 18, 18)
                .addComponent(btnOdjava)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKreirajZaposlenikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajZaposlenikaActionPerformed
        // TODO add your handling code here:
        KreirajZaposlenika kz = new KreirajZaposlenika();
        kz.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnKreirajZaposlenikaActionPerformed

    private void btnIzvjestajPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzvjestajPActionPerformed
        // TODO add your handling code here:
        IzvjestajOPakiranju iop = new IzvjestajOPakiranju();
        iop.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIzvjestajPActionPerformed

    private void btnIzvjestajSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzvjestajSActionPerformed
        // TODO add your handling code here:
        IzvjestajOSirovini ios = new IzvjestajOSirovini();
        ios.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIzvjestajSActionPerformed

    private void btnIzvjestajIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzvjestajIActionPerformed
        // TODO add your handling code here:
        IzvjestajOIzradi ioi = new IzvjestajOIzradi();
        ioi.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIzvjestajIActionPerformed

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
            java.util.logging.Logger.getLogger(GlavniIzbornikVoditelja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavniIzbornikVoditelja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavniIzbornikVoditelja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavniIzbornikVoditelja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavniIzbornikVoditelja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzvjestajI;
    private javax.swing.JButton btnIzvjestajP;
    private javax.swing.JButton btnIzvjestajS;
    private javax.swing.JButton btnKreirajZaposlenika;
    private javax.swing.JButton btnOdjava;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
