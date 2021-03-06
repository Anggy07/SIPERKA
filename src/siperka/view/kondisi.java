/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siperka.view;

/**
 *
 * @author Kariema
 */
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class kondisi extends javax.swing.JFrame {

    /**
     * Creates new form kondisi
     */
    public kondisi() {
        initComponents();
    }

    public String getIDkondisi() {
        return id_kondisi.getText();
    }

    public String getIDtanaman() {
        return id_tanaman.getText();
    }

    public String getKondisiBunga() {
        return kondisi_bunga.getText();
    }

    public String getKondisiDaun() {
        return kondisi_daun.getText();
    }

    public String getKondisiPohon() {
        return kondisi_pohon.getText();
    }

    public int getSelectedRow() {
        int baris = tabel.getSelectedRow();
        return baris;
    }

    public void setIDkondisi(String IDkondisi) {
        this.id_kondisi.setText(IDkondisi);
    }

    public void setIDtanaman(String IDtanaman) {
        this.id_tanaman.setText(IDtanaman);
    }

    public void setKondisiDaun(String KondisiDaun) {
        this.kondisi_daun.setText(KondisiDaun);
    }

    public void setKondisiBunga(String KondisiBunga) {
        this.kondisi_bunga.setText(KondisiBunga);
    }

    public void setKondisiPohon(String KondisiPohon) {
        this.kondisi_pohon.setText(KondisiPohon);
    }

    public void addTableListener(MouseListener listener) {
        tabel.addMouseListener(listener);
    }

    public void addubahListener(ActionListener listener) {
        ubah.addActionListener(listener);
    }

    public void addtambahListener(ActionListener listener) {
        tambah.addActionListener(listener);
    }

    public void addhapusListener(ActionListener listener) {
        hapus.addActionListener(listener);
    }

    public void setTableModel(DefaultTableModel tm) {
        tabel.setModel(tm);
    }

    public void enableEditAndDelete() {
        ubah.setEnabled(true);
        hapus.setEnabled(true);
    }

    public void disableEditAndDelete() {
        ubah.setEnabled(false);
        hapus.setEnabled(false);
    }
    public void disableTombol() {
        ubah.setVisible(false);
        hapus.setVisible(false);
        tambah.setVisible(false);
        id_tanaman.setEditable(false);
        kondisi_bunga.setEditable(false);
        kondisi_daun.setEditable(false);
        kondisi_pohon.setEditable(false);
    }

    public void clearInput() {
        id_kondisi.setText("");
        id_tanaman.setText("");
        kondisi_bunga.setText("");
        kondisi_daun.setText("");
        kondisi_pohon.setText("");
    }
     public void addButtonLogin(MouseListener e) {
        jLabel3.addMouseListener(e);
    }
      public void addButtonBack(MouseListener e) {
        mbalik1.addMouseListener(e);
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
        tabel = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        kondisi_daun = new javax.swing.JTextField();
        kondisi_bunga = new javax.swing.JTextField();
        kondisi_pohon = new javax.swing.JTextField();
        id_tanaman = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        mbalik = new javax.swing.JLabel();
        mbalik1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id_kondisi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(333, 144));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 470, 280));

        tambah.setText("Tambah");
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 80, 30));

        ubah.setText("Ubah");
        getContentPane().add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 70, 30));

        hapus.setText("Hapus");
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 70, 30));
        getContentPane().add(kondisi_daun, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 110, -1));
        getContentPane().add(kondisi_bunga, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 110, -1));
        getContentPane().add(kondisi_pohon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 110, -1));
        getContentPane().add(id_tanaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ID kondisi");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ID tanaman");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("kondisi daun");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("kondisi pohon");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 60, 20));

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

        mbalik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mbalik.png"))); // NOI18N
        mbalik.setText("jLabel2");
        mbalik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mbalik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mbalikMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mbalikMouseExited(evt);
            }
        });
        getContentPane().add(mbalik, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 80, -1));

        mbalik1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/mbalik1.png"))); // NOI18N
        mbalik1.setText("jLabel3");
        mbalik1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mbalik1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mbalik1MouseClicked(evt);
            }
        });
        getContentPane().add(mbalik1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 80, 50));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("kondisi bunga");
        jLabel8.setToolTipText("");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));
        getContentPane().add(id_kondisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 110, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kondisi.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

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

    private void mbalikMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbalikMouseEntered
        mbalik.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_mbalikMouseEntered

    private void mbalikMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbalikMouseExited
        mbalik.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_mbalikMouseExited

    private void mbalik1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbalik1MouseClicked
              // TODO add your handling code here:
    }//GEN-LAST:event_mbalik1MouseClicked

    /**
     * @param args the command line arguments
     */
//    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel id_kondisi;
    private javax.swing.JTextField id_tanaman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kondisi_bunga;
    private javax.swing.JTextField kondisi_daun;
    private javax.swing.JTextField kondisi_pohon;
    private javax.swing.JLabel mbalik;
    private javax.swing.JLabel mbalik1;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tambah;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
