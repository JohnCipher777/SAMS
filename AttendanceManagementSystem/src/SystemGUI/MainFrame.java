    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SystemGUI;

import SystemAccounts.Administrator;
import SystemController.MainController;
import SystemData.StudentData;
import SystemDataManager.AdminAcntGenerator;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import raven.toast.Notifications;

/**
 *
 * @author hunter
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
         //UI Theme from external Library(FlatLaf)
        FlatMacDarkLaf.setup();
        initComponents();
        OptionFrames.setBackground(new Color(43,75,130));
        FlatSVGIcon headerIcon = new FlatSVGIcon("SystemImgBgs/headerIcon.svg");
        setIconImage(headerIcon.getImage());
        
        FlatSVGIcon closeIcon = new FlatSVGIcon("SystemImgBgs/closeIcon.svg");
        closeIconLabel.setIcon(closeIcon);
        
        FlatSVGIcon logOutIcon = new FlatSVGIcon("SystemImgBgs/logoutIcon.svg");
        logOutLabel.setIcon(logOutIcon);
        
        FlatSVGIcon recordIcon = new FlatSVGIcon("SystemImgBgs/recordIcon.svg");
        recordFrame.setIcon(recordIcon);
        FlatSVGIcon recordedIcon = new FlatSVGIcon("SystemImgBgs/recordedIcon.svg");
        recordedFrame.setIcon(recordedIcon);
        
        initFieldComponents();
        initTableHeader();
    }
    
    private void initFieldComponents() {
        /*---| OPTION 1 PANEL |---*/
        typeOfEventTF.putClientProperty("JComponent.roundRect", true);
        typeOfEventTF.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Type Of Event");
        typeOfEventTF.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON,true);
        typeOfEventTF.setBackground(Color.WHITE);
        typeOfEventTF.setForeground(Color.BLACK);
        
        courseTF.putClientProperty("JComponent.roundRect", true);
        courseTF.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Student Course");
        courseTF.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON,true);        
        courseTF .setBackground(Color.WHITE);       
        courseTF.setForeground(Color.BLACK);       
                
        yrLvlCB.putClientProperty("JComponent.roundRect", true);
        yrLvlCB.setBackground(Color.WHITE);
        yrLvlCB.setForeground(Color.GRAY);
        
        studentIDTF.putClientProperty("JComponent.roundRect", true);
        studentIDTF.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Student ID");
        studentIDTF.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON,true);
        studentIDTF.setBackground(Color.WHITE);
        studentIDTF.setForeground(Color.BLACK);
        
        //disabled, because selected item is the default
        recordBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        recordBtn.setBackground(Color.WHITE);
        recordBtn.setForeground(Color.BLACK);
        deleteBtn.setBackground(Color.WHITE);
        deleteBtn.setForeground(Color.BLACK);     
        
        /*---| OPTION 2 PANEL |---*/
        eventTypedTF.putClientProperty("JComponent.roundRect", true);
        eventTypedTF.setBackground(Color.BLACK);
        eventTypedTF.setForeground(new Color(51,255,51));
        
        dateCreatedTF.putClientProperty("JComponent.roundRect", true);
        dateCreatedTF.setBackground(Color.BLACK);
        dateCreatedTF.setForeground(new Color(51,255,51));
        
        recoredYrLvlTF.putClientProperty("JComponent.roundRect", true);
        recoredYrLvlTF.setBackground(Color.BLACK);
        recoredYrLvlTF.setForeground(new Color(51,255,51));
        
        recordCourse.putClientProperty("JComponent.roundRect", true);
        recordCourse.setBackground(Color.BLACK);
        recordCourse.setForeground(new Color(51,255,51));
        
        recordedYrLvlCB.putClientProperty("JComponent.roundRect", true);
        recordedYrLvlCB.setBackground(Color.WHITE);        
        recordedYrLvlCB.setForeground(Color.GRAY);
        
        recordedCourseTF.putClientProperty("JComponent.roundRect", true);
        recordedCourseTF.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Student Course");        
        recordedCourseTF.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON,true);       
        recordedCourseTF.setBackground(Color.WHITE);
        recordedCourseTF.setForeground(Color.BLACK);
        
        //disabled, because the selected item is the default
        getDataBtn.setEnabled(false);
        getDataBtn.setBackground(Color.WHITE);    
        getDataBtn.setForeground(Color.BLACK);
    }
    
    private void initTableHeader() {
        /*---| OPTION 1 PANEL TABLE |---*/
        JTableHeader studentDataTable = attendanceTable.getTableHeader();
        studentDataTable.setBackground(Color.WHITE);
        studentDataTable.setForeground(Color.BLACK);
        studentDataTable.setFont(new java.awt.Font("DialogInput", 1, 18));
        ((DefaultTableCellRenderer) studentDataTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
        
        /*---| OPTION 2 PANEL TABLE |---*/
        JTableHeader recordedStudentDataTable = recordedTableData.getTableHeader();
        recordedStudentDataTable.setBackground(Color.WHITE);
        recordedStudentDataTable.setForeground(Color.BLACK);
        recordedStudentDataTable.setFont(new java.awt.Font("DialogInput", 1, 18));
        ((DefaultTableCellRenderer) recordedStudentDataTable.getDefaultRenderer()).setHorizontalAlignment(JLabel.CENTER);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        closeIconLabel = new javax.swing.JLabel();
        OptionFrames = new javax.swing.JTabbedPane();
        recordPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        yrLvlCB = new javax.swing.JComboBox<>();
        studentIDTF = new javax.swing.JTextField();
        typeOfEventTF = new javax.swing.JTextField();
        recordBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        courseTF = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        recordedPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        recordedYrLvlCB = new javax.swing.JComboBox<>();
        recordedCourseTF = new javax.swing.JTextField();
        getDataBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        recordedTableData = new javax.swing.JTable();
        eventTypedTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        recoredYrLvlTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        recordCourse = new javax.swing.JTextField();
        dateCreatedTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        recordedFrame = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();
        recordFrame = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(43, 75, 130));

        closeIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeIconLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeIconLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 1323, Short.MAX_VALUE)
                .addComponent(closeIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeIconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 1360, 40));

        recordPanel.setBackground(new java.awt.Color(43, 75, 130));

        attendanceTable.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TIME", "ID", "NAME", "YR LVL", "COURSE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        attendanceTable.setGridColor(new java.awt.Color(255, 255, 255));
        attendanceTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        attendanceTable.setSelectionForeground(new java.awt.Color(51, 255, 51));
        attendanceTable.setShowGrid(true);
        attendanceTable.getTableHeader().setResizingAllowed(false);
        attendanceTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(attendanceTable);
        if (attendanceTable.getColumnModel().getColumnCount() > 0) {
            attendanceTable.getColumnModel().getColumn(1).setMinWidth(100);
            attendanceTable.getColumnModel().getColumn(1).setMaxWidth(300);
            attendanceTable.getColumnModel().getColumn(2).setMinWidth(300);
            attendanceTable.getColumnModel().getColumn(2).setMaxWidth(500);
            attendanceTable.getColumnModel().getColumn(3).setMinWidth(100);
            attendanceTable.getColumnModel().getColumn(3).setMaxWidth(500);
        }

        jPanel2.setBackground(new java.awt.Color(43, 75, 130));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        yrLvlCB.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        yrLvlCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year Level", "1st", "2nd", "3rd", "4th" }));
        yrLvlCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yrLvlCBActionPerformed(evt);
            }
        });

        studentIDTF.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        studentIDTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studentIDTFKeyPressed(evt);
            }
        });

        typeOfEventTF.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        recordBtn.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        recordBtn.setText("RECORD");
        recordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordBtnActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        courseTF.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        deleteBtn.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(typeOfEventTF, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(courseTF, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(yrLvlCB, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(studentIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(recordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeOfEventTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yrLvlCB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentIDTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout recordPanelLayout = new javax.swing.GroupLayout(recordPanel);
        recordPanel.setLayout(recordPanelLayout);
        recordPanelLayout.setHorizontalGroup(
            recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        recordPanelLayout.setVerticalGroup(
            recordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordPanelLayout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        OptionFrames.addTab("tab1", recordPanel);

        recordedPanel.setBackground(new java.awt.Color(43, 75, 130));

        jPanel3.setBackground(new java.awt.Color(43, 75, 130));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DialogInput", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        recordedYrLvlCB.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        recordedYrLvlCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year Level", "1st", "2nd", "3rd", "4th" }));
        recordedYrLvlCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordedYrLvlCBActionPerformed(evt);
            }
        });

        recordedCourseTF.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        getDataBtn.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getDataBtn.setText("GET DATA");
        getDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataBtnActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(recordedYrLvlCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(recordedCourseTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(getDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(recordedCourseTF, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(recordedYrLvlCB, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(getDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        recordedTableData.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        recordedTableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TIME", "ID", "NAME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        recordedTableData.setGridColor(new java.awt.Color(255, 255, 255));
        recordedTableData.setSelectionBackground(new java.awt.Color(0, 0, 0));
        recordedTableData.setSelectionForeground(new java.awt.Color(51, 255, 51));
        recordedTableData.setShowGrid(true);
        recordedTableData.getTableHeader().setResizingAllowed(false);
        recordedTableData.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(recordedTableData);
        if (recordedTableData.getColumnModel().getColumnCount() > 0) {
            recordedTableData.getColumnModel().getColumn(0).setMinWidth(300);
            recordedTableData.getColumnModel().getColumn(0).setMaxWidth(400);
            recordedTableData.getColumnModel().getColumn(1).setMinWidth(100);
            recordedTableData.getColumnModel().getColumn(1).setMaxWidth(500);
            recordedTableData.getColumnModel().getColumn(2).setMinWidth(300);
            recordedTableData.getColumnModel().getColumn(2).setMaxWidth(500);
        }

        eventTypedTF.setEditable(false);
        eventTypedTF.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        eventTypedTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EVENT TYPE:");

        recoredYrLvlTF.setEditable(false);
        recoredYrLvlTF.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        recoredYrLvlTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("YEAR LEVEL:");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("COURSE:");

        recordCourse.setEditable(false);
        recordCourse.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        recordCourse.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dateCreatedTF.setEditable(false);
        dateCreatedTF.setFont(new java.awt.Font("DialogInput", 3, 18)); // NOI18N
        dateCreatedTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATE:");

        javax.swing.GroupLayout recordedPanelLayout = new javax.swing.GroupLayout(recordedPanel);
        recordedPanel.setLayout(recordedPanelLayout);
        recordedPanelLayout.setHorizontalGroup(
            recordedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recordedPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(recordedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recordedPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventTypedTF, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateCreatedTF, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recoredYrLvlTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recordCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(recordedPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        recordedPanelLayout.setVerticalGroup(
            recordedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recordedPanelLayout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(recordedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recordedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eventTypedTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, recordedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(recordedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateCreatedTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(recordedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recoredYrLvlTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(recordedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recordCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(recordedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recordedPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(recordedPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        OptionFrames.addTab("tab2", recordedPanel);

        jPanel1.add(OptionFrames, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, -114, 1360, 910));

        recordedFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordedFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordedFrameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recordedFrameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recordedFrameMouseExited(evt);
            }
        });
        jPanel1.add(recordedFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 40, 40));

        logOutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutLabelMouseExited(evt);
            }
        });
        jPanel1.add(logOutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 40, 40));

        recordFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        recordFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recordFrameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recordFrameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recordFrameMouseExited(evt);
            }
        });
        jPanel1.add(recordFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 40, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void recordFrameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordFrameMouseEntered
        recordFrame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
    }//GEN-LAST:event_recordFrameMouseEntered

    private void recordFrameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordFrameMouseExited
        recordFrame.setBorder(null);
    }//GEN-LAST:event_recordFrameMouseExited

    private void recordedFrameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordedFrameMouseEntered
        recordedFrame.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
    }//GEN-LAST:event_recordedFrameMouseEntered

    private void recordedFrameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordedFrameMouseExited
       recordedFrame.setBorder(null);
    }//GEN-LAST:event_recordedFrameMouseExited

    private void logOutLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseEntered
       logOutLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
    }//GEN-LAST:event_logOutLabelMouseEntered

    private void logOutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseExited
        logOutLabel.setBorder(null);
    }//GEN-LAST:event_logOutLabelMouseExited

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        dispose();
        AdminAcntGenerator.initDefaultAcnt();
        MainController.main(null);
    }//GEN-LAST:event_logOutLabelMouseClicked

    private void recordFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordFrameMouseClicked
        OptionFrames.setSelectedIndex(0);
        Notifications.getInstance().setJFrame(this);
        Notifications.getInstance().show(Notifications.Type.INFO, "Record Attendance"); 
    }//GEN-LAST:event_recordFrameMouseClicked

    private void recordedFrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recordedFrameMouseClicked
       OptionFrames.setSelectedIndex(1);
       Notifications.getInstance().setJFrame(this);
       Notifications.getInstance().show(Notifications.Type.INFO, "Recorded Data"); 
    }//GEN-LAST:event_recordedFrameMouseClicked

    private void yrLvlCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yrLvlCBActionPerformed
        if(yrLvlCB.getSelectedItem().equals("Select Year Level")){
            yrLvlCB.setForeground(Color.GRAY);
            recordBtn.setEnabled(false);
            deleteBtn.setEnabled(false);
        }else{
            yrLvlCB.setForeground(Color.BLACK);
            recordBtn.setEnabled(true);
            deleteBtn.setEnabled(true);
        }
    }//GEN-LAST:event_yrLvlCBActionPerformed

    private void recordedYrLvlCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordedYrLvlCBActionPerformed
        if(recordedYrLvlCB.getSelectedItem().equals("Select Year Level")){
            recordedYrLvlCB.setForeground(Color.GRAY);
            getDataBtn.setEnabled(false);
        }else{
            recordedYrLvlCB.setForeground(Color.BLACK);
            getDataBtn.setEnabled(true);
        }
    }//GEN-LAST:event_recordedYrLvlCBActionPerformed
    
    private int positionX, positionY;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        positionX = evt.getX();
        positionY = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        setLocation(evt.getXOnScreen()-positionX, evt.getYOnScreen()-positionY);
    }//GEN-LAST:event_formMouseDragged

    private void closeIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconLabelMouseEntered
        FlatSVGIcon closeIcon = new FlatSVGIcon("SystemImgBgs/highlightedCloseIcon.svg");
        closeIconLabel.setIcon(closeIcon);
    }//GEN-LAST:event_closeIconLabelMouseEntered

    private void closeIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconLabelMouseExited
        FlatSVGIcon closeIcon = new FlatSVGIcon("SystemImgBgs/closeIcon.svg");
        closeIconLabel.setIcon(closeIcon);
    }//GEN-LAST:event_closeIconLabelMouseExited

    private void closeIconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeIconLabelMouseClicked
       dispose();
       MainController.main(null);
    }//GEN-LAST:event_closeIconLabelMouseClicked

    private void recordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordBtnActionPerformed
        String tOE = typeOfEventTF.getText();
        String course = courseTF.getText();
        String yrLvl = String.valueOf(yrLvlCB.getSelectedItem());
        String ID = studentIDTF.getText();
        
        Notifications.getInstance().setJFrame(this);
        if(tOE.isBlank() || course.isBlank() || yrLvl.isBlank() || ID.isBlank()){ 
            Notifications.getInstance().show(Notifications.Type.WARNING, "Empty field/s detected");     
        }else{
            int stdID = Integer.parseInt(ID);
            DefaultTableModel attendanceTableModel = (DefaultTableModel) attendanceTable.getModel();
            
            
            //making each table row data align
            DefaultTableCellRenderer leftAlignmentRenderer = new DefaultTableCellRenderer();
            leftAlignmentRenderer.setHorizontalAlignment(SwingConstants.LEFT);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            
            attendanceTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            attendanceTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            attendanceTable.getColumnModel().getColumn(2).setCellRenderer(leftAlignmentRenderer);
            attendanceTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            attendanceTable.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
          try{  
            StudentData recordedData = Administrator.getDataRecorder(tOE, course.toUpperCase(), yrLvl, stdID);
            recordedData.setTimeRecorded(LocalDateTime.now());//set the time created
            typeOfEventTF.setEnabled(false);//disbled, due to condition.
            Administrator.setRecordedData(recordedData);//Passes the recorded data(Instance of the studentData class) to our Data recorder class
            attendanceTableModel.addRow(recordedData.getData());//Add the recorded data in the table    
          }catch(NullPointerException npe){
              JOptionPane.showMessageDialog(this,"Data not found in the Database","INFO",JOptionPane.INFORMATION_MESSAGE);
          }
        }
        typeOfEventTF.putClientProperty("JComponent.outline",(tOE.isBlank()) ? "warning":"success");
        courseTF.putClientProperty("JComponent.outline",(course.isBlank()) ? "warning":"success");
        yrLvlCB.putClientProperty("JComponent.outline",(yrLvl.isBlank()) ? "warning":"success");
        studentIDTF  .putClientProperty("JComponent.outline",(ID.isBlank()) ? "warning":"success");
    }//GEN-LAST:event_recordBtnActionPerformed
    
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
       DefaultTableModel attendanceTableModel = (DefaultTableModel) attendanceTable.getModel();
       
       if(attendanceTable.getSelectedRowCount()>=1){
           attendanceTableModel.removeRow(attendanceTable.getSelectedRow());
       }else{
           if(attendanceTable.getRowCount()==0)
               JOptionPane.showMessageDialog(this, "Table is Empty", "INFO", JOptionPane.INFORMATION_MESSAGE);
           else
               JOptionPane.showMessageDialog(this, "Please select desired row to delete", "INFO", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void getDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataBtnActionPerformed
        DefaultTableModel recordedDataTableModel = (DefaultTableModel) recordedTableData.getModel();
        recordedDataTableModel.setRowCount(0);//To reset the table row
        
        String course = recordedCourseTF.getText();
        String yrlvl = String.valueOf(recordedYrLvlCB.getSelectedItem());
        
        if(course.isBlank()){
            Notifications.getInstance().show(Notifications.Type.WARNING, "Please input student course");
        }else{
            //making each table row data align to the assign alignment
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            DefaultTableCellRenderer LeftAlignmentRenderer = new DefaultTableCellRenderer();
            LeftAlignmentRenderer.setHorizontalAlignment(SwingConstants.LEFT);
            
            recordedTableData.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            recordedTableData.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            recordedTableData.getColumnModel().getColumn(2).setCellRenderer(LeftAlignmentRenderer );
           
           try{ 
               ArrayList<StudentData> recordedData = Administrator.getDataRecorded(course.toUpperCase(), yrlvl);
               Collections.sort(recordedData);
               for(StudentData student : recordedData){
                   String[] rowData = student.getData();
                   recordedDataTableModel.addRow(rowData);
               }
               //Initializing the value of all Textfields above Table
               eventTypedTF.setText(Administrator.getTypeOfEvent());
               dateCreatedTF.setText(Administrator.getDateCreated());
               recoredYrLvlTF.setText(yrlvl);
               recordCourse.setText(course.toUpperCase());
            //catches different types of exception separated by pipe symbol [|]   
           }catch(NullPointerException npe){
                eventTypedTF.setText("");
                dateCreatedTF.setText("");
                recoredYrLvlTF.setText("");
                recordCourse.setText("");
                JOptionPane.showMessageDialog(this, "No Recorded Data At the Moment", "INFO", JOptionPane.INFORMATION_MESSAGE);
           }
        }
        recordedCourseTF.putClientProperty("JComponent.outline",(course.isBlank()) ? "warning":"success");
        recordedYrLvlCB.putClientProperty("JComponent.outline",(yrlvl.isBlank()) ? "warning":"success");
        
    }//GEN-LAST:event_getDataBtnActionPerformed
    
    /*>--- Student ID Text Field validation <----
       - it will only accept character digits
       - also controls the number of digit inputted by the user,
         so that it will only accept 4 digit characters
    */
    private void studentIDTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentIDTFKeyPressed
        if(Character.isDigit(evt.getKeyChar()) || evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE){
            if(studentIDTF.getText().length()>=4){
                if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE) {
                    studentIDTF.putClientProperty("JComponent.outline","success");
                    studentIDTF.setEditable(true);
                }else{
                    studentIDTF.putClientProperty("JComponent.outline","error");
                    studentIDTF.setEditable(false);
                }
            }else{
                studentIDTF.setEditable(true);
                studentIDTF.putClientProperty("JComponent.outline","success");
            }
        }else{
            studentIDTF.setEditable(false);
            studentIDTF.putClientProperty("JComponent.outline","error");
        }
    }//GEN-LAST:event_studentIDTFKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane OptionFrames;
    private javax.swing.JTable attendanceTable;
    private javax.swing.JLabel closeIconLabel;
    private javax.swing.JTextField courseTF;
    private javax.swing.JTextField dateCreatedTF;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField eventTypedTF;
    private javax.swing.JButton getDataBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JButton recordBtn;
    private javax.swing.JTextField recordCourse;
    private javax.swing.JLabel recordFrame;
    private javax.swing.JPanel recordPanel;
    private javax.swing.JTextField recordedCourseTF;
    private javax.swing.JLabel recordedFrame;
    private javax.swing.JPanel recordedPanel;
    private javax.swing.JTable recordedTableData;
    private javax.swing.JComboBox<String> recordedYrLvlCB;
    private javax.swing.JTextField recoredYrLvlTF;
    private javax.swing.JTextField studentIDTF;
    private javax.swing.JTextField typeOfEventTF;
    private javax.swing.JComboBox<String> yrLvlCB;
    // End of variables declaration//GEN-END:variables

}
