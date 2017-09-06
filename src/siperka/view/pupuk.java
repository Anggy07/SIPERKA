/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siperka.view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kariema
 */
public class pupuk extends javax.swing.JFrame {

    /**
     * Creates new form pupuk
     */
    public pupuk() {
        initComponents();

    }

    public String getIDpemupukan() {
        return IDpemupukan.getText();
    }

      public void disableTombol() {
       // ubah.setVisible(false);
        hapus.setVisible(false);
        //tambah.setVisible(false);
       tgl_pemupukan.setEditable(false);
        Pupuk.setEditable(false);
        Vol_pupuk.setEditable(false);
        IDlahan.setEditable(false);
        IDtanaman.setEditable(false);
    }
      public void disableStatus(){
          status.setEnabled(false);
      }

    public String gettgl_pemupukan() {
        return tgl_pemupukan.getText();
    }

    public String getPupuk() {
        return Pupuk.getText();
    }

    public String getVol_pupuk() {
        return Vol_pupuk.getText();
    }

    public String getIDlahan() {
        return IDlahan.getText();
    }

    public String getIDtanaman() {
        return IDtanaman.getText();
    }

    public int getSelectedRow() {
        int baris = tabel1.getSelectedRow();
        return baris;
    }
    public String getStatus() {
        return status.getSelectedItem().toString();
    }

    public void setIDlahan(String IDlahan) {
        this.IDlahan.setText(IDlahan);
    }

    public void setIDpemupukan(String Nama_lahan) {
        this.IDpemupukan.setText(Nama_lahan);
    }

    public void settgl_pemupukan(String Luas_lahan) {
        this.tgl_pemupukan.setText(Luas_lahan);
    }

    public void setPpupuk(String Ph_tanah) {
        this.Pupuk.setText(Ph_tanah);
    }

    public void setVol_pupuk(String IDsektor) {
        this.Vol_pupuk.setText(IDsektor);
    }

    public void setIDtanaman(String Nama_sektor) {
        this.IDtanaman.setText(Nama_sektor);
    }
     public void setStatus(String status) {
        this.status.setSelectedItem(status);
    }

    public void addTableListener(MouseListener listener) {
        tabel1.addMouseListener(listener);
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

    public void setTableModel(DefaultTableModel tmm) {
        tabel1.setModel(tmm);
    }

    public void enableEditAndDelete() {
        ubah.setEnabled(true);
        hapus.setEnabled(true);
    }
     public void addButtonBack(MouseListener e) {
        mbalik1.addMouseListener(e);
    }
    public void addButtonLogin(MouseListener e) {
        jLabel8.addMouseListener(e);
    }

    public void disableEditAndDelete() {
        ubah.setEnabled(false);
        hapus.setEnabled(false);
    }

    public void clearInput() {
        IDlahan.setText("");
        IDpemupukan.setText("");
        tgl_pemupukan.setText("");
        Pupuk.setText("");
        Vol_pupuk.setText("");
        IDtanaman.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tgl_pemupukan = new javax.swing.JTextField();
        Pupuk = new javax.swing.JTextField();
        IDtanaman = new javax.swing.JTextField();
        Vol_pupuk = new javax.swing.JTextField();
        IDlahan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        status = new javax.swing.JComboBox();
        mbalik = new javax.swing.JLabel();
        mbalik1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ubah = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        IDpemupukan = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(333, 144));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tgl_pemupukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 110, -1));
        getContentPane().add(Pupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 110, -1));
        getContentPane().add(IDtanaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 110, -1));
        getContentPane().add(Vol_pupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 110, -1));
        getContentPane().add(IDlahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 110, -1));

        tabel1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 470, 280));

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "proses dipupuk", "selesai dipupuk" }));
        getContentPane().add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 110, -1));

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

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID pemupukan");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tgl pemupukan");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pupuk");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Vol. pupuk");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ID lahan");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("status");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 50, -1));

        ubah.setText("Ubah");
        getContentPane().add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 70, 30));

        tambah.setText("Tambah");
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 80, 30));

        hapus.setText("Hapus");
        getContentPane().add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 70, 30));

        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 60, 20));
        getContentPane().add(IDpemupukan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 110, 20));

        jLabel9.setFont(new java.awt.Font("Tempus Sans ITC", 3, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ID tanaman");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pupuk.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mbalikMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbalikMouseEntered
        mbalik.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_mbalikMouseEntered

    private void mbalikMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbalikMouseExited
        mbalik.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_mbalikMouseExited

    private void mbalik1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbalik1MouseClicked

    }//GEN-LAST:event_mbalik1MouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setVisible(false);          // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseExited

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exit1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDlahan;
    private javax.swing.JLabel IDpemupukan;
    private javax.swing.JTextField IDtanaman;
    private javax.swing.JTextField Pupuk;
    private javax.swing.JTextField Vol_pupuk;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JButton hapus;
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
    private javax.swing.JLabel mbalik;
    private javax.swing.JLabel mbalik1;
    private javax.swing.JComboBox status;
    private javax.swing.JTable tabel1;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tgl_pemupukan;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
