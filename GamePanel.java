/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newgame;

/**
 *
 * @author ankit
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;
import java.awt.event.*;

 public class GamePanel implements ActionListener{
   JFrame jf;
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;  
   int count=0;
   String str="";
   Color color1;
   String player1="",player2="";
   
   public GamePanel(String player1,String player2){
       this.player1=player1;
       this.player2=player2;
  }
   public void openGamePanel(){
       
     try{
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
     }  
     catch(Exception e){
         System.out.println(e);
     }
       
    jf=new JFrame();
    jf.setTitle(player1+" Turns");
    jf.setSize(500,500);
    jf.setLayout(new GridLayout(3, 3));
    b1=new JButton();
    jf.add(b1);
    b1.addActionListener(this);
    
    b2=new JButton();
    jf.add(b2);
    b2.addActionListener(this);
    
    b3=new JButton();
    jf.add(b3);
    b3.addActionListener(this);
    
    b4=new JButton();
    jf.add(b4);
    b4.addActionListener(this);
    
    b5=new JButton();
    jf.add(b5);
    b5.addActionListener(this);
    
    b6=new JButton();
    jf.add(b6);
    b6.addActionListener(this);
    
    b7=new JButton();
    jf.add(b7);
    b7.addActionListener(this);
    
    b8=new JButton();
    jf.add(b8);
    b8.addActionListener(this);
    
    b9=new JButton();
    jf.add(b9);
    b9.addActionListener(this);
    

    jf.setDefaultCloseOperation(3);
    jf.setVisible(true);
   }
    @Override
    public void actionPerformed(ActionEvent e){
        
        
        if((count%2)==0){
            str="X";
            color1=Color.red;
            jf.setTitle(player2+" Turns");
        }
        else{
            str="0";
            color1=Color.yellow;
            jf.setTitle(player1+" Turns");
        }
        if(e.getSource()==b1){
            b1.setText(str);
            b1.setBackground(color1);
            b1.setFont(new Font("Arial",1,60));
            b1.setEnabled(false);
           
        }
         if(e.getSource()==b2){
            b2.setText(str);
             b2.setBackground(color1);
               b2.setFont(new Font("Arial",1,60));
            b2.setEnabled(false);
           
        }
          if(e.getSource()==b3){
            b3.setText(str);
             b3.setBackground(color1);
               b3.setFont(new Font("Arial",1,60));
            b3.setEnabled(false);
            
        }
           if(e.getSource()==b4){
            b4.setText(str);
             b4.setBackground(color1);
               b4.setFont(new Font("Arial",1,60));
            b4.setEnabled(false);
           
        }
            if(e.getSource()==b5){
            b5.setText(str);
              b5.setFont(new Font("Arial",1,60));
             b5.setBackground(color1);
            b5.setEnabled(false);
           
        }
            if(e.getSource()==b6){
            b6.setText(str);
              b6.setFont(new Font("Arial",1,60));
             b6.setBackground(color1);
            b6.setEnabled(false);
           
        }
             
            if(e.getSource()==b7){
            b7.setText(str);
              b7.setFont(new Font("Arial",1,60));
             b7.setBackground(color1);
            b7.setEnabled(false);
          
        }
              
            if(e.getSource()==b8){
            b8.setText(str);
              b8.setFont(new Font("Arial",1,60));
             b8.setBackground(color1);
            b8.setEnabled(false);
           
        }
            if(e.getSource()==b9){
            b9.setText(str);
              b9.setFont(new Font("Arial",1,60));
             b9.setBackground(color1);
            b9.setEnabled(false);
        }
            count++;
            winningCondition();
    }
    
    public void winningCondition(){
       
        if(!b1.getText().equals("")&&b1.getText().equals(b2.getText())&&b2.getText().equals(b3.getText())){
            String winner="";
            if(b1.getText().equals("X")){
                   winner=player1;
               }
               else{
                   winner=player2;
               }
             jf.setTitle(winner+" Wins");
               JOptionPane.showMessageDialog(jf,"Player : "+winner+" Wins");
               restartGame(); 
        }
        else if(!b4.getText().equals("")&&b4.getText().equals(b5.getText())&&b5.getText().equals(b6.getText())){
               String winner = "";
            if (b4.getText().equals("X")) {
                winner = player1;
            } else {
                winner = player2;
            }
             jf.setTitle(winner+" Wins");
               JOptionPane.showMessageDialog(jf,"Player : "+winner+" Wins");
               restartGame();
        }
        else if(!b7.getText().equals("")&&b7.getText().equals(b8.getText())&&b8.getText().equals(b9.getText())){
                 String winner="";
            if(b7.getText().equals("X")){
                   winner=player1;
               }
               else{
                   winner=player2;
               }
             jf.setTitle(winner+" Wins");
               JOptionPane.showMessageDialog(jf,"Player : "+winner+" Wins");
               restartGame();
        }
        else if(!b7.getText().equals("")&&b7.getText().equals(b4.getText())&&b4.getText().equals(b1.getText())){
                 String winner="";
            if(b7.getText().equals("X")){
                   winner=player1;
               }
               else{
                   winner=player2;
               }
             jf.setTitle(winner+" Wins");
               JOptionPane.showMessageDialog(jf,"Player : "+winner+" Wins");
               restartGame();
        }
        else if(!b8.getText().equals("")&&b8.getText().equals(b5.getText())&&b5.getText().equals(b2.getText())){
                String winner="";
            if(b8.getText().equals("X")){
                   winner=player1;
               }
               else{
                   winner=player2;
               }
             jf.setTitle(winner+" Wins");
               JOptionPane.showMessageDialog(jf,"Player : "+winner+" Wins");
               restartGame();
        }
        else if(!b9.getText().equals("")&&b9.getText().equals(b6.getText())&&b6.getText().equals(b3.getText())){
                 String winner="";
            if(b9.getText().equals("X")){
                   winner=player1;
               }
               else{
                   winner=player2;
               }
             jf.setTitle(winner+" Wins");
               JOptionPane.showMessageDialog(jf,"Player : "+winner+" Wins");
               restartGame();
        }
        else if(!b1.getText().equals("")&&b1.getText().equals(b5.getText())&&b5.getText().equals(b9.getText())){
                 String winner="";
            if(b1.getText().equals("X")){
                   winner=player1;
               }
               else{
                   winner=player2;
               }
             jf.setTitle(winner+" Wins");
               JOptionPane.showMessageDialog(jf,"Player : "+winner+" Wins");
               restartGame();
        }
        else if(!b3.getText().equals("")&&b3.getText().equals(b5.getText())&&b5.getText().equals(b7.getText())){
              String winner = "";
            if (b3.getText().equals("X")) {
                winner = player1;
            } else {
                winner = player2;
            }
            jf.setTitle(winner+" Wins");
            JOptionPane.showMessageDialog(jf, "Player : " + winner + " Wins");
            restartGame();
        }
        else{
            if(count==9){
                JOptionPane.showMessageDialog(jf,"Match Draw:");
                restartGame();
            }
        }
    }
    public void restartGame(){
        int i=JOptionPane.showConfirmDialog(jf, "Do You want to restart the Game");
//        System.out.println("Hello "+i);
        if(i==0){
            b1.setText("");
            b1.setEnabled(true);
            b1.setBackground(null);
            
            b2.setText("");
            b2.setEnabled(true);
            b2.setBackground(null);
            
            b3.setText(""); 
            b3.setEnabled(true);
            b3.setBackground(null);
            
            b4.setText("");
            b4.setEnabled(true);
            b4.setBackground(null);
            
            b5.setText("");
            b5.setEnabled(true);
            b5.setBackground(null);
            
            b6.setText("");
            b6.setEnabled(true);
            b6.setBackground(null);
            
            b7.setText("");
            b7.setEnabled(true);
            b7.setBackground(null);
            
            b8.setText("");
            b8.setEnabled(true);
            b8.setBackground(null);
            
            b9.setText("");
            b9.setEnabled(true);
            b9.setBackground(null);
            
            count=0;
            str="";
            String set=jf.getTitle();
            if(set.equals(player1+" Wins")){
                jf.setTitle(player1+" Turns");
            }
            else{
                jf.setTitle(player2+" Turns");
            }
        }
        else if(i==1){
           System.exit(0);
        }
        else{
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
            jf.setTitle("Game Over");
        }
    }
}
