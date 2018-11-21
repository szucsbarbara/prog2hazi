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
public class Számológép extends JFrame implements ActionListener{

    private JTextField text;
    private JButton button1;
    private JButton Backspace;
    private JButton CE;
    private JButton C;
    private JButton Mc;
    private JButton het;
    private JButton nyolc;
    private JButton kilenc;
    private JButton osztas;
    private JButton sqrt;
    private JButton Mr;
    private JButton negy;
    private JButton ot;
    private JButton hat;
    private JButton szorzas;
    private JButton szazalek;
    private JButton Ms;
    private JButton egy;
    private JButton ketto;
    private JButton harom;
    private JButton kivon;
    private JButton egyperx;
    private JButton Mplusz;
    private JButton nulla;
    private JButton pluszminusz;
    private JButton pont;
    private JButton osszead;
    private JButton egyenlo;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel p7;
    private int sum=0;
    
    
    public Számológép (String title) throws HeadlessException{
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.text=new JTextField(30);
        this.button1=new JButton("");
        this.Backspace=new JButton("Backspace");
        this.CE=new JButton("CE");
        this.C=new JButton("C");
        this.Mc=new JButton("MC");
        this.het=new JButton("7");
        this.nyolc=new JButton("8");
        this.kilenc=new JButton("9");
        this.osztas=new JButton("/");
        this.sqrt=new JButton("sqrt");
        this.Mr=new JButton("MR");
        this.negy=new JButton("4");
        this.ot=new JButton("5");
        this.hat=new JButton("6");
        this.szorzas=new JButton("*");
        this.szazalek=new JButton("%");
        this.Ms=new JButton ("MS");
        this.egy= new JButton("1");
        this.ketto=new JButton("2");
        this.harom=new JButton("3");
        this.kivon= new JButton("-");
        this.egyperx=new JButton("1/x");
        this.Mplusz=new JButton("M+");
        this.nulla=new JButton("0");
        this.pluszminusz= new JButton("+/-");
        this.pont= new JButton(".");
        this.osszead= new JButton("+");
        this.egyenlo=new JButton("=");
        
        this.p1=new JPanel();
       this.p2=new JPanel();
       this.p3=new JPanel();
       this.p4=new JPanel();
       this.p5=new JPanel();
       this.p6=new JPanel();
       
       
       
       
       GridLayout gr = new GridLayout(6, 0);
        setLayout(gr);
        
       p1.add(text);
       p2.add(button1);
       p2.add(Backspace);
       p2.add(CE);
       p2.add(C);
       p3.add(Mc);
       p3.add(het);
       p3.add(nyolc);
       p3.add(kilenc);
       p3.add(osztas);
       p3.add(sqrt);
       p4.add(Mr);
       p4.add(negy);
       p4.add(ot);
       p4.add(hat);
       p4.add(szorzas);
       p4.add(szazalek);
       p5.add(Ms);
       p5.add(egy);
       p5.add(ketto);
       p5.add(harom);
       p5.add(kivon);
       p5.add(egyperx);
       p6.add(Mplusz);
       p6.add(nulla);
       p6.add(pluszminusz);
       p6.add(pont);
       p6.add(osszead);
       p6.add(egyenlo);
               
       
       
       this.add(p1);
       this.add(p2);
       this.add(p3);
       this.add(p4);
       
       this.add(p5);
       this.add(p6);
       p1.setLayout(new GridLayout(1,0));
        p2.setLayout(new GridLayout(1,0));
        p3.setLayout(new GridLayout(1,0));
         p4.setLayout(new GridLayout(1,0));
          p5.setLayout(new GridLayout(1,0));
           p6.setLayout(new GridLayout(1,0));
           
        
       osszead.addActionListener(this);
       egy.addActionListener(this);
       ketto.addActionListener(this);
       harom.addActionListener(this);
       negy.addActionListener(this);
       ot.addActionListener(this);
       hat.addActionListener(this);
       het.addActionListener(this);
       nyolc.addActionListener(this);
       kilenc.addActionListener(this);
       egyenlo.addActionListener(this);
       
       
       super.pack();
       
       
    
        
    }
    
    
    public static void main(String[] args) {
        Számológép sz= new Számológép("Számológép");
    }
    

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int sum=0;
        if(e.getSource()==this.osszead){
            
            this.sum+=Integer.parseInt(this.text.getText());
            this.text.setText("");
        }
        else if(e.getSource()==this.egyenlo){
            this.sum+=Integer.parseInt(this.text.getText());
            this.text.setText(String.valueOf(this.sum));
            this.sum=0;
        }
    }
        
        
        
}
