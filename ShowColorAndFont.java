import java.awt.*;
import java.text.*;
import javax.swing.*;
import java.awt.font.*;
//import javax.swing.JPanel;
 /**
 * ShowColorAndFont() To display font and colour 
 * @author Mike H
 * @version 1.1
 * 
 */
public class ShowColorAndFont extends JPanel {
/**
 * 
 * @param g for render environment
 * @author Mike H
 * @version 1.1
 * 
 */
  public void paint(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    String text = "Java is an Object Oriented Programming Language.";
    Dimension dimension = getSize();
 
    Font font1 = new Font("Book Antiqua", Font.PLAIN, 30);
    Font font2 = new Font("Monotype Corsiva", Font.PLAIN, 40);
 
    AttributedString attributedString = new AttributedString(text);
    attributedString.addAttribute(TextAttribute.FONT, font1);
    attributedString.addAttribute(TextAttribute.FONT, font2, 1, 4);
    
  attributedString.addAttribute(TextAttribute.FONT, font2, 6, 7); // note these are one char width
  attributedString.addAttribute(TextAttribute.FONT, font2, 9, 10);
  attributedString.addAttribute(TextAttribute.FONT, font2, 12, 17);
  attributedString.addAttribute(TextAttribute.FONT, font2, 19, 26);
  attributedString.addAttribute(TextAttribute.FONT, font2, 28, 38);
  attributedString.addAttribute(TextAttribute.FONT, font2, 40, 47);
 
  attributedString.addAttribute(TextAttribute.FOREGROUND, Color.red, 0, 1);  // note these are one char width
  attributedString.addAttribute(TextAttribute.FOREGROUND, Color.red, 5, 6);
  attributedString.addAttribute(TextAttribute.FOREGROUND, Color.red, 8, 9);
  attributedString.addAttribute(TextAttribute.FOREGROUND, Color.blue, 11, 12);
  attributedString.addAttribute(TextAttribute.FOREGROUND, Color.red, 18, 19);
  attributedString.addAttribute(TextAttribute.FOREGROUND, Color.red, 27, 28);
  attributedString.addAttribute(TextAttribute.FOREGROUND, Color.red, 39, 40);
     
    g2d.drawString(attributedString.getIterator(), 40, 80);
  }
  /**
 * 
 * @param args info from command line
 * @author Mike H
 * @version 1.1
 */
  public static void main(String[] args) {
    JFrame frame = new JFrame("Show Color and Font");
    frame.getContentPane().add(new ShowColorAndFont());
    frame.setForeground(Color.RED);
      //     setDefaultCloseOperation(EXIT_ON_CLOSE);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // 17.08.2016 01:02:22
      // see https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html
    frame.setSize(850, 200);
    frame.setVisible(true);
    //frame.show();
 // does not exit properly 
 // 17.09.2015 13:56:53
 // mike h 
  }
  }
  
  
