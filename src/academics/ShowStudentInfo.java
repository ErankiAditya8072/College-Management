/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academics;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.net.URL;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Administrator
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
public class ShowStudentInfo extends javax.swing.JFrame {
   String[] columnNames = {"RollNo", "Student Name", "Section", "Year","Branch","Gender","Phoneno"};
    /**
     * Creates new form ShowStudentInfo
     */
    public ShowStudentInfo() throws SQLException {
        initComponents();
        ShowDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column) {
                return false;
            };
            public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
                Component comp = super.prepareRenderer(renderer, row, column);
                Color alternateColor = new Color(255, 255, 255);
                Color whiteColor = Color.WHITE;
                if(!comp.getBackground().equals(getSelectionBackground())) {
                    Color c = (row % 2 == 0 ? alternateColor : whiteColor);
                    comp.setBackground(c);
                    c = null;
                }
                return comp;
            }
        }
        ;
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();

        jPopupMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jPopupMenu1.setBorder(null);
        jPopupMenu1.setPreferredSize(new java.awt.Dimension(86, 35));

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        ImageIcon im=new ImageIcon("academics//delete.png");
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Pictures\\delete.jpg")); // NOI18N
        jMenuItem1.setText("Delete");
        jMenuItem1.setBorder(null);
        jMenuItem1.setContentAreaFilled(false);
        jMenuItem1.setOpaque(true);
        jMenuItem1.setPreferredSize(new java.awt.Dimension(80, 32));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));

        jTextField1.setBackground(new java.awt.Color(240, 248, 255));
        jTextField1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(192, 192, 192));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Search");
        jTextField1.setBorder(null);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("");

        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jTable1.setModel(model
        );
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable1.setOpaque(false);
        jTable1.setSelectionBackground(new java.awt.Color(248, 248, 248));
        jTable1.setRowHeight(30);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setShowGrid(false);
        TableColumnModel columnModel=jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(110);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(70);
        columnModel.getColumn(3).setPreferredWidth(60);
        columnModel.getColumn(4).setPreferredWidth(60);
        columnModel.getColumn(5).setPreferredWidth(60);
        columnModel.getColumn(6).setPreferredWidth(130);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        JTableHeader tableHeader = jTable1.getTableHeader();
        tableHeader.setBackground(new Color(240,248,255));
        tableHeader.setForeground(new Color(0,0,0));
        Font font = new Font("Lucida Sans", Font.PLAIN, 14);
        tableHeader.setFont(font);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        TableCellRenderer rendererFromHeader = jTable1.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        jTable1.setDefaultRenderer(String.class, centerRenderer);

        jButton2.setBackground(new java.awt.Color(25, 25, 112));
        jButton2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Refresh");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(221, 0, 0));
        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusable(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel1.setText("No. of  Students");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(240, 248, 255));
        jTextField2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);

        jTextField3.setText("jTextField3");
        jTextField3.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        setSize(new java.awt.Dimension(717, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel model=new DefaultTableModel(null,columnNames);
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        int i=0;
        model.setRowCount(0);
        String Name=jTextField1.getText();
        System.out.println(Name);
        String query;
        if(Name.contains("WJ1A"))
        {
            query="select * from student where studentname like ? and year='"+FacultyAccess.YEAR+"'and section='"+FacultyAccess.SECTION+"' and branch='"+FacultyAccess.BRANCH+"' order by studentname";
        }
        else
        {
            query="select * from student where Stuname like ? and year='"+FacultyAccess.YEAR+"'and section='"+FacultyAccess.SECTION+"' and branch='"+FacultyAccess.BRANCH+"' order by studentname";
        }
        Connection con= null;
        try {
          
            con=DriverManager.getConnection(Login.urldatabase,Login.useroot,Login.passdatabase);
            PreparedStatement st=con.prepareStatement(query);
            st.setString(1,Name + "%");
            ResultSet rs=st.executeQuery();
            System.out.println("Succesfull reached here");
            while(rs.next())
            {   
                i++;
                String rollno=rs.getString(1);
                String name=rs.getString(2);
                int section =rs.getInt(4);
                int Year=rs.getInt(3);
                String branch=rs.getString(6);
                String Gender=rs.getString(5);
                String phoneno=rs.getString(7);
                model.addRow(new Object[]{rollno,name,section,Year,branch,Gender,phoneno});
                System.out.println("reached end");
                
                
            }
            jTextField2.setText(Integer.toString(i));
            con.close();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ShowStudentInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        FacultyAccess f;
       try {
           f = new FacultyAccess();
           f.setVisible(true);
       } catch (SQLException ex) {
           Logger.getLogger(ShowStudentInfo.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int i=0;
         model.setRowCount(0);
        Connection con = null;
        try {
             String query="select * from student where year='"+FacultyAccess.YEAR+"'and section='"+FacultyAccess.SECTION+"' and branch='"+FacultyAccess.BRANCH+"'order by studentname";
            con=DriverManager.getConnection(Login.urldatabase,Login.useroot,Login.passdatabase);
            Statement statement=con.createStatement();
            ResultSet ra=statement.executeQuery(query);
            while(ra.next())
            {
                  i++;
                String rollno=ra.getString(1);
                String name=ra.getString(2);
                int section =ra.getInt(4);
                int Year=ra.getInt(3);
                String branch=ra.getString(6);
                String Gender=ra.getString(5);
                String phoneno=ra.getString(7);
                model.addRow(new Object[]{rollno,name,section,Year,branch,Gender,phoneno});
                System.out.println("reached end");
                
            }
            jTextField2.setText(Integer.toString(i));
            con.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(ShowStudentInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        if(jTextField1.getText().equals("Search"))
        {
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0,0,0));
            jTextField1.setHorizontalAlignment(JTextField.LEFT);
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        
        if(jTextField1.getText().equals(""))
        {
            jTextField1.setText("Search");
            jTextField1.setForeground(new Color(192,192,192));
            jTextField1.setHorizontalAlignment(JTextField.CENTER);
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here
         if(evt.isPopupTrigger() && jTable1.getSelectedRow() != -1)
        {
            jPopupMenu1.show(evt.getComponent(),evt.getX(),evt.getY());
        }
    }//GEN-LAST:event_jTable1MouseReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
        int selRow =jTable1.getSelectedRow();
        int column = 0;
        String value = jTable1.getModel().getValueAt(selRow, column).toString();
        if (selRow > -1)
        {
            tm.removeRow(selRow);
        }
        Connection con=null;
        try
        {
            String query="delete from student where studentname = ?  order by studentname";
            con=DriverManager.getConnection(Login.urldatabase,Login.useroot,Login.passdatabase);
            PreparedStatement pt=con.prepareStatement(query);
            pt.setString(1,value);
            pt.execute();
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(ShowStudentInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    public  void ShowDetails() throws SQLException
    {   
        model.setRowCount(0);
        int i=0;
        Connection con = null;
        try {
             String query="select * from student where year='"+FacultyAccess.YEAR+"'and section='"+FacultyAccess.SECTION+"' and branch='"+FacultyAccess.BRANCH+"' order by studentname";
            con=DriverManager.getConnection(Login.urldatabase,Login.useroot,Login.passdatabase);
            Statement statement=con.createStatement();
            ResultSet ra=statement.executeQuery(query);
            while(ra.next())
            {
                  i++;
                String rollno=ra.getString(1);
                String name=ra.getString(2);
                int section =ra.getInt(4);
                int Year=ra.getInt(3);
                String branch=ra.getString(6);
                String Gender=ra.getString(5);
                String phoneno=ra.getString(7);
                model.addRow(new Object[]{rollno,name,section,Year,branch,Gender,phoneno});
                System.out.println("reached end");
                
            }
            jTextField2.setText(Integer.toString(i));
            con.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(ShowStudentInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Login.loadingsqldriver();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowStudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowStudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowStudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowStudentInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ShowStudentInfo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ShowStudentInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
