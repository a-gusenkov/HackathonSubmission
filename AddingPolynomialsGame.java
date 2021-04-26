import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class AddingPolynomialsGame extends javax.swing.JDialog {

    public AddingPolynomialsGame() {
        
        initComponents();
        scaleImage("/Users/stasia.gus/Desktop/defaultPeng.png");
    }

    public void scaleImage(String url){
    ImageIcon icon = new ImageIcon(url);
    Image img = icon.getImage();
    Image imgScale = img.getScaledInstance(460,230 ,Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    picLabel.setIcon(scaledIcon);
}
    @SuppressWarnings("unchecked")                         
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        picLabel = new javax.swing.JLabel();
        backGame1 = new javax.swing.JToggleButton();
        cx1 = new javax.swing.JTextField();
        bx2 = new javax.swing.JTextField();
        cx2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bxAnswer = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        newQGame1 = new javax.swing.JToggleButton();
        bx1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cxAnswer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        errorGame1 = new javax.swing.JTextField();
        enterGame1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(228, 241, 254));

        backGame1.setText("back");
        backGame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backGame1MouseClicked(evt);
            }
        });

        cx1.setEditable(false);
        cx1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cx1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cx1.setText("c");

        bx2.setEditable(false);
        bx2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        bx2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bx2.setText("bx");

        cx2.setEditable(false);
        cx2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cx2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cx2.setText("c");
        cx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cx2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("+");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("+");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setText("+");

        bxAnswer.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        bxAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bxAnswer.setText("bx");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 153));
        jLabel4.setText("Add the Binomials");

        newQGame1.setText("Click for New Question");
        newQGame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newQGame1MouseClicked(evt);
            }
        });

        bx1.setEditable(false);
        bx1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        bx1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bx1.setText("bx");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setText("+");

        cxAnswer.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cxAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cxAnswer.setText("c");

        jLabel6.setText("     Put it in the (bx+c) form");

        errorGame1.setEditable(false);
        errorGame1.setBackground(new java.awt.Color(228, 241, 254));
        errorGame1.setForeground(new java.awt.Color(255, 102, 102));
        errorGame1.setBorder(null);

        enterGame1.setText("enter");
        enterGame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterGame1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newQGame1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backGame1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(bx1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(cx1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(bx2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                        .addComponent(cx2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bxAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cxAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errorGame1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(537, Short.MAX_VALUE)
                    .addComponent(enterGame1)
                    .addGap(10, 10, 10)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(newQGame1)
                        .addGap(75, 75, 75)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bx2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cx1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cx2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(bx1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bxAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cxAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(errorGame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(backGame1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(490, Short.MAX_VALUE)
                    .addComponent(enterGame1)
                    .addGap(16, 16, 16)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void backGame1MouseClicked(java.awt.event.MouseEvent evt) {                                       
        TopicListPage gcf = new TopicListPage();
        gcf.setVisible(true);
        gcf.pack();
        gcf.setLocationRelativeTo(null);
        gcf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }                                      

    private void newQGame1MouseClicked(java.awt.event.MouseEvent evt) {                                       
        int n = (int)Math.floor(Math.random()*(10-1+1)+1);
        String str = String.valueOf(n);
        bx1.setText(str + "x");
        
        int n1 = (int)Math.floor(Math.random()*(10-1+1)+1);
        String str1 = String.valueOf(n1);
        cx1.setText(str1);
        
        int n2 = (int)Math.floor(Math.random()*(10-1+1)+1);
        String str2 = String.valueOf(n2);
        bx2.setText(str2 +"x");
        
        int n3 = (int)Math.floor(Math.random()*(10-1+1)+1);
        String str3 = String.valueOf(n3);
        cx2.setText(str3);
    }                                      

    private void enterGame1MouseClicked(java.awt.event.MouseEvent evt) {                                        
       
        String ba1 = bx1.getText();
        ba1 = ba1.substring(0, ba1.length() - 1);
        int b1 = Integer.parseInt(ba1);
        
        String ba2 = bx2.getText();
        ba2 = ba2.substring(0, ba2.length() - 1);
        int b2 = Integer.parseInt(ba2);
        
        String ca1 = cx1.getText();
        int c1 = Integer.parseInt(ca1);
        
        String ca2 = cx2.getText();
        int c2 = Integer.parseInt(ca2);
        
        String bAnswer = (b1 + b2) + "x";
        String cAnswer = (c1 + c2)+"";
        
         if(!(bxAnswer.getText().equals(bAnswer))){
            errorGame1.setText("The b value is wrong"); 
            scaleImage("/Users/stasia.gus/Desktop/2missPeng.png");
            
        }
        else if(!(cxAnswer.getText().equals(cAnswer))){
            errorGame1.setText("The c value is wrong");  
            scaleImage("/Users/stasia.gus/Desktop/penguin/3missPeng.png");
        }
        else{
            errorGame1.setText("Correct!Press button to get a new question!");
            scaleImage("/Users/stasia.gus/Desktop/defaultPeng.png");
        }
    }                                       

    private void cx2ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                                   

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddingPolynomialsGame dialog = new AddingPolynomialsGame();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }                     
    private javax.swing.JToggleButton backGame1;
    private javax.swing.JTextField bx1;
    private javax.swing.JTextField bx2;
    private javax.swing.JTextField bxAnswer;
    private javax.swing.JTextField cx1;
    private javax.swing.JTextField cx2;
    private javax.swing.JTextField cxAnswer;
    private javax.swing.JToggleButton enterGame1;
    private javax.swing.JTextField errorGame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton newQGame1;
    private javax.swing.JLabel picLabel;
                      
}