/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.*;

import static javaapplication2.search.search;
import org.json.simple.parser.ParseException;
/**
 *
 * @author user
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        language = new javax.swing.JComboBox();
        timeFrom = new javax.swing.JSlider();
        timeConstrain = new javax.swing.JCheckBox();
        timeTo = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        FromLabel = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        year = new javax.swing.JComboBox();
        month = new javax.swing.JComboBox();
        day = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        popular = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        region = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 3, 48)); // NOI18N
        jLabel1.setText("Advanced Twitter Search Engine");

        language.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        language.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All Language", "English", "Chinese", "Japanese", "Korean", "Russian", "French", "German" }));

        timeFrom.setMaximum(24);
        timeFrom.setPaintLabels(true);
        timeFrom.setValue(0);
        timeFrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                timeFromMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeFromMouseClicked(evt);
            }
        });

        timeConstrain.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
        timeConstrain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                timeConstrainMouseReleased(evt);
            }
        });
        timeConstrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeConstrainActionPerformed(evt);
            }
        });

        timeTo.setMaximum(24);
        timeTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                timeToMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timeToMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel2.setText("Language：");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel3.setText("Time Constrain：");

        toLabel.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        toLabel.setText("To：");

        FromLabel.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        FromLabel.setText("From：");

        search.setFont(new java.awt.Font("Sitka Heading", 1, 60)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel4.setText("Date：");
        jLabel4.setToolTipText("");

        year.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));

        month.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        day.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel5.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel5.setText("Region:");
        jLabel5.setToolTipText("");

        popular.setFont(new java.awt.Font("宋体", 0, 48)); // NOI18N
        popular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                popularMouseReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel6.setText("Popular:");
        jLabel6.setToolTipText("");

        region.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        region.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All region", "USA", "Canada", "Japan", "Russia", "Korea", "Germany" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FromLabel)
                                    .addComponent(jLabel3)
                                    .addComponent(toLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(timeTo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(timeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(timeConstrain)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(135, 135, 135)
                                .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(popular)
                            .addComponent(region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(676, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(365, 365, 365)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(popular)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(language, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(timeConstrain))
                                .addGap(11, 11, 11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(toLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FromLabel)
                                    .addComponent(timeFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addComponent(timeTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(174, 174, 174)
                    .addComponent(jLabel6)
                    .addContainerGap(273, Short.MAX_VALUE)))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Twitter Search");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeFromMouseClicked
        if(!timeConstrain.isSelected()){
            timeConstrain.setSelected(true);
        }// TODO add your handling code here:
    }//GEN-LAST:event_timeFromMouseClicked

    private void timeToMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeToMouseReleased
        toLabel.setText("To "+Integer.toString(timeTo.getValue())+":00 :");
if(!timeConstrain.isSelected()){
            timeConstrain.setSelected(true);
        }// TODO add your handling code here:
    }//GEN-LAST:event_timeToMouseReleased

    private void timeToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeToMouseClicked
        if(!timeConstrain.isSelected()){
            timeConstrain.setSelected(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_timeToMouseClicked

    private void timeFromMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeFromMouseReleased
        FromLabel.setText("From "+Integer.toString(timeFrom.getValue())+":00 :");
        if(!timeConstrain.isSelected()){
            timeConstrain.setSelected(true);
        }// TODO add your handling code here:
    }//GEN-LAST:event_timeFromMouseReleased

    private void timeConstrainMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeConstrainMouseReleased
        if(!timeConstrain.isSelected()){
            toLabel.setText("To:");
            FromLabel.setText("From:");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_timeConstrainMouseReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String reg=(String)region.getSelectedItem();
        String lang=(String)language.getSelectedItem();
        int timeBegin=0;
        int timeEnd=0;
        
        String result="Result\n\nFrom \tto\n\n";
        result=result+"Among "+lang+" speaker from "+reg+"\n\n The most popular tag is:\n\n";
        String popularTag="";
        try{
        popularTag=search("",0,0,"",0,0);
        }catch(IOException|ParseException e){
            System.out.println(e.getMessage());
        }
        JOptionPane.showMessageDialog(null, result+popularTag);        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void popularMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popularMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_popularMouseReleased

    private void timeConstrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeConstrainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeConstrainActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FromLabel;
    private javax.swing.JComboBox day;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox language;
    private javax.swing.JComboBox month;
    private javax.swing.JCheckBox popular;
    private javax.swing.JComboBox region;
    private javax.swing.JButton search;
    private javax.swing.JCheckBox timeConstrain;
    private javax.swing.JSlider timeFrom;
    private javax.swing.JSlider timeTo;
    private javax.swing.JLabel toLabel;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables
}
