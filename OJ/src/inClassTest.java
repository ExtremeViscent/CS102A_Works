import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inClassTest {
    public static void main(String args[]){
        JOptionPane.showMessageDialog(null,"Shin Takarajima" );
        JFrame frame=new JFrame();
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JButton ST=new JButton("久 等 了");
        frame.setLayout(new FlowLayout());
        frame.add(ST);
    }
}
