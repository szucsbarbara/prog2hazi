/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafikusfeladat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author szucs
 */
public class óra extends JFrame implements ActionListener{
     private JButton gomb;
     private JTextField text1;
     private JTextField text2;
     private JTextField text3;
     private JTextField text4;
     private JTextField text5;
     private JTextField text6;
     private JTextField text7;
     private JTextField text8;
     private JTextField text9;
     private JTextField text10;
     private JTextField text11;
     private JTextField text12;
     private JLabel label1;
     private JLabel label2;
     private JLabel label3;
     private JLabel label4;
     private JLabel label5;
     private JLabel label6;
     private JLabel label7;
     private JLabel label8;
     private JLabel label9;
     private JLabel label10;
     private JLabel label11;
     private JLabel label12;
     private JPanel p1;
     private JPanel p2;
     private JPanel p3;
     private JPanel p4;
     
     
     
     public óra (String title) throws HeadlessException{
         super(title);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.gomb=new JButton("Számol");
         this.text1=new JTextField(5);
         this.text2=new JTextField(5);
         this.text3=new JTextField(5);
         this.text4=new JTextField(5);
         this.text5=new JTextField(5);
         this.text6=new JTextField(5);
         this.text7=new JTextField(5);
         this.text8=new JTextField(5);
         this.text9=new JTextField(5);
         this.text10=new JTextField(5);
         this.text11=new JTextField(5);
         this.text12=new JTextField(5);
         this.label1=new JLabel("nap");
         this.label2=new JLabel("óra");
         this.label3=new JLabel("perc");
         this.label4=new JLabel("másodperc");
         this.label5=new JLabel("nap");
         this.label6=new JLabel("óra");
         this.label7=new JLabel("perc");
         this.label8=new JLabel("másodperc");
         this.label9=new JLabel("nap");
         this.label10=new JLabel("óra");
         this.label11=new JLabel("perc");
         this.label12=new JLabel("másodperc");
         this.p1=new JPanel();
         this.p2=new JPanel();
         this.p3=new JPanel();
         this.p4=new JPanel();
         
         GridLayout gr= new GridLayout(4,0);
         setLayout(gr);
         
         p1.add(text1);
         p1.add(label1);
         p1.add(text2);
         p1.add(label2);
         p1.add(text3);
         p1.add(label3);
         p1.add(text4);
         p1.add(label4);
         p2.add(text5);
         p2.add(label5);
         p2.add(text6);
         p2.add(label6);
         p2.add(text7);
         p2.add(label7);
         p2.add(text8);
         p2.add(label8);
         p3.add(gomb);
         p4.add(text9);
         p4.add(label9);
         p4.add(text10);
         p4.add(label10);
         p4.add(text11);
         p4.add(label11);
         p4.add(text12);
         p4.add(label12);
         
         this.add(p1);
         this.add(p2);
         this.add(p3);
         this.add(p4);
         
         p3.setLayout(new GridLayout(1,0));
         
         gomb.addActionListener(this);
         
         super.pack();
    
         
         
     }
     
     public static void main(String[] args) {
        óra ó= new óra("IdoÁtalakító");
    }
     
     
     
     
 
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==gomb){
            int day1_in_sec=(Integer.parseInt(text1.getText())*86400)+(Integer.parseInt(text2.getText())*3600)+(Integer.parseInt(text3.getText())*60)+Integer.parseInt(text4.getText());
            int day2_in_sec=(Integer.parseInt(text5.getText())*86400)+(Integer.parseInt(text6.getText())*3600)+(Integer.parseInt(text7.getText())*60)+Integer.parseInt(text8.getText());
            int sum=day1_in_sec+day2_in_sec;
            int nap_ossz=sum/86400;
            sum-=(nap_ossz*86400);
            int ora_ossz=sum/3600;
            sum-=(ora_ossz*3600);
            int perc_ossz=sum/60;
            sum-=(perc_ossz*60);
            int mp_ossz=sum;
            
            text9.setText(Integer.toString(nap_ossz));
            text10.setText(Integer.toString(ora_ossz));
            text11.setText(Integer.toString(perc_ossz));
            text12.setText(Integer.toString(mp_ossz));
            
        }
        
        
            
    }
    
}
