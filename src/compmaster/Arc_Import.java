/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compmaster;


import static sun.misc.Version.print;

import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.List;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
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
import static java.lang.Thread.interrupted;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.UUID;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import java.util.TimerTask;

import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.text.BadLocationException;
import net.proteanit.sql.DbUtils;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;
import test.CustomOutputStream;
/**
 *
 * @author peter
 */

 
///////////end thread 2//////////////
////////////////thread 3///////////////////////////

/////////////////end thread 3////////////////////

public class Arc_Import extends javax.swing.JFrame {

   
     String loop1_global_count="";
     int int_data_chabdata_count=0;
     int stop_timer_status=0;
     String str_data_chabdata_count="";
     static int non_zero_columns=0; 
     Timer timer_universal;
   static Connection conn = null;
    static ResultSet rs = null;     
    static int ixx_1=0;
   static PreparedStatement pst = null;    
    //static String pathx ="n/a";     
   public  String pathxx="";
  //  static String pathxx_1="";
    String str_progress_bar_str="0";
    ArrayList<String> datacheckbox;   
    String checkbox_index="";
     int int_checkbox_index=0;
     int process_continuing=0;
   private Thread PROGRESS_THREAD;
   private int PROGRESS_VALUE;
     
    static String str_global_count="0%";
    String chandata_loop="";
    int used_inserted_status=0;
    
    int count_number_of_loops=1;
    int array_size_for_size_store=0;
    int  int_loop_part_1=0;
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
     ArrayList<String> data16;     
     ArrayList<String> data17;
     ArrayList<String> data18;
     ArrayList<String> data19;     
     ArrayList<String> data20;     
     ArrayList<String> data21;
     ArrayList<String> data21_a;
     ArrayList<String> data22;
     ArrayList<String> data22_a;
     ArrayList<String> data23;   
      ArrayList<String> data23_a;  
     ArrayList<String> data24;
     ArrayList<String> data25; //Used second insert
     
    static ArrayList<String> size_store;
    static ArrayList<String> data_chabdata_count;
    static  ArrayList<String> data_used_only_xx;
   static  ArrayList<String> data_used_only_indices;     
   static  ArrayList<String> data_used_name;
     String str_pos_counter_1="";
     int  int_array_size_for_used=0;    
     int int_positon_to_insert=0;   
    int cnt = 0;
   static int ixx=0; 
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
    int status_used_sess_2 =0;
   
    public Arc_Import() {
        initComponents();
        
     full_scren();
     
     // upate_action();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        SqliteDataTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_normalize = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        txtpatid = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        lbl_per = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        CheckBoxes = new javax.swing.JPanel();
        chk16 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        chk30 = new javax.swing.JCheckBox();
        chk17 = new javax.swing.JCheckBox();
        chk7 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        chk10 = new javax.swing.JCheckBox();
        chk21 = new javax.swing.JCheckBox();
        chk14 = new javax.swing.JCheckBox();
        chk19 = new javax.swing.JCheckBox();
        chk22 = new javax.swing.JCheckBox();
        chk26 = new javax.swing.JCheckBox();
        chk18 = new javax.swing.JCheckBox();
        chk28 = new javax.swing.JCheckBox();
        chk5 = new javax.swing.JCheckBox();
        chk27 = new javax.swing.JCheckBox();
        chk13 = new javax.swing.JCheckBox();
        chk15 = new javax.swing.JCheckBox();
        chk11 = new javax.swing.JCheckBox();
        chk23 = new javax.swing.JCheckBox();
        chk8 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk9 = new javax.swing.JCheckBox();
        chk24 = new javax.swing.JCheckBox();
        chk6 = new javax.swing.JCheckBox();
        chk25 = new javax.swing.JCheckBox();
        chk20 = new javax.swing.JCheckBox();
        chk29 = new javax.swing.JCheckBox();
        chk12 = new javax.swing.JCheckBox();
        chk1 = new javax.swing.JCheckBox();
        btnContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuration");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Output Title"));
        jPanel2.setToolTipText("");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Controls"));

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
        path.setText("C:\\Users\\peter\\Desktop\\COMPMASTER_INPUT_SOURCE\\Compensation\\20191022_ELHA_5318.arc");
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

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_normalize, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_per, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(path)
                            .addComponent(txtpatid, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_per, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        CheckBoxes.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose Used Axes"));

        chk16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk16ItemStateChanged(evt);
            }
        });

        chk3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk3ItemStateChanged(evt);
            }
        });

        chk30.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk30ItemStateChanged(evt);
            }
        });
        chk30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk30ActionPerformed(evt);
            }
        });

        chk17.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk17ItemStateChanged(evt);
            }
        });

        chk7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk7ItemStateChanged(evt);
            }
        });

        chk4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk4ItemStateChanged(evt);
            }
        });

        chk10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk10ItemStateChanged(evt);
            }
        });

        chk21.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk21ItemStateChanged(evt);
            }
        });

        chk14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk14ItemStateChanged(evt);
            }
        });

        chk19.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk19ItemStateChanged(evt);
            }
        });

        chk22.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk22ItemStateChanged(evt);
            }
        });

        chk26.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk26ItemStateChanged(evt);
            }
        });

        chk18.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk18ItemStateChanged(evt);
            }
        });
        chk18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk18ActionPerformed(evt);
            }
        });

        chk28.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk28ItemStateChanged(evt);
            }
        });

        chk5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk5ItemStateChanged(evt);
            }
        });

        chk27.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk27ItemStateChanged(evt);
            }
        });

        chk13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk13ItemStateChanged(evt);
            }
        });

        chk15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk15ItemStateChanged(evt);
            }
        });

        chk11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk11ItemStateChanged(evt);
            }
        });

        chk23.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk23ItemStateChanged(evt);
            }
        });

        chk8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk8ItemStateChanged(evt);
            }
        });

        chk2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk2ItemStateChanged(evt);
            }
        });
        chk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2ActionPerformed(evt);
            }
        });

        chk9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk9ItemStateChanged(evt);
            }
        });

        chk24.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk24ItemStateChanged(evt);
            }
        });
        chk24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk24ActionPerformed(evt);
            }
        });

        chk6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk6ItemStateChanged(evt);
            }
        });
        chk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk6ActionPerformed(evt);
            }
        });

        chk25.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk25ItemStateChanged(evt);
            }
        });

        chk20.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk20ItemStateChanged(evt);
            }
        });

        chk29.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk29ItemStateChanged(evt);
            }
        });

        chk12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk12ItemStateChanged(evt);
            }
        });
        chk12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk12ActionPerformed(evt);
            }
        });

        chk1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chk1ItemStateChanged(evt);
            }
        });

        btnContinue.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnContinue.setText("Continue");
        btnContinue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinueMouseClicked(evt);
            }
        });
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CheckBoxesLayout = new javax.swing.GroupLayout(CheckBoxes);
        CheckBoxes.setLayout(CheckBoxesLayout);
        CheckBoxesLayout.setHorizontalGroup(
            CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckBoxesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chk7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chk13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk18, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chk19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk24, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chk25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk30, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnContinue)
                .addContainerGap())
        );
        CheckBoxesLayout.setVerticalGroup(
            CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckBoxesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckBoxesLayout.createSequentialGroup()
                        .addComponent(chk1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chk6))
                    .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(CheckBoxesLayout.createSequentialGroup()
                            .addComponent(chk25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(chk26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(chk27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(chk28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(chk29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chk30)
                                .addComponent(btnContinue)))
                        .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CheckBoxesLayout.createSequentialGroup()
                                .addComponent(chk7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk12))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CheckBoxesLayout.createSequentialGroup()
                                .addComponent(chk13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CheckBoxesLayout.createSequentialGroup()
                                .addComponent(chk19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chk24)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBoxes, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBoxes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1611, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if(process_continuing==0){
          process_continuing=1;         
                 
              
         
                 start_program(); 
              
     
         }else{
         JOptionPane.showMessageDialog(null, "Similar Process is Running !");
         
         }
        
        
        //trigger_thread();
           //JOptionPane.showMessageDialog(null, "Not Running");
       
      // new Thread(new Compmaster_Loop2()).start();
        
       
    }//GEN-LAST:event_jButton2ActionPerformed
  private void  reset_progress_componenevts(){
jProgressBar1.setString(String.valueOf(0));
lbl_per.setText("0%");
  }
    private void start_program(){
                              stop_timer_status=1;
                              pathxx=path.getText().toString().trim();
                              starts_progress_bar();                     // reset_varaiables();
                              start_timer2();   
                              
                              clearx();
                              clearx2();
                              clear_col_size();                              
                              count_chandata_types();
                              start_loop_par1();
  
  
  }
   
    public void start_timer2(){
        
     timer_universal = new Timer (500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
               // current.setText(now());
                System.out.println("Called");
                // txtpatid.setText(str_global_count);
                 lbl_per.setText(str_global_count);
        // update_progress();
                 
                // update_table_2();
                update_progress_bar();
            }
        });
     
    timer_universal.start();
     
    }
   public void stop_timer(){
       
       timer_universal.stop();
     //timer = new java.util.Timer();  
      //  lbl_per.setText("Copleted");
   // Timer.
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        select_file();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pathActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       datacheckbox=new ArrayList<String>(); 
        data = new ArrayList<String>();                                  
                                 data11 = new ArrayList<String>(); 
                                 size_store= new ArrayList<String>(); 
                                 data_chabdata_count= new ArrayList<String>();
                                 data_used_only_xx= new ArrayList<String>();
                                 data_used_only_indices= new ArrayList<String>();
                                 data_used_name= new ArrayList<String>();
                                 used_inserted_status=0;
                              //  List<Integer> myArrayList = new ArrayList<>(100);                           
                                  used_chennel_count=0;
                                  
                                  
        int_loop_part_1=0;
        btnContinue.setVisible(false);
       hide_all_checkboxes();
        conn = mysqlconnect.ConnectDb();
        update_table_2();
         set_jtables();
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
 private static void set_jtables() {
        TableColumnModel columnModel = SqliteDataTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(300);
        columnModel.getColumn(0).setMaxWidth(300);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(1).setMaxWidth(150);
      
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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

    private void chk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk6ActionPerformed

    private void chk12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk12ActionPerformed

    private void chk18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk18ActionPerformed

    private void chk24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk24ActionPerformed

    private void chk30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk30ActionPerformed

    private void chk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk2ActionPerformed

    private void btnContinueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinueMouseClicked
        // TODO add your handling code here:
        
        //Compmaster_Loop loop1=new Compmaster_Loop();
       // loop1.continue_with_loop();
        //  if(process_continuing!=2){
       //  process_continuing=2; 
         
                
              data_used_name.clear();
              //JOptionPane.showMessageDialog(null, data_used_name.size());
                 continue_with_loop();
               btnContinue.setVisible(false);
            // JOptionPane.showMessageDialog(null, "Check responsiveness !");
         // }else{
       //  JOptionPane.showMessageDialog(null, "Similar Process is Running !");
         
       //  }
        
        
        
      
        
    //return null;
    }//GEN-LAST:event_btnContinueMouseClicked

    private void chk1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk1ItemStateChanged
        // TODO add your handling code here:
        
        if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="0"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk1.setVisible(true);
             update_arraylist();
           //  set_check_box();
             // set_check_box();
            // JOptionPane.showMessageDialog(null, int_checkbox_index+" removed");
        };
    }//GEN-LAST:event_chk1ItemStateChanged

    private void chk2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk2ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="1"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk2.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk2ItemStateChanged

    private void chk3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk3ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="2"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk3.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk3ItemStateChanged

    private void chk4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk4ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="3"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk4.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk4ItemStateChanged

    private void chk5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk5ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="4"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk5.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk5ItemStateChanged

    private void chk6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk6ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="5"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk6.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk6ItemStateChanged

    private void chk7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk7ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="6"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk7.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk7ItemStateChanged

    private void chk8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk8ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="7"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk8.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk8ItemStateChanged

    private void chk9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk9ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="8"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk9.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk9ItemStateChanged

    private void chk10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk10ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="9"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk10.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk10ItemStateChanged

    private void chk11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk11ItemStateChanged
        // TODO add your handling code here:
        
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="10"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk11.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk11ItemStateChanged

    private void chk12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk12ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="11"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk12.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk12ItemStateChanged

    private void chk13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk13ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="12"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk13.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk13ItemStateChanged

    private void chk14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk14ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="13"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk14.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk14ItemStateChanged

    private void chk15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk15ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="14"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk15.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk15ItemStateChanged

    private void chk16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk16ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="15"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk16.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk16ItemStateChanged

    private void chk17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk17ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="16"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk17.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk17ItemStateChanged

    private void chk18ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk18ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="17"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk18.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk18ItemStateChanged

    private void chk19ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk19ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="18"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk19.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk19ItemStateChanged

    private void chk20ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk20ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="19"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk20.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk20ItemStateChanged

    private void chk21ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk21ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="20"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk21.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk21ItemStateChanged

    private void chk22ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk22ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="21"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk22.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk22ItemStateChanged

    private void chk23ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk23ItemStateChanged
        // TODO add your handling code here:
        
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="22"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk23.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk23ItemStateChanged

    private void chk24ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk24ItemStateChanged
        // TODO add your handling code here:
        
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="23"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk24.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk24ItemStateChanged

    private void chk25ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk25ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="24"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk25.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk25ItemStateChanged

    private void chk26ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk26ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="25"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk26.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk26ItemStateChanged

    private void chk27ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk27ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="26"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk27.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk27ItemStateChanged

    private void chk28ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk28ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="27"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk28.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk28ItemStateChanged

    private void chk29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk29ItemStateChanged
        // TODO add your handling code here:
        
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="28"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk29.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk29ItemStateChanged

    private void chk30ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk30ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
        } else {//checkbox has been deselected
              checkbox_index="29"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             chk30.setVisible(true);
             update_arraylist();
          
        };
    }//GEN-LAST:event_chk30ItemStateChanged

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinueActionPerformed
   
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
    private javax.swing.JPanel CheckBoxes;
    private static javax.swing.JTable SqliteDataTable;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btn_normalize;
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk10;
    private javax.swing.JCheckBox chk11;
    private javax.swing.JCheckBox chk12;
    private javax.swing.JCheckBox chk13;
    private javax.swing.JCheckBox chk14;
    private javax.swing.JCheckBox chk15;
    private javax.swing.JCheckBox chk16;
    private javax.swing.JCheckBox chk17;
    private javax.swing.JCheckBox chk18;
    private javax.swing.JCheckBox chk19;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk20;
    private javax.swing.JCheckBox chk21;
    private javax.swing.JCheckBox chk22;
    private javax.swing.JCheckBox chk23;
    private javax.swing.JCheckBox chk24;
    private javax.swing.JCheckBox chk25;
    private javax.swing.JCheckBox chk26;
    private javax.swing.JCheckBox chk27;
    private javax.swing.JCheckBox chk28;
    private javax.swing.JCheckBox chk29;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk30;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chk5;
    private javax.swing.JCheckBox chk6;
    private javax.swing.JCheckBox chk7;
    private javax.swing.JCheckBox chk8;
    private javax.swing.JCheckBox chk9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
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
        sql = "select col1 as '..',col30 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..' from  tbl_processed_table";     
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
     set_jtables();
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
                    String sql112="Select *  from  tbl_col_size order by count DESC LIMIT 1";
                    rs=stmt2.executeQuery(sql112);
                    if(rs.next()){
                       non_zero_columns = Integer.parseInt(rs.getString("count"));
                    }
                    }catch(Exception e){}
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void stop_thread() {
        
       // new Thread(new Compmaster_Loop()).stop();
        select_col_size();
        update_table_2();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void update_progress() {
        txtpatid.setText(loop1_global_count);
        lbl_per.setText(loop1_global_count);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
    }
    static void finish_treads(){
   // lbl_per.setText("COMPLETED");
    
    }
     public void close(){
        
WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}

    private void restart() {
         Arc_Import s = new Arc_Import();
        s.setVisible(true);
         close();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void select_file() {
        process_continuing=0;
        JFileChooser chooser =new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        pathxx =filename;
        path.setText(filename);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private void starts_progress_bar(){
      PROGRESS_THREAD = new Thread(new Runnable(){
            @Override
            public void run(){
               for(;;){
                jProgressBar1.setValue(PROGRESS_VALUE);
                   try {
                       PROGRESS_THREAD.sleep(100);
                   } catch (InterruptedException ex) {
                       Logger.getLogger(Arc_Import.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
            }
        
        });
        PROGRESS_THREAD.start();
     }
    private void update_progress_bar() {
             
            // str_progress_bar_str = loop1_global_count.substring(loop1_global_count.indexOf(" CHANNELS  ] [ ") + 1, loop1_global_count.indexOf("."));
           //  str_progress_bar_str = str_progress_bar_str.replaceAll("[^0-9]", "");
           //  str_progress_bar_str=str_progress_bar_str.replaceAll("\\s+","");
           ////  if(str_progress_bar_str.equals("")|| str_progress_bar_str.equals(null)|| str_progress_bar_str.equals("0")){
           //  str_progress_bar_str="2";
           //  }
            // PROGRESS_VALUE= Integer.parseInt(str_progress_bar_str);  
           // int_data_chabdata_count= Integer.parseInt(str_data_chabdata_count); 
            /* ifnt_data_chabdata_count= Integer.parseInt(str_data_chabdata_count); (PROGRESS_VALUE<=2 || int_data_chabdata_count <= 0){
             PROGRESS_VALUE=2;
             int_data_chabdata_count=2;
             }
             PROGRESS_VALUE=PROGRESS_VALUE/int_data_chabdata_count;*/
        //herepr
           PROGRESS_VALUE= (int) Math.round( per_pr);
       
             jProgressBar1.setString(String.valueOf(PROGRESS_VALUE));
           //  JOptionPane.showMessageDialog(null, str_progress_bar_str);
        
    }

    private void set_checkbox() {
      
    

    
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  private void full_scren() {
       setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

   private void hide_all_checkboxes() {
         chk1.setVisible(false);
        chk2.setVisible(false);
        chk3.setVisible(false);
        chk4.setVisible(false);
        chk5.setVisible(false);
        chk6.setVisible(false);
        chk7.setVisible(false);
        chk8.setVisible(false);
        chk9.setVisible(false);
        chk10.setVisible(false);        
        chk11.setVisible(false);
        chk12.setVisible(false);
        chk13.setVisible(false);
        chk14.setVisible(false);
        chk15.setVisible(false);
        chk16.setVisible(false);
        chk17.setVisible(false);
        chk18.setVisible(false);
        chk19.setVisible(false);
        chk20.setVisible(false);        
        chk21.setVisible(false);
        chk22.setVisible(false);
        chk23.setVisible(false);
        chk24.setVisible(false);
        chk25.setVisible(false);
        chk26.setVisible(false);
        chk27.setVisible(false);
        chk28.setVisible(false);
        chk29.setVisible(false);
        chk30.setVisible(false);
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           

   private void update_arraylist() {
       int xx=data_used_only_xx.size();
        
        String removedStr = data_used_only_xx.remove(int_checkbox_index);
        String removedStr_index = data_used_only_indices.remove(int_checkbox_index);
        String removedStr_index_store = size_store.remove(int_checkbox_index);
         String removedStr_index_name = data_used_name.remove(int_checkbox_index);
        
        
        
      //  JOptionPane.showMessageDialog(null, datacheckbox.size()+" removed");
       System.out.println(data_used_only_xx);
         System.out.println(data_used_only_indices);
       System.out.println(removedStr);
       System.out.println(removedStr_index);
       System.out.println(removedStr_index_store);
       set_check_box();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public void set_check_box() {
        process_continuing=0;
       hide_all_checkboxes();
        String str_caption="";
        String str_caption2="";
        
      // Compmaster_Loop lop1 = new Compmaster_Loop();
      // datacheckbox= lop1.data_used_only_xx;
      // JOptionPane.showMessageDialog(null, "Function Called!"); 
       int cc= data_used_only_indices.size();
        if(data_used_only_indices.size()>0){
        for(int i =0; i<data_used_only_indices.size(); i++){
             str_caption=data_used_only_indices.get(i);
            str_caption2= data_used_name.get(i);
             if(i==0){
             chk1.setVisible(true);
             chk1.setText(str_caption+" ["+str_caption2+"]");
             chk1.setSelected(true);
             }
             else if(i==1){
             chk2.setVisible(true);
             chk2.setText(str_caption+" ["+str_caption2+"]");
             chk2.setSelected(true);
             }
             else if(i==2){
             chk3.setVisible(true);
             chk3.setText(str_caption+" ["+str_caption2+"]");
             chk3.setSelected(true);
             }
             else if(i==3){
             chk4.setVisible(true);
             chk4.setText(str_caption+" ["+str_caption2+"]");
             chk4.setSelected(true);
             }
             else if(i==4){
             chk5.setVisible(true);
             chk5.setText(str_caption+" ["+str_caption2+"]");
             chk5.setSelected(true);
             }
             else if(i==5){
             chk6.setVisible(true);
             chk6.setText(str_caption+" ["+str_caption2+"]");
             chk6.setSelected(true);
             }
             else if(i==6){
             chk7.setVisible(true);
             chk7.setText(str_caption+" ["+str_caption2+"]");
             chk7.setSelected(true);
             }
             else if(i==7){
             chk8.setVisible(true);
             chk8.setText(str_caption+" ["+str_caption2+"]");
             chk8.setSelected(true);
             }
             else if(i==8){
             chk9.setVisible(true);
             chk9.setText(str_caption+" ["+str_caption2+"]");
             chk9.setSelected(true);
             }
             else if(i==9){
             chk10.setVisible(true);
             chk10.setText(str_caption+" ["+str_caption2+"]");
             chk10.setSelected(true);
             }
             else if(i==10){
             chk11.setVisible(true);
             chk11.setText(str_caption+" ["+str_caption2+"]");
             chk11.setSelected(true);
             }
             else if(i==11){
             chk12.setVisible(true);
             chk12.setText(str_caption+" ["+str_caption2+"]");
             chk12.setSelected(true);
             }
              else if(i==12){
             chk13.setVisible(true);
             chk13.setText(str_caption+" ["+str_caption2+"]");
             chk13.setSelected(true);
             }
               else if(i==13){
             chk14.setVisible(true);
             chk14.setText(str_caption+" ["+str_caption2+"]");
             chk14.setSelected(true);
             }
             else if(i==14){
             chk15.setVisible(true);
             chk15.setText(str_caption+" ["+str_caption2+"]");
             chk15.setSelected(true);
             }
             else if(i==15){
             chk16.setVisible(true);
             chk16.setText(str_caption+" ["+str_caption2+"]");
             chk16.setSelected(true);
             }
             //////
               else if(i==16){
             chk17.setVisible(true);
             chk17.setText(str_caption+" ["+str_caption2+"]");
             chk17.setSelected(true);
             }
             else if(i==17){
             chk18.setVisible(true);
             chk18.setText(str_caption+" ["+str_caption2+"]");
             chk18.setSelected(true);
             }
             else if(i==18){
             chk19.setVisible(true);
             chk19.setText(str_caption+" ["+str_caption2+"]");
             chk19.setSelected(true);
             }
             else if(i==19){
             chk20.setVisible(true);
             chk20.setText(str_caption+" ["+str_caption2+"]");
             chk20.setSelected(true);
             }
             else if(i==20){
             chk21.setVisible(true);
             chk21.setText(str_caption+" ["+str_caption2+"]");
             chk21.setSelected(true);
             }
             else if(i==21){
             chk22.setVisible(true);
             chk22.setText(str_caption+" ["+str_caption2+"]");
             chk22.setSelected(true);
             }
             else if(i==22){
             chk23.setVisible(true);
             chk23.setText(str_caption+" ["+str_caption2+"]");
             chk23.setSelected(true);
             }
             else if(i==23){
             chk24.setVisible(true);
             chk24.setText(str_caption+" ["+str_caption2+"]");
             chk24.setSelected(true);
             }
             else if(i==24){
             chk25.setVisible(true);
             chk25.setText(str_caption+" ["+str_caption2+"]");
             chk25.setSelected(true);
             }
             else if(i==25){
             chk26.setVisible(true);
             chk26.setText(str_caption+" ["+str_caption2+"]");
             chk26.setSelected(true);
             }
             else if(i==26){
             chk27.setVisible(true);
             chk27.setText(str_caption+" ["+str_caption2+"]");
             chk27.setSelected(true);
             }
              else if(i==27){
             chk28.setVisible(true);
             chk28.setText(str_caption+" ["+str_caption2+"]");
             chk28.setSelected(true);
             }
             else if(i==28){
             chk29.setVisible(true);
             chk29.setText(str_caption+" ["+str_caption2+"]");
             chk29.setSelected(true);
             }
             else if(i==29){
             chk30.setVisible(true);
             chk30.setText(str_caption+" ["+str_caption2+"]");
             chk30.setSelected(true);
             }
             
             else{
             
             }
        
        }
        }else{
      //  JOptionPane.showMessageDialog(null, "NO MORE USED DATA"); 
        }
      //  data_used_name.clear();
       // JOptionPane.showMessageDialog(null, "Choose axes!"); 
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   private boolean start_loop_par1(){
    new SwingWorker(){

            @Override
            protected Object doInBackground() throws Exception {
                //your code here
                
                 ///////////////////////////////
                             int_data_chabdata_count=data_chabdata_count.size();
                             
                              for(ixx =ixx; ixx<data_chabdata_count.size(); ixx++)
                                     {
                                         
                                    // count_number_of_loops=count_number_of_loops;
                                     //start_timer();
                                     countLines();
                                     chandata_loop=data_chabdata_count.get(ixx);
                                     insert_table_transition();
                                     if(!chandata_loop.equals("")){
                                         
                                         
                                         
                                    insert_used_only(); 
                                   // insert_used_only_names();
                                    //data_used_name
                                   
                                    int indices =data_used_only_indices.size();
                                    
                                    return true;
                                    }else{
                                     JOptionPane.showMessageDialog(null, "No viable data to  render!.");
                                     }
                                     
                                     }
                              
                              ///////////////////////////////
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
       
       }.execute();
                            
                             
                              return true;
    
    }
    ////////////functions//////////////
   public boolean continue_with_loop(){
      // str_asset_status=str.replaceAll("[^a-zA-Z0-9]", "");
    // data_used_name.clear();
       new SwingWorker(){

            @Override
            protected Object doInBackground() throws Exception {
                //your code here
                                       hide_all_checkboxes();
                                       insert_used_values_row();
                                       initialise_the_other_arraylista();       
                                       int_array_size_for_used=size_store.size();
                                       
                                       
                                    for(ixx =ixx; ixx<data_chabdata_count.size(); ixx++)
                                     {
                                         
                                     //count_number_of_loops=count_number_of_loops;
                                     start_timer2();
                                     countLines();
                                     chandata_loop=data_chabdata_count.get(ixx);
                                    // insert_table_transition();
                                     if(!chandata_loop.equals("")){
                                    // insert_used_only();                                   
                                      insert_multiple_pockets();
                                      clear_arrays();
                                     
                                     
                                     
                                     
                                      if(count_number_of_loops==data_chabdata_count.size()){
                                     // update_table_2();
                                          stop_timer();
                                          PROGRESS_VALUE=100;
                                          jProgressBar1.setString(String.valueOf(PROGRESS_VALUE));
                                        //  update_progress_bar();
                                      count_number_of_loops=1;
                                      JOptionPane.showMessageDialog(null, "Finished successfully!");
                                    reset_varaiables();
                                    clear_arrays();
                                    data_chabdata_count.clear();
                                   /// Arc_Import
                                    //close();
                                    return true;
                                     }else{
                                       ixx=ixx+1;
                                       count_number_of_loops=count_number_of_loops+1;
                                       restart_process();
                                      
                                      }
                                     
                                      return true;
                                     
                                    }else{
                                     JOptionPane.showMessageDialog(null, "No viable data to  render!.");
                                     }
                                     
                                     }
                            
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
       
       }.execute();
                                       
                                      
                              
                              
                             // Compmaster_Loop2 loop2 = new Compmaster_Loop2();
                             
                              //.showMessageDialog(null, "Finished successfully!");
    
     return true;
    }
    
    private void restart_process(){
    start_loop_par1();
    }
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
    private boolean insert_used_only_names() {
        
        data_used_name.clear();
      for (int i=0; i< data_used_only_indices.size(); i++){
                  
                    data_used_name.add("n/a");
                  }  
         try{        
         String pxx=pathxx;     
         FileReader fileReader = new FileReader(pathxx);
         try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      //String line;
         while((line = bufferedReader.readLine()) != null) {
         
               str_global_count="Rendering file. Please wait !";
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
       
                  
              if(firstFourChars.equals("CHANDATA") || first6Char.equals("N10000")){      
                  if(firstFourChars.equals("CHANDATA")){
            // txt_percentage.setText("0.00");
               
                str_chandata=line;
               
				}
                  normalize_line();  
                 str_asset_number=first6Char;               
                 try{                   
                 str_asset_body = line.substring(line.indexOf(" ") + 1, line.indexOf("=")); 
                
                 str_asset_status = line.substring(line.lastIndexOf("=") + 1);
                 //error_body before [
                 str_asset_def_body =  str_asset_body.substring(0, str_asset_body.indexOf("["));
               
                 str_pos_counter = str_asset_body.substring(str_asset_body.indexOf("[") + 1, str_asset_body.indexOf("]"));
                 str_pos_counter = str_pos_counter.replaceAll("[^0-9]", "");
                 str_asset_status=str_asset_status.replaceAll("[^a-zA-Z0-9]", "");
                 if(str_chandata.equals(chandata_loop)){
                   if(data_used_only_indices.contains("("+str_pos_counter +")")){
                   int_positon_to_insert= data_used_only_indices.indexOf("("+str_pos_counter +")");
                  data_used_name.set(int_positon_to_insert, str_asset_status);
                   }
                 }
                  
                 }catch(Exception e){
                 
                 }
              
                 
        
        }   
        
      }
      
    }
    }catch(Exception e){}
         
       
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
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
         
               str_global_count="Rendering file. Please wait !";
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
               // str_global_count="["+chandata_loop+"]"+""+row_of_rows;
              
       //  System.out.println("["+chandata_loop+"]"+""+row_of_rows); 
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
                             //////////used channel loop finished insert////////////
                         // insert_used_values_row();
                          
                          open_choose_used_axis();
                         return true;
                            
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
                    
                   // insert_used_values_row();
                    open_choose_used_axis(); 
                    return true;
                           
                 }
              
               }
           
           }   
        
      }
      
    }
    }catch(Exception e){}
         
        reset_dble(); 
       if(used_inserted_status==0){
            //  insert_used_values_row();
                         
             open_choose_used_axis();   
             return true;
       }
       
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
      int ss = data_used_only_xx.size();
      
        
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
      //   data.clear();
          ss = data_used_only_xx.size();        
                  
                }else{
                  
                 // var2x="";
                  }
             
            
          
         
         old_str_asset_def_body="n/a";
       // conn.close();
    } catch (SQLException ex) {
        System.err.println("Error = " + ex);
    }
     
     }
    // data.clear();
     ss = data_used_only_xx.size();
     end_used_only =1;
     old_str_asset_def_body="n/a";
     if(!old_str_asset_def_body.equals(str_asset_def_body) && loop_id==2){
     data.add(str_asset_status);
     }
  
    }
    private void insert_array_2() {
        leng = data.size();
      int leng2 = data_used_only_xx.size();
      
        
     if(leng > 0){
        String sql = "insert into tbl_processed_table(col1, col2, col3, col4,col5,col6, col7, col8, col9,col10,col11, col12,col13, col14, col15,col16, col17, col18, col19,col20,col21, col22, col23, col24,col25,col26, col27, col28, col29, col30) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
       // String //sql = "INSERT INTO nameTable (name) values (?)";
  
    try {
       pst = conn.prepareStatement(sql);
       
       
 
    String[] stringArray = data.toArray(new String[data.size()]);
    // if(str_chandata.equals(chandata_loop)){
                  var1x=old_str_asset_def_body; 
                 // if(leng == leng){
                  if(leng == leng2){
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
             // Arc_Import mainClass = new Arc_Import();                 
                             // mainClass.UpdateJTable();
                              // pathxx= mainClass.pathx;
                   
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
                  
                // per_pr=per_pr/1;
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
                String first16Char = "";
                
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
              /////////////////////////////////
                if (input.length() > 16) 
              {
               first16Char = input.substring(0, 16);
              } 
              else
              {
               first16Char = input;
              } 
                int int_data_chabdata_count= data_chabdata_count.size(); 
              ///////////////////////////////////
              str_global_count="Step "+count_number_of_loops+" of " +int_data_chabdata_count+" "+"["+chandata_loop+"]"+""+row_of_rows;
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
                   
                   
                   || first6Char.equals("N32450")
                   || first6Char.equals("N38000")
                   || first16Char.equals("$AA_ENC_COMP_STE")   
                   || first16Char.equals("$AA_ENC_COMP_MIN")
                   || first16Char.equals("$AA_ENC_COMP_MAX")
                   || first16Char.equals("$AA_ENC_COMP_IS_")
                 
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
                 
                 }
                 
                 else{
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
                   ////////////////////////////////                   
                   else if(str_asset_def_body.equals("$AA_ENC_COMP_STEP") && str_row_1_or_0.equals("0") ){
                   str_asset_def_body="$AA_ENC_COMP_STEP[0]";
                   }else if(str_asset_def_body.equals("$AA_ENC_COMP_STEP") && str_row_1_or_0.equals("1") ){
                  str_asset_def_body="$AA_ENC_COMP_STEP[1]";
                   } 
                   ////////////////////////
                   else if(str_asset_def_body.equals("$MA_BACKLASH") && str_row_1_or_0.equals("0") ){
                   str_asset_def_body="$MA_BACKLASH[0]";
                   }else if(str_asset_def_body.equals("$MA_BACKLASH") && str_row_1_or_0.equals("1") ){
                  str_asset_def_body="$MA_BACKLASH[1]";
                   }     
                   /////////////////////////
                   else if(str_asset_def_body.equals("$MA_MM_ENC_COMP_MAX_POINTS") && str_row_1_or_0.equals("0") ){
                   str_asset_def_body="$MA_MM_ENC_COMP_MAX_POINTS[0]";
                   }else if(str_asset_def_body.equals("$MA_MM_ENC_COMP_MAX_POINTS") && str_row_1_or_0.equals("1") ){
                  str_asset_def_body="$MA_MM_ENC_COMP_MAX_POINTS[1]";
                   }     
                   /////////////////////////
                   
                   
                    ////////////////////////
                   else if(str_asset_def_body.equals("$AA_ENC_COMP_MIN") && str_row_1_or_0.equals("0") ){
                   str_asset_def_body="$AA_ENC_COMP_MIN[0]";
                   }else if(str_asset_def_body.equals("$AA_ENC_COMP_MIN") && str_row_1_or_0.equals("1") ){
                  str_asset_def_body="$AA_ENC_COMP_MIN[1]";
                   }     
                   /////////////////////////
                    ////////////////////////
                   else if(str_asset_def_body.equals("$AA_ENC_COMP_IS_MODULO") && str_row_1_or_0.equals("0") ){
                   str_asset_def_body="$AA_ENC_COMP_IS_MODULO[0]";
                   }else if(str_asset_def_body.equals("$AA_ENC_COMP_IS_MODULO") && str_row_1_or_0.equals("1") ){
                  str_asset_def_body="$AA_ENC_COMP_IS_MODULO[1]";
                   }     
                   /////////////////////////
                    ////////////////////////
                   else if(str_asset_def_body.equals("$AA_ENC_COMP_MAX") && str_row_1_or_0.equals("0") ){
                   str_asset_def_body="$AA_ENC_COMP_MAX[0]";
                   }else if(str_asset_def_body.equals("$AA_ENC_COMP_MAX") && str_row_1_or_0.equals("1") ){
                  str_asset_def_body="$AA_ENC_COMP_MAX[1]";
                   }     
                   /////////////////////////
                   
                   
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
                                          
                                          /////////////////////////
                                          if(status_used_sess_2==0){
                                          status_used_sess_2=status_used_sess_2+1;
                                           int xx =data_used_only_xx.size(); 
                                            
                                             
                                             for(int i =0; i<data_used_only_xx.size(); i++)
                                                         {                                         
                                                     String  ppx =data_used_only_xx.get(i);
                                                       int_positon_to_insert=data_used_only_xx.indexOf(ppx);
                                                      data25.set(int_positon_to_insert, ppx);
                                                         }
                                            
                                          }
                                        
                                         /////////////////////
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
                                          ////////////////////////////////////////////////////////////////////  
                                         else if(str_asset_def_body.equals("$MA_BACKLASH[0]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data16.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                          else if(str_asset_def_body.equals("$MA_BACKLASH[1]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data17.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                           else if(str_asset_def_body.equals("$MA_MM_ENC_COMP_MAX_POINTS[0]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data18.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                            else if(str_asset_def_body.equals("$MA_MM_ENC_COMP_MAX_POINTS[1]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data19.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                             else if(str_asset_def_body.equals("$AA_ENC_COMP_STEP[0]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data20.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                             else if(str_asset_def_body.equals("$AA_ENC_COMP_STEP[1]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data24.set(int_positon_to_insert, str_asset_status);
                                                }                                            
                                                }
                                             //////////////////////////////////////////////////////////////
                                              else if(str_asset_def_body.equals("$AA_ENC_COMP_MIN[0]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data21.set(int_positon_to_insert, str_asset_status);
                                                }
                                              }
                                              ///////////////////////////////////////////////////////////////////////
                                              //////////////////////////////////////////////////////////////
                                              else if(str_asset_def_body.equals("$AA_ENC_COMP_MIN[1]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data21_a.set(int_positon_to_insert, str_asset_status);
                                                }
                                              }
                                              ///////////////////////////////////////////////////////////////////////
                                               else if(str_asset_def_body.equals("$AA_ENC_COMP_MAX[0]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data22.set(int_positon_to_insert, str_asset_status);
                                                }                                            
                                                }
                                               ////////////////////////////////////////
                                                else if(str_asset_def_body.equals("$AA_ENC_COMP_MAX[1]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data22_a.set(int_positon_to_insert, str_asset_status);
                                                }                                            
                                                }
                                               /////////////////////////////////////////////////
                                                else if(str_asset_def_body.equals("$AA_ENC_COMP_IS_MODULO[0]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data23.set(int_positon_to_insert, str_asset_status);
                                                }
                                                }
                                            ////////////////////////////////////////////////////////
                                                 /////////////////////////////////////////////////
                                                else if(str_asset_def_body.equals("$AA_ENC_COMP_IS_MODULO[1]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data23_a.set(int_positon_to_insert, str_asset_status);
                                                }
                                                }
                                            ////////////////////////////////////////////////////////
                                        
                                            else if(str_asset_def_body.equals("$AA_ENC_COMP_STEP[1]")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data24.set(int_positon_to_insert, str_asset_status);
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
          //mainClass.stop_timer();
      
         reset_varaiables();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        
      // 
        status_used_sess_2=0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_0() {
        int xx =data10.size();
        old_str_asset_def_body="N32700 $MA_CEC_ENABLE";
        data.clear();
        xx =data10.size();
        data=data0;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_1() {
        old_str_asset_def_body="N31000 $MA_ENC_IS_LINEAR[0]";
        data.clear();
        data=data1;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_2() {
        old_str_asset_def_body="N31000 $MA_ENC_IS_LINEAR[1]";
        data.clear();
        data=data2;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_3() {
        old_str_asset_def_body="N37100 $MA_GANTRY_AXIS_TYPE";
        
        data.clear();
        data=data3;
        insert_array();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_4() {
        old_str_asset_def_body="N30200 $MA_NUM_ENCS";
        data.clear();
        data=data4;
        insert_array();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_5() {
        old_str_asset_def_body="N32700 $MA_ENC_COMP_ENABLE[0]";
        data.clear();
        data=data5;
        insert_array();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_6() {
        old_str_asset_def_body="N32700 $MA_ENC_COMP_ENABLE[1]";
       data.clear();
        data=data6;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 private void insert_7() {
        old_str_asset_def_body="N36110 $MA_POS_LIMIT_MINUS[0]";
        data.clear();
        data=data7;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  private void insert_8() {
        old_str_asset_def_body="N36110 $MA_POS_LIMIT_PLUS[1]";
        data.clear();
        data=data8;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   private void insert_9() {
        old_str_asset_def_body="ENC Axis Comp active";
        data.clear();
        data=data9;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_10() {
        old_str_asset_def_body="CEC Axis Comp active";
        data.clear();
        data=data10;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //$MN_AXCONF_LOGIC_MACHAX_TAB  $MN_AXCONF_MACHAX_NAME_TAB  $MA_IS_ROT_AX  $MN_MM_CEC_MAX_POINTS
    private void insert_12() {
        old_str_asset_def_body="N10002 $MN_AXCONF_LOGIC_MACHAX_TAB";
        data.clear();
        data=data12;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_13() {
        old_str_asset_def_body="N10000 $MN_AXCONF_MACHAX_NAME_TAB";
        data.clear();
        data=data13;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_14() {
        old_str_asset_def_body="N30300 $MA_IS_ROT_AX";
        data.clear();
        data=data14;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_15() {
        old_str_asset_def_body="N18342 $MN_MM_CEC_MAX_POINTS";
        data.clear();
        data=data15;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     private void insert_16() {
        old_str_asset_def_body="N32450 $MA_BACKLASH[0]";
        data.clear();
        data=data16;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       private void insert_17() {
        old_str_asset_def_body="N32450 $MA_BACKLASH[1]";        
       data.clear();
        data=data17;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         private void insert_18() {
       old_str_asset_def_body="N38000 $MA_MM_ENC_COMP_MAX_POINTS[0]";       
       data.clear();
        data=data18;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           private void insert_19() {
       old_str_asset_def_body="N38000 $MA_MM_ENC_COMP_MAX_POINTS[1]";       
       data.clear();
        data=data19;
        insert_array();
      
    }
            private void insert_20() {
        old_str_asset_def_body="$AA_ENC_COMP_STEP[0]";        
        data.clear();
        data=data20;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
             private void insert_21() {
         old_str_asset_def_body="$AA_ENC_COMP_MIN[0]";       
         data.clear();
        data=data21;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
             private void insert_21_a() {
         old_str_asset_def_body="$AA_ENC_COMP_MIN[1]";       
         data.clear();
        data=data21_a;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
              private void insert_22() {
        old_str_asset_def_body="$AA_ENC_COMP_MAX[0]";          
        data.clear();
        data=data22;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
               private void insert_22_a() {
        old_str_asset_def_body="$AA_ENC_COMP_MAX[1]";          
        data.clear();
        data=data22_a;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
               private void insert_23() {
        old_str_asset_def_body="$AA_ENC_COMP_IS_MODULO[0]";  
         data.clear();
        data=data23;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                    private void insert_23_a() {
        old_str_asset_def_body="$AA_ENC_COMP_IS_MODULO[1]";  
        data.clear();
        data=data23_a;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         private void insert_24() {
        old_str_asset_def_body="$AA_ENC_COMP_STEP[1]";  
        data.clear();
        data=data24;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       private void insert_used() {
         //  here
        old_str_asset_def_body="N20070 $MC_AXCONF_MACHAX_USED";  
        //data.clear();
        data=data25;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
     private void delete_old_used(){
     String sql = " delete from  tbl_processed_table where col1 = ? AND col30 = ? ";
        //String sql = "TRUNCATE TABLE tbl_chandata";
         
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "$MC_AXCONF_MACHAX_USED");  
            pst.setString(2, chandata_loop);
            pst.execute();
           // JOptionPane.showMessageDialog(null, "Drug Deleted");
          
            
        }
        catch (Exception e){
            //JOptionPane.showMessageDialog(null, e);        
        }
     }    
    private void finish_loops() {
                               
                               insert_13();
                               insert_12();
                               insert_15();
                               delete_old_used();
                               insert_used();
                               insert_4();
                               insert_14();
                               insert_1();
                               insert_2();
                               insert_16();
                               insert_17();                            
                                
                                insert_5();
                                insert_6();  
                               insert_3();
                               insert_0();
                               insert_6();
                               insert_7();
                               insert_8();
                               insert_18();
                               insert_19();                             
                               insert_20();
                               insert_24();
                               insert_21();
                               insert_21_a();
                               insert_22();
                                 insert_22_a();
                               insert_23();
                               insert_23_a();
                                
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
        process_continuing=0;
        //count_number_of_loops=0;
        ixx=0;
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
                                 
                                 
                                 data16 = new ArrayList<String>(int_array_size_for_used);
                                 data17 = new ArrayList<String>(int_array_size_for_used);
                                 data18 = new ArrayList<String>(int_array_size_for_used);
                                 data19 = new ArrayList<String>(int_array_size_for_used);
                                 data20 = new ArrayList<String>(int_array_size_for_used);
                                 data21 = new ArrayList<String>(int_array_size_for_used);
                                 data22 = new ArrayList<String>(int_array_size_for_used);
                                 data23 = new ArrayList<String>(int_array_size_for_used);
                                // data25 = new ArrayList<String>(); 
                                 
                                 data21_a = new ArrayList<String>(int_array_size_for_used);
                                 data22_a = new ArrayList<String>(int_array_size_for_used);
                                 data23_a = new ArrayList<String>(int_array_size_for_used);
                                 
                                 data24 = new ArrayList<String>(int_array_size_for_used);
                                 data25 = new ArrayList<String>(int_array_size_for_used);
                                 // 
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
                                         data16.add("");
                                         data17.add("");
                                         data18.add("");
                                         data19.add("");
                                         data20.add("");
                                         data21.add("");
                                         data21_a.add("");
                                         data22.add(""); 
                                          data22_a.add(""); 
                                         data23.add("");
                                          data23_a.add("");
                                         data24.add("");
                                         data25.add("");
                                            }
                                int xx =data_used_only_xx.size(); 
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
               // str_asset_def_body="";
               // row_number=row_number+1;
               // System.out.println(row_number);   
               // fl_row_number = (double) row_number;
               // fl_cnt = (double) cnt;         
              //  per_pr=  (fl_row_number/(fl_cnt))*100;  
               // per_pr=per_pr/3;
               // DecimalFormat d_per_pr = new DecimalFormat("##.00000");
               // String str_per_pr =d_per_pr.format(per_pr);
                //String str_per =per_pr+" %";
              
                //row_of_rows = "[ "+data_chabdata_count.size()+" CHANNELS "+" ] [ "+ str_per_pr +" %"+" ]";
                str_global_count="Rendering file. Please wait !";
                //System.out.println(str_global_count);
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
                                pst.setString(2, line);
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
    data_used_name.clear();   
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
   data16.clear();     
   data17.clear();
   data18.clear();  
    data19.clear();
   data20.clear();     
   data21.clear();
   data22.clear(); 
   data23.clear(); 
   data24.clear();   
   data_used_only_indices.clear(); 
   data_used_only_xx.clear();
   //data11.clear();
   size_store.clear();
   //size_store.clear();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_table_transition() {
        pick_chan_name();
        String xxx=chandata_loop;
        String xxx2=str_chan_name;
        String strs_parent_insert="";
       for(int i=0; i<3; i++ ){
           if(i==0){
               strs_parent_insert="";
          // chandata_loop="";
          // str_chan_name="";
           }else if(i==1){
           strs_parent_insert=xxx;
          // str_chan_name="";
           }else{
           //chandata_loop="";
         strs_parent_insert=xxx2;
           }
           
            String sql = "insert into tbl_processed_table(col1, col2, col3, col4,col5,col6, col7, col8, col9,col10,col11, col12,col13, col14, col15,col16, col17, col18, col19,col20,col21, col22, col23, col24,col25,col26, col27, col28, col29, col30) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
     
  
    try {
       pst = conn.prepareStatement(sql);
            pst.setString(1, strs_parent_insert);
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
            pst.setString(30, "");   
           

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
                           // data_used_only_indices=data_used_only_indices_1;
                            System.out.println(data_used_only_indices);
                           data=data_used_only_indices;
                          // insert_column_size();                                
                           insert_array_2();
                          // used_inserted_status=1;
                          
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_used_values_row() {
                        int ss = data_used_only_xx.size();
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

  
 
    private void open_choose_used_axis() {
        insert_used_only_names();
        if(int_loop_part_1==0){
         int_loop_part_1=1;
         set_check_box();
       // AI.set_complete_part1();
        
        }
        set_check_box();
        stop_timer();
        int p = JOptionPane.showConfirmDialog(null,"Do you want to choose axes for "+chandata_loop+" ?");
if (p==0){
    set_check_box();
 btnContinue.setVisible(true);
}else if(p==1)
{
  continue_with_loop();
}else if(p==2)
{
continue_with_loop();
}
else{}
    // JOptionPane.showMessageDialog(null, "Choose axes and press continue button!!");
  // JOptionPane.showMessageDialog(null, p+"");
       // Checkbox_control c_cont = new Checkbox_control();
        //c_cont.setVisible(true);
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void upate_action() {
        
        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                //current.setText(now());
            }
        };
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void reset_variables() {
        
      reset_varaiables();  
        
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    



    
    
}
