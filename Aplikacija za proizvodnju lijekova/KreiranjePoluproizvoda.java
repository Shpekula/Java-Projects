/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isproizvodnjelijekova;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shpekula
 */
public class KreiranjePoluproizvoda extends javax.swing.JFrame {

    SQLSirovine sqlsirovine = new SQLSirovine();
    SQLPoluproizvod sqlpoluproizvod = new SQLPoluproizvod();
    SQLSUP sqlsup  = new SQLSUP();
    /**
     * Creates new form SirovinauPoluproizvodu
     */
    public KreiranjePoluproizvoda() {
        initComponents();
        popuniPoluproizvod();
        popuniSirovine();
        
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
        txtSifraPP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSifraSirovine = new javax.swing.JTextField();
        cmbPP = new javax.swing.JComboBox<>();
        cmbSirovine = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablicaPoluproizvod = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtPKS = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnSpremi = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNazivPP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnKreirajPP = new javax.swing.JButton();
        btnOcisti = new javax.swing.JButton();
        btnPovratak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Kreiranje poluproizvoda");

        txtSifraPP.setEditable(false);

        jLabel2.setText("Šifra poluproizvoda:");

        jLabel3.setText("Šifra sirovine:");

        txtSifraSirovine.setEditable(false);

        cmbPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPPActionPerformed(evt);
            }
        });

        cmbSirovine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSirovineActionPerformed(evt);
            }
        });

        tablicaPoluproizvod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Šifra poluproizvoda", "Potrebna količina", "Šifra sirovine"
            }
        ));
        jScrollPane1.setViewportView(tablicaPoluproizvod);

        jLabel4.setText("Potrebna količina sirovine:");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnSpremi.setText("Spremi");
        btnSpremi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpremiActionPerformed(evt);
            }
        });

        jLabel5.setText("Naziv poluproizvoda:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setText("KREIRAJ POLUPROIZVOD:");

        jLabel8.setText("UNESITE ŠTO JE POTREBNO ZA IZRADU:");

        btnKreirajPP.setText("Kreiraj poluproizvod");
        btnKreirajPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKreirajPPActionPerformed(evt);
            }
        });

        btnOcisti.setText("Očisti");
        btnOcisti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcistiActionPerformed(evt);
            }
        });

        btnPovratak.setText("Povratak na izbornik");
        btnPovratak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPovratakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(28, 28, 28)
                                .addComponent(cmbPP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 357, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnOcisti)
                                    .addGap(51, 51, 51))
                                .addComponent(btnKreirajPP, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNazivPP)
                                    .addComponent(txtSifraPP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPKS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtSifraSirovine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbSirovine, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(137, 137, 137)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(139, 165, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSpremi)
                                .addGap(143, 143, 143)
                                .addComponent(btnPovratak))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSifraPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNazivPP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOcisti))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSifraSirovine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSirovine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPKS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnDodaj)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKreirajPP)
                        .addGap(0, 198, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpremi)
                    .addComponent(btnPovratak))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPPActionPerformed
        // TODO add your handling code here:
        Poluproizvod selPoluproizvod = (Poluproizvod)cmbPP.getSelectedItem();
        /*
        int sifraPP = selPoluproizvod.getSifraPP();
        String nazivPP = selPoluproizvod.getNazivPP();
        int kbPP = selPoluproizvod.getKbPP();
        int kolicinaPP = selPoluproizvod.getKolicinaPP();
        String datumProizvodnje = selPoluproizvod.getDatumProizvodnjePP();
        String rokValjanosti = selPoluproizvod.getRokValjanostiPP();
        */
        //txtSifraPP = selPoluproizvod.getNazivPP();
        txtSifraPP.setText(Integer.toString(selPoluproizvod.getSifraPP()));
        txtNazivPP.setText(selPoluproizvod.getNazivPP());
        //tablicaPoluproizvod
        btnKreirajPP.setVisible(false);
        
    }//GEN-LAST:event_cmbPPActionPerformed

    private void cmbSirovineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSirovineActionPerformed
        // TODO add your handling code here:
        cmbSirovine.getSelectedItem().toString();
        Sirovine selSirovine = (Sirovine)cmbSirovine.getSelectedItem();
        /* 
        int sifraSirovine = selSirovine.getSifraSirovine();
        String nazivSirovine = selSirovine.getNazivSirovine();
        int kbSirovine = selSirovine.getKbSirovine();
        int kolicinaSirovine = selSirovine.getKolicinaSirovine();
        */
        //int kolicinaSirovineUPP = Integer.parseInt();
        //tablicaPoluproizvod
        
        txtSifraSirovine.setText(Integer.toString(selSirovine.getSifraSirovine()));
        
      /*  
        DefaultTableModel model = (DefaultTableModel)tablicaPoluproizvod.getModel();
    model.addRow(new Object[]{sifraSirovine, nazivSirovine, kolicinaSirovineUPP, 
    iznosStavke, sifraPDV, sifraRacuna});
        
        */
      
    }//GEN-LAST:event_cmbSirovineActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        // TODO add your handling code here:
        int sifraPP = Integer.parseInt(txtSifraPP.getText());
        int sifraSirovine = Integer.parseInt(txtSifraSirovine.getText());
        int pks = Integer.parseInt(txtPKS.getText());
        if(sifraPP == 0 && sifraSirovine == 0 && pks == 0)
        {
            //poruka.setText("NISTE UNJELI TOČNE PODATKE!");
        }
        
        else if(sifraPP != 0 && sifraSirovine != 0 && pks != 0)
        {
            btnKreirajPP.setEnabled(false);
            cmbPP.setVisible(false);
            //ArrayList<Sirovine>listaSirovina = sqlsirovine.listaSirovina();
            //for(Sirovine sirovine: listaSirovina){
                //if(nazivPP == )
              //  sirovine.getSifraSirovine();
            //}
            
            DefaultTableModel model = (DefaultTableModel)tablicaPoluproizvod.getModel();
    model.addRow(new Object[]{sifraPP, pks, sifraSirovine});
        }
        
        txtPKS.setText("");
        
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnSpremiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpremiActionPerformed
        // TODO add your handling code here:
        int b = tablicaPoluproizvod.getRowCount();
        int c = tablicaPoluproizvod.getColumnCount();
        
        for(int i = 0; i < b; i++)
        {
            int sifraPP = 0;
            int sifraSirovine = 0;
            int pks = 0;
                
            for(int j = 0; j < c; j++)
            {
                sifraPP = (int) (tablicaPoluproizvod.getValueAt(i, 0));
                pks = (int) (tablicaPoluproizvod.getValueAt(i, 1));
                sifraSirovine = (int) (tablicaPoluproizvod.getValueAt(i, 2));
            
                /*
            ArrayList<SUP>listaSUP = sqlsup.listaSUP();    
                for(SUP sup: listaSUP)
                {
                */
            }
                SUP sup = new SUP();
                sup.setSifraPP(sifraPP);
                sup.setKolicinaSUP(pks);
                sup.setSifraSirovine(sifraSirovine);
                sqlsup.spremi(sup);
                    
                    
                //} 
        }
        btnOcisti.setVisible(true);
        btnKreirajPP.setVisible(true);
    }//GEN-LAST:event_btnSpremiActionPerformed

    private void btnKreirajPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKreirajPPActionPerformed
        // TODO add your handling code here:
        int sifraPP = Integer.parseInt(txtSifraPP.getText());
        String nazivPP = txtNazivPP.getText();
        
        Poluproizvod poluproizvod = new Poluproizvod();
        poluproizvod.setSifraPP(sifraPP);
        poluproizvod.setNazivPP(nazivPP);
        
        sqlpoluproizvod.spremi(poluproizvod);
        
        btnOcisti.setVisible(false);
        btnKreirajPP.setVisible(false);
        
    }//GEN-LAST:event_btnKreirajPPActionPerformed

    private void btnOcistiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcistiActionPerformed
        // TODO add your handling code here:
        autoIPoluP();
        txtNazivPP.setText("");
        cmbPP.setEnabled(true);
        btnKreirajPP.setVisible(true);
    }//GEN-LAST:event_btnOcistiActionPerformed

    private void btnPovratakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPovratakActionPerformed
        // TODO add your handling code here:
        GlavniIzbornik gi = new GlavniIzbornik();
        gi.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPovratakActionPerformed

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
            java.util.logging.Logger.getLogger(KreiranjePoluproizvoda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KreiranjePoluproizvoda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KreiranjePoluproizvoda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KreiranjePoluproizvoda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KreiranjePoluproizvoda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnKreirajPP;
    private javax.swing.JButton btnOcisti;
    private javax.swing.JButton btnPovratak;
    private javax.swing.JButton btnSpremi;
    private javax.swing.JComboBox<Poluproizvod> cmbPP;
    private javax.swing.JComboBox<Sirovine> cmbSirovine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablicaPoluproizvod;
    private javax.swing.JTextField txtNazivPP;
    private javax.swing.JTextField txtPKS;
    private javax.swing.JTextField txtSifraPP;
    private javax.swing.JTextField txtSifraSirovine;
    // End of variables declaration//GEN-END:variables
private void popuniSirovine(){
    ArrayList<Sirovine>listaSirovina = sqlsirovine.listaSirovina();
    for(Sirovine sirovine: listaSirovina){
       //cmbSirovine.addItem(sirovine);
       cmbSirovine.addItem(sirovine);
    }
}

private void popuniPoluproizvod(){
    ArrayList<Poluproizvod>listaPoluproizvoda = sqlpoluproizvod.listaPoluproizvoda();
    for(Poluproizvod poluproizvod: listaPoluproizvoda){
        cmbPP.addItem(poluproizvod);
    }
}

private void autoIPoluP()
{
    ArrayList<Poluproizvod> listaPP = sqlpoluproizvod.listaPoluproizvoda();
    int sifra = 0;
    for(Poluproizvod poluproizvod: listaPP)
    {
        sifra = poluproizvod.getSifraPP();
    }
    if (sifra == 0)
    {
        sifra = 1;
        txtSifraPP.setText(Integer.toString(sifra));
    }
    else
    {
        txtSifraPP.setText(Integer.toString(sifra + 1));
    }
}
}