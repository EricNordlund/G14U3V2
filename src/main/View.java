
package main;

import java.awt.Color;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 * GUI
 * @author JD-W
 */
public class View extends javax.swing.JFrame {

    Controller controller;
    
    /**
     * Creates new form view
     */
    public View() {
        
        
        initComponents();
        try{
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Changed the theme.
}
catch(Exception e){
        System.out.println("UIManager Exception : "+e);
}
        UIDefaults defaults = UIManager.getLookAndFeelDefaults();
defaults.put("Button.focus", new ColorUIResource(new Color(0, 0, 0, 0)));
        
        
        
    }
    
    public void setController(Controller controller)
    {
        this.controller = controller;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customers = new javax.swing.JPanel();
        excelCustomers = new javax.swing.JButton();
        wordCustomers = new javax.swing.JButton();
        accessCustomers = new javax.swing.JButton();
        employees = new javax.swing.JPanel();
        excelEmployees = new javax.swing.JButton();
        wordEmployees = new javax.swing.JButton();
        accessEmployees = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronus Report Viewer");

        customers.setBorder(javax.swing.BorderFactory.createTitledBorder("Customers"));

        excelCustomers.setText("Excel");
        excelCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelCustomersActionPerformed(evt);
            }
        });

        wordCustomers.setText("Word");
        wordCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordCustomersActionPerformed(evt);
            }
        });

        accessCustomers.setText("Access");
        accessCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessCustomersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout customersLayout = new javax.swing.GroupLayout(customers);
        customers.setLayout(customersLayout);
        customersLayout.setHorizontalGroup(
            customersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(excelCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
            .addComponent(wordCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(accessCustomers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        customersLayout.setVerticalGroup(
            customersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customersLayout.createSequentialGroup()
                .addComponent(excelCustomers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wordCustomers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accessCustomers)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        employees.setBorder(javax.swing.BorderFactory.createTitledBorder("Employees"));
        employees.setPreferredSize(new java.awt.Dimension(140, 23));

        excelEmployees.setText("Excel");
        excelEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelEmployeesActionPerformed(evt);
            }
        });

        wordEmployees.setText("Word");
        wordEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordEmployeesActionPerformed(evt);
            }
        });

        accessEmployees.setText("Access");
        accessEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accessEmployeesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout employeesLayout = new javax.swing.GroupLayout(employees);
        employees.setLayout(employeesLayout);
        employeesLayout.setHorizontalGroup(
            employeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(excelEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
            .addComponent(wordEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(accessEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        employeesLayout.setVerticalGroup(
            employeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeesLayout.createSequentialGroup()
                .addComponent(excelEmployees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wordEmployees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accessEmployees)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(customers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employees, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void excelCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelCustomersActionPerformed
        controller.openFile("ExcelCustomers.xlsx");
    }//GEN-LAST:event_excelCustomersActionPerformed

    private void wordCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordCustomersActionPerformed
        controller.openFile("WordCustomers.docx");
    }//GEN-LAST:event_wordCustomersActionPerformed

    private void accessCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessCustomersActionPerformed
        controller.openFile("AccessCustomers.mar");
    }//GEN-LAST:event_accessCustomersActionPerformed

    private void excelEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelEmployeesActionPerformed
        controller.openFile("ExcelEmployees.xlsx");
    }//GEN-LAST:event_excelEmployeesActionPerformed

    private void wordEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordEmployeesActionPerformed
        controller.openFile("WordEmployees.docx");
    }//GEN-LAST:event_wordEmployeesActionPerformed

    private void accessEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessEmployeesActionPerformed
        controller.openFile("AccessEmployees.mar");
    }//GEN-LAST:event_accessEmployeesActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accessCustomers;
    private javax.swing.JButton accessEmployees;
    private javax.swing.JPanel customers;
    private javax.swing.JPanel employees;
    private javax.swing.JButton excelCustomers;
    private javax.swing.JButton excelEmployees;
    private javax.swing.JButton wordCustomers;
    private javax.swing.JButton wordEmployees;
    // End of variables declaration//GEN-END:variables
}
