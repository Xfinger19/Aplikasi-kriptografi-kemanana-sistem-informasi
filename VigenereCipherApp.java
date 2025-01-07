/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kriptografiapplication;

/**
 *
 * @author CATURWARGA COMPUTER
 */
public class VigenereCipherApp extends javax.swing.JFrame {

    /**
     * Creates new form VigenereCipherApp
     */
    public VigenereCipherApp() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputpesanTxt = new javax.swing.JTextField();
        KunciTxt = new javax.swing.JTextField();
        encryptVigenereTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        decryptVigenereTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EnkripsiButton = new javax.swing.JButton();
        Deskripsibutton = new javax.swing.JButton();
        kemenubutton = new javax.swing.JButton();
        hapusbutton = new javax.swing.JButton();
        panel2 = new java.awt.Panel();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(242, 242, 242));

        jLabel3.setText("Masukkan pesan");

        jLabel4.setText("Masukkan Kunci");

        inputpesanTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputpesanTxtActionPerformed(evt);
            }
        });

        KunciTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KunciTxtActionPerformed(evt);
            }
        });

        encryptVigenereTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptVigenereTxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Enkripsi Vigenere");

        decryptVigenereTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptVigenereTxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Dekripsi Vigenere");

        EnkripsiButton.setText("Enkripsi ");
        EnkripsiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnkripsiButtonActionPerformed(evt);
            }
        });

        Deskripsibutton.setText("Deskripsi");
        Deskripsibutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeskripsibuttonActionPerformed(evt);
            }
        });

        kemenubutton.setText("Kemenu utama");
        kemenubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kemenubuttonActionPerformed(evt);
            }
        });

        hapusbutton.setText("hapus");
        hapusbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusbuttonActionPerformed(evt);
            }
        });

        panel2.setBackground(new java.awt.Color(255, 153, 102));

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(inputpesanTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(KunciTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(encryptVigenereTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(decryptVigenereTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(EnkripsiButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Deskripsibutton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(kemenubutton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(hapusbutton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(74, 74, 74)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputpesanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KunciTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(hapusbutton))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(kemenubutton)
                                .addGap(67, 67, 67))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(EnkripsiButton))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deskripsibutton))
                        .addGap(23, 23, 23))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(encryptVigenereTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(decryptVigenereTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
            .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hapusbutton)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(inputpesanTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(KunciTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnkripsiButton)
                    .addComponent(Deskripsibutton))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(kemenubutton))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decryptVigenereTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encryptVigenereTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel1.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Vigenere Cipher");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(218, 218, 218))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptVigenereTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptVigenereTxtActionPerformed
        
    }//GEN-LAST:event_encryptVigenereTxtActionPerformed

    private void KunciTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KunciTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KunciTxtActionPerformed

    private void inputpesanTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputpesanTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputpesanTxtActionPerformed

    private void decryptVigenereTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptVigenereTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decryptVigenereTxtActionPerformed

    private void EnkripsiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnkripsiButtonActionPerformed
        String pesan = inputpesanTxt.getText();
        String kunci = KunciTxt.getText();
        String hasilEnkripsi = enkripsi(pesan, kunci);
        encryptVigenereTxt.setText(hasilEnkripsi);
    }//GEN-LAST:event_EnkripsiButtonActionPerformed

    private void DeskripsibuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeskripsibuttonActionPerformed
        String pesanTerenkripsi = encryptVigenereTxt.getText();
        String kunci = KunciTxt.getText();
        String hasilDekripsi = deskripsi(pesanTerenkripsi, kunci);
        decryptVigenereTxt.setText(hasilDekripsi); 
        
    }//GEN-LAST:event_DeskripsibuttonActionPerformed

    private void kemenubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kemenubuttonActionPerformed
        Formutama formutama = new Formutama();
        formutama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kemenubuttonActionPerformed

    private void hapusbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusbuttonActionPerformed
         encryptVigenereTxt.setText("");
         decryptVigenereTxt.setText("");
         inputpesanTxt.setText("");
         KunciTxt.setText("");
    }//GEN-LAST:event_hapusbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(VigenereCipherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VigenereCipherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VigenereCipherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VigenereCipherApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VigenereCipherApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deskripsibutton;
    private javax.swing.JButton EnkripsiButton;
    private javax.swing.JTextField KunciTxt;
    private javax.swing.JTextField decryptVigenereTxt;
    private javax.swing.JTextField encryptVigenereTxt;
    private javax.swing.JButton hapusbutton;
    private javax.swing.JTextField inputpesanTxt;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton kemenubutton;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    // End of variables declaration//GEN-END:variables

    private void deskripsiVigenere() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void enkripsiVigenere() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String enkripsi(String pesan, String kunci) {
         StringBuilder hasil = new StringBuilder();
        kunci = kunci.toUpperCase();
        int kunciIndex = 0;

        for (int i = 0; i < pesan.length(); i++) {
            char huruf = pesan.charAt(i);
            if (Character.isLetter(huruf)) {
                char base = Character.isUpperCase(huruf) ? 'A' : 'a';
                int shift = kunci.charAt(kunciIndex) - 'A';
                hasil.append((char) ((huruf - base + shift) % 26 + base));
                kunciIndex = (kunciIndex + 1) % kunci.length();
            } else {
                hasil.append(huruf);
            }
        }
        return hasil.toString();
    }

    private String deskripsi(String pesanTerenkripsi, String kunci) {
         StringBuilder hasil = new StringBuilder();
    kunci = kunci.toUpperCase(); // Pastikan kunci dalam huruf besar
    int kunciIndex = 0;

    for (int i = 0; i < pesanTerenkripsi.length(); i++) {
        char huruf = pesanTerenkripsi.charAt(i);

        if (Character.isLetter(huruf)) { // Periksa apakah karakter adalah huruf
            char base = Character.isUpperCase(huruf) ? 'A' : 'a';
            int shift = kunci.charAt(kunciIndex) - 'A'; // Hitung pergeseran berdasarkan kunci
            // Lakukan dekripsi dengan mengurangi shift
            char decryptedChar = (char) ((huruf - base - shift + 26) % 26 + base);
            hasil.append(decryptedChar);

            kunciIndex = (kunciIndex + 1) % kunci.length(); // Iterasi kunci
        } else {
            // Jika bukan huruf (misalnya angka atau simbol), langsung tambahkan
            hasil.append(huruf);
        }
    }

    return hasil.toString();
    }

    
    }

    class pesan {

        static char charAt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        static int length() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public pesan() {
        }
    }

