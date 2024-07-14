package ui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.KoneksiDatabase;


public class Tabel_Data_MHS extends javax.swing.JFrame {
    Connection cn;
    Statement st;
    ResultSet rs;
    public Tabel_Data_MHS() {
        initComponents();
        cn = KoneksiDatabase.BukaKoneksi();
        TampilData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CmbCariData = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        TxtCariData = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Data_MHS = new javax.swing.JTable();
        jScrollBar1 = new javax.swing.JScrollBar();
        Hapus_BTN = new javax.swing.JButton();
        Edit_BTN = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_TabelDataMHS = new javax.swing.JMenu();
        MenuItem1_FormulirMHS = new javax.swing.JMenuItem();
        MenuItem2_NIM_MHS = new javax.swing.JMenuItem();
        Menuitem3_Keluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CmbCariData.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIK", "Nama_lengkap", "Jurusan", "Jenis Kelamin", "Email", "No tlp", "Agama" }));
        CmbCariData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbCariDataActionPerformed(evt);
            }
        });

        jLabel1.setText("Cari Data");

        TxtCariData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCariDataKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(CmbCariData, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(TxtCariData, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CmbCariData)
                        .addComponent(TxtCariData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Tabel_Data_MHS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIK", "Nama_lengkap", "Jurusan", "Jenis Kelamin", "Tgl Lahir", "Asal Sekolah", "Email", "No tlp", "Alamat", "Agama", "Nama Orang Tua"
            }
        ));
        jScrollPane1.setViewportView(Tabel_Data_MHS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1178, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Hapus_BTN.setText("Hapus");
        Hapus_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hapus_BTNActionPerformed(evt);
            }
        });

        Edit_BTN.setText("Edit");
        Edit_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_BTNActionPerformed(evt);
            }
        });

        Menu_TabelDataMHS.setText("Menu");

        MenuItem1_FormulirMHS.setText("Formulir  Mahasiswa");
        MenuItem1_FormulirMHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem1_FormulirMHSActionPerformed(evt);
            }
        });
        Menu_TabelDataMHS.add(MenuItem1_FormulirMHS);

        MenuItem2_NIM_MHS.setText("NIM Mahasiswa");
        MenuItem2_NIM_MHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem2_NIM_MHSActionPerformed(evt);
            }
        });
        Menu_TabelDataMHS.add(MenuItem2_NIM_MHS);

        Menuitem3_Keluar.setText("Keluar");
        Menuitem3_Keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menuitem3_KeluarMouseClicked(evt);
            }
        });
        Menuitem3_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menuitem3_KeluarActionPerformed(evt);
            }
        });
        Menu_TabelDataMHS.add(Menuitem3_Keluar);

        jMenuBar1.add(Menu_TabelDataMHS);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 709, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Edit_BTN)
                .addGap(26, 26, 26)
                .addComponent(Hapus_BTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hapus_BTN)
                    .addComponent(Edit_BTN))
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem1_FormulirMHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem1_FormulirMHSActionPerformed
        dispose();new Formulir_MHS(1,"").setVisible(true);
    }//GEN-LAST:event_MenuItem1_FormulirMHSActionPerformed
    
    private void Menuitem3_KeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menuitem3_KeluarMouseClicked
        
    }//GEN-LAST:event_Menuitem3_KeluarMouseClicked

    private void Menuitem3_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menuitem3_KeluarActionPerformed
        dispose();
    }//GEN-LAST:event_Menuitem3_KeluarActionPerformed

    private void Hapus_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hapus_BTNActionPerformed
        HapusData();
    }//GEN-LAST:event_Hapus_BTNActionPerformed

    private void MenuItem2_NIM_MHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem2_NIM_MHSActionPerformed
        dispose(); new NIM_mhs().setVisible(true);
    }//GEN-LAST:event_MenuItem2_NIM_MHSActionPerformed

    private void Edit_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_BTNActionPerformed
         int selectedRow = Tabel_Data_MHS.getSelectedRow();
         String NIK = Tabel_Data_MHS.getValueAt(selectedRow, 1).toString();
         int benar =2;
         Formulir_MHS form = new Formulir_MHS(benar,NIK);
         dispose();
         form.setVisible(true);
    }//GEN-LAST:event_Edit_BTNActionPerformed

    private void CmbCariDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbCariDataActionPerformed
       
    }//GEN-LAST:event_CmbCariDataActionPerformed

    private void TxtCariDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCariDataKeyPressed

            CariData();
    }//GEN-LAST:event_TxtCariDataKeyPressed

private void TampilData() {
    try {
        st = cn.createStatement();
        rs = st.executeQuery("SELECT * FROM biodata_mhs ORDER BY id_mhs ASC");

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id_mhs");
        model.addColumn("NIK");
        model.addColumn("Nama Lengkap");
        model.addColumn("jurusan");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Asal Sekolah");
        model.addColumn("Email");
        model.addColumn("No Telepon");
        model.addColumn("Alamat");
        model.addColumn("Agama");
        model.addColumn("Nama Orang Tua");

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id_mhs"),
                rs.getString("NIK"),
                rs.getString("nama_lengkap"),
                rs.getString("jurusan"),
                rs.getString("jenis_kelamin"),
                rs.getString("tgl_lahir"),
                rs.getString("asal_sekolah"),
                rs.getString("email"),
                rs.getString("no_tlp"),
                rs.getString("alamat"),
                rs.getString("agama"),
                rs.getString("nama_orangtua")
            });
        }

        Tabel_Data_MHS.setModel(model);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal menampilkan data: " + e.getMessage());
    }
}

private void HapusData() {
    try {
        int selectedRow = Tabel_Data_MHS.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus");
            return;
        }

        String nik = Tabel_Data_MHS.getValueAt(selectedRow, 1).toString(); // Mengambil NIK dari baris yang dipilihi
        cn.setAutoCommit(false);

        String sql1 = "DELETE FROM jurusan_mhs WHERE NIK = ?";
        PreparedStatement pst1 = cn.prepareStatement(sql1);
        pst1.setString(1, nik);
        pst1.executeUpdate();

        String sql2 = "DELETE FROM biodata_mhs WHERE NIK = ?";
        PreparedStatement pst2 = cn.prepareStatement(sql2);
        pst2.setString(1, nik);
        pst2.executeUpdate();

        cn.commit();

        JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
        TampilData();
        
    } catch (Exception e) {
        try {
            cn.rollback();
        } catch (Exception rollbackEx) {
            JOptionPane.showMessageDialog(null, "Gagal membatalkan transaksi: " + rollbackEx.getMessage());
        }
        JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage());
    } finally {
        try {
            cn.setAutoCommit(true);
        } catch (Exception finalEx) {
            JOptionPane.showMessageDialog(null, "Gagal mengatur ulang auto commit: " + finalEx.getMessage());
        }
    }
}
    private void CariData() {
    try {
        st = cn.createStatement();
        rs = st.executeQuery("SELECT * FROM biodata_mhs WHERE " + CmbCariData.getSelectedItem().toString() + " LIKE '%" + TxtCariData.getText() + "%'");

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id_mhs");
        model.addColumn("NIK");
        model.addColumn("Nama Lengkap");
        model.addColumn("jurusan");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Asal Sekolah");
        model.addColumn("Email");
        model.addColumn("No Telepon");
        model.addColumn("Alamat");
        model.addColumn("Agama");
        model.addColumn("Nama Orang Tua");

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("id_mhs"),
                rs.getString("NIK"),
                rs.getString("nama_lengkap"),
                rs.getString("jurusan"),
                rs.getString("jenis_kelamin"),
                rs.getString("tgl_lahir"),
                rs.getString("asal_sekolah"),
                rs.getString("email"),
                rs.getString("no_tlp"),
                rs.getString("alamat"),
                rs.getString("agama"),
                rs.getString("nama_orangtua")
            });
        }

        Tabel_Data_MHS.setModel(model);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal menampilkan data: " + e.getMessage());
    }
    }


    


  
    
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
            java.util.logging.Logger.getLogger(Tabel_Data_MHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabel_Data_MHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabel_Data_MHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabel_Data_MHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabel_Data_MHS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbCariData;
    private javax.swing.JButton Edit_BTN;
    private javax.swing.JButton Hapus_BTN;
    private javax.swing.JMenuItem MenuItem1_FormulirMHS;
    private javax.swing.JMenuItem MenuItem2_NIM_MHS;
    private javax.swing.JMenu Menu_TabelDataMHS;
    private javax.swing.JMenuItem Menuitem3_Keluar;
    private javax.swing.JTable Tabel_Data_MHS;
    private javax.swing.JTextField TxtCariData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
