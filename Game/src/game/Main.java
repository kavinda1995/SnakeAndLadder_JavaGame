/*
 * Created by Rahal Jayawardane
 * Started: 2017-03-20 
 * Finished: 2017-04-08 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Rahal
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    String qu[] = {
        "What is the basic formular in Accounting?",
        "What is the profit or loss formular in Accounting?",
        "Which financial statement displays the revenues and expenses of a company for a period of time?",
        "What is the main purpose of financial accounting?",
        "Which of these is not included as a separate item in the basic accounting equation?",
        "Which financial statement uses the expanded accounting equation?",
        "The accrual basis of accounting records revenues when they are:",
        "The account format that displays debits, credits, balances, and headings.",
        "Asset accounts have what type of balance?",
        "Which account is not a liability account?",
        "Which account increases equity?",
        "A contra asset account has what type of balance?"
    };
    
    
    String[][] ans = {
                    {"Assets = Liabilities + Equity","Liabilities = Assets + Equity","Equity = Liabilities + Assets","Profit = Revenue - Cost"},
                    {"Assets = Liabilities + Equity","Liabilities = Assets + Equity","Equity = Liabilities + Assets","Profit = Revenue - Cost"},  
                    {"Income Statement","Balance Sheet","Cash Flow Statement","Statement of Stockholder's Equity"},
                    {"Organize Financial Information","Provide Useful, Financial Information to Outsiders","Keep Track of Company Expenses","Minimize Company Taxes"},
                    {"Assets","Revenues","Liabilities","Stockholder's"},
                    {"Income Statement", "Balance Sheet", "Cash Flow Statement","Statement of Stockholder's Equity"},
                    {"Collected", "Earned", "Contracted","Readily Available for Use"},
                    {"General Journal", "General Ledger", "T-Account", "Ledger Account"},
                    {"Debit", "Credit", "Contra", "All of The Above"},
                    {"Accounts Payable", "Accrued Expenses","Cash", "Notes Payable"},
                    {"Expenses", "Withdrawals", "Treasury Stock", "Revenues"},
                    {"Debit", "Credit", "Contra","All of The Above"}                  
    };
    
    
    String corrAns[] = {
        "Assets = Liabilities + Equity",
        "Profit = Revenue - Cost",
        "Income Statement",
        "Provide Useful, Financial Information to Outsiders",
        "Revenues",
        "Balance Sheet",
        "Earned",
        "T-Account",
        "Debit",
        "Cash",
        "Revenues",
        "Credit"                
    };
    
    
    int[][] squres = {
        {7,8},
        {5,10},
        {4,12},
        {2,5},
        {5,8},
        {1,7},
        {9,3},
        {6,9},
        {4,7},
        {7,8},
        {3,5},
        {2,1}
    }; // first one is for correct ans and other one is for wrong ans
    
    
    
    String[][] Accounts = {
                    {"2017/01/02- Owner invested 500,000 cash \n (3 Squares!)","Cash","Capital","500000","d","500000","c","3","1"},
                    {"2017/01/02- Company borrows 5,000 from \nits bank (6 Squares!)","Cash","Bank","5000","d","5000","c","6","2"},
                    {"2017/01/31- Paid 1,500 cash for the rent \n of office space for the month (2 Squares!)","Rent","Cash","1500","d","1500","c","2","3"},
                    {"2017/02/18- Owner withdrew 500 cash for \n personal use (10 Squares!)","Drawings","Cash","500","d","500","c","10","4"},
                    
                    
                    {"2017/02/28- The company paid 2,500 of \n the bank loan (7 Squares!)","Cash","Bank","2500","c","2500","d","7","5"},
                    {"2017/03/06- Owner invested 100,000 cash (12 Squares!)","Cash","Capital","100000","d","100000","c","12","6"},
                    {"2017/04/14- The company paid 2,000 of \n the bank loan (5 Squares!)","Cash","Bank","2000","c","2000","d","5","7"},
                    {"2017/05/21- Paid 6,500 cash for the rent (2 Squares!)","Rent","Cash","6500","d","6500","c","2","8"},
                    {"2017/06/24- Owner withdrew 7,500 cash for \n personal use (9 Squares!)","Drawings","Cash","7500","d","7500","c","9","9"},
                    {"2017/07/31- The company repaid 5,000 of \n the bank loan (6 Squares!)","Cash","Bank","5000","c","5000","d","6","10"}
//        {"2017/03/21- Company borrows 5,000 from its bank","Cash","Bank","50,000","d","50,000","c"},
//        {"2017/04/29- Company borrows 5,000 from its bank","Cash","Bank","50,000","d","50,000","c"},
//        {"2017/05/04- Company borrows 5,000 from its bank","Cash","Bank","50,000","d","50,000","c"},
//        {"2017/05/25- Company borrows 5,000 from its bank","Cash","Bank","50,000","d","50,000","c"},
//        {"2017/06/09- Company borrows 5,000 from its bank","Cash","Bank","50,000","d","50,000","c"},
//        {"2017/07/09- Company borrows 5,000 from its bank","Cash","Bank","50,000","d","50,000","c"},
//        {"2017/09/29- Company borrows 5,000 from its bank","Cash","Bank","50,000","d","50,000","c"},
//        {"2017/10/30- Company borrows 5,000 from its bank","Cash","Bank","50,000","d","50,000","c"},
//        {"2017/11/12- Company borrows 5,000 from its bank","Cash","Bank","50,000","d","50,000","c"},
//        {"2017/12/07- Company borrows 5,000 from its bank","Cash","Bank","50,000","d","50,000","c"},
//        {"2017/12/19- Company borrows 5,000 from its bank","Cash","Bank","50,000","d","50,000","c"}                 
    };
    
    
    
    int cash = 0;
    int capital = 0;
    int bank = 0;
    int rent = 0;
    int drawings = 0;
    
    
    String[][] Accounts2 = Accounts;
    
    
    
    String qu1[] = qu;
    String[][] ans1 = ans;
    String corrAns1[] = corrAns;
    int[][] squres1 = squres;
    
    int index = 0;
    int index1 = 0;
    
    
    ButtonGroup bg = new ButtonGroup();
    String Correct = "";
    
    
    private void groupName(){
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        bg.add(jRadioButton4);
        
    }
    
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        jButton3.setEnabled(false);
        jLabel7.setText("0");
        jLabel13.setText("0");
        jPanel4.setVisible(false);
        groupName();
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
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(8);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake and Ladder v 2.0");
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(null);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/disc2.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 440, 30, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/disc1.png"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 450, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/2.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 490);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Player 1:");

        jLabel3.setText("Player 2:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Rahal");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Rahal");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("100");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/disc1.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/disc2.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("100");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rahal's Turn");

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("-");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setBackground(new java.awt.Color(204, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("-");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Dice 1");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Dice 2");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Roll The Dices");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.getAccessibleContext().setAccessibleName("");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.setName(""); // NOI18N
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("jRadioButton1");
        jRadioButton2.setName(""); // NOI18N

        jRadioButton3.setText("jRadioButton1");

        jRadioButton4.setText("jRadioButton1");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton2.setText("Check Balance Sheet");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Transactions  Window");

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New Game");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Exit");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("Game");
        jMenu2.add(jMenuItem3);
        jMenu2.add(jSeparator3);

        jMenuItem4.setText("Developers");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public int totalSq = 0;
    public int revSq = 0;
    int iCount = 0;
    boolean add = true;
    String player1Name = "";
    String player2Name = "";
    boolean player1 = false;
    
    public int Player1(){
        timer.start();
        return 1;
    }
    
    
    public int Player2(){
        timer2.start();
        return 1;
    }
    
    private void Player1rev() {
        revtimer.start();
    }
    
    private void Player2rev() {
        revtimer2.start();
    }
    
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //jButton1.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        
    }//GEN-LAST:event_formFocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int d1 = Integer.parseInt(jLabel14.getText());
        int d2 = Integer.parseInt(jLabel6.getText());
        
        totalSq = d1+d2;
        //System.out.println(""+totalSq);
        
        if(player1){
            Player1();
            if(Integer.parseInt(jLabel7.getText())+ totalSq > 100 ){
                jLabel7.setText( "100");
            }else{
                jLabel7.setText( ""+ (Integer.parseInt(jLabel7.getText())+ totalSq));
            }
                
            
        }
        else{
            Player2();
            if(Integer.parseInt(jLabel13.getText())+ totalSq > 100 ){
                jLabel13.setText( "100");
            }else{
                jLabel13.setText( ""+ (Integer.parseInt(jLabel13.getText())+ totalSq));
            }
                
        }
        
        
        
        jLabel14.setText("-");
        jLabel6.setText("-");
        
        
        Question();
        //jButton4.setEnabled(true);
        jButton3.setEnabled(false);
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        
        player1 = !player1;
        
        Random random = new Random();
        
        
        int t = random.nextInt(6 - 1 + 1) + 1;
        jLabel14.setText(""+t);
        
        int t1 = random.nextInt(6 - 1 + 1) + 1;
        jLabel6.setText(""+t1);
        
        jButton3.setEnabled(true);
        jButton4.setEnabled(false);
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    
        int index0 = 0;
        int index2 =  0;
        int index3 =  0;
        int index4 =  0;
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jButton1.setEnabled(false);
        
        String An= bg.getSelection().getActionCommand();
        
        
        index = Integer.parseInt(An)-1;
        System.out.println(Arrays.toString(Accounts[index]));
        //JOptionPane.showMessageDialog(null, index, "Results", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
        
        
        if(player1){
            
            
            setTotal(Integer.parseInt(Accounts[index][7]));
            
//            JOptionPane.showMessageDialog(null, An, "Results", JOptionPane.INFORMATION_MESSAGE);
//            
//            
//            
//            if(Correct.equals(An)){
//                
//                String msg = "<html><center>You're Answer is <br> <b> <p style='color:Green;font-size:20px'>Correct</p> </center> </b> <hr> You got "+squres[index][0]+" squares <b>Bonus</b>   ";
//                JLabel label = new JLabel(msg);
//                label.setFont(new Font("serif", Font.PLAIN, 18));
//                JOptionPane.showMessageDialog(null, label, "Results", JOptionPane.INFORMATION_MESSAGE);
//                
//                System.out.println(squres[index][0]);
//                
//                
//                
//                
//                
//            }
//            else{
//                
//                String msg = "<html><center>You're Answer is <br> <b> <p style='color:Red;font-size:20px'>Wrong</p> </center> </b> <hr> You <b>lost</b> "+squres[index][1]+" squares";
//                JLabel label = new JLabel(msg);
//                label.setFont(new Font("serif", Font.PLAIN, 18));
//                JOptionPane.showMessageDialog(null, label, "Results", JOptionPane.INFORMATION_MESSAGE);
//                
//                
//                System.out.println(squres[index][1]);
//                setRev(squres[index][1]);
//            }
        }
        else{
            setTotal1(Integer.parseInt(Accounts[index][7]));
        }
        
        
        
        
//        int cash = 0;
//    int capital = 0;
//    int bank = 0;
//    int rent = 0;
//    int drawings = 0;
        System.out.println(index);
        


        
        if(Accounts[index][1].equals("Cash")){
            if(Accounts[index][4].equals("c")){
                cash = cash-Integer.parseInt(Accounts[index][3]);
            }
            else{
                cash = cash+Integer.parseInt(Accounts[index][3]);
            }
        }
        else if(Accounts[index][1].equals("Bank")){
            if(Accounts[index][4].equals("d")){
                bank = bank-Integer.parseInt(Accounts[index][3]);
            }
            else{
                bank = bank+Integer.parseInt(Accounts[index][3]);
            }
        } 
        else if(Accounts[index][1].equals("Capital")){
            if(Accounts[index][4].equals("d")){
                capital = capital-Integer.parseInt(Accounts[index][3]);
            }
            else{
                capital = capital+Integer.parseInt(Accounts[index][3]);
            }
        } 
        else if(Accounts[index][1].equals("Rent")){
            if(Accounts[index][4].equals("c")){
                rent = rent-Integer.parseInt(Accounts[index][3]);
            }
            else{
                rent = rent+Integer.parseInt(Accounts[index][3]);
            }
        } 
        else if(Accounts[index][1].equals("Drawings")){
            if(Accounts[index][4].equals("c")){
                drawings = drawings-Integer.parseInt(Accounts[index][3]);
            }
            else{
                drawings = drawings+Integer.parseInt(Accounts[index][3]);
            }
        } 
//        ???????????????????????????????????????????????????????????????????????????????????

        if(Accounts[index][2].equals("Cash")){
            if(Accounts[index][6].equals("c")){
                cash = cash-Integer.parseInt(Accounts[index][5]);
            }
            else{
                cash = cash+Integer.parseInt(Accounts[index][5]);
            }
        }
        else if(Accounts[index][2].equals("Bank")){
            if(Accounts[index][6].equals("d")){
                bank = bank-Integer.parseInt(Accounts[index][5]);
            }
            else{
                bank = bank+Integer.parseInt(Accounts[index][5]);
            }
        } 
        else if(Accounts[index][2].equals("Capital")){
            if(Accounts[index][6].equals("d")){
                capital = capital-Integer.parseInt(Accounts[index][5]);
            }
            else{
                capital = capital+Integer.parseInt(Accounts[index][5]);
            }
        } 
        else if(Accounts[index][2].equals("Rent")){
            if(Accounts[index][6].equals("c")){
                rent = rent-Integer.parseInt(Accounts[index][5]);
            }
            else{
                rent = rent+Integer.parseInt(Accounts[index][5]);
            }
        } 
        else if(Accounts[index][2].equals("Drawings")){
            if(Accounts[index][6].equals("c")){
                drawings = drawings-Integer.parseInt(Accounts[index][5]);
            }
            else{
                drawings = drawings+Integer.parseInt(Accounts[index][5]);
            }
        } 
        
        
        
        
        
        
       // JOptionPane.showMessageDialog(null, Accounts2[index][0], "Question", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
        
        
//        for (int i = 0; i < qu1.length; i++) {
//            System.out.println(index+" - "+qu1[i]);
//        }
//        
//        List<String> list = new ArrayList<String>(Arrays.asList(qu1));
//        list.remove(qu1[index]);
//        qu1 = list.toArray(new String[0]);

        
        
        
//        qu1[index] = null;
//        ans1[index] = null;
//        corrAns1[index] = null;
//        squres1[index] = null;
        
        
        
        if(player1){
            jLabel8.setText(player2Name+"'s Turn");
        }
        else{
            jLabel8.setText(player1Name+"'s Turn");
        }
        
        jPanel4.setVisible(false);
        jButton1.setEnabled(true);
        jButton4.setEnabled(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String ms = "<html> <br>"
                + "Cash -> LKR."+cash
                + "<br>Bank -> LKR."+bank
                + "<br>Rent -> LKR."+rent
                + "<br>Capital -> LKR."+capital
                + "<br>Drawings -> LKR."+drawings
                + "</html>";
        
        
        JOptionPane.showMessageDialog(null,ms , "Balance Sheet", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Main n = new Main();
        n.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    
    
    
    int cc = 0;
    public void setTotal(int total) {
        //JOptionPane.showMessageDialog(null, total, "Results", JOptionPane.INFORMATION_MESSAGE);
        totalSq = total;
        Player1();
        if(Integer.parseInt(jLabel7.getText())+ totalSq > 100 ){
            jLabel7.setText( "100");
        }else{
            jLabel7.setText( ""+ (Integer.parseInt(jLabel7.getText())+ totalSq));
        }
        
    }
    
    public void setRev(int total) {
        revSq = total;
        Player1rev();
        int check = (Integer.parseInt(jLabel7.getText())- revSq);
        if(check < 0){
            check = 0;
        }
        jLabel7.setText( ""+ check);
        
        
        
    }
    
    
    public void setTotal1(int total) {
        totalSq = total;
        Player2();
        if(Integer.parseInt(jLabel13.getText())+ totalSq > 100 ){
            jLabel13.setText( "100");
        }else{
            jLabel13.setText( ""+ (Integer.parseInt(jLabel13.getText())+ totalSq));
        }
    }
    
    public void setRev1(int total) {
        revSq = total;
        Player2rev();
        int check = (Integer.parseInt(jLabel13.getText())- revSq);
        if(check < 0){
            check = 0;
        }
        jLabel13.setText( ""+ check);
        
    }
    
    
    
    /**Z
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    
    
    
    
    public Timer timer = new Timer(200,  new ActionListener() {
        int cc = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            
                    int x = jLabel9.getX();
                    int y = jLabel9.getY();
                    iCount++;
                    cc++;
                    
                    if(iCount == 10){
                        y-=48;
                        if(add){
                            x+=48;
                        }
                        else{
                            x-=48;
                        }

                        add= !add;
                        iCount = 0;
                    }

                    if(x == 10 && y == 450){
                        jLabel9.setLocation(x+1, y);
                        iCount = iCount-1;
                        
                        
                    }
                    else{
                        if(add){
                            jLabel9.setLocation(x+48, y);


                        }
                        else{
                            jLabel9.setLocation(x-48, y);
                        }
                    }
                    
                    
                    
                    jLabel9.setLayout(null);
                    //jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));

                    //System.out.println(x+" - "+y);

                    if(x == 59 && y== 18 ){
                        Winner j = new Winner();
                        j.setPlayer("1",player1Name);
                        j.setVisible(true);
                        timer.stop();
                    }
                    
                    //System.out.println(cc+" - "+totalSq);
                    if(cc >= totalSq){
                        totalSq = 0;
                        cc = 0;
                        timer.stop();
                        
                    }
                    

            
        }
    });
    
    boolean add1 = true;
    int iCount1 = 0;
    public Timer timer2 = new Timer(200,  new ActionListener() {
        int cc1 = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            
                    int x1 = jLabel10.getX();
                    int y1 = jLabel10.getY();
                    iCount1++;
                    cc1++;
                    
                    if(iCount1 == 10){
                        y1-=48;
                        if(add1){
                            x1+=48;
                        }
                        else{
                            x1-=48;
                        }

                        add1= !add1;
                        iCount1 = 0;
                    }

                    if(x1 == 20 && y1 == 440){
                        jLabel10.setLocation(x1+1, y1);
                        iCount1 = iCount1-1;
                        
                        
                    }
                    else{
                        if(add1){
                            jLabel10.setLocation(x1+48, y1);


                        }
                        else{
                            jLabel10.setLocation(x1-48, y1);
                        }
                    }
                    
                    
                    
                    jLabel10.setLayout(null);
                    //jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));

                    //System.out.println(x1+" - "+y1);

                    if(x1 == 69 && y1== 8 ){
                        Winner j = new Winner();
                        j.setPlayer("2",player2Name);
                        j.setVisible(true);
                        timer.stop();
                    }
                    
                    //System.out.println(cc+" - "+totalSq);
                    if(cc1 >= totalSq){
                        totalSq = 0;
                        cc1 = 0;
                        timer2.stop();
                        
                    }
                    

            
        }
    });

    
    private void Question() {
        jPanel4.setVisible(true);
        
        
        Random random = new Random();
        //index = random.nextInt(qu.length);
        
        if(index == 0){
            qu1 = qu;
            ans1 = ans;
            corrAns1 = corrAns;
            squres1 = squres;
        }
        
        
        
        index0 = index;
        index2 =  (index+1>Accounts.length)? 0: index+1;
        index3 =  (index+2>Accounts.length)? 0: index+2;
        index4 =  (index+3>Accounts.length)? 0: index+3;
        
        
        
        // Question
        jTextArea1.setText(qu[index]);
        
        
        // answers
        jRadioButton1.setText(Accounts[index0][0]);
        jRadioButton1.setActionCommand(Accounts[index0][8]);
        
        jRadioButton2.setText(Accounts[index2][0]);
        jRadioButton2.setActionCommand(Accounts[index2][8]);
        
        jRadioButton3.setText(Accounts[index3][0]);
        jRadioButton3.setActionCommand(Accounts[index3][8]);
        
        jRadioButton4.setText(Accounts[index4][0]);
        jRadioButton4.setActionCommand(Accounts[index4][8]);
        
        
        // correct ans
        Correct = corrAns[index];
        
    }
    
    
    
//    boolean add = true;
//    int iCount2 = 0;
    public Timer revtimer = new Timer(200,  new ActionListener() {
        int cc12 = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            
                    int x = jLabel9.getX();
                    int y = jLabel9.getY();
                    iCount--;
                    cc12++;
                    
                    if(iCount < 0){
                        y+=48;
                        if(add){
                            x-=48;
                        }
                        else{
                            x+=48;
                        }

                        add= !add;
                        iCount = 9;
                    }

                    if(x == 21 && y == 450){
                        jLabel9.setLocation(20, 450);
                        revtimer.stop();
                        
                        
                    }
                    else{
                        if(add){
                            jLabel9.setLocation(x-48, y);


                        }
                        else{
                            jLabel9.setLocation(x+48, y);
                        }
                    }
                    
                    
                    
                    jLabel9.setLayout(null);
                    //jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));

                    //System.out.println(x+" - "+y);

                    //System.out.println(cc+" - "+totalSq);
                    if(cc12 >= revSq){
                        revSq = 0;
                        cc12 = 0;
                        revtimer.stop();
                        
                    }
                    

            
        }
    });
    
    
    public Timer revtimer2 = new Timer(200,  new ActionListener() {
        int cc13 = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            
                    int x1 = jLabel10.getX();
                    int y1 = jLabel10.getY();
                    iCount1--;
                    cc13++;
                    
                    if(iCount1 < -1){
                        y1+=48;
                        if(add1){
                            x1-=48;
                        }
                        else{
                            x1+=48;
                        }

                        add1= !add1;
                        iCount1 = 9;
                    }

                    if(x1 == 21 && y1 == 440){
                        jLabel10.setLocation(-27, 440);
                        revtimer2.stop();
                        
                        
                    }
                    else{
                        if(add1){
                            jLabel10.setLocation(x1-48, y1);
                            

                        }
                        else{
                            jLabel10.setLocation(x1+48, y1);
                        }
                    }
                    
                    
                    //System.out.println(x1+" - "+y1);
                    jLabel10.setLayout(null);
                    //jPanel1.setLayout(new FlowLayout(FlowLayout.LEFT));

                   
                    if(cc13 >= revSq){
                        revSq = 0;
                        cc13= 0;
                        revtimer2.stop();
                        
                    }
                    

            
        }
    });

    void setPlayer(String p1, String p2) {
        jLabel4.setText(p1);
        jLabel5.setText(p2);
        player1Name = p1;
        player2Name = p2;
        
        jLabel8.setText(player1Name+"'s Turn");
    }

    
    
    
   
}
