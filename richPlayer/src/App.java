import java.util.*;
import java.awt.*;
import javax.swing.*;

import controller.PlaylistController;
import model.Playlist;
public class App extends Frame {
    public static JButton Play, add, Pause, Stop;
    private static JLabel label;
    private static JTextField URLField;
    private static JFrame frame;
    private static JTable myplaylistTabel;
    static PlaylistController playcontroller = new PlaylistController();

    Playlist playlistModel =  new Playlist(" ");
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        App window = new App();
        window.frame.setVisible(true);

    }

    public App() {
        showFrame();
    }

    public static void showFrame() {
        frame = new JFrame();
        frame.setBounds(100, 100, 570, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        components();
    }

    private static void components() {
        label = new JLabel("Enter or paste youtube url");
        label.setBounds(58, 10, 76, 16);
        frame.getContentPane().add(label);
        URLField = new JTextField();
        URLField.setBounds(141, 7, 300, 22);
        frame.getContentPane().add(URLField);
        URLField.setEditable(true);
        add = new JButton("Add");
        add.setFont(new Font("Tahoma", Font.BOLD, 13));
        add.setBounds(200, 40, 173, 25);
        frame.getContentPane().add(add);
        Pause = new JButton("Pause");
        Pause.setFont(new Font("Tahoma", Font.BOLD, 13));
        Pause.setBounds(15, 228, 173, 25);
        frame.getContentPane().add(Pause);
        Play = new JButton("Play");
        Play.setFont(new Font("Tahoma", Font.BOLD, 13));
        Play.setBounds(200, 228, 173, 25);
        frame.getContentPane().add(Play);
        
        Stop = new JButton("Stop");
        Stop.setFont(new Font("Tahoma", Font.BOLD, 13));
        Stop.setBounds(380, 228, 173, 25);
        frame.getContentPane().add(Stop);
        String [] columnName = {"Name"};
        String[][] data = {
            { "Kundan Kumar Jha", "4031", "CSE" },
            { "Anand Jha", "6014", "IT" }
        };
        myplaylistTabel = new JTable();
      
        frame.getContentPane().add(myplaylistTabel);

    }

    public void getFiledVale(){
        playlistModel.setTitle(add.getText());
        
    }

}
