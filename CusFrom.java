/*
 * CusFrom.java
 * 
 *  2017 mikeh <mikeh@mikeh-desktop>
 * 

 * https://www.codeproject.com/Questions/512895/HowplustoplusunicodeplusMyanmarplustextsplusonplus
 */


//package javaapplication1;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class CusFrom {
private static void createAndShowGUI() {
JFrame frame = new JFrame("myanmar text");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
String s = "\u1015\u102F \u103C\u1015\u102F";
JLabel label = new JLabel(s);
label.setFont(new java.awt.Font("Myanmar3", 0, 20));// font insert here, Myanmar Text, Padauk, Myanmar3, Tharlon
frame.getContentPane().add(label);
frame.pack();
        frame.setSize(new Dimension(300, 200));
frame.setVisible(true);
}
public static void main(String[] args) {
javax.swing.SwingUtilities.invokeLater(new Runnable() {
public void run() {
createAndShowGUI();
}
});
}
} 
