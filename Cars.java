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

public class Cars extends javax.swing.JFrame {
    /**
     * Creates new form Cars
     */
    public Cars() {
        initComponents();
        //for viewing the Cars from table
        DisplayCars();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DeleteBtn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        ModelTxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        CarsTable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        PriceTxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        StatusComboBox = new javax.swing.JComboBox<>();
        BrandTxt = new javax.swing.JTextField();
        SaveBtn = new javax.swing.JButton();
        RegisNumTxt = new javax.swing.JTextField();
        EditBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        ResetBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        RentCar = new javax.swing.JLabel();
        Customers = new javax.swing.JLabel();
        LogOut3 = new javax.swing.JLabel();
        ReturnCar1 = new javax.swing.JLabel();

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 0, 0));
        jLabel24.setText("Cars List");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 204, 204));
        jLabel11.setText("Status");

        DeleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(204, 0, 0));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 204));
        jLabel12.setText("Brand");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 0, 0));
        jLabel16.setText("Cars List");

        ModelTxt.setBackground(new java.awt.Color(255, 255, 255));
        ModelTxt.setForeground(new java.awt.Color(0, 0, 0));

        CarsTable.setAutoCreateRowSorter(true);
        CarsTable.setBackground(new java.awt.Color(204, 204, 204));
        CarsTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        CarsTable.setForeground(new java.awt.Color(0, 0, 0));
        CarsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Registiration", "Brand", "Model", "Status", "Price"
            }
        ));
        CarsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(CarsTable);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 204));
        jLabel13.setText("Price");

        PriceTxt.setBackground(new java.awt.Color(255, 255, 255));
        PriceTxt.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("-");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Model");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("X");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("Manage Cars");

        StatusComboBox.setBackground(new java.awt.Color(255, 255, 255));
        StatusComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StatusComboBox.setForeground(new java.awt.Color(0, 0, 0));
        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", " ", "Available", " " }));

        BrandTxt.setBackground(new java.awt.Color(255, 255, 255));
        BrandTxt.setForeground(new java.awt.Color(0, 0, 0));

        SaveBtn.setBackground(new java.awt.Color(255, 255, 255));
        SaveBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(204, 0, 0));
        SaveBtn.setText("Save");
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });

        RegisNumTxt.setBackground(new java.awt.Color(255, 255, 255));
        RegisNumTxt.setForeground(new java.awt.Color(0, 0, 0));

        EditBtn.setBackground(new java.awt.Color(255, 255, 255));
        EditBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(204, 0, 0));
        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 204));
        jLabel10.setText("Registraiton Number");

        ResetBtn.setBackground(new java.awt.Color(255, 255, 255));
        ResetBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(204, 0, 0));
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 0, 0));

        RentCar.setBackground(new java.awt.Color(255, 0, 0));
        RentCar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RentCar.setForeground(new java.awt.Color(255, 255, 255));
        RentCar.setText("Rent Car");
        RentCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentCarMouseClicked(evt);
            }
        });

        Customers.setBackground(new java.awt.Color(255, 0, 0));
        Customers.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Customers.setForeground(new java.awt.Color(255, 255, 255));
        Customers.setText("Customers");
        Customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomersMouseClicked(evt);
            }
        });

        LogOut3.setBackground(new java.awt.Color(255, 0, 0));
        LogOut3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LogOut3.setForeground(new java.awt.Color(255, 255, 255));
        LogOut3.setText("LogOut");
        LogOut3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOut3MouseClicked(evt);
            }
        });

        ReturnCar1.setBackground(new java.awt.Color(255, 0, 0));
        ReturnCar1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ReturnCar1.setForeground(new java.awt.Color(255, 255, 255));
        ReturnCar1.setText("Return Car");
        ReturnCar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnCar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOut3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReturnCar1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(10, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(RentCar)
                .addGap(18, 18, 18)
                .addComponent(ReturnCar1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(LogOut3)
                .addGap(25, 25, 25))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(163, 163, 163)
                    .addComponent(Customers)
                    .addContainerGap(503, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RegisNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BrandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ModelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(84, 84, 84)
                                                .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(54, 54, 54)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(PriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(363, 363, 363))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StatusComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BrandTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(RegisNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ModelTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel16)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)))
                    .addContainerGap(697, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection connection = null;
    Statement statement = null;
    ResultSet result_set = null;
    //Showing Cars Table
    private void DisplayCars(){    
       try{ 
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");
        statement = connection.createStatement();
        result_set = statement.executeQuery("select * from cartbl");
        CarsTable.setModel(DbUtils.resultSetToTableModel(result_set));
        
          }
       catch(SQLException e){
           e.printStackTrace();
       }
    }
    
    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
       
        //Checking missing informaiton
        if(RegisNumTxt.getText().isEmpty() || BrandTxt.getText().isEmpty() || ModelTxt.getText().isEmpty() || PriceTxt.getText().isEmpty() || StatusComboBox.getSelectedIndex()==-1){
          JOptionPane.showMessageDialog(this, "Mising Information");
         }
          else{
               try{

                    //Desktop url connection with sql
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");

                    //sql command for add with insert into
                    PreparedStatement add = connection.prepareStatement("insert into cartbl values(?,?,?,?,?)");

                    //assigment parameters
                    add.setString(1,RegisNumTxt.getText());
                    add.setString(2, BrandTxt.getText());
                    add.setString(3,ModelTxt.getText());
                    add.setString(4, StatusComboBox.getSelectedItem().toString());
                    add.setInt(5, Integer.valueOf(PriceTxt.getText()));

                    //execute for keep the memory
                    int row = add.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Car Added Successfully");
                    DisplayCars();
                    Reset();

                    }catch(Exception e){
                         ///print error
                         e.printStackTrace();
                    }
            }
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        //We enough just checking Registration Number because is a primar key and everyone has a differtn Registration Nmber
        if(RegisNumTxt.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "Mising Information");
         }
          else{
               try{

                    //Desktop url connection with sql
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");
                    String registration = RegisNumTxt.getText();
                    //for delete data command
                    String query = "Delete from cartbl where regisNum='"+registration+"'";
                    Statement  delete = connection.createStatement();
                    //execute for keep the memory
                    delete.executeUpdate(query);
                    JOptionPane.showMessageDialog(this,"Car Deleted Successfully");
                     //I wanted to show table after delete data
                    DisplayCars();
                    Reset();

                    }catch(Exception e){
                         ///print error
                         e.printStackTrace();
                    }
            }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void CarsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsTableMouseClicked
       //I did not want to write User.It is like hard to write just click the cars and press delete button puff
        DefaultTableModel model = (DefaultTableModel)CarsTable.getModel();
       int MyIndex = CarsTable.getSelectedRow();
       RegisNumTxt.setText(model.getValueAt(MyIndex,0).toString());
       BrandTxt.setText(model.getValueAt(MyIndex,1).toString());
       ModelTxt.setText(model.getValueAt(MyIndex,2).toString());
       StatusComboBox.setSelectedItem(model.getValueAt(MyIndex,3).toString());
       PriceTxt.setText(model.getValueAt(MyIndex,4).toString());
          
    }//GEN-LAST:event_CarsTableMouseClicked

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
         if(RegisNumTxt.getText().isEmpty() || BrandTxt.getText().isEmpty() || ModelTxt.getText().isEmpty() || PriceTxt.getText().isEmpty() || StatusComboBox.getSelectedIndex()==-1){
          JOptionPane.showMessageDialog(this, "Select the Car TO Be Updated");
         }
          else{
               try{

                    //Desktop url connection with sql
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");
                    String registration = RegisNumTxt.getText();
                    //for edit data command
                    String query ="Update cartbl set brand=?,model=?,status=?,price=? where regisNum=?";
                    PreparedStatement  update = connection.prepareStatement(query);
                    //like assigment
                    update.setString(1, BrandTxt.getText());
                    update.setString(2, ModelTxt.getText());
                    update.setString(3, StatusComboBox.getSelectedItem().toString());
                    update.setString(4,PriceTxt.getText());
                    update.setString(5, registration);
                    
                    //execute for keep the memory
                      int rowsUpdated = update.executeUpdate();
            
                    if (rowsUpdated > 0) {
                        JOptionPane.showMessageDialog(this, "Car Updated Successfully");
                        // Refresh table
                        DisplayCars();
                        Reset();
                    } else {
                        JOptionPane.showMessageDialog(this, "Failed to update car");
                    }
                    
                    

                    }catch(Exception e){
                         ///print error
                         e.printStackTrace();
                    }
            }
        
    }//GEN-LAST:event_EditBtnActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void CustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomersMouseClicked
      new Customers().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_CustomersMouseClicked

    private void RentCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentCarMouseClicked
        new Rents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RentCarMouseClicked

    private void LogOut3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOut3MouseClicked
       new LogIn().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_LogOut3MouseClicked

    private void ReturnCar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnCar1MouseClicked
        new Returns().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnCar1MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void Reset()
    {
        //this funciton does clearly everything
        RegisNumTxt.setText("");
        BrandTxt.setText("");
        ModelTxt.setText("");
        StatusComboBox.setSelectedIndex(-1);
        PriceTxt.setText("");


    }
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BrandTxt;
    private javax.swing.JTable CarsTable;
    private javax.swing.JLabel Customers;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel LogOut3;
    private javax.swing.JTextField ModelTxt;
    private javax.swing.JTextField PriceTxt;
    private javax.swing.JTextField RegisNumTxt;
    private javax.swing.JLabel RentCar;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel ReturnCar1;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
