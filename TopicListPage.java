
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TopicListPage extends javax.swing.JFrame {
        

    public TopicListPage() {
        super();
        setTitle("Polynomial Games");
      
        initComponents();
        scaleImage("/Users/stasia.gus/Desktop/graphics/pfp.png", profileIcon);
        scaleImage("/Users/stasia.gus/Desktop/graphics/polynomial.png", addLabel);
        scaleImage("/Users/stasia.gus/Desktop/graphics/polynomial.png", multLabel);
        scaleImage("/Users/stasia.gus/Desktop/graphics/lockedTopic.png", hid1);
        scaleImage("/Users/stasia.gus/Desktop/graphics/lockedTopic.png", hid2);
        
    }

    
    public void scaleImage(String url,JLabel picLabel){
    ImageIcon icon = new ImageIcon(url);
    Image img = icon.getImage();
    Image imgScale = img.getScaledInstance(100,100 ,Image.SCALE_SMOOTH);
    ImageIcon scaledIcon = new ImageIcon(imgScale);
    picLabel.setIcon(scaledIcon);
    }
    
    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

        upperPanel = new javax.swing.JPanel();
        profileIcon = new javax.swing.JLabel();
        upText = new javax.swing.JLabel();
        centerPanel = new javax.swing.JPanel();
        addLabel = new javax.swing.JLabel();
        multLabel = new javax.swing.JLabel();
        adding = new javax.swing.JButton();
        multiplying = new javax.swing.JButton();
        hid1 = new javax.swing.JLabel();
        hid2 = new javax.swing.JLabel();
        lock1 = new javax.swing.JButton();
        lock2 = new javax.swing.JButton();
        lowerPanel = new javax.swing.JPanel();
        backTopic = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        upperPanel.setBackground(new java.awt.Color(228, 241, 254));

        upText.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        upText.setForeground(new java.awt.Color(255, 153, 153));
        upText.setText("Choose A Topic");

        javax.swing.GroupLayout upperPanelLayout = new javax.swing.GroupLayout(upperPanel);
        upperPanel.setLayout(upperPanelLayout);
        upperPanelLayout.setHorizontalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(upText, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upperPanelLayout.setVerticalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addGroup(upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upperPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(upText, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(upperPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(profileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        centerPanel.setBackground(new java.awt.Color(228, 241, 254));

        adding.setText("Adding");
        adding.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addingMouseClicked(evt);
            }
        });
 

        multiplying.setText("Multiplying");
        multiplying.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplyingMouseClicked(evt);
            }
        });
  

        javax.swing.GroupLayout centerPanelLayout = new javax.swing.GroupLayout(centerPanel);
        centerPanel.setLayout(centerPanelLayout);
        centerPanelLayout.setHorizontalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lock2))
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hid1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(centerPanelLayout.createSequentialGroup()
                                    .addComponent(adding)
                                    .addGap(18, 18, 18))
                                .addComponent(addLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(237, 237, 237)
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lock1)
                    .addComponent(multiplying)
                    .addComponent(hid2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        centerPanelLayout.setVerticalGroup(
            centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(centerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addComponent(multLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(centerPanelLayout.createSequentialGroup()
                                .addGap(29, 51, Short.MAX_VALUE)
                                .addComponent(hid2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lock1))
                            .addGroup(centerPanelLayout.createSequentialGroup()
                                .addGroup(centerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(centerPanelLayout.createSequentialGroup()
                                        .addComponent(multiplying)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centerPanelLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(hid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lock2)))
                                .addContainerGap())))
                    .addGroup(centerPanelLayout.createSequentialGroup()
                        .addComponent(addLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adding)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        lowerPanel.setBackground(new java.awt.Color(228, 241, 254));

        backTopic.setText("back");
        backTopic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backTopicMouseClicked(evt);
            }
        });
       

        javax.swing.GroupLayout lowerPanelLayout = new javax.swing.GroupLayout(lowerPanel);
        lowerPanel.setLayout(lowerPanelLayout);
        lowerPanelLayout.setHorizontalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backTopic)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lowerPanelLayout.setVerticalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(backTopic)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(upperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(centerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upperPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(centerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }                                   

    private void multiplyingMouseClicked(java.awt.event.MouseEvent evt) {                                         

        Game2 gcf = new Game2();
        gcf.setVisible(true);
        gcf.pack();
        gcf.setLocationRelativeTo(null);
        gcf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }                                        

    private void addingMouseClicked(java.awt.event.MouseEvent evt) {                                    
        AddingPolynomialsGame gcf = new AddingPolynomialsGame();
        gcf.setVisible(true);
        gcf.pack();
        gcf.setLocationRelativeTo(null);
        gcf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
      
    }                                   

    private void backTopicMouseClicked(java.awt.event.MouseEvent evt) {                                       
        WelcomePage wlc = new WelcomePage();
        wlc.setVisible(true);
        wlc.pack();
        wlc.setLocationRelativeTo(null);
        wlc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }                                      

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TopicListPage().setVisible(true);
            }
        });
    }

                   
    private javax.swing.JLabel addLabel;
    private javax.swing.JButton adding;
    private javax.swing.JButton backTopic;
    private javax.swing.JPanel centerPanel;
    private javax.swing.JLabel hid1;
    private javax.swing.JLabel hid2;
    private javax.swing.JButton lock1;
    private javax.swing.JButton lock2;
    private javax.swing.JPanel lowerPanel;
    private javax.swing.JLabel multLabel;
    private javax.swing.JButton multiplying;
    private javax.swing.JLabel profileIcon;
    private javax.swing.JLabel upText;
    private javax.swing.JPanel upperPanel;
                    
}
