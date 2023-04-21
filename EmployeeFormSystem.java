
package employeesystem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import net.proteanit.sql.DbUtils;



public class EmployeeFormSystem extends javax.swing.JFrame {
    
    Connection myconObj = null;
    Statement mystatObj = null;
    ResultSet myresObj = null;

   
    public EmployeeFormSystem() {
        initComponents();
        selectional();
    }

    public void selectional(){
        
        try{
    myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/My Databse","roykie","12345");
    mystatObj = myconObj.createStatement();
    myresObj= mystatObj.executeQuery("Select * from roykie.EmpTable");
    EmpTable1.setModel(DbUtils.resultSetToTableModel(myresObj));
        }
        catch (SQLException e){
        e.printStackTrace();
        }
   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Idtxt = new javax.swing.JTextField();
        Fnametxt = new javax.swing.JTextField();
        Lnametxt = new javax.swing.JTextField();
        Mnametxt = new javax.swing.JTextField();
        Sextxt = new javax.swing.JTextField();
        Bdatetxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        newjbt = new javax.swing.JButton();
        updatejbt = new javax.swing.JButton();
        deletejbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Modern No. 20", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Information System");

        EmpTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp_ID", "F_name", "L_name", "M_name", "Sex", "B_Date", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EmpTable1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee _ID :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Firstname :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lastname :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Middlename :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sex :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Birthdate :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Address :");

        Idtxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Fnametxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Lnametxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Mnametxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Sextxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Bdatetxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        addresstxt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employeesystem/icons8-team-100.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        newjbt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        newjbt.setText("Add");
        newjbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newjbtActionPerformed(evt);
            }
        });

        updatejbt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        updatejbt.setText("Update");
        updatejbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejbtActionPerformed(evt);
            }
        });

        deletejbt.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        deletejbt.setText("Delete");
        deletejbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newjbt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deletejbt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updatejbt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1)
                        .addGap(0, 183, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sextxt, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bdatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Mnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Sextxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Bdatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(newjbt)
                        .addGap(18, 18, 18)
                        .addComponent(updatejbt)))
                .addGap(18, 18, 18)
                .addComponent(deletejbt)
                .addContainerGap())
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

    private void newjbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newjbtActionPerformed
     
        try{
            PreparedStatement add = myconObj.prepareStatement("insert Into roykie.EmpTable values (?,?,?,?,?,?,?) ");
            String Emp_ID = Idtxt.getText();
            String F_name = Fnametxt.getText();
            String L_name = Lnametxt.getText();
            String M_name = Mnametxt.getText();
            String Sex = Sextxt.getText();
            String B_Date = Bdatetxt.getText();
            String Address = addresstxt.getText();
            
            add.setString(1, Emp_ID);
            add.setString(2, F_name);
            add.setString(3, L_name);
            add.setString(4, M_name);
            add.setString(5, Sex);
            add.setString(6, B_Date);
            add.setString(7, Address);
            int row = add.executeUpdate();
           
        }
        catch(SQLException E){
            E.printStackTrace();
        }
        selectional();
    }//GEN-LAST:event_newjbtActionPerformed

    private void updatejbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejbtActionPerformed
      
        try {
         String sql = "Update roykie.EmpTable set F_name = '"+Fnametxt.getText()+"'"+",L_name = '"+Lnametxt.getText()+"'"+",M_name ='"+Mnametxt.getText() +"'"+",Sex = '"+Sextxt.getText()+"'"+",B_Date = '"+Bdatetxt.getText()+"'"+",Address = '"+addresstxt.getText() 
                 +"'"+"where Emp_ID ="+Idtxt.getText(); 
         
         Statement update = myconObj.createStatement();
         update.executeUpdate(sql);
        }
        catch(SQLException E){
        E.printStackTrace();
        }
        selectional();
    }//GEN-LAST:event_updatejbtActionPerformed

    private void deletejbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejbtActionPerformed
     
        try{
            Statement add = myconObj.createStatement();
            String sql = "Delete from roykie.EmpTable where Emp_ID ="+Idtxt.getText();
            add.executeUpdate(sql);
            Idtxt.setText("");
            Fnametxt.setText("");
            Lnametxt.setText("");
            Mnametxt.setText("");
            Sextxt.setText("");
            Bdatetxt.setText("");
            addresstxt.setText("");
        }
        catch (SQLException E){
        E.printStackTrace();
        }
        selectional();
    }//GEN-LAST:event_deletejbtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(EmployeeFormSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeFormSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeFormSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeFormSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
           // public void run() {
              //  JFrame frame = new JFrame();
               // frame.setTitle("Employee Information System");
              //  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              //  new EmployeeFormSystem().setVisible(true);
          //  }
       // } );
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bdatetxt;
    private javax.swing.JTable EmpTable1;
    private javax.swing.JTextField Fnametxt;
    private javax.swing.JTextField Idtxt;
    private javax.swing.JTextField Lnametxt;
    private javax.swing.JTextField Mnametxt;
    private javax.swing.JTextField Sextxt;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JButton deletejbt;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newjbt;
    private javax.swing.JButton updatejbt;
    // End of variables declaration//GEN-END:variables
}
