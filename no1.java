/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package perpus;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class no1 extends javax.swing.JFrame {

    /**
     * Creates new form no1
     */
    public no1() {
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

        bgBuku = new javax.swing.ButtonGroup();
        pTengah = new javax.swing.JPanel();
        rbNebula = new javax.swing.JRadioButton();
        rbSUM = new javax.swing.JRadioButton();
        rbCPR = new javax.swing.JRadioButton();
        rbKAS = new javax.swing.JRadioButton();
        rbSAS = new javax.swing.JRadioButton();
        rbDN = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pAtas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pKiri = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSinopsis = new javax.swing.JTextArea();
        btnPinjam = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        tfPenulis = new javax.swing.JTextField();
        tfPenerbit = new javax.swing.JTextField();
        tfHalaman = new javax.swing.JTextField();
        tfTahun = new javax.swing.JTextField();
        tfStok = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pTengah.setBackground(new java.awt.Color(255, 255, 153));
        pTengah.setLayout(null);

        bgBuku.add(rbNebula);
        rbNebula.setText("Nebula");
        rbNebula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNebulaActionPerformed(evt);
            }
        });
        pTengah.add(rbNebula);
        rbNebula.setBounds(190, 180, 90, 21);

        bgBuku.add(rbSUM);
        rbSUM.setText("Sebuah Usaha Melupakan");
        rbSUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSUMActionPerformed(evt);
            }
        });
        pTengah.add(rbSUM);
        rbSUM.setBounds(270, 180, 170, 21);

        bgBuku.add(rbCPR);
        rbCPR.setText("Cinta Paling Rumit");
        rbCPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCPRActionPerformed(evt);
            }
        });
        pTengah.add(rbCPR);
        rbCPR.setBounds(20, 180, 150, 21);

        bgBuku.add(rbKAS);
        rbKAS.setText("Konspirasi Alam Semesta");
        rbKAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKASActionPerformed(evt);
            }
        });
        pTengah.add(rbKAS);
        rbKAS.setBounds(135, 420, 180, 21);

        bgBuku.add(rbSAS);
        rbSAS.setText("Si Anak Spesial");
        rbSAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSASActionPerformed(evt);
            }
        });
        pTengah.add(rbSAS);
        rbSAS.setBounds(320, 420, 130, 21);

        bgBuku.add(rbDN);
        rbDN.setText("Dear Nathan");
        rbDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDNActionPerformed(evt);
            }
        });
        pTengah.add(rbDN);
        rbDN.setBounds(20, 420, 110, 21);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Pictures\\modul 3 ni 1\\buku nebula.jpg")); // NOI18N
        pTengah.add(jLabel9);
        jLabel9.setBounds(180, 30, 95, 132);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Pictures\\modul 3 ni 1\\buku sum.jpg")); // NOI18N
        pTengah.add(jLabel10);
        jLabel10.setBounds(320, 30, 90, 132);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Pictures\\modul 3 ni 1\\buku cpr.jpg")); // NOI18N
        pTengah.add(jLabel11);
        jLabel11.setBounds(30, 30, 95, 132);

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Pictures\\modul 3 ni 1\\buku dn.jpg")); // NOI18N
        pTengah.add(jLabel12);
        jLabel12.setBounds(30, 270, 95, 136);

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Pictures\\modul 3 ni 1\\buku kas.jpg")); // NOI18N
        pTengah.add(jLabel13);
        jLabel13.setBounds(180, 280, 95, 120);

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Pictures\\modul 3 ni 1\\buku sas.jpg")); // NOI18N
        pTengah.add(jLabel14);
        jLabel14.setBounds(330, 260, 95, 140);

        getContentPane().add(pTengah, java.awt.BorderLayout.CENTER);

        pAtas.setBackground(new java.awt.Color(255, 229, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("PERPUSTAKAAN KAMI");

        javax.swing.GroupLayout pAtasLayout = new javax.swing.GroupLayout(pAtas);
        pAtas.setLayout(pAtasLayout);
        pAtasLayout.setHorizontalGroup(
            pAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtasLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jLabel1)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        pAtasLayout.setVerticalGroup(
            pAtasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAtasLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(pAtas, java.awt.BorderLayout.PAGE_START);

        pKiri.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setText("DETAIL BUKU :");

        jLabel3.setText("Sinopsis");

        jLabel4.setText("Penulis");

        jLabel5.setText("Penerbit");

        jLabel6.setText("Halaman");

        jLabel7.setText("Tahun Terbit");

        jLabel8.setText("Stok Buku");

        taSinopsis.setEditable(false);
        taSinopsis.setColumns(20);
        taSinopsis.setRows(5);
        jScrollPane1.setViewportView(taSinopsis);

        btnPinjam.setText("Pinjam");
        btnPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPinjamActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        tfPenulis.setEditable(false);

        tfPenerbit.setEditable(false);

        tfHalaman.setEditable(false);

        tfTahun.setEditable(false);

        tfStok.setEditable(false);

        javax.swing.GroupLayout pKiriLayout = new javax.swing.GroupLayout(pKiri);
        pKiri.setLayout(pKiriLayout);
        pKiriLayout.setHorizontalGroup(
            pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pKiriLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pKiriLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pKiriLayout.createSequentialGroup()
                                .addGroup(pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pKiriLayout.createSequentialGroup()
                                        .addGroup(pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfStok)
                                            .addComponent(tfTahun)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pKiriLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tfHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(69, 69, 69))))
                    .addGroup(pKiriLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tfPenerbit))
                    .addGroup(pKiriLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pKiriLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24)
                        .addComponent(tfPenulis)))
                .addGap(30, 30, 30))
            .addGroup(pKiriLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pKiriLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pKiriLayout.setVerticalGroup(
            pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pKiriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPenulis, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfHalaman, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStok, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(26, 26, 26)
                .addGroup(pKiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKeluar)
                    .addComponent(btnPinjam))
                .addGap(35, 35, 35))
        );

        getContentPane().add(pKiri, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPinjamActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Buku berhasil dipinjam, Selamat membaca dan jangan lupa dikembalikan");
    }//GEN-LAST:event_btnPinjamActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void rbKASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKASActionPerformed
        // TODO add your handling code here:
        taSinopsis.setText("Suatu sore di Bandung, seorang lelaki kumal bernama Juang Astrajingga dipertemukan dengan Ana Tidae oleh alam semesta, di sebuah Lorong Palasari, tempat Juang biasa mencari buku-buku bekas dan langka.");
        tfPenulis.setText("Fiersa Besari");
        tfPenerbit.setText("Mediakita");
        tfHalaman.setText("226");
        tfTahun.setText("2017");
        tfStok.setText("5");
    }//GEN-LAST:event_rbKASActionPerformed

    private void rbNebulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNebulaActionPerformed
        // TODO add your handling code here:
        taSinopsis.setText("Bercerita tentang persahabatan tiga mahasiswa yang diam-diam memiliki rencana bertualang ke tempat-tempat jauh. Sayangnya petualangan itu berakhir buruk, saat persahabatan mereka diuji dengan rasa suka, egoisme, dan pengkhianatan. Ada banyak karakter baru, tempat-tempat baru, juga sejarah dunia paralel yang diungkap.");
        tfPenulis.setText("Tere Liye");
        tfPenerbit.setText("Gramedia Pustaka Utama");
        tfHalaman.setText("376");
        tfTahun.setText("2019");
        tfStok.setText("2");
    }//GEN-LAST:event_rbNebulaActionPerformed

    private void rbSUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSUMActionPerformed
        // TODO add your handling code here:
        taSinopsis.setText("Bercerita tentang “Aku” yang sangat mencintai pasangannya, dia awalnya memuji dan mengelukan pasangannya dengan kata-kata manis, pujian, dan cinta, meski mereka berhubungan jarak jauh. Hubungan mereka manis, penuh janji dan harapan. Namun, ketika si “aku” dihianati oleh pasangannya akibat kehadiran orang ketiga, dia beralih menjadi pembenci, dan berkata kasar.");
        tfPenulis.setText("Boy Chandra");
        tfPenerbit.setText("Mediakita");
        tfHalaman.setText("305");
        tfTahun.setText("2016");
        tfStok.setText("1");
    }//GEN-LAST:event_rbSUMActionPerformed

    private void rbCPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCPRActionPerformed
        // TODO add your handling code here:
        taSinopsis.setText("Dari sudut kota yang jauh. Perasaan kepadamu tetaplah hal yang utuh. Sebab kamu bagian dari rencana-rencana besarku. Bagian penting dari hal-hal yang kumiliki dalam hidupku. Maka, bertahanlah di sana tanpa rasa curiga. Tanamkan dalam dadamu apa yang aku perjuangkan sepenuh jiwa.");
        tfPenulis.setText("Boy Chandra");
        tfPenerbit.setText("KataDepan");
        tfHalaman.setText("332");
        tfTahun.setText("2018");
        tfStok.setText("3");
    }//GEN-LAST:event_rbCPRActionPerformed

    private void rbSASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSASActionPerformed
        // TODO add your handling code here:
        taSinopsis.setText("Bercerita tentang kisah Burlian seorang anak SD yang nakal tetapi baik hati dan sopan ini memfokuskan tentang kehidupannya sebagai anak ketiga dari empat saudara.");
        tfPenulis.setText("Tere Liye");
        tfPenerbit.setText("Republika");
        tfHalaman.setText("329");
        tfTahun.setText("2018");
        tfStok.setText("2");
    }//GEN-LAST:event_rbSASActionPerformed

    private void rbDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDNActionPerformed
        // TODO add your handling code here:
        taSinopsis.setText("Bercerita tentang masa indah putih abu-abu, persahabatan, pelajaran kehidupan, dan pentingnya untuk selalu menghargai perasaan. Berawal dari keterlambatan mengikuti upacara pertama di sekolah baru, Salma Alvira bertemu dengan seorang cowok yang membantunya menelusup lewat gerbang samping.");
        tfPenulis.setText("Erisca Febriani");
        tfPenerbit.setText("Best Media");
        tfHalaman.setText("528");
        tfTahun.setText("2017");
        tfStok.setText("3");
    }//GEN-LAST:event_rbDNActionPerformed

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
            java.util.logging.Logger.getLogger(no1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(no1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(no1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(no1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new no1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgBuku;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnPinjam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pAtas;
    private javax.swing.JPanel pKiri;
    private javax.swing.JPanel pTengah;
    private javax.swing.JRadioButton rbCPR;
    private javax.swing.JRadioButton rbDN;
    private javax.swing.JRadioButton rbKAS;
    private javax.swing.JRadioButton rbNebula;
    private javax.swing.JRadioButton rbSAS;
    private javax.swing.JRadioButton rbSUM;
    private javax.swing.JTextArea taSinopsis;
    private javax.swing.JTextField tfHalaman;
    private javax.swing.JTextField tfPenerbit;
    private javax.swing.JTextField tfPenulis;
    private javax.swing.JTextField tfStok;
    private javax.swing.JTextField tfTahun;
    // End of variables declaration//GEN-END:variables
}
