
import java.awt.Color;
import project.swing.ManProduct;
import project.swing.WomenProduct;
import project.swing.item;
import project.swing.product;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author farel
 */



public class beranda extends javax.swing.JFrame {
 
   
    public beranda() {
        initComponents();
          // ManProduct items
        ManProduct jacket = new ManProduct("Blazers", 500.000, "M");
        ManProduct jacketVintage = new ManProduct("Jacket Vintage", 300.000, "L");
        ManProduct sherpaZara = new ManProduct("Sherpa Zara", 200.000, "L");
        ManProduct carhartPants = new ManProduct("Carhart Pants", 700.000, "L");

        // WomenProduct items
        WomenProduct cardigan = new WomenProduct("Cardigan", 100.000, "L");
        WomenProduct cardiganZara = new WomenProduct("Cardigan Zara", 120.000, "L");
        WomenProduct kemejaKorea = new WomenProduct("Kemeja Korea", 70.000, "L");
        WomenProduct sweaterKorea = new WomenProduct("Sweater Korea", 90.000, "L");

        // Displaying information for ManProduct items
        jacket.displayInfo();
        jacket.displayInfo(true);
        jacketVintage.displayInfo();
        jacketVintage.displayInfo(true);
        sherpaZara.displayInfo();
        sherpaZara.displayInfo(true);
        carhartPants.displayInfo();
        carhartPants.displayInfo(true);

        // Displaying information for WomenProduct items
        cardigan.displayInfo();
        cardiganZara.displayInfo();
        kemejaKorea.displayInfo();
        sweaterKorea.displayInfo();

        // Checking if jacket is an instance of item and displaying info
        if (jacket instanceof item) {
            item item = (item) jacket;
            item.displayInfo();
        }

        // Printing company name and category
        product.printCompanyName();
        jacket.printCategory();
        jacketVintage.printCategory();
        sherpaZara.printCategory();
        carhartPants.printCategory();
        cardigan.printCategory();
        cardiganZara.printCategory();
        kemejaKorea.printCategory();
        sweaterKorea.printCategory();
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelkiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pn_uta = new javax.swing.JPanel();
        btman = new javax.swing.JLabel();
        pn_line = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pn_uta3 = new javax.swing.JPanel();
        btwoman = new javax.swing.JLabel();
        pn_line3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pn_uta4 = new javax.swing.JPanel();
        pn_line4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btdatabarang = new javax.swing.JLabel();
        pn_uta1 = new javax.swing.JPanel();
        bthome = new javax.swing.JLabel();
        pn_line1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pn_nav = new javax.swing.JPanel();
        panone = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusable(false);
        setFocusableWindowState(false);
        setPreferredSize(new java.awt.Dimension(750, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelkiri.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_shopify_24px.png"))); // NOI18N
        jLabel1.setText("PRODUCT");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Product Categories");

        pn_uta.setBackground(new java.awt.Color(255, 255, 255));

        btman.setText("Man");
        btman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btmanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btmanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btmanMouseExited(evt);
            }
        });

        pn_line.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_man_50px_2.png"))); // NOI18N

        javax.swing.GroupLayout pn_lineLayout = new javax.swing.GroupLayout(pn_line);
        pn_line.setLayout(pn_lineLayout);
        pn_lineLayout.setHorizontalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_lineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_lineLayout.setVerticalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_lineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_utaLayout = new javax.swing.GroupLayout(pn_uta);
        pn_uta.setLayout(pn_utaLayout);
        pn_utaLayout.setHorizontalGroup(
            pn_utaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_utaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btman, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        pn_utaLayout.setVerticalGroup(
            pn_utaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_line, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_utaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btman)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_uta3.setBackground(new java.awt.Color(255, 255, 255));

        btwoman.setText("Women");
        btwoman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btwomanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btwomanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btwomanMouseExited(evt);
            }
        });

        pn_line3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8_woman_50px.png"))); // NOI18N

        javax.swing.GroupLayout pn_line3Layout = new javax.swing.GroupLayout(pn_line3);
        pn_line3.setLayout(pn_line3Layout);
        pn_line3Layout.setHorizontalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_line3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_line3Layout.setVerticalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_line3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_uta3Layout = new javax.swing.GroupLayout(pn_uta3);
        pn_uta3.setLayout(pn_uta3Layout);
        pn_uta3Layout.setHorizontalGroup(
            pn_uta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_uta3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btwoman, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        pn_uta3Layout.setVerticalGroup(
            pn_uta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_line3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_uta3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btwoman)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pn_uta4.setBackground(new java.awt.Color(255, 255, 255));

        pn_line4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/womenclo/icons8_new_product_32px.png"))); // NOI18N

        btdatabarang.setText("Tambah Barang");
        btdatabarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btdatabarangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btdatabarangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btdatabarangMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_line4Layout = new javax.swing.GroupLayout(pn_line4);
        pn_line4.setLayout(pn_line4Layout);
        pn_line4Layout.setHorizontalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_line4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btdatabarang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_line4Layout.setVerticalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_line4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btdatabarang)
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(pn_line4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pn_uta4Layout = new javax.swing.GroupLayout(pn_uta4);
        pn_uta4.setLayout(pn_uta4Layout);
        pn_uta4Layout.setHorizontalGroup(
            pn_uta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_uta4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        pn_uta4Layout.setVerticalGroup(
            pn_uta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_line4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pn_uta1.setBackground(new java.awt.Color(255, 255, 255));

        bthome.setText("Home");
        bthome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bthomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bthomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bthomeMouseExited(evt);
            }
        });

        pn_line1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/womenclo/icons8_home_50px.png"))); // NOI18N

        javax.swing.GroupLayout pn_line1Layout = new javax.swing.GroupLayout(pn_line1);
        pn_line1.setLayout(pn_line1Layout);
        pn_line1Layout.setHorizontalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_line1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_line1Layout.setVerticalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_line1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pn_uta1Layout = new javax.swing.GroupLayout(pn_uta1);
        pn_uta1.setLayout(pn_uta1Layout);
        pn_uta1Layout.setHorizontalGroup(
            pn_uta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_uta1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bthome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        pn_uta1Layout.setVerticalGroup(
            pn_uta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_line1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_uta1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bthome)
                .addGap(20, 20, 20))
        );

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Admin");

        javax.swing.GroupLayout panelkiriLayout = new javax.swing.GroupLayout(panelkiri);
        panelkiri.setLayout(panelkiriLayout);
        panelkiriLayout.setHorizontalGroup(
            panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkiriLayout.createSequentialGroup()
                .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelkiriLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelkiriLayout.createSequentialGroup()
                                .addGap(827, 827, 827)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)))
                    .addComponent(pn_uta4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelkiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pn_uta1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelkiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pn_uta3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelkiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pn_uta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelkiriLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelkiriLayout.setVerticalGroup(
            panelkiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelkiriLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(pn_uta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_uta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pn_uta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_uta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        getContentPane().add(panelkiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 670));

        pn_nav.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout pn_navLayout = new javax.swing.GroupLayout(pn_nav);
        pn_nav.setLayout(pn_navLayout);
        pn_navLayout.setHorizontalGroup(
            pn_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pn_navLayout.setVerticalGroup(
            pn_navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        getContentPane().add(pn_nav, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 660, 90));

        panone.setLayout(new java.awt.BorderLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icon/Black White Minimalist Initials Monogram Jewelry Logo.png"))); // NOI18N
        panone.add(jLabel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(panone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 640, 500));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(650, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btmanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmanMouseClicked
        pn_uta.setBackground(new Color(240, 240, 240));
        pn_line.setBackground(new Color(0, 102, 153));
        
        panone.removeAll();
        panone.add(new pn_man());
        panone.repaint();
        panone.revalidate();
    }//GEN-LAST:event_btmanMouseClicked

    private void btmanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmanMouseEntered
         pn_uta.setBackground(new Color(250, 250, 250));
        pn_line.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_btmanMouseEntered

    private void btmanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btmanMouseExited
         pn_uta.setBackground(new Color(255, 255, 255));
        pn_line.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btmanMouseExited

    private void btwomanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btwomanMouseClicked
         pn_uta3.setBackground(new Color(240, 240, 240));
        pn_line3.setBackground(new Color(0, 102, 153));
        
        panone.removeAll();
        panone.add(new pnwomen());
        panone.repaint();
        panone.revalidate();
    }//GEN-LAST:event_btwomanMouseClicked

    private void btwomanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btwomanMouseEntered
         pn_uta3.setBackground(new Color(250, 250, 250));
        pn_line3.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_btwomanMouseEntered

    private void btwomanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btwomanMouseExited
         pn_uta3.setBackground(new Color(255, 255, 255));
        pn_line3.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btwomanMouseExited

    private void btdatabarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdatabarangMouseClicked
 this.setVisible(false);
        new DataBarang_() .setVisible(true);        
    }//GEN-LAST:event_btdatabarangMouseClicked

    private void btdatabarangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdatabarangMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btdatabarangMouseEntered

    private void btdatabarangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdatabarangMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btdatabarangMouseExited

    private void bthomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bthomeMouseClicked
     pn_uta1.setBackground(new Color(240, 240, 240));
        pn_line1.setBackground(new Color(0, 102, 153));
        
        panone.removeAll();
        panone.add(new pn_home());
        panone.repaint();
        panone.revalidate();
    }//GEN-LAST:event_bthomeMouseClicked

    private void bthomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bthomeMouseEntered
           pn_uta1.setBackground(new Color(250, 250, 250));
        pn_line1.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_bthomeMouseEntered

    private void bthomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bthomeMouseExited
        pn_uta1.setBackground(new Color(255, 255, 255));
        pn_line1.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_bthomeMouseExited

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
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btdatabarang;
    private javax.swing.JLabel bthome;
    private javax.swing.JLabel btman;
    private javax.swing.JLabel btwoman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelkiri;
    private javax.swing.JPanel panone;
    private javax.swing.JPanel pn_line;
    private javax.swing.JPanel pn_line1;
    private javax.swing.JPanel pn_line3;
    private javax.swing.JPanel pn_line4;
    private javax.swing.JPanel pn_nav;
    private javax.swing.JPanel pn_uta;
    private javax.swing.JPanel pn_uta1;
    private javax.swing.JPanel pn_uta3;
    private javax.swing.JPanel pn_uta4;
    // End of variables declaration//GEN-END:variables
}
