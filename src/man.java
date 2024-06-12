


public class man extends javax.swing.JFrame{
    // Konstruktor kelas man
    public man() {
        this.setSize(800, 600); 
        this.setLocationRelativeTo(null); 
        
        initComponents();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        pn_blazer = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        bt_blz = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        pn_sherpa = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pn_jacktetvintage = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        pn_carhartpants = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusCycleRoot(false);
        setFocusableWindowState(false);
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel12.setLayout(new java.awt.CardLayout());

        jPanel18.setLayout(new java.awt.CardLayout());

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        pn_blazer.setBackground(new java.awt.Color(153, 153, 153));
        pn_blazer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_blazerMouseClicked(evt);
            }
        });
        pn_blazer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/88820d12bfab24b3058c2dde7a6a057d (2).jpeg"))); // NOI18N
        pn_blazer.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, -1));

        bt_blz.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        bt_blz.setText("Blazers");
        bt_blz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_blzMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_blzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_blzMouseExited(evt);
            }
        });
        pn_blazer.add(bt_blz, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, 20));

        jLabel27.setText("500K");
        pn_blazer.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 20));

        pn_sherpa.setBackground(new java.awt.Color(153, 153, 153));
        pn_sherpa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/2de990ce-cfd2-497d-a2c2-e9bdb2f25b07.jpg"))); // NOI18N
        pn_sherpa.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel29.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel29.setText("Sherpa Zara");
        pn_sherpa.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, 20));

        jLabel30.setText("200k");
        pn_sherpa.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        pn_jacktetvintage.setBackground(new java.awt.Color(153, 153, 153));
        pn_jacktetvintage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/jaket_vintage_thrift_preloved__1661350058_99878c7f_progressive.jpg"))); // NOI18N
        pn_jacktetvintage.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 170));

        jLabel32.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel32.setText(" Jacket Vintage");
        pn_jacktetvintage.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel33.setText("200K");
        pn_jacktetvintage.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        pn_carhartpants.setBackground(new java.awt.Color(153, 153, 153));
        pn_carhartpants.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/carhartt-thrift-bermuda-leaf-stonewashed-p6354-4736_image.jpg"))); // NOI18N
        pn_carhartpants.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 175));

        jLabel35.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel35.setText("Carhart Pants");
        pn_carhartpants.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel36.setText("700k");
        pn_carhartpants.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 70, 30));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pn_blazer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_jacktetvintage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_carhartpants, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_sherpa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_sherpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_blazer, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pn_jacktetvintage, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn_carhartpants, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel19, "card2");

        jPanel12.add(jPanel18, "card3");

        getContentPane().add(jPanel12, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
     
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
       
    }//GEN-LAST:event_formMouseDragged

    private void bt_blzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_blzMouseClicked
 
    }//GEN-LAST:event_bt_blzMouseClicked

    private void bt_blzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_blzMouseExited
         
      
    }//GEN-LAST:event_bt_blzMouseExited

    private void bt_blzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_blzMouseEntered
          
     
    }//GEN-LAST:event_bt_blzMouseEntered

    private void pn_blazerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_blazerMouseClicked
       
    }//GEN-LAST:event_pn_blazerMouseClicked
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
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new man().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bt_blz;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel pn_blazer;
    private javax.swing.JPanel pn_carhartpants;
    private javax.swing.JPanel pn_jacktetvintage;
    private javax.swing.JPanel pn_sherpa;
    // End of variables declaration//GEN-END:variables
}
