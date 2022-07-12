package components;
import java.util.*;
import java.awt.*;    
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;  
public class Home  extends Frame{
    
public JButton Play;
public JButton Pause;
public JButton Stop;
private JPanel panel;
private static JFrame frame; 

 public Home(){
  showFrame();
    
  }
 
  private void showFrame(){
      frame =  new JFrame();
      frame.setBounds(100, 100, 570, 300);  
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      frame.getContentPane().setLayout(null);
     panel = new JPanel();
  }
 

}

