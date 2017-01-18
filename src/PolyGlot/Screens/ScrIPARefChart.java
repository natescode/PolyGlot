/*
 * Copyright (c) 2016-2017, draque
 * All rights reserved.
 *
 * Licensed under: Creative Commons Attribution-NonCommercial 4.0 International Public License
 *  See LICENSE.TXT included with this code to read the full license agreement.

 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package PolyGlot.Screens;

import PolyGlot.CustomControls.InfoBox;
import PolyGlot.CustomControls.PFrame;
import PolyGlot.DictCore;
import PolyGlot.ClipboardHandler;
import PolyGlot.IPAHandler;
import java.awt.Component;
import javax.swing.JComponent;

/**
 *
 * @author draque
 */
public class ScrIPARefChart extends PFrame {
    private final IPAHandler handler;
    
    /**
     * Creates new form ScrIPARefChart
     * @param _core
     */
    public ScrIPARefChart(DictCore _core) {
        core = _core;
        initComponents();
        handler = new IPAHandler(this);
        this.setupKeyStrokes();
    }
    
    @Override
    public final void setupKeyStrokes() {
        super.setupKeyStrokes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPulmonicConsonants = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblNonPulmonicConsonants = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblOtherSymbols = new javax.swing.JLabel();
        txtIPAChars = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("IPA Pronunciation/Character Guide");
        setResizable(false);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PolyGlot/ImageAssets/IPA_Vowels.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel23)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Vowels", jPanel1);

        lblPulmonicConsonants.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PolyGlot/ImageAssets/IPA_Pulmonic_Consonants.png"))); // NOI18N
        lblPulmonicConsonants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPulmonicConsonantsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPulmonicConsonants)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPulmonicConsonants)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pulmonic consonants", jPanel2);

        lblNonPulmonicConsonants.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PolyGlot/ImageAssets/IPA_NonPulmonicConsonants.png"))); // NOI18N
        lblNonPulmonicConsonants.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNonPulmonicConsonantsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(lblNonPulmonicConsonants)
                .addContainerGap(145, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNonPulmonicConsonants)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Non-pulmonic consonants", jPanel3);

        lblOtherSymbols.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PolyGlot/ImageAssets/IPA_Other.png"))); // NOI18N
        lblOtherSymbols.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOtherSymbolsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(lblOtherSymbols)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOtherSymbols)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Other/Affricates", jPanel4);

        txtIPAChars.setToolTipText("Symbols Copied Here");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIPAChars)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIPAChars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Vowels");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblOtherSymbolsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOtherSymbolsMouseClicked
        int x=evt.getX();
        int y=evt.getY();
        try {
            String ipaChar = handler.playOtherGetChar(x, y);
            new ClipboardHandler().setClipboardContents(ipaChar);
            String curText = txtIPAChars.getText();
            txtIPAChars.setText((curText.equals("") ? "" : curText + " ") + ipaChar);
        } catch(Exception e) {
            InfoBox.error("IPA Error", e.getLocalizedMessage(), this);
        }
    }//GEN-LAST:event_lblOtherSymbolsMouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        int x=evt.getX();
        int y=evt.getY();
        try {
            String ipaChar = handler.playVowelGetChar(x, y);
            new ClipboardHandler().setClipboardContents(ipaChar);
            String curText = txtIPAChars.getText();
            txtIPAChars.setText((curText.equals("") || ipaChar.equals("") ? "" : curText + " ") + ipaChar);
        } catch(Exception e) {
            InfoBox.error("IPA Error", e.getLocalizedMessage(), this);
        }
        System.out.println(x+","+y);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void lblPulmonicConsonantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPulmonicConsonantsMouseClicked
        int x=evt.getX();
        int y=evt.getY();
        try {
            String ipaChar = handler.playPulConsGetChar(x, y);
            new ClipboardHandler().setClipboardContents(ipaChar);
            String curText = txtIPAChars.getText();
            txtIPAChars.setText((curText.equals("") || ipaChar.equals("") ? "" : curText + " ") + ipaChar);
        } catch(Exception e) {
            InfoBox.error("IPA Error", e.getLocalizedMessage(), this);
        }
    }//GEN-LAST:event_lblPulmonicConsonantsMouseClicked

    private void lblNonPulmonicConsonantsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNonPulmonicConsonantsMouseClicked
        int x=evt.getX();
        int y=evt.getY();
        try {
            String ipaChar = handler.playNonPulConsGetChar(x, y);
            
            // empty string indicates invalid click location
            if (ipaChar.equals("")) {
                return;
            }
            
            new ClipboardHandler().setClipboardContents(ipaChar);
            String curText = txtIPAChars.getText();
            txtIPAChars.setText((curText.equals("") ? "" : curText + " ") + ipaChar);
        } catch(Exception e) {
            InfoBox.error("IPA Error", e.getLocalizedMessage(), this);
        }
    }//GEN-LAST:event_lblNonPulmonicConsonantsMouseClicked
    
    @Override
    public void updateAllValues(DictCore _core) {
        // values can't be updated in this window.
    }

    @Override
    public boolean thisOrChildrenFocused() {
        // no children windows possible from here
        return this.isFocusOwner();
    }

    @Override
    public void addBindingToComponent(JComponent c) {
        // nothing to bind in this window
    }
    
    @Override
    public Component getWindow() {
        return this.getRootPane();
    }
    
    @Override
    public boolean canClose() {
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblNonPulmonicConsonants;
    private javax.swing.JLabel lblOtherSymbols;
    private javax.swing.JLabel lblPulmonicConsonants;
    private javax.swing.JTextField txtIPAChars;
    // End of variables declaration//GEN-END:variables
}
