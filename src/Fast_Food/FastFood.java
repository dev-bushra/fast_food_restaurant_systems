package Fast_Food;
//@author Bushra
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
public class FastFood extends javax.swing.JFrame {
//Cost and Prices of all food

//Meals    
double BushraEspicyMeal = 5.0;
double BushraFamilyMeal = 5.0;
double ChickenBrostMeal = 5.0;
double MeatMeal = 5.0;
double SaladMeal = 5.0;
//Sandwitchs
double Humburger = 5.0;
double ChickenHum = 5.0;
double ChickenTost = 5.0;
double FishTost = 5.0;
double Cheese = 5.0;
//Desserts
double ChocolateMuffin = 5.0;
double Pineapple = 5.0;
double Pancakes = 5.0;
//Milk Shakes
double Chocolate = 5.0;
double Strawberry = 5.0;
double Vanilla = 5.0;
//Drinks
double Water = 5.0;
double Peapsi = 5.0;
double Cola = 5.0;
double Sup = 5.0;
double RedBull = 5.0;
double Dueo = 5.0;
//Hot Drinks
double Tea = 5.0;
double Coffee = 5.0;
double MilkTea = 5.0;
double Niscaffee = 5.0;

    
    //more val
    double Tax,SubTotal,Cal,Total;
    double[] IteamCost = new double[26]; //Area
    //double rate = 1.5;
  
    public FastFood() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code.*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox_BushraEspicyMeal = new javax.swing.JCheckBox();
        jTextField_BushraEspicyMeal = new javax.swing.JTextField();
        jTextField_BushraFamilyMeal = new javax.swing.JTextField();
        jCheckBox_BushraFamilyMeal = new javax.swing.JCheckBox();
        jTextField_ChickenBrostMeal = new javax.swing.JTextField();
        jCheckBox_ChickenBrostMeal = new javax.swing.JCheckBox();
        jTextField_MeatMeal = new javax.swing.JTextField();
        jCheckBox_MeatMeal = new javax.swing.JCheckBox();
        jCheckBox_SaladMeal = new javax.swing.JCheckBox();
        jTextField_SaladMeal = new javax.swing.JTextField();
        jCheckBox_Humburger = new javax.swing.JCheckBox();
        jTextField_Humburger = new javax.swing.JTextField();
        jCheckBox_ChickenHum = new javax.swing.JCheckBox();
        jTextField_ChickenHum = new javax.swing.JTextField();
        jCheckBox_ChickenTost = new javax.swing.JCheckBox();
        jTextField_ChickenTost = new javax.swing.JTextField();
        jCheckBox_FishTost = new javax.swing.JCheckBox();
        jTextField_FishTost = new javax.swing.JTextField();
        jCheckBox_Cheese = new javax.swing.JCheckBox();
        jTextField_Cheese = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox_ChocolateMuffin = new javax.swing.JCheckBox();
        jCheckBox_Pancakes = new javax.swing.JCheckBox();
        jTextField_Pineapple = new javax.swing.JTextField();
        jTextField_Pancakes = new javax.swing.JTextField();
        jTextField_ChocolateMuffin = new javax.swing.JTextField();
        jCheckBox_Pineapple = new javax.swing.JCheckBox();
        jCheckBox_Chocolate = new javax.swing.JCheckBox();
        jCheckBox_Vanilla = new javax.swing.JCheckBox();
        jTextField_Strawberry = new javax.swing.JTextField();
        jTextField_Vanilla = new javax.swing.JTextField();
        jTextField_Chocolate = new javax.swing.JTextField();
        jCheckBox_Strawberry = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        COUNTER = new javax.swing.JTextField();
        PayMentMethodComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        Total_Button = new javax.swing.JButton();
        Tax_TextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Sub_TextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Payment_TextField = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Total_TextField = new javax.swing.JTextField();
        Reset_Button = new javax.swing.JButton();
        Exit_Button = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField_Dueo = new javax.swing.JTextField();
        jCheckBox_RedBull = new javax.swing.JCheckBox();
        jCheckBox_Peapsi = new javax.swing.JCheckBox();
        jCheckBox_MilkTea = new javax.swing.JCheckBox();
        jCheckBox_Cola = new javax.swing.JCheckBox();
        jCheckBox_Tea = new javax.swing.JCheckBox();
        jTextField_Sup = new javax.swing.JTextField();
        jTextField_Coffee = new javax.swing.JTextField();
        jTextField_Cola = new javax.swing.JTextField();
        jTextField_Peapsi = new javax.swing.JTextField();
        jTextField_Water = new javax.swing.JTextField();
        jTextField_Tea = new javax.swing.JTextField();
        jCheckBox_Dueo = new javax.swing.JCheckBox();
        jTextField_MilkTea = new javax.swing.JTextField();
        jCheckBox_Water = new javax.swing.JCheckBox();
        jCheckBox_Coffee = new javax.swing.JCheckBox();
        jTextField_RedBull = new javax.swing.JTextField();
        jCheckBox_Sup = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jCheckBox_Niscaffee = new javax.swing.JCheckBox();
        jTextField_Niscaffee = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1370, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 50)); // NOI18N
        jLabel12.setText("Bushra Fast Food Resturant");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(292, 292, 292)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1330, 80));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jCheckBox_BushraEspicyMeal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_BushraEspicyMeal.setText("Busha Espicy Meal");
        jCheckBox_BushraEspicyMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_BushraEspicyMealActionPerformed(evt);
            }
        });

        jTextField_BushraEspicyMeal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_BushraEspicyMeal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_BushraEspicyMeal.setText("0");
        jTextField_BushraEspicyMeal.setEnabled(false);
        jTextField_BushraEspicyMeal.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_BushraEspicyMeal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_BushraEspicyMealKeyTyped(evt);
            }
        });

        jTextField_BushraFamilyMeal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_BushraFamilyMeal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_BushraFamilyMeal.setText("0");
        jTextField_BushraFamilyMeal.setEnabled(false);
        jTextField_BushraFamilyMeal.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_BushraFamilyMeal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_BushraFamilyMealKeyTyped(evt);
            }
        });

        jCheckBox_BushraFamilyMeal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_BushraFamilyMeal.setText("Bushra Family Meal");
        jCheckBox_BushraFamilyMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_BushraFamilyMealActionPerformed(evt);
            }
        });

        jTextField_ChickenBrostMeal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_ChickenBrostMeal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_ChickenBrostMeal.setText("0");
        jTextField_ChickenBrostMeal.setEnabled(false);
        jTextField_ChickenBrostMeal.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_ChickenBrostMeal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ChickenBrostMealKeyTyped(evt);
            }
        });

        jCheckBox_ChickenBrostMeal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_ChickenBrostMeal.setText("Chicken Brost Meal");
        jCheckBox_ChickenBrostMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ChickenBrostMealActionPerformed(evt);
            }
        });

        jTextField_MeatMeal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_MeatMeal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_MeatMeal.setText("0");
        jTextField_MeatMeal.setEnabled(false);
        jTextField_MeatMeal.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_MeatMeal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_MeatMealKeyTyped(evt);
            }
        });

        jCheckBox_MeatMeal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_MeatMeal.setText("Meat Meal");
        jCheckBox_MeatMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_MeatMealActionPerformed(evt);
            }
        });

        jCheckBox_SaladMeal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_SaladMeal.setText("Salad Meal");
        jCheckBox_SaladMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_SaladMealActionPerformed(evt);
            }
        });

        jTextField_SaladMeal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_SaladMeal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_SaladMeal.setText("0");
        jTextField_SaladMeal.setEnabled(false);
        jTextField_SaladMeal.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_SaladMeal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_SaladMealKeyTyped(evt);
            }
        });

        jCheckBox_Humburger.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Humburger.setText("Humburger");
        jCheckBox_Humburger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_HumburgerActionPerformed(evt);
            }
        });

        jTextField_Humburger.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Humburger.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Humburger.setText("0");
        jTextField_Humburger.setEnabled(false);
        jTextField_Humburger.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Humburger.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_HumburgerKeyTyped(evt);
            }
        });

        jCheckBox_ChickenHum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_ChickenHum.setText("Chicken Hum");
        jCheckBox_ChickenHum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ChickenHumActionPerformed(evt);
            }
        });

        jTextField_ChickenHum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_ChickenHum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_ChickenHum.setText("0");
        jTextField_ChickenHum.setEnabled(false);
        jTextField_ChickenHum.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_ChickenHum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ChickenHumKeyTyped(evt);
            }
        });

        jCheckBox_ChickenTost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_ChickenTost.setText("Chicken Tost");
        jCheckBox_ChickenTost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ChickenTostActionPerformed(evt);
            }
        });

        jTextField_ChickenTost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_ChickenTost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_ChickenTost.setText("0");
        jTextField_ChickenTost.setEnabled(false);
        jTextField_ChickenTost.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_ChickenTost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ChickenTostKeyTyped(evt);
            }
        });

        jCheckBox_FishTost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_FishTost.setText("Fish Tost");
        jCheckBox_FishTost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_FishTostActionPerformed(evt);
            }
        });

        jTextField_FishTost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_FishTost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_FishTost.setText("0");
        jTextField_FishTost.setEnabled(false);
        jTextField_FishTost.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_FishTost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_FishTostKeyTyped(evt);
            }
        });

        jCheckBox_Cheese.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Cheese.setText("Cheese");
        jCheckBox_Cheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_CheeseActionPerformed(evt);
            }
        });

        jTextField_Cheese.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Cheese.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Cheese.setText("0");
        jTextField_Cheese.setEnabled(false);
        jTextField_Cheese.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Cheese.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_CheeseKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Fast Meal And Big Meal");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Sandwich");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox_BushraEspicyMeal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_BushraEspicyMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jCheckBox_BushraFamilyMeal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField_BushraFamilyMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox_MeatMeal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_MeatMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox_ChickenBrostMeal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_ChickenBrostMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jCheckBox_SaladMeal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField_SaladMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox_Humburger)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Humburger, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox_FishTost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_FishTost, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox_ChickenTost)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ChickenTost, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox_ChickenHum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ChickenHum, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox_Cheese)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Cheese, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_BushraEspicyMeal)
                    .addComponent(jTextField_BushraEspicyMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_BushraFamilyMeal)
                    .addComponent(jTextField_BushraFamilyMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_ChickenBrostMeal)
                    .addComponent(jTextField_ChickenBrostMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_MeatMeal)
                    .addComponent(jTextField_MeatMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_SaladMeal)
                    .addComponent(jTextField_SaladMeal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_Humburger)
                    .addComponent(jTextField_Humburger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_ChickenHum)
                    .addComponent(jTextField_ChickenHum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_ChickenTost)
                    .addComponent(jTextField_ChickenTost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_FishTost)
                    .addComponent(jTextField_FishTost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_Cheese)
                    .addComponent(jTextField_Cheese, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 340, 570));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jCheckBox_ChocolateMuffin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_ChocolateMuffin.setText("Chocolate Muffin");
        jCheckBox_ChocolateMuffin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ChocolateMuffinActionPerformed(evt);
            }
        });

        jCheckBox_Pancakes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Pancakes.setText("Pancakes");
        jCheckBox_Pancakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_PancakesActionPerformed(evt);
            }
        });

        jTextField_Pineapple.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Pineapple.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Pineapple.setText("0");
        jTextField_Pineapple.setEnabled(false);
        jTextField_Pineapple.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Pineapple.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PineappleKeyTyped(evt);
            }
        });

        jTextField_Pancakes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Pancakes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Pancakes.setText("0");
        jTextField_Pancakes.setEnabled(false);
        jTextField_Pancakes.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Pancakes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PancakesKeyTyped(evt);
            }
        });

        jTextField_ChocolateMuffin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_ChocolateMuffin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_ChocolateMuffin.setText("0");
        jTextField_ChocolateMuffin.setEnabled(false);
        jTextField_ChocolateMuffin.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_ChocolateMuffin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ChocolateMuffinKeyTyped(evt);
            }
        });

        jCheckBox_Pineapple.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Pineapple.setText("Pineapple");
        jCheckBox_Pineapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_PineappleActionPerformed(evt);
            }
        });

        jCheckBox_Chocolate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Chocolate.setText("Chocolate");
        jCheckBox_Chocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ChocolateActionPerformed(evt);
            }
        });

        jCheckBox_Vanilla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Vanilla.setText("Vanilla");
        jCheckBox_Vanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_VanillaActionPerformed(evt);
            }
        });

        jTextField_Strawberry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Strawberry.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Strawberry.setText("0");
        jTextField_Strawberry.setEnabled(false);
        jTextField_Strawberry.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Strawberry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_StrawberryKeyTyped(evt);
            }
        });

        jTextField_Vanilla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Vanilla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Vanilla.setText("0");
        jTextField_Vanilla.setEnabled(false);
        jTextField_Vanilla.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Vanilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_VanillaKeyTyped(evt);
            }
        });

        jTextField_Chocolate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Chocolate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Chocolate.setText("0");
        jTextField_Chocolate.setEnabled(false);
        jTextField_Chocolate.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Chocolate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ChocolateKeyTyped(evt);
            }
        });

        jCheckBox_Strawberry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Strawberry.setText("Strawberry");
        jCheckBox_Strawberry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_StrawberryActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Desserts");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Milk Shakes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jCheckBox_ChocolateMuffin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_ChocolateMuffin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jCheckBox_Pineapple)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Pineapple, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jCheckBox_Pancakes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_Pancakes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jCheckBox_Chocolate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_Chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jCheckBox_Strawberry)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_Strawberry, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jCheckBox_Vanilla)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_Vanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(66, 66, 66)))
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox_ChocolateMuffin)
                            .addComponent(jTextField_ChocolateMuffin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox_Pineapple)
                            .addComponent(jTextField_Pineapple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox_Pancakes)
                            .addComponent(jTextField_Pancakes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox_Chocolate)
                            .addComponent(jTextField_Chocolate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox_Strawberry)
                            .addComponent(jTextField_Strawberry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox_Vanilla)
                            .addComponent(jTextField_Vanilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 44, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 640, 190));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        COUNTER.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        COUNTER.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        COUNTER.setText("0");
        COUNTER.setEnabled(false);

        PayMentMethodComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PayMentMethodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card", "Mobile Inbok", "Calculate" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("COUNTER");

        Total_Button.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Total_Button.setForeground(new java.awt.Color(51, 204, 0));
        Total_Button.setText("Total");
        Total_Button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0)));
        Total_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_ButtonActionPerformed(evt);
            }
        });

        Tax_TextField.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Tax_TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tax_TextField.setText("0");
        Tax_TextField.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Tax");

        Sub_TextField.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        Sub_TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sub_TextField.setText("0");
        Sub_TextField.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel8.setText("Sub Total");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("PayMent Method");

        Payment_TextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 4));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 204, 0));
        jLabel9.setText("Total");

        Total_TextField.setBackground(new java.awt.Color(240, 240, 240));
        Total_TextField.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Total_TextField.setForeground(new java.awt.Color(51, 204, 0));
        Total_TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Total_TextField.setText("0");
        Total_TextField.setDisabledTextColor(new java.awt.Color(51, 204, 0));
        Total_TextField.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Total_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Total_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Reset_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Reset_Button.setText("Reset");
        Reset_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_ButtonActionPerformed(evt);
            }
        });

        Exit_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Exit_Button.setText("Exit");
        Exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Total_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PayMentMethodComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Payment_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sub_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tax_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COUNTER, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(Reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(PayMentMethodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Payment_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(COUNTER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Tax_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Sub_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Total_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 640, 370));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));

        jTextField_Dueo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Dueo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Dueo.setText("0");
        jTextField_Dueo.setEnabled(false);
        jTextField_Dueo.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Dueo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_DueoKeyTyped(evt);
            }
        });

        jCheckBox_RedBull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_RedBull.setText("Red Bull");
        jCheckBox_RedBull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_RedBullActionPerformed(evt);
            }
        });

        jCheckBox_Peapsi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Peapsi.setText("Peapsi");
        jCheckBox_Peapsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_PeapsiActionPerformed(evt);
            }
        });

        jCheckBox_MilkTea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_MilkTea.setText("Milk Tea");
        jCheckBox_MilkTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_MilkTeaActionPerformed(evt);
            }
        });

        jCheckBox_Cola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Cola.setText("Cola");
        jCheckBox_Cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_ColaActionPerformed(evt);
            }
        });

        jCheckBox_Tea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Tea.setText("Tea");
        jCheckBox_Tea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_TeaActionPerformed(evt);
            }
        });

        jTextField_Sup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Sup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Sup.setText("0");
        jTextField_Sup.setEnabled(false);
        jTextField_Sup.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Sup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_SupKeyTyped(evt);
            }
        });

        jTextField_Coffee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Coffee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Coffee.setText("0");
        jTextField_Coffee.setEnabled(false);
        jTextField_Coffee.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Coffee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_CoffeeKeyTyped(evt);
            }
        });

        jTextField_Cola.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Cola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Cola.setText("0");
        jTextField_Cola.setEnabled(false);
        jTextField_Cola.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Cola.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ColaKeyTyped(evt);
            }
        });

        jTextField_Peapsi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Peapsi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Peapsi.setText("0");
        jTextField_Peapsi.setEnabled(false);
        jTextField_Peapsi.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Peapsi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_PeapsiKeyTyped(evt);
            }
        });

        jTextField_Water.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Water.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Water.setText("0");
        jTextField_Water.setEnabled(false);
        jTextField_Water.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Water.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_WaterKeyTyped(evt);
            }
        });

        jTextField_Tea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Tea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Tea.setText("0");
        jTextField_Tea.setEnabled(false);
        jTextField_Tea.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Tea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TeaKeyTyped(evt);
            }
        });

        jCheckBox_Dueo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Dueo.setText("Dueo");
        jCheckBox_Dueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_DueoActionPerformed(evt);
            }
        });

        jTextField_MilkTea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_MilkTea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_MilkTea.setText("0");
        jTextField_MilkTea.setEnabled(false);
        jTextField_MilkTea.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_MilkTea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_MilkTeaKeyTyped(evt);
            }
        });

        jCheckBox_Water.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Water.setText("Water");
        jCheckBox_Water.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_WaterActionPerformed(evt);
            }
        });

        jCheckBox_Coffee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Coffee.setText("Coffee");
        jCheckBox_Coffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_CoffeeActionPerformed(evt);
            }
        });

        jTextField_RedBull.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_RedBull.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_RedBull.setText("0");
        jTextField_RedBull.setEnabled(false);
        jTextField_RedBull.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_RedBull.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_RedBullKeyTyped(evt);
            }
        });

        jCheckBox_Sup.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Sup.setText("7 Up");
        jCheckBox_Sup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_SupActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Drinks");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Hot Drinks");

        jCheckBox_Niscaffee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_Niscaffee.setText("Niscaffee");
        jCheckBox_Niscaffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_NiscaffeeActionPerformed(evt);
            }
        });

        jTextField_Niscaffee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Niscaffee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_Niscaffee.setText("0");
        jTextField_Niscaffee.setEnabled(false);
        jTextField_Niscaffee.setPreferredSize(new java.awt.Dimension(7, 27));
        jTextField_Niscaffee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_NiscaffeeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jCheckBox_Tea)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_Tea, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jCheckBox_Coffee)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_Coffee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jCheckBox_MilkTea)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_MilkTea, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jCheckBox_Niscaffee)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_Niscaffee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel5))
                            .addGap(57, 57, 57)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jCheckBox_Water)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_Water, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jCheckBox_Peapsi)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_Peapsi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jCheckBox_Cola)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_Cola, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jCheckBox_Sup)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_Sup, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jCheckBox_RedBull)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_RedBull, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jCheckBox_Dueo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextField_Dueo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(78, 78, 78))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_Water, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_Water))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_Peapsi)
                    .addComponent(jTextField_Peapsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_Cola)
                    .addComponent(jTextField_Cola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_Sup)
                    .addComponent(jTextField_Sup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_RedBull)
                    .addComponent(jTextField_RedBull, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_Dueo)
                    .addComponent(jTextField_Dueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_Tea)
                    .addComponent(jTextField_Tea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_Coffee)
                    .addComponent(jTextField_Coffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_MilkTea)
                    .addComponent(jTextField_MilkTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox_Niscaffee)
                    .addComponent(jTextField_Niscaffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 100, 310, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private JFrame frame;
    private void Exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_ButtonActionPerformed
        // Exit Confirm
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are You Sure You Want To Exit ! \n all the resent data are going to lose. ", "Bushra Fast Food Resturant", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION ) {
                        System.exit(0);
                }
    }//GEN-LAST:event_Exit_ButtonActionPerformed

    private void Reset_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_ButtonActionPerformed
        // Reset All Fields
        
        
            // CheckBox ========================== 
        jCheckBox_BushraEspicyMeal.setSelected(false);
        jCheckBox_BushraFamilyMeal.setSelected(false);
        jCheckBox_ChickenBrostMeal.setSelected(false);
        jCheckBox_MeatMeal.setSelected(false);
        jCheckBox_SaladMeal.setSelected(false);
        jCheckBox_Humburger.setSelected(false);
        jCheckBox_ChickenHum.setSelected(false);
        jCheckBox_ChickenTost.setSelected(false);
        jCheckBox_FishTost.setSelected(false);
        jCheckBox_Cheese.setSelected(false);
        jCheckBox_ChocolateMuffin.setSelected(false);
        jCheckBox_Pineapple.setSelected(false);
        jCheckBox_Pancakes.setSelected(false);
        jCheckBox_Chocolate.setSelected(false);
        jCheckBox_Vanilla.setSelected(false);
        jCheckBox_Strawberry.setSelected(false);
        jCheckBox_RedBull.setSelected(false);
        jCheckBox_Dueo.setSelected(false);
        jCheckBox_Tea.setSelected(false);
        jCheckBox_Coffee.setSelected(false);
        jCheckBox_MilkTea.setSelected(false);
        jCheckBox_Peapsi.setSelected(false);
        jCheckBox_Cola.setSelected(false);
        jCheckBox_Water.setSelected(false);
        jCheckBox_Niscaffee.setSelected(false);
        jCheckBox_Sup.setSelected(false);
        
                


            // TextField ==========================
        jTextField_BushraEspicyMeal.setText("0");
        jTextField_BushraFamilyMeal.setText("0");
        jTextField_ChickenBrostMeal.setText("0");
        jTextField_MeatMeal.setText("0");
        jTextField_SaladMeal.setText("0");
        jTextField_Humburger.setText("0");
        jTextField_ChickenHum.setText("0");
        jTextField_ChickenTost.setText("0");
        jTextField_FishTost.setText("0");
        jTextField_Cheese.setText("0");
        jTextField_ChocolateMuffin.setText("0");
        jTextField_Pineapple.setText("0");
        jTextField_Pancakes.setText("0");
        jTextField_Strawberry.setText("0");
        jTextField_Vanilla.setText("0");
        jTextField_Chocolate.setText("0");
        jTextField_RedBull.setText("0");
        jTextField_Dueo.setText("0");
        jTextField_Water.setText("0");
        jTextField_Tea.setText("0");
        jTextField_Coffee.setText("0");
        jTextField_MilkTea.setText("0");
        jTextField_Peapsi.setText("0");
        jTextField_Cola.setText("0");
        jTextField_Sup.setText("0");
        jTextField_Niscaffee.setText("0");
        //=========================================================
        jTextField_Cola.setEditable(false);
        //=========================================================
        //Tax
        Tax_TextField.setText(null);
        
        //SubTotal
        Sub_TextField.setText(null);
        
        //Payment Method
        Payment_TextField.setText(null);
        
        //Total
        Total_TextField.setText(null);
        
        
        
    }//GEN-LAST:event_Reset_ButtonActionPerformed
        // Only Let User Enter Intger Number Only
    private void jTextField_BushraEspicyMealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_BushraEspicyMealKeyTyped
        // Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }
        
    }//GEN-LAST:event_jTextField_BushraEspicyMealKeyTyped

    private void jTextField_BushraFamilyMealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_BushraFamilyMealKeyTyped
        // TODO add your handling code here:
        // Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }
    }//GEN-LAST:event_jTextField_BushraFamilyMealKeyTyped

    private void jTextField_ChickenBrostMealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChickenBrostMealKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ChickenBrostMealKeyTyped

    private void jTextField_MeatMealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MeatMealKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MeatMealKeyTyped

    private void jTextField_SaladMealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SaladMealKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SaladMealKeyTyped

    private void jTextField_HumburgerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_HumburgerKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_HumburgerKeyTyped

    private void jTextField_ChickenHumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChickenHumKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ChickenHumKeyTyped

    private void jTextField_ChickenTostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChickenTostKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ChickenTostKeyTyped

    private void jTextField_FishTostKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_FishTostKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FishTostKeyTyped

    private void jTextField_CheeseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CheeseKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CheeseKeyTyped

    private void jTextField_ChocolateMuffinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChocolateMuffinKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ChocolateMuffinKeyTyped

    private void jTextField_PineappleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PineappleKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PineappleKeyTyped

    private void jTextField_PancakesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PancakesKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PancakesKeyTyped

    private void jTextField_ChocolateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ChocolateKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ChocolateKeyTyped

    private void jTextField_StrawberryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_StrawberryKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_StrawberryKeyTyped

    private void jTextField_VanillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_VanillaKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_VanillaKeyTyped

    private void jTextField_WaterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_WaterKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_WaterKeyTyped

    private void jTextField_PeapsiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_PeapsiKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_PeapsiKeyTyped

    private void jTextField_ColaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ColaKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_ColaKeyTyped

    private void jTextField_SupKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_SupKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SupKeyTyped

    private void jTextField_RedBullKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_RedBullKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_RedBullKeyTyped

    private void jTextField_DueoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_DueoKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DueoKeyTyped

    private void jTextField_TeaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TeaKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TeaKeyTyped

    private void jTextField_CoffeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CoffeeKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_CoffeeKeyTyped

    private void jTextField_MilkTeaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MilkTeaKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_MilkTeaKeyTyped

    private void jTextField_NiscaffeeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NiscaffeeKeyTyped
// Only Let User Enter Intger Number Only
        char iN = evt.getKeyChar();
        
        if(!(Character.isDigit(iN)) || (iN == KeyEvent.VK_BACK_SPACE) || (iN == KeyEvent.VK_DELETE))
        {
        evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NiscaffeeKeyTyped






// Enable TextFeild Only When The User Check The CheckBox 
    
    private void jCheckBox_BushraEspicyMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_BushraEspicyMealActionPerformed
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_BushraEspicyMeal.isSelected())
        {
            jTextField_BushraEspicyMeal.setEnabled(true);
            jTextField_BushraEspicyMeal.requestFocus();
            jTextField_BushraEspicyMeal.setText("1");
        }
        else
        {
            jTextField_BushraEspicyMeal.setEnabled(false);
            jTextField_BushraEspicyMeal.setText("0");
        }
    }//GEN-LAST:event_jCheckBox_BushraEspicyMealActionPerformed

    private void jCheckBox_BushraFamilyMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_BushraFamilyMealActionPerformed
        // TODO add your handling code here:                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_BushraFamilyMeal.isSelected())
        {
            jTextField_BushraFamilyMeal.setEnabled(true);
            jTextField_BushraFamilyMeal.requestFocus();
            jTextField_BushraFamilyMeal.setText("1");
            
        }
        else
        {
            jTextField_BushraFamilyMeal.setEnabled(false);
            
            jTextField_BushraFamilyMeal.setText("0");
        }
    }//GEN-LAST:event_jCheckBox_BushraFamilyMealActionPerformed

    private void jCheckBox_ChickenBrostMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ChickenBrostMealActionPerformed
        // TODO add your handling code here:                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_ChickenBrostMeal.isSelected())
        {
            jTextField_ChickenBrostMeal.setEnabled(true);
            jTextField_ChickenBrostMeal.requestFocus();
            jTextField_ChickenBrostMeal.setText("1");
        }
        else
        {
            jTextField_ChickenBrostMeal.setEnabled(false);
            jTextField_ChickenBrostMeal.setText("0");
        }
    }//GEN-LAST:event_jCheckBox_ChickenBrostMealActionPerformed

    private void jCheckBox_MeatMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_MeatMealActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_MeatMeal.isSelected())
        {
            jTextField_MeatMeal.setEnabled(true);
            jTextField_MeatMeal.requestFocus();
            jTextField_MeatMeal.setText("1");
        }
        else
        {
            jTextField_MeatMeal.setEnabled(false);
            jTextField_MeatMeal.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_MeatMealActionPerformed

    private void jCheckBox_SaladMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_SaladMealActionPerformed
                                                   
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_SaladMeal.isSelected())
        {
            jTextField_SaladMeal.setEnabled(true);
            jTextField_SaladMeal.requestFocus();
            jTextField_SaladMeal.setText("1");
        }
        else
        {
            jTextField_SaladMeal.setEnabled(false);
            jTextField_SaladMeal.setText("0");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_SaladMealActionPerformed

    private void jCheckBox_HumburgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_HumburgerActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Humburger.isSelected())
        {
            jTextField_Humburger.setEnabled(true);
            jTextField_Humburger.requestFocus();
            jTextField_Humburger.setText("1");
        }
        else
        {
            jTextField_Humburger.setEnabled(false);
            jTextField_Humburger.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_HumburgerActionPerformed

    private void jCheckBox_ChickenHumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ChickenHumActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_ChickenHum.isSelected())
        {
            jTextField_ChickenHum.setEnabled(true);
            jTextField_ChickenHum.requestFocus();
            jTextField_ChickenHum.setText("1");
        }
        else
        {
            jTextField_ChickenHum.setEnabled(false);
            jTextField_ChickenHum.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_ChickenHumActionPerformed

    private void jCheckBox_ChickenTostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ChickenTostActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_ChickenTost.isSelected())
        {
            jTextField_ChickenTost.setEnabled(true);
            jTextField_ChickenTost.requestFocus();
            jTextField_ChickenTost.setText("1");
        }
        else
        {
            jTextField_ChickenTost.setEnabled(false);
            jTextField_ChickenTost.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_ChickenTostActionPerformed

    private void jCheckBox_FishTostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_FishTostActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_FishTost.isSelected())
        {
            jTextField_FishTost.setEnabled(true);
            jTextField_FishTost.requestFocus();
            jTextField_FishTost.setText("1");
        }
        else
        {
            jTextField_FishTost.setEnabled(false);
            jTextField_FishTost.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_FishTostActionPerformed

    private void jCheckBox_CheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_CheeseActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Cheese.isSelected())
        {
            jTextField_Cheese.setEnabled(true);
            jTextField_Cheese.requestFocus();
            jTextField_Cheese.setText("1");
        }
        else
        {
            jTextField_Cheese.setEnabled(false);
            jTextField_Cheese.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_CheeseActionPerformed

    private void jCheckBox_ChocolateMuffinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ChocolateMuffinActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_ChocolateMuffin.isSelected())
        {
            jTextField_ChocolateMuffin.setEnabled(true);
            jTextField_ChocolateMuffin.requestFocus();
            jTextField_ChocolateMuffin.setText("1");
        }
        else
        {
            jTextField_ChocolateMuffin.setEnabled(false);
            jTextField_ChocolateMuffin.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_ChocolateMuffinActionPerformed

    private void jCheckBox_PineappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_PineappleActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Pineapple.isSelected())
        {
            jTextField_Pineapple.setEnabled(true);
            jTextField_Pineapple.requestFocus();
            jTextField_Pineapple.setText("1");
        }
        else
        {
            jTextField_Pineapple.setEnabled(false);
            jTextField_Pineapple.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_PineappleActionPerformed

    private void jCheckBox_PancakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_PancakesActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Pancakes.isSelected())
        {
            jTextField_Pancakes.setEnabled(true);
            jTextField_Pancakes.requestFocus();
            jTextField_Pancakes.setText("1");
        }
        else
        {
            jTextField_Pancakes.setEnabled(false);
            jTextField_Pancakes.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_PancakesActionPerformed

    private void jCheckBox_ChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ChocolateActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Chocolate.isSelected())
        {
            jTextField_Chocolate.setEnabled(true);
            jTextField_Chocolate.requestFocus();
            jTextField_Chocolate.setText("1");
        }
        else
        {
            jTextField_Chocolate.setEnabled(false);
            jTextField_Chocolate.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_ChocolateActionPerformed

    private void jCheckBox_StrawberryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_StrawberryActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Strawberry.isSelected())
        {
            jTextField_Strawberry.setEnabled(true);
            jTextField_Strawberry.requestFocus();
            jTextField_Strawberry.setText("1");
        }
        else
        {
            jTextField_Strawberry.setEnabled(false);
            jTextField_Strawberry.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_StrawberryActionPerformed

    private void jCheckBox_VanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_VanillaActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Vanilla.isSelected())
        {
            jTextField_Vanilla.setEnabled(true);
            jTextField_Vanilla.requestFocus();
            jTextField_Vanilla.setText("1");
        }
        else
        {
            jTextField_Vanilla.setEnabled(false);
            jTextField_Vanilla.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_VanillaActionPerformed

    private void jCheckBox_WaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_WaterActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Water.isSelected())
        {
            jTextField_Water.setEnabled(true);
            jTextField_Water.requestFocus();
            jTextField_Water.setText("1");
        }
        else
        {
            jTextField_Water.setEnabled(false);
            jTextField_Water.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_WaterActionPerformed

    private void jCheckBox_PeapsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_PeapsiActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Peapsi.isSelected())
        {
            jTextField_Peapsi.setEnabled(true);
            jTextField_Peapsi.requestFocus();
            jTextField_Peapsi.setText("1");
        }
        else
        {
            jTextField_Peapsi.setEnabled(false);
            jTextField_Peapsi.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_PeapsiActionPerformed

    private void jCheckBox_ColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_ColaActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Cola.isSelected())
        {
            jTextField_Cola.setEnabled(true);
            jTextField_Cola.requestFocus();
            jTextField_Cola.setText("1");
        }
        else
        {
            jTextField_Cola.setEnabled(false);
            jTextField_Cola.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_ColaActionPerformed

    private void jCheckBox_SupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_SupActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Sup.isSelected())
        {
            jTextField_Sup.setEnabled(true);
            jTextField_Sup.requestFocus();
            jTextField_Sup.setText("1");
        }
        else
        {
            jTextField_Sup.setEnabled(false);
            jTextField_Sup.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_SupActionPerformed

    private void jCheckBox_RedBullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_RedBullActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_RedBull.isSelected())
        {
            jTextField_RedBull.setEnabled(true);
            jTextField_RedBull.requestFocus();
            jTextField_RedBull.setText("1");
        }
        else
        {
            jTextField_RedBull.setEnabled(false);
            
            jTextField_RedBull.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_RedBullActionPerformed

    private void jCheckBox_DueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_DueoActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Dueo.isSelected())
        {
            jTextField_Dueo.setEnabled(true);
            jTextField_Dueo.requestFocus();
            jTextField_Dueo.setText("1");
        }
        else
        {
            jTextField_Dueo.setEnabled(false);
            jTextField_Dueo.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_DueoActionPerformed

    private void jCheckBox_TeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_TeaActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Tea.isSelected())
        {
            jTextField_Tea.setEnabled(true);
            jTextField_Tea.requestFocus();
            jTextField_Tea.setText("1");
        }
        else
        {
            jTextField_Tea.setEnabled(false);
            jTextField_Tea.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_TeaActionPerformed

    private void jCheckBox_CoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_CoffeeActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Coffee.isSelected())
        {
            jTextField_Coffee.setEnabled(true);
            jTextField_Coffee.requestFocus();
            jTextField_Coffee.setText("1");
        }
        else
        {
            jTextField_Coffee.setEnabled(false);
            jTextField_Coffee.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_CoffeeActionPerformed

    private void jCheckBox_MilkTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_MilkTeaActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_MilkTea.isSelected())
        {
            jTextField_MilkTea.setEnabled(true);
            jTextField_MilkTea.requestFocus();
            jTextField_MilkTea.setText("1");
        }
        else
        {
            jTextField_MilkTea.setEnabled(false);
            jTextField_MilkTea.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_MilkTeaActionPerformed

    private void jCheckBox_NiscaffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_NiscaffeeActionPerformed
                                           
        // Enable TextFeild Only When The User Check The CheckBox Only
        if(jCheckBox_Niscaffee.isSelected())
        {
            jTextField_Niscaffee.setEnabled(true);
            jTextField_Niscaffee.requestFocus();
            jTextField_Niscaffee.setText("1");
        }
        else
        {
            jTextField_Niscaffee.setEnabled(false);
            jTextField_Niscaffee.setText("0");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_NiscaffeeActionPerformed

    private void Total_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_ButtonActionPerformed
        
    
        
        
        
        
    }//GEN-LAST:event_Total_ButtonActionPerformed
    
    
    
    /*** @param args the command line arguments*/
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
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField COUNTER;
    private javax.swing.JButton Exit_Button;
    private javax.swing.JComboBox<String> PayMentMethodComboBox;
    private javax.swing.JTextField Payment_TextField;
    private javax.swing.JButton Reset_Button;
    private javax.swing.JTextField Sub_TextField;
    private javax.swing.JTextField Tax_TextField;
    private javax.swing.JButton Total_Button;
    private javax.swing.JTextField Total_TextField;
    private javax.swing.JCheckBox jCheckBox_BushraEspicyMeal;
    private javax.swing.JCheckBox jCheckBox_BushraFamilyMeal;
    private javax.swing.JCheckBox jCheckBox_Cheese;
    private javax.swing.JCheckBox jCheckBox_ChickenBrostMeal;
    private javax.swing.JCheckBox jCheckBox_ChickenHum;
    private javax.swing.JCheckBox jCheckBox_ChickenTost;
    private javax.swing.JCheckBox jCheckBox_Chocolate;
    private javax.swing.JCheckBox jCheckBox_ChocolateMuffin;
    private javax.swing.JCheckBox jCheckBox_Coffee;
    private javax.swing.JCheckBox jCheckBox_Cola;
    private javax.swing.JCheckBox jCheckBox_Dueo;
    private javax.swing.JCheckBox jCheckBox_FishTost;
    private javax.swing.JCheckBox jCheckBox_Humburger;
    private javax.swing.JCheckBox jCheckBox_MeatMeal;
    private javax.swing.JCheckBox jCheckBox_MilkTea;
    private javax.swing.JCheckBox jCheckBox_Niscaffee;
    private javax.swing.JCheckBox jCheckBox_Pancakes;
    private javax.swing.JCheckBox jCheckBox_Peapsi;
    private javax.swing.JCheckBox jCheckBox_Pineapple;
    private javax.swing.JCheckBox jCheckBox_RedBull;
    private javax.swing.JCheckBox jCheckBox_SaladMeal;
    private javax.swing.JCheckBox jCheckBox_Strawberry;
    private javax.swing.JCheckBox jCheckBox_Sup;
    private javax.swing.JCheckBox jCheckBox_Tea;
    private javax.swing.JCheckBox jCheckBox_Vanilla;
    private javax.swing.JCheckBox jCheckBox_Water;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField_BushraEspicyMeal;
    private javax.swing.JTextField jTextField_BushraFamilyMeal;
    private javax.swing.JTextField jTextField_Cheese;
    private javax.swing.JTextField jTextField_ChickenBrostMeal;
    private javax.swing.JTextField jTextField_ChickenHum;
    private javax.swing.JTextField jTextField_ChickenTost;
    private javax.swing.JTextField jTextField_Chocolate;
    private javax.swing.JTextField jTextField_ChocolateMuffin;
    private javax.swing.JTextField jTextField_Coffee;
    private javax.swing.JTextField jTextField_Cola;
    private javax.swing.JTextField jTextField_Dueo;
    private javax.swing.JTextField jTextField_FishTost;
    private javax.swing.JTextField jTextField_Humburger;
    private javax.swing.JTextField jTextField_MeatMeal;
    private javax.swing.JTextField jTextField_MilkTea;
    private javax.swing.JTextField jTextField_Niscaffee;
    private javax.swing.JTextField jTextField_Pancakes;
    private javax.swing.JTextField jTextField_Peapsi;
    private javax.swing.JTextField jTextField_Pineapple;
    private javax.swing.JTextField jTextField_RedBull;
    private javax.swing.JTextField jTextField_SaladMeal;
    private javax.swing.JTextField jTextField_Strawberry;
    private javax.swing.JTextField jTextField_Sup;
    private javax.swing.JTextField jTextField_Tea;
    private javax.swing.JTextField jTextField_Vanilla;
    private javax.swing.JTextField jTextField_Water;
    // End of variables declaration//GEN-END:variables
}
