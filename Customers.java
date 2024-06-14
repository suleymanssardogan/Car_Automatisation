/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package arabaotomasyon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.sql.PreparedStatement;

/**
 *
 * @author SuleymanSardogan
 */
public class Customers extends javax.swing.JFrame {

    /**
     * Creates new form Customers
     */
    public Customers() {
        initComponents();
        DisplayCustomers();
    }
    Connection connection1 = null;
    Statement statement1 = null;
    ResultSet result_set1 = null;
    private void DisplayCustomers(){
         try{ 
        connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");
        statement1 = connection1.createStatement();
        result_set1 = statement1.executeQuery("select * from customertbl");
        CustomerTable.setModel(DbUtils.resultSetToTableModel(result_set1));
        
          }
       catch(SQLException e){
           e.printStackTrace();
       }
    }
    

   
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CustomerEditButton = new javax.swing.JButton();
        CustomerResetButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        CustomerDeleteButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        CustomerAdressTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerTable = new javax.swing.JTable();
        CustomerPhoneTxt = new javax.swing.JTextField();
        CustomerNameTxt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        RentCar = new javax.swing.JLabel();
        Car = new javax.swing.JLabel();
        LogOut2 = new javax.swing.JLabel();
        ReturnCar = new javax.swing.JLabel();
        CustomerIdTxt = new javax.swing.JTextField();
        CustomerSaveButton = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        CustomerEditButton.setBackground(new java.awt.Color(255, 255, 255));
        CustomerEditButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerEditButton.setForeground(new java.awt.Color(204, 0, 0));
        CustomerEditButton.setText("Edit");
        CustomerEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerEditButtonActionPerformed(evt);
            }
        });

        CustomerResetButton.setBackground(new java.awt.Color(255, 255, 255));
        CustomerResetButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerResetButton.setForeground(new java.awt.Color(204, 0, 0));
        CustomerResetButton.setText("Reset");
        CustomerResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerResetButtonActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("Manage Customers");

        CustomerDeleteButton.setBackground(new java.awt.Color(255, 255, 255));
        CustomerDeleteButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerDeleteButton.setForeground(new java.awt.Color(204, 0, 0));
        CustomerDeleteButton.setText("Delete");
        CustomerDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerDeleteButtonActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 51, 0));
        jLabel14.setText("Adress");

        CustomerAdressTxt.setBackground(new java.awt.Color(255, 255, 255));
        CustomerAdressTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 0, 0));
        jLabel15.setText("Customer  Name");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("Customers List");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("Customer Id");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Phone");

        CustomerTable.setAutoCreateRowSorter(true);
        CustomerTable.setBackground(new java.awt.Color(204, 204, 204));
        CustomerTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        CustomerTable.setForeground(new java.awt.Color(0, 0, 0));
        CustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Customer Id", "Customer Name", "Address", "Phone"
            }
        ));
        CustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CustomerTable);

        CustomerPhoneTxt.setBackground(new java.awt.Color(255, 255, 255));
        CustomerPhoneTxt.setForeground(new java.awt.Color(0, 0, 0));

        CustomerNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        CustomerNameTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("-");

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setForeground(new java.awt.Color(204, 0, 0));

        RentCar.setBackground(new java.awt.Color(204, 0, 0));
        RentCar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RentCar.setForeground(new java.awt.Color(255, 255, 255));
        RentCar.setText("Rent Car");
        RentCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentCarMouseClicked(evt);
            }
        });

        Car.setBackground(new java.awt.Color(204, 0, 0));
        Car.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Car.setForeground(new java.awt.Color(255, 255, 255));
        Car.setText("Cars");
        Car.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarMouseClicked(evt);
            }
        });

        LogOut2.setBackground(new java.awt.Color(204, 0, 0));
        LogOut2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        LogOut2.setForeground(new java.awt.Color(255, 255, 255));
        LogOut2.setText("LogOut");
        LogOut2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOut2MouseClicked(evt);
            }
        });

        ReturnCar.setBackground(new java.awt.Color(204, 0, 0));
        ReturnCar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ReturnCar.setForeground(new java.awt.Color(255, 255, 255));
        ReturnCar.setText("Return Car");
        ReturnCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnCarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Car, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogOut2, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addComponent(RentCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ReturnCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Car, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReturnCar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        CustomerIdTxt.setBackground(new java.awt.Color(255, 255, 255));
        CustomerIdTxt.setForeground(new java.awt.Color(0, 0, 0));

        CustomerSaveButton.setBackground(new java.awt.Color(255, 255, 255));
        CustomerSaveButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CustomerSaveButton.setForeground(new java.awt.Color(204, 0, 0));
        CustomerSaveButton.setText("Save");
        CustomerSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerSaveButtonActionPerformed(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 51, 51));
        jLabel22.setText("X");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(953, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(324, 324, 324)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CustomerIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(CustomerSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(CustomerEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(CustomerDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(45, 45, 45)
                                            .addComponent(CustomerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CustomerAdressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomerPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(CustomerResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(397, 397, 397)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(113, 113, 113)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addContainerGap(638, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(CustomerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomerIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomerPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomerAdressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CustomerSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomerDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomerEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CustomerResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel19))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)))
                    .addContainerGap()))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerSaveButtonActionPerformed
        //Checking missing informaiton
        if(CustomerIdTxt.getText().isEmpty() || CustomerNameTxt.getText().isEmpty() || CustomerAdressTxt.getText().isEmpty() || CustomerPhoneTxt.getText().isEmpty() ){
          JOptionPane.showMessageDialog(this, "Mising Information");
         }
          else{
               try{

                    //Desktop url connection with sql
                    connection1 = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");

                    //sql command for add with insert into
                    PreparedStatement add = connection1.prepareStatement("insert into customertbl values(?,?,?,?)");

                    //assigment parameters
                    add.setString(1,CustomerIdTxt.getText());
                    add.setString(2, CustomerNameTxt.getText());
                    add.setString(3,CustomerAdressTxt.getText());
                    add.setString(4, CustomerPhoneTxt.getText());
                    //execute for keep the memory
                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Customer Added Successfully");
                    DisplayCustomers();
                    Reset();

                    }catch(Exception e){
                         ///print error
                         e.printStackTrace();
                    }
            }
    }//GEN-LAST:event_CustomerSaveButtonActionPerformed
     
        private void Reset()
        {
               CustomerIdTxt.setText("");
               CustomerNameTxt.setText("");
               CustomerAdressTxt.setText("");
               CustomerPhoneTxt.setText("");  
        }
        
    private void CustomerResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerResetButtonActionPerformed
        //call the Reset funcciton to clear
        Reset();
    }//GEN-LAST:event_CustomerResetButtonActionPerformed

    private void CustomerEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerEditButtonActionPerformed
        if(CustomerIdTxt.getText().isEmpty() || CustomerNameTxt.getText().isEmpty() || CustomerAdressTxt.getText().isEmpty() || CustomerPhoneTxt.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "Select the Customer TO Be Updated");
         }
          else{
               try{

                    //Desktop url connection with sql
                    connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");
                    String ıd = CustomerIdTxt.getText();
                    //for edit data command
                    String query ="Update customertbl set CustomerName=?,CustomerAddress=?,CustomerPhone=? where CustomerId=?";
                    PreparedStatement  update = connection1.prepareStatement(query);
                    //like assigment
                    update.setString(1, CustomerNameTxt.getText());
                    update.setString(2, CustomerAdressTxt.getText());
                    update.setString(3,CustomerPhoneTxt.getText());
                    update.setString(4, ıd);
                    
                    
                    //execute for keep the memory
                      int rowsUpdated = update.executeUpdate();
            
                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "Customers Updated Successfully");
                        // Refresh table
                        DisplayCustomers();
                        Reset();
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to update Customer");
                    }
                    
                    

                    }catch(Exception e){
                         ///print error
                         e.printStackTrace();
                    }
            }
    }//GEN-LAST:event_CustomerEditButtonActionPerformed

    private void CustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)CustomerTable.getModel();
       int MyIndex = CustomerTable.getSelectedRow();
       CustomerIdTxt.setText(model.getValueAt(MyIndex,0).toString());
       CustomerNameTxt.setText(model.getValueAt(MyIndex,1).toString());
       CustomerAdressTxt.setText(model.getValueAt(MyIndex,2).toString());
       CustomerPhoneTxt.setText(model.getValueAt(MyIndex,3).toString());
    }//GEN-LAST:event_CustomerTableMouseClicked

    private void CustomerDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerDeleteButtonActionPerformed
       if(CustomerIdTxt.getText().isEmpty()){
           //I control customer ıd becasuse it is a priamry key
           JOptionPane.showMessageDialog(this, "Missing informaiton");
       }else{
           try{
                    //Desktop url connection with sql
                    connection1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");
                    String ıd= CustomerIdTxt.getText();
                    //for delete data command
                    String query = "Delete from customertbl where CustomerId='"+ıd+"'";
                    Statement  delete = connection1.createStatement();
                    //execute for keep the memory
                    delete.executeUpdate(query);
                    JOptionPane.showMessageDialog(this,"Customer Deleted Successfully");
                     //I wanted to show table after delete data
                    DisplayCustomers();
                    Reset();
           }
           catch(SQLException ex){
               ex.printStackTrace();
           }
       }
        
    }//GEN-LAST:event_CustomerDeleteButtonActionPerformed
    //opening cars form
    private void CarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarMouseClicked
      new Cars().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_CarMouseClicked

    private void RentCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentCarMouseClicked
      new Rents().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_RentCarMouseClicked

    private void ReturnCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnCarMouseClicked
      new Returns().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_ReturnCarMouseClicked

    private void LogOut2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut2MouseClicked
      new LogIn().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_LogOut2MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
      System.exit(0);
    }//GEN-LAST:event_jLabel22MouseClicked

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Car;
    private javax.swing.JTextField CustomerAdressTxt;
    private javax.swing.JButton CustomerDeleteButton;
    private javax.swing.JButton CustomerEditButton;
    private javax.swing.JTextField CustomerIdTxt;
    private javax.swing.JTextField CustomerNameTxt;
    private javax.swing.JTextField CustomerPhoneTxt;
    private javax.swing.JButton CustomerResetButton;
    private javax.swing.JButton CustomerSaveButton;
    private javax.swing.JTable CustomerTable;
    private javax.swing.JLabel LogOut2;
    private javax.swing.JLabel RentCar;
    private javax.swing.JLabel ReturnCar;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
