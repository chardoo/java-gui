import java.util.*;
import java.awt.*;    
import java.awt.event.*; 
import javax.swing.JFrame;  
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.File;  // Import the File class

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;
public class App extends Frame {
    public JButton saveBtn;
    public JButton clearBtn;
    private JFrame frame;
    private JLabel  label;
    private JTextField firstNameFiled;
    private JTextField lastName;
    private JTextField agefield;
    private ArrayList <Data> list;
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App window = new App();  
        window.frame.setVisible(true); 
    }

    
    public App(){
     startFrame();
    }

    Data  dataObeject =  new Data("firstName", "lastname", "23");

    private void startFrame(){
        frame = new JFrame();  
        frame.setBounds(100, 100, 570, 300);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.getContentPane().setLayout(null); 
        info();
             
    }

    private void  clearField(){
        firstNameFiled.setText("");
        lastName.setText("");
        agefield.setText("");
    }
     private void info(){
        //  FIRSTNAME
           JLabel firstNameLabel = new JLabel("first Name:");  
           firstNameLabel.setBounds(58, 10, 76, 16);  
           frame.getContentPane().add(firstNameLabel);  
           firstNameFiled = new JTextField();  
           firstNameFiled.setBounds(141, 7, 300, 22);  
           frame.getContentPane().add(firstNameFiled);  
           firstNameFiled.setColumns(10);  
           firstNameFiled.setEditable(true);
        // LASTNAME
          JLabel lastname =  new JLabel("last name: ");
           lastname.setBounds(38, 39, 96, 16);
           frame.getContentPane().add(lastname);
           
           lastName =  new JTextField();
           lastName.setBounds(141, 36, 300, 22);
           frame.getContentPane().add(lastName);  
           lastName.setColumns(10);  
           lastName.setEditable(true);  

        //    AGE
           JLabel Agelabel =  new JLabel("Age: ");
           Agelabel.setBounds(82, 68, 52, 16); 
           frame.getContentPane().add(Agelabel);
           
           agefield =  new JTextField();
           agefield.setBounds(141, 65, 300, 22);
           frame.getContentPane().add(agefield);  
           agefield.setColumns(10);  
           agefield.setEditable(true);  


           saveBtn = new JButton("Save");  
           saveBtn.setFont(new Font("Tahoma", Font.BOLD, 13));  
           saveBtn.setBounds(15, 228, 173, 25);  
           frame.getContentPane().add(saveBtn);
          
           clearBtn = new JButton("Clear");  
           clearBtn.setFont(new Font("Tahoma", Font.BOLD, 20));  
           clearBtn.setBounds(70, 228, 400, 22);
           frame.getContentPane().add(clearBtn);
           
           clearBtn.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                   clearField();
               }
           });
        
           saveBtn.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e) {

             if( firstNameFiled.getText().equals("") || lastName.getText().equals("") ||
                 agefield.getText().equals("") )
                  {
                      JOptionPane.showMessageDialog(frame, "firstName, lastname and age must be filled!!",
                       "Oops!", JOptionPane.WARNING_MESSAGE);
             }
            
            else{
                      dataObeject.setFirstName(firstNameFiled.getText()) ;
                      dataObeject.setLastName(lastName.getText());
                      dataObeject.setAge(agefield.getText());
                      try{
                            

                            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
                            int returnValue = jfc.showOpenDialog(null);                         
                         if (returnValue == JFileChooser.APPROVE_OPTION) {
                                 File selectedFile = jfc.getSelectedFile();
                                 System.out.println(selectedFile.getAbsolutePath());
                                 
                                 File file = new File(selectedFile.getAbsolutePath());
                                 if (file.createNewFile()) {
                                   System.out.println("File created");
                               } 
                               else {
                                   System.out.println("File already exists!");
                               }
                        
                             

                            FileOutputStream fileOut = new FileOutputStream(file);
                            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

                            objectOut.writeObject(dataObeject.toString());
                            objectOut.close();
                            System.out.println("The Object  was succesfully written to a file");
                            clearField();
                        }   
                            
                       } 
                           catch (Exception ex) {
                           ex.printStackTrace();
                       }
       
                }

             }
           });

         
         
         
        }

    


  


    






}
