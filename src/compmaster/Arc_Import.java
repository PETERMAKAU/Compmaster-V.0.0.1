/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compmaster;

import static compmaster.Arc_Import.conn;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

import static jdk.nashorn.internal.objects.Global.print;
import static sun.misc.Version.print;
import java.lang.*;
import java.io.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.UUID;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ButtonModel;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import net.proteanit.sql.DbUtils;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;
import test.CustomOutputStream;
/**
 *
 * @author peter
 */

 class Compmaster_Loop implements Runnable{
     
     private Thread PROGRESS_THREAD;
    private int PROGRESS_VALUE;     
    static Connection conn = null;
    static ResultSet rs = null;  
    static String str_global_count="0%";
    String chandata_loop="";
    int used_inserted_status=0;
    PreparedStatement pst = null;
  
    int array_size_for_size_store=0;
      ArrayList<String> data; 
     ArrayList<String> data0; 
     ArrayList<String> data3;
     ArrayList<String> data4;
     ArrayList<String> data1;
     ArrayList<String> data2;
     ArrayList<String> data5;
     ArrayList<String> data6;
     ArrayList<String> data7;
     ArrayList<String> data8;     
     ArrayList<String> data9;
     ArrayList<String> data10;
     ArrayList<String> data11;     
     ArrayList<String> data12;     
     ArrayList<String> data13;
     ArrayList<String> data14;
     ArrayList<String> data15;     
     ArrayList<String> size_store;
     ArrayList<String> data_chabdata_count;
     ArrayList<String> data_used_only_xx;
     ArrayList<String> data_used_only_indices;     
     String str_pos_counter_1="";
     int  int_array_size_for_used=0;    
     int int_positon_to_insert=0;
    String pathxx="";
    int cnt = 0;
    int loop_id =0;
    int arc_format_number=0;
    int row_number=0;
    int used_chennel_count=0;
    String row_of_rows="";
    String line;     
    int leng=0;
     private PrintStream standardOut;
     String str_random = "",temp_chandata="";
    String lastFiveDigits="";
    String str_chan_name="";
    double fl_row_number,fl_cnt,per_pr; 
    String str_data_1_index_1="",str_data_2_index_2="",str_data_3_index_3="",str_data_4_index_4="", str_asset_outer_body="", str_pos_counter_compound="";
    int end_used_only=0;
    String used_index="n/a";
    String var1x="",var2x="",var3x="",var4x="",var5x="",var6x="",var7x="",var8x="",var9x="",var10x="",var11x="",var12x="";
    String var13x="",var14x="",var15x="",var16x="",var17x="",var18x="",var19x="",var20x="",var21x="",var22x="",var23x="",var24x="",var25x="",var26x="",var27x="",var28x="",var29x="",var30x="",var31x="",var32x="",var33x="",var34x="";
    String str_asset_def_body="n/a",str_row_1_or_0="",old_str_asset_def_body="n/a",str_chandata_code="n/a", str_chandata="n/a", str_asset_number="n/a", str_asset_body="n/a", str_asset_status="n/a",str_pos_counter="n/a";
     // int countxx=7;
    @Override
    public void run(){
        conn = mysqlconnect.ConnectDb();
   /* for(int doc=1; doc<= 100000;doc++){
      System.out.println("@@Extracting Document"+doc+" --Hot");
   
    };*/
        
                                 data = new ArrayList<String>(); 
                                 data11 = new ArrayList<String>(); 
                                 size_store= new ArrayList<String>(); 
                                 data_chabdata_count= new ArrayList<String>();
                                 data_used_only_xx= new ArrayList<String>();
                                 data_used_only_indices= new ArrayList<String>();
                                 used_inserted_status=0;
                              //  List<Integer> myArrayList = new ArrayList<>(100);                           
                                  used_chennel_count=0;
                         
                               Arc_Import mainClass = new Arc_Import();                 
                               mainClass.UpdateJTable();
                               pathxx= mainClass.pathx;
                              // String pathx="C:\\Users\\peter\\Desktop\\COMPMASTER_INPUT_SOURCE\\Compensation\\001-N-K-P-A-H-39033.arc";
                         
                         if (pathxx.equals("Path")||pathxx.equals(null)){
                             JOptionPane.showMessageDialog(null, "Path field empty!");
                         }else{
                             clearx();
                             clearx2();
                             clear_col_size();
                              
                             count_chandata_types();
                              for(int i =0; i<data_chabdata_count.size(); i++)
                                     {
                                     countLines();
                                     chandata_loop=data_chabdata_count.get(i);
                                     insert_table_transition();
                                     if(!chandata_loop.equals("")){
                                     insert_used_only();                                   
                                     insert_multiple_pockets();
                                     clear_arrays();
                                    }else{
                                     JOptionPane.showMessageDialog(null, "No viable data to  render!.");
                                     }
                                     
                                     }
                             }
       // JOptionPane.showMessageDialog(null, loop1x.isAlive());
    }
    static void check_thread_is_running(){
     Runnable r = new Compmaster_Loop ();
        Thread loop1x = new Thread(r);
     //  loop1x.start();
        JOptionPane.showMessageDialog(null, loop1x.isAlive());
        System.out.println(loop1x.isAlive());
    }
    ////////////functions//////////////
    private void insert_data(){
        
        if(str_chandata.equals(chandata_loop)){
    String sql = "insert into tbl_chandata (chandata_code, chandata, asset_number, str_asset_body,str_def_asset_body, asset_status,pos_counter) values(?, ?, ?, ?, ?, ?, ?) ";
       
        try{
            pst = conn.prepareStatement(sql);            
            pst.setString(1, str_chandata_code);
            pst.setString(2, str_chandata);
            pst.setString(3, str_asset_number);       
            pst.setString(4, str_asset_body);  
            pst.setString(5, str_asset_def_body); 
            pst.setString(6, str_asset_status);
            pst.setString(7, str_pos_counter);
         
           

            pst.execute();  
            //JOptionPane.showMessageDialog(null, "Patient Registered");
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }   
        
        }   
   } 
     public int countLines(){
     row_number=0;
     cnt=0;
    String filename=pathxx;
    try{
    
    LineNumberReader reader  = new LineNumberReader(new FileReader(filename));

String lineRead = "";
while ((lineRead = reader.readLine()) != null) {}

cnt = reader.getLineNumber(); 
String cnt2 =""+cnt;
//JOptionPane.showMessageDialog(null, cnt2);
reader.close();

    }catch (Exception e) {
    }
    
    return cnt;
}
    private void clearx2() {
        
         String sql = " delete from  tbl_processed_table where id > ?";
        //String sql = "TRUNCATE TABLE tbl_chandata";
         
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "0");            
            pst.execute();
           // JOptionPane.showMessageDialog(null, "Drug Deleted");
          
            
        }
        catch (Exception e){
            //JOptionPane.showMessageDialog(null, e);        
        }
        // Arc_Import mainClass = new Arc_Import();                 
        // mainClass.UpdateJTable();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void clearx() {
        
         String sql = " delete from tbl_chandata where id > ?";
        //String sql = "TRUNCATE TABLE tbl_chandata";
         
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "0");            
            pst.execute();
           // JOptionPane.showMessageDialog(null, "Drug Deleted");
          
            
        }
        catch (Exception e){
            //JOptionPane.showMessageDialog(null, e);        
        }
        // Arc_Import mainClass = new Arc_Import();                 
        // mainClass.UpdateJTable();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean insert_used_only() {
       // array_size_for_size_store=7;
        end_used_only =0;
        loop_id=1;
        reset_dble();
         try{        
         String pxx=pathxx;     
         FileReader fileReader = new FileReader(pathxx);
         try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      //String line;
         while((line = bufferedReader.readLine()) != null) {
          //normalize_line();
        //ggg
                str_asset_def_body="";
                row_number=row_number+1;
               // System.out.println(row_number);   
                fl_row_number = (double) row_number;
                fl_cnt = (double) cnt;         
                per_pr=  (fl_row_number/(fl_cnt))*100;  
                per_pr=per_pr/2;
                DecimalFormat d_per_pr = new DecimalFormat("##.00000");
                String str_per_pr =d_per_pr.format(per_pr);
                String str_per =per_pr+" %";
               // row_of_rows = "[ "+row_number+" of "+cnt+" ] [ "+ str_per_pr +" %"+" ]";   
                row_of_rows = "[ "+data_chabdata_count.size()+" CHANNELS "+" ] [ "+ str_per_pr +" %"+" ]";
               // here
         ////////////////////////////
                String input = line;     //input string
                String firstFourChars = "";
                String first6Char = "";
                   /////////////////////////////////////
              if (input.length() > 8) 
              {
              firstFourChars = input.substring(0, 8);
              } 
              else
              {
               firstFourChars = input;
               } 
        ////////////////////////////////////////////
         /////////////////////////////////////
              if (input.length() > 6) 
              {
               first6Char = input.substring(0, 6);
              } 
              else
              {
               first6Char = input;
              } 
        //////////////////////////////////
          ////////////////////////////////////////////
      //  System.out.println(line +"   "+row_of_rows);  
                str_global_count="["+chandata_loop+"]"+""+row_of_rows;
         System.out.println("["+chandata_loop+"]"+""+row_of_rows); 
              if(firstFourChars.equals("CHANDATA") || first6Char.equals("N20070")  ){
              if(firstFourChars.equals("CHANDATA")){
            // txt_percentage.setText("0.00");
                str_chandata_code = UUID.randomUUID().toString();
                str_chandata_code = str_chandata_code.substring(0, 8);
                str_chandata=line;
                str_asset_number="-";
                str_asset_body="-";
                str_asset_def_body="-";
                str_asset_status="-";
                str_pos_counter="-";                 
                  ///////////////filter multiple blank chandata(1) entries//////////////////////                 
                     ///////////////filter multiple blank chandata(1) entries//////////////////////
                 try{
             String sql ="Select asset_number from tbl_chandata ORDER BY id DESC LIMIT 1";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();    
            if (rs.next()) {
            String empty_det = rs.getString("asset_number");        
            if (empty_det.equals("-")){        
            }else{            
                  insert_data();
            }
    
       }
     
    //SqliteDataTable.setModel(DbUtils.resultSetToTableModel(rs));    
}
     catch (Exception e){
     JOptionPane.showMessageDialog(null, e);
     }
                 ////////////////end filter multiple blank chandata(1) entries///////////////
                    
                 
                 ////////////////end filter multiple blank chandata(1) entries///////////////
                    
                    
              // System.out.println(line +"   "+row_of_rows);         
               //insert_data();
                 }else{
                  normalize_line();  
                 str_asset_number=first6Char; 
               
                 try{
                   
                 str_asset_body = line.substring(line.indexOf(" ") + 1, line.indexOf("=")); 
                
                 str_asset_status = line.substring(line.lastIndexOf("=") + 1);
                 //error_body before [
                 str_asset_def_body =  str_asset_body.substring(0, str_asset_body.indexOf("["));
               
                 str_pos_counter = str_asset_body.substring(str_asset_body.indexOf("[") + 1, str_asset_body.indexOf("]"));
                 str_pos_counter = str_pos_counter.replaceAll("[^0-9]", "");
                // System.out.println(line +"   "+row_of_rows); 
                 
                 ////////////////////////Filter repetition////////////////////////////////////////////
                    Statement stmt2;
                    int int_str_pos_counter=0;
                    int int_str_asset_status=0;
                    int int_str_pos_counter_1=0;
                    
                    stmt2= conn.createStatement();
                    String sql112="Select * from tbl_chandata WHERE chandata = '" + str_chandata + "' AND str_asset_body = '" + str_asset_body + "'";
                   // String sql112="Select * from tbl_chandata WHERE str_asset_body = '" + str_asset_body + "'";
                   // String sql112="Select * from tbl_chandata WHERE chandata = '" + str_chandata + "' AND str_asset_body = '" + str_asset_body + "'";
                    rs=stmt2.executeQuery(sql112);
                    if(rs.next()){
                    // System.out.println("repetition--"); 
                   // return;
                    }else{
                        int_str_asset_status=Integer.parseInt(str_asset_status);
                        //////////////////let pos start from zero//////////////////////
                        if(!str_asset_body.contains("$MA_IS_ROT_AX")){
                            
                        int_str_pos_counter = Integer.parseInt(str_pos_counter);
                        int_str_pos_counter=int_str_pos_counter+1;
                         int_str_pos_counter_1=int_str_pos_counter-1;
                        str_pos_counter=int_str_pos_counter+"";
                        str_pos_counter_1=int_str_pos_counter_1+"";
                        }
                        ////////////////////////////////////
                        if(int_str_asset_status!=0){
                        insert_data();
                        //////////check body repetion/////////////
                        
                    stmt2= conn.createStatement();
                    String sql_rep="Select * from tbl_processed_table where col1 = '" + str_asset_body + "'";
                    rs=stmt2.executeQuery(sql_rep);
                    if(rs.next()){
                     System.out.println(""); 
                   // return;
                    }else{
                       //////////end check body repetion/////////////
                        if(!old_str_asset_def_body.equals("n/a")){
                         if(old_str_asset_def_body.equals(str_asset_def_body)){
                            old_str_asset_def_body =str_asset_def_body;
                         ///////////add data to arraylist////////////
                            if(str_chandata.equals(chandata_loop)){
                        data_used_only_xx.add(str_asset_status);
                        data_used_only_indices.add("("+str_pos_counter_1+")");
                        size_store.add(str_pos_counter);
                            }
                        ////////////end add data to arraylist//////////////
                        }else{
                             //////////used chahhel loop finished insert////////////
                          insert_used_values_row();
                         //return true;
                            
                        }
                         }else{
                            old_str_asset_def_body =str_asset_def_body;
                           if(str_chandata.equals(chandata_loop)){
                        data_used_only_xx.add(str_asset_status);
                         data_used_only_indices.add("("+str_pos_counter_1+")");
                        size_store.add(str_pos_counter);
                            }
                            }
                        ////////////////
                       }
                        }
                       
                        
                         
                    }
                    
                    
                  ////////////////////////////////////////////////////
                    
                 }catch(Exception e){
                 
                 }
               //  Arc_Import mainClass = new Arc_Import();                 
               //  mainClass.UpdateJTable();
                 reset_dble();
                 }
       // timer_way();
        
        }else{
               //used_index=old_str_asset_def_body;
              // old_str_asset_def_body="n/a";
               
                if(end_used_only==0 && old_str_asset_def_body.equals("$MC_AXCONF_MACHAX_USED")){
                used_chennel_count=data_used_only_xx.size();
                if(str_chandata.equals(chandata_loop)){
                    
                    insert_used_values_row();
                          
                           
                 }
              
               }
           
           }   
        
      }
      
    }
    }catch(Exception e){}
         
        reset_dble(); 
       if(used_inserted_status==0){
              insert_used_values_row();
                         
                           
       }
        initialise_the_other_arraylista();
       
        int_array_size_for_used=size_store.size();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }
    private void reset_dble() {
        
                double fl_row_number = 0.0;
                double  fl_cnt = 0.0;        
                double per_pr=  0.0; 
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_array() {
        leng = data.size();
      
      
        
     if(leng > 0){
        String sql = "insert into tbl_processed_table(col1, col2, col3, col4,col5,col6, col7, col8, col9,col10,col11, col12,col13, col14, col15,col16, col17, col18, col19,col20,col21, col22, col23, col24,col25,col26, col27, col28, col29, col30) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
       // String //sql = "INSERT INTO nameTable (name) values (?)";
  
    try {
       pst = conn.prepareStatement(sql);
       
       
 
    String[] stringArray = data.toArray(new String[data.size()]);
    // if(str_chandata.equals(chandata_loop)){
                  var1x=old_str_asset_def_body; 
                 // if(leng == leng){
                  if(leng == used_chennel_count){
                  try {    var2x=stringArray[0]; } catch (IndexOutOfBoundsException e) { var2x=""; }
                  try {    var3x=stringArray[1]; } catch (IndexOutOfBoundsException e) { var3x=""; }
                  try {    var4x=stringArray[2]; } catch (IndexOutOfBoundsException e) { var4x=""; }
                  try {    var5x=stringArray[3]; } catch (IndexOutOfBoundsException e) { var5x=""; }
                  try {    var6x=stringArray[4]; } catch (IndexOutOfBoundsException e) { var6x=""; }
                  try {    var7x=stringArray[5]; } catch (IndexOutOfBoundsException e) { var7x=""; }
                  try {    var8x=stringArray[6]; } catch (IndexOutOfBoundsException e) { var8x=""; }
                  try {    var9x=stringArray[7]; } catch (IndexOutOfBoundsException e) { var9x=""; }
                  try {    var10x=stringArray[8]; } catch (IndexOutOfBoundsException e) { var10x=""; }
                  try {    var11x=stringArray[9]; } catch (IndexOutOfBoundsException e) { var11x=""; }
                  try {    var12x=stringArray[10]; } catch (IndexOutOfBoundsException e) { var12x=""; }                  
                  try {    var13x=stringArray[11]; } catch (IndexOutOfBoundsException e) { var13x=""; }
                  try {    var14x=stringArray[12]; } catch (IndexOutOfBoundsException e) { var14x=""; }
                  try {    var15x=stringArray[13]; } catch (IndexOutOfBoundsException e) { var15x=""; }
                   try {    var16x=stringArray[14]; } catch (IndexOutOfBoundsException e) { var16x=""; }
                  try {    var17x=stringArray[15]; } catch (IndexOutOfBoundsException e) { var17x=""; }
                  try {    var18x=stringArray[16]; } catch (IndexOutOfBoundsException e) { var18x=""; }
                  try {    var19x=stringArray[17]; } catch (IndexOutOfBoundsException e) { var19x=""; }
                  try {    var20x=stringArray[18]; } catch (IndexOutOfBoundsException e) { var20x=""; }
                  try {    var21x=stringArray[19]; } catch (IndexOutOfBoundsException e) { var21x=""; }
                  try {    var22x=stringArray[20]; } catch (IndexOutOfBoundsException e) { var22x=""; }
                  try {    var23x=stringArray[21]; } catch (IndexOutOfBoundsException e) { var23x=""; }
                  try {    var24x=stringArray[22]; } catch (IndexOutOfBoundsException e) { var24x=""; }                  
                  try {    var25x=stringArray[23]; } catch (IndexOutOfBoundsException e) { var25x=""; }
                  try {    var26x=stringArray[24]; } catch (IndexOutOfBoundsException e) { var26x=""; }
                  try {    var27x=stringArray[25]; } catch (IndexOutOfBoundsException e) { var27x=""; }
                  try {    var28x=stringArray[26]; } catch (IndexOutOfBoundsException e) { var28x=""; }
                  try {    var29x=stringArray[27]; } catch (IndexOutOfBoundsException e) { var29x=""; }
                  try {    var30x=stringArray[28]; } catch (IndexOutOfBoundsException e) { var30x=""; }
                   /*try {    var31x=stringArray[28]; } catch (IndexOutOfBoundsException e) { var31x=""; }
                  try {    var32x=stringArray[29]; } catch (IndexOutOfBoundsException e) { var32x=""; }
                  try {    var33x=stringArray[30]; } catch (IndexOutOfBoundsException e) { var33x=""; }*/
                  
                  
            pst.setString(1, var1x);
            pst.setString(2, var2x);
            pst.setString(3, var3x);       
            pst.setString(4, var4x);  
            pst.setString(5, var5x); 
            pst.setString(6, var6x);
            pst.setString(7, var7x);
            pst.setString(8, var8x);
            pst.setString(9, var9x);
            pst.setString(10, var10x);       
            pst.setString(11, var11x);  
            pst.setString(12, var12x);             
            pst.setString(13, var13x);       
            pst.setString(14, var14x);  
            pst.setString(15, var15x); 
            pst.setString(16, var16x);
            pst.setString(17, var17x);
            pst.setString(18, var18x);
            pst.setString(19, var19x);
            pst.setString(20, var20x);       
            pst.setString(21, var21x);  
            pst.setString(22, var22x);             
            pst.setString(23, var23x);
            pst.setString(24, var24x);
            pst.setString(25, var25x);
            pst.setString(26, var26x);       
            pst.setString(27, var27x);  
            pst.setString(28, var28x); 
            pst.setString(29, var29x); 
            pst.setString(30, chandata_loop); 
         
           

            pst.execute();  
      
         pst.close();         
         data.clear();
                  
                  
                }else{
                  
                 // var2x="";
                  }
             
            
          
         
         old_str_asset_def_body="n/a";
       // conn.close();
    } catch (SQLException ex) {
        System.err.println("Error = " + ex);
    }
     
     }
     data.clear();
     end_used_only =1;
     old_str_asset_def_body="n/a";
     if(!old_str_asset_def_body.equals(str_asset_def_body) && loop_id==2){
     data.add(str_asset_status);
     }
  
    }
    private void insert_array_2() {
        leng = data.size();
      
      
        
     if(leng > 0){
        String sql = "insert into tbl_processed_table(col1, col2, col3, col4,col5,col6, col7, col8, col9,col10,col11, col12,col13, col14, col15,col16, col17, col18, col19,col20,col21, col22, col23, col24,col25,col26, col27, col28, col29, col30) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
       // String //sql = "INSERT INTO nameTable (name) values (?)";
  
    try {
       pst = conn.prepareStatement(sql);
       
       
 
    String[] stringArray = data.toArray(new String[data.size()]);
    // if(str_chandata.equals(chandata_loop)){
                  var1x=old_str_asset_def_body; 
                 // if(leng == leng){
                  if(leng == used_chennel_count){
                  try {    var2x=stringArray[0]; } catch (IndexOutOfBoundsException e) { var2x=""; }
                  try {    var3x=stringArray[1]; } catch (IndexOutOfBoundsException e) { var3x=""; }
                  try {    var4x=stringArray[2]; } catch (IndexOutOfBoundsException e) { var4x=""; }
                  try {    var5x=stringArray[3]; } catch (IndexOutOfBoundsException e) { var5x=""; }
                  try {    var6x=stringArray[4]; } catch (IndexOutOfBoundsException e) { var6x=""; }
                  try {    var7x=stringArray[5]; } catch (IndexOutOfBoundsException e) { var7x=""; }
                  try {    var8x=stringArray[6]; } catch (IndexOutOfBoundsException e) { var8x=""; }
                  try {    var9x=stringArray[7]; } catch (IndexOutOfBoundsException e) { var9x=""; }
                  try {    var10x=stringArray[8]; } catch (IndexOutOfBoundsException e) { var10x=""; }
                  try {    var11x=stringArray[9]; } catch (IndexOutOfBoundsException e) { var11x=""; }
                  try {    var12x=stringArray[10]; } catch (IndexOutOfBoundsException e) { var12x=""; }                  
                  try {    var13x=stringArray[11]; } catch (IndexOutOfBoundsException e) { var13x=""; }
                  try {    var14x=stringArray[12]; } catch (IndexOutOfBoundsException e) { var14x=""; }
                  try {    var15x=stringArray[13]; } catch (IndexOutOfBoundsException e) { var15x=""; }
                   try {    var16x=stringArray[14]; } catch (IndexOutOfBoundsException e) { var16x=""; }
                  try {    var17x=stringArray[15]; } catch (IndexOutOfBoundsException e) { var17x=""; }
                  try {    var18x=stringArray[16]; } catch (IndexOutOfBoundsException e) { var18x=""; }
                  try {    var19x=stringArray[17]; } catch (IndexOutOfBoundsException e) { var19x=""; }
                  try {    var20x=stringArray[18]; } catch (IndexOutOfBoundsException e) { var20x=""; }
                  try {    var21x=stringArray[19]; } catch (IndexOutOfBoundsException e) { var21x=""; }
                  try {    var22x=stringArray[20]; } catch (IndexOutOfBoundsException e) { var22x=""; }
                  try {    var23x=stringArray[21]; } catch (IndexOutOfBoundsException e) { var23x=""; }
                  try {    var24x=stringArray[22]; } catch (IndexOutOfBoundsException e) { var24x=""; }                  
                  try {    var25x=stringArray[23]; } catch (IndexOutOfBoundsException e) { var25x=""; }
                  try {    var26x=stringArray[24]; } catch (IndexOutOfBoundsException e) { var26x=""; }
                  try {    var27x=stringArray[25]; } catch (IndexOutOfBoundsException e) { var27x=""; }
                  try {    var28x=stringArray[26]; } catch (IndexOutOfBoundsException e) { var28x=""; }
                  try {    var29x=stringArray[27]; } catch (IndexOutOfBoundsException e) { var29x=""; }
                  try {    var30x=stringArray[28]; } catch (IndexOutOfBoundsException e) { var30x=""; }
                   /*try {    var31x=stringArray[28]; } catch (IndexOutOfBoundsException e) { var31x=""; }
                  try {    var32x=stringArray[29]; } catch (IndexOutOfBoundsException e) { var32x=""; }
                  try {    var33x=stringArray[30]; } catch (IndexOutOfBoundsException e) { var33x=""; }*/
                  
                  
            pst.setString(1, var1x);
            pst.setString(2, var2x);
            pst.setString(3, var3x);       
            pst.setString(4, var4x);  
            pst.setString(5, var5x); 
            pst.setString(6, var6x);
            pst.setString(7, var7x);
            pst.setString(8, var8x);
            pst.setString(9, var9x);
            pst.setString(10, var10x);       
            pst.setString(11, var11x);  
            pst.setString(12, var12x);             
            pst.setString(13, var13x);       
            pst.setString(14, var14x);  
            pst.setString(15, var15x); 
            pst.setString(16, var16x);
            pst.setString(17, var17x);
            pst.setString(18, var18x);
            pst.setString(19, var19x);
            pst.setString(20, var20x);       
            pst.setString(21, var21x);  
            pst.setString(22, var22x);             
            pst.setString(23, var23x);
            pst.setString(24, var24x);
            pst.setString(25, var25x);
            pst.setString(26, var26x);       
            pst.setString(27, var27x);  
            pst.setString(28, var28x); 
            pst.setString(29, var29x); 
            pst.setString(30, ""); 
         
           

            pst.execute();  
      
         pst.close();         
         data.clear();
                  
                  
                }else{
                  
                 // var2x="";
                  }
             
            
          
         
         old_str_asset_def_body="n/a";
       // conn.close();
    } catch (SQLException ex) {
        System.err.println("Error = " + ex);
    }
     
     }
     data.clear();
     end_used_only =1;
     old_str_asset_def_body="n/a";
     if(!old_str_asset_def_body.equals(str_asset_def_body) && loop_id==2){
     data.add(str_asset_status);
     }
  
    }
    private void adda_data_to_arra() {
        
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void normalize_line(){
    if (line.length() > 5) 
     {
    lastFiveDigits = line.substring(line.length() - 5);
    if(lastFiveDigits.contains("'")){
      arc_format_number=2;
      line=line.substring(0, line.length() - 6);
      
    }else{
      arc_format_number=1;
      line=line;
    }
    } 
    else
    {
   lastFiveDigits  = line;
    }
    }
    private void insert_multiple_pockets() {        
           reset_dble();
         try{        
         String pxx=pathxx;     
        FileReader fileReader = new FileReader(pathxx);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
        //String line;
        while((line = bufferedReader.readLine()) != null) {     
            
                 str_asset_def_body="";
                 row_number=row_number+1;        
               // System.out.println(row_number);   
                 fl_row_number = (double) row_number;
                 fl_cnt = (double) cnt;         
                 per_pr=  (fl_row_number/(fl_cnt))*100;  
                  
                 per_pr=per_pr/2;
                ////////////////convert to 4 decpoints////////////////////
                DecimalFormat d_per_pr = new DecimalFormat("##.00000");
                String str_per_pr =d_per_pr.format(per_pr);
                String str_per =per_pr+" %";
               int integerpp = (int) Math.round(per_pr);
               // str_global_count=integerpp+" %";
                //row_of_rows = "[ "+row_number+" of "+cnt+" ] [ "+ str_per_pr +" %"+" ]";   
                row_of_rows = "[ "+data_chabdata_count.size()+" CHANNELS "+" ] [ "+ str_per_pr +" %"+" ]";
             //  str_global_count=row_of_rows;
              ////////////////////////////
                String input = line;     //input string
                String first8Chars = "";
                String first6Char = "";
                   /////////////////////////////////////
              if (input.length() > 8) 
              {
              first8Chars = input.substring(0, 8);
              } 
              else
              {
               first8Chars = input;
               } 
        ////////////////////////////////////////////
         /////////////////////////////////////
              if (input.length() > 6) 
              {
               first6Char = input.substring(0, 6);
              } 
              else
              {
               first6Char = input;
              } 
              str_global_count="["+chandata_loop+"]"+""+row_of_rows;
         System.out.println("["+chandata_loop+"]"+""+row_of_rows); 
         
          ////////////////////////////////////////////
      //  System.out.println(line +"   "+row_of_rows);  
           if(      
                   first8Chars.equals("CHANDATA")                 
                   || first6Char.equals("N31000")//
                   || first6Char.equals("N37100")///
                   || first6Char.equals("N30200")//                  
                   || first6Char.equals("N32700")///
                   || first6Char.equals("N36100")
                   || first6Char.equals("N36110")
                   || first6Char.equals("N32710") 
                   
                   || first6Char.equals("N10002")
                   || first6Char.equals("N10000")
                   || first6Char.equals("N30300")   
                   || first6Char.equals("N18342")
                   ){
               
                if(first8Chars.equals("CHANDATA")){
            // txt_percentage.setText("0.00");
                str_chandata_code = UUID.randomUUID().toString();
                str_chandata_code = str_chandata_code.substring(0, 8);
                str_chandata=line;
                str_asset_number="-";
                str_asset_body="-";
                str_asset_def_body="-";
                 str_asset_status="-";
                 str_pos_counter="-";
                ///////////////filter multiple blank chandata(1) entries//////////////////////
                 try{
             String sql ="Select asset_number from tbl_chandata ORDER BY id DESC LIMIT 1";
             pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();    
             if (rs.next()) {
             String empty_det = rs.getString("asset_number");        
             if (empty_det.equals("-")){        
             }else{
             insert_data();
             }    
       }
     
    //SqliteDataTable.setModel(DbUtils.resultSetToTableModel(rs));    
}
     catch (Exception e){
     JOptionPane.showMessageDialog(null, e);
     }                 ////////////////end filter multiple blank chandata(1) entries///////////////
                 
              // System.out.println(line +"   "+row_of_rows);         
              
                 }else{  
                    normalize_line();
                 str_asset_number=first6Char; 
                 try{                   
                
                 // str_asset_outer_body = line.substring(line.indexOf(" ") + 1, line.indexOf("'")); 
                 // str_asset_outer_body =str_asset_outer_body.replaceAll("\\s","");
                   //str_asset_body = str_asset_outer_body.substring(0, str_asset_outer_body.indexOf("=")); 
                 // str_error_body_f_ = str_chandata_code.substring(0, 8);
                  str_asset_body = line.substring(line.indexOf("$") + 1, line.indexOf("="));
                  str_asset_body ="$"+str_asset_body;
                 str_asset_status = line.substring(line.lastIndexOf("=") + 1);
                 str_asset_def_body =  str_asset_body.substring(0, str_asset_body.indexOf("["));
                 //str_pos_counter = str_asset_body.substring(line.indexOf("[") + 1, line.indexOf("]"));
                 str_pos_counter_compound = str_asset_body.substring(str_asset_body.indexOf("[") + 1, str_asset_body.indexOf("]"));
                 if(str_asset_def_body.equals("$MA_GANTRY_AXIS_TYPE")
                    || str_asset_def_body.equals("$MA_NUM_ENCS")
                    ||str_asset_def_body.equals("$MA_POS_LIMIT_MINUS")
                    ||str_asset_def_body.equals("$MA_POS_LIMIT_PLUS")
                    ||str_asset_def_body.equals("$MA_CEC_ENABLE") 
                    ||str_asset_def_body.equals("$MA_IS_ROT_AX")
                    
                     //$MN_AXCONF_LOGIC_MACHAX_TAB  $MN_AXCONF_MACHAX_NAME_TAB  $MA_IS_ROT_AX  $MN_MM_CEC_MAX_POINTS    
                    ){
                 str_pos_counter = str_pos_counter_compound.replaceAll("[^0-9]", "");
                     
                 }else if(str_asset_def_body.equals("$MN_AXCONF_LOGIC_MACHAX_TAB")
                    ||str_asset_def_body.equals("$MN_AXCONF_MACHAX_NAME_TAB")                   
                    ||str_asset_def_body.equals("$MN_MM_CEC_MAX_POINTS"))
                 {
                 str_pos_counter = str_pos_counter_compound.replaceAll("[^0-9]", "");
                 int int_pos = Integer.parseInt(str_pos_counter)+1;
                 str_pos_counter=int_pos+"";
                 
                 }else{
                   str_row_1_or_0=str_asset_body.substring(str_asset_body.indexOf("[") + 1, str_asset_body.indexOf(",")); 
                   str_pos_counter=str_asset_body.substring(str_asset_body.indexOf(",") + 1, str_asset_body.indexOf("]")); 
                   str_pos_counter = str_pos_counter.replaceAll("[^0-9]", "");
                   str_row_1_or_0 = str_row_1_or_0.replaceAll("[^0-9]", "");
                  // int_str_pos_counter=Integer.parseInt(str_pos_counter);
                   if(str_asset_def_body.equals("$MA_ENC_IS_LINEAR") && str_row_1_or_0.equals("0") ){
                   str_asset_def_body="$MA_ENC_IS_LINEAR[0]";
                   }else if(str_asset_def_body.equals("$MA_ENC_IS_LINEAR") && str_row_1_or_0.equals("1")){
                   str_asset_def_body="$MA_ENC_IS_LINEAR[1]";
                   }else if(str_asset_def_body.equals("$MA_ENC_COMP_ENABLE") && str_row_1_or_0.equals("0") ){
                   str_asset_def_body="$MA_ENC_COMP_ENABLE[0]";
                   }else if(str_asset_def_body.equals("$MA_ENC_COMP_ENABLE") && str_row_1_or_0.equals("1") ){
                  str_asset_def_body="$MA_ENC_COMP_ENABLE[1]";
                   }                   
                   else{
                   
                   }
                 }
                 
                 
                 
                 
                // System.out.println(line +"   "+row_of_rows); 
                 
                  
                 ////////////////////////Filter repetition////////////////////////////////////////////
                    Statement stmt2;
                    stmt2= conn.createStatement();
                    String sql112="Select * from tbl_chandata WHERE chandata = '" + chandata_loop + "' AND str_asset_body = '" + str_asset_body + "'";
                    rs=stmt2.executeQuery(sql112);
                    if(rs.next()){
                     //System.out.println("repetition--"); 
                   // return;
                    }else{
                        //////////////////let pos start from zero//////////////////////
                       /* if(!str_asset_body.contains("$MA_IS_ROT_AX")){
                            
                        int int_str_pos_counter = Integer.parseInt(str_pos_counter);
                        int_str_pos_counter=int_str_pos_counter+1;
                        str_pos_counter=int_str_pos_counter+"";
                        }*/
                        //////////////////end//////////////////
                        
                        //////////////////filter entry to align with used channels///////////////////
                         Statement stmt22;
                         String par ="$MC_AXCONF_MACHAX_USED";
                    stmt22= conn.createStatement();
                    String sql1122="Select * from tbl_chandata where str_asset_body LIKE '%"+par+"%' and  pos_counter = '" + str_pos_counter + "'";
                    rs=stmt2.executeQuery(sql1122);
                    if(rs.next()){
                                         insert_data();
                        
                           
                                
                                      loop_id=3;
                                         if(str_asset_def_body.equals("$MA_CEC_ENABLE"))
                                        {                                       
                                        //data1.add(str_asset_status);   
                                            
                                            if(str_chandata.equals(chandata_loop)){
                                                check_position_to_insert();
                                               data0.set(int_positon_to_insert, str_asset_status);
                                                data10.set(int_positon_to_insert, str_asset_status);
                                             }
                                            
                                            
                                        }
                                        if(str_asset_def_body.equals("$MA_ENC_IS_LINEAR[0]"))
                                        {                                       
                                                if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data1.set(int_positon_to_insert, str_asset_status);

                                                }
                                            
                                        }
                                        else if(str_asset_def_body.equals("$MA_ENC_IS_LINEAR[1]")){
                                        //data2.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                         data2.set(int_positon_to_insert, str_asset_status);
                                                }
                                           
                                        }
                                        else if(str_asset_def_body.equals("$MA_GANTRY_AXIS_TYPE")){
                                       // data3.add(str_asset_status);
                                            if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data3.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        else if(str_asset_def_body.equals("$MA_NUM_ENCS")){
                                            if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                         data4.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                      // .set(5,"newString"); 
                                        }
                                        else if(str_asset_def_body.equals("$MA_ENC_COMP_ENABLE[0]")){
                                        //data5.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                      data5.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        else if(str_asset_def_body.equals("$MA_ENC_COMP_ENABLE[1]")){
                                       // data6.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                          data6.set(int_positon_to_insert, str_asset_status);
                                                          data9.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        else if(str_asset_def_body.equals("$MA_POS_LIMIT_MINUS")){
                                       // data7.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data7.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        else if(str_asset_def_body.equals("$MA_POS_LIMIT_PLUS")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data8.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        //////////////////////////last loop////////////////////
                                        else if(str_asset_def_body.equals("$MN_AXCONF_LOGIC_MACHAX_TAB")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data12.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        
                                         else if(str_asset_def_body.equals("$MN_AXCONF_MACHAX_NAME_TAB")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data13.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                          else if(str_asset_def_body.equals("$MA_IS_ROT_AX")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data14.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                           else if(str_asset_def_body.equals("$MN_MM_CEC_MAX_POINTS")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data15.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////last loop////////////////////////////
                                        else{
                                             // old_str_asset_def_body =str_asset_def_body;
                                           // old_str_asset_def_body="";
                                           // old_str_asset_def_body =str_asset_def_body;
                                            //////////check whether Arraylist is less than usedChanels///////////////////
                                            
                                           //////////end check whether Arraylist is less than usedChanels///////////////////

                                             }
                          
                        
                       
                    }     
                       // old_str_asset_def_body =str_asset_def_body;
                    }
                     
                  ////////////////////end repetition////////////////////////////////
                    
                 }catch(Exception e){
                 
                 }
                 
                 }
       // timer_way();
        
        }    
        
      }
      reset_dble();
    }
    }catch(Exception e){}    
         
         finish_loops();
      
          Arc_Import mainClass = new Arc_Import(); 
        mainClass.update_table_2();
          mainClass.stop_timer();
      
         reset_varaiables();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        
      // 
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_0() {
        old_str_asset_def_body="$MA_CEC_ENABLE";
       // data.clear();
        data=data0;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_1() {
        old_str_asset_def_body="$MA_ENC_IS_LINEAR[0]";
       // data.clear();
        data=data1;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_2() {
        old_str_asset_def_body="$MA_ENC_IS_LINEAR[1]";
       // data.clear();
        data=data2;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_3() {
        old_str_asset_def_body="$MA_GANTRY_AXIS_TYPE";
        
      //  data.clear();
        data=data3;
        insert_array();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_4() {
        old_str_asset_def_body="$MA_NUM_ENCS";
       // data.clear();
        data=data4;
        insert_array();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_5() {
        old_str_asset_def_body="$MA_ENC_COMP_ENABLE[0]";
       // data.clear();
        data=data5;
        insert_array();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_6() {
        old_str_asset_def_body="$MA_ENC_COMP_ENABLE[1]";
      //  data.clear();
        data=data6;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 private void insert_7() {
        old_str_asset_def_body="$MA_POS_LIMIT_MINUS";
      //  data.clear();
        data=data7;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  private void insert_8() {
        old_str_asset_def_body="$MA_POS_LIMIT_PLUS";
      //  data.clear();
        data=data8;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   private void insert_9() {
        old_str_asset_def_body="ENC Axis Comp active";
      //  data.clear();
        data=data9;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_10() {
        old_str_asset_def_body="CEC Axis Comp active";
      //  data.clear();
        data=data10;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //$MN_AXCONF_LOGIC_MACHAX_TAB  $MN_AXCONF_MACHAX_NAME_TAB  $MA_IS_ROT_AX  $MN_MM_CEC_MAX_POINTS
    private void insert_12() {
        old_str_asset_def_body="$MN_AXCONF_LOGIC_MACHAX_TAB";
      //  data.clear();
        data=data12;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_13() {
        old_str_asset_def_body="$MN_AXCONF_MACHAX_NAME_TAB";
      //  data.clear();
        data=data13;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_14() {
        old_str_asset_def_body="$MA_IS_ROT_AX";
      //  data.clear();
        data=data14;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_15() {
        old_str_asset_def_body="$MN_MM_CEC_MAX_POINTS";
      //  data.clear();
        data=data15;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void finish_loops() {
                                insert_12();
                               insert_13();
                               insert_14();
                               insert_15();
                               insert_0();
                               insert_1();
                               insert_2();
                               insert_3();
                               insert_4();
                               insert_5();
                               insert_6();
                               insert_7();
                               insert_8();
                               insert_9();
                               insert_10();
                               
                                
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_column_size() {
       
       
       String col_size=data_used_only_xx.size()+"";
       String sql = "insert into tbl_col_size(count) values(?) ";
     
        try{
            pst = conn.prepareStatement(sql);            
            pst.setString(1, col_size);
           
            pst.execute();  
            //JOptionPane.showMessageDialog(null, "Patient Registered");
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }  
        loop_id=0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void clear_col_size() {
        String sql = " delete from tbl_col_size where Id > ?";
        //String sql = "TRUNCATE TABLE tbl_chandata";
         
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "0");            
            pst.execute();    
        }
        catch (Exception e){//JOptionPane.showMessageDialog(null, e);        
        }
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void reset_varaiables() {        
    //non_zero_columns=0;
   // pathxx="";
   cnt = 0;
   loop_id =0;
   arc_format_number=0;
   row_number=0;
   used_chennel_count=0;
   row_of_rows="";    
   leng=0;
   str_random = "";
   lastFiveDigits="";
   fl_row_number=0;fl_cnt=0;per_pr=0; 
   str_data_1_index_1="";str_data_2_index_2="";str_data_3_index_3="";str_data_4_index_4=""; str_asset_outer_body=""; str_pos_counter_compound="";
   end_used_only=0;
   used_index="n/a";
   var1x="";var2x="";var3x="";var4x="";var5x="";var6x="";var7x="";var8x="";var9x="";var10x="";var11x="";var12x="";
   var13x="";var14x="";var15x="";var16x="";var17x="";var18x="";var19x="";var20x="";var21x="";var22x="";var23x="";var24x="";var25x="";var26x="";var27x="";var28x="";var29x="";var30x="";var31x="";var32x="";var33x="";var34x="";
   str_asset_def_body="n/a";str_row_1_or_0="";old_str_asset_def_body="n/a";str_chandata_code="n/a"; str_chandata="n/a"; str_asset_number="n/a"; str_asset_body="n/a"; str_asset_status="n/a";str_pos_counter="n/a";
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void initialise_the_other_arraylista() {
                                    int_array_size_for_used=size_store.size();
                                    data0 = new ArrayList<String>(int_array_size_for_used);
                                data1 = new ArrayList<String>(int_array_size_for_used);
                                 data2 = new ArrayList<String>(int_array_size_for_used);
                                 data3 = new ArrayList<String>(int_array_size_for_used);
                                 data4 = new ArrayList<String>(int_array_size_for_used);
                                 data5 = new ArrayList<String>(int_array_size_for_used);
                                 data6 = new ArrayList<String>(int_array_size_for_used);
                                 data7 = new ArrayList<String>(int_array_size_for_used);
                                 data8 = new ArrayList<String>(int_array_size_for_used);
                                 data9 = new ArrayList<String>(int_array_size_for_used);
                                 data10 = new ArrayList<String>(int_array_size_for_used);
                                 
                                 data12 = new ArrayList<String>(int_array_size_for_used);
                                 data13 = new ArrayList<String>(int_array_size_for_used);
                                  data14 = new ArrayList<String>(int_array_size_for_used);
                                 data15 = new ArrayList<String>(int_array_size_for_used);
                                 
                                 for (int i = 0; i <= int_array_size_for_used-1; i = i+1) {
                                     int bb =i;
                                     data0.add("");
                                         data1.add("");
                                         data2.add("");
                                         data3.add("");
                                         data4.add("");
                                         data5.add("");
                                         data6.add("");
                                         data7.add("");
                                         data8.add("");
                                         data9.add("");
                                         data10.add("");
                                         
                                         data12.add("");
                                         data13.add("");
                                         data14.add("");
                                         data15.add("");
                                            }
                                 int cc=data5.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void check_position_to_insert() {
        //herer
       int_positon_to_insert= size_store.indexOf(str_pos_counter);
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private boolean count_chandata_types() {
        
       clear_tbl_chan_name();
         try{        
        // String pxx=pathxx;  
            // pathxx="C:\\Users\\peter\\Desktop\\COMPMASTER_INPUT_SOURCE\\Compensation\\001-N-K-P-A-H-39033.arc";
         FileReader fileReader = new FileReader(pathxx);
                try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {      
         while((line = bufferedReader.readLine()) != null) {       
                str_asset_def_body="";
                row_number=row_number+1;
               // System.out.println(row_number);   
                fl_row_number = (double) row_number;
                fl_cnt = (double) cnt;         
                per_pr=  (fl_row_number/(fl_cnt))*100;  
                per_pr=per_pr/2;
                DecimalFormat d_per_pr = new DecimalFormat("##.00000");
                String str_per_pr =d_per_pr.format(per_pr);
                String str_per =per_pr+" %";
              
                row_of_rows = "[ "+data_chabdata_count.size()+" CHANNELS "+" ] [ "+ str_per_pr +" %"+" ]";
                String input = line;     //input string
                String firstFourChars = "";
                String first20Char = "";
                   /////////////////////////////////////
              if (input.length() > 8) 
              {
              firstFourChars = input.substring(0, 8);
              } 
              else
              {
               firstFourChars = input;
               } 
       
              if (input.length() > 20) 
              {
               first20Char = input.substring(0, 20);
              } 
              else
              {
               first20Char = input;
              } 
            
              if(firstFourChars.equals("CHANDATA") || first20Char.equals("N20000 $MC_CHAN_NAME") ){
                str_chandata_code = UUID.randomUUID().toString();
                str_chandata_code = str_chandata_code.substring(0, 8);
                str_chandata=line;
                str_asset_number="-";
                str_asset_body="-";
                str_asset_def_body="-";
                str_asset_status="-";
                str_pos_counter="-"; 
                str_chandata=str_chandata.replaceAll("\\s","");
                if(firstFourChars.equals("CHANDATA")){
                data_chabdata_count.add(str_chandata);
                temp_chandata=str_chandata;
                }
                
               // data_chabdata_count.add(str_chandata);
                
                 for(int i=0; i<data_chabdata_count.size()-1; i++) {
                 data_chabdata_count.subList(i+1, data_chabdata_count.size()).removeIf(data_chabdata_count.get(i)::equals);
                                                                    }
                 
                 int lengthxx =data_chabdata_count.size();
                 int lengthxxx =data_chabdata_count.size();
                 
                if(first20Char.equals("N20000 $MC_CHAN_NAME")){
                    normalize_line();
                   String chan_name=line.substring(line.lastIndexOf("=") + 1);
                   chan_name = chan_name.replaceAll("[^a-zA-Z0-9]", "");
                   ///////////////////start check chan name repetition/////////////////////////
                    Statement stmt2;
                    stmt2= conn.createStatement();                
                    String sql112="Select * from tbl_channel_names WHERE chandata = '" +  temp_chandata + "' AND chan_name = '" + chan_name + "'";
                    rs=stmt2.executeQuery(sql112);
                    if(rs.next()){
                    // System.out.println("repetition--"); 
                   // return;
                    }else{
                   /////////////////////start insert chan name////////////////////////////
                   String sql = "insert into tbl_channel_names (chandata, chan_name) values(?, ?) ";
                   try{
                                pst = conn.prepareStatement(sql);            
                                pst.setString(1, temp_chandata);
                                pst.setString(2, chan_name);
                                pst.execute();  
                                //JOptionPane.showMessageDialog(null, "Patient Registered");
                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null, e);
                            }  
        ///////////////////end insert chan_name///////////////////////////////////
                   
                    }
                    ///////////////////end check chan name repetition/////////////////////////
                }
              }
	     } 
             
             }catch(Exception e){}
		 
         
            }catch(Exception e){}
        
                                 
       /// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return true;
    }
    private void clear_arrays() {
        
   data.clear(); 
   data0.clear(); 
   data3.clear();
   data4.clear();
   data1.clear();
   data2.clear();
   data5.clear();
   data6.clear();
   data7.clear();
   data8.clear();     
   data9.clear();
   data10.clear();  
    data12.clear();
   data13.clear();     
   data14.clear();
   data15.clear(); 
   data_used_only_indices.clear(); 
   data_used_only_xx.clear();
   data11.clear();
   size_store.clear();
   //size_store.clear();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_table_transition() {
        pick_chan_name();
        String xxx=chandata_loop;
        String xxx2=str_chan_name;
       for(int i=0; i<2; i++ ){
           if(i==0){
           chandata_loop="";
           str_chan_name="";
           }else{
           chandata_loop=xxx;
           str_chan_name=xxx2;
           }
           
            String sql = "insert into tbl_processed_table(col1, col2, col3, col4,col5,col6, col7, col8, col9,col10,col11, col12,col13, col14, col15,col16, col17, col18, col19,col20,col21, col22, col23, col24,col25,col26, col27, col28, col29, col30) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
     
  
    try {
       pst = conn.prepareStatement(sql);
            pst.setString(1, chandata_loop);
            pst.setString(2, "");
            pst.setString(3, "");      
            pst.setString(4, ""); 
            pst.setString(5, "");
            pst.setString(6, "");
            pst.setString(7, "");
            pst.setString(8, "");
            pst.setString(9, "");
            pst.setString(10, "");     
            pst.setString(11, ""); 
            pst.setString(12, "");            
            pst.setString(13, "");       
            pst.setString(14, ""); 
            pst.setString(15, ""); 
            pst.setString(16, "");
            pst.setString(17, "");
            pst.setString(18, "");
            pst.setString(19, "");
            pst.setString(20, "");      
            pst.setString(21, "");
            pst.setString(22, "");            
            pst.setString(23, "");
            pst.setString(24, "");
            pst.setString(25, "");
            pst.setString(26, "");     
            pst.setString(27, ""); 
            pst.setString(28, "");
            pst.setString(29, ""); 
            pst.setString(30, str_chan_name);   
           

            pst.execute();  
      
         pst.close();         
         data.clear();
    }catch(Exception e){
    
    }      
       
       }
       str_chan_name="";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_used_indices() {
                           old_str_asset_def_body ="INDEX";  
                         //  used_chennel_count=data_used_only_xx.size();
                           data=data_used_only_indices;
                          // insert_column_size();                                
                           insert_array_2();
                          // used_inserted_status=1;
                          
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_used_values_row() {
                           insert_used_indices();
                           old_str_asset_def_body ="$MC_AXCONF_MACHAX_USED";  
                           used_chennel_count=data_used_only_xx.size();
                           data=data_used_only_xx;
                           insert_column_size();                                
                           insert_array();
                           used_inserted_status=1;
                          
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void clear_tbl_chan_name() {
        String sql = " delete from tbl_channel_names where id > ?";
        //String sql = "TRUNCATE TABLE tbl_chandata";
         
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "0");            
            pst.execute();
           // JOptionPane.showMessageDialog(null, "Drug Deleted");
          
            
        }
        catch (Exception e){
            //JOptionPane.showMessageDialog(null, e);        
        }
        // new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void pick_chan_name() {
        
        
                try{
        
                    Statement stmt2;  
                    stmt2= conn.createStatement();
                    String sql112="Select * from  tbl_channel_names where chandata = '" + chandata_loop + "'";
                    rs=stmt2.executeQuery(sql112);
                    if(rs.next()){
                       str_chan_name = rs.getString("chan_name");
                    }
                    }catch(Exception e){}
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    }
///////////end thread 2//////////////
////////////////thread 3///////////////////////////
class Compmaster_Loop2 implements Runnable{
    @Override
    public void run(){
    
    }
    }
public class Arc_Import extends javax.swing.JFrame {
     String loop1_global_count="";
     static int non_zero_columns=0; 
   static Connection conn = null;
    static ResultSet rs = null; 
   static PreparedStatement pst = null;    
    static String pathx ="n/a";     
    String pathxx="";
    
    
   

   
    public Arc_Import() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        SqliteDataTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_normalize = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        txtpatid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        cntxxc = new javax.swing.JLabel();
        lbl_per = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuration");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        SqliteDataTable.setBackground(new java.awt.Color(0, 0, 0));
        SqliteDataTable.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        SqliteDataTable.setForeground(new java.awt.Color(255, 255, 255));
        SqliteDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        SqliteDataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SqliteDataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SqliteDataTable);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("IMPORT DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("RAW TABLE");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("EXTRACT DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_normalize.setText("PROCESSED TABLE");
        btn_normalize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_normalizeMouseClicked(evt);
            }
        });
        btn_normalize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_normalizeActionPerformed(evt);
            }
        });

        path.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        path.setText("Path");
        path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathActionPerformed(evt);
            }
        });

        txtpatid.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtpatid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpatidActionPerformed(evt);
            }
        });

        jButton4.setText("FILTER BY PARAMETER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lbl_per.setBackground(new java.awt.Color(0, 0, 0));
        lbl_per.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_per.setForeground(new java.awt.Color(255, 255, 255));
        lbl_per.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_per.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_normalize, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtpatid, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(path, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                            .addComponent(lbl_per, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(110, 110, 110)
                        .addComponent(cntxxc, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(cntxxc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtpatid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(2, 2, 2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(path))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_normalize)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lbl_per, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(759, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                               // reset_varaiables();
        start_timer(1);                        
        pathx=path.getText().toString().trim(); 
     
           //JOptionPane.showMessageDialog(null, "Not Running");
        new Thread(new Compmaster_Loop()).start();
       
    }//GEN-LAST:event_jButton2ActionPerformed
    private void start_timer(int seconds){
    timer = new java.util.Timer();   
    timer.schedule(new Arc_Import.RemindTask(), seconds * 1000, 2000);
    }
    static void stop_timer(){
     //timer = new java.util.Timer();   
    timer.cancel();
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser =new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        pathxx =filename;
        path.setText(filename);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //conn = Sqliteconnection.ConnectDb();
        //create_sqlite_db();
        conn = mysqlconnect.ConnectDb();
        update_table_2();
       // UpdateJTable();
        //update_combo();
      // 
    }//GEN-LAST:event_formWindowOpened

    private void SqliteDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SqliteDataTableMouseClicked
        // TODO add your handling code here:
           // fetch_field_id();
    }//GEN-LAST:event_SqliteDataTableMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
        UpdateJTable();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_normalizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_normalizeMouseClicked
        // TODO add your handling code here:
        
        //UpdateJTable();
    }//GEN-LAST:event_btn_normalizeMouseClicked

    private void btn_normalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_normalizeActionPerformed
        // TODO add your handling code here:
        select_col_size();
        update_table_2();
       // insert_array();
       
    }//GEN-LAST:event_btn_normalizeActionPerformed

    private void txtpatidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpatidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpatidActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        search_table();
    }//GEN-LAST:event_jButton4ActionPerformed
   
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
            java.util.logging.Logger.getLogger(Arc_Import.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arc_Import.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arc_Import.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arc_Import.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arc_Import().setVisible(true);
            }
        });
        
        
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable SqliteDataTable;
    private javax.swing.JButton btn_normalize;
    private javax.swing.JLabel cntxxc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_per;
    private javax.swing.JTextField path;
    private javax.swing.JTextField txtpatid;
    // End of variables declaration//GEN-END:variables
   
  private void create_sqlite_db() {
        
         Statement stat;
    try {
        stat = conn.createStatement();
          stat.executeUpdate("drop table if exists tbl_chandata;");
           stat.executeUpdate("create table tbl_chandata (chandata_code, chandata, asset_number,str_asset_body, asset_status);");
    } catch (SQLException ex) {
        Logger.getLogger(Sqlite_Crud.class.getName()).log(Level.SEVERE, null, ex);
    }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    static void UpdateJTable(){
        //SqliteDataTable = new javax.swing.JTable();
     String sql = "select id AS 'ID' ,chandata AS 'CHANDATA', asset_number AS 'CHANNEL DESC',str_def_asset_body AS 'CHANNEL DESC', asset_status AS 'CHANNEL VALUE', pos_counter as 'INDEX' from tbl_chandata ORDER BY str_def_asset_body";
     try{
    pst = conn.prepareStatement(sql);
    rs = pst.executeQuery();
    SqliteDataTable.setModel(DbUtils.resultSetToTableModel(rs));    
}
     catch (Exception e){
     JOptionPane.showMessageDialog(null, e);
     }
 }  
    private void update_combo(){
     String sql = "select * from vw_chandata_groups";
     try{
    pst = conn.prepareStatement(sql);
    rs = pst.executeQuery();
  //  combo_1.setModel((ButtonModel) rs);   
    
    
}
     catch (Exception e){
     JOptionPane.showMessageDialog(null, e);
     }
 }  
    private void search_table() {
         String sql = "select id,chandata, asset_number,str_def_asset_body as asset_def_error_body, asset_status, pos_counter as position from tbl_chandata where chandata = '"+txtpatid.getText()+"'";
     try{
    pst = conn.prepareStatement(sql);
    rs = pst.executeQuery();
    SqliteDataTable.setModel(DbUtils.resultSetToTableModel(rs));    
}
     catch (Exception e){
     JOptionPane.showMessageDialog(null, e);
     }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    static void update_table_2() {
         select_col_size();
         non_zero_columns=non_zero_columns+1;
        String sql="";
             if(non_zero_columns==1){
        
          sql = "select col1 as '..',col30 as '..' from  tbl_processed_table order by col30 ASC";
        }else if (non_zero_columns==2){
        sql = "select col1 as '..',col30 as '..',col2 as '..' from  tbl_processed_table";     
        }
        else if (non_zero_columns==3){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..' from  tbl_processed_table";     
        }
         else if (non_zero_columns==4){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..' from  tbl_processed_table";     
        }
         else if (non_zero_columns==5){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..' from  tbl_processed_table";     
        }
         else if (non_zero_columns==6){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..' from  tbl_processed_table";     
         }
           else if (non_zero_columns==7){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..' from  tbl_processed_table";     
         }
            else if (non_zero_columns==8){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==9){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==10){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==11){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==12){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==13){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==14){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==15){
        sql = "select ccol1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==16){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==17){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==18){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==19){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==20){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==21){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==22){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==23){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==24){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==25){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==26){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==27){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==28){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==29){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..',col29 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==30){
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..',col29 as '..',col30 as '..' from  tbl_processed_table";     
         }             
        else{
        
        }
        
     try{
    pst = conn.prepareStatement(sql);
    rs = pst.executeQuery();
    SqliteDataTable.setModel(DbUtils.resultSetToTableModel(rs));    
}
     catch (Exception e){
     JOptionPane.showMessageDialog(null, e);
     }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void fetch_field_id() {
          int row = SqliteDataTable.getSelectedRow();
            String par1=(SqliteDataTable.getModel().getValueAt(row, 0).toString());  
            String par2=(SqliteDataTable.getModel().getValueAt(row, 1).toString()); 
          try{
          
            String sql ="select col30 from  tbl_processed_table where col1 ='"+par1+"' AND col30 ='"+par2+"' ";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next());
            
            String add1=rs.getString("col30");
            txtpatid.setText(add1);
            
           
        
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e); 
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    static void select_col_size() {
        
                   try{
        
                    Statement stmt2;  
                    stmt2= conn.createStatement();
                    String sql112="Select * from  tbl_col_size order by count DESC LIMIT 1";
                    rs=stmt2.executeQuery(sql112);
                    if(rs.next()){
                       non_zero_columns = Integer.parseInt(rs.getString("count"));
                    }
                    }catch(Exception e){}
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void stop_thread() {
        
        new Thread(new Compmaster_Loop()).stop();
        select_col_size();
        update_table_2();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void update_progress() {
        Compmaster_Loop lop1 =new Compmaster_Loop();
        loop1_global_count= lop1.str_global_count;
        //txt_perc.setText(loop1_global_count);
        //JOptionPane.showMessageDialog(null, loop1_global_count); 
        lbl_per.setText(loop1_global_count);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     class RemindTask extends TimerTask {
    public void run() {
    
      timR();
     
    }
  }
     
     public void timR(){
   
        try{
        update_progress();
      //  JOptionPane.showMessageDialog(null, "Second");
        }
     catch (Exception e){
     JOptionPane.showMessageDialog(null, e);
     }
  
  }
     
   static Timer timer;
}
