package Swings;

// Implementing JButton
// 6.4
// Implementing JLabel
// 6.5
// Implementing JCheckBox
// 6.6
// Implement JMenu
// 6.7
// Implementing JTabbedPane
// 7
// JDBC

import javax.swing.*;

public class SComponents  extends JFrame{
    
    public SComponents(){

        setTitle("Swing Components");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JButton b1 = new JButton("Button");
        b1.setBounds(20, 20, 100, 50);
        add(b1);

        JLabel l1 = new JLabel("Label");
        l1.setBounds(20, 80, 100, 50);
        add(l1);

        JCheckBox c1 = new JCheckBox("CheckBox");;
        c1.setBounds(20, 140, 100, 50);
        add(c1);

        JMenu m1 = new JMenu("Menu");
        JMenuBar mb=new JMenuBar();
        JMenuItem i1, i2, i3, i4, i5; 
        i1=new JMenuItem("Item 1");  
        i2=new JMenuItem("Item 2");  
        i3=new JMenuItem("Item 3");  
        i4=new JMenuItem("Item 4");  
        i5=new JMenuItem("Item 5"); 
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);
        m1.add(i5);
        m1.setBounds(20, 200, 100, 50);
        mb.add(m1);
        add(m1);

        JTabbedPane t1 = new JTabbedPane();
        t1.addTab("title 1", new JLabel("tab 1"));
        t1.addTab("title 2", new JLabel("tab 2"));
        t1.addTab("title 3", new JLabel("tab 3"));
        t1.setBounds(20, 260, 100, 50);
        add(t1);
    }
}
