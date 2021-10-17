   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compmaster;


import java.awt.Color;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.StringJoiner;

import java.util.TimerTask;
import java.util.prefs.Preferences;

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
      int loop_pass=0;
      SwingWorker SW1;
      SwingWorker SW2;
      String filenamex="";
      int verification_code_ren_stat=0;
      String old_body_cec_selected_axis="";
      String new_body_cec_selected_axis="";
      String str_index="";
      String last_chandata_loop="";
      int insert_code=0;
      int  proceed_code=0;
      String asset_code_dif_col="";
     String loop1_global_count="";
     int int_data_chabdata_count=0;
     int stop_timer_status=0;
     double compesation_segments=0;
     int diffInDays=0;
     int cec_comp_btn_number=0;
     int quick_finish_mode=0;
     String str_data_chabdata_count="";
     static int non_zero_columns=0; 
     Timer timer_universal;
     String body_cec_selected_axis="";
     String int_backlash="n/a";
     String exp_date="";
     String cec_str_header_1="",cec_str_header_2="",cec_str_footer_1="",cec_str_footer_2="",cec_str_footer_3="";
     int import_compesation_id=0;
   static Connection conn = null;
    static ResultSet rs = null;     
    static int ixx_1=0;
    int skip_all_id=0;
   static PreparedStatement pst = null;    
   ArrayList<String> arr1;
    ArrayList<String> arr2;
    //static String pathx ="n/a";     
   public  String pathxx="";
   public  String pathxx2="";
    public  String pathxx3="";
   
   int str_base_id_count_1=0;
   int str_base_id_count_2=0;
   int str_base_id_count_3=0;
   String str_chan_name_2="";
   String cec_footer_1_1="",cec_footer_1_2="",cec_footer_1_3,cec_footer_1_4="",cec_footer_1_5="",cec_footer_1_6="",cec_footer_1_7="",cec_footer_1_8="",cec_footer_1_9="",cec_footer_1_10="";
  //  static String pathxx_1="";
    String str_progress_bar_str="0",filenamexx="";
    ArrayList<String> datacheckbox;   
    String checkbox_index="";
     int int_checkbox_index=0;
     int process_continuing=0;
   private Thread PROGRESS_THREAD;
   private int PROGRESS_VALUE;
     int str_base_id=0;
    static String str_global_count="0%";
    String chandata_loop="";
    int used_inserted_status=0;
    String footer_2_footer_text="";
    int count_number_of_loops=1;
    int mpf_code=0;
    int cec_comp_count=0;
    int array_size_for_size_store=0;
    int  int_loop_part_1=0;
    String cec_minxx="",cec_maxxx="",cec_stepxx="",cec_cec_chandata="",cec_selected_axis="",cec_cec_input_ncu="",cec_cec_input_axis="",cec_cec_output_ncu="",cec_cec_output_axis="",cec_cec_direction="",cec_cec_mult_by_table="",cec_cec_is_modulo="";
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
     ArrayList<String> data25;
     
     
     ArrayList<String> data26_3rd;  
     ArrayList<String> data27_3rd;  
     ArrayList<String> data28_3rd;  
     ArrayList<String> data29_3rd;  


//Used second insert
     	String var35x="", var36x="", var37x="",	 var38x="", var39x="", 	 var40x="",  var41x="",  var42x="",  var43x="",	 var44x="",
                   var45x="", var46x="", var47x="", var48x="",var49x="", var50x="", var51x="", var52x="", var53x="",                 
                  var54x="", var55x="", var56x="", var57x="", var58x="", var59x="",  var60x="",    var61x="";
    static ArrayList<String> size_store;
    static ArrayList<String> cec_size_store;
    
    static ArrayList<String> data_chabdata_count;
    static  ArrayList<String> data_used_only_xx;
     static  ArrayList<String> data_used_only_indices;  
     
     
     static ArrayList<String> pivot_data_used_only_xx;
    static  ArrayList<String> pivot_data_used_only_indices;
     static  ArrayList<String> pivot_size_store;  
      
 
 
     
    static  ArrayList<String> cec_data_used_only_xx;  
     static  ArrayList<String> point_cec_data;  
   static  ArrayList<String> cec_data_used_only_indices;  
   
   static  ArrayList<String> data_used_name;
    static  ArrayList<String> compesation_data_1;
    static  ArrayList<String> temp_body_compesation_data_1;
    static  ArrayList<String> compesation_data_2;
    static  ArrayList<String> compesation_errors;
    
    
    ArrayList<String> cec_data_1;
    ArrayList<String> cec_data_2;
    ArrayList<String> cec_data_3;
    ArrayList<String> cec_data_4;
    ArrayList<String> cec_data_5;
    ArrayList<String> cec_data_6;
     ArrayList<String> cec_data_7;
     
     ArrayList<String> cec_data_8;
    ArrayList<String> cec_data_9;
    ArrayList<String> cec_data_10;
    ArrayList<String> cec_data_11;
    ArrayList<String> cec_data_12;
    ArrayList<String> cec_data_13;
     ArrayList<String> cec_data_14;
    
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
    String header_part5="";
    int status_used_sess_2 =0;
   String  header_part1="",header_part2="",header_part3="",header_part4="";
   String  body_part1="",body_part2="",body_part3="",body_part4="";
   String  footer_1_1="",footer_1_2="",footer_1_3="",footer_1_4="",footer_1_5="";
   String footer_2_1="", footer_2_2="",footer_2_3="",footer_2_4="",footer_2_5="",footer_2_6="";
   String comp_body="", int_max="",int_min="",int_step="";
   int  error_collect_status=0;
   String txt_file_path="";
    public Arc_Import() {
        initComponents();
       hide_all_checkboxes();
       hide_panels();
        hide_all_variable_fields();  
        cec_hide_all_variable_fields();
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
        lbl_per = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        CheckBoxes1 = new javax.swing.JPanel();
        txt_header1 = new javax.swing.JTextField();
        txt_header_1_1 = new javax.swing.JComboBox();
        txt_header_2 = new javax.swing.JComboBox();
        txt_header3 = new javax.swing.JTextField();
        txt_header4 = new javax.swing.JComboBox();
        txt_header5 = new javax.swing.JComboBox();
        txt_header6 = new javax.swing.JTextField();
        txt_header7 = new javax.swing.JComboBox();
        txt_header8 = new javax.swing.JTextField();
        txt_header9 = new javax.swing.JTextField();
        lbl_1 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_5 = new javax.swing.JLabel();
        lbl_6 = new javax.swing.JLabel();
        lbl_7 = new javax.swing.JLabel();
        lbl_9 = new javax.swing.JLabel();
        lbl_10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txt_header_chandata = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btn_exit_2 = new javax.swing.JButton();
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
        btnRemoveAll = new javax.swing.JButton();
        btn_exit_1 = new javax.swing.JButton();
        CheckBoxes2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        cec_lbl_8 = new javax.swing.JLabel();
        cec_lbl_9 = new javax.swing.JLabel();
        btn_next = new javax.swing.JButton();
        cec_lbl_7 = new javax.swing.JLabel();
        txt_cec_header_footer_3 = new javax.swing.JTextField();
        txt_cec_header_footer_4 = new javax.swing.JTextField();
        txt_cec_header_footer_5 = new javax.swing.JTextField();
        lbl_cechecderfoot_4 = new javax.swing.JLabel();
        lbl_cechecderfoot_5 = new javax.swing.JLabel();
        lbl_cechecderfoot_6 = new javax.swing.JLabel();
        txt_auto_5 = new javax.swing.JTextField();
        txt_auto_6 = new javax.swing.JTextField();
        txt_auto_7 = new javax.swing.JTextField();
        btn_exit_3 = new javax.swing.JButton();
        lbl_cechecderfoot_2 = new javax.swing.JPanel();
        cec_2 = new javax.swing.JComboBox();
        cec_lbl_2 = new javax.swing.JLabel();
        cec_lbl_3 = new javax.swing.JLabel();
        cec_lbl_5 = new javax.swing.JLabel();
        cec_lbl_4 = new javax.swing.JLabel();
        lbl_cechecderfoot_3 = new javax.swing.JLabel();
        cec_1 = new javax.swing.JComboBox();
        txt_cec_header_footer_1 = new javax.swing.JTextField();
        txt_cec_header_footer_2 = new javax.swing.JTextField();
        lbl_cechecderfoot_1 = new javax.swing.JLabel();
        lbl_12 = new javax.swing.JLabel();
        txt_auto_1 = new javax.swing.JTextField();
        txt_auto_2 = new javax.swing.JTextField();
        txt_auto_3 = new javax.swing.JTextField();
        txt_auto_4 = new javax.swing.JTextField();
        cec_lbl_6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compmaster V 1.1.3");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Output Table"));
        jPanel2.setToolTipText("");

        SqliteDataTable.setBackground(new java.awt.Color(0, 0, 0));
        SqliteDataTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        //jPanel1 = new RoundedPanel(10, new Color(40, 40, 40));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Input Controls"));

        btn_conf_file.setBackground(new java.awt.Color(204, 204, 204));
        btn_conf_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_icon/icon_imp1.png"))); // NOI18N
        btn_conf_file.setText("Import machine data file");
        btn_conf_file.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_conf_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_conf_fileActionPerformed(evt);
            }
        });

        btn_raw_tbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_icon/icon_view2.png"))); // NOI18N
        btn_raw_tbl.setText("View last extract");
        btn_raw_tbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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
        btn_impo_compesation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_icon/icon_imp2.png"))); // NOI18N
        btn_impo_compesation.setText("Import compesation file");
        btn_impo_compesation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_impo_compesation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_impo_compesationActionPerformed(evt);
            }
        });

        btn_normalize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_icon/icon_view.png"))); // NOI18N
        btn_normalize.setText("View ENC processed table");
        btn_normalize.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_normalize.setInheritsPopupMenu(true);
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

        lbl_per.setBackground(new java.awt.Color(0, 0, 0));
        lbl_per.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl_per.setForeground(new java.awt.Color(255, 255, 255));
        lbl_per.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_per.setOpaque(true);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_icon/icon_exp1.png"))); // NOI18N
        jButton1.setText("Export ENC / CEC  MPF file");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_icon/icon_view1.png"))); // NOI18N
        jButton2.setText("View CEC processed table");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setInheritsPopupMenu(true);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_normalize, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_conf_file, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_raw_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_impo_compesation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbl_per, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_conf_file)
                    .addComponent(btn_impo_compesation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_normalize)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_raw_tbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_per, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_conf_file, btn_impo_compesation, btn_normalize, btn_raw_tbl, jButton1, jButton2, jProgressBar1, lbl_per});

        CheckBoxes1.setBorder(javax.swing.BorderFactory.createTitledBorder("..."));
        CheckBoxes1.setOpaque(false);

        txt_header1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_header1.setText(";Header Text");

        txt_header_1_1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_header_1_1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AX1", "AX2", "AX3", "AX4", "AX5", "AX6", "AX7", "AX8", "AX9", "AX10", "AX11", "AX12", "AX13", "AX14", "AX15", "AX16", "AX17", "AX18", "AX19", "AX20", "AX21", "AX22", "AX23", "AX24", "AX25", "AX26", "AX27", "AX28", "AX29", "AX30" }));
        txt_header_1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_header_1_1ActionPerformed(evt);
            }
        });

        txt_header_2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_header_2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "$MA_ENC_COMP_ENABLE[0]=0", "$MA_ENC_COMP_ENABLE[0]=1", "$MA_ENC_COMP_ENABLE[1]=0", "$MA_ENC_COMP_ENABLE[1]=1" }));
        txt_header_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_header_2ActionPerformed(evt);
            }
        });

        txt_header3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_header3.setText("NEWCONF");
        txt_header3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_header3ActionPerformed(evt);
            }
        });

        txt_header4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_header4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1" }));
        txt_header4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_header4ActionPerformed(evt);
            }
        });

        txt_header5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_header5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1" }));
        txt_header5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_header5ActionPerformed(evt);
            }
        });

        txt_header6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_header6.setText(";End Text");

        txt_header7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_header7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "$MA_ENC_COMP_ENABLE[0]=0", "$MA_ENC_COMP_ENABLE[0]=1", "$MA_ENC_COMP_ENABLE[1]=0", "$MA_ENC_COMP_ENABLE[1]=1" }));
        txt_header7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_header7ActionPerformed(evt);
            }
        });

        txt_header8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_header8.setText("NEWCONF");

        txt_header9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_header9.setText("M7");

        lbl_1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_1.setText(";Header Text");

        lbl_2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_2.setText("$MN_AXCONF_LOGIC_MACHAX_TAB");

        lbl_4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_4.setText("NEWCONF");

        lbl_5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_5.setText("$AA_ENC_COMP_ENABLED[0]=0");

        lbl_6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_6.setText("$AA_ENC_COMP_IS_MODULO");

        lbl_7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_7.setText(";End Text");

        lbl_9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_9.setText("NEWCONF");

        lbl_10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_10.setText("M7");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_icon/next_st.png"))); // NOI18N
        jButton3.setText("Next ");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        txt_header_chandata.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_header_chandata.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CHANDATA(1)", "CHANDATA(2)", "CHANDATA(3)" }));
        txt_header_chandata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_header_chandataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("CHANDATA");

        btn_exit_2.setText("Exit");
        btn_exit_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exit_2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CheckBoxes1Layout = new javax.swing.GroupLayout(CheckBoxes1);
        CheckBoxes1.setLayout(CheckBoxes1Layout);
        CheckBoxes1Layout.setHorizontalGroup(
            CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckBoxes1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckBoxes1Layout.createSequentialGroup()
                        .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CheckBoxes1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lbl_5))
                            .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_2)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(lbl_4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lbl_1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_header4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_header3)
                            .addComponent(txt_header_chandata, 0, 103, Short.MAX_VALUE)
                            .addComponent(txt_header_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_header1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheckBoxes1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_header_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckBoxes1Layout.createSequentialGroup()
                        .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CheckBoxes1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_9)
                                    .addComponent(lbl_10)))
                            .addGroup(CheckBoxes1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_7)
                                    .addComponent(lbl_6))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_header8, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txt_header6)
                            .addComponent(txt_header5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_header9)
                            .addComponent(btn_exit_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CheckBoxes1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_header7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        CheckBoxes1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbl_10, txt_header1, txt_header3, txt_header4, txt_header_1_1, txt_header_chandata});

        CheckBoxes1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_header5, txt_header6, txt_header8, txt_header9});

        CheckBoxes1Layout.setVerticalGroup(
            CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckBoxes1Layout.createSequentialGroup()
                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_header1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_1)
                    .addComponent(lbl_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_header_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_header3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_header_chandata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_header_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_header4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_5))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(CheckBoxes1Layout.createSequentialGroup()
                .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_header5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CheckBoxes1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(txt_header6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_header7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_header8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CheckBoxes1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_header9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exit_2)
                .addGap(36, 36, 36))
        );

        CheckBoxes1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbl_1, lbl_2, lbl_4, lbl_5, lbl_6});

        CheckBoxes1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lbl_10, lbl_9});

        CheckBoxes1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_header1, txt_header3, txt_header4, txt_header5, txt_header_1_1, txt_header_2, txt_header_chandata});

        CheckBoxes1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_header6, txt_header7, txt_header8, txt_header9});

        CheckBoxes1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_exit_2, jButton3});

        //CheckBoxes = new RoundedPanel(10, new Color(40, 40, 40));
        CheckBoxes.setBorder(javax.swing.BorderFactory.createTitledBorder("..."));
        CheckBoxes.setOpaque(false);

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
        chk26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk26ActionPerformed(evt);
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
        chk28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk28ActionPerformed(evt);
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

        btnContinue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnContinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_icon/cont_st.png"))); // NOI18N
        btnContinue.setText("Continue");
        btnContinue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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

        btnRemoveAll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRemoveAll.setText("Select All");
        btnRemoveAll.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRemoveAll.setInheritsPopupMenu(true);
        btnRemoveAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveAllMouseClicked(evt);
            }
        });
        btnRemoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveAllActionPerformed(evt);
            }
        });

        btn_exit_1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_exit_1.setText("Exit");
        btn_exit_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exit_1MouseClicked(evt);
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
                    .addComponent(chk6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chk19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chk24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CheckBoxesLayout.createSequentialGroup()
                        .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chk29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(chk28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chk27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chk26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chk25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CheckBoxesLayout.createSequentialGroup()
                                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnRemoveAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnContinue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addComponent(btn_exit_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(CheckBoxesLayout.createSequentialGroup()
                        .addComponent(chk30)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                    .addGroup(CheckBoxesLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
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
                                .addComponent(chk24))
                            .addGroup(CheckBoxesLayout.createSequentialGroup()
                                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(chk25)
                                    .addComponent(btnContinue))
                                .addGroup(CheckBoxesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CheckBoxesLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chk29))
                                    .addGroup(CheckBoxesLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(btnRemoveAll)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_exit_1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chk30)
                                .addGap(9, 9, 9)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CheckBoxes2.setBorder(javax.swing.BorderFactory.createTitledBorder("..."));
        CheckBoxes2.setOpaque(false);

        cec_lbl_8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cec_lbl_8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cec_lbl_8.setText("$AN_CEC_MULT_BY_TABLE");

        cec_lbl_9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cec_lbl_9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cec_lbl_9.setText("$AN_CEC_IS_MODULO");

        btn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/button_icon/next_st.png"))); // NOI18N
        btn_next.setText("NEXT");
        btn_next.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nextMouseClicked(evt);
            }
        });
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        cec_lbl_7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cec_lbl_7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cec_lbl_7.setText("$AN_CEC_DIRECTION");

        txt_cec_header_footer_3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_cec_header_footer_3.setText(";End Text");
        txt_cec_header_footer_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cec_header_footer_3ActionPerformed(evt);
            }
        });

        txt_cec_header_footer_4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_cec_header_footer_4.setText("NEWCONF");

        txt_cec_header_footer_5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_cec_header_footer_5.setText("M7");
        txt_cec_header_footer_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cec_header_footer_5ActionPerformed(evt);
            }
        });

        lbl_cechecderfoot_4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_cechecderfoot_4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_cechecderfoot_4.setText(";End Text");

        lbl_cechecderfoot_5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_cechecderfoot_5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_cechecderfoot_5.setText("NEWCONF");

        lbl_cechecderfoot_6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_cechecderfoot_6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_cechecderfoot_6.setText("M7");

        txt_auto_5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_auto_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_auto_5ActionPerformed(evt);
            }
        });

        txt_auto_6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_auto_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_auto_6ActionPerformed(evt);
            }
        });

        txt_auto_7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        btn_exit_3.setText("EXIT");
        btn_exit_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exit_3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_cechecderfoot_5)
                        .addComponent(cec_lbl_9)
                        .addComponent(cec_lbl_8)
                        .addComponent(lbl_cechecderfoot_4)
                        .addComponent(lbl_cechecderfoot_6))
                    .addComponent(cec_lbl_7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_exit_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_cec_header_footer_5)
                    .addComponent(txt_cec_header_footer_4)
                    .addComponent(txt_cec_header_footer_3)
                    .addComponent(txt_auto_7)
                    .addComponent(txt_auto_6)
                    .addComponent(btn_next, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(txt_auto_5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_auto_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cec_lbl_7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_auto_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cec_lbl_8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_auto_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cec_lbl_9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cec_header_footer_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cechecderfoot_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cec_header_footer_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cechecderfoot_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cec_header_footer_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cechecderfoot_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_next)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exit_3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_auto_5, txt_auto_6, txt_auto_7, txt_cec_header_footer_3, txt_cec_header_footer_4, txt_cec_header_footer_5});

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_exit_3, btn_next});

        cec_2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cec_2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select index--", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61" }));
        cec_2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cec_2ItemStateChanged(evt);
            }
        });
        cec_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cec_2ActionPerformed(evt);
            }
        });

        cec_lbl_2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cec_lbl_2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cec_lbl_2.setText("$SN_CEC_TABLE_ENABLE");

        cec_lbl_3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cec_lbl_3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cec_lbl_3.setText("$AN_CEC_INPUT_NCU");

        cec_lbl_5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cec_lbl_5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cec_lbl_5.setText("$AN_CEC_OUTPUT_NCU");

        cec_lbl_4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cec_lbl_4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cec_lbl_4.setText("$AN_CEC_INPUT_AXIS");

        lbl_cechecderfoot_3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_cechecderfoot_3.setText("CHANDATA");

        cec_1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        cec_1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CHANDATA(1)", "CHANDATA(2)", "CHANDATA(3)" }));
        cec_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cec_1ActionPerformed(evt);
            }
        });

        txt_cec_header_footer_1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_cec_header_footer_1.setText(";Header Text");
        txt_cec_header_footer_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cec_header_footer_1ActionPerformed(evt);
            }
        });

        txt_cec_header_footer_2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_cec_header_footer_2.setText("NEWCONF");
        txt_cec_header_footer_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cec_header_footer_2ActionPerformed(evt);
            }
        });

        lbl_cechecderfoot_1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_cechecderfoot_1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_cechecderfoot_1.setText(";Header Text");

        lbl_12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lbl_12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_12.setText("NEWCONF");

        txt_auto_1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_auto_1.setFocusable(false);
        txt_auto_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_auto_1ActionPerformed(evt);
            }
        });

        txt_auto_2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txt_auto_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_auto_2ActionPerformed(evt);
            }
        });

        txt_auto_3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        txt_auto_4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        cec_lbl_6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cec_lbl_6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cec_lbl_6.setText("$AN_CEC_OUTPUT_AXIS");

        javax.swing.GroupLayout lbl_cechecderfoot_2Layout = new javax.swing.GroupLayout(lbl_cechecderfoot_2);
        lbl_cechecderfoot_2.setLayout(lbl_cechecderfoot_2Layout);
        lbl_cechecderfoot_2Layout.setHorizontalGroup(
            lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_cechecderfoot_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lbl_cechecderfoot_2Layout.createSequentialGroup()
                        .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_cechecderfoot_3)
                            .addComponent(cec_lbl_2)
                            .addComponent(cec_lbl_3)
                            .addComponent(cec_lbl_4)
                            .addComponent(cec_lbl_5)
                            .addComponent(cec_lbl_6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cec_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cec_2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_auto_2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_auto_4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(txt_auto_3)))
                                    .addComponent(txt_auto_1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbl_cechecderfoot_2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbl_cechecderfoot_2Layout.createSequentialGroup()
                                .addComponent(lbl_12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cec_header_footer_2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lbl_cechecderfoot_2Layout.createSequentialGroup()
                                .addComponent(lbl_cechecderfoot_1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cec_header_footer_1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_cechecderfoot_2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cec_1, cec_2, txt_auto_1, txt_auto_2, txt_auto_3, txt_auto_4, txt_cec_header_footer_1, txt_cec_header_footer_2});

        lbl_cechecderfoot_2Layout.setVerticalGroup(
            lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lbl_cechecderfoot_2Layout.createSequentialGroup()
                .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_cec_header_footer_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cechecderfoot_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cec_header_footer_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cechecderfoot_3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cec_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cec_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cec_lbl_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cec_lbl_3)
                    .addComponent(txt_auto_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_auto_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cec_lbl_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cec_lbl_5)
                    .addComponent(txt_auto_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lbl_cechecderfoot_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_auto_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cec_lbl_6))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbl_cechecderfoot_2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cec_lbl_2, cec_lbl_3, cec_lbl_4, cec_lbl_5, cec_lbl_6, lbl_12, lbl_cechecderfoot_1, lbl_cechecderfoot_3});

        lbl_cechecderfoot_2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cec_1, cec_2});

        javax.swing.GroupLayout CheckBoxes2Layout = new javax.swing.GroupLayout(CheckBoxes2);
        CheckBoxes2.setLayout(CheckBoxes2Layout);
        CheckBoxes2Layout.setHorizontalGroup(
            CheckBoxes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckBoxes2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_cechecderfoot_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CheckBoxes2Layout.setVerticalGroup(
            CheckBoxes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CheckBoxes2Layout.createSequentialGroup()
                .addGroup(CheckBoxes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_cechecderfoot_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBoxes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBoxes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CheckBoxes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CheckBoxes2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckBoxes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckBoxes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(524, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(2707, 824));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_impo_compesationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_impo_compesationActionPerformed
      
        open_options();
       
    }//GEN-LAST:event_btn_impo_compesationActionPerformed
   private void open_options(){
      Object[] options = {"ENC",
                "CEC"};
int p = JOptionPane.showOptionDialog(null,
"ENC OR CEC",
"SELECT OPTION",
JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE,
null,     //do not use a custom Icon
options,  //the titles of buttons
options[0]);
          if (p==0){
              show_panel2();
       import_compesation_id=1;
       pass_select();
          }else if(p==1)
          {
              show_panel3();
         import_compesation_id=2;
         pass_select();
          }else if(p==2)
          {
      hide_panels();
         }
    else{}
   
   }
   
  
   private void pass_select(){
   cec_clearx7();
        clearx7();      
        cec_size_store.clear();
        
        select_compensation_path();
   }
   
   private void status_pro_verify_compefile(){
               ArrayList<String> status_pro_arr1= new ArrayList<String>();
               ArrayList<String> status_pro_arr2= new ArrayList<String>();
               ArrayList<String> status_pro_arr3= new ArrayList<String>();
               ArrayList<String> status_pro_arr4= new ArrayList<String>();
               ArrayList<String> status_pro_arr5= new ArrayList<String>();
               String datax1="", datax2="", datax3="",datax4="";
               //String header1="Header 1";
              // String header2="Subheader 1";
     try{   
         int line_number=0;
       //  String pxx=pathxx2;    
            // pathxx2=txt_path2.getText().toString().trim();
         FileReader fileReader = new FileReader(pathxx2);
         
         
         for(int i=0; i<4; i++){
             
             try{
             
             
         /////from here////////////////
         try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      //String line;
         while((line = bufferedReader.readLine()) != null) {
             line = line.replace("\"", "");
             line_number=line_number+1;
             if(i==0){
                 ///////////Array 1//////////////
                 datax1=line.split(";")[1];
                 datax1 = datax1.replaceAll(",$", ".");
                // datax1 = datax1.replaceAll("$", ".");
                 if(!datax1.equals("DIST [mm]")){
                 status_pro_arr1.add(datax1);
                 }
                 ///////////Array 2////////////
                 
                  datax2=line.split(";")[2];
                  datax2 = datax2.replaceAll(",$", ".");
             if(!datax2.equals("Delta [mm]")){
                 status_pro_arr2.add(datax2);                 
                 }
           //  System.out.println(status_pro_arr2);
             ////////////////Array 3//////////////////////
             
              datax3=line.split(";")[3];
              datax3 = datax3.replaceAll(",$", ".");
               if(!datax3.equals("Y [mm]")){
                 status_pro_arr3.add(datax3);               
                 }
             
             //////////////////Array 4///////////////
             
              datax4=line.split(";")[5];
              datax4 = datax4.replaceAll(",$", ".");
             
             if(!datax4.equals("Z [mm]")){
                 status_pro_arr4.add(datax4);            
                 }
             
             ////////////////////////
           
           
           //compesation_errors.add(comp_body);
           
             }else{
             System.out.println(status_pro_arr4);
             }
               
             }  
           System.out.println("xx"+status_pro_arr1);
              System.out.println("xx"+status_pro_arr2);
               System.out.println("xx"+status_pro_arr3);
                System.out.println("xx"+status_pro_arr4);
         int_min=status_pro_arr1.get(0);
           int_max=status_pro_arr1.get(status_pro_arr1.size()-1);
           int_step=status_pro_arr2.get(1);
           compesation_errors.clear();
           compesation_errors=status_pro_arr4;
           System.out.println("MIN "+int_min);
           System.out.println("MAX "+int_max);
           System.out.println("STEP "+int_step);
           System.out.println("Errors "+compesation_errors);
     ////////////////to heer////
         }
         
        }catch(Exception e){
        
        }
    }
    }catch(Exception e){
   e.printStackTrace();
    }
 }
    private void verify_compefile(){
     try{        
       //  String pxx=pathxx2;    
            // pathxx2=txt_path2.getText().toString().trim();
         FileReader fileReader = new FileReader(pathxx2);
         for(int i=0; i<2; i++){
             if(i==0 && compesation_errors.size()== 0){
         ////////////from here/////////////////
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
                   else if(comp_body.contains("backlasherror"))
                 {
                   int_backlash=comp_body.replaceAll("([a-z])", "");
                   //JOptionPane.showMessageDialog(null, int_step+"Step");
                 }
                 else if(comp_body.contains("compensationoutput"))
                 {
                   error_collect_status=1;
                   //JOptionPane.showMessageDialog(null, int_step+"Step");
                 }
                 else if(comp_body.contains("compensationoutput"))
                 {
                  // error_collect_status=0;
                   //JOptionPane.showMessageDialog(null, int_step+"Step");
                 }
                 else if (error_collect_status==1 && !comp_body.equals("")){
                 compesation_errors.add(comp_body);
                 }
                 else{
                 
                 }
                 
              
      }  
      error_collect_status=0;  
    }
       
         /////////////////to here/////////////
         }else if(i==1 && compesation_errors.size()==0){
             
           status_pro_verify_compefile();
         
         
         }else{
         
         }
         
         }
    }catch(Exception e){
    
    }
 }
 
 private void verify_compefile2(){
     try{        
       //  String pxx=pathxx2;    
            // pathxx2=txt_path2.getText().toString().trim();
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
                   else if(comp_body.contains("backlasherror"))
                 {
                   int_backlash=comp_body.replaceAll("([a-z])", "");
                   //JOptionPane.showMessageDialog(null, int_step+"Step");
                 }
                 else if(comp_body.contains("compensationoutput"))
                 {
                   error_collect_status=1;
                   //JOptionPane.showMessageDialog(null, int_step+"Step");
                 }
                 else if(comp_body.contains("compensationoutput"))
                 {
                  // error_collect_status=0;
                   //JOptionPane.showMessageDialog(null, int_step+"Step");
                 }
                 else if (error_collect_status==1 && !comp_body.equals("")){
                 compesation_errors.add(comp_body);
                 }
                 else{
                 
                 }
                 
              
      }  
      error_collect_status=0;  
    }
    }catch(Exception e){
    
    }
 }
    
    private void select_compensation_path(){
      //path.setText("");     
      //txt_path3_cec.setText("");  
      select_file_2();
 }
    
    private void extract_data(){
 if(process_continuing==0){
          process_continuing=1;         
                 
              
                 reset_variables();
                 start_program(); 
              
     
         }else{
         JOptionPane.showMessageDialog(null, "Similar Process is Running !");
         
         }
 }
   public void extract_data_2(){
     //  pathxx2=tt;
       //pathxx2=txt_path2.getText().toString();
       
        pathxx2= pathxx2;
 if(process_continuing==0){
          process_continuing=0;         
                 
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
                              pathxx=pathxx;
                               
                             
                              count_chandata_types();
                              
                             // here
                              if(data_chabdata_count.size() > 0){
                                  clear_db_data();
                                  starts_progress_bar();                     // reset_varaiables();
                                  start_timer2(); 
                                  start_loop_par1();
                              }else{
                                      lbl_per.setText("");
                                     // path.setText("");
                                      enable_components();
                                    //  active_state=0
                                      JOptionPane.showMessageDialog(null, "Invalid machine data file. !");
                                    }
                              
  
  
                                 }
    
    private void clear_db_data(){
                              clearx();
                              clearx2();
                              clearx3();
                                      clear_8();

                              clear_cec_x2();
                              clear_col_size();   
                              clear_cec_col_size(); 
    }
   private void start_program_2(){
                              stop_timer_status=1;
                             // pathxx2=txt_path2.getText().toString().trim();
                              starts_progress_bar();                     // reset_varaiables();
                              start_timer2();
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
                 UpdateJTable();
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
    private void btn_conf_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_conf_fileActionPerformed
        // TODO add your handling code here:
       // disable_btns();
      //  String ext1 = FilenameUtils.getExtension("/path/to/file/foo.txt");
     // String ext = Files.getFileExtension(path);
       clear_starter();
        if(active_state==0){
               select_file();
               // clear_arrays();

        }else if(active_state > 0){
                try{
                clear_arrays();
                }catch(Exception ex){}
                 
                 
                 
                 select_file();
              
               
                
        }else{
                
                }
        active_state=active_state+1;
    }//GEN-LAST:event_btn_conf_fileActionPerformed
    private void clear_starter(){
    cec_data_used_only_xx.clear();
cec_data_used_only_indices.clear();
cec_size_store.clear();
                                    
data_used_only_xx.clear();                                    
data_used_only_indices.clear();                                
size_store.clear();                                
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       conn = mysqlconnect.ConnectDb(); 
       hide_all_checkboxes();
        hide_all_variable_fields();
        select_expiry();
        String xx=exp_date;
        
       find_dif();
          
          if(diffInDays>0){
          
        //int diffInDays = (int)( (newerDate.getTime() - olderDate.getTime()) / (1000 * 60 * 60 * 24) );
       datacheckbox=new ArrayList<String>(); 
        data = new ArrayList<String>();                                  
                                 data11 = new ArrayList<String>(); 
                                 size_store= new ArrayList<String>(); 
                                    cec_size_store= new ArrayList<String>(); 
                                 data_chabdata_count= new ArrayList<String>();
                                 data_used_only_xx= new ArrayList<String>();
                                 cec_data_used_only_xx= new ArrayList<String>();
                                 point_cec_data= new ArrayList<String>();
                                 data_used_only_indices= new ArrayList<String>();
                                 cec_data_used_only_indices= new ArrayList<String>();
                                 
                                   pivot_data_used_only_xx= new ArrayList<String>();
                                   pivot_data_used_only_indices= new ArrayList<String>();
                                   pivot_size_store = new ArrayList<String>();
                                 
                                 cec_data_2= new ArrayList<String>();
                                 data_used_name= new ArrayList<String>();
                                 compesation_data_1 = new ArrayList<String>();
                                 temp_body_compesation_data_1= new ArrayList<String>();
                                 compesation_data_2 = new ArrayList<String>();
                                 arr1 = new ArrayList<String>();
                                  arr2 = new ArrayList<String>();
                                 compesation_errors= new ArrayList<String>();
                                 used_inserted_status=0;
                              //  List<Integer> myArrayList = new ArrayList<>(100);                           
                                  used_chennel_count=0;
                                  
                                  
        int_loop_part_1=0;
        btnContinue.setVisible(false);
        btnRemoveAll.setVisible(false);
        hide_all_checkboxes();
        hide_all_variable_fields();
        // create_myDB() 
          
         
       
     
        update_table_2();
    }else{
             
              JOptionPane.showMessageDialog(null, "Deprecated Compmaster Version");      
               close();
          }
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
       // test();
       // UpdateJTable();
        switch_table();
    }//GEN-LAST:event_btn_raw_tblMouseClicked
 private static void set_jtables() {
        TableColumnModel columnModel = SqliteDataTable.getColumnModel();
        columnModel.getColumn(1).setPreferredWidth(370);
        columnModel.getColumn(1).setMaxWidth(370);
       // columnModel.getColumn(1).setPreferredWidth(150);
      //  columnModel.getColumn(1).setMaxWidth(150);
      
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 private static void set_jtables3() {
        TableColumnModel columnModel = SqliteDataTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(370);
        columnModel.getColumn(0).setMaxWidth(370);
       // columnModel.getColumn(1).setPreferredWidth(150);
      //  columnModel.getColumn(1).setMaxWidth(150);
      
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
               int xv=0;
               
               for(int i=0; i < pivot_data_used_only_xx.size(); i++){
                   String xcc=pivot_data_used_only_xx.get(i);
                   if(xcc.length() > 0){
                   xv=xv+1;
                   
                   }else{
                   
                   }
                   
                 
               
               }
               if( xv > 0){
               
                 continue_loop();
               }else{
               JOptionPane.showMessageDialog(null, "No selected checkbox.");
               }
                   
           
    }//GEN-LAST:event_btnContinueMouseClicked
    private void continue_loop(){
        interchange_arrays();
                hide_panels();
               data_used_name.clear();             
               continue_with_loop();
               btnContinue.setVisible(false);
                btnRemoveAll.setVisible(false);
                btn_exit_1.setVisible(false);

}
    private void interchange_arrays(){
        
         System.out.println("P Det "+pivot_data_used_only_xx);
     System.out.println("P Det "+pivot_data_used_only_indices);
     System.out.println("P Det "+pivot_size_store);
        data_used_only_xx.clear();
        data_used_only_indices.clear();
        size_store.clear();
 if(pivot_data_used_only_xx.size() >  0){
 
     
     for(int i=0; i< pivot_data_used_only_xx.size(); i++){
 String dat1= pivot_data_used_only_xx.get(i);
 String dat2= pivot_data_used_only_indices.get(i);
 String dat3=  pivot_size_store.get(i);
 
 if(dat1.length() > 0){
 data_used_only_xx.add(dat1);
 }
 
 if(dat2.length() > 0){
 data_used_only_indices.add(dat2);
 }
 
 if(dat3.length() > 0){
 size_store.add(dat3);
 }
 
     }
     
     System.out.println("Det "+data_used_only_xx);
     System.out.println("Det "+data_used_only_indices);
     System.out.println("Det "+size_store);
      System.out.println(size_store);
 
 }
 
    
    }
    
    private void chk1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk1ItemStateChanged
        // TODO add your handling code here:
        
        if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
            checkbox_index="0"; 
            
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
             //schk1.setVisible(true);
        } else {//checkbox has been deselected
              
            /// update_arraylist();
           //  set_check_box();
             // set_check_box();
            // JOptionPane.showMessageDialog(null, int_checkbox_index+" removed");
        };
    }//GEN-LAST:event_chk1ItemStateChanged

    private void chk2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk2ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="1"; 
             
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
              
             //chk2.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk2ItemStateChanged

    private void chk3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk3ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="2";               
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
             // checkbox_index="2"; 
           // //  //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             //int_checkbox_index=Integer.parseInt(checkbox_index);
           //  chk3.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk3ItemStateChanged

    private void chk4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk4ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
              checkbox_index="3"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
             
            // chk4.setVisible(true);
           //  update_arraylist();
          
        };
    }//GEN-LAST:event_chk4ItemStateChanged

    private void chk5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk5ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
              checkbox_index="4"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
             
           //  chk5.setVisible(true);
           //  update_arraylist();
          
        };
    }//GEN-LAST:event_chk5ItemStateChanged

    private void chk6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk6ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
              checkbox_index="5"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
             
          //   chk6.setVisible(true);
           //  update_arraylist();
          
        };
    }//GEN-LAST:event_chk6ItemStateChanged

    private void chk7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk7ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="6"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
              
          //  chk7.setVisible(true);
           //  update_arraylist();
          
        };
    }//GEN-LAST:event_chk7ItemStateChanged

    private void chk8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk8ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             
             checkbox_index="7"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
              
           ///  chk8.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk8ItemStateChanged

    private void chk9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk9ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="8"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
              
            // chk9.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk9ItemStateChanged

    private void chk10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk10ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
              checkbox_index="9"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
             
             //chk10.setVisible(true);
           //  update_arraylist();
          
        };
    }//GEN-LAST:event_chk10ItemStateChanged

    private void chk11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk11ItemStateChanged
        // TODO add your handling code here:
        
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
              checkbox_index="10"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
             
           //  chk11.setVisible(true);
           //  update_arraylist();
          
        };
    }//GEN-LAST:event_chk11ItemStateChanged

    private void chk12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk12ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="11"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
              
            // chk12.setVisible(true);
           //  update_arraylist();
          
        };
    }//GEN-LAST:event_chk12ItemStateChanged

    private void chk13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk13ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
              checkbox_index="12"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
             
           //  chk13.setVisible(true);
          //   update_arraylist();
          
        };
    }//GEN-LAST:event_chk13ItemStateChanged

    private void chk14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk14ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="13"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
              
             //chk14.setVisible(true);
           //  update_arraylist();
          
        };
    }//GEN-LAST:event_chk14ItemStateChanged

    private void chk15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk15ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
              checkbox_index="14"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
             
          //   chk15.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk15ItemStateChanged

    private void chk16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk16ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="15"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
              
           //  chk16.setVisible(true);
           //  update_arraylist();
          
        };
    }//GEN-LAST:event_chk16ItemStateChanged

    private void chk17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk17ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="16"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
              
           //  chk17.setVisible(true);
            /// update_arraylist();
          
        };
    }//GEN-LAST:event_chk17ItemStateChanged

    private void chk18ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk18ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="17"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
              
           ///  chk18.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk18ItemStateChanged

    private void chk19ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk19ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="18"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
              
            // chk19.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk19ItemStateChanged

    private void chk20ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk20ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="19"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
              update_pivot_array();
        } else {//checkbox has been deselected
              
           /// chk20.setVisible(true);
           //  update_arraylist();
          
        };
    }//GEN-LAST:event_chk20ItemStateChanged

    private void chk21ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk21ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="20"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             update_pivot_array();
        } else {//checkbox has been deselected
              
           //  chk21.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk21ItemStateChanged

    private void chk22ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk22ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
              checkbox_index="21"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             update_pivot_array();
        } else {//checkbox has been deselected
             
            // chk22.setVisible(true);
            //update_arraylist();
          
        };
    }//GEN-LAST:event_chk22ItemStateChanged

    private void chk23ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk23ItemStateChanged
        // TODO add your handling code here:
        
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="22"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             update_pivot_array();
        } else {//checkbox has been deselected
              
            // chk23.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk23ItemStateChanged

    private void chk24ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk24ItemStateChanged
        // TODO add your handling code here:
        
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
               checkbox_index="23"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             update_pivot_array();
        } else {//checkbox has been deselected
            
           //  chk24.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk24ItemStateChanged

    private void chk25ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk25ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
              checkbox_index="24"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             update_pivot_array();
        } else {//checkbox has been deselected
             
            // chk25.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk25ItemStateChanged

    private void chk26ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk26ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
              checkbox_index="25"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             update_pivot_array();
        } else {//checkbox has been deselected
             
           //  chk26.setVisible(true);
          //   update_arraylist();
          
        };
    }//GEN-LAST:event_chk26ItemStateChanged

    private void chk27ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk27ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="26"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             update_pivot_array();
        } else {//checkbox has been deselected
              
           //  chk27.setVisible(true);
           //  update_arraylist();
          
        };
    }//GEN-LAST:event_chk27ItemStateChanged

    private void chk28ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk28ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
              checkbox_index="27"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             update_pivot_array();
        } else {//checkbox has been deselected
             
           //  chk28.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk28ItemStateChanged

    private void chk29ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk29ItemStateChanged
        // TODO add your handling code here:
        
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
                checkbox_index="28"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
                int_checkbox_index=Integer.parseInt(checkbox_index);
                update_pivot_array();
        } else {//checkbox has been deselected
           
           //  chk29.setVisible(true);
          //   update_arraylist();
          
        };
    }//GEN-LAST:event_chk29ItemStateChanged

    private void chk30ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chk30ItemStateChanged
        // TODO add your handling code here:
         if(evt.getStateChange() == evt.SELECTED) {//checkbox has been selected
            //do something...
             checkbox_index="29"; 
              //checkbox_index = checkbox_index.replaceAll("[^0-9]", "");
             int_checkbox_index=Integer.parseInt(checkbox_index);
             update_pivot_array();
        } else {//checkbox has been deselected
              
           //  chk30.setVisible(true);
            // update_arraylist();
          
        };
    }//GEN-LAST:event_chk30ItemStateChanged

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mpf_code=1;
     generate_txt();
    }//GEN-LAST:event_jButton1ActionPerformed
     private void generate_txt(){
         if(mpf_code==1){
          switch_table();
         }else if(mpf_code==2){
          switch_table_2();
         }else{
         
         }
     
          String LAST_USED_FOLDER="";
    Preferences prefs = Preferences.userRoot().node(getClass().getName());
JFileChooser chooser = new JFileChooser(prefs.get(LAST_USED_FOLDER,
    new File(".").getAbsolutePath()));
int returnVal = chooser.showOpenDialog(null);
if (returnVal == JFileChooser.APPROVE_OPTION) {
    // do something
    prefs.put(LAST_USED_FOLDER, chooser.getSelectedFile().getParent());
}
File f = chooser.getSelectedFile();
      //  String filename=f.getAbsolutePath();
        filenamex=f.getAbsolutePath();
       // JOptionPane.showMessageDialog(null, filename+".mdf");
        txt_file_path=filenamex+".MPF";
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
     }
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        
        update_table_cec_2();
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnRemoveAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveAllMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveAllMouseClicked

    private void btnRemoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveAllActionPerformed
     
       //   hide_panels();
           select_all();   
        
    }//GEN-LAST:event_btnRemoveAllActionPerformed

    private void chk26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk26ActionPerformed

    private void chk28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk28ActionPerformed

    private void txt_header3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_header3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_header3ActionPerformed

    private void txt_header_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_header_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_header_2ActionPerformed

    private void txt_header4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_header4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_header4ActionPerformed

    private void txt_header5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_header5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_header5ActionPerformed

    private void txt_header7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_header7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_header7ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
          next();
    }//GEN-LAST:event_jButton3MouseClicked
   private void next(){
            hide_panels();       
           hide_all_variable_fields();
           cec_hide_all_variable_fields();
           if( import_compesation_id==1){
           insert_compesantation_vars_inputs();
          }else if( import_compesation_id==2){
            cec_insert_compesantation_vars_inputs();
          }else{
          
          }
                 
          extract_data_2();
          
          
   }
    private void txt_header_1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_header_1_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_header_1_1ActionPerformed

    private void txt_header_chandataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_header_chandataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_header_chandataActionPerformed

    private void cec_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cec_2ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_cec_2ActionPerformed

    private void btn_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nextMouseClicked
        // TODO add your handling code here:
        //compensate_normally();
         
          //cec_comp_count=cec_comp_count+1;
     //  cec_comp_btn_number=2;
        if(!cec_2.getSelectedItem().toString().trim().equals("--Select index--")){
        compensate_normally();
        
        }else{
        JOptionPane.showMessageDialog(null, "No selected axis.");
        }
        
    }//GEN-LAST:event_btn_nextMouseClicked

    private void cec_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cec_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cec_1ActionPerformed

    private void txt_cec_header_footer_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cec_header_footer_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cec_header_footer_5ActionPerformed

    private void txt_cec_header_footer_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cec_header_footer_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cec_header_footer_1ActionPerformed

    private void txt_cec_header_footer_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cec_header_footer_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cec_header_footer_2ActionPerformed

    private void cec_2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cec_2ItemStateChanged
       new_body_cec_selected_axis=cec_2.getSelectedItem().toString().trim();
       cec_selected_axis=cec_2.getSelectedItem().toString().trim();
        
        if(!new_body_cec_selected_axis.equals(old_body_cec_selected_axis)){
          execute_cec_fill();
        }else{
        
        }
    }//GEN-LAST:event_cec_2ItemStateChanged
  private void execute_cec_fill(){
    old_body_cec_selected_axis=new_body_cec_selected_axis;
          //  herer
        cec_comp_count=cec_comp_count+1;
      try{ 

                    Statement stmt2;
                    String selected=cec_2.getSelectedItem().toString().trim();
                    body_cec_selected_axis=selected;
                    String Table_click="41300["+selected+"]";
                    stmt2= conn.createStatement();
                    String sql ="select * from tbl_cec_comp_compesation where var1='"+Table_click+"' ";
                    rs=stmt2.executeQuery(sql);
                    if(rs.next()){
                
            String add1=rs.getString("var1");  
            String add2=rs.getString("var2");  
            String add3=rs.getString("var3");   
            String add4=rs.getString("var4"); 
            String add5=rs.getString("var5");   
            String add6=rs.getString("var6");   
            String add7=rs.getString("var7");
            String add8=rs.getString("var8"); 
            String add9=rs.getString("var9");  
            String add10=rs.getString("var10");  
            String add11=rs.getString("var11"); 
            String add12=rs.getString("var12");  
            String add13=rs.getString("var13");   
            String add14=rs.getString("var14");
            
                txt_auto_1.setText(add5);
                txt_auto_2.setText(add6);
                txt_auto_3.setText(add7);
                txt_auto_4.setText(add8);
                txt_auto_5.setText(add12);
                txt_auto_6.setText(add13);
                txt_auto_7.setText(add14);  
                btn_next.setEnabled(true);
           // String Stringx=add1+" "+add2+" "+add3+" "+add4+" "+add5+" "+add6+" "+add7+" "+add8+" "+add9+" "+add10+" "+add11+" "+add12+" "+add13+" "+add14;
           // txtage.setText(add10);
           // JOptionPane.showMessageDialog(null, Stringx); 
             if(cec_comp_count<=2 ){
             generate_body_data(); 
             
             if(cec_comp_count==2){
              compensate_normally();
             }
             
             }else{
              JOptionPane.showMessageDialog(null, "You cannot select more than 2 axis");
             }
                   
       
        }else{
           btn_next.setEnabled(false);
           clear_fields();
      JOptionPane.showMessageDialog(null, "Selection Out Of Rage"); 
         }
      
      
      } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
      
  }
    
    private void generate_body_data(){
    verify_compefile();
    //analyse_file();        
    cec_calculate_segments();
    //temp_body_compesation_data_1.add("");
    add_bodydata_cec();
    add_bodydata2_cec();
    if(cec_comp_count==1 ){
    pop_up_option();
    }
    
    
   //System.out.println(temp_body_compesation_data_1); 
    }
    private void pop_up_option(){
    int p = JOptionPane.showConfirmDialog(null,"Do you want to select another axis ?.");
          if (p==0){
              clear_fields();
        //herer
          }else if(p==1)
          {
        compensate_normally();
          }else if(p==2)
          {
        compensate_normally();
         }
    else{}
    }
    private void clear_fields(){
    txt_auto_1.setText("");
    txt_auto_2.setText("");
    txt_auto_3.setText("");
    txt_auto_4.setText("");
    txt_auto_5.setText("");
    txt_auto_6.setText("");
    txt_auto_7.setText("");
    }
    private void add_bodydata_cec(){
    int ixxb= (int) Math.round(compesation_segments);
         // int ixxb=compesation_segments;
    for(int i=0; i <ixxb+1; i++){
          String error_value =compesation_errors.get(i);
          String dataxx="$AN_CEC"+"["+body_cec_selected_axis+","+i+"]"+"="+error_value;
        //here
        temp_body_compesation_data_1.add(dataxx);
       // hreere
        }
    compesation_errors.clear();
    body_cec_selected_axis=cec_selected_axis;
    }
    private void add_bodydata2_cec(){
        
                       //  txt_auto_1
     String int_min_xc=int_min;
    String int_max_xc=int_max;
    String int_step_xc=int_step;
    String cec_input_ncu =txt_auto_1.getText().toString().trim();
    String cec_input_axis =txt_auto_2.getText().toString().trim();
    String cec_output_ncu =txt_auto_3.getText().toString().trim();
    String cec_output_axis=txt_auto_4.getText().toString().trim();
    String cec_direction=txt_auto_5.getText().toString().trim();
    String cec_mult_by_table=txt_auto_6.getText().toString().trim();
    String cec_is_modulo=txt_auto_7.getText().toString().trim();
    
    
                   cec_footer_1_1="$AN_CEC_INPUT_NCU["+cec_selected_axis+ "]="+cec_input_ncu;
                   cec_footer_1_2="$AN_CEC_INPUT_AXIS[" +cec_selected_axis+ "]="+cec_input_axis;
                   cec_footer_1_3="$AN_CEC_OUTPUT_NCU["+cec_selected_axis+ "]="+cec_output_ncu;
                   cec_footer_1_4="$AN_CEC_OUTPUT_AXIS[" +cec_selected_axis+ "]="+cec_output_axis;                   
                    cec_footer_1_5="$AN_CEC_STEP["+cec_selected_axis+ "]="+int_step_xc;
                   cec_footer_1_6="$AN_CEC_MIN[" +cec_selected_axis+ "]="+int_min_xc ;
                   cec_footer_1_7="$AN_CEC_MAX[" +cec_selected_axis+ "]="+int_max_xc;
                   cec_footer_1_8="$AN_CEC_DIRECTION["+cec_selected_axis+ "]="+cec_direction;
                   cec_footer_1_9="$AN_CEC_MULT_BY_TABLE["+cec_selected_axis+ "]="+cec_mult_by_table;
                   cec_footer_1_10="";
        
         temp_body_compesation_data_1.add("");
          int ixx=11;
         for(int i=0; i <ixx; i++){
         String dataxx="";
         if(i==0){
            dataxx=cec_footer_1_1;
         }else if(i==1){
            dataxx=cec_footer_1_2;
         }
         else if(i==2){
          dataxx=cec_footer_1_3;
         }
          else if(i==3){
             dataxx=cec_footer_1_4;
         }else if(i==4){
            dataxx=cec_footer_1_5;
         }
         else if(i==5){
          dataxx=cec_footer_1_6;
         }
          else if(i==6){
             dataxx=cec_footer_1_7;
         }
          else if(i==7){
            dataxx=cec_footer_1_8;
         }
         else if(i==8){
          dataxx=cec_footer_1_9;
         }
          else if(i==9){
             dataxx=cec_footer_1_10;
         }
          
         else{
         //dataxx="";
         }
        temp_body_compesation_data_1.add(dataxx);
       // System.out.println(compesation_data_1);
        }
    body_cec_selected_axis="";
    cec_selected_axis="";
    }
    private void analyse_file(){
            try{        
       //  String pxx=pathxx2;    
            // pathxx2=txt_path2.getText().toString().trim();
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
                   else if(comp_body.contains("backlasherror"))
                 {
                   int_backlash=comp_body.replaceAll("([a-z])", "");
                   //JOptionPane.showMessageDialog(null, int_step+"Step");
                 }
                 else if(comp_body.contains("compensationoutput"))
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
      
    }
    }catch(Exception e){
    
    }
    
    }
    private void txt_cec_header_footer_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cec_header_footer_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cec_header_footer_3ActionPerformed

    private void txt_auto_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_auto_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_auto_1ActionPerformed

    private void txt_auto_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_auto_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_auto_6ActionPerformed

    private void txt_auto_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_auto_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_auto_5ActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_exit_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exit_1MouseClicked
        // TODO add your handling code here:
        clear_starter();
        abort_process();
       
    }//GEN-LAST:event_btn_exit_1MouseClicked

    private void btn_exit_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exit_2MouseClicked
        // TODO add your handling code here:
        abort_process();
    }//GEN-LAST:event_btn_exit_2MouseClicked

    private void btn_exit_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exit_3MouseClicked
        // TODO add your handling code here:
        abort_process();
    }//GEN-LAST:event_btn_exit_3MouseClicked

    private void txt_auto_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_auto_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_auto_2ActionPerformed
  
    private void compensate_normally(){
        compesation_segments=0;
         String selectstring =cec_2.getSelectedItem().toString().trim();
        if(!selectstring.equals("--Select index--")){
        next();
        }else{
        JOptionPane.showMessageDialog(null, "No selected axis!");
        }
    
    }
    private void open_explorer(){
        
        clean_mpf();
    Desktop desktop = Desktop.getDesktop();
        File dirToOpen = null;
        try {
                      //  System.out.println(filenamex);
           // filenamexx  = filenamex.substring(0, filenamex.lastIndexOf(""));   
            //////////////////////////////////
           String pp="\\"; 
      filenamexx = filenamex.substring(0, filenamex.lastIndexOf(pp));
     // System.out.println(filenamexx);
            ///////////////////
            filenamexx=filenamexx+"\\";
          //  System.out.println(filenamexx);
            dirToOpen = new File(filenamexx);
    try {
        desktop.open(dirToOpen);
    } catch (IOException ex) {
        Logger.getLogger(Arc_Import.class.getName()).log(Level.SEVERE, null, ex);
    }
        } catch (IllegalArgumentException iae) {
          //  System.out.println("File Not Found");
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
   // System.out.println(joiner.toString());
   // bw.write(joiner.toString());
   // bw.newLine();
    for (int row = 0; row < SqliteDataTable.getRowCount(); row++) {
        joiner = new StringJoiner(",");
        for (int col = 0; col < SqliteDataTable.getColumnCount(); col++) {
            Object obj = SqliteDataTable.getValueAt(row, col);
            String value = obj == null ? "null" : obj.toString();
            joiner.add(value);
        }
        String xxc=joiner.toString();
       xxc = xxc.replaceAll(",+$", "");
       if(!xxc.contains("..,")){
        bw.write(xxc);
        bw.newLine();   
        
       }
        
    }
} catch (IOException exp) {
    exp.printStackTrace();
}
    JOptionPane.showMessageDialog(null, "File Created Successfully!" );
    mpf_code=0;
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
    private javax.swing.JPanel CheckBoxes1;
    private javax.swing.JPanel CheckBoxes2;
    private static javax.swing.JTable SqliteDataTable;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnRemoveAll;
    private javax.swing.JButton btn_conf_file;
    private javax.swing.JButton btn_exit_1;
    private javax.swing.JButton btn_exit_2;
    private javax.swing.JButton btn_exit_3;
    private javax.swing.JButton btn_impo_compesation;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_normalize;
    private javax.swing.JButton btn_raw_tbl;
    private javax.swing.JComboBox cec_1;
    private javax.swing.JComboBox cec_2;
    private javax.swing.JLabel cec_lbl_2;
    private javax.swing.JLabel cec_lbl_3;
    private javax.swing.JLabel cec_lbl_4;
    private javax.swing.JLabel cec_lbl_5;
    private javax.swing.JLabel cec_lbl_6;
    private javax.swing.JLabel cec_lbl_7;
    private javax.swing.JLabel cec_lbl_8;
    private javax.swing.JLabel cec_lbl_9;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_10;
    private javax.swing.JLabel lbl_12;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_5;
    private javax.swing.JLabel lbl_6;
    private javax.swing.JLabel lbl_7;
    private javax.swing.JLabel lbl_9;
    private javax.swing.JLabel lbl_cechecderfoot_1;
    private javax.swing.JPanel lbl_cechecderfoot_2;
    private javax.swing.JLabel lbl_cechecderfoot_3;
    private javax.swing.JLabel lbl_cechecderfoot_4;
    private javax.swing.JLabel lbl_cechecderfoot_5;
    private javax.swing.JLabel lbl_cechecderfoot_6;
    private javax.swing.JLabel lbl_per;
    private javax.swing.JTextField txt_auto_1;
    private javax.swing.JTextField txt_auto_2;
    private javax.swing.JTextField txt_auto_3;
    private javax.swing.JTextField txt_auto_4;
    private javax.swing.JTextField txt_auto_5;
    private javax.swing.JTextField txt_auto_6;
    private javax.swing.JTextField txt_auto_7;
    private javax.swing.JTextField txt_cec_header_footer_1;
    private javax.swing.JTextField txt_cec_header_footer_2;
    private javax.swing.JTextField txt_cec_header_footer_3;
    private javax.swing.JTextField txt_cec_header_footer_4;
    private javax.swing.JTextField txt_cec_header_footer_5;
    private javax.swing.JTextField txt_header1;
    private javax.swing.JTextField txt_header3;
    private javax.swing.JComboBox txt_header4;
    private javax.swing.JComboBox txt_header5;
    private javax.swing.JTextField txt_header6;
    private javax.swing.JComboBox txt_header7;
    private javax.swing.JTextField txt_header8;
    private javax.swing.JTextField txt_header9;
    private javax.swing.JComboBox txt_header_1_1;
    private javax.swing.JComboBox txt_header_2;
    private javax.swing.JComboBox txt_header_chandata;
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
     String sql = "select id AS '..' ,chandata AS '..', asset_number AS '..',str_def_asset_body AS '..', asset_status AS '..', pos_counter as '..' from tbl_chandata order by id DESC";
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
         String sql = "select id,chandata, asset_number,str_def_asset_body as asset_def_error_body, asset_status, pos_counter as position from tbl_chandata where chandata = '"+ pathxx2+"'";
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
     static void update_table_4() {
         select_col_size();
         non_zero_columns=non_zero_columns+1;
        String sql="";
             if(non_zero_columns==1){
        
          sql = "select col1 as '..',col30 as '..' from  cec_tbl_compensation_var_inputs order by col30 ASC";
        }else if (non_zero_columns==2){
        sql = "select col1 as '..',col2 as '..' from  cec_tbl_compensation_var_inputs";     
        }
        else if (non_zero_columns==3){
        sql = "select col1 as '..',col2 as '..',col3 as '..' from  cec_tbl_compensation_var_inputs";     
        }
         else if (non_zero_columns==4){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..' from  cec_tbl_compensation_var_inputs";     
        }
         else if (non_zero_columns==5){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..' from  cec_tbl_compensation_var_inputs";     
        }
         else if (non_zero_columns==6){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..' from  cec_tbl_compensation_var_inputs";     
         }
           else if (non_zero_columns==7){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..' from  cec_tbl_compensation_var_inputs";     
         }
            else if (non_zero_columns==8){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..' from  cec_tbl_compensation_var_inputs";     
         }
             else if (non_zero_columns==9){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..' from  cec_tbl_compensation_var_inputs";     
         }
             else if (non_zero_columns==10){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..' from  cec_tbl_compensation_var_inputs";     
         }
             else if (non_zero_columns==11){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..' from  cec_tbl_compensation_var_inputs";     
         }
             else if (non_zero_columns==12){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..' from  cec_tbl_compensation_var_inputs";     
         }
             else if (non_zero_columns==13){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..' from  cec_tbl_compensation_var_inputs";     
         }
             else if (non_zero_columns==14){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..' from  cec_tbl_compensation_var_inputs";     
         }
             else if (non_zero_columns==15){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..' from  cec_tbl_compensation_var_inputs";     
         }
             else if (non_zero_columns==16){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..' from  cec_tbl_compensation_var_inputs";     
         }
             else if (non_zero_columns==17){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..' from  cec_tbl_compensation_var_inputs";     
         }
             else if (non_zero_columns==18){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..' from  cec_tbl_compensation_var_inputs";     
         }
             else if (non_zero_columns==19){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..' from  cec_tbl_compensation_var_inputs";     
         }
              else if (non_zero_columns==20){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..' from  cec_tbl_compensation_var_inputs";     
         }
              else if (non_zero_columns==21){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..' from  cec_tbl_compensation_var_inputs";     
         }
              else if (non_zero_columns==22){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..' from  cec_tbl_compensation_var_inputs";     
         }
              else if (non_zero_columns==23){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..' from  cec_tbl_compensation_var_inputs";     
         }
              else if (non_zero_columns==24){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..' from  cec_tbl_compensation_var_inputs";     
         }
              else if (non_zero_columns==25){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..' from  cec_tbl_compensation_var_inputs";     
         }
              else if (non_zero_columns==26){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..' from  cec_tbl_compensation_var_inputs";     
         }
              else if (non_zero_columns==27){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..' from  cec_tbl_compensation_var_inputs";     
         }
              else if (non_zero_columns==28){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..' from  cec_tbl_compensation_var_inputs";     
         }
              else if (non_zero_columns==29){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..',col29 as '..' from  cec_tbl_compensation_var_inputs";     
         }
              else if (non_zero_columns==30){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..',col29 as '..',col30 as '..' from  cec_tbl_compensation_var_inputs";     
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
     set_jtables3();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    static void update_table_3() {
         select_col_size();
         non_zero_columns=non_zero_columns+1;
        String sql="";
             if(non_zero_columns==1){
        
          sql = "select col1 as '..',col30 as '..' from  tbl_processed_table_compe order by col30 ASC";
        }else if (non_zero_columns==2){
        sql = "select col1 as '..',col2 as '..' from  tbl_processed_table_compe";     
        }
        else if (non_zero_columns==3){
        sql = "select col1 as '..',col2 as '..',col3 as '..' from  tbl_processed_table_compe";     
        }
         else if (non_zero_columns==4){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..' from  tbl_processed_table_compe";     
        }
         else if (non_zero_columns==5){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..' from  tbl_processed_table_compe";     
        }
         else if (non_zero_columns==6){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..' from  tbl_processed_table_compe";     
         }
           else if (non_zero_columns==7){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..' from  tbl_processed_table_compe";     
         }
            else if (non_zero_columns==8){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..' from  tbl_processed_table_compe";     
         }
             else if (non_zero_columns==9){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..' from  tbl_processed_table_compe";     
         }
             else if (non_zero_columns==10){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..' from  tbl_processed_table_compe";     
         }
             else if (non_zero_columns==11){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..' from  tbl_processed_table_compe";     
         }
             else if (non_zero_columns==12){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..' from  tbl_processed_table_compe";     
         }
             else if (non_zero_columns==13){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..' from  tbl_processed_table_compe";     
         }
             else if (non_zero_columns==14){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..' from  tbl_processed_table_compe";     
         }
             else if (non_zero_columns==15){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..' from  tbl_processed_table_compe";     
         }
             else if (non_zero_columns==16){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..' from  tbl_processed_table_compe";     
         }
             else if (non_zero_columns==17){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..' from  tbl_processed_table_compe";     
         }
             else if (non_zero_columns==18){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..' from  tbl_processed_table_compe";     
         }
             else if (non_zero_columns==19){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..' from  tbl_processed_table_compe";     
         }
              else if (non_zero_columns==20){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..' from  tbl_processed_table_compe";     
         }
              else if (non_zero_columns==21){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..' from  tbl_processed_table_compe";     
         }
              else if (non_zero_columns==22){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..' from  tbl_processed_table_compe";     
         }
              else if (non_zero_columns==23){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..' from  tbl_processed_table_compe";     
         }
              else if (non_zero_columns==24){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..' from  tbl_processed_table_compe";     
         }
              else if (non_zero_columns==25){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..' from  tbl_processed_table_compe";     
         }
              else if (non_zero_columns==26){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..' from  tbl_processed_table_compe";     
         }
              else if (non_zero_columns==27){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..' from  tbl_processed_table_compe";     
         }
              else if (non_zero_columns==28){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..' from  tbl_processed_table_compe";     
         }
              else if (non_zero_columns==29){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..',col29 as '..' from  tbl_processed_table_compe";     
         }
              else if (non_zero_columns==30){
        sql = "select col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..',col29 as '..',col30 as '..' from  tbl_processed_table_compe";     
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
     set_jtables3();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    static void update_table_2() {
         select_col_size();
         non_zero_columns=non_zero_columns+1;
        String sql="";
             if(non_zero_columns==1){
        
          sql = "select col29 as '..',col1 as '..',col30 as '..' from  tbl_processed_table order by col30 ASC";
        }else if (non_zero_columns==2){
        sql = "select col29 as '..',col1 as '..',col2 as '..' from  tbl_processed_table";     
        }
        else if (non_zero_columns==3){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..' from  tbl_processed_table";     
        }
         else if (non_zero_columns==4){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..' from  tbl_processed_table";     
        }
         else if (non_zero_columns==5){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..' from  tbl_processed_table";     
        }
         else if (non_zero_columns==6){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..' from  tbl_processed_table";     
         }
           else if (non_zero_columns==7){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..' from  tbl_processed_table";     
         }
            else if (non_zero_columns==8){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==9){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==10){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==11){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==12){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==13){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==14){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==15){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==16){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==17){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==18){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..' from  tbl_processed_table";     
         }
             else if (non_zero_columns==19){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==20){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==21){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==22){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==23){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==24){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==25){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==26){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==27){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==28){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==29){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..',col29 as '..' from  tbl_processed_table";     
         }
              else if (non_zero_columns==30){
        sql = "select col29 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
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
    
     static void update_table_cec_2() {
         select_cec_col_size();
         non_zero_columns=non_zero_columns+1;
        String sql="";
             if(non_zero_columns==1){
        
          sql = "select col60 as '..',col1 as '..',col61 as '..' from  tbl_processed_cec_table";
        }else if (non_zero_columns==2){
        sql = "select col60 as '..',col1 as '..',col2 as '..' from  tbl_processed_cec_table";     
        }
        else if (non_zero_columns==3){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..' from  tbl_processed_cec_table";     
        }
         else if (non_zero_columns==4){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..' from  tbl_processed_cec_table";     
        }
         else if (non_zero_columns==5){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..' from  tbl_processed_cec_table";     
        }
         else if (non_zero_columns==6){
        sql = "select col60 as '..',col1 as '..',co61 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..' from  tbl_processed_cec_table";     
         }
           else if (non_zero_columns==7){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..' from  tbl_processed_cec_table";     
         }
            else if (non_zero_columns==8){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..' from  tbl_processed_cec_table";     
         }
             else if (non_zero_columns==9){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..' from  tbl_processed_cec_table";     
         }
             else if (non_zero_columns==10){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..' from  tbl_processed_cec_table";     
         }
             else if (non_zero_columns==11){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..' from  tbl_processed_cec_table";     
         }
             else if (non_zero_columns==12){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..' from  tbl_processed_cec_table";     
         }
             else if (non_zero_columns==13){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..' from  tbl_processed_cec_table";     
         }
             else if (non_zero_columns==14){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..' from  tbl_processed_cec_table";     
         }
             else if (non_zero_columns==15){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..' from  tbl_processed_cec_table";     
         }
             else if (non_zero_columns==16){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..' from  tbl_processed_cec_table";     
         }
             else if (non_zero_columns==17){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..' from  tbl_processed_cec_table";     
         }
             else if (non_zero_columns==18){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..' from  tbl_processed_cec_table";     
         }
             else if (non_zero_columns==19){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..' from  tbl_processed_cec_table";     
         }
              else if (non_zero_columns==20){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..' from  tbl_processed_cec_table";     
         }
              else if (non_zero_columns==21){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..' from  tbl_processed_cec_table";     
         }
              else if (non_zero_columns==22){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..' from  tbl_processed_cec_table";     
         }
              else if (non_zero_columns==23){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..' from  tbl_processed_cec_table";     
         }
              else if (non_zero_columns==24){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..' from  tbl_processed_cec_table";     
         }
              else if (non_zero_columns==25){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..' from  tbl_processed_cec_table";     
         }
              else if (non_zero_columns==26){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..' from  tbl_processed_cec_table";     
         }
              else if (non_zero_columns==27){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..' from  tbl_processed_cec_table";     
         }
              else if (non_zero_columns==28){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..' from  tbl_processed_cec_table";     
         }
              else if (non_zero_columns==29){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..',col29 as '..' from  tbl_processed_cec_table";     
         }
              else if (non_zero_columns==30){
        sql = "select col60 as '..',col1 as '..',col2 as '..',col3 as '..',col4 as '..',col5 as '..',col6 as '..',col7 as '..',col8 as '..',col9 as '..',col10 as '..',col11 as '..',col12 as '..',col13 as '..',col14 as '..',col15 as '..',"
                + "col16 as '..',col17 as '..',col18 as '..',col19 as '..',col20 as '..',col21 as '..',col22 as '..',col23 as '..',col24 as '..',col25 as '..',col26 as '..',col27 as '..',col28 as '..',col29 as '..',col30 as '..' from  tbl_processed_cec_table";     
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
         //   txt_path2.setText(add1);
            
           
        
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
static void select_cec_col_size() {
        
                   try{
        
                    Statement stmt2;  
                    stmt2= conn.createStatement();
                    String sql112="Select *  from  tbl_cec_col_size order by count DESC LIMIT 1";
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
       // txt_path2.setText(loop1_global_count);
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
         String LAST_USED_FOLDER="";
    Preferences prefs = Preferences.userRoot().node(getClass().getName());
JFileChooser chooser = new JFileChooser(prefs.get(LAST_USED_FOLDER,
    new File(".").getAbsolutePath()));
int returnVal = chooser.showOpenDialog(null);
if (returnVal == JFileChooser.APPROVE_OPTION) {
    // do something
    prefs.put(LAST_USED_FOLDER, chooser.getSelectedFile().getParent());
}
File f = chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        pathxx2 =filename;
      
      //  txt_path2.setText(pathxx2);
        disable_components();
        verify_compefile();
        if(compesation_errors.size() > 0){
            compesation_errors.clear();
          if(import_compesation_id==1){
              show_all_variable_fields();
               //verify_compefile();
          }else if (import_compesation_id==2){
              cec_show_all_variable_fields();
              // verify_compefile2();
          }else{
          
          }
          
        
        }else{
            enable_components();
          //  txt_path2.setText("");
         //txt_path3_cec.setText("");
        JOptionPane.showMessageDialog(null, "Invalid Compensation file !");
        }
      
       
    }
   
    private void select_file() {
        
        process_continuing=0;
              String LAST_USED_FOLDER="";
    Preferences prefs = Preferences.userRoot().node(getClass().getName());
JFileChooser chooser = new JFileChooser(prefs.get(LAST_USED_FOLDER,
    new File(".").getAbsolutePath()));
int returnVal = chooser.showOpenDialog(null);
if (returnVal == JFileChooser.APPROVE_OPTION) {
    // do something
    prefs.put(LAST_USED_FOLDER, chooser.getSelectedFile().getParent());
}
File f = chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        pathxx =filename;
      // path.setText(pathxx);
        disable_components();
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
      private void update_pivot_array_2(){
          clear_pivot();
         set_pivote_arrays();
      // set_pos_variables();
      // data3.set(int_checkbox_index, str_asset_status);
          for(int i=0; i < data_used_only_xx.size(); i++){
           String str_pv1=data_used_only_xx.get(i);
       String str_pv2=data_used_only_indices.get(i);
       String str_pv3=size_store.get(i);
       
       
       pivot_data_used_only_xx.set(i, str_pv1);
      pivot_data_used_only_indices.set(i, str_pv2);
       pivot_size_store.set(i, str_pv3);
          }
      
       
     //  data_used_only_xx.remove(int_checkbox_index);
      //  data_used_only_indices.remove(int_checkbox_index);
      //  size_store.remove(int_checkbox_index);
      ////  data_used_name.remove(int_checkbox_index);
        
        System.out.println( "y"+pivot_data_used_only_xx);
        System.out.println( "y"+pivot_data_used_only_indices);
        System.out.println( "y"+pivot_size_store);
          System.out.println( pivot_size_store);
          continue_loop();
       //System.out.println(data_used_name);
   }      
   private void update_pivot_array(){
      // set_pos_variables();
      // data3.set(int_checkbox_index, str_asset_status);
       String str_pv1=data_used_only_xx.get(int_checkbox_index);
       String str_pv2=data_used_only_indices.get(int_checkbox_index);
       String str_pv3=size_store.get(int_checkbox_index);
       
       
       pivot_data_used_only_xx.set(int_checkbox_index, str_pv1);
      pivot_data_used_only_indices.set(int_checkbox_index, str_pv2);
       pivot_size_store.set(int_checkbox_index, str_pv3);
       
     //  data_used_only_xx.remove(int_checkbox_index);
      //  data_used_only_indices.remove(int_checkbox_index);
      //  size_store.remove(int_checkbox_index);
      ////  data_used_name.remove(int_checkbox_index);
        
        System.out.println( pivot_data_used_only_xx);
        System.out.println( pivot_data_used_only_indices);
        System.out.println( pivot_size_store);
          System.out.println( pivot_size_store);
       //System.out.println(data_used_name);
   }
  
   private void update_arraylist() {
       int xx=data_used_only_xx.size();
        
        data_used_only_xx.remove(int_checkbox_index);
        data_used_only_indices.remove(int_checkbox_index);
        size_store.remove(int_checkbox_index);
        data_used_name.remove(int_checkbox_index);
        
        System.out.println(data_used_only_xx);
        System.out.println(data_used_only_indices);
        System.out.println(size_store);
        System.out.println(data_used_name);
        
        
        btnContinue.setVisible(true);
        btnRemoveAll.setVisible(true);
        btn_exit_1.setVisible(true);
                     
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
            str_caption2= data_used_only_xx.get(i);
             if(i==0){
                  chk1.setVisible(true);
             chk1.setText(str_caption+" ["+str_caption2+"]");
             chk1.setSelected(false);
             }
             else if(i==1){
             chk2.setVisible(true);
             chk2.setText(str_caption+" ["+str_caption2+"]");
             chk2.setSelected(false);
             }
             else if(i==2){
             chk3.setVisible(true);
             chk3.setText(str_caption+" ["+str_caption2+"]");
             chk3.setSelected(false);
             }
             else if(i==3){
             chk4.setVisible(true);
             chk4.setText(str_caption+" ["+str_caption2+"]");
             chk4.setSelected(false);
             }
             else if(i==4){
             chk5.setVisible(true);
             chk5.setText(str_caption+" ["+str_caption2+"]");
             chk5.setSelected(false);
             }
             else if(i==5){
             chk6.setVisible(true);
             chk6.setText(str_caption+" ["+str_caption2+"]");
             chk6.setSelected(false);
             }
             else if(i==6){
             chk7.setVisible(true);
             chk7.setText(str_caption+" ["+str_caption2+"]");
             chk7.setSelected(false);
             }
             else if(i==7){
             chk8.setVisible(true);
             chk8.setText(str_caption+" ["+str_caption2+"]");
             chk8.setSelected(false);
             }
             else if(i==8){
             chk9.setVisible(true);
             chk9.setText(str_caption+" ["+str_caption2+"]");
             chk9.setSelected(false);
             }
             else if(i==9){
             chk10.setVisible(true);
             chk10.setText(str_caption+" ["+str_caption2+"]");
             chk10.setSelected(false);
             }
             else if(i==10){
             chk11.setVisible(true);
             chk11.setText(str_caption+" ["+str_caption2+"]");
             chk11.setSelected(false);
             }
             else if(i==11){
             chk12.setVisible(true);
             chk12.setText(str_caption+" ["+str_caption2+"]");
             chk12.setSelected(false);
             }
              else if(i==12){
             chk13.setVisible(true);
             chk13.setText(str_caption+" ["+str_caption2+"]");
             chk13.setSelected(false);
             }
               else if(i==13){
             chk14.setVisible(true);
             chk14.setText(str_caption+" ["+str_caption2+"]");
             chk14.setSelected(false);
             }
             else if(i==14){
             chk15.setVisible(true);
             chk15.setText(str_caption+" ["+str_caption2+"]");
             chk15.setSelected(false);
             }
             else if(i==15){
             chk16.setVisible(true);
             chk16.setText(str_caption+" ["+str_caption2+"]");
             chk16.setSelected(false);
             }
             //////
               else if(i==16){
             chk17.setVisible(true);
             chk17.setText(str_caption+" ["+str_caption2+"]");
             chk17.setSelected(false);
             }
             else if(i==17){
             chk18.setVisible(true);
             chk18.setText(str_caption+" ["+str_caption2+"]");
             chk18.setSelected(false);
             }
             else if(i==18){
             chk19.setVisible(true);
             chk19.setText(str_caption+" ["+str_caption2+"]");
             chk19.setSelected(false);
             }
             else if(i==19){
             chk20.setVisible(true);
             chk20.setText(str_caption+" ["+str_caption2+"]");
             chk20.setSelected(false);
             }
             else if(i==20){
             chk21.setVisible(true);
             chk21.setText(str_caption+" ["+str_caption2+"]");
             chk21.setSelected(false);
             }
             else if(i==21){
             chk22.setVisible(true);
             chk22.setText(str_caption+" ["+str_caption2+"]");
             chk22.setSelected(false);
             }
             else if(i==22){
             chk23.setVisible(true);
             chk23.setText(str_caption+" ["+str_caption2+"]");
             chk23.setSelected(false);
             }
             else if(i==23){
             chk24.setVisible(true);
             chk24.setText(str_caption+" ["+str_caption2+"]");
             chk24.setSelected(false);
             }
             else if(i==24){
             chk25.setVisible(true);
             chk25.setText(str_caption+" ["+str_caption2+"]");
             chk25.setSelected(false);
             }
             else if(i==25){
             chk26.setVisible(true);
             chk26.setText(str_caption+" ["+str_caption2+"]");
             chk26.setSelected(false);
             }
             else if(i==26){
             chk27.setVisible(true);
             chk27.setText(str_caption+" ["+str_caption2+"]");
             chk27.setSelected(false);
             }
              else if(i==27){
             chk28.setVisible(true);
             chk28.setText(str_caption+" ["+str_caption2+"]");
             chk28.setSelected(false);
             }
             else if(i==28){
             chk29.setVisible(true);
             chk29.setText(str_caption+" ["+str_caption2+"]");
             chk29.setSelected(false);
             }
             else if(i==29){
             chk30.setVisible(true);
             chk30.setText(str_caption+" ["+str_caption2+"]");
             chk30.setSelected(false);
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
                                   //  insert_table_transition_2();
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
           clearx8();
         
         // String part5="$AA_ENC_COMP";
     //
         try{        
       //  String pxx=pathxx2;    
            // pathxx2=txt_path2.getText().toString().trim();
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
                   else if(comp_body.contains("backlasherror"))
                 {
                   int_backlash=comp_body.replaceAll("([a-z])", "");
                   //JOptionPane.showMessageDialog(null, int_step+"Step");
                 }
                 else if(comp_body.contains("compensationoutput"))
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
         if(compesation_errors.size()==0){
        status_pro_verify_compefile();
        finalise();
         }else{
          finalise();
         }
        // JOptionPane.showMessageDialog(null, "My errors "+compesation_errors);
    
    }
    }catch(Exception e){
    
    }
         
       
        return true;
     
        
       }
 private void finalise(){
  if(import_compesation_id==1){
         calculate_segments();
         select_row();
         // select_row_2();
         select_row_0();
         add_header_array();
         add_body_array();
         add_footer_1_array();
         add_footer_2_array();
         
        // insert_compes();
         insert_compes2();
       
       }else if(import_compesation_id==2){
       cec_calculate_segments();
        // cec_select_row();
         // select_row_2();
         cec_select_row_0();
         cec_add_header_array_0();         
         cec_add_header_array();
       //  HERE
        cec_add_body_array();
         
        // cec_add_footer_1_array();
         cec_add_footer_array_0();
         
        // cec_add_footer_2_array();
         
        // insert_compes();
         insert_compes2();
       }
       else{
       
       }
 }
 private void calculate_segments(){
     String int_min_xc=int_min;
    String int_max_xc=int_max;
    String int_step_xc=int_step;
    double mincc = Double.parseDouble(int_min_xc);
    double maxcc = Double.parseDouble(int_max_xc);
    double stepcc = Double.parseDouble(int_step_xc);
     
  //   int mincc = Integer.parseInt(int_min_xc);
   //  int maxcc = Integer.parseInt(int_max_xc);
  //   int stepcc = Integer.parseInt(int_step_xc);
     //int_min
     //int_max
     ///int_step
compesation_segments=(maxcc-mincc)/stepcc;
 }
 private void cec_calculate_segments(){
     String int_min_xc=int_min;
    String int_max_xc=int_max;
    String int_step_xc=int_step;
    double mincc = Double.parseDouble(int_min_xc);
    double maxcc = Double.parseDouble(int_max_xc);
    double stepcc = Double.parseDouble(int_step_xc);
     
  //   int mincc = Integer.parseInt(int_min_xc);
   //  int maxcc = Integer.parseInt(int_max_xc);
  //   int stepcc = Integer.parseInt(int_step_xc);
     //int_min
     //int_max
     ///int_step
compesation_segments=(maxcc-mincc)/stepcc;
 }
 private void select_row_0(){
     
     
     try{
         String sql = "select * from tbl_compensation_var_inputs";
           // String sql = "select * from tbl_enc_comp_compesation WHERE comp_min_0='"+int_min+"' AND comp_max_0='"+int_max+"' AND  comp_step_1='"+int_step+"' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();    
            if (rs.next()) {
                
               // String minxx = rs.getString("comp_min_0");  
                    String minxx =int_min;
                 //  String maxxx = rs.getString("comp_max_0"); 
                    String maxxx = int_max;
                  // String stepxx = rs.getString("comp_step_0"); 
                    String stepxx = int_step; 
                    
                   String ax =rs.getString("logic_machax_tab");
                    String modulo =rs.getString("body_modulo");
                   String backlash ="n/a";
                     String str_enc_com_ena =rs.getString("header_enable_0");
                   String str_enc_com_ena_1 =rs.getString("footer_enable_1");
                   String str_header_text=rs.getString("header_text");
                  String str_chandata=rs.getString("chandata");
                   String str_header_new_conf=rs.getString("header_newconf");
                    String str_footer_text=rs.getString("footer_end_text");
                     String str_footer_new_conf=rs.getString("footer_newconf");
                     String str_m=rs.getString("footer_m17");
                   
                  header_part1="";
                  header_part2=str_header_text;
                  header_part3=str_enc_com_ena; 
                  header_part4=str_header_new_conf;
                  header_part5=str_chandata;
                  
                 // header_part4=rs.getString("chandata"); 
                 // headeheader_part3="";r_part4="n/a"; 
                   body_part2=rs.getString("body_aa_enc_comp");
                 //  body_part3 = rs.getString("logic_machax");
                   body_part3 = rs.getString("logic_machax_tab");
                   body_part1="$AA_ENC_COMP";
                   body_part4="";
                   
                    footer_1_1="$AA_ENC_COMP_STEP[" + body_part2+"," +ax+ "]="+stepxx;
                   footer_1_2="$AA_ENC_COMP_MIN[" + body_part2+"," +ax+ "]="+minxx ;
                   footer_1_3="$AA_ENC_COMP_MAX[" + body_part2+"," +ax+ "]="+maxxx;
                   footer_1_4="$AA_ENC_COMP_IS_MODULO[" + body_part2+"," +ax+ "]="+modulo;
                  // footer_1_5="";
                   
                   
                   
                   footer_2_1="$MA_BACKLASH[" + body_part2+"," +ax+ "]="+int_backlash;
                   footer_2_2="";
                   footer_2_3=str_footer_text;
                   footer_2_4=str_enc_com_ena_1;
                   
                   footer_2_5=str_footer_new_conf;
                   footer_2_6=str_m;
                  // JOptionPane.showMessageDialog(null, minxx+" "+maxxx+" "+stepxx);
            
               }else{
           // JOptionPane.showMessageDialog(null, "No data");
            }    
   }
   catch (SQLException ex){
//System.out.println(ex.getMessage());
JOptionPane.showMessageDialog(null, ex.getMessage());
     }}
private void cec_select_row_0(){
    String sql = "select * from cec_tbl_compensation_var_inputs";
      try (
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)) {
           
            // loop through the result set
            while (rs.next()) {
                
                
                  // String minxx = rs.getString("comp_min_0");  
                    String minxx =int_min;
                 //  String maxxx = rs.getString("comp_max_0"); 
                    String maxxx = int_max;
                  // String stepxx = rs.getString("comp_step_0"); 
                    String stepxx = int_step; 
                    
                   String cec_chandata =rs.getString("chandata");
                    String selected_axis =rs.getString("selected_axis");
                   String cec_input_ncu =rs.getString("cec_input_ncu");
                     String cec_input_axis =rs.getString("cec_input_axis");
                   String cec_output_ncu =rs.getString("cec_output_ncu");
                   String cec_output_axis=rs.getString("cec_output_axis");
                  String cec_direction=rs.getString("cec_direction");
                   String cec_mult_by_table=rs.getString("cec_mult_by_table");
                    String cec_is_modulo=rs.getString("cec_is_modulo");
                    
                    String str_header_1=rs.getString("cec_header");
                     String str_header_2=rs.getString("cec_header_newconf");
                     String str_footer_1=rs.getString("cec_fooeter");
                     String str_footer_2=rs.getString("cec_footer_newconf");
                     String str_footer_3=rs.getString("m7");
                     
                    cec_str_header_1=str_header_1;
                    cec_str_header_2=str_header_2;
                    cec_str_footer_1=str_footer_1;
                    cec_str_footer_2=str_footer_2;
                    cec_str_footer_3=str_footer_3;
            
                  cec_cec_chandata=cec_chandata;
                
                   cec_selected_axis=selected_axis;
                 //  body_part3 = rs.getString("logic_machax");
                   cec_cec_input_axis= cec_input_axis;
                   body_part1="$AN_CEC";
                   body_part4="";
                   
                   
               
                    
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
     
   } 
 private boolean select_row(){
     
     
     try{
         String sql = "select * from tbl_enc_comp_compesation WHERE comp_min_1='"+int_min+"' AND comp_max_1='"+int_max+"' AND  comp_step_1='"+int_step+"' ";
         //String sql = "select * from tbl_enc_comp_compesation";
          //  String sql = "select * from tbl_enc_comp_compesation WHERE comp_min_1='"+int_min+"' AND comp_max_1='"+int_max+"' AND  comp_step_1='"+int_step+"' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();  
         //   String minxxg = rs.getString("comp_min_1");  
                 //  String maxxxg = rs.getString("comp_max_1");
            if (rs.next()) {
                  header_part4=rs.getString("chandata");  
                  return true;
            
               }else{
                header_part4="CHANDATA(-)";
                select_row_2();
                 return true;
           // JOptionPane.showMessageDialog(null, "No data");
            }    
   }
   catch (SQLException ex){
      header_part4="CHANDATA(-)";
       select_row_2();
//System.out.println(ex.getMessage());
//JOptionPane.showMessageDialog(null, ex.getMessage());


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
     
     return true;
    
         }
 private boolean cec_select_row(){
     String cec_chandata;
     
     try{
         String sql = "select * from cec_tbl_compensation_var_inputs WHERE comp_min_1='"+int_min+"' AND comp_max_1='"+int_max+"' AND  comp_step_1='"+int_step+"' ";
         //String sql = "select * from tbl_enc_comp_compesation";
          //  String sql = "select * from tbl_enc_comp_compesation WHERE comp_min_1='"+int_min+"' AND comp_max_1='"+int_max+"' AND  comp_step_1='"+int_step+"' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();  
         //   String minxxg = rs.getString("comp_min_1");  
                 //  String maxxxg = rs.getString("comp_max_1");
            if (rs.next()) {
                  cec_chandata=rs.getString("chandata");  
                  return true;
            
               }else{
                cec_chandata="CHANDATA(-)";
                select_row_2();
                 return true;
           // JOptionPane.showMessageDialog(null, "No data");
            }    
   }
   catch (SQLException ex){
      cec_chandata="CHANDATA(-)";
       select_row_2();
//System.out.println(ex.getMessage());
//JOptionPane.showMessageDialog(null, ex.getMessage());


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
     
     return true;
    
         }
 private boolean select_row_2(){
     
     
     try{
         String sql = "select * from tbl_enc_comp_compesation WHERE comp_min_0='"+int_min+"' AND comp_max_0='"+int_max+"' AND  comp_step_0='"+int_step+"' ";
         //String sql = "select * from tbl_enc_comp_compesation";
          //  String sql = "select * from tbl_enc_comp_compesation WHERE comp_min_1='"+int_min+"' AND comp_max_1='"+int_max+"' AND  comp_step_1='"+int_step+"' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();  
         //   String minxxg = rs.getString("comp_min_1");  
                 //  String maxxxg = rs.getString("comp_max_1");
            if (rs.next()) {
                  header_part4=rs.getString("chandata");  
                  return true;
            
               }else{
                header_part4="CHANDATA(-)";
                 return true;
           // JOptionPane.showMessageDialog(null, "No data");
            }    
   }
   catch (SQLException ex){
      header_part4="CHANDATA(-)";
//System.out.println(ex.getMessage());
//JOptionPane.showMessageDialog(null, ex.getMessage());


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
     
     return true;
    
         }
  private boolean cec_select_row_2(){
     
     
     try{
         String sql = "select * from tbl_enc_comp_compesation WHERE comp_min_0='"+int_min+"' AND comp_max_0='"+int_max+"' AND  comp_step_0='"+int_step+"' ";
         //String sql = "select * from tbl_enc_comp_compesation";
          //  String sql = "select * from tbl_enc_comp_compesation WHERE comp_min_1='"+int_min+"' AND comp_max_1='"+int_max+"' AND  comp_step_1='"+int_step+"' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();  
         //   String minxxg = rs.getString("comp_min_1");  
                 //  String maxxxg = rs.getString("comp_max_1");
            if (rs.next()) {
                  header_part4=rs.getString("chandata");  
                  return true;
            
               }else{
                header_part4="CHANDATA(-)";
                 return true;
           // JOptionPane.showMessageDialog(null, "No data");
            }    
   }
   catch (SQLException ex){
      header_part4="CHANDATA(-)";
//System.out.println(ex.getMessage());
//JOptionPane.showMessageDialog(null, ex.getMessage());


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
     
     return true;
    
         }
 private void add_header_array(){
     
     
         /* String header_part1="$MA_ENC_COMP_ENABLED[0]=0";
          String header_part2="NEWCONF";
          String header_part3="";
          String header_part4="CHANDATA(1)";*/
          int ixx=6;
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
          else if(i==4){
            dataxx="";
         }
          else if(i==5){
             dataxx=header_part5;
         }
         else{
         
         }
        compesation_data_1.add(dataxx);
       // /(compesation_data_1);
        }
 //System.out.println("Header"+compesation_data_1);
 }
 
 private void cec_add_header_array_0(){
                 
                    
                   int ixx=2;
         for(int i=0; i <ixx; i++){
         String dataxx="";
         if(i==0){
            dataxx= cec_str_header_1;
         }else if(i==1){
            // here
            dataxx=cec_str_header_2;
         }
                   
         else{
         //dataxx="";
         }
        compesation_data_1.add(dataxx);
       // /(compesation_data_1);
        }    
                    
 
 }
 
  private void cec_add_footer_array_0(){
                    
                  
                    
                   int ixx=3;
         for(int i=0; i <ixx; i++){
         String dataxx="";
         if(i==0){
            dataxx= cec_str_footer_1;
         }else if(i==1){
            // here
            dataxx=cec_str_footer_2;
         }
         else if(i==2){
            // here
            dataxx=cec_str_footer_3;
         }
                   
         else{
         //dataxx="";
         }
        compesation_data_1.add(dataxx);
       // /(compesation_data_1);
        }    
                    
 
 }
 private void cec_add_header_array(){
     
     
         /* String header_part1="$MA_ENC_COMP_ENABLED[0]=0";
          String header_part2="NEWCONF";
          String header_part3="";
          String header_part4="CHANDATA(1)";*/
          int ixx=2;
         for(int i=0; i <ixx; i++){
         String dataxx="";
         if(i==0){
            dataxx="";
         }else if(i==1){
            // here
            dataxx=cec_cec_chandata;
         }
         else if(i==2){
          dataxx="";
         }
          
         else{
         dataxx="";
         }
        compesation_data_1.add(dataxx);
       // /(compesation_data_1);
        }
 //System.out.println("Header"+compesation_data_1);
 }
 private void add_body_array(){
     
        /*  String body_part1="$AA_ENC_COMP";
          String body_part2="1";
          String body_part3="AX1";
          String body_part4="0";*/
          int ixxb= (int) Math.round(compesation_segments);
         // int ixxb=compesation_segments;
          for(int i=0; i <ixxb+1; i++){
          String error_value =compesation_errors.get(i);
          String dataxx=body_part1+"["+body_part2+","+i+","+body_part3+"]"+"="+error_value;
        
        compesation_data_1.add(dataxx);
        
        }
 // compesation_data_1.add("");
// System.out.println("body"+compesation_data_1);
 }
 private void cec_add_body_array(){
     System.out.println("body"+temp_body_compesation_data_1);
       
         // int ixxb=compesation_segments;
 for(int i=0; i < temp_body_compesation_data_1.size(); i++){
        //  String error_value =compesation_errors.get(i);
          String dataxx=temp_body_compesation_data_1.get(i);
        
        compesation_data_1.add(dataxx);
        
        }
 
 temp_body_compesation_data_1.clear();
 // compesation_data_1.add("");
// System.out.println("body"+compesation_data_1);
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
             dataxx=footer_2_1;
         }
         else{
         //dataxx="";
         }
        compesation_data_1.add(dataxx);
        
        }
         System.out.println(compesation_data_1);
        // System.out.println("footer_1"+compesation_data_1);
 }
 private void cec_add_footer_1_array(){
    
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
            dataxx=footer_2_2;
         }else if(i==1){
            dataxx=footer_2_3;
            //footer_2_footer_text
         }
         else if(i==2){
          dataxx=footer_2_4;
         }
          else if(i==3){
             dataxx=footer_2_5;
         }
           else if(i==4){
             dataxx=footer_2_6;
         } else{
        // dataxx="";
         }
        compesation_data_1.add(dataxx);
      //  System.out.println(compesation_data_1);
        }
         //System.out.println("footer_2"+compesation_data_1);
 }
 private void cec_add_footer_2_array(){
     
        /*  String footer_2_1="$MA_BACKLASH[0,AX1]=0";
          String footer_2_2="$MA_ENC_COMP_ENABLE[0]=1";
          String footer_2_3="NEWCONF";
          String footer_2_4="M17";*/
         int ixx=7;
         for(int i=0; i <ixx; i++){
         String dataxx="";
         if(i==0){
            dataxx=footer_2_1;
         }else if(i==1){
            dataxx=footer_2_2;
            //footer_2_footer_text
         }
         else if(i==2){
          dataxx=footer_2_3;
         }
          else if(i==3){
             dataxx=footer_2_4;
         }
           else if(i==4){
             dataxx=footer_2_5;
         }
            else if(i==5){
             dataxx=footer_2_6;
         }
         else{
         dataxx="";
         }
        compesation_data_1.add(dataxx);
      //  System.out.println(compesation_data_1);
        }
         //System.out.println("footer_2"+compesation_data_1);
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
                                     if(quick_finish_mode==0){
                                       hide_all_checkboxes();
                                       insert_used_values_row();
                                        
                                     }
                                      initialise_the_other_arraylista(); 
                                       int_array_size_for_used=size_store.size();
                                       
                                       
                                    for(ixx =ixx; ixx<data_chabdata_count.size(); ixx++)
                                     {
                                         
                                     //count_number_of_loops=count_number_of_loops;
                                         if(quick_finish_mode==0){
                                     start_timer2();
                                     countLines();}
                                     chandata_loop=data_chabdata_count.get(ixx);
                                    // insert_table_transition();
                                     if(!chandata_loop.equals("")){
                                    // insert_used_only(); 
                                         if(quick_finish_mode==0){
                                      insert_multiple_pockets();
                                      
                                         }
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
                                    update_table_2();
                                    reset_progres_bar();
                                    enable_components();
                                    //path.setText("");
                                    quick_finish_mode=0;
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

       private void reset_progres_bar() {
           lbl_per.setText("Process has completed successfully!");
           clear_pivot();
           //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
      private void clearx8() {
        
         String sql = " delete from  tbl_processed_table_compe where id > ?";
        //String sql = "TRUNCATE TABLE tbl_chandata";
         
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "0");            
            pst.execute();
        }
        catch (Exception e){
           
        }
       
    }
    private void clearx2() {
        
         String sql = " delete from  tbl_processed_table where id > ?";
        //String sql = "TRUNCATE TABLE tbl_chandata";
         
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "0");            
            pst.execute();
         
        }
        catch (Exception e){
                 
        }
   
    }
    
            
             private void clear_8() {
        
         String sql = " delete from tbl_cec_comp_compesation where id > ?";
        //String sql = "TRUNCATE TABLE tbl_chandata";
         
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "0");            
            pst.execute();
         
        }
        catch (Exception e){
                 
        }
   
    }
    private void clearx7() {
        
         String sql = " delete from  tbl_compensation_var_inputs where id > ?";
        //String sql = "TRUNCATE TABLE tbl_chandata";
         
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "0");            
            pst.execute();
         
        }
        catch (Exception e){
                 
        }
   
    }
    private void cec_clearx7() {
        
         String sql = " delete from  cec_tbl_compensation_var_inputs where id > ?";
        //String sql = "TRUNCATE TABLE tbl_chandata";
         
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, "0");            
            pst.execute();
         
        }
        catch (Exception e){
                 
        }
   
    }
     private void clear_cec_x2() {
        
         String sql = " delete from  tbl_processed_cec_table where id > ?";
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
                  System.out.println(data_used_only_indices);
                  System.out.println(data_used_name);
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
        int used_count=0;
        reset_dble();
         try{        
         String pxx=pathxx;     
         FileReader fileReader = new FileReader(pathxx);
         try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      //String line;
         while((line = bufferedReader.readLine()) != null) {
          
         //  System.out.println("Reached " + fl_row_number+" "+line);
         //  System.out.println("Reached " + fl_row_number+" "+line);
           
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
              if(firstFourChars.equals("CHANDATA") || first6Char.equals("N20000") || first6Char.equals("N10000") || first6Char.equals("N41300") || first6Char.equals("N18342")  ){
               if(first6Char.equals("N10000")){
                   str_base_id_count_1=str_base_id_count_1+1;
                  
                    str_base_id=1;  
               }   
                if(first6Char.equals("N41300")){
                    str_base_id_count_2=str_base_id_count_2+1;
                  
                    str_base_id=2;
               }  
                
                if(first6Char.equals("N18342")){
                    str_base_id_count_3=str_base_id_count_3+1;
                  
                    str_base_id=3;
               } 
                  
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
                 str_asset_status = str_asset_status.replace("\"", "");
                // str_asset_status = str_asset_status.substring(str_asset_status.indexOf("") + 1, str_asset_status.indexOf("s"));
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
                        
                        
                        //////////////////let pos start from zero//////////////////////
                        if(     !str_asset_body.contains("$MA_IS_ROT_AX") 
                                || !str_asset_body.contains("$MA_ROT_IS_MODULO")
                                ){
                            
                        int_str_pos_counter = Integer.parseInt(str_pos_counter);
                        int_str_pos_counter=int_str_pos_counter+1;
                         int_str_pos_counter_1=int_str_pos_counter-1;
                        str_pos_counter=int_str_pos_counter+"";
                        str_pos_counter_1=int_str_pos_counter_1+"";
                        str_pos_counter_1=int_str_pos_counter_1+"";
                        }
                        ////////////////////////////////////
                        
                      // int_str_asset_status=Integer.parseInt(str_asset_status);
                        if(str_base_id==2){
                        int_str_asset_status=Integer.parseInt(str_asset_status);
                        if(int_str_asset_status!=0){
                            loop_pass=1;
                        
                        }else{
                         loop_pass=0;
                        }
                        }else if(str_base_id==1){
                            
                               if(!str_asset_status.equals("")){
                                loop_pass=1;
                        
                               }else{
                               loop_pass=0;
                               }
                       // str_asset_status=str_asset_status;
                        }else if(str_base_id==3){
                            
                               if(!str_asset_status.equals("")){
                                loop_pass=1;
                        
                               }else{
                               loop_pass=0;
                               }
                       // str_asset_status=str_asset_status;
                        }
                        
                        else{
                        
                        }
                       if(loop_pass==1){
                        insert_data();
                        //////////check body repetion/////////////
                        
                    stmt2= conn.createStatement();
                    String sql_rep="Select * from tbl_processed_table where col1 = '" + str_asset_body + "'";
                    rs=stmt2.executeQuery(sql_rep);
                    if(rs.next()){
                   //  System.out.println(""); 
                   // return;
                    }else{
                       //////////end check body repetion/////////////
                        if(!old_str_asset_def_body.equals("n/a")){
                         if(old_str_asset_def_body.equals(str_asset_def_body)){
                            old_str_asset_def_body =str_asset_def_body;
                         ///////////add data to arraylist////////////
                            if(str_chandata.equals(chandata_loop)){
                                last_chandata_loop=chandata_loop;
                                if(str_base_id==1){
                                    data_used_only_xx.add(str_asset_status);
                                    
                                    data_used_only_indices.add("["+str_pos_counter_1+"]");
                                 //   System.out.println(data_used_only_indices);
                                    size_store.add(str_pos_counter);
                                    str_base_id=0;
                                }else if (str_base_id==2){
                                     cec_data_used_only_xx.add(str_asset_status);
                                     cec_data_2.add(str_asset_status);
                                    cec_data_used_only_indices.add("41300"+"["+str_pos_counter_1+"]");
                                    cec_size_store.add(str_pos_counter); 
                                     str_base_id=0;
                                }else if(str_base_id==3){
                                    
                                if(!str_asset_status.equals("0")){
                                point_cec_data.add(str_asset_status);
                                
                                }
                                str_base_id=0;
                                }
                                
                                
                                else{
                                
                                }
                    
                            }
                        ////////////end add data to arraylist//////////////
                        }else{
                         
                           if(str_base_id==0){
                           if(str_chandata.equals(chandata_loop) && used_chennel_count !=0){  
                             //open_choose_used_axis(); 
                          return true;
                         }                       
                         
                         //return true;
                           
                           }
                         if (str_base_id==2){
                                      cec_data_used_only_xx.add(str_asset_status);
                                      cec_data_2.add(str_asset_status);
                                      cec_data_used_only_indices.add("41300"+"["+str_pos_counter_1+"]");
                                      cec_size_store.add(str_pos_counter); 
                                     str_base_id=0;
                                      old_str_asset_def_body =str_asset_def_body;
                                }
                         
                          if (str_base_id==3){
                                      if(!str_asset_status.equals("0")){
                                point_cec_data.add(str_asset_status);
                                
                                }
                                     str_base_id=0;
                                      old_str_asset_def_body =str_asset_def_body;
                                }
                         
                          if(str_base_id==1){
                                   // data_used_only_xx.add(str_asset_status);
                                  ///  data_used_only_indices.add("("+str_pos_counter_1+")");
                                  //  size_store.add(str_pos_counter);
                                  //  System.out.println(data_used_only_indices);
                                 str_base_id=0;
                                 old_str_asset_def_body =str_asset_def_body;
                                }
                            
                        }
                         }else{
                            old_str_asset_def_body =str_asset_def_body;
                           if(str_chandata.equals(chandata_loop)){
                               
                         
                          if(str_base_id==1){
                                    data_used_only_xx.add(str_asset_status);
                                    data_used_only_indices.add("["+str_pos_counter_1+"]");
                                  //   System.out.println(data_used_only_indices);
                                    size_store.add(str_pos_counter);
                                
                                }else if (str_base_id==2){
                                     cec_data_used_only_xx.add(str_asset_status);
                                     cec_data_2.add(str_asset_status);
                                     cec_data_used_only_indices.add("["+str_pos_counter_1+"]");
                                     cec_size_store.add(str_pos_counter); 
                                
                                }else if(str_base_id==3){
                                    
                                if(!str_asset_status.equals("0")){
                                point_cec_data.add(str_asset_status);
                                
                                }
                               // str_base_id=0;
                                }
                                
                                else{
                                
                                }
                         
                            }
                            }
                        ////////////////
                       }
                    loop_pass=0;
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
               
                  
                 
                
                 
                 
           }   
        
      }
         loop23();
      
    }
    }catch(Exception e){}
         
        reset_dble(); 
      // if(used_inserted_status==0){
            //  insert_used_values_row();
                         
             if(str_chandata.equals(chandata_loop) && used_chennel_count !=0){
                    
                   // insert_used_values_row();
                   // open_choose_used_axis(); 
                    return true;
                           
                 } 
            // return true;
      // }
  //  used_inserted_status=0;   
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }
    
    private void loop23(){
     if(data_used_only_xx.size() != 0 || cec_data_used_only_xx.size() != 0 || point_cec_data.size() != 0){
              //  if(end_used_only==0 && old_str_asset_def_body.equals("$MC_AXCONF_MACHAX_USED")){
                  //  if(old_str_asset_def_body.equals("$MC_AXCONF_MACHAX_USED") || old_str_asset_def_body.equals("$SN_CEC_TABLE_ENABLE")){
                //used_chennel_count=data_used_only_xx.size();
                if(last_chandata_loop.equals(chandata_loop)){
                    System.out.println(" USED "+data_used_only_xx);
                     System.out.println(" ENABLE "+data_used_only_xx);
                     System.out.println(" POINT "+point_cec_data);
                   // insert_used_values_row();
                     
                     clear_pivot();
                    open_choose_used_axis(); 
                    str_base_id_count_1=0;
                    str_base_id_count_2=0;
                     str_base_id_count_3=0;
                  //  return true;
                           
               //  }
              
               }else{
                    quick_finish_mode=1;
                     stop_timer();
                    continue_with_loop();
                      str_base_id_count_1=0;
                    str_base_id_count_2=0;
                    str_base_id_count_3=0;
                // JOptionPane.showMessageDialog(null, "Error"+ last_chandata_loop+" and "+chandata_loop+" are ");
                }
                 }else{
                      quick_finish_mode=1;
                    // stoptimer();
                     stop_timer();
                    continue_with_loop();
                      str_base_id_count_1=0;
                    str_base_id_count_2=0;
                    str_base_id_count_3=0;
                     }
    }
    private void reset_dble() {
        
                double fl_row_number = 0.0;
                double  fl_cnt = 0.0;        
                double per_pr=  0.0; 
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private boolean insert_array() {
        
        
        leng = data.size();
      int ss = data_used_only_xx.size();
    System.out.println(data);
        
     if(leng > 0){
         check_validity();
       if(proceed_code==8888){
         System.out.println(data);
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
            pst.setString(29, asset_code_dif_col); 
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
     }
     if(!old_str_asset_def_body.equals("n/a")){
    // JOptionPane.showMessageDialog(null, old_str_asset_def_body+" Is blank "+chandata_loop);
     }
      
     
    // data.clear();
     ss = data_used_only_xx.size();
     end_used_only =1;
     asset_code_dif_col="";
     old_str_asset_def_body="n/a";
     if(!old_str_asset_def_body.equals(str_asset_def_body) && loop_id==2){
     data.add(str_asset_status);
     }
     proceed_code=0;
    
       
       return true;
    }
    private boolean check_validity(){
        String xcv="";
        for(int i=0; i< data.size(); i++){
            xcv=data.get(i);
            if(!xcv.equals("")){
              proceed_code=8888;
              return true;
            }else{
                if(i==data.size()-1){
                proceed_code=0;
                return true;
                }
                
                
            }
        
        }
    return true;
    }
    private void insert_array_cc(){
        
        if(data.size() > 0){
         check_validity();
       if(proceed_code==8888){
        
         int loop_times=0;
                      loop_times=60-data.size();
                       
                       for(int i=0; i< loop_times; i++){
                       data.add("");
                       }
                     /////////////////////////////////////////////////////  
                     
                       
     String[] stringArray = data.toArray(new String[data.size()]);
    // if(str_chandata.equals(chandata_loop)){
                  var1x=old_str_asset_def_body; 
    String sqlInsert = "insert into tbl_processed_cec_table(col1, col2, col3, col4,col5,col6, col7, col8, col9,col10,col11, col12,col13, col14, col15,col16, col17, col18, col19,col20,col21, col22, col23, col24,col25,col26, col27, col28, col29, col30,col31, col32, col33, col34,col35,col36, col37, col38, col39,col40,col41, col42,col43, col44, col45,col46, col47, col48, col49,col50,col51, col52, col53, col54,col55,col56, col57, col58, col59, col60, col61) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
          
try (PreparedStatement pst = conn.prepareStatement(sqlInsert)) {
             pst.setString(1, var1x);
            pst.setString(2, stringArray[0]);
            pst.setString(3, stringArray[1]);      
            pst.setString(4, stringArray[2]); 
            pst.setString(5, stringArray[3]);
            pst.setString(6, stringArray[4]);
            pst.setString(7, stringArray[5]); 
            pst.setString(8, stringArray[6]);
            pst.setString(9, stringArray[7]);
            pst.setString(10, stringArray[8]);     
            pst.setString(11, stringArray[9]);
            pst.setString(12, stringArray[10]);           
            pst.setString(13, stringArray[11]);       
            pst.setString(14, stringArray[12]);
            pst.setString(15, stringArray[13]);
            pst.setString(16, stringArray[14]);
            pst.setString(17, stringArray[15]);
            pst.setString(18, stringArray[16]);
            pst.setString(19, stringArray[17]);
            pst.setString(20, stringArray[18]);     
            pst.setString(21, stringArray[19]);
            pst.setString(22, stringArray[20]);           
            pst.setString(23, stringArray[21]);
            pst.setString(24, stringArray[22]);
            pst.setString(25, stringArray[23]);
            pst.setString(26, stringArray[24]);     
            pst.setString(27, stringArray[25]);
            pst.setString(28, stringArray[26]);
            pst.setString(29, stringArray[27]); 
            pst.setString(30, stringArray[28]);
            
             pst.setString(31, stringArray[29]);
            pst.setString(32, stringArray[30]);
            pst.setString(33, stringArray[31]);      
            pst.setString(34, stringArray[32]);
            pst.setString(35, stringArray[33]);
            pst.setString(36, stringArray[34]);
            pst.setString(37, stringArray[35]);
            pst.setString(38, stringArray[36]);
            pst.setString(39, stringArray[37]);
            pst.setString(40, stringArray[38]);    
            pst.setString(41, stringArray[39]);      
            pst.setString(42, stringArray[40]);     
            pst.setString(43, stringArray[41]);   
            pst.setString(44, stringArray[42]);
            pst.setString(45, stringArray[43]);
            pst.setString(46, stringArray[44]);
            pst.setString(47, stringArray[45]);
            pst.setString(48, stringArray[46]);
            pst.setString(49, stringArray[47]);
            pst.setString(50, stringArray[48]);
            pst.setString(51, stringArray[49]);
            pst.setString(52, stringArray[50]);  
            pst.setString(53, stringArray[51]);
            pst.setString(54, stringArray[52]);
            pst.setString(55, stringArray[53]);
            pst.setString(56, stringArray[54]);
            pst.setString(57, stringArray[55]);
            pst.setString(58, stringArray[56]);
            pst.setString(59, stringArray[57]);
             pst.setString(60, asset_code_dif_col);
            pst.setString(61, str_index);
    int updateCount = pst.executeUpdate(); // 1 when inserted 1 record
}catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);

}
str_index="";
data.clear();

}
    }
//////////////////////////////////////////////////////
    }
      private void insert_array_ccc() {
      
     // fetch_my_data();
        

        String sql = "insert into tbl_processed_cec_table(col1, col2, col3, col4,col5,col6, col7, col8, col9,col10,col11, col12,col13, col14, col15,col16, col17, col18, col19,col20,col21, col22, col23, col24,col25,col26, col27, col28, col29, col30,col31, col32, col33, col34,col35,col36, col37, col38, col39,col40,col41, col42,col43, col44, col45,col46, col47, col48, col49,col50,col51, col52, col53, col54,col55,col56, col57, col58, col59, col60, col61) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
          try {
          /* ;
                      ; 
                      ; 
                      ; 
                      ; 
                      var7x=stringArray[5]; 
                      var8x=
                      var9x=stringArray[7]; 
                      var10x=stringArray[8]; 
                      var11x=stringArray[9]; 
                      var12x=stringArray[10]; 
                      var13x=stringArray[11]; 
                      var14x=stringArray[12]; 
                      var15x=stringArray[13]; 
                       var16x=stringArray[14]; 
                      var17x=stringArray[15]; 
                      var18x=stringArray[16]; 
                      var19x=stringArray[17]; 
                      var20x=stringArray[18]; 
                      var21x=stringArray[19]; 
                      var22x=stringArray[20]; 
                      var23x=stringArray[21]; 
                      var24x=stringArray[22]; 
                      var25x=stringArray[23]; 
                      var26x=stringArray[24]; 
                      var27x=stringArray[25]; 
                      var28x=stringArray[26]; 
                      var29x=stringArray[27]; 
                      var30x=stringArray[28]; 
                      var31x=stringArray[29]; 
                      var32x=stringArray[30]; 
                      var33x=stringArray[31]; 
                      var34x=stringArray[32]; 
                      var35x=stringArray[33]; 
                      var36x=stringArray[34]; 
                      var37x=stringArray[35]; 
                      var38x=stringArray[36]; 
                      var39x=stringArray[37]; 
                      var40x=stringArray[38]; 
                      var41x=stringArray[39]; 
                      var42x=stringArray[40]; 
                      var43x=stringArray[41]; 
                      var44x=stringArray[42]; 
                       var45x=stringArray[43]; 
                      var46x=stringArray[44]; 
                      var47x=stringArray[45]; 
                      var48x=stringArray[46]; 
                      var49x=stringArray[47]; 
                      var50x=stringArray[48]; 
                      var51x=stringArray[49]; 
                      var52x=stringArray[50]; 
                      var53x=stringArray[51]; 
                      var54x=stringArray[52]; 
                      var55x=stringArray[53]; 
                      var56x=stringArray[54]; 
                      var57x=stringArray[55]; 
                      var58x=stringArray[56]; 
                      var59x=stringArray[57]; 
                      var60x=stringArray[58]; 
                      var61x=stringArray[59]; */    
     /*  pst = conn.prepareStatement(sql);
            pst.setString(1, var1x);
            pst.setString(2, stringArray[0]);
            pst.setString(3, stringArray[1]);      
            pst.setString(4, stringArray[2]); 
            pst.setString(5, stringArray[3]);
            pst.setString(6, stringArray[4]);
            pst.setString(7, stringArray[5]); 
            pst.setString(8, stringArray[6]);
            pst.setString(9, stringArray[6]);
            pst.setString(10, stringArray[6]);     
            pst.setString(11, stringArray[6]);
            pst.setString(12, stringArray[6]);           
            pst.setString(13, stringArray[6]);       
            pst.setString(14, stringArray[6]);
            pst.setString(15, stringArray[6]);
            pst.setString(16, stringArray[6]);
            pst.setString(17, stringArray[6]);
            pst.setString(18, stringArray[6]);
            pst.setString(19, stringArray[6]);
            pst.setString(20, stringArray[6]);     
            pst.setString(21, stringArray[6]);
            pst.setString(22, stringArray[6]);           
            pst.setString(23, stringArray[6]);
            pst.setString(24, stringArray[6]);
            pst.setString(25, stringArray[6]);
            pst.setString(26, stringArray[6]);     
            pst.setString(27, stringArray[6]);
            pst.setString(28, stringArray[6]);
            pst.setString(29, stringArray[6]); 
            pst.setString(30, stringArray[6]);
            
             pst.setString(31, stringArray[6]);
            pst.setString(32, stringArray[6]);
            pst.setString(33, stringArray[6]);      
            pst.setString(34, stringArray[6]);
            pst.setString(35, stringArray[6]);
            pst.setString(36, stringArray[6]);
            pst.setString(37, stringArray[6]);
            pst.setString(38, stringArray[6]);
            pst.setString(39, stringArray[6]);
            pst.setString(40, stringArray[6]);    
            pst.setString(41, stringArray[6]);      
            pst.setString(42, stringArray[6]);     
            pst.setString(43, stringArray[6]);   
            pst.setString(44, stringArray[6]);
            pst.setString(45, stringArray[6]);
            pst.setString(46, stringArray[6]);
            pst.setString(47, stringArray[6]);
            pst.setString(48, stringArray[6]);
            pst.setString(49, stringArray[6]);
            pst.setString(50, stringArray[6]);
            pst.setString(51, stringArray[6]);
            pst.setString(52, stringArray[6]);  
            pst.setString(53, stringArray[6]);
            pst.setString(54, stringArray[6]);
            pst.setString(55, stringArray[6]);
            pst.setString(56, stringArray[6]);
            pst.setString(57, stringArray[6]);
            pst.setString(58, stringArray[6]);
            pst.setString(59, stringArray[6]);
             pst.setString(60, stringArray[6]);
            pst.setString(61, stringArray[6]);*/
           
 pst.setString(1, "pp");
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
            
             pst.setString(31, "");
            pst.setString(32, "");
            pst.setString(33, "");       
            pst.setString(34, "");
            pst.setString(35, "");
            pst.setString(36, "");
            pst.setString(37, "");
            pst.setString(38, "");
            pst.setString(39, "");
            pst.setString(40, "");     
            pst.setString(41, ""); 
            pst.setString(42, "");           
            pst.setString(43, "");      
            pst.setString(44, "");
            pst.setString(45, "");
            pst.setString(46, "");
            pst.setString(47, "");
            pst.setString(48, "");
            pst.setString(49, "");
            pst.setString(50, "");      
            pst.setString(51, "");  
            pst.setString(52, "");           
            pst.setString(53, "");
            pst.setString(54, "");
            pst.setString(55, "");
            pst.setString(56, "");       
            pst.setString(57, ""); 
            pst.setString(58, ""); 
            pst.setString(59, ""); 
             pst.setString(60, "");
            pst.setString(61, ""); 
            pst.execute();  
      
         pst.close();         
         data.clear();
    }catch(Exception e){
    
    }
       
       
 
   
                   /*try {    var31x=stringArray[28]; } catch (IndexOutOfBoundsException e) { var31x=""; }
                  try {    var32x=stringArray[29]; } catch (IndexOutOfBoundsException e) { var32x=""; }
                  try {    var33x=stringArray[30]; } catch (IndexOutOfBoundsException e) { var33x=""; }*/
                  
            
           /* pst.setString(1, var1x);
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
            pst.setString(30, var30x);          
            pst.setString(31, var31x);
            pst.setString(32, var32x);
            pst.setString(33, var33x);       
            pst.setString(34, var34x);  
            pst.setString(35, var35x); 
            pst.setString(36, var36x);
            pst.setString(37, var37x);
            pst.setString(38, var38x);
            pst.setString(39, var39x);
            pst.setString(40, var40x);       
            pst.setString(41, var41x);  
            pst.setString(42, var42x);             
            pst.setString(43, var43x);       
            pst.setString(44, var44x);  
            pst.setString(45, var45x); 
            pst.setString(46, var46x);
            pst.setString(47, var47x);
            pst.setString(48, var48x);
            pst.setString(49, var49x);
            pst.setString(50, var50x);       
            pst.setString(51, var51x);  
            pst.setString(52, var52x);             
            pst.setString(53, var53x);
            pst.setString(54, var54x);
            pst.setString(55, var55x);
            pst.setString(56, var56x);       
            pst.setString(57, var57x);  
            pst.setString(58, var58x); 
            pst.setString(59, var59x); 
             pst.setString(60, var60x); 
            pst.setString(61, chandata_loop); 

            pst.execute();  
      
         pst.close();         
            
                  
                }else{
                  
            JOptionPane.showMessageDialog(null, var1x+" Rejected");
                  }
             
    } catch (SQLException ex) {
        System.err.println("Error = " + ex);
    }*/
     
  
    
    
  
    }
    private void fetch_my_data(){
                     
                 // if(leng == leng){
                
                      
                      
                    
    
   
    
    }
    
    private void insert_array_2() {
        leng = data.size();
      int leng2 = data_used_only_xx.size();
      
        
     if(leng > 0){
         
          check_validity();
       if(proceed_code==8888){
         
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
            pst.setString(29, asset_code_dif_col); 
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
    private boolean insert_multiple_pockets() {    
        
      set_cec_arrays();
        
           reset_dble();
         try{  
             // Arc_Import mainClass = new Arc_Import();                 
                             // mainClass.UpdateJTable();
                              // pathxx= mainClass.pathx;
        FileReader fileReader = new FileReader(pathxx);           
       // FileReader fileReader = new FileReader("C:\\Users\\peter\\Desktop\\aa\\CEC_SAMPLE_DATA.txt");
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
                
                if (skip_all_id == 0){
                          //          if (0==0){

               // ffxxff
                
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
         System.out.println("["+chandata_loop+"]"+""+row_of_rows+" "+fl_row_number); 
       //  System.out.println(fl_row_number);
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
                   || first6Char.equals("N41300")
                   
                   || first6Char.equals("N41310")
                   || first6Char.equals("N32450")
                   || first6Char.equals("N38000")
                   || first6Char.equals("$AN_CE")   
                   || first16Char.equals("$AA_ENC_COMP_STE")   
                   || first16Char.equals("$AA_ENC_COMP_MIN")
                   || first16Char.equals("$AA_ENC_COMP_MAX")
                   || first16Char.equals("$AA_ENC_COMP_IS_")
                   
                   
                   
                   || first6Char.equals("N20060") 
                   || first6Char.equals("N20080") 
                   || first6Char.equals("N30310") 
                   || first6Char.equals("N20050") 
                 
                 
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
                   ||str_asset_def_body.equals("$MA_ROT_IS_MODULO")
                    ||str_asset_def_body.equals("$SN_CEC_TABLE_ENABLE") 
                    
                    
                    ){
                 str_pos_counter = str_pos_counter_compound.replaceAll("[^0-9]", "");
                     
                 }else if(str_asset_def_body.equals("$MN_AXCONF_LOGIC_MACHAX_TAB")
                    ||str_asset_def_body.equals("$MN_AXCONF_MACHAX_NAME_TAB")  
                         ||str_asset_def_body.equals("$SN_CEC_TABLE_WEIGHT")
                         ||str_asset_def_body.equals("$MC_AXCONF_GEOAX_ASSIGN_TAB") 
                         ||str_asset_def_body.equals("$MC_AXCONF_GEOAX_NAME_TAB")
                         ||str_asset_def_body.equals("$MC_AXCONF_CHANAX_NAME_TAB")                         
                          ||str_asset_def_body.equals("$MN_MM_CEC_MAX_POINTS"))
                     
                     
                     
                 {
                 str_pos_counter = str_pos_counter_compound.replaceAll("[^0-9]", "");
                 int int_pos = Integer.parseInt(str_pos_counter)+1;
                 str_pos_counter=int_pos+"";
                 
                 
                 
                  if(str_asset_def_body.equals("$MN_MM_CEC_MAX_POINTS")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                 try{
                                                        check_position_to_insert();
                                                        data15.set(int_positon_to_insert, str_asset_status);
                                                 }catch(Exception ex){}
                                                 
                                                  try{
                                                        cec_check_position_to_insert();
                                                        cec_data_1.set(int_positon_to_insert, str_asset_status);
                                                 }catch(Exception ex){}
                                                       
                                                        
                                                        
                                                        
                                                         System.out.println(" CEC1"+data15);
                                                        System.out.println(" CEC2"+cec_data_1);
                                                        
                                                }
                                            
                                        }
                 
                 }
                 /////////////////////////////3RD OPTION/////////////////////////////
                 else if(str_asset_def_body.equals("$AN_CEC_INPUT_NCU")
                    ||str_asset_def_body.equals("$AN_CEC_INPUT_AXIS") 
                         ||str_asset_def_body.equals("$AN_CEC_OUTPUT_AXIS")                          
                    ||str_asset_def_body.equals("$AN_CEC_OUTPUT_NCU")                         
                     ||str_asset_def_body.equals("$AN_CEC_STEP")                   
                    ||str_asset_def_body.equals("$AN_CEC_MIN")    
                     ||str_asset_def_body.equals("$AN_CEC_MAX")                   
                    ||str_asset_def_body.equals("$AN_CEC_DIRECTION")
                    ||str_asset_def_body.equals("$AN_CEC_MULT_BY_TABLE")                   
                    ||str_asset_def_body.equals("$AN_CEC_IS_MODULO")
                    ||str_asset_def_body.equals("$AN_CEC_TYPE")   
                         
                         )
                 {
                 str_pos_counter = str_pos_counter_compound.replaceAll("[^0-9]", "");
                 int int_pos = Integer.parseInt(str_pos_counter)+1;
                 str_pos_counter=int_pos+"";
                 
                 }
                 ///////////////////////////3RD ////////////////////////////////
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
                        
                        System.out.println(str_pos_counter ); 
                         Statement stmt22;
                         String par ="$MN_AXCONF_MACHAX_NAME_TAB";
                         String par2 ="$SN_CEC_TABLE_ENABLE";
                    stmt22= conn.createStatement();
                    String sql1122="Select * from tbl_chandata where str_asset_body LIKE '%"+par+"%' and  pos_counter = '" + str_pos_counter + "' ";
                    rs=stmt2.executeQuery(sql1122);
                    if(rs.next()){
                        //////
                           proceed_to_re_fill();            
          ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////              
                       
                    }else{
                         Statement stmt33;
                     stmt33= conn.createStatement();
                    String sql1133="Select * from tbl_chandata where  str_asset_body LIKE '%"+par2+"%' and  pos_counter = '" + str_pos_counter + "' ";
                    rs=stmt33.executeQuery(sql1133);
                    if(rs.next()){
                        //////
                           proceed_to_re_fill();            
          ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////              
                       
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
                
       } else if(skip_all_id == 1){
       
       skip_all_id=0;
       return true;
       }else{
       
       }
              //  skip_all_id=0;
        //ffX
      }
      reset_dble();
    }
    }catch(Exception e){}    
         SW1.cancel(true);           
         SW2.cancel(true);
           arr1.clear();
            arr2.clear();
       //  JOptionPane.showMessageDialog(null, ""); 
        // SW1.addPropertyChangeListener(null);
         //create_muliti_dimentional_array();
         cec_create_muliti_dimentional_array();
         finish_loops();
        
         stop_threads();
      
         reset_varaiables();
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        
      // 
        status_used_sess_2=0;
        return true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_0() {
        int xx =data10.size();
        old_str_asset_def_body="$MA_CEC_ENABLE";
        asset_code_dif_col="N32700";
        data.clear();
        xx =data10.size();
        data=data0;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_1() {
        old_str_asset_def_body="$MA_ENC_IS_LINEAR[0]";
        asset_code_dif_col="N31000";
        data.clear();
        data=data1;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_2() {
        old_str_asset_def_body="$MA_ENC_IS_LINEAR[1]";
        asset_code_dif_col="N31000";
        data.clear();
        data=data2;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_3() {
        old_str_asset_def_body="$MA_GANTRY_AXIS_TYPE";
        asset_code_dif_col="N37100";
        data.clear();
        data=data3;
        insert_array();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_4() {
        old_str_asset_def_body="$MA_NUM_ENCS";
        asset_code_dif_col="N30200";
        data.clear();
        data=data4;
        insert_array();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_5() {
        old_str_asset_def_body="$MA_ENC_COMP_ENABLE[0]";
        asset_code_dif_col="N32700";
        data.clear();
        data=data5;
        insert_array();
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_6() {
        old_str_asset_def_body="$MA_ENC_COMP_ENABLE[1]";
        asset_code_dif_col="N32700";
       data.clear();
        data=data6;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 private void insert_7() {
        old_str_asset_def_body="$MA_POS_LIMIT_MINUS[0]";
        asset_code_dif_col="N36110";
        data.clear();
        data=data7;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  private void insert_8() {
        old_str_asset_def_body="$MA_POS_LIMIT_PLUS[1]";
        asset_code_dif_col="N36110";
        data.clear();
        data=data8;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   private void insert_9() {
        old_str_asset_def_body="ENC Axis Comp active";
        asset_code_dif_col="";
        data.clear();
        data=data9;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_10() {
        old_str_asset_def_body="CEC Axis Comp active";
        asset_code_dif_col="";
        data.clear();
        data=data10;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //$MN_AXCONF_LOGIC_MACHAX_TAB  $MN_AXCONF_MACHAX_NAME_TAB  $MA_IS_ROT_AX  $MN_MM_CEC_MAX_POINTS
    private void insert_12() {
        old_str_asset_def_body="$MN_AXCONF_LOGIC_MACHAX_TAB";
        asset_code_dif_col="N10002";
        data.clear();
        data=data12;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_13() {
        old_str_asset_def_body="$MN_AXCONF_MACHAX_NAME_TAB";
        asset_code_dif_col="N10000";
        data.clear();
        data=data13;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_14() {
        old_str_asset_def_body="$MA_IS_ROT_AX";
        asset_code_dif_col="N30300";
        data.clear();
        data=data14;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_15() {
        old_str_asset_def_body="$MN_MM_CEC_MAX_POINTS";
        asset_code_dif_col="N18342";
        data.clear();
        data=data15;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     private void insert_16() {
        old_str_asset_def_body="$MA_BACKLASH[0]";
        asset_code_dif_col="N32450";
        data.clear();
        data=data16;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       private void insert_17() {
        old_str_asset_def_body="$MA_BACKLASH[1]";  
        asset_code_dif_col="N32450";
       data.clear();
        data=data17;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         private void insert_18() {
       old_str_asset_def_body="$MA_MM_ENC_COMP_MAX_POINTS[0]";  
       asset_code_dif_col="N38000";
       data.clear();
        data=data18;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
           private void insert_19() {
       old_str_asset_def_body="$MA_MM_ENC_COMP_MAX_POINTS[1]";   
       asset_code_dif_col="N38000";
       data.clear();
        data=data19;
        insert_array();
      
    }
            private void insert_20() {
        old_str_asset_def_body="$AA_ENC_COMP_STEP[0]";    
        asset_code_dif_col="";
        data.clear();
        data=data20;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
             private void insert_21() {
         old_str_asset_def_body="$AA_ENC_COMP_MIN[0]";   
         asset_code_dif_col="";
         data.clear();
        data=data21;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
             private void insert_21_a() {
         old_str_asset_def_body="$AA_ENC_COMP_MIN[1]";    
         asset_code_dif_col="";
         data.clear();
        data=data21_a;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          }
              private void insert_22() {
        old_str_asset_def_body="$AA_ENC_COMP_MAX[0]";    
        asset_code_dif_col="";
        data.clear();
        data=data22;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
               private void insert_22_a() {
        old_str_asset_def_body="$AA_ENC_COMP_MAX[1]";     
        asset_code_dif_col="";
        data.clear();
        data=data22_a;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
               private void insert_23() {
        old_str_asset_def_body="$AA_ENC_COMP_IS_MODULO[0]";  
        asset_code_dif_col="";
         data.clear();
        data=data23;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
                    private void insert_23_a() {
        old_str_asset_def_body="$AA_ENC_COMP_IS_MODULO[1]";  
        asset_code_dif_col="";
        data.clear();
        data=data23_a;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         private void insert_24() {
        old_str_asset_def_body="$AA_ENC_COMP_STEP[1]";  
        asset_code_dif_col="";
        data.clear();
        data=data24;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
          private void insert_26() {
        old_str_asset_def_body="$MC_AXCONF_GEOAX_NAME_TAB";  
        asset_code_dif_col="N20060";
        data.clear();
        data=data26_3rd;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
          private void insert_27() {
        old_str_asset_def_body="$MC_AXCONF_CHANAX_NAME_TAB";  
        asset_code_dif_col="N20080";
        data.clear();
        data=data27_3rd;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      private void insert_28() {
        old_str_asset_def_body="$MA_ROT_IS_MODULO";  
        asset_code_dif_col="N30310";
        data.clear();
        data=data28_3rd;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
       private void insert_29() {
        old_str_asset_def_body="$MC_AXCONF_GEOAX_ASSIGN_TAB";  
        asset_code_dif_col="N20050";
        data.clear();
        data=data29_3rd;
        insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
            private void cec_transition1() {
        old_str_asset_def_body="$SN_CEC_TABLE_ENABLE";  
                asset_code_dif_col="N41300";
//herer
        str_index="INDEX"; 
        data.clear();
        data=cec_data_used_only_indices;
       insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
         ////////////////////CEC//////////////////////////////////////
       private void cec_data_1() {
        old_str_asset_def_body="$MN_MM_CEC_MAX_POINTS";  
        asset_code_dif_col="N18342";
        data.clear();
        if(cec_data_1.size() > 0){
        data=cec_data_1;
        }else{
            //insert_size();
       data= point_cec_data;
       insert_size();
       
        }
        
       insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
       private void insert_size(){
      String col_size=point_cec_data.size()+"";
       String sql = "insert into tbl_cec_col_size(count) values(?) ";
     
        try{
            pst = conn.prepareStatement(sql);            
            pst.setString(1, col_size);
           
            pst.execute();  
            //JOptionPane.showMessageDialog(null, "Patient Registered");
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }  
     }  
     private void cec_data_2() {
        old_str_asset_def_body="$SN_CEC_TABLE_ENABLE";  
        asset_code_dif_col="N41300";
        data.clear();
        data=cec_data_2;
      //  data=cec_data_used_only_xx;
       insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }      
     private void cec_data_3() {
        old_str_asset_def_body="$SN_CEC_TABLE_WEIGHT";  
        asset_code_dif_col="N41310";
        data.clear();
        System.out.println();
        data=cec_data_3;
        insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
     
     private void cec_data_4() {
        old_str_asset_def_body="$AN_CEC_INPUT_NCU";  
        asset_code_dif_col="";
        data.clear();
        data=cec_data_4;
        insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
     
     private void cec_data_5() {
        old_str_asset_def_body="$AN_CEC_INPUT_AXIS";  
        asset_code_dif_col="";
        data.clear();
        data=cec_data_5;
       insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
     
     private void cec_data_6() {
        old_str_asset_def_body="$AN_CEC_OUTPUT_NCU";  
        asset_code_dif_col="";
        data.clear();
        data=cec_data_6;
        insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private void cec_data_7() {
        old_str_asset_def_body="$AN_CEC_OUTPUT_AXIS";  
        asset_code_dif_col="";
        data.clear();
        data=cec_data_7;
        insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private void cec_data_8() {
        old_str_asset_def_body="$AN_CEC_STEP";  
        asset_code_dif_col="";
        data.clear();
        data=cec_data_8;
        insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
     private void cec_data_9() {
        old_str_asset_def_body="$AN_CEC_MIN";  
        asset_code_dif_col="";
        data.clear();
        data=cec_data_9;
       insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
     
     private void cec_data_10() {
        old_str_asset_def_body="$AN_CEC_MAX";  
        asset_code_dif_col="";
        data.clear();
        data=cec_data_10;
        insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
     
     private void cec_data_11() {
        old_str_asset_def_body="$AN_CEC_DIRECTION";  
        asset_code_dif_col="";
        data.clear();
        data=cec_data_11;
        insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
     private void cec_data_12() {
        old_str_asset_def_body="$AN_CEC_MULT_BY_TABLE";  
        asset_code_dif_col="";
        data.clear();
        data=cec_data_12;
        insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
     
     private void cec_data_13() {
        old_str_asset_def_body="$AN_CEC_IS_MODULO";  
        asset_code_dif_col="";
        data.clear();
        data=cec_data_13;
        insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private void cec_data_14() {
        old_str_asset_def_body="$AN_CEC_TYPE";  
        asset_code_dif_col="";
        data.clear();
        data=cec_data_14;
       insert_array_cc();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
       private void insert_used() {
         //  here
        old_str_asset_def_body="$MC_AXCONF_MACHAX_USED";  
        asset_code_dif_col="N20070";
        //data.clear();
        data=data25;
       insert_array();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
     private void delete_old_used(){
     String sql = "delete from  tbl_processed_table where col1 = ? AND col30 = ? ";
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
        
       
        for(int i=0; i < 43; i++){
        
        if(i==0){
        insert_12();
        }else if(i==1){
            insert_15();
            insert_29();  
           insert_26();  
           insert_used();
           insert_27();
        insert_4();
        }
        else if(i==2){
            insert_14();
       
        }
        else if(i==3){
        insert_28();
        }
        else if(i==4){
         insert_1();
      
        }
        else if(i==5){
        insert_2();
        }
        else if(i==6){
        insert_16();
       
        }
        else if(i==7){
        insert_17();
        }
        else if(i==8){
        insert_5();
        }
        else if(i==9){
        insert_6();
        }
        else if(i==10){
        insert_3();
        }
        
        else if(i==11){
        insert_0();
        }
        else if(i==12){
        insert_7(); 
        }
        else if(i==13){
        insert_8();
        }
        else if(i==14){
        insert_18();
        }
        else if(i==15){
        insert_19();
        }
        else if(i==16){
        insert_20();
        }
        else if(i==17){
        insert_24();
        }
        else if(i==18){
        insert_21();
        }
        else if(i==19){
        insert_21_a();
        }
        else if(i==20){
        insert_22();
        }
        
        
        
        else if(i==21){
        insert_22_a();
       
        }
        else if(i==22){
       insert_23();
        }
        else if(i==23){
        insert_23_a();
        }
        else if(i==24){
        //insert_22();
        }
        else if(i==25){
      //  insert_22_a();
        }
        else if(i==26){
       // insert_23();
        }
        else if(i==27){
      //  insert_23_a();
        }
        else if(i==28){
            
             
             insert_cec_table_transition();
             cec_transition1();
        cec_data_1();
        }
        else if(i==29){
        cec_data_2();
        }
        else if(i==30){
        cec_data_3();
        }
        
        else if(i==31){
        cec_data_4();
        }
        else if(i==32){
        cec_data_5();
        }
        else if(i==33){
        cec_data_6();
        }
        else if(i==34){
        cec_data_7();
        }
        else if(i==35){
        cec_data_8();
        }
        else if(i==36){
        cec_data_9();
        }
        else if(i==37){
        cec_data_10();
        }
        else if(i==38){
        cec_data_11();
        }
        else if(i==39){
        cec_data_12();
        }
        else if(i==40){
        cec_data_13();
        }
        else if(i==41){
         cec_data_14();
        }
       
        else{
        
        }
        
        
        }
                              
                                
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
    
    private void insert_cec_column_size() {
      // here
       
       String col_size=cec_size_store.size()+"";
       String sql = "insert into tbl_cec_col_size(count) values(?) ";
     
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
     private void clear_cec_col_size() {
        String sql = " delete from tbl_cec_col_size where Id > ?";
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
                                 data26_3rd=new ArrayList<String>();
                                 data27_3rd=new ArrayList<String>();
                                 data28_3rd=new ArrayList<String>();
                                 data29_3rd=new ArrayList<String>();
                                 cec_data_1= new ArrayList<String>();
                                 
                                 cec_data_3= new ArrayList<String>();
                                 cec_data_4= new ArrayList<String>();
                                 cec_data_5= new ArrayList<String>();
                                 cec_data_6= new ArrayList<String>();
                                 cec_data_7= new ArrayList<String>();
                                 
                                 
                                  cec_data_8= new ArrayList<String>();
                                 cec_data_9= new ArrayList<String>();
                                 cec_data_10= new ArrayList<String>();
                                 cec_data_11= new ArrayList<String>();
                                 cec_data_12= new ArrayList<String>();
                                 cec_data_13= new ArrayList<String>();
                                 cec_data_14= new ArrayList<String>();
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
                                         data26_3rd.add("");
                                         data27_3rd.add("");
                                         data28_3rd.add("");
                                         data29_3rd.add("");
                                            }
                                int xx =data_used_only_xx.size(); 
                                 int cc=data5.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void check_position_to_insert() {
        //herer
           // System.out.println(" CNC "+size_store);
               System.out.println(" CNC "+data_used_only_xx);
          System.out.println(" CNC "+data_used_only_indices);
           System.out.println(" CNC "+size_store);
       int_positon_to_insert= size_store.indexOf(str_pos_counter);
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      private void cec_check_position_to_insert() {
        //herer
        //  System.out.println(" CEC "+cec_data_used_only_xx);
         // System.out.println(" CEC "+cec_data_used_only_indices);
        //   System.out.println(" CEC "+cec_size_store);
         // System.out.println(" CEC "+cec_size_store);
          //  data_used_only_xx.clear();
       //  data_used_only_indices.clear();
       //  size_store.clear();
        // data_used_name.clear();
          
       int_positon_to_insert= cec_size_store.indexOf(str_pos_counter);
        
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
                line=line.substring(6);
                   line = line.replaceAll("\\s","");
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
    cec_data_1.clear();
                                         cec_data_2.clear();
                                         cec_data_3.clear();
                                         cec_data_4.clear();
                                         cec_data_5.clear();
                                         cec_data_6.clear();
                                         cec_data_7.clear();                                         
                                         cec_data_8.clear();
                                         cec_data_9.clear();
                                         cec_data_10.clear();
                                         cec_data_11.clear();
                                         cec_data_12.clear();
                                         cec_data_13.clear();
                                         cec_data_14.clear();
                                         
   data_used_only_indices.clear(); 
   data_used_only_xx.clear();
   //data11.clear();
   size_store.clear();
   //size_store.clear();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
   
        cec_data_used_only_indices.clear();
cec_data_used_only_xx.clear();
cec_size_store.clear();                                
   
point_cec_data.clear();

data26_3rd.clear();
data27_3rd.clear();
data28_3rd.clear();
data29_3rd.clear();
   
    }
    private void insert_table_transition() {
       // insert_code=8880;
        pick_chan_name();
        String xxx=chandata_loop;
        String xxx2=str_chan_name;
        str_chan_name_2=str_chan_name;
        String strs_parent_insert="";
       for(int i=0; i==0; i++ ){
           if(i==0){
               strs_parent_insert="";
          // chandata_loop="";
          // str_chan_name="";
           }else if(i==1){
           strs_parent_insert=xxx2;
           asset_code_dif_col="N20000";
           
          // str_chan_name="";
           }else{
           //chandata_loop="";
       //  strs_parent_insert=xxx2;
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
            pst.setString(29, asset_code_dif_col); 
            pst.setString(30, "");   
           

            pst.execute();  
      
         pst.close();         
         data.clear();
    }catch(Exception e){
    
    }      
       
       }
       str_chan_name="";
      //  insert_code=0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_cec_table_transition() {
        //pick_chan_name();
       
     
         String xxx=chandata_loop;
        String xxx2=str_chan_name_2;
        String strs_parent_insert="";
       for(int i=0; i < 3; i++ ){
           if(i==0){
               strs_parent_insert="";
          // chandata_loop="";
          // str_chan_name="";
           }else if(i==1){
           strs_parent_insert=xxx;
          // str_chan_name="";
           }else if(i==2){
              strs_parent_insert=xxx2;  
              asset_code_dif_col="N20000";

           //chandata_loop="";
       //  strs_parent_insert="";
           }else{
           strs_parent_insert=""; 
           }
           //here
            String sql = "insert into tbl_processed_cec_table(col1, col2, col3, col4,col5,col6, col7, col8, col9,col10,col11, col12,col13, col14, col15,col16, col17, col18, col19,col20,col21, col22, col23, col24,col25,col26, col27, col28, col29, col30,col31, col32, col33, col34,col35,col36, col37, col38, col39,col40,col41, col42,col43, col44, col45,col46, col47, col48, col49,col50,col51, col52, col53, col54,col55,col56, col57, col58, col59, col60, col61) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
     
  
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
            
             pst.setString(31, "");
            pst.setString(32, "");
            pst.setString(33, "");       
            pst.setString(34, "");
            pst.setString(35, "");
            pst.setString(36, "");
            pst.setString(37, "");
            pst.setString(38, "");
            pst.setString(39, "");
            pst.setString(40, "");     
            pst.setString(41, ""); 
            pst.setString(42, "");           
            pst.setString(43, "");      
            pst.setString(44, "");
            pst.setString(45, "");
            pst.setString(46, "");
            pst.setString(47, "");
            pst.setString(48, "");
            pst.setString(49, "");
            pst.setString(50, "");      
            pst.setString(51, "");  
            pst.setString(52, "");           
            pst.setString(53, "");
            pst.setString(54, "");
            pst.setString(55, "");
            pst.setString(56, "");       
            pst.setString(57, ""); 
            pst.setString(58, ""); 
            pst.setString(59, ""); 
             pst.setString(60, asset_code_dif_col);
            pst.setString(61, ""); 
           

            pst.execute();  
      
         pst.close();         
         data.clear();
    }catch(Exception e){
    
    }      
       
       }
       str_chan_name_2="";
     //  str_chan_name="";
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
                           asset_code_dif_col="N10000";
                         //  used_chennel_count=data_used_only_xx.size();
                           // data_used_only_indices=data_used_only_indices_1;
                          //  System.out.println(data_used_only_indices);
                          //  data_used_only_indices_keeper.clear();
                          //  data_used_only_indices_keeper=data_used_only_indices;
                           data=data_used_only_indices;
                          // insert_column_size();                                
                           insert_array_2();
                          // used_inserted_status=1;
                          
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_used_values_row() {
                        int ss = data_used_only_xx.size();
                           insert_used_indices();
                           old_str_asset_def_body ="$MN_AXCONF_MACHAX_NAME_TAB";  
                           asset_code_dif_col="N10000";
                           used_chennel_count=data_used_only_xx.size();
                           data=data_used_only_xx;
                           System.out.println(data);
                           insert_column_size();  
                           insert_cec_column_size();
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
       // JOptionPane.showMessageDialog(null, cec_data_used_only_xx);
      //  JOptionPane.showMessageDialog(null, cec_data_used_only_indices);
      //  JOptionPane.showMessageDialog(null, cec_size_store);
        //cec_data_used_only_indices cec_size_store
       // insert_cec_size();
        set_pivote_arrays();
        insert_used_only_names();
        show_panel1();
        // cec_insert_used_only_names();
        cont_2();
    }
    
    private void set_pivote_arrays(){
                try{
                    
                     int ix=data_used_only_xx.size();
        for(int i=0; i < ix; i++){
            System.out.println(i);
      pivot_data_used_only_xx.add("");
      pivot_data_used_only_indices.add("");
      pivot_size_store.add("");
              }
                }catch(Exception e){
                }       
       
    

    
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
         btnRemoveAll.setVisible(true);
         btn_exit_1.setVisible(true);
                     //  btn_exit_2.setVisible(false);
                      // btn_exit_3.setVisible(false);
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
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("co_log.png")));
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
                 // System.out.println(xx+"----------------------------------------------------------------------------"+xx);            
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
     //   txt_path2.setEnabled(false);
        btn_normalize.setEnabled(false);
        btn_raw_tbl.setEnabled(false);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
private void enable_btns() {
        btn_impo_compesation.setEnabled(true);
      //  txt_path2.setEnabled(true);
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
     // compesation_data_1.clear();       
      //   compesation_errors.clear();
      //  clear_compesation_varia();
       // enable_components();
      //  import_compesation_id=0;
       //JOptionPane.showMessageDialog(null, "Completed !");
      // txt_path2.setText("");
      // lbl_per.setText("Process completed !");
     //  stop_timer();
      //  stop_threads(); 
      //  open_table();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void insert_compes2() {
        
        for(int i =0; i < compesation_data_1.size(); i++ ){
        String  str_compesation_data_1=compesation_data_1.get(i);
         String sql = "insert into tbl_processed_table_compe(col1, col2, col3, col4,col5,col6, col7, col8, col9,col10,col11, col12,col13, col14, col15,col16, col17, col18, col19,col20,col21, col22, col23, col24,col25,col26, col27, col28, col29, col30) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
     
  
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
        enable_components();
        import_compesation_id=0;
        cec_comp_count=0;
       JOptionPane.showMessageDialog(null, "Completed !");
       
      // txt_path2.setText("");
       lbl_per.setText("Process completed !");
       stop_timer();
        stop_threads(); 
        open_table();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void clear_compesation_varia() {
         header_part1="";header_part2="";header_part3="";header_part4=""; header_part5="";
   body_part1="";body_part2="";body_part3="";body_part4="";
   footer_1_1="";footer_1_2="";footer_1_3="";footer_1_4="";footer_1_5="";
  footer_2_1=""; footer_2_2="";footer_2_3="";footer_2_4="";
  comp_body=""; int_max="";int_min="";int_step="";
   error_collect_status=0;
   cec_footer_1_1="";cec_footer_1_2="";cec_footer_1_3="";cec_footer_1_4="";cec_footer_1_5="";cec_footer_1_6="";cec_footer_1_7="";cec_footer_1_9="";cec_footer_1_10="";
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


    private boolean cec_create_muliti_dimentional_array() {
      
          if(cec_data_used_only_indices.size() > 0){
        String input="";
        for(int i=0; i<cec_data_used_only_indices.size(); i++){
           
            System.out.println(cec_data_used_only_indices.get(i));
            
            input=cec_data_used_only_indices.get(i);
            arr2.add(input);
            input=cec_data_1.get(i);
            arr2.add(input);
            input=cec_data_2.get(i);
            arr2.add(input);
            input=cec_data_3.get(i);
            arr2.add(input);
            input=cec_data_4.get(i);
            arr2.add(input);
            input=cec_data_5.get(i);
            arr2.add(input);
            input=cec_data_6.get(i);
            arr2.add(input);
            input=cec_data_7.get(i);
            arr2.add(input);
            input=cec_data_8.get(i);
            arr2.add(input);
            input=cec_data_9.get(i);
            arr2.add(input);
            input=cec_data_10.get(i);
            arr2.add(input);
            input=cec_data_11.get(i);
            arr2.add(input);
            input=cec_data_12.get(i);
            arr2.add(input);
            input=cec_data_13.get(i);
            arr2.add(input);
            input=cec_data_14.get(i);
            arr2.add(input);
             cec_insert_compesations(); 
        
        }
        return true;
          }
          return true;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void cec_insert_compesations() {
        System.out.println(arr2);
       // String compes_1,
          int lengx = arr2.size(); 
            String[] stringArray = arr2.toArray(new String[arr2.size()]);    
               
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
                   try {    var14x=stringArray[13]; } catch (IndexOutOfBoundsException e) { var14x="n/a"; }
                 // try {    var15x=stringArray[14]; } catch (IndexOutOfBoundsException e) { var15x="n/a"; }
        
     if(lengx > 0){
        try
    {
     
    //  String query = " insert into users (first_name, last_name, date_created, is_admin, num_points)"
     //   + " values (?, ?, ?, ?, ?)";
      String sql = "insert into tbl_cec_comp_compesation(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(sql);
      preparedStmt.setString (1, var1x);
      preparedStmt.setString (2, var2x);
      preparedStmt.setString (3, var3x);
      preparedStmt.setString(4, var4x);
      preparedStmt.setString(5, var5x);
	  preparedStmt.setString (6, var6x);
      preparedStmt.setString (7, var7x);
      preparedStmt.setString (8, var8x);
      preparedStmt.setString(9, var9x);
      preparedStmt.setString(10, var10x);
	  preparedStmt.setString (11, var11x);
      preparedStmt.setString (12, var12x);
      preparedStmt.setString (13, var13x);
      preparedStmt.setString(14, var14x);
     // preparedStmt.setString(15, var15x);

      // execute the preparedstatement
      preparedStmt.execute();
      
      //conn.close();
    }
    catch (Exception e)
    {
	JOptionPane.showMessageDialog(null, e);	
	}
   
     
                  }
    arr2.clear();
     
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

    private void set_cec_arrays() {
      
        for(int i=0; i< cec_size_store.size(); i++){
        // for(int i=0; i< 5; i++){
                                       cec_data_1.add("");
                                        // cec_data_2.add("");
                                         cec_data_3.add("");
                                         cec_data_4.add("");
                                         cec_data_5.add("");
                                         cec_data_6.add("");
                                         cec_data_7.add("");                                         
                                         cec_data_8.add("");
                                         cec_data_9.add("");
                                         cec_data_10.add("");
                                         cec_data_11.add("");
                                         cec_data_12.add("");
                                         cec_data_13.add("");
                                         cec_data_14.add("");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    private void select_all(){
          update_pivot_array_2();
    chk1.setSelected(true);
    chk2.setSelected(true);
    chk3.setSelected(true);
    chk4.setSelected(true);
    chk5.setSelected(true);
    chk6.setSelected(true);
    chk7.setSelected(true);
    chk8.setSelected(true);
    chk9.setSelected(true);
    chk10.setSelected(true);
    chk11.setSelected(true);
    chk12.setSelected(true);
    chk13.setSelected(true);
    chk14.setSelected(true);
    chk15.setSelected(true);
    chk16.setSelected(true);
    chk17.setSelected(true);
    chk18.setSelected(true);
    chk19.setSelected(true);
    chk20.setSelected(true);
    chk21.setSelected(true);
    chk22.setSelected(true);
    chk23.setSelected(true);
    chk24.setSelected(true);
    chk25.setSelected(true);
    chk26.setSelected(true);
    chk27.setSelected(true);
    chk28.setSelected(true);
    chk29.setSelected(true);
    chk30.setSelected(true);
    }
    private void proceed_to_re_fill() {
        
        
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
                                                    //  data_used_only_indices_keeper.set(int_positon_to_insert, ppx);
                                                      
                                                     // herer
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
                                        
                                        /*   else if(str_asset_def_body.equals("$MN_MM_CEC_MAX_POINTS")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data15.set(int_positon_to_insert, str_asset_status);
                                                        
                                                        cec_check_position_to_insert();
                                                        cec_data_1.set(int_positon_to_insert, str_asset_status);
                                                        
                                                }
                                            
                                        }*/
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
                                            
                                             else if(str_asset_def_body.equals("$MC_AXCONF_GEOAX_NAME_TAB")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data26_3rd.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                              else if(str_asset_def_body.equals("$MC_AXCONF_CHANAX_NAME_TAB")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data27_3rd.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                               else if(str_asset_def_body.equals("$MA_ROT_IS_MODULO")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data28_3rd.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                               
                                               else if(str_asset_def_body.equals("$MC_AXCONF_GEOAX_ASSIGN_TAB")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        check_position_to_insert();
                                                        data29_3rd.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////last loop////////////////////////////
                                       ///////////////////////////////CEC///////////////////////////////////////     
                                            
                                             else if(str_asset_def_body.equals("$MN_MM_CEC_MAX_POINTS")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                       cec_check_position_to_insert();
                                                        cec_data_1.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                           else if(str_asset_def_body.equals("$SN_CEC_TABLE_ENABLE")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                      //  cec_check_position_to_insert();
                                                    //    cec_data_2.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                            else if(str_asset_def_body.equals("$SN_CEC_TABLE_WEIGHT")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                       cec_check_position_to_insert();
                                                        cec_data_3.set(int_positon_to_insert, str_asset_status);
                                                        System.out.println(" TABLE_WEIGHT"+cec_data_3);
                                                        System.out.println(cec_size_store);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                             else if(str_asset_def_body.equals("$AN_CEC_INPUT_NCU")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        cec_check_position_to_insert();
                                                        cec_data_4.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                              else if(str_asset_def_body.equals("$AN_CEC_INPUT_AXIS")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                      cec_check_position_to_insert();
                                                        cec_data_5.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                               else if(str_asset_def_body.equals("$AN_CEC_OUTPUT_NCU")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        cec_check_position_to_insert();
                                                        cec_data_6.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                                else if(str_asset_def_body.equals("$AN_CEC_OUTPUT_AXIS")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                       cec_check_position_to_insert();
                                                        cec_data_7.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                                 else if(str_asset_def_body.equals("$AN_CEC_STEP")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        cec_check_position_to_insert();
                                                        cec_data_8.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                                  else if(str_asset_def_body.equals("$AN_CEC_MIN")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        cec_check_position_to_insert();
                                                        cec_data_9.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                                   else if(str_asset_def_body.equals("$AN_CEC_MAX")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                       cec_check_position_to_insert();
                                                       cec_data_10.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                                    else if(str_asset_def_body.equals("$AN_CEC_DIRECTION")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        cec_check_position_to_insert();
                                                        cec_data_11.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                                     else if(str_asset_def_body.equals("$AN_CEC_MULT_BY_TABLE")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                       cec_check_position_to_insert();
                                                        cec_data_12.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                                      else if(str_asset_def_body.equals("$AN_CEC_IS_MODULO")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        cec_check_position_to_insert();
                                                        cec_data_13.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                        ////////////////////////////CEC////////////////////////////
                                                       else if(str_asset_def_body.equals("$AN_CEC_TYPE")){
                                       // data8.add(str_asset_status);
                                             if(str_chandata.equals(chandata_loop)){
                                                        cec_check_position_to_insert();
                                                        cec_data_14.set(int_positon_to_insert, str_asset_status);
                                                }
                                            
                                        }
                                       
                                            
                                        else{
                                             // old_str_asset_def_body =str_asset_def_body;
                                           // old_str_asset_def_body="";
                                           // old_str_asset_def_body =str_asset_def_body;
                                            //////////check whether Arraylist is less than usedChanels///////////////////
                                            
                                           //////////end check whether Arraylist is less than usedChanels///////////////////

                                             }
                          
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void insert_compesantation_vars_inputs() {
        
         String sql = "insert into tbl_compensation_var_inputs (header_text, header_enable_0, header_newconf,chandata,logic_machax_tab, body_aa_enc_comp,body_modulo, footer_end_text,footer_enable_1,footer_newconf,footer_m17) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
       
        try{
            pst = conn.prepareStatement(sql);            
            pst.setString(1, txt_header1.getText().toString().trim());
            pst.setString(2, txt_header_2.getSelectedItem().toString().trim());
            pst.setString(3, txt_header3.getText().toString().trim());   
             pst.setString(4, txt_header_chandata.getSelectedItem().toString().trim());
            pst.setString(5, txt_header_1_1.getSelectedItem().toString().trim());
            pst.setString(6, txt_header4.getSelectedItem().toString().trim());  
            pst.setString(7, txt_header5.getSelectedItem().toString().trim());
            pst.setString(8, txt_header6.getText().toString().trim());
            pst.setString(9, txt_header7.getSelectedItem().toString().trim());
            pst.setString(10, txt_header8.getText().toString().trim());
            pst.setString(11, txt_header9.getText().toString().trim());
           

            pst.execute();  
            //JOptionPane.showMessageDialog(null, "Patient Registered");
            
            
        }catch (Exception e){
           // JOptionPane.showMessageDialog(null, e);
        
        }   
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void cec_insert_compesantation_vars_inputs() {
        
         String sql = "insert into cec_tbl_compensation_var_inputs (chandata,selected_axis,cec_input_ncu,cec_input_axis,cec_output_ncu,cec_output_axis,cec_direction, cec_mult_by_table,cec_is_modulo,cec_header,cec_header_newconf,cec_fooeter,cec_footer_newconf,m7) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
       
        try{
            pst = conn.prepareStatement(sql);            
            pst.setString(1, cec_1.getSelectedItem().toString().trim());
            pst.setString(2, cec_2.getSelectedItem().toString().trim());
            pst.setString(3, txt_auto_1.getText().toString().trim()); 
             pst.setString(4, txt_auto_2.getText().toString().trim()); 
            pst.setString(5, txt_auto_3.getText().toString().trim());  
            pst.setString(6, txt_auto_4.getText().toString().trim()); 
            pst.setString(7, txt_auto_5.getText().toString().trim()); 
            pst.setString(8, txt_auto_6.getText().toString().trim()); 
            pst.setString(9, txt_auto_7.getText().toString().trim()); 
            
            pst.setString(10, txt_cec_header_footer_1.getText().trim());
            pst.setString(11, txt_cec_header_footer_2.getText().trim());
            pst.setString(12, txt_cec_header_footer_3.getText().trim());
            pst.setString(13, txt_cec_header_footer_4.getText().trim());
            pst.setString(14, txt_cec_header_footer_5.getText().trim());
           

            pst.execute();  
            //JOptionPane.showMessageDialog(null, "Patient Registered");
            
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }   
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void hide_all_variable_fields() {
      //  btnContinue.setVisible(false);
       // btnRemoveAll.setVisible(false);
      btn_exit_1.setVisible(false);
        txt_header1.setVisible(false);
         txt_header_2.setVisible(false);
       txt_header_1_1.setVisible(false);
        txt_header3.setVisible(false);
        txt_header4.setVisible(false);
        txt_header5.setVisible(false);
        txt_header6.setVisible(false);
        txt_header7.setVisible(false);
        txt_header8.setVisible(false);
        txt_header9.setVisible(false);
        txt_header_chandata.setVisible(false);
        jLabel1.setVisible(false);
        lbl_1.setVisible(false);
         lbl_2.setVisible(false);
          //lbl_3.setVisible(false);
           lbl_4.setVisible(false);
            lbl_5.setVisible(false);
             lbl_6.setVisible(false);
             lbl_7.setVisible(false);
            //  lbl_8.setVisible(false);
               lbl_9.setVisible(false);
                lbl_10.setVisible(false);
               // btn_exit_1.setVisible(false);
                       btn_exit_2.setVisible(false);
                     //  btn_exit_3.setVisible(false);
                jButton3.setVisible(false);
               
        //txt_header10.setVisible(false);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     private void cec_hide_all_variable_fields() {
        CheckBoxes2.setVisible(false);
       cec_1.setVisible(false);
         cec_2.setVisible(false);
         txt_auto_1.setVisible(false); 
     txt_auto_2.setVisible(false);
       txt_auto_3.setVisible(false);
       txt_auto_4.setVisible(false);
        txt_auto_5.setVisible(false);
        txt_auto_6.setVisible(false);
        txt_auto_7.setVisible(false);      
       
       lbl_cechecderfoot_1.setVisible(false);
       lbl_cechecderfoot_2.setVisible(false);
       lbl_cechecderfoot_3.setVisible(false);
       
        lbl_cechecderfoot_4.setVisible(false);
       lbl_cechecderfoot_5.setVisible(false);
       lbl_cechecderfoot_6.setVisible(false);
       
       txt_cec_header_footer_1.setVisible(false);
       txt_cec_header_footer_2.setVisible(false);
       txt_cec_header_footer_3.setVisible(false);
       txt_cec_header_footer_4.setVisible(false);
       txt_cec_header_footer_5.setVisible(false);
       
           lbl_cechecderfoot_3.setVisible(false);
           cec_lbl_2.setVisible(false);
             cec_lbl_3.setVisible(false);
             cec_lbl_4.setVisible(false);
              cec_lbl_5.setVisible(false);
             cec_lbl_6.setVisible(false);
                cec_lbl_7.setVisible(false);
             cec_lbl_8.setVisible(false);
             cec_lbl_9.setVisible(false);
              // btn_exit_1.setVisible(false);
                     //  btn_exit_2.setVisible(false);
                       btn_exit_3.setVisible(false);
                
                btn_next.setVisible(false);
    }
     private void show_all_variable_fields() {
        // btnContinue
           // btnContinue.setVisible(true);
      //  btnRemoveAll.setVisible(true);
      
      
        
        txt_header1.setVisible(true);
         txt_header_2.setVisible(true);
       txt_header_1_1.setVisible(true);
        txt_header3.setVisible(true);
        txt_header4.setVisible(true);
        txt_header5.setVisible(true);
        txt_header6.setVisible(true);
        txt_header7.setVisible(true);
        txt_header8.setVisible(true);
        txt_header9.setVisible(true);
        txt_header_chandata.setVisible(true);
        jLabel1.setVisible(true);
        lbl_1.setVisible(true);
         lbl_2.setVisible(true);
         // lbl_3.setVisible(true);
           lbl_4.setVisible(true);
            lbl_5.setVisible(true);
             lbl_6.setVisible(true);
             lbl_7.setVisible(true);
           //   lbl_8.setVisible(true);
               lbl_9.setVisible(true);
                lbl_10.setVisible(true);
               // btn_exit_1.setVisible(false);
                       btn_exit_2.setVisible(true);
                      // btn_exit_3.setVisible(false);
                jButton3.setVisible(true);
        //txt_header10.setVisible(false);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 private void cec_show_all_variable_fields() {
   CheckBoxes2.setVisible(true);
         cec_1.setVisible(true);
         cec_2.setVisible(true);
         txt_auto_1.setVisible(true);
     txt_auto_2.setVisible(true);
       txt_auto_3.setVisible(true);
       txt_auto_4.setVisible(true);
        txt_auto_5.setVisible(true);
        txt_auto_6.setVisible(true);
        txt_auto_7.setVisible(true);      
      // cec_9.setVisible(true);  
       
       lbl_cechecderfoot_1.setVisible(true);
       lbl_cechecderfoot_2.setVisible(true);
       lbl_cechecderfoot_3.setVisible(true);       
        lbl_cechecderfoot_4.setVisible(true);
       lbl_cechecderfoot_5.setVisible(true);
       lbl_cechecderfoot_6.setVisible(true);       
       txt_cec_header_footer_1.setVisible(true);
       txt_cec_header_footer_2.setVisible(true);
       txt_cec_header_footer_3.setVisible(true);
       txt_cec_header_footer_4.setVisible(true);
       txt_cec_header_footer_5.setVisible(true);
       
       
       
           lbl_cechecderfoot_3.setVisible(true);
           cec_lbl_2.setVisible(true);
             cec_lbl_3.setVisible(true);
             cec_lbl_4.setVisible(true);
              cec_lbl_5.setVisible(true);
             cec_lbl_6.setVisible(true);
                cec_lbl_7.setVisible(true);
             cec_lbl_8.setVisible(true);
             cec_lbl_9.setVisible(true);
            // btn_exit_1.setVisible(false);
                    //   btn_exit_2.setVisible(false);
                       btn_exit_3.setVisible(true);
                btn_next.setVisible(true);
       
        //txt_header10.setVisible(false);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void open_table() {
        
        select_col_size();
        update_table_3();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void select_expiry() {
        
        try{
        
                    Statement stmt2;  
                    stmt2= conn.createStatement();
                    String sql112="Select *  from  tbl_ves where id='4'";
                    rs=stmt2.executeQuery(sql112);
                    if(rs.next()){
                       exp_date = rs.getString("txt_data");
                    }
                    }catch(Exception e){}
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void find_dif() {
        try{
            
           String datexx = new SimpleDateFormat("yyyy-MM-dd").format(new Date())+" 00:00:00";
          SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
          Date date1 = formatter.parse(datexx); 
          Date date2 = formatter.parse(exp_date); 
           diffInDays = (int)( (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 * 24) );
        //  System.out.println(""+diffInDays);
        }     
        catch(Exception ex){
        
        
        }
         
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void switch_table() {
        
        select_col_size();
        update_table_3();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
private void switch_table_2() {
        
        select_col_size();
        update_table_4();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void clean_mpf() {
         try{        
       //  String pxx=pathxx2;    
            // pathxx2=txt_path2.getText().toString().trim();
         FileReader fileReader = new FileReader(txt_file_path);
         try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      //String line;
         while((line = bufferedReader.readLine()) != null) {
         
                
             }
         
         
         
         
         }
    }catch(Exception e){
    
    }

        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void disable_components() {
         //btn_impo_compesation_cec.setEnabled(false);
        // txt_path3_cec.setEnabled(false);
         btn_conf_file.setEnabled(false);
         btn_impo_compesation.setEnabled(false);
         //path.setEnabled(false);
        /// txt_path2.setEnabled(false);
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 private void enable_components() {
        
         btn_conf_file.setEnabled(true);
        btn_impo_compesation.setEnabled(true);
      //  path.setEnabled(true);
      //  txt_path2.setEnabled(true);
        
       // btn_impo_compesation_cec.setEnabled(true);
             //   txt_path3_cec.setEnabled(true);
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void hide_panels() {
        CheckBoxes.setVisible(false);
        CheckBoxes1.setVisible(false);
        CheckBoxes2.setVisible(false);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   private void show_panel1() {
        CheckBoxes.setVisible(true);
        CheckBoxes1.setVisible(false);
        CheckBoxes2.setVisible(false);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void show_panel2() {
        CheckBoxes.setVisible(false);
        CheckBoxes1.setVisible(true);
        CheckBoxes2.setVisible(false);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private void show_panel3() {
        CheckBoxes.setVisible(false);
        CheckBoxes1.setVisible(false);
        CheckBoxes2.setVisible(true);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void abort_process() {
      //  path.setText("");
      //  txt_path2.setText("");
            enable_components();
           hide_panels();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void clear_pivot() {
         pivot_data_used_only_xx.clear();
 pivot_data_used_only_indices.clear();
 pivot_size_store.clear();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
