/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame3.java
 *
 * Created on Oct 23, 2011, 11:01:27 AM
 */

package multiplerouting;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.lang.String;
import java.awt.Button;
import javax.swing.*;
import java.sql.*;
import java.lang.String;
import java.util.ArrayList;

/**
 *
 * @author madhu
 */
public class NewJFrame3 extends javax.swing.JFrame {

    /** Creates new form NewJFrame3 */
    public NewJFrame3() {
        initComponents();
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("SOURCE");

        jLabel2.setText("DESTINATION");

        jButton1.setText("FIND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("cLose");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("PATH");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        String[] str=new String[20];
        Connection con6;
        PreparedStatement ps5;
        int m=1;
        // ResultSet rs;
        try
        {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con6 = DriverManager.getConnection("jdbc:odbc:project","sa","password");
            ps5=con6.prepareStatement("select node from node_details");

            ResultSet rs5=ps5.executeQuery();
            str[0]="SELECT";
            while(rs5.next()){
                str[m]=rs5.getString(1);
                m++;
            }
            jComboBox1=new JComboBox(str);
            ps5.close();
            con6.close();

        }

        catch(Exception e)
        {
            System.out.println( "error" +e);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(174, 174, 174)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(128, 128, 128))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static String temp;
     public String path(String a )
     {
          Connection con1;
    PreparedStatement ps1;
   // ResultSet rs1=null;
    try{
        String s="hi";
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con1= DriverManager.getConnection("jdbc:odbc:project","sa","password");
       ps1=con1.prepareStatement("select node2 from weights_new where weight=(select min(weight)from weights_new where node1=?) and node1=?");

       ps1.setString(1,a);
       ps1.setString(2,a);
       //ps1.executeUpdate("INSERT INTO node_details VALUES('g',1586,250) ");
       ResultSet rs = ps1.executeQuery();
       if(rs.next()){
           temp=rs.getString(1).trim();
           System.out.println(s);
        //  System.out.println(rs.getString(1));
          
       }
 else{
           temp="end";
 }
           
       rs.close();
       con1.close();
        }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    return(temp);
        }



public int count1;
     public int count()
   {
   Connection con2;
   Statement ps1;
    // ResultSet rs;
   try
   {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con2 = DriverManager.getConnection("jdbc:odbc:project","sa","password");
   // ps=con2.prepareStatement("select count(*) from node_details");
ps1=con2.createStatement();

    ResultSet rs1=ps1.executeQuery("select count(*) from node_details");

    if(rs1.next()==true)
    {
        count1 = rs1.getInt(1);
       System.out.println(count1);

       }

    rs1.close();
     ps1.close();
    con2.close();

    }

   catch(Exception e)
         {
             System.out.println( "error" +e);
         }
    return(count1);

}



public void createtable()
    {
     Connection con3;
   Statement ps2;
    // ResultSet rs;
   try
   {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con3 = DriverManager.getConnection("jdbc:odbc:project","sa","password");
   // ps=con2.prepareStatement("select count(*) from node_details");
ps2=con3.createStatement();

    ps2.executeQuery("select * into weights_new from weights");
     ps2.close();
    con3.close();

    }

   catch(Exception e)
         {
             System.out.println( "error" +e);
         }

}

public void delete_table(){
    Connection con4;
   Statement  ps3;
   try
   {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con4 = DriverManager.getConnection("jdbc:odbc:project","sa","password");
ps3=con4.createStatement();

    ps3.executeQuery("drop table weights_new");
     ps3.close();
    con4.close();

    }

   catch(Exception e)
         {
             System.out.println( "error" +e);
         }

}


public void delete_row( String a,String b)
    {
    Connection con5;
   PreparedStatement ps4;
    // ResultSet rs;
   try
   {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con5 = DriverManager.getConnection("jdbc:odbc:project","sa","password");
   ps4=con5.prepareStatement("delete from weights_new where node1=? and node2=?");
   ps4.setString(1,a);
   ps4.setString(2,b);
    ps4.executeQuery();
     ps4.close();
    con5.close();

    }

   catch(Exception e)
         {
             System.out.println( "error" +e);
         }

}


public void combovalues()
    {
        String[] str=new String[20];
         Connection con6;
   PreparedStatement ps5;
   int m=1;
    // ResultSet rs;
   try
   {
       
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con6 = DriverManager.getConnection("jdbc:odbc:project","sa","password");
   ps5=con6.prepareStatement("select node from node_details");

   ResultSet rs5=ps5.executeQuery();
   str[0]="SELECT";
   while(rs5.next()){
       str[m]=rs5.getString(1);
       m++;
   }
   jComboBox1=new JComboBox(str);
     ps5.close();
    con6.close();

    }

   catch(Exception e)
         {
             System.out.println( "error" +e);
         }

System.out.println(str[5]);


    }


public void delete_node(String get )
    {
    Connection con7;
   PreparedStatement ps6;
  try
   {

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con7 = DriverManager.getConnection("jdbc:odbc:project","sa","password");
   ps6=con7.prepareStatement("delete from weights_new where node2=?");
   ps6.setString(1,get);
   ps6.executeQuery();
     ps6.close();
    con7.close();

    }

   catch(Exception e)
         {
             System.out.println( "error" +e);
         }
}



    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
     createtable();
        if(jComboBox1.getSelectedItem()=="SELECT" || jComboBox1.getSelectedItem()=="" )
       {
           System.out.println("default mode");
       }
 else
       {
           String get=(String)jComboBox1.getSelectedItem();
           delete_node(get);
           System.out.println("update successful");
 }
       String a=jTextField1.getText();
       String des=jTextField2.getText();
       int i=0;
       String []array;
array=new String[15];


       temp=a;
       int count=count();
       System.out.println(count);

       do{
       String b=path(temp);
       System.out.println(b);
       array[i]=b.trim();
       System.out.println(array[i]);
       i++;
       System.out.println(i);
       System.out.println(b.length());
       if(b.equals(jTextField2.getText())==true)
       {
           temp="done";
           int j;
           String path=a;
           System.out.println(path);
           for(j=0;j<=(i-1);j++)
           {
               path = path +"-->"+ array[j];
           }
           System.out.println(path);
            jTextArea1.setText("PATH IS " +path);
       }
 else if(b.equals(jTextField1.getText()))
       {
     i=i-1;
      delete_row(array[i-1],array[i]);
      temp=array[i-1];
 }
 else if(array[0]=="end")
       {
      jTextArea1.setText("there is no path");
      temp="end";
 }
 else if(array[i-1]=="end")
       {
      i=i-2;
          if(i==0)
          {
              System.out.println(array[0]);
              delete_row(jTextField1.getText(),array[i]);
            //  System.out.println("execute alternative");
              temp=a;
          }
 else
          {
      delete_row(array[i-1],array[i]);
      temp=array[i-1];
 }

 }
       }while(temp!="end" && temp!="done" && i<count );
      System.out.println(i);
      System.out.println(temp);
     
     /* if(array[i-1]=="end")
      {
          System.out.println("execute alternative");
          i=i-2;
          if(i==0)
          {
              System.out.println(array[0]);
              delete_row(jTextField1.getText(),array[i]);
              System.out.println("execute alternative");
          }*/
 //else if ()        
          

     // }

       delete_table();

    }//GEN-LAST:event_jButton1ActionPerformed


    

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
String str[]={"mon","sun","tue"};
        System.out.println(str[0]);
        jComboBox1=new JComboBox(str);
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
