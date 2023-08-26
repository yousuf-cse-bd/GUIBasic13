package GUIBasic13;import javax.swing.*;import java.awt.*;/** * JLayeredPane: Swing container that provides a third dimension for positioning * components ex: depth, Z-Index */public class MyLayeredPane extends JFrame {    public static void main(String[] args) {        MyLayeredPane frame = new MyLayeredPane();        frame.setTitle("Layered Pane example");        frame.setSize(520, 520);        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        frame.setLayout(null);        frame.setLocation(720, 100);        frame.getContentPane().setBackground(Color.LIGHT_GRAY);        JLabel label1 = new JLabel();        label1.setToolTipText("This is RED plane");        label1.setOpaque(true);        label1.setBackground(Color.RED);        label1.setBounds(50, 50, 200, 200);        JLabel label2 = new JLabel();        label2.setToolTipText("This is a BLUE plane");        label2.setOpaque(true);        label2.setBackground(Color.BLUE);        label2.setBounds(100, 100, 200, 200);        JLabel label3 = new JLabel();        label3.setToolTipText("This is a GREEN plane");        label3.setOpaque(true);        label3.setBackground(Color.GREEN);        label3.setBounds(150, 150, 200, 200);        JLayeredPane jLayeredPane = new JLayeredPane();        jLayeredPane.setBounds(0, 0, 400, 400);        jLayeredPane.setBackground(Color.DARK_GRAY);        jLayeredPane.setOpaque(true);        jLayeredPane.add(label1, Integer.valueOf(0));        jLayeredPane.add(label2, Integer.valueOf(1));        jLayeredPane.add(label3, Integer.valueOf(2));        frame.add(jLayeredPane);        frame.setVisible(true);    }}