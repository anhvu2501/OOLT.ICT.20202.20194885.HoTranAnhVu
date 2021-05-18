//package hust.soict.globalict.swing;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class LookAndFeelDemo extends JFrame {
//    public LookAndFeelDemo() {
//        addDemoComponents();
//        addLookAndFeelComboBox();
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(380, 100);
//        setVisible(true);
//    }
//
//    void addDemoComponents() {
//        Container cp = getContentPane();
//        cp.setLayout(new FlowLayout());
//        cp.add(new JLabel("Label: "));
//        cp.add(new JTextField("Text field"));
//        cp.add(new JRadioButton("Radio button"));
//        cp.add(new JButton("Button"));
//    }
//
//    void addLookAndFeelComboBox() {
//        Container cp = getContentPane();
//        cp.add(new JLabel("Change Look and Feel Here: "));
//
//        LookAndFeelInfos[] lafInfos = UIManager.getInstalledLookAndFeels();
//        String [] lafNames =  new String[lafInfos.length];
//        for (int i = 0; i < lafInfos.length; i++) {
//            lafNames[i] = lafInfos[i].getName();
//        }
//
//        JComboBox cbLookAndFeel = new JComboBox(lafNames);
//        cp.add(cbLookAndFeel);
//
//        JFrame frame = this;
//        cbLookAndFeel.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int index = cbLookAndFeel.getSelectedIndex();
//                try {
//                    UIManager.setLookAndFeel(lafInfos[index].getClassName());
//                } catch (Exception e1) {
//                    e1.printStackTrace();
//                }
//                SwingUtilities.updateComponentTreeUI(frame);
//                setTitle(lafInfos[index].getName() + "Look and Feel");
//            }
//        });
//    }
//
//}
