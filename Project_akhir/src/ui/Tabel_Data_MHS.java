package ui;

import java.sql.Connection;
import java.sql.ResultSet;
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
        Simpan_BTN = new javax.swing.JButton();
        Edit_BTN = new javax.swing.JButton();
        Hapus_BTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel_Data_MHS = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_TabelDataMHS = new javax.swing.JMenu();
        MenuItem1_FormulirMHS = new javax.swing.JMenuItem();
        Menuitem3_Keluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Simpan_BTN.setText("Simpan");

        Edit_BTN.setText("Edit");

        Hapus_BTN.setText("Hapus");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Hapus_BTN)
                .addGap(41, 41, 41)
                .addComponent(Edit_BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(Simpan_BTN)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hapus_BTN)
                    .addComponent(Edit_BTN)
                    .addComponent(Simpan_BTN))
                .addContainerGap(16, Short.MAX_VALUE))
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
                "NIM", "NIK", "Nama", "Jenis Kelamin", "Tgl Lahir", "Asal Sekolah", "Email", "No tlp", "Alamat", "Agama", "Nama Orang Tua"
            }
        ));
        jScrollPane1.setViewportView(Tabel_Data_MHS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        Menu_TabelDataMHS.setText("File");

        MenuItem1_FormulirMHS.setText("Formulir  Mahasiswa");
        MenuItem1_FormulirMHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem1_FormulirMHSActionPerformed(evt);
            }
        });
        Menu_TabelDataMHS.add(MenuItem1_FormulirMHS);

        Menuitem3_Keluar.setText("Keluar");
        Menuitem3_Keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menuitem3_KeluarMouseClicked(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem1_FormulirMHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem1_FormulirMHSActionPerformed
        dispose();new Formulir_MHS().setVisible(true);
    }//GEN-LAST:event_MenuItem1_FormulirMHSActionPerformed

    private void Menuitem3_KeluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menuitem3_KeluarMouseClicked
        dispose();
    }//GEN-LAST:event_Menuitem3_KeluarMouseClicked

        private void TampilData() {
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM biodata_mhs");

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("NIK");
            model.addColumn("Nama Lengkap");
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
                    rs.getString("NIK"),
                    rs.getString("nama_lengkap"),
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
        
        private void Hapus_BTNActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int selectedRow = Tabel_Data_MHS.getSelectedRow();
            String NIK = Tabel_Data_MHS.getValueAt(selectedRow, 0).toString();
            
            st = cn.createStatement();
            String sql = "DELETE FROM biodata_mhs WHERE NIK = '" + NIK + "'";
            st.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            TampilData();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage());
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
    private javax.swing.JButton Edit_BTN;
    private javax.swing.JButton Hapus_BTN;
    private javax.swing.JMenuItem MenuItem1_FormulirMHS;
    private javax.swing.JMenu Menu_TabelDataMHS;
    private javax.swing.JMenuItem Menuitem3_Keluar;
    private javax.swing.JButton Simpan_BTN;
    private javax.swing.JTable Tabel_Data_MHS;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
