package GUIBasic13;import javax.swing.*;import java.awt.*;public class ShowFlowLayout extends JFrame {    public ShowFlowLayout(){        this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));        this.add(new JLabel("First Name"));        this.add(new JTextField(8));        this.add(new JLabel("MI"));        this.add(new TextField(1));        this.add(new JLabel("Last Name"));        this.add(new JTextField(8));    }    public static void main(String[] args) {        ShowFlowLayout showFlowLayout = new ShowFlowLayout();        showFlowLayout.setSize(200, 200);        showFlowLayout.setTitle("Show Flow Layout");        showFlowLayout.setLocationRelativeTo(null);        showFlowLayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        showFlowLayout.setVisible(true);    }}