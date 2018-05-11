/*
 *Vilmos Feher
 *Cdcollectionform.java
 *10/05/2018
 */

package cdcollection;
import java.util.*;
/**
 *
 * @author vifeh1685
 */
public class Cdcollectionform extends javax.swing.JFrame {
   /*
    *Creates the arraylist to be used throughout the program
    */
    ArrayList <String> cd= new ArrayList(); 
    
    /**
     * Creates new form Cdcollectionform
     */
    public Cdcollectionform() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputfield = new javax.swing.JTextField();
        displaybutton = new javax.swing.JButton();
        initializebutton = new javax.swing.JButton();
        addbutton = new javax.swing.JButton();
        removebutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputtext = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CD Collection");

        jLabel2.setText("Title- Artist");

        displaybutton.setText("Display");
        displaybutton.setEnabled(false);
        displaybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaybuttonActionPerformed(evt);
            }
        });

        initializebutton.setText("Initialize");
        initializebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initializebuttonActionPerformed(evt);
            }
        });

        addbutton.setText("Add");
        addbutton.setEnabled(false);
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        removebutton.setText("Remove");
        removebutton.setEnabled(false);
        removebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removebuttonActionPerformed(evt);
            }
        });

        outputtext.setColumns(20);
        outputtext.setRows(5);
        jScrollPane2.setViewportView(outputtext);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(inputfield, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(displaybutton)
                        .addGap(18, 18, 18)
                        .addComponent(initializebutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(addbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removebutton)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displaybutton)
                    .addComponent(initializebutton)
                    .addComponent(addbutton)
                    .addComponent(removebutton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        /*
        *Adds new values to the arraylist by taking it from the input field
        */
        cd.add(inputfield.getText());
        Collections.addAll(cd);
    }//GEN-LAST:event_addbuttonActionPerformed

    private void initializebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initializebuttonActionPerformed
        /*
        *Enables all buttons that were already disabled, and adds the new song to
        *the list that already contains some songs
        */
        Collections.addAll(cd, "Health-Bad Boys", "Fornite-Epic Games", "Zedd-Riot");
        initializebutton.setEnabled(false);
        displaybutton.setEnabled(true);
        addbutton.setEnabled(true);
        removebutton.setEnabled(true);
    }//GEN-LAST:event_initializebuttonActionPerformed

    private void displaybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaybuttonActionPerformed
        /*
        *Displays the collection of songs/artists in order they were inputted,
        *then alphabetically
        */
        outputtext.setText("Original Order \n");
        for (int i = 0; i < cd.size(); i++)  {
            outputtext.setText(outputtext.getText() + cd.get(i) + "\n");
             }
        outputtext.setText(outputtext.getText() + "\n Sorted Order \n");
        Collections.sort(cd);
        for(int i=0; i<cd.size(); i++){
            outputtext.setText(outputtext.getText() + cd.get(i) + "\n");
        }
        
    }//GEN-LAST:event_displaybuttonActionPerformed

    private void removebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removebuttonActionPerformed
        /*
        *Removes the song that is written into the input field
        */
        int index;
        index=Collections.binarySearch(cd, inputfield.getText());
        
        if(index>-1)
            cd.remove(inputfield.getText());
        else
            outputtext.setText("CD not found in collection");
             
        
    }//GEN-LAST:event_removebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Cdcollectionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cdcollectionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cdcollectionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cdcollectionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cdcollectionform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton displaybutton;
    private javax.swing.JButton initializebutton;
    private javax.swing.JTextField inputfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outputtext;
    private javax.swing.JButton removebutton;
    // End of variables declaration//GEN-END:variables
}
