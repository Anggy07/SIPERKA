/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siperka.view;

import java.awt.event.MouseListener;

/**
 *
 * @author Kariema
 */
public class kebun extends javax.swing.JFrame {

    /**
     * Creates new form kebun
     */
    public kebun() {
        initComponents();
        kondisi.setVisible(false);
        pupuk.setVisible(false);
        tanaman.setVisible(false);
        bibit.setVisible(false);
    }
    private int n = 1;
    private int level;

    public void setLevel(int n) {
        level = n;
    }
    public void addButtonLogin(MouseListener e) {
        jLabel3.addMouseListener(e);
    }
    public void addButtonPupuk(MouseListener e) {
       btn_pupuk.addMouseListener(e);
    }
    public void addButtonTanaman(MouseListener e) {
       btn_tanaman.addMouseListener(e);
    }
    public void addButtonBibit(MouseListener e) {
       btn_bibit.addMouseListener(e);
    }
     public void addButtonKondisi(MouseListener e) {
       jLabel2.addMouseListener(e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        halaman = new javax.swing.JLabel();
        kembali = new javax.swing.JLabel();
        lanjut = new javax.swing.JLabel();
        btn_bibit = new javax.swing.JLabel();
        bibit = new javax.swing.JLabel();
        tanaman = new javax.swing.JLabel();
        btn_tanaman = new javax.swing.JLabel();
        btn_pupuk = new javax.swing.JLabel();
        pupuk = new javax.swing.JLabel();
        kondisi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(333, 144));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        halaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siperka/view/halaman1.png"))); // NOI18N
        getContentPane().add(halaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kembali.png"))); // NOI18N
        kembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                kembaliMouseEntered(evt);
            }
        });
        getContentPane().add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        lanjut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lanjut.png"))); // NOI18N
        lanjut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lanjut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lanjutMouseEntered(evt);
            }
        });
        getContentPane().add(lanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        btn_bibit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bibit11.png"))); // NOI18N
        btn_bibit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_bibit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_bibitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_bibitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_bibitMouseExited(evt);
            }
        });
        getContentPane().add(btn_bibit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 100, 110));

        bibit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bibit12.png"))); // NOI18N
        getContentPane().add(bibit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 100, 110));

        tanaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tanaman12.png"))); // NOI18N
        tanaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(tanaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 100, 110));

        btn_tanaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tanaman11.png"))); // NOI18N
        btn_tanaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tanaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_tanamanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_tanamanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_tanamanMouseExited(evt);
            }
        });
        getContentPane().add(btn_tanaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 100, 110));

        btn_pupuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pupuk11.png"))); // NOI18N
        btn_pupuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pupuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pupukMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pupukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pupukMouseExited(evt);
            }
        });
        getContentPane().add(btn_pupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 110));

        pupuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pupuk12.png"))); // NOI18N
        pupuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(pupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 110));

        kondisi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kondisi2.png"))); // NOI18N
        kondisi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kondisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                kondisiMouseExited(evt);
            }
        });
        getContentPane().add(kondisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kondisi1.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 100, 110));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/exit.png"))); // NOI18N
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 30, 30));

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/exit2.png"))); // NOI18N
        exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
        });
        getContentPane().add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 30, 30));

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 60, 20));

        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        getContentPane().add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 70, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siperka/view/kebun.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseExited

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exit1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        kondisi.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        kondisi.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void btn_pupukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pupukMouseClicked
           // TODO add your handling code here:
    }//GEN-LAST:event_btn_pupukMouseClicked

    private void btn_pupukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pupukMouseEntered
        pupuk.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btn_pupukMouseEntered

    private void btn_pupukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pupukMouseExited
        pupuk.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_btn_pupukMouseExited

    private void btn_tanamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tanamanMouseClicked
   
    }//GEN-LAST:event_btn_tanamanMouseClicked

    private void btn_tanamanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tanamanMouseEntered
        tanaman.setVisible(true);             // TODO add your handling code here:
    }//GEN-LAST:event_btn_tanamanMouseEntered

    private void btn_tanamanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_tanamanMouseExited
        tanaman.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_btn_tanamanMouseExited

    private void btn_bibitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bibitMouseClicked
             // TODO add your handling code here:
    }//GEN-LAST:event_btn_bibitMouseClicked

    private void btn_bibitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bibitMouseEntered
        bibit.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btn_bibitMouseEntered

    private void btn_bibitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_bibitMouseExited
        bibit.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_btn_bibitMouseExited

    private void kondisiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kondisiMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_kondisiMouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
 
    }//GEN-LAST:event_jLabel2MouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        this.setVisible(false);
        siperka.view.about n = new siperka.view.about();// TODO add your handling code here:
        n.setVisible(true);
        n.setLevel(2);
    }//GEN-LAST:event_aboutMouseClicked

    private void kembaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kembaliMouseEntered

        n--;
        if (n == 0) {
            n = 4;
        }
        halaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siperka/view/halaman" + n + ".png")));

        // TODO add your handling code here:
    }//GEN-LAST:event_kembaliMouseEntered

    private void lanjutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lanjutMouseEntered

        n++;
        if (n == 5) {
            n = 1;
        }
        halaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/siperka/view/halaman" + n + ".png")));
        // NOI18N        // TODO add your handling code here:
    }//GEN-LAST:event_lanjutMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel bibit;
    private javax.swing.JLabel btn_bibit;
    private javax.swing.JLabel btn_pupuk;
    private javax.swing.JLabel btn_tanaman;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel halaman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel kembali;
    private javax.swing.JLabel kondisi;
    private javax.swing.JLabel lanjut;
    private javax.swing.JLabel pupuk;
    private javax.swing.JLabel tanaman;
    // End of variables declaration//GEN-END:variables
}
