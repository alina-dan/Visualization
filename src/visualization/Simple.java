package visualization;
import algorithms.InsertionSort;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Simple {
    JFrame f;
    public Simple(){
        f=new JFrame();//creating instance of JFrame

        JButton b=new JButton("Insertion Sort");//creating instance of JButton
        b.setBounds(130,100,100, 40);

        int[] x = {1 , 5, 2};
        f.add(b);//adding button in JFrame
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InsertionSort.sort(x);
            }
        });

        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
    }

    public static void main(String[] args) {
        new Simple();
    }
}