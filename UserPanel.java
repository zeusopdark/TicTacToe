/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ankit
 */
public class UserPanel implements ActionListener{
    JFrame jf;
    JLabel jl1,jl2;
    JTextField jt1,jt2;
    JButton jb;
    UserPanel(){
       jf=new JFrame("TicTacToe Game By Ankit");
       jf.setSize(600,500);
       jf.setDefaultCloseOperation(3);
       jf.setLayout(null);
       
       jl1=new JLabel("Enter Player 1: ");
       jl1.setBounds(50,80,120,30);
       jf.add(jl1);
       
       jt1=new JTextField();
       jt1.setBounds(150,81,250,30);
       jf.add(jt1);  
       
       jl2=new JLabel("Enter Player 2: ");
       jl2.setBounds(50,140,120,30);
       jf.add(jl2);
       
       jt2=new JTextField();
       jt2.setBounds(150,140,250,30);
       jf.add(jt2);  
       
       jb=new JButton("Start Game");
       jb.setBounds(200,220,125,40);
       jf.add(jb);
       jb.addActionListener(this);
       
       jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==jb){
           if(jt1.getText()!=null&&jt2.getText()!=null){
               GamePanel gp=new GamePanel(jt1.getText(),jt2.getText());
               gp.openGamePanel();
               jf.setVisible(false);
           }
           else{
               JOptionPane.showMessageDialog(jf,"Please Enter PlayerName ");
           } 
       } 
    }
}
