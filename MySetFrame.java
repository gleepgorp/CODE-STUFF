import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MySetFrame extends JFrame {
   public MySetFrame()
   {
      //Creating Constructor setting default layout
      super("My Set");
      setSize(400,500);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
   
      //Declaring variables for buttons and labels
      JPanel north,center;
      JButton btnSetA, btnSetB, btnShow;
      JLabel lblSetA, lblSetB, lblUnion, lblIntersection, lblAB, lblBA, lblSubset;  
      MySet setA = new MySet();
      MySet setB = new MySet();
      
      //Declaring locations 
      north = new JPanel();
      center = new JPanel();
      north.setLayout(new FlowLayout());
      center.setLayout(new GridLayout(8,2));
      
      //Setting buttons
      btnSetA = new JButton("Set A");
      btnSetB = new JButton("Set B");
      btnShow = new JButton("Show Results");
      
      lblSetA = new JLabel();
      lblSetB = new JLabel();
      lblUnion = new JLabel(); 
      lblIntersection = new JLabel(); 
      lblAB = new JLabel(); 
      lblBA = new JLabel(); 
      lblSubset = new JLabel();
      add(north, BorderLayout.NORTH);
      add(center);
      
      north.add(new JLabel("Enter elements for"));
      north.add(btnSetA);
      north.add(btnSetB);
      center.add(btnShow);
      center.add(new JLabel());
      center.add(new JLabel("setA contains:"));
      center.add(lblSetA);
      center.add(new JLabel("setB contains:"));
      center.add(lblSetB);
      center.add(new JLabel("union:"));
      center.add(lblUnion);
      center.add(new JLabel("intersection:"));
      center.add(lblIntersection);
      center.add(new JLabel("A-B:"));
      center.add(lblAB);
      center.add(new JLabel("B-A:"));
      center.add(lblBA);
      center.add(new JLabel("Other Remarks:"));
      center.add(lblSubset);
      pack();
           
   }
   
   public static void main (String[] args)
   {
      new MySetFrame();
   }

}


