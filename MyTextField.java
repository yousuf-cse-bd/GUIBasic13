package GUIBasic13;import javax.swing.*;import java.awt.*;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;/*** * JTextField: Simple input swing component */public class MyTextField extends JFrame implements ActionListener {    JButton jButton;    JTextField jTextField;    MyTextField(){        jButton = new JButton("SUBMIT");        jButton.setToolTipText("This is submit button."); /*Can we modify?*/        jButton.setOpaque(true);        jButton.setFont(new Font("Consolas", Font.BOLD, 30));        jButton.setFocusable(false);        jButton.setBackground(Color.WHITE);        jButton.setForeground(Color.BLUE);        jButton.addActionListener(this);        jButton.setBorder(BorderFactory.createLineBorder(Color.black, 5, true));        this.add(jButton);        jTextField = new JTextField();        jTextField.setPreferredSize(new Dimension(250, 50));        jTextField.setFont(new Font("Consolas", Font.PLAIN, 20));        jTextField.setForeground(Color.GREEN);        jTextField.setBackground(Color.BLACK);        jTextField.setCaretColor(Color.WHITE); /*Cursor blinker*/        jTextField.setText("UserName");        this.add(jTextField);        this.setTitle("My Text Field");        this.setSize(420, 420);        this.setLocation(720, 100);        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        this.setLayout(new FlowLayout(FlowLayout.CENTER));        this.getContentPane().setBackground(Color.GRAY);        this.setVisible(true);    }    @Override    public void actionPerformed(ActionEvent actionEvent) {        if(actionEvent.getSource() == jButton){            JOptionPane.showMessageDialog(null,                    jTextField.getText().trim(),                    "Show Output",                    JOptionPane.INFORMATION_MESSAGE);            jButton.setEnabled(false);            jTextField.setEditable(false);        }    }    public static void main(String[] args) {        new MyTextField();    }}