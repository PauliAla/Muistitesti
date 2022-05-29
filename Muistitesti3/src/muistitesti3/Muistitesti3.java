/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muistitesti3;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javafx.animation.AnimationTimer;
import java.util.Random;

import java.util.Scanner;
/**
 *
 * @author Pauli
 */
public class Muistitesti3 extends Application  {
    JPanel ruutu = new JPanel (new GridBagLayout());
    JButton [][] peliruutu = new JButton[4][1];
    public JFrame frame = new JFrame();
    public int muistettavia=1;
    
    long startTime = System.currentTimeMillis();
    long elapsedTime = System.currentTimeMillis() - startTime;
    public Boolean asetettu = false;
    public Boolean kayttajansyotto=false;
    public int[] talletetutluvut = new int[1000];
    public Object source;
    int laskuri=0;
    Scanner scan = new Scanner(System.in);
    
    @Override
    public void start (Stage ikkuna) {
        //Scene nakyma = new Scene(ruutu);
        for (int x=0; x<4; x++) {
            peliruutu[x][0] = new JButton(" ");
            peliruutu[x][0].setPreferredSize(new Dimension(150, 150));
          
class MyActionListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
    // display/center the jdialog when the button is pressed
    String ac = e.getActionCommand();
    source = e.getSource();



}};
peliruutu[x][0].addActionListener(new MyActionListener());
            ruutu.add(peliruutu[x][0]);
        }
        frame.setMinimumSize(new Dimension(800,800));
        
        frame.setUndecorated(true);
         frame.add(ruutu);
                 Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.CYAN));

        frame.setVisible(true);
        Color initialBackground = peliruutu[0][0].getBackground();
        System.out.println(startTime);
        elapsedTime = System.currentTimeMillis() - startTime;
        
        new AnimationTimer() {
            @Override
            public void handle (long nykyhetki) {
                Random arpoja = new Random();
                
                if (kayttajansyotto == false) {
                   
                for(int kertoja=0; kertoja <muistettavia;) {   
                    elapsedTime = System.currentTimeMillis() - startTime;
                 System.out.println("mentiin");
                
                System.out.println(elapsedTime);
                if ((elapsedTime>(1000+(kertoja*1000)))&&(asetettu==false)) {
                    System.out.println(kertoja);
                    if (kertoja == muistettavia-1) {
                    while(true) {
                    int luku = arpoja.nextInt(3);
                    talletetutluvut[kertoja] = luku;
                    if (kertoja==0) {
                        break;
                    }
                    if (kertoja >0) {
                    if (!(talletetutluvut[kertoja-1] == talletetutluvut[kertoja])) {
                        break;
                    }
                    }
                    }
                    }
                if (talletetutluvut[kertoja]==0) {
                peliruutu[(talletetutluvut[kertoja])][0].setBackground(Color.BLUE);
                }
                if (talletetutluvut[kertoja]==1) {
                peliruutu[(talletetutluvut[kertoja])][0].setBackground(Color.ORANGE);
                }
                if (talletetutluvut[kertoja]==2) {
                peliruutu[(talletetutluvut[kertoja])][0].setBackground(Color.RED);
                }
                if (talletetutluvut[kertoja]==3) {
                peliruutu[(talletetutluvut[kertoja])][0].setBackground(Color.MAGENTA);
                }
                asetettu = true;
                
                }
                if ((elapsedTime>(2000+(kertoja*1000)))&&asetettu==true) {
                    System.out.println(kertoja);
                    System.out.println("on yli 2000");
                    for (int x=0; x<4; x++) {
                        if (peliruutu[x][0].getBackground()==Color.BLUE) {
                            peliruutu[x][0].setBackground(initialBackground);
                        }
                        if (peliruutu[x][0].getBackground()==Color.ORANGE) {
                            peliruutu[x][0].setBackground(initialBackground);
                        }
                        if (peliruutu[x][0].getBackground()==Color.RED) {
                            peliruutu[x][0].setBackground(initialBackground);
                        }
                        if (peliruutu[x][0].getBackground()==Color.MAGENTA) {
                            peliruutu[x][0].setBackground(initialBackground);
                        }
                    }
                    asetettu = false;
                 
                    kertoja++;
                
                
                }
                
                
            }
                kayttajansyotto = true;
                    System.out.println(talletetutluvut.length);
                    startTime = System.currentTimeMillis();
                    
                  for (int i=0; i<talletetutluvut.length; i++) {
                      System.out.println("tl tulosta "+talletetutluvut[i]);
                  }
                      for (int i=0; i<muistettavia;) {
                          System.out.println(elapsedTime);
                          elapsedTime = System.currentTimeMillis() - startTime;
        
        
    if ((source==peliruutu[0][0])&&(talletetutluvut[i]==0)&&(!(source==null))) {
      System.out.println("eka. se oli oikein");
      i++;
      startTime = System.currentTimeMillis();
      peliruutu[0][0].setBackground(Color.BLUE);
      
      elapsedTime = System.currentTimeMillis() - startTime;
      while(elapsedTime<200) {
          elapsedTime = System.currentTimeMillis() - startTime;
      }
      peliruutu[0][0].setBackground(initialBackground);
      startTime = System.currentTimeMillis();
      source=null;
 
    }
    if ((source==peliruutu[1][0])&&(talletetutluvut[i]==1)&&(!(source==null))) {
      System.out.println("toka. se oli oikein");
      i++;
      startTime = System.currentTimeMillis();
      peliruutu[1][0].setBackground(Color.ORANGE);
      
      elapsedTime = System.currentTimeMillis() - startTime;
      while(elapsedTime<200) {
          elapsedTime = System.currentTimeMillis() - startTime;
      }
      peliruutu[1][0].setBackground(initialBackground);
      startTime = System.currentTimeMillis();
      source=null;
 
    }
    if ((source==peliruutu[2][0])&&(talletetutluvut[i]==2)&&(!(source==null))) {
      System.out.println("kolmas. se oli oikein");
      i++;
      startTime = System.currentTimeMillis();
      peliruutu[2][0].setBackground(Color.RED);
      
      elapsedTime = System.currentTimeMillis() - startTime;
      while(elapsedTime<200) {
          elapsedTime = System.currentTimeMillis() - startTime;
      }
      peliruutu[2][0].setBackground(initialBackground);
      startTime = System.currentTimeMillis();
      source=null;
 
    }
    if ((source==peliruutu[3][0])&&(talletetutluvut[i]==3)&&(!(source==null))) {
      System.out.println("neljäs. se oli oikein");
      i++;
      startTime = System.currentTimeMillis();
      peliruutu[3][0].setBackground(Color.MAGENTA);
      
      elapsedTime = System.currentTimeMillis() - startTime;
      while(elapsedTime<200) {
          elapsedTime = System.currentTimeMillis() - startTime;
      }
      peliruutu[3][0].setBackground(initialBackground);
      startTime = System.currentTimeMillis();
      source=null;
 
    
    }   else if ((!(source==null))||(elapsedTime>2000)) {
        System.out.println("väärin. peli ohi.");  
        System.out.println("Pistemääräsi oli: "+(muistettavia-1));
        lopetus();
    }
        System.out.println("silmukka suoritettu");
        System.out.println(i);
        
        
    }
                    System.out.println("käyttäjänsyöttö suoritettu. seuraava kierros.");
                    muistettavia++;
                    kayttajansyotto = false;
                    startTime = System.currentTimeMillis();
                
                
                }
            }
        }.start();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch (Muistitesti3.class);
        
    }
    public void lopetus () {
        System.out.print("Paina enter jatkaaksesi . . . ");
     scan.nextLine();
     System.exit(0);
    }
    
    
}

