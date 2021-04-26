import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Game2 extends javax.swing.JFrame {
   
    public Game2() {
       
        initComponents();
        scaleImage("/Users/stasia.gus/Desktop/defaultPeng.png");
    }
public void scaleImage(String url){
    ImageIcon icon = new ImageIcon(url);
    Image img = icon.getImage();
    Image imgScale = img.getScaledInstance(560,330 ,Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    picLabel.setIcon(scaledIcon);
}
    @SuppressWarnings("unchecked")
                        
    private void initComponents() {

        questionPanel = new javax.swing.JPanel();
        bxQuestion2 = new javax.swing.JTextField();
        questionText = new javax.swing.JLabel();
        cQuestion2 = new javax.swing.JTextField();
        bxQuestion1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cQuestion1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        newQuestion = new javax.swing.JButton();
        picPanel = new javax.swing.JPanel();
        picLabel = new javax.swing.JLabel();
        answerPanel = new javax.swing.JPanel();
        enterAnswer = new javax.swing.JButton();
        backGame2 = new javax.swing.JButton();
        answerText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        axAnswer = new javax.swing.JTextField();
        bxAnswer = new javax.swing.JTextField();
        cxAnswer = new javax.swing.JTextField();
        errorGame2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        questionPanel.setBackground(new java.awt.Color(228, 241, 254));

        bxQuestion2.setEditable(false);
        bxQuestion2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); 
        bxQuestion2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bxQuestion2.setText("bx");

        questionText.setFont(new java.awt.Font("Arial", 0, 36)); 
        questionText.setForeground(new java.awt.Color(241, 130, 141));
        questionText.setText("Question:");

        cQuestion2.setEditable(false);
        cQuestion2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); 
        cQuestion2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cQuestion2.setText("C");


        bxQuestion1.setEditable(false);
        bxQuestion1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); 
        bxQuestion1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bxQuestion1.setText("bx");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 36)); 
        jLabel6.setText("(");

        cQuestion1.setEditable(false);
        cQuestion1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); 
        cQuestion1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cQuestion1.setText("C");
  

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 36)); 
        jLabel7.setText(")");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 36)); 
        jLabel8.setText("*");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 36)); 
        jLabel9.setText("(");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 36)); 
        jLabel10.setText("*");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 36)); 
        jLabel11.setText(")");

        newQuestion.setText("Press here for new question");
        newQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newQuestionMouseClicked(evt);
            }
        });
      

        javax.swing.GroupLayout questionPanelLayout = new javax.swing.GroupLayout(questionPanel);
        questionPanel.setLayout(questionPanelLayout);
        questionPanelLayout.setHorizontalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bxQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bxQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(questionPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(questionText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addGap(78, 78, 78))
        );
        questionPanelLayout.setVerticalGroup(
            questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questionText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(questionPanelLayout.createSequentialGroup()
                        .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bxQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(bxQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionPanelLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGroup(questionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        javax.swing.GroupLayout picPanelLayout = new javax.swing.GroupLayout(picPanel);
        picPanel.setLayout(picPanelLayout);
        picPanelLayout.setHorizontalGroup(
            picPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        picPanelLayout.setVerticalGroup(
            picPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, picPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        answerPanel.setBackground(new java.awt.Color(228, 241, 254));

        enterAnswer.setText("enter");
        enterAnswer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterAnswerMouseClicked(evt);
            }
        });

        backGame2.setText("back");
        backGame2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backGame2MouseClicked(evt);
            }
        });

        answerText.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        answerText.setForeground(new java.awt.Color(241, 130, 141));
        answerText.setText("Answer:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel4.setText("+");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel5.setText("+");

        axAnswer.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        axAnswer.setText("ax^2");
     

        bxAnswer.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        bxAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bxAnswer.setText("bx");

        cxAnswer.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        cxAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cxAnswer.setText("C");
      

        errorGame2.setEditable(false);
        errorGame2.setBackground(new java.awt.Color(228, 241, 254));
        errorGame2.setForeground(new java.awt.Color(255, 102, 102));
        errorGame2.setBorder(null);

        javax.swing.GroupLayout answerPanelLayout = new javax.swing.GroupLayout(answerPanel);
        answerPanel.setLayout(answerPanelLayout);
        answerPanelLayout.setHorizontalGroup(
            answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answerPanelLayout.createSequentialGroup()
                .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(answerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backGame2)
                        .addGap(45, 45, 45)
                        .addComponent(errorGame2))
                    .addGroup(answerPanelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(axAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(answerText)
                            .addGroup(answerPanelLayout.createSequentialGroup()
                                .addComponent(bxAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cxAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(52, 52, 52)
                .addComponent(enterAnswer)
                .addContainerGap())
        );
        answerPanelLayout.setVerticalGroup(
            answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(answerText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(answerPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerPanelLayout.createSequentialGroup()
                        .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(axAnswer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bxAnswer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(answerPanelLayout.createSequentialGroup()
                        .addComponent(cxAnswer)
                        .addGap(6, 6, 6)))
                .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterAnswer)
                    .addComponent(backGame2)
                    .addComponent(errorGame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(picPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(answerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(questionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(questionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(answerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }                                        

    private void enterAnswerMouseClicked(java.awt.event.MouseEvent evt) {                                         
        //axAnswer
        //bxAnswer
        //cAnswer
        
        //removes x from the bs
        String bx1 = bxQuestion1.getText();
        bx1 = bx1.substring(0, bx1.length() - 1);
        int b1 = Integer.parseInt(bx1);
        
        String bx2 = bxQuestion2.getText();
        bx2 = bx2.substring(0, bx2.length() - 1);
        int b2 = Integer.parseInt(bx2);
        
        String cx1 = cQuestion1.getText();
        int c1 = Integer.parseInt(cx1);
        
        String cx2 = cQuestion2.getText();
        int c2 = Integer.parseInt(cx2);
        
        String aAnswer = (b1*b2) + "x^2";
        String bAnswer = ((c1*b2) + (b1*c2)) + "x";
        String cAnswer = (c1 * c2)+"";
        
        if(!(axAnswer.getText().equals(aAnswer))){
            errorGame2.setText("The ax^2 value is wrong");
            scaleImage("/Users/stasia.gus/Desktop/penguin/1missPeng.png");
        
        }
        else if(!(bxAnswer.getText().equals(bAnswer))){
            errorGame2.setText("The b value is wrong"); 
            scaleImage("/Users/stasia.gus/Desktop/2missPeng.png");
            
        }
        else if(!(cxAnswer.getText().equals(cAnswer))){
            errorGame2.setText("The c value is wrong");  
            scaleImage("/Users/stasia.gus/Desktop/penguin/3missPeng.png");
        }
        else{
            errorGame2.setText("Correct!Press button to get a new question!");
            scaleImage("/Users/stasia.gus/Desktop/defaultPeng.png");
        }
        
        
    }                                        

    private void newQuestionMouseClicked(java.awt.event.MouseEvent evt) {                                         
        int n = (int)Math.floor(Math.random()*(10-1+1)+1);
        String str = String.valueOf(n);
        bxQuestion1.setText(str + "x");
        
        int n1 = (int)Math.floor(Math.random()*(10-1+1)+1);
        String str1 = String.valueOf(n1);
        cQuestion1.setText(str1);
        
        int n2 = (int)Math.floor(Math.random()*(10-1+1)+1);
        String str2 = String.valueOf(n2);
        bxQuestion2.setText(str2 +"x");
        
        int n3 = (int)Math.floor(Math.random()*(10-1+1)+1);
        String str3 = String.valueOf(n3);
        cQuestion2.setText(str3);
    }                                        

    private void backGame2MouseClicked(java.awt.event.MouseEvent evt) {                                       
        TopicListPage gcf = new TopicListPage();
        gcf.setVisible(true);
        gcf.pack();
        gcf.setLocationRelativeTo(null);
        gcf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }                                      


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new Game2().setVisible(true);
            }
        });
    }

                      
    private javax.swing.JPanel answerPanel;
    private javax.swing.JLabel answerText;
    private javax.swing.JTextField axAnswer;
    private javax.swing.JButton backGame2;
    private javax.swing.JTextField bxAnswer;
    private javax.swing.JTextField bxQuestion1;
    private javax.swing.JTextField bxQuestion2;
    private javax.swing.JTextField cQuestion1;
    private javax.swing.JTextField cQuestion2;
    private javax.swing.JTextField cxAnswer;
    private javax.swing.JButton enterAnswer;
    private javax.swing.JTextField errorGame2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton newQuestion;
    private javax.swing.JLabel picLabel;
    private javax.swing.JPanel picPanel;
    private javax.swing.JPanel questionPanel;
    private javax.swing.JLabel questionText;
                  
}



