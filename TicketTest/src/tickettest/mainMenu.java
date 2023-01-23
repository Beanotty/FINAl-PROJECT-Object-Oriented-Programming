/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tickettest;

import java.awt.CardLayout;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.plaf.basic.BasicButtonUI;
import java.text.SimpleDateFormat;  
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
/**
 *
 * @author reyza
 */
public class mainMenu extends javax.swing.JFrame {
    
    private String userID;
    Connect con = new Connect ();
    
    CardLayout cardlayout;
    public void SetUserID (String userID){
        this.userID = userID;
    }
    public mainMenu() {
        initComponents();
        tableCheckOut.setVisible(false);
        String query = "SELECT * FROM usertable JOIN ticketdata \r\n " + "ON ticketdata.UserID = usertable.UserId";
        con.executeQuery(query);
      //  autonumber();
        Component [] components = this.getContentPane().getComponents();
        for (Component component : components){
            if (component instanceof JButton){
                ((JButton)component).setUI(new BasicButtonUI());
                ((JButton)component).setFocusPainted(false);
            }
        }
        cardlayout = (CardLayout)(inputPanel.getLayout());
    }
    
    public String autonumber() {
        String newID = "";
        try {

            String query = "SELECT * FROM ticketdata ORDER BY TicketID DESC";
            ResultSet rs = con.executeQuery(query);

            if (rs.next()) {
                String NoID = rs.getString(("TicketID")).substring(1);
                String ID = "" + (Integer.parseInt(NoID) + 1);
                String Zero = "";

                if (ID.length() == 1) {
                    Zero = "000";
                } else if (ID.length() == 2) {
                    Zero = "00";
                } else if (ID.length() == 3) {
                    Zero = "0";
                } else if (ID.length() == 4) {
                    Zero = "";
                }

                newID = "T" + Zero + ID;
            } else {
                newID = "T0001";
            }
            rs.close();
        } catch (Exception e) {
            System.out.println("autonumber error");
            e.printStackTrace();
        }
        return newID;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CategoryButton = new javax.swing.ButtonGroup();
        DestinationButton = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        buttonPanel = new javax.swing.JPanel();
        stopgap = new javax.swing.JPanel();
        buttonLayout = new javax.swing.JPanel();
        btorder = new javax.swing.JButton();
        btCheckOut = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        inputPanel = new javax.swing.JPanel();
        TicketPanel = new javax.swing.JPanel();
        Category = new javax.swing.JPanel();
        Catlabel = new javax.swing.JLabel();
        adultRbutton = new javax.swing.JRadioButton();
        ChildRbutton = new javax.swing.JRadioButton();
        Destination = new javax.swing.JPanel();
        DestinationLabel = new javax.swing.JLabel();
        MuseumButton = new javax.swing.JRadioButton();
        DufanButton = new javax.swing.JRadioButton();
        AquariumButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        DateChoooser = new com.toedter.calendar.JDateChooser();
        Catlabel2 = new javax.swing.JLabel();
        OrderTicket = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        inpamount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CheckOutPanel = new javax.swing.JPanel();
        CheckOut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCheckOut = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        inpTicketID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(960, 720));

        jSplitPane1.setPreferredSize(new java.awt.Dimension(960, 720));

        buttonPanel.setBackground(new java.awt.Color(0, 0, 0));
        buttonPanel.setPreferredSize(new java.awt.Dimension(400, 200));

        stopgap.setBackground(new java.awt.Color(0, 0, 0));
        stopgap.setPreferredSize(new java.awt.Dimension(100, 15));

        javax.swing.GroupLayout stopgapLayout = new javax.swing.GroupLayout(stopgap);
        stopgap.setLayout(stopgapLayout);
        stopgapLayout.setHorizontalGroup(
            stopgapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        stopgapLayout.setVerticalGroup(
            stopgapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        buttonPanel.add(stopgap);

        buttonLayout.setBackground(new java.awt.Color(0, 0, 0));
        buttonLayout.setPreferredSize(new java.awt.Dimension(400, 400));

        btorder.setText("Order Tickets");
        btorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btorderActionPerformed(evt);
            }
        });

        btCheckOut.setText("Check Out Tickets");
        btCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCheckOutActionPerformed(evt);
            }
        });

        LogOut.setText("LogOut");
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonLayoutLayout = new javax.swing.GroupLayout(buttonLayout);
        buttonLayout.setLayout(buttonLayoutLayout);
        buttonLayoutLayout.setHorizontalGroup(
            buttonLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonLayoutLayout.createSequentialGroup()
                .addGroup(buttonLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonLayoutLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(buttonLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btCheckOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btorder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(buttonLayoutLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        buttonLayoutLayout.setVerticalGroup(
            buttonLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonLayoutLayout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(btorder)
                .addGap(18, 18, 18)
                .addComponent(btCheckOut)
                .addGap(59, 59, 59)
                .addComponent(LogOut)
                .addGap(77, 77, 77))
        );

        buttonPanel.add(buttonLayout);

        jSplitPane1.setLeftComponent(buttonPanel);

        inputPanel.setPreferredSize(new java.awt.Dimension(600, 400));
        inputPanel.setLayout(new java.awt.CardLayout());

        TicketPanel.setPreferredSize(new java.awt.Dimension(960, 600));

        Catlabel.setText("Category");
        Category.add(Catlabel);

        CategoryButton.add(adultRbutton);
        adultRbutton.setText("Adult");
        adultRbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adultRbuttonActionPerformed(evt);
            }
        });
        Category.add(adultRbutton);

        CategoryButton.add(ChildRbutton);
        ChildRbutton.setText("Child");
        Category.add(ChildRbutton);

        DestinationLabel.setText("Destination");
        Destination.add(DestinationLabel);

        DestinationButton.add(MuseumButton);
        MuseumButton.setText("Museum");
        MuseumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuseumButtonActionPerformed(evt);
            }
        });
        Destination.add(MuseumButton);

        DestinationButton.add(DufanButton);
        DufanButton.setText("Dufan");
        DufanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DufanButtonActionPerformed(evt);
            }
        });
        Destination.add(DufanButton);

        DestinationButton.add(AquariumButton);
        AquariumButton.setText("Aquarium");
        Destination.add(AquariumButton);

        Catlabel2.setText("Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Catlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DateChoooser, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Catlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateChoooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        OrderTicket.setText("Order Ticket");
        OrderTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderTicketActionPerformed(evt);
            }
        });

        inpamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpamountActionPerformed(evt);
            }
        });

        jLabel2.setText("Amount Of Tickets");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inpamount, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout TicketPanelLayout = new javax.swing.GroupLayout(TicketPanel);
        TicketPanel.setLayout(TicketPanelLayout);
        TicketPanelLayout.setHorizontalGroup(
            TicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketPanelLayout.createSequentialGroup()
                .addGroup(TicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TicketPanelLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(TicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TicketPanelLayout.createSequentialGroup()
                                .addGroup(TicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(TicketPanelLayout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(OrderTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(156, 156, 156))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TicketPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(Destination, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        TicketPanelLayout.setVerticalGroup(
            TicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(Category, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Destination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(OrderTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputPanel.add(TicketPanel, "TicketPanel");

        CheckOutPanel.setPreferredSize(new java.awt.Dimension(960, 540));

        CheckOut.setText("CheckOut");
        CheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckOutActionPerformed(evt);
            }
        });

        tableCheckOut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TicketID", "Destinatinion", "Date", "amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCheckOut);
        if (tableCheckOut.getColumnModel().getColumnCount() > 0) {
            tableCheckOut.getColumnModel().getColumn(0).setResizable(false);
            tableCheckOut.getColumnModel().getColumn(1).setResizable(false);
            tableCheckOut.getColumnModel().getColumn(2).setResizable(false);
            tableCheckOut.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel3.setText("Ticket To Buy");

        inpTicketID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpTicketIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 181, Short.MAX_VALUE))
                    .addComponent(inpTicketID))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inpTicketID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout CheckOutPanelLayout = new javax.swing.GroupLayout(CheckOutPanel);
        CheckOutPanel.setLayout(CheckOutPanelLayout);
        CheckOutPanelLayout.setHorizontalGroup(
            CheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckOutPanelLayout.createSequentialGroup()
                .addGroup(CheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckOutPanelLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(CheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CheckOutPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CheckOutPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        CheckOutPanelLayout.setVerticalGroup(
            CheckOutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckOutPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(CheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        inputPanel.add(CheckOutPanel, "CheckOutPanel");

        jSplitPane1.setRightComponent(inputPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCheckOutActionPerformed
        tableCheckOut.setVisible(true);
        jScrollPane1.setVisible(true);
        DefaultTableModel dtm = (DefaultTableModel) tableCheckOut.getModel();
        dtm.setRowCount(0);
        cardlayout.show (inputPanel, "CheckOutPanel");
        String query = "SELECT * FROM ticketdata WHERE UserID = '"+ userID + "'";
        ResultSet rs = con.executeQuery(query);
        try {
            while (rs.next()){
                String TicketID = rs.getString(2);
                String Destination = rs.getString(3);
                Date date = rs.getDate(4);
                int amount = rs.getInt(6);
                dtm.addRow(new Object[]{TicketID, Destination, date, amount});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btCheckOutActionPerformed

    private void btorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btorderActionPerformed
        cardlayout.show (inputPanel, "TicketPanel");
    }//GEN-LAST:event_btorderActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_LogOutActionPerformed

    private void OrderTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderTicketActionPerformed
        try {
            String TicketID = autonumber();
            String ForeignUserID = userID;
            String Category = "";
            String Destination = "";
            String newString = "";

            Date date;
            int amount;
            
            if (adultRbutton.isSelected()){
                Category = "Adult";
            }
            else if (ChildRbutton.isSelected()){
                Category = "Child";
            }
            
           
            if (DufanButton.isSelected()){
                Destination = "Dunia Fantasi";
            }
            
            else if (MuseumButton.isSelected()){
                Destination = "Museum Macam";
            }
            
            else if (AquariumButton.isSelected()){
                Destination = "Jakarta Aquarium";
            }
            date = DateChoooser.getDate();
            java.sql.Date sqlPackageDate = new java.sql.Date(date.getTime());
            String amountOfTickets = inpamount.getText().toString().trim();
            amount = Integer.parseInt(amountOfTickets);
            
            String query = "INSERT INTO `ticketdata`(`UserID`, `TicketID`, `Destination`, `Date`, `Category`, `amountOfTicket`) "
                + "VALUES (?,?, ?, ?, ?, ?)";
              PreparedStatement masuk = con.prepareStatement(query);
                masuk.setString(1, ForeignUserID);
                masuk.setString(2, TicketID);
                masuk.setString(3, Destination);
                masuk.setDate(4, sqlPackageDate);
                masuk.setString(5, Category);
                masuk.setInt(6, amount);
                masuk.executeUpdate();
                masuk.close();
                CategoryButton.clearSelection();
                DestinationButton.clearSelection();
                DateChoooser.setCalendar(null);
                inpamount.setText("");
        } 
        catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }//GEN-LAST:event_OrderTicketActionPerformed

    private void DufanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DufanButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DufanButtonActionPerformed

    private void MuseumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuseumButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MuseumButtonActionPerformed

    private void inpamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpamountActionPerformed

    private void adultRbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adultRbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adultRbuttonActionPerformed

    private void CheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckOutActionPerformed
        String choice = inpTicketID.getText().toString();
        String query = "SELECT * FROM ticketdata WHERE TicketID = '"+ choice +"'";
        ResultSet rs = con.executeQuery(query);
        int price = 0;
        try {
            if (rs.next()){
                if (rs.getString("Destination").equals("Dunia Fantasi")){
                    price =  250000;
                }
                
                else if (rs.getString("Destination").equals("Museum Macam")){
                    price = 100000;
                }
                
                else if (rs.getString ("Destination").equals("Jakarta Aquarium")){
                    price = 180000;
                }
                
                int finalPrice = price * rs.getInt("amountOfTicket");
                Integer.toString(finalPrice);
                String message = String.format("Your Total Price to %s is Rp%d", rs.getString("Destination"), finalPrice);
                JOptionPane.showMessageDialog(null, message);
                
                rs.close();
                query = "DELETE FROM `ticketdata` WHERE TicketID = '" + choice + "'";
                con.executeUpdate(query);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_CheckOutActionPerformed

    private void inpTicketIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpTicketIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inpTicketIDActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AquariumButton;
    private javax.swing.JPanel Category;
    private javax.swing.ButtonGroup CategoryButton;
    private javax.swing.JLabel Catlabel;
    private javax.swing.JLabel Catlabel2;
    private javax.swing.JButton CheckOut;
    private javax.swing.JPanel CheckOutPanel;
    private javax.swing.JRadioButton ChildRbutton;
    private com.toedter.calendar.JDateChooser DateChoooser;
    private javax.swing.JPanel Destination;
    private javax.swing.ButtonGroup DestinationButton;
    private javax.swing.JLabel DestinationLabel;
    private javax.swing.JRadioButton DufanButton;
    private javax.swing.JButton LogOut;
    private javax.swing.JRadioButton MuseumButton;
    private javax.swing.JButton OrderTicket;
    private javax.swing.JPanel TicketPanel;
    private javax.swing.JRadioButton adultRbutton;
    private javax.swing.JButton btCheckOut;
    private javax.swing.JButton btorder;
    private javax.swing.JPanel buttonLayout;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JTextField inpTicketID;
    private javax.swing.JTextField inpamount;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel stopgap;
    private javax.swing.JTable tableCheckOut;
    // End of variables declaration//GEN-END:variables
}
