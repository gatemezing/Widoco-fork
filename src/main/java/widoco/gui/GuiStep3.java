/*
 *  Copyright 2012-2013 Ontology Engineering Group, Universidad Politecnica de Madrid, Spain

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

/*
 * WidocoGui2.java
 *
 * Created on 16-jun-2014, 21:38:19
 */
package widoco.gui;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Daniel Garijo
 */
public class GuiStep3 extends javax.swing.JFrame {
    private final GuiController g;
    private String abstractPath;
    private String introductionPath;
    private String overviewPath;
    private String descriptionPath;
    private String referencesPath;
    /** Creates new form WidocoGui2
     * @param g */
    public GuiStep3(GuiController g) {
        this.g = g;
        initComponents();
        Image l = g.getConfig().getLogo().getScaledInstance(widocoLogo.getWidth(), widocoLogo.getHeight(), Image.SCALE_SMOOTH);
        widocoLogo.setIcon(new ImageIcon(l));
        this.setIconImage(g.getConfig().getLogoMini());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        // Move the window
        this.setLocation(x, y);
        this.labelStatus.setVisible(false);
        this.barStatus.setVisible(false);
        
        /**
         * If some sections exist, they shall be updated here. Namely the paths to the html files
         */
        if(!g.getConfig().isIncludeAbstract())checkBoxAbstract.setSelected(false);
        if(!g.getConfig().isIncludeIntroduction())checkBoxIntro.setSelected(false);
        if(!g.getConfig().isIncludeOverview())checkBoxOverview.setSelected(false);
        if(!g.getConfig().isIncludeDescription())checkBoxDescription.setSelected(false);
        if(!g.getConfig().isIncludeReferences())checkBoxRefs.setSelected(false);
        if(!g.getConfig().isPublishProvenance())checkBoxProv.setSelected(false);
        //if(g.isDiagram())
                        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        textPaneSteps = new javax.swing.JTextPane();
        jSeparator2 = new javax.swing.JSeparator();
        labelTitle = new javax.swing.JLabel();
        labelSteps = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        checkBoxAbstract = new javax.swing.JCheckBox();
        checkBoxIntro = new javax.swing.JCheckBox();
        checkBoxOverview = new javax.swing.JCheckBox();
        checkBoxDescription = new javax.swing.JCheckBox();
        checkBoxRefs = new javax.swing.JCheckBox();
        abstractSectionButton = new javax.swing.JButton();
        introductionSectionButton = new javax.swing.JButton();
        overviewSectionButton = new javax.swing.JButton();
        descriptionSectionButton = new javax.swing.JButton();
        referencesSectionButton = new javax.swing.JButton();
        addImportedOntologiesCheckBox = new javax.swing.JCheckBox();
        checkBoxProv = new javax.swing.JCheckBox();
        labelTitle1 = new javax.swing.JLabel();
        labelLode = new javax.swing.JLabel();
        includeIndividuals = new javax.swing.JCheckBox();
        includeAnnProps = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        w3C = new javax.swing.JRadioButton();
        customRadioButton = new javax.swing.JRadioButton();
        labelDescription = new javax.swing.JLabel();
        widocoLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        labelStatus = new javax.swing.JLabel();
        barStatus = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Step 3: Load the sections");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        nextButton.setText("Generate! >");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        textPaneSteps.setEditable(false);
        textPaneSteps.setContentType("text/html"); // NOI18N
        textPaneSteps.setText("<html>\r\n  <head>\r\n\r\n  </head>\r\n  <body>\r \n1. Select template<br/>       \n2. Load metadata<br/>\n<b>3. Load sections</b><br/>\n4. Finish\n  </body>\r\n</html>\r\n");
        jScrollPane1.setViewportView(textPaneSteps);

        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTitle.setText("Step 3: Load Sections. ");

        labelSteps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelSteps.setText("Steps");

        jPanel1.setPreferredSize(new java.awt.Dimension(360, 205));
        jPanel1.setRequestFocusEnabled(false);

        checkBoxAbstract.setSelected(true);
        checkBoxAbstract.setText("Include Abstract Section");

        checkBoxIntro.setSelected(true);
        checkBoxIntro.setText("Include Introduction Section");

        checkBoxOverview.setSelected(true);
        checkBoxOverview.setText("Include Overview Section");

        checkBoxDescription.setSelected(true);
        checkBoxDescription.setText("Include Description Section");

        checkBoxRefs.setSelected(true);
        checkBoxRefs.setText("Include References Section");

        abstractSectionButton.setText("Load...");
        abstractSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abstractSectionButtonActionPerformed(evt);
            }
        });

        introductionSectionButton.setText("Load...");
        introductionSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                introductionSectionButtonActionPerformed(evt);
            }
        });

        overviewSectionButton.setText("Load...");
        overviewSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overviewSectionButtonActionPerformed(evt);
            }
        });

        descriptionSectionButton.setText("Load...");
        descriptionSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionSectionButtonActionPerformed(evt);
            }
        });

        referencesSectionButton.setText("Load...");
        referencesSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referencesSectionButtonActionPerformed(evt);
            }
        });

        addImportedOntologiesCheckBox.setText("Include documentation for imported ontologies");

        checkBoxProv.setText("Publish the provenance of the vocabulary");

        labelTitle1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTitle1.setText("Powered by");

        labelLode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lode/logomini2.png"))); // NOI18N
        labelLode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelLodeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelLodeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelLodeMouseExited(evt);
            }
        });

        includeIndividuals.setSelected(true);
        includeIndividuals.setText("Include Named Individuals in the document");

        includeAnnProps.setText("Include Annotation Properties in the document");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Style:");

        buttonGroup1.add(w3C);
        w3C.setSelected(true);
        w3C.setText("W3C");

        buttonGroup1.add(customRadioButton);
        customRadioButton.setText("Custom");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkBoxProv, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(addImportedOntologiesCheckBox)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(104, 104, 104))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkBoxRefs)
                                .addComponent(checkBoxDescription)
                                .addComponent(checkBoxOverview)
                                .addComponent(checkBoxIntro)
                                .addComponent(checkBoxAbstract))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(abstractSectionButton)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(introductionSectionButton)
                                        .addComponent(overviewSectionButton)
                                        .addComponent(referencesSectionButton)
                                        .addComponent(descriptionSectionButton))
                                    .addGap(18, 18, 18)
                                    .addComponent(labelLode, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(includeAnnProps)
                            .addComponent(includeIndividuals)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(w3C)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customRadioButton)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxAbstract)
                    .addComponent(abstractSectionButton)
                    .addComponent(labelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBoxIntro)
                            .addComponent(introductionSectionButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkBoxOverview)
                            .addComponent(overviewSectionButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descriptionSectionButton)
                            .addComponent(checkBoxDescription))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(referencesSectionButton)
                            .addComponent(checkBoxRefs)))
                    .addComponent(labelLode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(includeAnnProps)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(includeIndividuals)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addImportedOntologiesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBoxProv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w3C)
                    .addComponent(customRadioButton)
                    .addComponent(jLabel1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        labelDescription.setText("<html>Select the sections you want your document to have.<br/> If you have a section you want to load, click on the \"Load\" button.<br/> The diagram of the ontology will be created on the \"images\" folder of the documentation.</html>");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Select which sections you want your document to have");

        labelStatus.setText("Generating ....");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(widocoLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelSteps, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jSeparator1)
                                            .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 95, Short.MAX_VALUE)))))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(barStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton)
                        .addGap(52, 52, 52)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(widocoLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSteps)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelButton)
                        .addComponent(backButton)
                        .addComponent(nextButton))
                    .addComponent(barStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.saveState();
        g.switchState("back");
    }//GEN-LAST:event_backButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.saveState();
        g.switchState("cancel");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        this.saveState();
        this.barStatus.setVisible(true);
        this.barStatus.setIndeterminate(true);
        this.labelStatus.setVisible(true);
        this.nextButton.setEnabled(false);
        g.switchState("next");
    }//GEN-LAST:event_nextButtonActionPerformed

    private void saveState(){
        g.getConfig().setIncludeAbstract(checkBoxAbstract.isSelected());
        g.getConfig().setAbstractPath(this.abstractPath);
        g.getConfig().setIncludeDescription(checkBoxDescription.isSelected());
        g.getConfig().setDescriptionPath(descriptionPath);
        g.getConfig().setIncludeIntroduction(checkBoxIntro.isSelected());
        g.getConfig().setIntroductionPath(introductionPath);
        g.getConfig().setIncludeOverview(checkBoxOverview.isSelected());
        g.getConfig().setOverviewPath(overviewPath);
        g.getConfig().setPublishProvenance(checkBoxProv.isSelected());
        g.getConfig().setIncludeReferences(checkBoxRefs.isSelected());
        g.getConfig().setReferencesPath(referencesPath);
        g.getConfig().setIncludeNamedIndividuals(includeIndividuals.isSelected());
        g.getConfig().setIncludeAnnotationProperties(includeAnnProps.isSelected());
        g.getConfig().setUseW3CStyle(w3C.isSelected());
        g.getConfig().setUseImported(addImportedOntologiesCheckBox.isSelected());
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.g.switchState("cancel");
    }//GEN-LAST:event_formWindowClosing

    private void labelLodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLodeMouseExited
        setCursor (Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_labelLodeMouseExited

    private void labelLodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLodeMouseEntered
        //        System.out.println("OVER");
        setCursor (Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_labelLodeMouseEntered

    private void labelLodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelLodeMouseClicked
        try {
            g.openBrowser(new URI("https://github.com/essepuntato/LODE"));
        } catch (URISyntaxException ex) {
        }
    }//GEN-LAST:event_labelLodeMouseClicked

    private void referencesSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referencesSectionButtonActionPerformed
        referencesPath = loadSection();
    }//GEN-LAST:event_referencesSectionButtonActionPerformed

    private void descriptionSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionSectionButtonActionPerformed
        descriptionPath = loadSection();
    }//GEN-LAST:event_descriptionSectionButtonActionPerformed

    private void overviewSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overviewSectionButtonActionPerformed
        overviewPath = loadSection();
    }//GEN-LAST:event_overviewSectionButtonActionPerformed

    private void introductionSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_introductionSectionButtonActionPerformed
        introductionPath = loadSection();
    }//GEN-LAST:event_introductionSectionButtonActionPerformed

    private void abstractSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abstractSectionButtonActionPerformed
        abstractPath = loadSection();
    }//GEN-LAST:event_abstractSectionButtonActionPerformed

    private String loadSection(){
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showSaveDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            return chooser.getSelectedFile().getAbsolutePath();
        }
        return null;
    }
    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(GuiStep3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GuiStep3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GuiStep3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GuiStep3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new GuiStep3().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abstractSectionButton;
    private javax.swing.JCheckBox addImportedOntologiesCheckBox;
    private javax.swing.JButton backButton;
    private javax.swing.JProgressBar barStatus;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox checkBoxAbstract;
    private javax.swing.JCheckBox checkBoxDescription;
    private javax.swing.JCheckBox checkBoxIntro;
    private javax.swing.JCheckBox checkBoxOverview;
    private javax.swing.JCheckBox checkBoxProv;
    private javax.swing.JCheckBox checkBoxRefs;
    private javax.swing.JRadioButton customRadioButton;
    private javax.swing.JButton descriptionSectionButton;
    private javax.swing.JCheckBox includeAnnProps;
    private javax.swing.JCheckBox includeIndividuals;
    private javax.swing.JButton introductionSectionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelLode;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel labelSteps;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTitle1;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton overviewSectionButton;
    private javax.swing.JButton referencesSectionButton;
    private javax.swing.JTextPane textPaneSteps;
    private javax.swing.JRadioButton w3C;
    private javax.swing.JLabel widocoLogo;
    // End of variables declaration//GEN-END:variables
}
