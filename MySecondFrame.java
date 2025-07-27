/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;
import javax.swing.JFrame;
import java.awt.Color;
/**
 *
 * @author cash
 */
public class MySecondFrame extends JFrame{
    public MySecondFrame(){
        setTitle("Thekiso Khanye");
        setSize(150,200);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.RED);
        setVisible(true);
    }
}
