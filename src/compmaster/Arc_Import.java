   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compmaster;


import java.awt.Desktop;
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
import java.sql.Array;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.UUID;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.StringJoiner;

import java.util.TimerTask;

import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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
      int active_state=0;
      SwingWorker SW1;
      SwingWorker SW2;
      String filenamex="";
     String loop1_global_count="";
     int int_data_chabdata_count=0;
     int stop_timer_status=0;
     int compesation_segments=0;
     String str_data_chabdata_count="";
     static int non_zero_columns=0; 
     Timer timer_universal;
   static Connection conn = null;
    static ResultSet rs = null;     
    static int ixx_1=0;
   static PreparedStatement pst = null;    
   ArrayList<String> arr1;
    //static String pathx ="n/a";     
   public  String pathxx="";
   public  String pathxx2="";
  //  static String pathxx_1="";
    String str_progress_bar_str="0",filenamexx="";
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
    static  ArrayList<String> compesation_data_1;
    static  ArrayList<String> compesation_data_2;
    static  ArrayList<String> compesation_errors;
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
   String  header_part1="",header_part2="",header_part3="",header_part4="";
   String  body_part1="",body_part2="",body_part3="",body_part4="";
   String  footer_1_1="",footer_1_2="",footer_1_3="",footer_1_4="",footer_1_5="";
   String footer_2_1="", footer_2_2="",footer_2_3="",footer_2_4="";
   String comp_body="", int_max="",int_min="",int_step="";
   int  error_collect_status=0;
   String txt_file_path="";
    public Arc_Import() {
        initComponents();
        
     full_scren();
      setIcon();
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
        btn_conf_file = new javax.swing.JButton();
        btn_raw_tbl = new javax.swing.JButton();
        btn_impo_compesation = new javax.swing.JButton();
        btn_normalize = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        txt_path2 = new javax.swing.JTextField();
        lbl_per = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Output Table"));
        jPanel2.setToolTipText("");

        SqliteDataTable.setBackground(new java.awt.Color(0, 0, 0));
        SqliteDataTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
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
                .addComponent(jScrollPane1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Controls"));

        btn_conf_file.setBackground(new java.awt.Color(204, 204, 204));
        btn_conf_file.setText("Import Configuration file.");
        btn_conf_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conf_fileActionPerformed(evt);
            }
        });

        btn_raw_tbl.setText("View raw table");
        btn_raw_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_raw_tblMouseClicked(evt);
            }
        });
        btn_raw_tbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raw_tblActionPerformed(evt);
            }
        });

        btn_impo_compesation.setBackground(new java.awt.Color(204, 204, 204));
        btn_impo_compesation.setText("Import ENC compesation file");
        btn_impo_compesation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_impo_compesationActionPerformed(evt);
            }
        });

        btn_normalize.setText("View processed table");
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

        txt_path2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_path2.setText("Path 2");
        txt_path2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_path2ActionPerformed(evt);
            }
        });

        lbl_per.setBackground(new java.awt.Color(0, 0, 0));
        lbl_per.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_per.setForeground(new java.awt.Color(255, 255, 255));
        lbl_per.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_per.setOpaque(true);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Export Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_per, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_impo_compesation, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_normalize, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_conf_file, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_path2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_raw_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_normalize, btn_raw_tbl});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_conf_file)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_impo_compesation)
                    .addComponent(txt_path2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_normalize)
                    .addComponent(btn_raw_tbl))
                .addComponent(lbl_per, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        CheckBoxes.setBorder(javax.swing.BorderFactory.createTitledBorder("Select axes."));

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
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk12, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk18, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk24, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckBoxesLayout.createSequentialGroup()
                        .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chk25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chk26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chk27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chk28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chk29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(chk30)
                        .addGap(1, 1, 1))
                    .addGroup(CheckBoxesLayout.createSequentialGroup()
                        .addComponent(btnContinue, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addGap(91, 91, 91)))
                .addGap(2, 2, 2))
        );
        CheckBoxesLayout.setVerticalGroup(
            CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckBoxesLayout.createSequentialGroup()
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckBoxesLayout.createSequentialGroup()
                        .addContainerGap()
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
                            .addComponent(chk30)
                            .addGap(163, 163, 163))
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
                                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CheckBoxesLayout.createSequentialGroup()
                                        .addComponent(chk19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheckBoxesLayout.createSequentialGroup()
                                        .addComponent(chk25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk29)
                                        .addGap(9, 9, 9)))
                                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnContinue)
                                    .addComponent(chk24))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBoxes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckBoxes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );

        setSize(new java.awt.Dimension(920, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_impo_compesationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_impo_compesationActionPerformed
         path.setText("Path");
      //  extract_data();
        select_file_2();
        //trigger_thread();
           //JOptionPane.showMessageDialog(null, "Not Running");
       
      // new Thread(new Compmaster_Loop2()).start();
        
       
    }//GEN-LAST:event_btn_impo_compesationActionPerformed
 private void extract_data(){
 if(process_continuing==0){
          process_continuing=1;         
                 
              
                 reset_variables();
                 start_program(); 
              
     
         }else{
         JOptionPane.showMessageDialog(null, "Similar Process is Running !");
         
         }
 }
   private void extract_data_2(){
 if(process_continuing==0){
          process_continuing=1;         
                 
            //  herer
               //  reset_variables();
                 start_program_2(); 
              
     
         }else{
         JOptionPane.showMessageDialog(null, "Similar Process is Running !");
         
         }
 } 
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
                              clearx3();
                              clear_col_size();                              
                              count_chandata_types();
                              start_loop_par1();
  
  
  }
   private void start_program_2(){
                              stop_timer_status=1;
                              pathxx2=txt_path2.getText().toString().trim();
                              starts_progress_bar();                     // reset_varaiables();
                              start_timer2();   
                              
                            //  clearx();
                             // clearx2();
                              //clear_col_size();                              
                             // count_chandata_types();
                              start_loop_par1_2();
  
  
  } 
    public void start_timer2(){
        
     timer_universal = new Timer (500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
               // current.setText(now());
                //System.out.println("Called");
                // txtpatid.setText(str_global_count);
                 lbl_per.setText(str_global_count);
                 
                // UpdateJTable();
        // update_progress();
                 
                 update_table_2();
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
    private void btn_conf_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conf_fileActionPerformed
        // TODO add your handling code here:
       // disable_btns();
        
       
        if(active_state==0){
               select_file();
               // clear_arrays();

        }else if(active_state > 0){
                clear_arrays();
                select_file();
                
        }else{
                
                }
        active_state=active_state+1;
    }//GEN-LAST:event_btn_conf_fileActionPerformed

    private void pathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathActionPerformed
        // TODO add your handling code here:
                
             JOptionPane.showMessageDialog(null, "Called");
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
                                 compesation_data_1 = new ArrayList<String>();
                                 compesation_data_2 = new ArrayList<String>();
                                 arr1 = new ArrayList<String>();
                                 compesation_errors= new ArrayList<String>();
                                 used_inserted_status=0;
                              //  List<Integer> myArrayList = new ArrayList<>(100);                           
                                  used_chennel_count=0;
                                  
                                  
        int_loop_part_1=0;
        btnContinue.setVisible(false);
       hide_all_checkboxes();
        // create_myDB() 
          
         conn = mysqlconnect.ConnectDb();  
       
     
        update_table_2();
        //disable_btns();
       //  set_jtables();
       // UpdateJTable();
        //update_combo();
      // 
    }//GEN-LAST:event_formWindowOpened

    private void SqliteDataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SqliteDataTableMouseClicked
        // TODO add your handling code here:
           // fetch_field_id();
    }//GEN-LAST:event_SqliteDataTableMouseClicked

    private void btn_raw_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_raw_tblMouseClicked
        // TODO add your handling code here:
        
        UpdateJTable();
    }//GEN-LAST:event_btn_raw_tblMouseClicked
 private static void set_jtables() {
        TableColumnModel columnModel = SqliteDataTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(350);
        columnModel.getColumn(0).setMaxWidth(350);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(1).setMaxWidth(150);
      
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void btn_raw_tblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raw_tblActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_btn_raw_tblActionPerformed

    private void btn_normalizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_normalizeMouseClicked
        // TODO add your handling code here:
       // open_result_Jframe();
        //UpdateJTable();
    }//GEN-LAST:event_btn_normalizeMouseClicked

    private void btn_normalizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_normalizeActionPerformed
        // TODO add your handling code here:
        
       
        select_col_size();
        update_table_2();
        
       // insert_array();
       
    }//GEN-LAST:event_btn_normalizeActionPerformed

    private void txt_path2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_path2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_path2ActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
        JFileChooser chooser =new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filenamex=f.getAbsolutePath();
       // JOptionPane.showMessageDialog(null, filename+".mdf");
        txt_file_path=filenamex+".mdf";
       // save_txt_2();
        try {
      File myObj = new File(txt_file_path);
      if (myObj.createNewFile()) {
         // JOptionPane.showMessageDialog(null, "File created: " );
          save_txt_2();
      //  System.out.println("File created: " + myObj.getName());
      } else {
        //  JOptionPane.showMessageDialog(null, "File already exists." );
          save_txt_2();
        //System.out.println("File already exists.");
      }
    } catch (IOException e) {
      //System.out.println("An error occurred.");
      JOptionPane.showMessageDialog(null, "An error occurred." );
      e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed
  
    
    private void open_explorer(){
    Desktop desktop = Desktop.getDesktop();
        File dirToOpen = null;
        try {
                        System.out.println(filenamex);
           // filenamexx  = filenamex.substring(0, filenamex.lastIndexOf(""));   
            //////////////////////////////////
           String pp="\\"; 
      filenamexx = filenamex.substring(0, filenamex.lastIndexOf(pp));
      System.out.println(filenamexx);
            ///////////////////
            filenamexx=filenamexx+"\\";
            System.out.println(filenamexx);
            dirToOpen = new File(filenamexx);
    try {
        desktop.open(dirToOpen);
    } catch (IOException ex) {
        Logger.getLogger(Arc_Import.class.getName()).log(Level.SEVERE, null, ex);
    }
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        }
    }
    private void save_txt(){
    try{
        File file = new File(txt_file_path);
        if(!file.exists()){
        file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        for(int i=0; i < SqliteDataTable.getRowCount(); i++){
            for(int j=0; j < SqliteDataTable.getColumnCount(); j++){
            bw.write(SqliteDataTable.getModel().getValueAt(i,  j)+" ");
            }
            bw.write("\n____________\n");
        }
        bw.close();
        fw.close();
        JOptionPane.showMessageDialog(null, "");
        }catch (Exception e){
        e.printStackTrace();
        }
   }
     private void save_txt_2(){
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(txt_file_path)))) {
    StringJoiner joiner = new StringJoiner(",");
    for (int col = 0; col < SqliteDataTable.getColumnCount(); col++) {
        joiner.add(SqliteDataTable.getColumnName(col));
    }
    System.out.println(joiner.toString());
    bw.write(joiner.toString());
    bw.newLine();
    for (int row = 0; row < SqliteDataTable.getRowCount(); row++) {
        joiner = new StringJoiner(",");
        for (int col = 0; col < SqliteDataTable.getColumnCount(); col++) {
            Object obj = SqliteDataTable.getValueAt(row, col);
            String value = obj == null ? "null" : obj.toString();
            joiner.add(value);
        }
        System.out.println(joiner.toString());
        bw.write(joiner.toString());
        bw.newLine();
    }
} catch (IOException exp) {
    exp.printStackTrace();
}
    JOptionPane.showMessageDialog(null, "File Created Successfully!" );
    open_explorer();
   }
     
     private void open_folder_p(){
     
     }
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
                
                
                
               // set_theme();
            }

            private void set_theme() {
                try {
               // UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");//good
                   // UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                   // UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                  //  UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                    UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");//good
                     //UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
                     
                    // UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                   // UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
                   // UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
                   // UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");//good
                   // UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(HomepageWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(HomepageWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(HomepageWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(HomepageWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CheckBoxes;
    private static javax.swing.JTable SqliteDataTable;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btn_conf_file;
    private javax.swing.JButton btn_impo_compesation;
    private javax.swing.JButton btn_normalize;
    private javax.swing.JButton btn_raw_tbl;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_per;
    private javax.swing.JTextField path;
    private javax.swing.JTextField txt_path2;
    // End of variables declaration//GEN-END:variables
   
  private void create_tbl_chandata() {
        Statement stat;
    try {
        stat = conn.createStatement();
         String sql1="CREATE TABLE IF NOT EXISTS tbl_chandata (\n" +
"    id INTEGER NOT NULL CONSTRAINT id PRIMARY KEY AUTOINCREMENT,\n" +
"  chandata_code varchar(100) NOT NULL,\n" +
"  chandata varchar(100) NOT NULL,\n" +
"  asset_number varchar(400) NOT NULL,\n" +
"  str_asset_body varchar(100) NOT NULL,\n" +
"  str_def_asset_body varchar(100) NOT NULL,\n" +
"  asset_status varchar(100) NOT NULL,\n" +
"  pos_counter varchar(8) NOT NULL\n" +

");";
          // stat.executeUpdate("create table IF NOT EXISTS  people (name, tel, email);");
             stat.executeUpdate(sql1);
    } catch (SQLException ex) {
      //  Logger.getLogger(Sqlite_Crud.class.getName()).log(Level.SEVERE, null, ex);
    }}
  private void create_tbl_channel_names() {
        Statement stat;
    try {
        stat = conn.createStatement();
         
           stat.executeUpdate("CREATE TABLE IF NOT EXISTS tbl_channel_names (\n" +
"    id INTEGER NOT NULL CONSTRAINT id PRIMARY KEY AUTOINCREMENT,\n" +
"  chandata varchar(100) NOT NULL,\n" +
"  chan_name varchar(100) NOT NULL\n" +

");");
         
    } catch (SQLException ex) {
       // Logger.getLogger(Sqlite_Crud.class.getName()).log(Level.SEVERE, null, ex);
    }}
  private void create_tbl_col_size() {
        Statement stat;
    try {
        stat = conn.createStatement();
         
          stat.executeUpdate("CREATE TABLE IF NOT EXISTS tbl_col_size (\n" +
"    id INTEGER NOT NULL CONSTRAINT id PRIMARY KEY AUTOINCREMENT,\n" +
"  count int(30) DEFAULT NULL\n" +

");");
          
    } catch (SQLException ex) {
       // Logger.getLogger(Sqlite_Crud.class.getName()).log(Level.SEVERE, null, ex);
    }}
  private void create_tbl_processed_table() {
        Statement stat;
    try {
        stat = conn.createStatement();
         String sql="CREATE TABLE IF NOT EXISTS tbl_processed_table (\n" +
                "    id INTEGER NOT NULL CONSTRAINT id PRIMARY KEY AUTOINCREMENT,\n" +
               "  col1 varchar(100) NOT NULL,\n" +
                "  col2 varchar(100) NOT NULL,\n" +
                "  col3 varchar(100) NOT NULL,\n" +
                "  col4 varchar(100) NOT NULL,\n" +
                "  col5 varchar(100) NOT NULL,\n" +
                "  col6 varchar(100) NOT NULL,\n" +
                "  col7 varchar(100) NOT NULL,\n" +
                "  col8 varchar(100) NOT NULL,\n" +
                "  col9 varchar(100) NOT NULL,\n" +
                "  col10 varchar(100) NOT NULL,\n" +
                 "  col11 varchar(100) NOT NULL,\n" +
                    "  col12 varchar(100) NOT NULL,\n" +
                    "  col13 varchar(100) NOT NULL,\n" +
                    "  col14 varchar(100) NOT NULL,\n" +
                    "  col15 varchar(100) NOT NULL,\n" +
                    "  col16 varchar(100) NOT NULL,\n" +
                    "  col17 varchar(100) NOT NULL,\n" +
                    "  col18 varchar(100) NOT NULL,\n" +
                    "  col19 varchar(100) NOT NULL,\n" +
                    "  col20 varchar(100) NOT NULL,\n" +
                    "  col21 varchar(100) NOT NULL,\n" +
                    "  col22 varchar(100) NOT NULL,\n" +
                    "  col23 varchar(100) NOT NULL,\n" +
                    "  col24 varchar(100) NOT NULL,\n" +
                    "  col25 varchar(100) NOT NULL,\n" +
                    "  col26 varchar(100) NOT NULL,\n" +
                    "  col27 varchar(100) NOT NULL,\n" +
                    "  col28 varchar(100) NOT NULL,\n" +
                    "  col29 varchar(100) NOT NULL,\n" +
                    "  col30 varchar(100) NOT NULL\n" +

                ");";
          // stat.executeUpdate("create table IF NOT EXISTS  people (name, tel, email);");
           stat.executeUpdate(sql);
    } catch (SQLException ex) {
       // Logger.getLogger(Sqlite_Crud.class.getName()).log(Level.SEVERE, null, ex);
    }}
  
    static void UpdateJTable(){
        
        //SqliteDataTable = new javax.swing.JTable();
     String sql = "select id AS '..' ,chandata AS '..', asset_number AS '..',str_def_asset_body AS '..', asset_status AS '..', pos_counter as '..' from tbl_chandata";
     try{
    pst = conn.prepareStatement(sql);
    rs = pst.executeQuery();
    SqliteDataTable.setModel(DbUtils.resultSetToTableModel(rs));    
}
     catch (Exception e){
    // JOptionPane.showMessageDialog(null, e);
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
  //   JOptionPane.showMessageDialog(null, e);
     }
 }  
    private void search_table() {
         String sql = "select id,chandata, asset_number,str_def_asset_body as asset_def_error_body, asset_status, pos_counter as position from tbl_chandata where chandata = '"+txt_path2.getText()+"'";
     try{
    pst = conn.prepareStatement(sql);
    rs = pst.executeQuery();
    SqliteDataTable.setModel(DbUtils.resultSetToTableModel(rs));    
}
     catch (Exception e){
    // JOptionPane.showMessageDialog(null, e);
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
    // JOptionPane.showMessageDialog(null, e);
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
            txt_path2.setText(add1);
            
           
        
        }
        catch (Exception e){
           // JOptionPane.showMessageDialog(null, e); 
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
        txt_path2.setText(loop1_global_count);
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
private void select_file_2() {
        process_continuing=0;
        JFileChooser chooser =new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        pathxx2 =filename;
        txt_path2.setText(filename);
         extract_data_2();       
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void select_file() {
        process_continuing=0;
        JFileChooser chooser =new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        pathxx =filename;
        path.setText(filename);
         extract_data();       
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
        btnContinue.setVisible(true);
        
        
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
private boolean start_loop_par1_2(){
   SW1= new SwingWorker(){

            @Override
            protected Object doInBackground() throws Exception {
                //your code here
                
                 ///////////////////////////////
                             int_data_chabdata_count=data_chabdata_count.size();
                             
                            
                                         
                                    // count_number_of_loops=count_number_of_loops;
                                     //start_timer();
                                     insert_table_transition_2();
                                     countLines();
                                     insert_used_compesation(); 
                                    
                                     
                               
                              
                              ///////////////insert_used_compesation()////////////////
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

      
       
       };
                            
        SW1.execute();                     
                              return true;
    
    }

 private boolean insert_used_compesation() {
           
         
         // String part5="$AA_ENC_COMP";
     //
         try{        
         String pxx=pathxx2;     
         FileReader fileReader = new FileReader(pathxx2);
         try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      //String line;
         while((line = bufferedReader.readLine()) != null) {
         
                str_global_count="Compensating data.";
               // String input = line;     //input string
                 comp_body=line.replaceAll("\\s+","");
                 comp_body=comp_body.toLowerCase();
                 if(comp_body.contains("referenceposition"))
                 {
                 
                 }else if(comp_body.contains("compensationstart"))
                 {
                   int_min=comp_body.replaceAll("([a-z])", "");
                 ///  JOptionPane.showMessageDialog(null, int_min+"Min");
                 }
                 else if(comp_body.contains("compensationend"))
                 {
                   int_max=comp_body.replaceAll("([a-z])", "");
                 //  JOptionPane.showMessageDialog(null, int_max+"Max");
                 }
                 else if(comp_body.contains("compensationspacing"))
                 {
                   int_step=comp_body.replaceAll("([a-z])", "");
                   //JOptionPane.showMessageDialog(null, int_step+"Step");
                 }
                 else if(comp_body.contains("axisposition"))
                 {
                   error_collect_status=1;
                   //JOptionPane.showMessageDialog(null, int_step+"Step");
                 }
                 else if(comp_body.contains("compensationoutput"))
                 {
                   error_collect_status=0;
                   //JOptionPane.showMessageDialog(null, int_step+"Step");
                 }
                 else if (error_collect_status==1 && !comp_body.equals("")){
                 compesation_errors.add(comp_body);
                 }
                 else{
                 
                 }
                 
                 //System.out.println(comp_body);
               // JOptionPane.showMessageDialog(null, comp_body);
      }  
        // JOptionPane.showMessageDialog(null, "My errors "+compesation_errors);
         calculate_segments();
         select_row();
         select_row_0();
         add_header_array();
         add_body_array();
         add_footer_1_array();
         add_footer_2_array();
         
         insert_compes();
         
    }
    }catch(Exception e){
    
    }
         
       
        return true;
     
        
       }
 private void calculate_segments(){
     String int_min_xc=int_min.replaceAll("[^0-9]", "");
    String int_max_xc=int_max.replaceAll("[^0-9]", "");
    String int_step_xc=int_step.replaceAll("[^0-9]", "");
     
     int mincc = Integer.parseInt(int_min_xc);
     int maxcc = Integer.parseInt(int_max_xc);
     int stepcc = Integer.parseInt(int_step_xc);
     //int_min
     //int_max
     ///int_step
compesation_segments=(mincc+mincc)/stepcc;
 }
 private void select_row_0(){
     
     
     try{
            String sql = "select * from tbl_enc_comp_compesation WHERE comp_min_0='"+int_min+"' AND comp_max_0='"+int_max+"' AND  comp_step_1='"+int_step+"' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();    
            if (rs.next()) {
                
                String minxx = rs.getString("comp_min_0");  
                   String maxxx = rs.getString("comp_max_0"); 
                   String stepxx = rs.getString("comp_step_0"); 
                   String ax =rs.getString("logic_machax");
                    String modulo =rs.getString("enc_comp_is_modulo_0");
                   String backlash =rs.getString("ma_backlash_0");
                     String str_enc_com_ena =rs.getString("ma_enc_comp_enabled_0");
                   
                   
                  header_part1="$MA_ENC_COMP_ENABLED[0]="; 
                  header_part2="NEWCONF";
                  header_part3="";
                  header_part4=rs.getString("chandata"); 
                  
                   body_part2="0";
                   body_part3 = rs.getString("logic_machax");
                   body_part1="$AA_ENC_COMP";
                   body_part4="";
                   
                    footer_1_1="$AA_ENC_COMP_STEP[0,"+ax+ "]="+stepxx;
                   footer_1_2="$AA_ENC_COMP_MIN[0]="+minxx ;
                   footer_1_3="$AA_ENC_COMP_MAX[0]="+maxxx;
                   footer_1_4="$AA_ENC_COMP_IS_MODULO[0]="+modulo;
                   footer_1_5="";
                   
                   
                   
                   footer_2_1="$MA_BACKLASH[0,"+ax+"]="+backlash;
                   footer_2_2="$MA_ENC_COMP_ENABLE[0]="+str_enc_com_ena;
                   footer_2_3="NEWCONF";
                   footer_2_4="M17";
                  // JOptionPane.showMessageDialog(null, minxx+" "+maxxx+" "+stepxx);
            
               }else{
           // JOptionPane.showMessageDialog(null, "No data");
            }    
   }
   catch (SQLException ex){
System.out.println(ex.getMessage());
JOptionPane.showMessageDialog(null, ex.getMessage());
     }}
 private void select_row(){
     
     
     try{
         
         //String sql = "select * from tbl_enc_comp_compesation";
            String sql = "select * from tbl_enc_comp_compesation WHERE comp_min_1='"+int_min+"' AND comp_max_1='"+int_max+"' AND  comp_step_1='"+int_step+"' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();  
         //   String minxxg = rs.getString("comp_min_1");  
                 //  String maxxxg = rs.getString("comp_max_1");
            if (rs.next()) {
                   String minxx = rs.getString("comp_min_1");  
                   String maxxx = rs.getString("comp_max_1"); 
                   String stepxx = rs.getString("comp_step_1"); 
                   String ax =rs.getString("logic_machax");
                   String modulo =rs.getString("enc_comp_is_modulo_1");
                   String backlash =rs.getString("ma_backlash_1");
                     String str_enc_com_ena =rs.getString("ma_enc_comp_enabled_1");
                   
                   
                  header_part1="$MA_ENC_COMP_ENABLED[1]="+str_enc_com_ena; 
                  header_part2="NEWCONF";
                  header_part3="";
                  header_part4=rs.getString("chandata"); 
                  
                   body_part2="1";
                   body_part3 = rs.getString("logic_machax");
                   body_part1="$AA_ENC_COMP";
                   body_part4="";
                   
                    footer_1_1="$AA_ENC_COMP_STEP[1,"+ax+ "]="+stepxx;
                   footer_1_2="$AA_ENC_COMP_MIN[1]="+minxx ;
                   footer_1_3="$AA_ENC_COMP_MAX[1]="+maxxx;
                   footer_1_4="$AA_ENC_COMP_IS_MODULO[1]="+modulo;
                   footer_1_5="";
                   
                   
                   
                   footer_2_1="$MA_BACKLASH[1,"+ax+"]="+backlash;
                   footer_2_2="$MA_ENC_COMP_ENABLE[1]="+str_enc_com_ena;
                   footer_2_3="NEWCONF";
                   footer_2_4="M17";
                   
                   
                 
            
                  // JOptionPane.showMessageDialog(null, minxx+" "+maxxx+" "+stepxx);
            
               }else{
           // JOptionPane.showMessageDialog(null, "No data");
            }    
   }
   catch (SQLException ex){
System.out.println(ex.getMessage());
JOptionPane.showMessageDialog(null, ex.getMessage());
     }
     
     
     
    /* String sql = "select * from tbl_enc_comp_compesation WHERE comp_min_1=?,comp_max_1=?, comp_step_1=? ";
       
        try{
            pst = conn.prepareStatement(sql);            
            pst.setString(1, int_min);
            pst.setString(2, int_max);
            pst.setString(3, int_step);
            rs = pst.executeQuery();  
           
            if (rs.next()) {
            String min = rs.getString("comp_min_1");  
            String max = rs.getString("comp_max_1"); 
            String step = rs.getString("comp_step_1"); 
            
            JOptionPane.showMessageDialog(null, min+" "+max+" "+step);
            }else{
            JOptionPane.showMessageDialog(null, "No data found");
            }
            }
            catch (Exception e)
            {
            }*/
     
     
    
         }
 private void add_header_array(){
     
     
         /* String header_part1="$MA_ENC_COMP_ENABLED[0]=0";
          String header_part2="NEWCONF";
          String header_part3="";
          String header_part4="CHANDATA(1)";*/
          int ixx=5;
         for(int i=0; i <ixx; i++){
         String dataxx="";
         if(i==0){
            dataxx=header_part1;
         }else if(i==1){
            dataxx=header_part2;
         }
         else if(i==2){
          dataxx=header_part3;
         }
          else if(i==3){
             dataxx=header_part4;
         }
         else{
         dataxx="";
         }
        compesation_data_1.add(dataxx);
       // System.out.println(compesation_data_1);
        }
 System.out.println("Header"+compesation_data_1);
 }
 private void add_body_array(){
     
        /*  String body_part1="$AA_ENC_COMP";
          String body_part2="1";
          String body_part3="AX1";
          String body_part4="0";*/
          int ixxb=compesation_segments;
 for(int i=0; i <ixxb+1; i++){
          String error_value =compesation_errors.get(i);
          String dataxx=body_part1+"["+body_part2+","+i+","+body_part3+"]"+"="+error_value;
        
        compesation_data_1.add(dataxx);
        
        }
  compesation_data_1.add("");
 System.out.println("body"+compesation_data_1);
 }
 
 private void add_footer_1_array(){
     
         /* String footer_1_1="$AA_ENC_COMP_STEP[0,AX1]=50";
          String footer_1_2="$AA_ENC_COMP_MIN[0]=100";
          String footer_1_3="$AA_ENC_COMP_MAX[0]=800";
          String footer_1_4="$AA_ENC_COMP_IS_MODULO[0]=0";
           String footer_1_5="";*/
          int ixx=5;
         for(int i=0; i <ixx; i++){
         String dataxx="";
         if(i==0){
            dataxx=footer_1_1;
         }else if(i==1){
            dataxx=footer_1_2;
         }
         else if(i==2){
          dataxx=footer_1_3;
         }
          else if(i==3){
             dataxx=footer_1_4;
         }
          else if(i==4){
             dataxx=footer_1_5;
         }
         else{
         dataxx="";
         }
        compesation_data_1.add(dataxx);
       // System.out.println(compesation_data_1);
        }
         System.out.println("footer_1"+compesation_data_1);
 }
 private void add_footer_2_array(){
     
        /*  String footer_2_1="$MA_BACKLASH[0,AX1]=0";
          String footer_2_2="$MA_ENC_COMP_ENABLE[0]=1";
          String footer_2_3="NEWCONF";
          String footer_2_4="M17";*/
         int ixx=5;
         for(int i=0; i <ixx; i++){
         String dataxx="";
         if(i==0){
            dataxx=footer_2_1;
         }else if(i==1){
            dataxx=footer_2_2;
         }
         else if(i==2){
          dataxx=footer_2_3;
         }
          else if(i==3){
             dataxx=footer_2_4;
         }
         else{
         dataxx="";
         }
        compesation_data_1.add(dataxx);
      //  System.out.println(compesation_data_1);
        }
         System.out.println("footer_2"+compesation_data_1);
 }
   private boolean start_loop_par1(){
   SW1= new SwingWorker(){

            @Override
            protected Object doInBackground() throws Exception {
                //your code here
                
                 ///////////////////////////////
                             int_data_chabdata_count=data_chabdata_count.size();
                             
                              for(ixx =ixx; ixx<int_data_chabdata_count; ixx++)
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
       
       };
                            
        SW1.execute();                     
                              return true;
    
    }
    ////////////functions//////////////
   public boolean continue_with_loop(){
      // str_asset_status=str.replaceAll("[^a-zA-Z0-9]", "");
    // data_used_name.clear();
   SW2= new SwingWorker(){

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
                                     // open_result_Jframe();
                                      ///JOptionPane.showMessageDialog(null, "Finished successfully!");
                                    reset_varaiables();
                                    clear_arrays();
                                    data_chabdata_count.clear();
                                    JOptionPane.showMessageDialog(null, "Finished successfully!");
                                    // enable_btns();
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

          
       
       };
       SW2.execute();                                
                                      
                              
                              
                             // Compmaster_Loop2 loop2 = new Compmaster_Loop2();
                             
                              //.showMessageDialog(null, "Finished successfully!");
    
     return true;
    }
    private void open_result_Jframe() {
              
              External_jframe ResultFrame = new External_jframe();
              ResultFrame.setVisible(true);
              
             // close();
             // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
           // JOptionPane.showMessageDialog(null, e);
        
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
     
     
      private void clearx3() {
        
         String sql = " delete from  tbl_enc_comp_compesation where id > ?";
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
              if(firstFourChars.equals("CHANDATA") || first6Char.equals("N20000") || first6Char.equals("N20070") ){
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
   //  JOptionPane.showMessageDialog(null, e);
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
                          
                         if(str_chandata.equals(chandata_loop) && used_chennel_count !=0){
                    
                   // insert_used_values_row();
                    open_choose_used_axis(); 
                    return true;
                           
                 }
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
                if(str_chandata.equals(chandata_loop) && used_chennel_count !=0){
                    
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
      // if(used_inserted_status==0){
            //  insert_used_values_row();
                         
             if(str_chandata.equals(chandata_loop) && used_chennel_count !=0){
                    
                   // insert_used_values_row();
                    open_choose_used_axis(); 
                    return true;
                           
                 } 
            // return true;
      // }
  //  used_inserted_status=0;   
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
   //  JOptionPane.showMessageDialog(null, e);
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
         SW1.cancel(true);           
         SW2.cancel(true);
        // SW1.addPropertyChangeListener(null);
         create_muliti_dimentional_array();
         finish_loops();
        
         stop_threads();
      
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
                               // JOptionPane.showMessageDialog(null, e);
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
    
    private void insert_table_transition_2() {
        pick_chan_name();
        String xxx="";
        String xxx2=str_chan_name;
        String strs_parent_insert="";
       for(int i=0; i<3; i++ ){
           if(i==0){
             ///  strs_parent_insert="";
          // chandata_loop="";
          // str_chan_name="";
               xxx="";
           }else if(i==1){
               xxx=".";
         //  strs_parent_insert=xxx;
          // str_chan_name="";
           }else{
               xxx="";
           //chandata_loop="";
        /// strs_parent_insert=xxx2;
           }
           
            String sql = "insert into tbl_processed_table(col1, col2, col3, col4,col5,col6, col7, col8, col9,col10,col11, col12,col13, col14, col15,col16, col17, col18, col19,col20,col21, col22, col23, col24,col25,col26, col27, col28, col29, col30) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
     
  
    try {
       pst = conn.prepareStatement(sql);
           pst.setString(1, xxx);
            pst.setString(2, xxx);
            pst.setString(3, xxx);      
            pst.setString(4, xxx); 
            pst.setString(5, xxx);
            pst.setString(6, xxx);
            pst.setString(7, xxx);
            pst.setString(8, xxx);
            pst.setString(9, xxx);
            pst.setString(10, xxx);     
            pst.setString(11, xxx); 
            pst.setString(12, xxx);            
            pst.setString(13, xxx);       
            pst.setString(14, xxx); 
            pst.setString(15, xxx); 
            pst.setString(16, xxx);
            pst.setString(17, xxx);
            pst.setString(18, xxx);
            pst.setString(19, xxx);
            pst.setString(20, xxx);      
            pst.setString(21, xxx);
            pst.setString(22, xxx);            
            pst.setString(23, xxx);
            pst.setString(24, xxx);
            pst.setString(25, xxx);
            pst.setString(26, xxx);     
            pst.setString(27, xxx); 
            pst.setString(28, xxx);
            pst.setString(29, xxx); 
            pst.setString(30, xxx); 
           

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
        cont_2();
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
    private void cont_2(){
       // set_check_box();
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
    }
    private void reset_variables() {
        
      reset_varaiables();  
        
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("imag_small_2.png")));
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void create_db() {
       
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void stop_threads() {
          for (Thread t : Thread.getAllStackTraces().keySet()) 
          { 
              
            String xx =  t.getName();
            if(     xx.equals("Java2D Disposer")
                    || xx.equals("Reference Handler")     
                    || xx.equals("DestroyJavaVM")  
                    || xx.equals("Attach Listener")  
                    || xx.equals("Swing-Shell")  
                    || xx.equals("Signal Dispatcher")  
                    || xx.equals("TimerQueue")  
                    || xx.equals("MySQL Statement Cancellation Timer")  
                    || xx.equals("Finalizer")  
                    || xx.equals("AWT-Windows")  
                    || xx.equals("AWT-EventQueue-0")  
                    || xx.equals("AWT-Shutdown")  
                      || xx.equals("org.netbeans.modules.debugger.jpda.visual AWT Access Loop") 
                    
                    ){
                
               
                
                }else{
             try{
                  System.out.println(xx+"----------------------------------------------------------------------------"+xx);            
              //if (t.getState()==Thread.State.RUNNABLE) 
                 t.interrupt();
                
                }catch(Exception e){
            }
           
                     }
             
          } 
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void create_myDB() {
         String url = "jdbc:mysql://127.0.0.1:3306";
 //Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/compmaster", "root", "");
        // Defines username and password to connect to database server.
        String username = "root";
        String password = "";

        // SQL command to create a database in MySQL.
        String sql = "CREATE DATABASE IF NOT EXISTS compmaster3";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.execute();
            JOptionPane.showMessageDialog(null, "CREATED!");
        } catch (Exception e) {
            e.printStackTrace();
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void create_myTBL() {
        create_tbl_chandata();
create_tbl_channel_names();
create_tbl_col_size();
create_tbl_processed_table();
        update_table_2();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void disable_btns() {
        btn_impo_compesation.setEnabled(false);
        txt_path2.setEnabled(false);
        btn_normalize.setEnabled(false);
        btn_raw_tbl.setEnabled(false);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
private void enable_btns() {
        btn_impo_compesation.setEnabled(true);
        txt_path2.setEnabled(true);
        btn_normalize.setEnabled(true);
        btn_raw_tbl.setEnabled(true);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void insert_compes() {
        
        for(int i =0; i < compesation_data_1.size(); i++ ){
        String  str_compesation_data_1=compesation_data_1.get(i);
         String sql = "insert into tbl_processed_table(col1, col2, col3, col4,col5,col6, col7, col8, col9,col10,col11, col12,col13, col14, col15,col16, col17, col18, col19,col20,col21, col22, col23, col24,col25,col26, col27, col28, col29, col30) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
     
  
    try {
       pst = conn.prepareStatement(sql);
            pst.setString(1, str_compesation_data_1);
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
        // data.clear();
    }catch(Exception e){
    
    }      
        }
        compesation_data_1.clear();
       
compesation_errors.clear();
        clear_compesation_varia();
       JOptionPane.showMessageDialog(null, "Finished !!");
       stop_timer();
         
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void clear_compesation_varia() {
         header_part1="";header_part2="";header_part3="";header_part4="";
   body_part1="";body_part2="";body_part3="";body_part4="";
   footer_1_1="";footer_1_2="";footer_1_3="";footer_1_4="";footer_1_5="";
  footer_2_1=""; footer_2_2="";footer_2_3="";footer_2_4="";
  comp_body=""; int_max="";int_min="";int_step="";
   error_collect_status=0;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    




    private void create_muliti_dimentional_array() {
          
        String input="";
        for(int i=0; i<data5.size(); i++){
           
            input=data12.get(i);
            arr1.add(input);
            input=data5.get(i);
            arr1.add(input);
            input=data6.get(i);
            arr1.add(input);
            input=data20.get(i);
            arr1.add(input);
            input=data24.get(i);
            arr1.add(input);
            input=data21.get(i);
            arr1.add(input);
            input=data21_a.get(i);
            arr1.add(input);
            input=data22.get(i);
            arr1.add(input);
            input=data22_a.get(i);
            arr1.add(input);
            input=data23.get(i);
            arr1.add(input);
            input=data23_a.get(i);
            arr1.add(input);
            input=data16.get(i);
            arr1.add(input);
            input=data17.get(i);
            arr1.add(input);
             insert_compesations(); 
        
        }
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void insert_compesations() {
       // String compes_1,
          int lengx = arr1.size();      
        
     if(lengx > 0){
        String sql = "insert into tbl_enc_comp_compesation(logic_machax, comp_step_0, comp_step_1, comp_min_0,comp_min_1, comp_max_0, comp_max_1, chandata,ma_enc_comp_enabled_0,ma_enc_comp_enabled_1, new_conf,ma_backlash_0, ma_backlash_1,enc_comp_is_modulo_0,enc_comp_is_modulo_1,active_0_or_1) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
       // String //sql = "INSERT INTO nameTable (name) values (?)";
  
    try {
       pst = conn.prepareStatement(sql);
       
       
 
    String[] stringArray = arr1.toArray(new String[arr1.size()]);
    
             
                  try {    var1x=stringArray[0]; } catch (IndexOutOfBoundsException e) { var1x="n/a"; }
                  try {    var2x=stringArray[1]; } catch (IndexOutOfBoundsException e) { var2x="n/a"; }
                  try {    var3x=stringArray[2]; } catch (IndexOutOfBoundsException e) { var3x="n/a"; }
                  try {    var4x=stringArray[3]; } catch (IndexOutOfBoundsException e) { var4x="n/a"; }
                  try {    var5x=stringArray[4]; } catch (IndexOutOfBoundsException e) { var5x="n/a"; }
                  try {    var6x=stringArray[5]; } catch (IndexOutOfBoundsException e) { var6x="n/a"; }
                  try {    var7x=stringArray[6]; } catch (IndexOutOfBoundsException e) { var7x="n/a"; }
                  try {    var8x=stringArray[7]; } catch (IndexOutOfBoundsException e) { var8x="n/a"; }
                  try {    var9x=stringArray[8]; } catch (IndexOutOfBoundsException e) { var9x="n/a"; }
                  try {    var10x=stringArray[9]; } catch (IndexOutOfBoundsException e) { var10x="n/a"; }
                  try {    var11x=stringArray[10]; } catch (IndexOutOfBoundsException e) { var11x="n/a"; }
                  try {    var12x=stringArray[11]; } catch (IndexOutOfBoundsException e) { var12x="n/a"; }
                  try {    var13x=stringArray[12]; } catch (IndexOutOfBoundsException e) { var13x="n/a"; }
                   try {    var14x=stringArray[10]; } catch (IndexOutOfBoundsException e) { var14x="n/a"; }
                  try {    var15x=stringArray[11]; } catch (IndexOutOfBoundsException e) { var15x="n/a"; }
                  try {    var16x=stringArray[12]; } catch (IndexOutOfBoundsException e) { var16x="n/a"; }
                 
            pst.setString(1, var1x);
            pst.setString(2, var4x);
            pst.setString(3, var5x);       
            pst.setString(4, var6x);  
            pst.setString(5, var7x); 
            pst.setString(6, var8x);  
            pst.setString(7, var9x);
            pst.setString(8, chandata_loop);
            pst.setString(9, var2x);       
            pst.setString(10, var3x);  
            pst.setString(11, "NEWCONF"); 
            pst.setString(12, var12x); 
            pst.setString(13, var13x); 
             pst.setString(14, var10x); 
            pst.setString(15, var11x); 
            pst.setString(16, "n/a"); 
      
         
           

            pst.execute();  
      
            pst.close();         
             
         
    } catch (SQLException ex) {
        System.err.println("Error = " + ex);
    }
     
     }
    arr1.clear();
     
    }

    private void open_foler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
