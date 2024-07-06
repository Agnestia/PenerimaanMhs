package ui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.KoneksiDatabase;
public class Formulir_MHS extends javax.swing.JFrame {

    Connection cn;
    Statement st;
    
    public Formulir_MHS() {
        initComponents();
        cn = KoneksiDatabase.BukaKoneksi();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Main_MHS = new javax.swing.JPanel();
        Panel_FormulirPendaftaranMHS = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Field_NamaOrtu = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Field_Alamat = new javax.swing.JTextField();
        Simpan_BTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Field_NoTlp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Field_Email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Field_AsalSekolah = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Field_TglLahir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Field_NIK = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Field_NamaLengkap = new javax.swing.JTextField();
        CmbJnsKel = new javax.swing.JComboBox<>();
        CmbAgama = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        CmbJurusan = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_FormulirMHS = new javax.swing.JMenu();
        MenuItem2_TabelDataMHS = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuItem3_Keluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_FormulirPendaftaranMHS.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Nama Orang Tua");

        Field_NamaOrtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_NamaOrtuActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Agama");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Alamat");

        Field_Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_AlamatActionPerformed(evt);
            }
        });

        Simpan_BTN.setBackground(new java.awt.Color(255, 255, 0));
        Simpan_BTN.setText("Simpan");
        Simpan_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Simpan_BTNActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("No Tlp");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Asal Sekolah");

        Field_AsalSekolah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field_AsalSekolahActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tgl Lahir");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Kelamin");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("NIK");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nama Lengkap");

        CmbJnsKel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perempuan", "Laki - laki" }));
        CmbJnsKel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbJnsKelActionPerformed(evt);
            }
        });

        CmbAgama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Katolik", "Kristen", "Budha", "Konghucu", "Hindu" }));
        CmbAgama.setName(""); // NOI18N
        CmbAgama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbAgamaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Pilih Jurusan");

        CmbJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Multimedia", "Ilmu Komunikasi", "Ekonomi", "Kedokteran", "Hukum", " " }));
        CmbJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbJurusanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_FormulirPendaftaranMHSLayout = new javax.swing.GroupLayout(Panel_FormulirPendaftaranMHS);
        Panel_FormulirPendaftaranMHS.setLayout(Panel_FormulirPendaftaranMHSLayout);
        Panel_FormulirPendaftaranMHSLayout.setHorizontalGroup(
            Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FormulirPendaftaranMHSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_FormulirPendaftaranMHSLayout.createSequentialGroup()
                        .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_FormulirPendaftaranMHSLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Field_NamaOrtu, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_FormulirPendaftaranMHSLayout.createSequentialGroup()
                                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(34, 34, 34)
                                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Field_TglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Field_AsalSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Field_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Field_NoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Field_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CmbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_FormulirPendaftaranMHSLayout.createSequentialGroup()
                                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Panel_FormulirPendaftaranMHSLayout.createSequentialGroup()
                                        .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(12, 12, 12))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CmbJnsKel, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Field_NamaLengkap, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                        .addComponent(Field_NIK, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                        .addComponent(CmbJurusan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addContainerGap(160, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_FormulirPendaftaranMHSLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Simpan_BTN)
                        .addGap(30, 30, 30))
                    .addGroup(Panel_FormulirPendaftaranMHSLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        Panel_FormulirPendaftaranMHSLayout.setVerticalGroup(
            Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_FormulirPendaftaranMHSLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field_NIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field_NamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CmbJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CmbJnsKel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field_TglLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field_AsalSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field_NoTlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CmbAgama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Panel_FormulirPendaftaranMHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field_NamaOrtu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(Simpan_BTN)
                .addGap(16, 16, 16))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Formulir Pendaftaran Mahasiswa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Panel_Main_MHSLayout = new javax.swing.GroupLayout(Panel_Main_MHS);
        Panel_Main_MHS.setLayout(Panel_Main_MHSLayout);
        Panel_Main_MHSLayout.setHorizontalGroup(
            Panel_Main_MHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_Main_MHSLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(Panel_Main_MHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel_FormulirPendaftaranMHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Panel_Main_MHSLayout.setVerticalGroup(
            Panel_Main_MHSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_Main_MHSLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Panel_FormulirPendaftaranMHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        Menu_FormulirMHS.setText("Menu");

        MenuItem2_TabelDataMHS.setText("Tabel Data Mahasiswa");
        MenuItem2_TabelDataMHS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuItem2_TabelDataMHSMouseClicked(evt);
            }
        });
        MenuItem2_TabelDataMHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem2_TabelDataMHSActionPerformed(evt);
            }
        });
        Menu_FormulirMHS.add(MenuItem2_TabelDataMHS);

        jMenuItem1.setText("NIM Mahasiswa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Menu_FormulirMHS.add(jMenuItem1);

        MenuItem3_Keluar.setText("Keluar");
        MenuItem3_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem3_KeluarActionPerformed(evt);
            }
        });
        Menu_FormulirMHS.add(MenuItem3_Keluar);

        jMenuBar1.add(Menu_FormulirMHS);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Main_MHS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_Main_MHS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Field_AsalSekolahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_AsalSekolahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_AsalSekolahActionPerformed

    private void Field_AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_AlamatActionPerformed

    private void Field_NamaOrtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field_NamaOrtuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Field_NamaOrtuActionPerformed

    private void MenuItem2_TabelDataMHSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuItem2_TabelDataMHSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem2_TabelDataMHSMouseClicked

    private void MenuItem2_TabelDataMHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem2_TabelDataMHSActionPerformed
       dispose();new Tabel_Data_MHS().setVisible(true);
    }//GEN-LAST:event_MenuItem2_TabelDataMHSActionPerformed

    private void MenuItem3_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem3_KeluarActionPerformed
        dispose();
    }//GEN-LAST:event_MenuItem3_KeluarActionPerformed

    private void Simpan_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Simpan_BTNActionPerformed
    try {
        st = cn.createStatement();

        // Tentukan awalan berdasarkan jurusan
        String jurusan = CmbJurusan.getSelectedItem().toString();
        String prefix = "";
        switch (jurusan) {
            case "Teknik Informatika":
                prefix = "A11";
                break;
            case "Multimedia":
                prefix = "B11";
                break;
            case "Ilmu Komunikasi":
                prefix = "C11";
                break;
            case "Ekonomi":
                prefix = "D11";
                break;
            case "Kedokteran":
                prefix = "E11";
                break;
            case "Hukum":
                prefix = "F11";
                break;
        }

        String year = String.valueOf(java.time.Year.now().getValue());

        String query = "SELECT COUNT(*) AS total FROM biodata_mhs";
        ResultSet rs = st.executeQuery(query);
        int count = 0;
        if (rs.next()) {
            count = rs.getInt("total") + 1;
        }
        rs.close(); 
        String serial = String.format("%05d", count);

        String NIM = prefix + "." + year + "." + serial;

        String sql = "INSERT INTO biodata_mhs (NIK, nama_lengkap, jurusan, jenis_kelamin, tgl_lahir, asal_sekolah, email, no_tlp, alamat, agama, nama_orangtua) VALUES ('"
                + Field_NIK.getText() + "','"
                + Field_NamaLengkap.getText() + "','"
                + CmbJurusan.getSelectedItem().toString() + "','"
                + CmbJnsKel.getSelectedItem().toString() + "','"
                + Field_TglLahir.getText() + "','"
                + Field_AsalSekolah.getText() + "','"
                + Field_Email.getText() + "','"
                + Field_NoTlp.getText() + "','"
                + Field_Alamat.getText() + "','"
                + CmbAgama.getSelectedItem().toString() + "','"
                + Field_NamaOrtu.getText() + "')";
        st.executeUpdate(sql);

        sql = "INSERT INTO jurusan_mhs (NIM, nama_lengkap, NIK, jurusan) VALUES ('"
                + NIM + "','"
                + Field_NamaLengkap.getText() + "','"
                + Field_NIK.getText() + "','"
                + CmbJurusan.getSelectedItem().toString() + "')";
        st.executeUpdate(sql);

        JOptionPane.showMessageDialog(null, "Data berhasil disimpan dengan NIM: " + NIM);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + e.getMessage());
    } finally {
        try {
            if (st != null) st.close();  
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error saat menutup Statement: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_Simpan_BTNActionPerformed

    private void CmbJnsKelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbJnsKelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbJnsKelActionPerformed

    private void CmbAgamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbAgamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbAgamaActionPerformed

    private void CmbJurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbJurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CmbJurusanActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();new NIM_mhs().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Formulir_MHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulir_MHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulir_MHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulir_MHS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulir_MHS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbAgama;
    private javax.swing.JComboBox<String> CmbJnsKel;
    private javax.swing.JComboBox<String> CmbJurusan;
    private javax.swing.JTextField Field_Alamat;
    private javax.swing.JTextField Field_AsalSekolah;
    private javax.swing.JTextField Field_Email;
    private javax.swing.JTextField Field_NIK;
    private javax.swing.JTextField Field_NamaLengkap;
    private javax.swing.JTextField Field_NamaOrtu;
    private javax.swing.JTextField Field_NoTlp;
    private javax.swing.JTextField Field_TglLahir;
    private javax.swing.JMenuItem MenuItem2_TabelDataMHS;
    private javax.swing.JMenuItem MenuItem3_Keluar;
    private javax.swing.JMenu Menu_FormulirMHS;
    private javax.swing.JPanel Panel_FormulirPendaftaranMHS;
    private javax.swing.JPanel Panel_Main_MHS;
    private javax.swing.JButton Simpan_BTN;
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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
