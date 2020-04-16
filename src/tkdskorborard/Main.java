/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tkdskorborard;


import java.awt.Color;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.*;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;


/**
 *
 * @author semix
 */
import javax.swing.SwingConstants;


public class Main extends javax.swing.JFrame {
    
    
    
    static int redBar = 0;
    static int blueBar = 0;
    static int oynanacakRaound ;
    static int raoundNumber = 1;
    static String blueName;
    static String redName;
    static int redCeza = 0;
    static int generalSure = 0;
    static int sure = 0;
    static String timer = sure/60+":"+sure%60;
    static int blueCornerNumber = 0;
    static int redCornerNumber = 0;
    static int blueCeza = 0;
    static boolean state = false;
    
    JLabel blueCornerLabel = new JLabel(String.valueOf(blueCornerNumber),SwingConstants.CENTER);
    JLabel redCornerLabel = new JLabel(String.valueOf(redCornerNumber), SwingConstants.CENTER);
    JLabel raoundLabel = new JLabel("R" + String.valueOf(raoundNumber), SwingConstants.CENTER);
    JLabel altinVurusLabel = new JLabel("G",SwingConstants.CENTER);
    JLabel blueCezaLabel = new JLabel(String.valueOf(blueCeza), SwingConstants.CENTER);
    JLabel redCezaLabel = new JLabel(String.valueOf(redCeza), SwingConstants.CENTER);
    JLabel blueBarLabel = new JLabel(String.valueOf(blueBar), SwingConstants.CENTER);
    JLabel redBarLabel = new JLabel(String.valueOf(redBar), SwingConstants.CENTER);
    
    String bitirmeSesi = "korna.wav";
    Music music = new Music();
    
    public Main()   {
        initComponents();
        
        
        
        
         
        
      
        
        LineBorder cizgi = new LineBorder(Color.white);
       
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        this.setBackground(Color.black);
        this.getContentPane().setBackground(Color.black);
        this.setResizable(true);
        
        
        
        
        redCornerLabel.setOpaque(true);
        redCornerLabel.setBackground(Color.red);
        redCornerLabel.setForeground(Color.white);
        redCornerLabel.setFont(new Font("Serif", Font.PLAIN, 300));
        redCornerLabel.setBounds(50, this.getHeight()/4, this.getWidth()/3, this.getHeight()/2);
        redCornerLabel.setBorder(cizgi);
        this.add(redCornerLabel);
        
        
        
        blueCornerLabel.setOpaque(true);
        blueCornerLabel.setBackground(Color.blue);
        blueCornerLabel.setForeground(Color.white);
        blueCornerLabel.setFont(new Font("Serif", Font.PLAIN,300));
        blueCornerLabel.setBounds(this.getWidth()-(this.getWidth()/3+50), this.getHeight()/4, this.getWidth()/3, this.getHeight()/2);
        blueCornerLabel.setBorder(cizgi);
        this.add(blueCornerLabel);
        
        
       
        
        
        raoundLabel.setOpaque(true);
        raoundLabel.setBackground(Color.black);
        raoundLabel.setForeground(Color.yellow);
        raoundLabel.setFont(new Font("Serif", Font.PLAIN, 90));
        raoundLabel.setBounds(this.getWidth()/2 - (this.getWidth()/3)/8, this.getHeight()/2-this.getHeight()/6,  (this.getWidth()/3)/4, this.getHeight()/6);
        //raoundLabel.setBorder(cizgi);
        this.add(raoundLabel);
        
        
        JLabel timerLabel = new JLabel(timer, SwingConstants.CENTER);
        timerLabel.setOpaque(true);
        timerLabel.setBackground(Color.black);
        timerLabel.setForeground(Color.yellow);
        timerLabel.setFont(new Font("Serif", Font.PLAIN, 150));
        timerLabel.setBounds(this.getWidth()/2-(this.getWidth()-(this.getWidth()/3)*2-100)/2, this.getHeight()/2, this.getWidth()-(this.getWidth()/3)*2-100, this.getHeight()/6);
        //timerLabel.setBorder(cizgi);
        this.add(timerLabel);
        
        
        
        
        
        
        altinVurusLabel.setOpaque(true);
        altinVurusLabel.setText("OT");
        altinVurusLabel.setBackground(Color.black);
        altinVurusLabel.setForeground(Color.yellow);
        altinVurusLabel.setFont(new Font("Serif", Font.PLAIN, 85));
        altinVurusLabel.setBounds(this.getWidth()/2 - (this.getWidth()/3)/8,this.getHeight()/2-this.getHeight()/6, (this.getWidth()/3)/4, this.getHeight()/6);
        //altinVurusLabel.setBorder(cizgi);
        altinVurusLabel.setVisible(false);
        this.add(altinVurusLabel);
        
        
        
        redCezaLabel.setOpaque(true);
        redCezaLabel.setBackground(Color.red);
        redCezaLabel.setForeground(Color.white);
        redCezaLabel.setFont(new Font("Serif", Font.PLAIN, 100));
        redCezaLabel.setBounds(50, this.getHeight()/2+(this.getWidth()/3)/5*2, (this.getWidth()/3)/4, this.getHeight()/6);
        redCezaLabel.setBorder(cizgi);
        this.add(redCezaLabel);
        
        blueCezaLabel.setOpaque(true);
        blueCezaLabel.setBackground(Color.blue);
        blueCezaLabel.setForeground(Color.white);
        blueCezaLabel.setFont(new Font("Serif", Font.PLAIN, 100));
        blueCezaLabel.setBounds(this.getWidth()-(this.getWidth()/3+50), this.getHeight()/2+(this.getWidth()/3)/5*2, (this.getWidth()/3)/4, this.getHeight()/6);
        blueCezaLabel.setBorder(cizgi);
        this.add(blueCezaLabel);
        
        
        
        
        blueBarLabel.setOpaque(true);
        blueBarLabel.setBackground(Color.blue);
        blueBarLabel.setForeground(Color.white);
        blueBarLabel.setFont(new Font("Serif", Font.PLAIN, 100));
        blueBarLabel.setBounds(this.getWidth()-(this.getWidth()/3+50) + blueCezaLabel.getWidth() ,  this.getHeight()/2+(this.getWidth()/3)/5*2, (this.getWidth()/3)/4, this.getHeight()/6);
        blueBarLabel.setBorder( new LineBorder(Color.black));
        blueBarLabel.setVisible(false);
        this.add(blueBarLabel);
        
        
        redBarLabel.setOpaque(true);
        redBarLabel.setBackground(Color.red);
        redBarLabel.setForeground(Color.white);
        redBarLabel.setFont(new Font("Serif", Font.PLAIN, 100));
        redBarLabel.setBounds(50 + redCezaLabel.getWidth() ,  this.getHeight()/2+(this.getWidth()/3)/5*2, (this.getWidth()/3)/4, this.getHeight()/6);
        redBarLabel.setBorder( new LineBorder(Color.black));
        redBarLabel.setVisible(false);
        this.add(redBarLabel);
        
        
        
        
        
        
        
        
        
        
        JLabel redNameLabel = new JLabel(redName, SwingConstants.CENTER);
        redNameLabel.setOpaque(true);
        redNameLabel.setBackground(Color.red);
        redNameLabel.setBounds(50,this.getHeight()/4-redCornerLabel.getHeight()/6 , this.getWidth()/3 ,redCornerLabel.getHeight()/6);
        redNameLabel.setForeground(Color.white);
        redNameLabel.setFont(new Font("Sherif", Font.PLAIN, 50));
        redNameLabel.setBorder(cizgi);
        this.add(redNameLabel);
        
        
        JLabel blueNameLabel = new JLabel(blueName, SwingConstants.CENTER);
        blueNameLabel.setOpaque(true);
        blueNameLabel.setBackground(Color.blue);
        blueNameLabel.setBounds(this.getWidth()-(this.getWidth()/3+50),this.getHeight()/4-redCornerLabel.getHeight()/6 , this.getWidth()/3 ,redCornerLabel.getHeight()/6);
        blueNameLabel.setForeground(Color.white);
        blueNameLabel.setFont(new Font("Sherif", Font.PLAIN, 50));
        blueNameLabel.setBorder(cizgi);
        this.add(blueNameLabel);

        
        blue3.setBackground(Color.blue);
        blue3.setForeground(Color.white);
        blue3.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2, this.getHeight()/7 - blue3.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(blue3);
        
        blue2.setBackground(Color.blue);
        blue2.setForeground(Color.white);
        blue2.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2 + blue3.getWidth() + blue3.getWidth()/2, this.getHeight()/7 - blue2.getHeight()*2, blueNameLabel.getWidth()/8,  blueNameLabel.getHeight()/2);
        this.add(blue2);
        
        blue1.setBackground(Color.blue);
        blue1.setForeground(Color.white);
        blue1.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2 + blue3.getWidth() + blue3.getWidth()/2 + blue2.getWidth() + blue2.getWidth()/2, this.getHeight()/7 - blue1.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(blue1);
        
        blue4.setBackground(Color.blue);
        blue4.setForeground(Color.white);
        blue4.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2 - blue3.getWidth()- blue3.getWidth()/2, this.getHeight()/7 - blue4.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(blue4);
        
        blue5.setBackground(Color.blue);
        blue5.setForeground(Color.white);
        blue5.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2 - blue3.getWidth()- blue3.getWidth()/2 - blue4.getWidth()- blue4.getWidth()/2, this.getHeight()/7 - blue5.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(blue5);
   
        maviekleKaldir.setBackground(Color.blue);
        maviekleKaldir.setForeground(Color.white);
        maviekleKaldir.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2, this.getHeight()/7 - blue3.getHeight()*2 - blue3.getHeight(), blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(maviekleKaldir);
        
        
        red3.setBackground(Color.red);
        red3.setForeground(Color.white);
        red3.setBounds(redCornerLabel.getWidth()/2,  this.getHeight()/7 - blue3.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(red3);
        
        red2.setBackground(Color.red);
        red2.setForeground(Color.white);
        red2.setBounds(redCornerLabel.getWidth()/2 - red3.getWidth() - red2.getWidth()/2, this.getHeight()/7 - blue3.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(red2);
        
        red1.setBackground(Color.red);
        red1.setForeground(Color.white);
        red1.setBounds(redCornerLabel.getWidth()/2 - red3.getWidth() - red2.getWidth()/2 - red2.getWidth() - red1.getWidth()/2, this.getHeight()/7 - blue3.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(red1);
        
        red4.setBackground(Color.red);
        red4.setForeground(Color.white);
        red4.setBounds(redCornerLabel.getWidth()/2 + red3.getWidth() + red4.getWidth()/2, this.getHeight()/7 - blue3.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(red4);
        
        red5.setBackground(Color.red);
        red5.setForeground(Color.white);
        red5.setBounds(redCornerLabel.getWidth()/2 + red3.getWidth() + red4.getWidth()/2 + red4.getWidth() + red5.getWidth()/2, this.getHeight()/7 - blue3.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(red5);
        
        kırmızıekleKaldir.setBackground(Color.red);
        kırmızıekleKaldir.setForeground(Color.white);
        kırmızıekleKaldir.setBounds(redCornerLabel.getWidth()/2, this.getHeight()/7 - red3.getHeight()*2 - red3.getHeight() - red3.getHeight()/5, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(kırmızıekleKaldir);
        
        newmatch.setBounds(this.getWidth()/2 - (this.getWidth()/3)/8, 0, this.getWidth()/10, this.getHeight()/20);
        this.add(newmatch);
        
        newMatchFrame.setVisible(false);
        newMatchFrame.setBounds(this.getWidth()/2 - this.getWidth()/4, this.getHeight()/2 - this.getHeight()/4, this.getWidth()/2, this.getHeight()/2);
         
        redCezaButon.setBackground(Color.red);
        redCezaButon.setForeground(Color.white);
        redCezaButon.setBounds(this.getWidth()/3, this.getHeight() - this.getHeight()/6, blueNameLabel.getWidth()/8, blueNameLabel.getHeight());
        this.add(redCezaButon);
        
        blueCezaButon.setBackground(Color.blue);
        blueCezaButon.setForeground(Color.white);
        blueCezaButon.setBounds((int)blue1.getLocation().getX() ,  this.getHeight() - this.getHeight()/6, blueNameLabel.getWidth()/8, blueNameLabel.getHeight());
        this.add(blueCezaButon);
        
        redBarButton.setBackground(Color.red);
        redBarButton.setForeground(Color.white);
        redBarButton.setBounds(this.getWidth()/3 - redCezaButon.getWidth(), this.getHeight() - this.getHeight()/6, blueNameLabel.getWidth()/8, blueNameLabel.getHeight());
        redBarButton.setVisible(false);
        this.add(redBarButton);
        
        blueBarButton.setBackground(Color.blue);
        blueBarButton.setForeground(Color.white);
        blueBarButton.setBounds((int)blue1.getLocation().getX() - blueCezaButon.getWidth(),  this.getHeight() - this.getHeight()/6, blueNameLabel.getWidth()/8, blueNameLabel.getHeight());
        blueBarButton.setVisible(false);
        this.add(blueBarButton);
        
        
        
        baslatDurdur.setBackground(Color.yellow);
        baslatDurdur.setBounds(this.getWidth()/2-(this.getWidth()-(this.getWidth()/3)*2-100)/2, this.getHeight() / 5, this.getWidth()-(this.getWidth()/3)*2-100, blueCezaButon.getHeight());
        this.add(baslatDurdur);
        
        sureEkle.setBackground(Color.yellow);
        sureEkle.setBounds(this.getWidth() / 2 - SureRand.getWidth() - sureEkle.getWidth() - SureRand.getWidth()/2, this.getHeight() / 5 - baslatDurdur.getHeight() , blueCezaButon.getWidth(), blueCezaButon.getHeight()/2);
        this.add(sureEkle);
    
       sureSil.setBackground(Color.yellow);
       sureSil.setBounds(this.getWidth() / 2 - SureRand.getWidth() + sureSil.getWidth() + SureRand.getWidth()/2 , this.getHeight() / 5 - baslatDurdur.getHeight() , blueCezaButon.getWidth(), blueCezaButon.getHeight()/2);
        this.add(sureSil);
        
        
        SureRand.setBackground(Color.yellow);
        SureRand.setBounds(this.getWidth() / 2 - SureRand.getWidth(), this.getHeight() / 5 - baslatDurdur.getHeight(), blueCezaButon.getWidth() , blueCezaButon.getHeight()/2);
        this.add(SureRand);
        
        
        
       while(true){
           
           
           
           
           
           
           
           
          
           
           kazananBelirle();
           
 
           
           if(sure == 0 && generalSure > 0){
               
               music.PlayMusic(bitirmeSesi);
               sure = generalSure ;
               baslatDurdur.setSelected(false);
               state = false;
               baslatDurdur.setText(">");
               
               if(raoundNumber < oynanacakRaound){
                   raoundNumber++;
               }
               
               
           }
           
           raoundLabel.setText("R" + String.valueOf(raoundNumber));
           
           blueCezaLabel.setText(String.valueOf(blueCeza));
           redCezaLabel.setText(String.valueOf(redCeza));
          
           redBarLabel.setText(String.valueOf(redBar));
           blueBarLabel.setText(String.valueOf(blueBar));
           
           blueCornerLabel.setText(String.valueOf(blueCornerNumber));
           redCornerLabel.setText(String.valueOf(redCornerNumber));
           
           redNameLabel.setText(redName);
           blueNameLabel.setText(blueName);
           
           
           
           if(sure >= 10){
               
               if(sure%60 >= 10){
              timer = sure/60+":"+sure%60;
              timerLabel.setText(timer);
               }else if (sure%60 < 10 && sure/60 >=1 ) {
                   timer = sure/60+":0"+sure%60;
                   timerLabel.setText(timer);
                   
               }
           }else if(sure < 10 && generalSure >= 60){
             
            timer = sure/60+":0"+sure%60;
            timerLabel.setText(timer);
            
            
               
           }
           
           
           
           
           
           if(birdakika.isSelected()){
            birbucukdakika.setSelected(false);
            ikidakika.setSelected(false);
        }else if(birbucukdakika.isSelected()){
            birdakika.setSelected(false);
            ikidakika.setSelected(false);
        }else if(ikidakika.isSelected()){
            birdakika.setSelected(false);
            birbucukdakika.setSelected(false);
    }
          
           
          if(birRand.isSelected()){
             
            ikiRand.setSelected(false);
            ucRand.setSelected(false);
        }else if(ikiRand.isSelected()){
            birRand.setSelected(false);
            ucRand.setSelected(false);
        }else if(ucRand.isSelected()){
            birRand.setSelected(false);
            ikiRand.setSelected(false);
    } 
           
       }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newMatchFrame = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        redNameTextField = new javax.swing.JTextField();
        blueNameTextField = new javax.swing.JTextField();
        birdakika = new javax.swing.JCheckBox();
        birbucukdakika = new javax.swing.JCheckBox();
        ikidakika = new javax.swing.JCheckBox();
        newMatchOkeyButton = new javax.swing.JButton();
        birRand = new javax.swing.JCheckBox();
        ikiRand = new javax.swing.JCheckBox();
        ucRand = new javax.swing.JCheckBox();
        newmatch = new javax.swing.JButton();
        blue2 = new javax.swing.JButton();
        blue3 = new javax.swing.JButton();
        blue1 = new javax.swing.JButton();
        blue4 = new javax.swing.JButton();
        blue5 = new javax.swing.JButton();
        maviekleKaldir = new javax.swing.JToggleButton();
        red1 = new javax.swing.JButton();
        red2 = new javax.swing.JButton();
        red3 = new javax.swing.JButton();
        red4 = new javax.swing.JButton();
        red5 = new javax.swing.JButton();
        kırmızıekleKaldir = new javax.swing.JToggleButton();
        redCezaButon = new javax.swing.JButton();
        blueCezaButon = new javax.swing.JButton();
        baslatDurdur = new javax.swing.JToggleButton();
        sureSil = new javax.swing.JButton();
        sureEkle = new javax.swing.JButton();
        blueBarButton = new javax.swing.JButton();
        redBarButton = new javax.swing.JButton();
        SureRand = new javax.swing.JToggleButton();

        jLabel1.setText("Kırmızı Köşe İsim:");

        jLabel2.setText("Mavi Köşe İsim  :");

        blueNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueNameTextFieldActionPerformed(evt);
            }
        });

        birdakika.setText("1.00");

        birbucukdakika.setText("1.30");
        birbucukdakika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birbucukdakikaActionPerformed(evt);
            }
        });

        ikidakika.setText("2.00");

        newMatchOkeyButton.setText("Tamam");
        newMatchOkeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMatchOkeyButtonActionPerformed(evt);
            }
        });

        birRand.setText("1 ");

        ikiRand.setText("2");

        ucRand.setText("3");

        javax.swing.GroupLayout newMatchFrameLayout = new javax.swing.GroupLayout(newMatchFrame.getContentPane());
        newMatchFrame.getContentPane().setLayout(newMatchFrameLayout);
        newMatchFrameLayout.setHorizontalGroup(
            newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newMatchFrameLayout.createSequentialGroup()
                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(newMatchFrameLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(newMatchFrameLayout.createSequentialGroup()
                                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birdakika)
                                    .addComponent(birbucukdakika)
                                    .addComponent(ikidakika))
                                .addGap(37, 37, 37))
                            .addGroup(newMatchFrameLayout.createSequentialGroup()
                                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(92, 92, 92)))
                        .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newMatchFrameLayout.createSequentialGroup()
                                .addComponent(newMatchOkeyButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ikiRand)
                                .addComponent(birRand)
                                .addComponent(ucRand))))
                    .addGroup(newMatchFrameLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(174, 174, 174))
        );
        newMatchFrameLayout.setVerticalGroup(
            newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newMatchFrameLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(blueNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(redNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birdakika)
                    .addComponent(birRand))
                .addGap(18, 18, 18)
                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birbucukdakika)
                    .addComponent(ikiRand))
                .addGap(18, 18, 18)
                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ikidakika)
                    .addComponent(ucRand))
                .addGap(26, 26, 26)
                .addComponent(newMatchOkeyButton)
                .addGap(30, 30, 30))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        newmatch.setText("Yeni Maç");
        newmatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newmatchActionPerformed(evt);
            }
        });

        blue2.setText("2");
        blue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue2ActionPerformed(evt);
            }
        });

        blue3.setText("3");
        blue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue3ActionPerformed(evt);
            }
        });

        blue1.setText("1");
        blue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue1ActionPerformed(evt);
            }
        });

        blue4.setText("4");
        blue4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue4ActionPerformed(evt);
            }
        });

        blue5.setText("5");
        blue5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue5ActionPerformed(evt);
            }
        });

        maviekleKaldir.setText("+");
        maviekleKaldir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maviekleKaldirActionPerformed(evt);
            }
        });

        red1.setText("1");
        red1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red1ActionPerformed(evt);
            }
        });

        red2.setText("2");
        red2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red2ActionPerformed(evt);
            }
        });

        red3.setText("3");
        red3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red3ActionPerformed(evt);
            }
        });

        red4.setText("4");
        red4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red4ActionPerformed(evt);
            }
        });

        red5.setText("5");
        red5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red5ActionPerformed(evt);
            }
        });

        kırmızıekleKaldir.setText("+");
        kırmızıekleKaldir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kırmızıekleKaldirActionPerformed(evt);
            }
        });

        redCezaButon.setText("X");
        redCezaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCezaButonActionPerformed(evt);
            }
        });

        blueCezaButon.setText("X");
        blueCezaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueCezaButonActionPerformed(evt);
            }
        });

        baslatDurdur.setText(">");
        baslatDurdur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslatDurdurActionPerformed(evt);
            }
        });

        sureSil.setText("-");
        sureSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sureSilActionPerformed(evt);
            }
        });

        sureEkle.setText("+");
        sureEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sureEkleActionPerformed(evt);
            }
        });

        blueBarButton.setText("B");
        blueBarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueBarButtonActionPerformed(evt);
            }
        });

        redBarButton.setText("B");
        redBarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redBarButtonActionPerformed(evt);
            }
        });

        SureRand.setText("S");
        SureRand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SureRandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(newmatch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maviekleKaldir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(blue5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blue4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kırmızıekleKaldir)
                                .addGap(18, 18, 18)
                                .addComponent(red5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(redCezaButon)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(red4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sureEkle)
                                .addGap(18, 18, 18)
                                .addComponent(baslatDurdur))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(SureRand)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(red3)
                        .addGap(18, 18, 18)
                        .addComponent(red2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(red1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 51, Short.MAX_VALUE)
                        .addComponent(blue3)
                        .addGap(18, 18, 18)
                        .addComponent(blue2)
                        .addGap(28, 28, 28)
                        .addComponent(blue1)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(sureSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blueCezaButon)
                        .addGap(89, 89, 89))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(redBarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(blueBarButton)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blueBarButton)
                    .addComponent(redBarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newmatch)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(blue2)
                    .addComponent(blue3)
                    .addComponent(blue1)
                    .addComponent(blue4)
                    .addComponent(maviekleKaldir)
                    .addComponent(blue5))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(red1)
                    .addComponent(red2)
                    .addComponent(red3)
                    .addComponent(red4)
                    .addComponent(red5)
                    .addComponent(kırmızıekleKaldir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redCezaButon)
                    .addComponent(blueCezaButon)
                    .addComponent(baslatDurdur)
                    .addComponent(sureSil)
                    .addComponent(sureEkle))
                .addGap(5, 5, 5)
                .addComponent(SureRand))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void birbucukdakikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birbucukdakikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birbucukdakikaActionPerformed

    private void blueNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blueNameTextFieldActionPerformed

 
    
    
    
    
    private void newMatchOkeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMatchOkeyButtonActionPerformed
       
        if(birdakika.isSelected() || birbucukdakika.isSelected() || ikidakika.isSelected() ){
        
            if(birRand.isSelected() || ikiRand.isSelected() || ucRand.isSelected()){
            
        blueCornerNumber =0;
        redCornerNumber =0;
        altinVurusLabel.setVisible(false);
        raoundLabel.setVisible(true);
        blueCornerLabel.setForeground(Color.white);
        redCornerLabel.setForeground(Color.white);
        blueCeza = 0;
        redCeza = 0;
        blueBar =0;
        redBar = 0;
        redBarButton.setVisible(false);
        blueBarButton.setVisible(false);
        redBarLabel.setVisible(false);
        blueBarLabel.setVisible(false);
        raoundNumber =1;
        redName = redNameTextField.getText();
        blueName = blueNameTextField.getText();
        newMatchFrame.setVisible(false);
        
       
       
        if(birdakika.isSelected()){
            generalSure = 60;
            sure = 60;
        }else if(birbucukdakika.isSelected()){
            generalSure = 90;
            sure = 90;
        }else if(ikidakika.isSelected()){
            generalSure = 120;
            sure = 120;
        }
        
        if(birRand.isSelected()){
            oynanacakRaound = 1;
        }else if(ikiRand.isSelected()){
            oynanacakRaound = 2;
        }else if(ucRand.isSelected()){
            oynanacakRaound = 3;
        }
            }
        }
        
        
        
        
        
    }//GEN-LAST:event_newMatchOkeyButtonActionPerformed

    private void newmatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newmatchActionPerformed
        newMatchFrame.setVisible(true);
         blueNameTextField.setText("");
         redNameTextField.setText("");
        
       
    }//GEN-LAST:event_newmatchActionPerformed

    private void maviekleKaldirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maviekleKaldirActionPerformed
        if(maviekleKaldir.isSelected()){
            maviekleKaldir.setText("-");
            
        }else if(!maviekleKaldir.isSelected()){
            
            maviekleKaldir.setText("+");
        }
    }//GEN-LAST:event_maviekleKaldirActionPerformed

    private void blue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue1ActionPerformed
        
        if(!maviekleKaldir.isSelected()){
            maviPuanEkle(1);
         }else if(maviekleKaldir.isSelected()){
            maviPuanSil(1);
       }
        
    }//GEN-LAST:event_blue1ActionPerformed

    private void blue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue2ActionPerformed
       if(!maviekleKaldir.isSelected()){
           maviPuanEkle(2);
       }else if(maviekleKaldir.isSelected()){
            maviPuanSil(2);
       }
    }//GEN-LAST:event_blue2ActionPerformed

    private void blue3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue3ActionPerformed
        if(!maviekleKaldir.isSelected()){
           maviPuanEkle(3);
       }else if(maviekleKaldir.isSelected()){
            maviPuanSil(3);
       }
    }//GEN-LAST:event_blue3ActionPerformed

    private void blue4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue4ActionPerformed
         if(!maviekleKaldir.isSelected()){
           maviPuanEkle(4);
       }else if(maviekleKaldir.isSelected()){
            maviPuanSil(4);
       }
    }//GEN-LAST:event_blue4ActionPerformed

    private void blue5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue5ActionPerformed
        if(!maviekleKaldir.isSelected()){
           maviPuanEkle(5);
       }else if(maviekleKaldir.isSelected()){
            maviPuanSil(5);
       }
        
        
        
    }//GEN-LAST:event_blue5ActionPerformed

    private void red2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red2ActionPerformed
          if(!kırmızıekleKaldir.isSelected()){
           kirmiziPuanEkle(2);
       }else if(kırmızıekleKaldir.isSelected()){
            kirmiziPuanSil(2);
       }
    }//GEN-LAST:event_red2ActionPerformed

    private void kırmızıekleKaldirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kırmızıekleKaldirActionPerformed
        if(kırmızıekleKaldir.isSelected()){
            kırmızıekleKaldir.setText("-");
            
        }else if(!kırmızıekleKaldir.isSelected()){
            
            kırmızıekleKaldir.setText("+");
        }
    }//GEN-LAST:event_kırmızıekleKaldirActionPerformed

    private void red5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red5ActionPerformed
         if(!kırmızıekleKaldir.isSelected()){
           kirmiziPuanEkle(5);
       }else if(kırmızıekleKaldir.isSelected()){
            kirmiziPuanSil(5);
       }
    }//GEN-LAST:event_red5ActionPerformed

    private void red4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red4ActionPerformed
        if(!kırmızıekleKaldir.isSelected()){
           kirmiziPuanEkle(4);
       }else if(kırmızıekleKaldir.isSelected()){
            kirmiziPuanSil(4);
       }
    }//GEN-LAST:event_red4ActionPerformed

    private void red3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red3ActionPerformed
          if(!kırmızıekleKaldir.isSelected()){
           kirmiziPuanEkle(3);
       }else if(kırmızıekleKaldir.isSelected()){
            kirmiziPuanSil(3);
       }
    }//GEN-LAST:event_red3ActionPerformed

    private void red1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red1ActionPerformed
        
            if(!kırmızıekleKaldir.isSelected()){
                kirmiziPuanEkle(1);
            }else if(kırmızıekleKaldir.isSelected()){
                kirmiziPuanSil(1);
            }
            
        
            
    }//GEN-LAST:event_red1ActionPerformed

    private void redCezaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCezaButonActionPerformed
        
        if(!kırmızıekleKaldir.isSelected()){
            kirmiziCezaVer();
            
        }else if(kırmızıekleKaldir.isSelected()){
            kirmiziCezaSil();
            
        }
        
    }//GEN-LAST:event_redCezaButonActionPerformed

    private void blueCezaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueCezaButonActionPerformed
        if(!maviekleKaldir.isSelected()){
            maviCezaVer();
            
        }else if(maviekleKaldir.isSelected()){
            maviCezaSil();
            
        }
    }//GEN-LAST:event_blueCezaButonActionPerformed

    private void baslatDurdurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslatDurdurActionPerformed
     
        if(baslatDurdur.isSelected()){
           baslatDurdur.setText("=");
           
           state = true;
           
           Thread t = new Thread()
           {
           
               public void run(){
                   
                   for(;;){
                       
                       if(state == true){
                           
                           try{
                               
                               
                               
                               if(sure > 0){
                                   sure--;
                                   sleep(1000);
                               }
                               
                               
                           }catch(Exception e){
                               
                           }
                           
                           
                       }
                       else{
                           break;
                       }
                       
                       
                   }
                   
               }
           
           };
           t.start();
          
           
        }else if(!baslatDurdur.isSelected()){
            baslatDurdur.setText(">");
            
            state = false;
           
           
            
        }
        
    }//GEN-LAST:event_baslatDurdurActionPerformed

    private void sureEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sureEkleActionPerformed
    if(!SureRand.isSelected()){
        if(!SureRand.isSelected() && sure > 0){
            
            sure++;
            
    }  else if(SureRand.isSelected()){
        if(oynanacakRaound > raoundNumber){
        raoundNumber++;
        }
    }  
    }
    }//GEN-LAST:event_sureEkleActionPerformed

    private void sureSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sureSilActionPerformed
        
        if(!SureRand.isSelected() && sure > 0){
            
            sure--;
            
        }else if(SureRand.isSelected() && raoundNumber > 1){
            raoundNumber--;
        }
    }//GEN-LAST:event_sureSilActionPerformed

    private void redBarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redBarButtonActionPerformed
        if(!kırmızıekleKaldir.isSelected()){
            redBar++;
            
        }else if(kırmızıekleKaldir.isSelected()){
           if(redBar > 0){
            redBar--;
           }
        }
    }//GEN-LAST:event_redBarButtonActionPerformed

    private void blueBarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueBarButtonActionPerformed
        if(!maviekleKaldir.isSelected()){
            blueBar++;
            
        }else if(maviekleKaldir.isSelected()){
           if(blueBar > 0){
            blueBar--;
           }
        }    }//GEN-LAST:event_blueBarButtonActionPerformed

    private void SureRandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SureRandActionPerformed

        if(!SureRand.isSelected()){
            SureRand.setText("S");
            
        }else if(SureRand.isSelected()){
            SureRand.setText("R");
        }

    }//GEN-LAST:event_SureRandActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton SureRand;
    private javax.swing.JToggleButton baslatDurdur;
    private javax.swing.JCheckBox birRand;
    private javax.swing.JCheckBox birbucukdakika;
    private javax.swing.JCheckBox birdakika;
    private javax.swing.JButton blue1;
    private javax.swing.JButton blue2;
    private javax.swing.JButton blue3;
    private javax.swing.JButton blue4;
    private javax.swing.JButton blue5;
    private javax.swing.JButton blueBarButton;
    private javax.swing.JButton blueCezaButon;
    private javax.swing.JTextField blueNameTextField;
    private javax.swing.JCheckBox ikiRand;
    private javax.swing.JCheckBox ikidakika;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton kırmızıekleKaldir;
    private javax.swing.JToggleButton maviekleKaldir;
    private javax.swing.JFrame newMatchFrame;
    private javax.swing.JButton newMatchOkeyButton;
    private javax.swing.JButton newmatch;
    private javax.swing.JButton red1;
    private javax.swing.JButton red2;
    private javax.swing.JButton red3;
    private javax.swing.JButton red4;
    private javax.swing.JButton red5;
    private javax.swing.JButton redBarButton;
    private javax.swing.JButton redCezaButon;
    private javax.swing.JTextField redNameTextField;
    private javax.swing.JButton sureEkle;
    private javax.swing.JButton sureSil;
    private javax.swing.JCheckBox ucRand;
    // End of variables declaration//GEN-END:variables

    
    
  
    public  void startTime() {
 
    }
    
   
    public void pauseTime() {
        
    }
    
    public  void maviPuanEkle(int i ){
        
        blueCornerNumber += i;
        
      
    }

    public void maviPuanSil(int i){
        
        if(blueCornerNumber >= 0 + i){
        blueCornerNumber -= i ;
        }
    }
    
    
    public  void kirmiziPuanEkle(int i ){
        
        redCornerNumber += i;
        
      
    }

    public void kirmiziPuanSil(int i){
        
        if(redCornerNumber >= 0 + i){
        redCornerNumber -= i ;
        }
    }
        
        
    public void maviCezaVer(){
        
        if( blueCeza < 10){
            blueCeza += 1;
            redCornerNumber += 1;
        }
        
    }
        
       public void kirmiziCezaVer(){
        
        if( redCeza < 10){
            redCeza += 1;
            blueCornerNumber += 1;
        }
        
    } 
    
       
       public void maviCezaSil(){
           
           if(blueCeza > 0){
               blueCeza -= 1;
               redCornerNumber -= 1;
           }
           
       }
       
       public void kirmiziCezaSil(){
           
           if(redCeza > 0){
               redCeza -= 1;
               blueCornerNumber -= 1;
           }
           
       }

       public void kazananBelirle(){
           
           
           
           if(blueCeza == 10){
               redCornerLabel.setForeground(Color.yellow);
               state = false;
               baslatDurdur.setSelected(false);
               baslatDurdur.setText(">");
           }else if(redCeza == 10){
               blueCornerLabel.setForeground(Color.yellow);
               state = false;
               baslatDurdur.setSelected(false);
               baslatDurdur.setText(">");
           }
           
           if(blueCornerNumber - redCornerNumber >= 20 && raoundNumber >2){
               blueCornerLabel.setForeground(Color.yellow);
               state = false;
               baslatDurdur.setSelected(false);
               baslatDurdur.setText(">");
           }else if(redCornerNumber - blueCornerNumber >= 20 && raoundNumber > 2){
               redCornerLabel.setForeground(Color.yellow);
               state = false;
               baslatDurdur.setSelected(false);
               baslatDurdur.setText(">");
           }
           
           
           if(altinVurusLabel.isVisible() && sure < 60){
               if(blueCornerNumber >= 2 ){
                      
                      blueCornerLabel.setForeground(Color.yellow);
                      state = false;
                      baslatDurdur.setSelected(false);
                      baslatDurdur.setText(">");
                  }else if(redCornerNumber >= 2){
                     
                      redCornerLabel.setForeground(Color.yellow);
                      state = false;
                      baslatDurdur.setSelected(false);
                      baslatDurdur.setText(">");
                  }
               
           } if(altinVurusLabel.isVisible() && sure == 0){
               
              

               
               if(blueBar > redBar){
                blueCornerLabel.setForeground(Color.yellow);
               }else if(redBar > blueBar){
                redCornerLabel.setForeground(Color.yellow);
               }else if(redBar == blueBar){
                  
                   if(blueCeza > redCeza){
                       redCornerLabel.setForeground(Color.yellow);
                   }else if(redCeza > blueCeza){
                       blueCornerLabel.setForeground(Color.yellow);
                   }else if(blueCeza == redCeza){
                       
                      
                       
                   }
                   
               }
               
               
           }
            
           
           if(raoundNumber == oynanacakRaound && sure == 0 ){
               
              music.PlayMusic(bitirmeSesi);

               
               if(blueCornerNumber > redCornerNumber){
                   
                   blueCornerLabel.setForeground(Color.yellow);
               }else if(redCornerNumber > blueCornerNumber){
                   
                    redCornerLabel.setForeground(Color.yellow);
                    
               }else if(redCornerNumber == blueCornerNumber){
                   
                   
                   
                   oynanacakRaound++;
                   raoundNumber++;
                   generalSure = 60;
                   sure = 60;
                   state = false;
                   baslatDurdur.setSelected(false);
                   baslatDurdur.setText(">");
                   altinVurusLabel.setVisible(true);
                   raoundLabel.setVisible(false);
                   redBarButton.setVisible(true);
                   blueBarButton.setVisible(true);
                   redBarLabel.setVisible(true);
                   blueBarLabel.setVisible(true);
                   blueCornerNumber = 0;
                   redCornerNumber = 0;
                   redCeza =0;
                   blueCeza = 0;
                   redBar = 0;
                   blueBar =0;
                   
                   
                   
               }
               
               
           }
           
       }
       
       
       
      

       
       
       

}

    



