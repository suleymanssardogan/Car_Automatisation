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
import java.util.Date;
import java.awt.print.*;
/**
 *
 * @author SuleymanSardogan
 */
public class Returns extends javax.swing.JFrame {

    /**
     * Creates new form Returns
     */
    public Returns() {
        initComponents();
        DisplayRents();
        DisplayReturn();
        CustomerNameTxt.setEditable(false);
        RegTxt.setEditable(false);
        FineTxt.setEditable(false);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Cars = new javax.swing.JLabel();
        Customer = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        RentCar = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ReturnIdTxt = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ReturnDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        DelayTxt = new javax.swing.JTextField();
        FineTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ReturnBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        RentTable = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ReturnTable = new javax.swing.JTable();
        Generate = new javax.swing.JLabel();
        CustomerNameTxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        RegTxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setForeground(new java.awt.Color(204, 0, 0));

        Cars.setBackground(new java.awt.Color(204, 0, 0));
        Cars.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Cars.setForeground(new java.awt.Color(255, 255, 255));
        Cars.setText("Cars");
        Cars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarsMouseClicked(evt);
            }
        });

        Customer.setBackground(new java.awt.Color(204, 0, 0));
        Customer.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Customer.setForeground(new java.awt.Color(255, 255, 255));
        Customer.setText("Customer ");
        Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerMouseClicked(evt);
            }
        });

        LogOut.setBackground(new java.awt.Color(204, 0, 0));
        LogOut.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        LogOut.setForeground(new java.awt.Color(255, 255, 255));
        LogOut.setText("LogOut");
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });

        RentCar.setBackground(new java.awt.Color(204, 0, 0));
        RentCar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RentCar.setForeground(new java.awt.Color(255, 255, 255));
        RentCar.setText("Rent Car");
        RentCar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentCarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Customer, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(Cars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RentCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cars, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RentCar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 554, Short.MAX_VALUE)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 204, 204));
        jLabel12.setText("Customer Name");

        ReturnIdTxt.setBackground(new java.awt.Color(255, 255, 255));
        ReturnIdTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 204, 204));
        jLabel24.setText("Return Id");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 204, 204));
        jLabel15.setText("Return Date");

        ReturnDate.setBackground(new java.awt.Color(255, 255, 255));
        ReturnDate.setForeground(new java.awt.Color(0, 0, 0));
        ReturnDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 204, 204));
        jLabel13.setText("Delay");

        DelayTxt.setBackground(new java.awt.Color(255, 255, 255));
        DelayTxt.setForeground(new java.awt.Color(0, 0, 0));

        FineTxt.setBackground(new java.awt.Color(255, 255, 255));
        FineTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 204, 204));
        jLabel16.setText("Fine");

        ReturnBtn.setBackground(new java.awt.Color(255, 255, 255));
        ReturnBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ReturnBtn.setForeground(new java.awt.Color(204, 0, 0));
        ReturnBtn.setText("Return");
        ReturnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBtnActionPerformed(evt);
            }
        });

        PrintBtn.setBackground(new java.awt.Color(255, 255, 255));
        PrintBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(204, 0, 0));
        PrintBtn.setText("Print");
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 0, 0));
        jLabel19.setText("Cars On Rent");

        RentTable.setAutoCreateRowSorter(true);
        RentTable.setBackground(new java.awt.Color(204, 204, 204));
        RentTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        RentTable.setForeground(new java.awt.Color(0, 0, 0));
        RentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "RentId", "Registration", "Customer", "RentDate", "ReturnDate", "Fees"
            }
        ));
        RentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(RentTable);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 0, 0));
        jLabel20.setText("Returned Cars");

        ReturnTable.setAutoCreateRowSorter(true);
        ReturnTable.setBackground(new java.awt.Color(204, 204, 204));
        ReturnTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        ReturnTable.setForeground(new java.awt.Color(0, 0, 0));
        ReturnTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ReturnId", "Registration", "Customer", "ReturnDate", "Delay", "Fine"
            }
        ));
        ReturnTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ReturnTable);

        Generate.setBackground(new java.awt.Color(255, 255, 255));
        Generate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Generate.setForeground(new java.awt.Color(0, 204, 204));
        Generate.setText("Generate");
        Generate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GenerateMouseClicked(evt);
            }
        });

        CustomerNameTxt.setBackground(new java.awt.Color(255, 255, 255));
        CustomerNameTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 204, 204));
        jLabel14.setText("Registration");

        RegTxt.setBackground(new java.awt.Color(255, 255, 255));
        RegTxt.setForeground(new java.awt.Color(0, 0, 0));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 51, 51));
        jLabel17.setText("X");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ReturnDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ReturnIdTxt)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ReturnBtn)
                                            .addComponent(FineTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DelayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(7, 7, 7))
                                    .addComponent(RegTxt)
                                    .addComponent(CustomerNameTxt))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(330, 330, 330)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(Generate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(478, 478, 478)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(543, 543, 543)
                        .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ReturnIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(RegTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CustomerNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel20)
                                    .addComponent(ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DelayTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FineTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Generate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(ReturnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PrintBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Connection connection = null;
    Statement statement = null;
    ResultSet result_set = null;
   
//showing rented car
     private void DisplayRents(){        
       try{ 
        connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");
        statement = connection.createStatement();
        result_set = statement.executeQuery("select * from renttbl");
        RentTable.setModel(DbUtils.resultSetToTableModel(result_set));
        
          }
       catch(SQLException e){
           e.printStackTrace();
       }
    }
      private void UpdateCar()
    {
           try{

                    //Desktop url connection with sql
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");
                    String reg = RegTxt.getText();
                    String CarStatus ="Available";
                    //for edit data command
                    String Query ="Update cartbl set status='"+CarStatus+"'where regisNum='"+reg+"'";
                    Statement Add = connection.createStatement();
                    Add.executeUpdate(Query);
                    JOptionPane.showMessageDialog(this, "Car Availabed Succesfully");
                   
                    
                   
                    //PreparedStatement  update = connection.prepareStatement(query);
                    //like assigment
//                    update.setString(3, CarStatus);
//                    
//                    update.setString(4, registration);
//                    
//                    //execute for keep the memory
//                      int rowsUpdated = update.executeUpdate();
//            
//                    if (rowsUpdated > 0) {
//                        JOptionPane.showMessageDialog(this, "Car Updated Successfully");
//                        // Refresh table
//                        DisplayCars();
//                        Reset();
//                    } else {
//                        JOptionPane.showMessageDialog(this, "Failed to update car");
//                    }
                    
                    

                    }catch(Exception e){
                         ///print error
                         e.printStackTrace();
                    }       
    }
      private void RemoveFromRent(){
            try{

                    //Desktop url connection with sql
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");
                    
                    //for delete data command
                    String query = "Delete from renttbl where RentId='"+rid+"'";
                    Statement  delete = connection.createStatement();
                    //execute for keep the memory
                    delete.executeUpdate(query);
                    JOptionPane.showMessageDialog(this,"Car Deleted from rent Successfully");
                    DisplayRents();
                    

                    }catch(Exception e){
                         ///print error
                         e.printStackTrace();
                    }
      }
      
     
     //showing returned cars
     private void DisplayReturn(){
         try{
             connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");
             statement = connection.createStatement();
             result_set = statement.executeQuery("select * from returntbl");
             
             ReturnTable.setModel(DbUtils.resultSetToTableModel(result_set));
             
         }catch(SQLException ex){
             ex.printStackTrace();
         }
     }
     
      java.util.Date d1,today;
      java.util.Date ReturnDate1;
      java.sql.Date MyReturnDate;
    private void ReturnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBtnActionPerformed
        //Checking missing informaiton
        if(ReturnIdTxt.getText().isEmpty() ||  DelayTxt.getText().isEmpty() || FineTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Mising Information");
        }
        else{
            try{
                
                //for returndate
                ReturnDate1 = ReturnDate.getDate();
                MyReturnDate = new java.sql.Date(ReturnDate1.getTime());

                //Desktop url connection with sql
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cardb","root","123456s.");

                //sql command for add with insert into
                PreparedStatement add = connection.prepareStatement("insert into returntbl values(?,?,?,?,?,?)");

                //assigment parameters
                add.setInt(1,Integer.valueOf(ReturnIdTxt.getText()));
                add.setString(2, RegTxt.getText());
                add.setString(3, CustomerNameTxt.getText());  
                add.setDate(4,MyReturnDate );
                add.setInt(5, Integer.valueOf(DelayTxt.getText()));
                add.setInt(6,fine );
                
                //execute for keep the memory
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Car Returned Successfully");
                UpdateCar();
                DisplayReturn();
                RemoveFromRent();
                DisplayRents();
            }catch(Exception e){
                ///print error
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ReturnBtnActionPerformed

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
       try{
            ReturnTable.print();
       }
       catch(Exception ex){
           
       }
       
        
    }//GEN-LAST:event_PrintBtnActionPerformed
    
    int rid;
    private void RentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentTableMouseClicked
        //I did not want to write User.It is like hard to write just click the cars and press delete button puff
        DefaultTableModel model = (DefaultTableModel)RentTable.getModel();
        int MyIndex = RentTable.getSelectedRow();
        RegTxt.setText(model.getValueAt(MyIndex,1).toString());
        CustomerNameTxt.setText(model.getValueAt(MyIndex,2).toString());
        rid =Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        cost = Integer.valueOf(model.getValueAt(MyIndex,5).toString());
        
    }//GEN-LAST:event_RentTableMouseClicked

    private void ReturnTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ReturnTableMouseClicked
     
    int cost =0;
    int fine;
    //if you click generate calculate the peanlty money and print fine textbox
    private void GenerateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GenerateMouseClicked
        /// fine is a penalty money
        if(cost==0){
            JOptionPane.showMessageDialog(this, "Select the car to return");
        }
        else{
             fine = cost*Integer.valueOf(DelayTxt.getText());
            FineTxt.setText("Penalty: "+fine);
        }
    }//GEN-LAST:event_GenerateMouseClicked

    private void CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseClicked
        new Customers().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_CustomerMouseClicked

    private void CarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarsMouseClicked
       new Cars().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_CarsMouseClicked

    private void RentCarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentCarMouseClicked
      new Rents().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_RentCarMouseClicked

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
      new LogIn().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_LogOutMouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Returns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Returns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cars;
    private javax.swing.JLabel Customer;
    private javax.swing.JTextField CustomerNameTxt;
    private javax.swing.JTextField DelayTxt;
    private javax.swing.JTextField FineTxt;
    private javax.swing.JLabel Generate;
    private javax.swing.JLabel LogOut;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField RegTxt;
    private javax.swing.JLabel RentCar;
    private javax.swing.JTable RentTable;
    private javax.swing.JButton ReturnBtn;
    private com.toedter.calendar.JDateChooser ReturnDate;
    private javax.swing.JTextField ReturnIdTxt;
    private javax.swing.JTable ReturnTable;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
