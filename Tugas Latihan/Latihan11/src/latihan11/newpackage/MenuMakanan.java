/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package latihan11.newpackage;

/**
 *
 * @author isalr
 */
public class MenuMakanan extends javax.swing.JFrame {

    /**
     * Creates new form MenuMakanan
     */
    public MenuMakanan() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rawon = new javax.swing.JRadioButton();
        txt_rawon = new javax.swing.JTextField();
        kopi = new javax.swing.JRadioButton();
        txt_kopi = new javax.swing.JTextField();
        teh = new javax.swing.JRadioButton();
        txt_soto = new javax.swing.JTextField();
        txt_teh = new javax.swing.JTextField();
        soto = new javax.swing.JRadioButton();
        txt_sate = new javax.swing.JTextField();
        jeruk = new javax.swing.JRadioButton();
        txt_jeruk = new javax.swing.JTextField();
        sate = new javax.swing.JRadioButton();
        campur = new javax.swing.JRadioButton();
        gule = new javax.swing.JRadioButton();
        txt_gule = new javax.swing.JTextField();
        txt_campur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        total_bayar = new javax.swing.JLabel();
        Hitung = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MENU MAKANAN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("MENU MINUMAN");

        rawon.setText("RAWON : 5000");
        rawon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rawonActionPerformed(evt);
            }
        });

        txt_rawon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rawonActionPerformed(evt);
            }
        });

        kopi.setText("KOPI : 2000 ");
        kopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kopiActionPerformed(evt);
            }
        });

        txt_kopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kopiActionPerformed(evt);
            }
        });

        teh.setText("TEH/ES TEH : 2000");
        teh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tehActionPerformed(evt);
            }
        });

        txt_soto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sotoActionPerformed(evt);
            }
        });

        txt_teh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tehActionPerformed(evt);
            }
        });

        soto.setText("SOTO : 5000");
        soto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sotoActionPerformed(evt);
            }
        });

        txt_sate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sateActionPerformed(evt);
            }
        });

        jeruk.setText("JERUK/ES JERUK : 2500");
        jeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jerukActionPerformed(evt);
            }
        });

        txt_jeruk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jerukActionPerformed(evt);
            }
        });

        sate.setText("SATE : 10000");
        sate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sateActionPerformed(evt);
            }
        });

        campur.setText("ES CAMPUR : 5000");
        campur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campurActionPerformed(evt);
            }
        });

        gule.setText("GULE : 8000");
        gule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guleActionPerformed(evt);
            }
        });

        txt_gule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_guleActionPerformed(evt);
            }
        });

        txt_campur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_campurActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("TOTAL BAYAR :");

        total_bayar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        total_bayar.setText("0");

        Hitung.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Hitung.setText("HITUNG");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rawon)
                    .addComponent(sate)
                    .addComponent(soto))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_soto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(teh)
                        .addGap(36, 36, 36)
                        .addComponent(txt_teh, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_gule, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_campur, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_rawon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(kopi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_kopi, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txt_sate, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jeruk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(txt_jeruk, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total_bayar))
                    .addComponent(gule))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rawon)
                    .addComponent(txt_rawon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kopi)
                    .addComponent(txt_kopi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_teh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teh)
                    .addComponent(soto)
                    .addComponent(txt_soto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sate)
                    .addComponent(txt_sate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jeruk)
                    .addComponent(txt_jeruk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gule)
                    .addComponent(txt_gule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campur)
                    .addComponent(txt_campur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(total_bayar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_rawonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rawonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rawonActionPerformed

    private void txt_kopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kopiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kopiActionPerformed

    private void txt_sotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sotoActionPerformed

    private void txt_tehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tehActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tehActionPerformed

    private void txt_sateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sateActionPerformed

    private void txt_jerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jerukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jerukActionPerformed

    private void txt_guleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_guleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_guleActionPerformed

    private void txt_campurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_campurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_campurActionPerformed

    private void sotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sotoActionPerformed
        // TODO add your handling code here:
        if (soto.isSelected() == true) {
        txt_soto.setEditable(true); 
        } else {
            txt_soto.setEditable(false);
            txt_soto.setText("");
       }        
    }//GEN-LAST:event_sotoActionPerformed

    private void rawonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rawonActionPerformed
        // TODO add your handling code here:
        if (rawon.isSelected() == true) {
        txt_rawon.setEditable(true); 
        } else {
            txt_rawon.setEditable(false);
            txt_rawon.setText("");
       }
    }//GEN-LAST:event_rawonActionPerformed

    private void sateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sateActionPerformed
        // TODO add your handling code here:
        if (sate.isSelected() == true) {
        txt_sate.setEditable(true); 
        } else {
            txt_sate.setEditable(false);
            txt_sate.setText("");
       }
    }//GEN-LAST:event_sateActionPerformed

    private void guleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guleActionPerformed
        // TODO add your handling code here:
        if (gule.isSelected() == true) {
        txt_gule.setEditable(true); 
        } else {
            txt_gule.setEditable(false);
            txt_gule.setText("");        
    }//GEN-LAST:event_guleActionPerformed
    }
    private void kopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kopiActionPerformed
        // TODO add your handling code here:
        if (kopi.isSelected() == true) {
        txt_kopi.setEditable(true); 
        } else {
            txt_kopi.setEditable(false);
            txt_kopi.setText("");
    }//GEN-LAST:event_kopiActionPerformed
    }
    private void tehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tehActionPerformed
        // TODO add your handling code here:
        if (teh.isSelected() == true) {
        txt_teh.setEditable(true); 
        } else {
            txt_teh.setEditable(false);
            txt_teh.setText("");
    }//GEN-LAST:event_tehActionPerformed
    }
    
    private void jerukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jerukActionPerformed
        // TODO add your handling code here:
        if (jeruk.isSelected() == true) {
        txt_jeruk.setEditable(true); 
        } else {
            txt_jeruk.setEditable(false);
            txt_jeruk.setText("");
    }     
    }//GEN-LAST:event_jerukActionPerformed

    private void campurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campurActionPerformed
        // TODO add your handling code here:
        if (campur.isSelected() == true) {
        txt_campur.setEditable(true); 
        } else {
            txt_campur.setEditable(false);
            txt_campur.setText("");
    }  
    }//GEN-LAST:event_campurActionPerformed

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        // TODO add your handling code here:
     int total = 0;
     if(rawon.isSelected()){
       String rawon = txt_rawon.getText();
       int jumlahrawon = Integer.parseInt(rawon);
       int hargarawon  = jumlahrawon * 5000;
       total = total + hargarawon;
     }
     if(soto.isSelected()){
       String soto = txt_soto.getText();
       int jumlahsoto = Integer.parseInt(soto);
       int hargasoto  = jumlahsoto * 5000;
       total = total + hargasoto;
     }
     if(sate.isSelected()){
       String sate = txt_sate.getText();
       int jumlahsate = Integer.parseInt(sate);
       int hargasate  = jumlahsate * 10000;
       total = total + hargasate;
     }
     if(gule.isSelected()){
       String gule = txt_gule.getText();
       int jumlahgule = Integer.parseInt(gule);
       int hargagule  = jumlahgule * 8000;
       total = total + hargagule;
     }
     if(kopi.isSelected()){
       String kopi = txt_kopi.getText();
       int jumlahkopi = Integer.parseInt(kopi);
       int hargakopi  = jumlahkopi * 2000;
       total = total + hargakopi;
     }
     if(teh.isSelected()){
       String teh = txt_teh.getText();
       int jumlahteh = Integer.parseInt(teh);
       int hargateh  = jumlahteh * 2000;
       total = total + hargateh;
     }
     if(jeruk.isSelected()){
       String jeruk = txt_jeruk.getText();
       int jumlahjeruk = Integer.parseInt(jeruk);
       int hargajeruk  = jumlahjeruk * 2500;
       total = total + hargajeruk;
     }
     if(campur.isSelected()){
       String campur = txt_campur.getText();
       int jumlahcampur = Integer.parseInt(campur);
       int hargacampur  = jumlahcampur * 5000;
       total = total + hargacampur;
     }
     total_bayar.setText("" + total);
    }//GEN-LAST:event_HitungActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hitung;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton campur;
    private javax.swing.JRadioButton gule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jeruk;
    private javax.swing.JRadioButton kopi;
    private javax.swing.JRadioButton rawon;
    private javax.swing.JRadioButton sate;
    private javax.swing.JRadioButton soto;
    private javax.swing.JRadioButton teh;
    private javax.swing.JLabel total_bayar;
    private javax.swing.JTextField txt_campur;
    private javax.swing.JTextField txt_gule;
    private javax.swing.JTextField txt_jeruk;
    private javax.swing.JTextField txt_kopi;
    private javax.swing.JTextField txt_rawon;
    private javax.swing.JTextField txt_sate;
    private javax.swing.JTextField txt_soto;
    private javax.swing.JTextField txt_teh;
    // End of variables declaration//GEN-END:variables
}
