/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class kkn extends javax.swing.JFrame {

    private void kosongkan_form(){
        txtnama.setEditable(true);
        txtnama.setText(null);
        txtnim.setText(null);
        cbjurusan.setSelectedItem(this);
        txttelepon.setText(null);
        txtdesa.setText(null);
        txtmulai.setText(null);
        txtselesai.setText(null);
    }
    
    
    private void tampilkan_data(){
        
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NO");
        model.addColumn("NAMA");
        model.addColumn("NIM");
        model.addColumn("JURUSAN");
        model.addColumn("NO TLPN");
        model.addColumn("DESA KKN");
        model.addColumn("TGL MULAI");
        model.addColumn("TGL SELESAI");
    
        try{
            int no = 1;
            String sql = "SELECT * FROM pendataan";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
            }
            tbkkn.setModel(model);
       
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
    /**
     * Creates new form kkn
     */
    public kkn() {
        initComponents();
        kosongkan_form();
        tampilkan_data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtnim = new javax.swing.JTextField();
        txttelepon = new javax.swing.JTextField();
        txtdesa = new javax.swing.JTextField();
        txtmulai = new javax.swing.JTextField();
        txtselesai = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        cbjurusan = new javax.swing.JComboBox<>();
        btntambah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbkkn = new javax.swing.JTable();
        btnkeluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pendataan KKN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PENDATAAN KKN UNIVERSITAS YUDHARTA 2022");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 579, 30));

        jLabel3.setText("NAMA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel4.setText("NIM");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel5.setText("JURUSAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel6.setText("NOMOR TELEPON");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel7.setText("DESA KKN");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        jLabel8.setText("TANGGAL MULAI");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jLabel9.setText("TANGGAL SELESAI");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 169, -1));

        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });
        getContentPane().add(txtnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 169, -1));

        txttelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtteleponActionPerformed(evt);
            }
        });
        getContentPane().add(txttelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 70, 136, -1));
        getContentPane().add(txtdesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 120, 136, -1));
        getContentPane().add(txtmulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 170, 136, -1));
        getContentPane().add(txtselesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 220, 136, -1));

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 280, -1, -1));

        cbjurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Teknik Industri", "Teknik Sipil", "Teknik Mesin", "Agribisnis", "Ilmu Teknologi Pangan ", "Ilmu Teknologi Hasil Perikanan", "Pendidikan Bahasa Arab", "Pendidikan Agama Islam ", "Ilmu Al-Qur'an dan Tafsir", "Administrasi Publik ", "Administrasi bisnis ", "Psikologi ", " " }));
        getContentPane().add(cbjurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 170, -1));

        btntambah.setText("TAMBAH");
        btntambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntambahActionPerformed(evt);
            }
        });
        getContentPane().add(btntambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, -1));

        tbkkn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NO", "NAMA", "NIM", "JURUSAN", "NO TLPON", "DESA KKN", "TGL MULAI", "TGL SELESAI"
            }
        ));
        tbkkn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbkknMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbkkn);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 670, 108));

        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        jLabel2.setText("Oleh : Kelompok KKN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnimActionPerformed

    private void txtteleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtteleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtteleponActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
       try{
            String sql = "INSERT INTO pendataan VALUES ('"+txtnama.getText()+"','"+txtnim.getText()+"','"+cbjurusan.getSelectedItem()+"','"+txttelepon.getText()+"','"+txtdesa.getText()+"','"+txtmulai.getText()+"','"+txtselesai.getText()+"')";
            java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses simpan data berhasil");
            tampilkan_data();
            kosongkan_form();
         
        }catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btntambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntambahActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_btntambahActionPerformed

    private void tbkknMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbkknMouseClicked
        // TODO add your handling code here:
        int baris = tbkkn.rowAtPoint(evt.getPoint());
        
        String nama = tbkkn.getValueAt(baris,1).toString();
        txtnama.setText(nama);
        
        String nim = tbkkn.getValueAt(baris,2).toString();
        txtnim.setText(nim);
        
        String jurusan = tbkkn.getValueAt(baris,3).toString();
        cbjurusan.setSelectedItem(jurusan);
        
        String telepon = tbkkn.getValueAt(baris,4).toString();
        txttelepon.setText(telepon);
        
        String desa = tbkkn.getValueAt(baris,5).toString();
        txtdesa.setText(desa);
        
        String mulai = tbkkn.getValueAt(baris,6).toString();
        txtmulai.setText(mulai);
        
        String selesai = tbkkn.getValueAt(baris,7).toString();
        txtselesai.setText(selesai);
    }//GEN-LAST:event_tbkknMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "DELETE FROM pendataan WHERE nama ='"+txtnama.getText()+"'";
        java.sql.Connection conn = (Connection)konfig.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil....");
        }catch(HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
        kosongkan_form();
        tampilkan_data();
    }//GEN-LAST:event_btnhapusActionPerformed

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
            java.util.logging.Logger.getLogger(kkn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kkn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kkn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kkn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kkn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btntambah;
    private javax.swing.JComboBox<String> cbjurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbkkn;
    private javax.swing.JTextField txtdesa;
    private javax.swing.JTextField txtmulai;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txtselesai;
    private javax.swing.JTextField txttelepon;
    // End of variables declaration//GEN-END:variables
}
