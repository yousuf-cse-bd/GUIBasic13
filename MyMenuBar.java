package GUIBasic13;import javax.swing.*;import java.awt.*;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import java.awt.event.KeyEvent;/** * JMenuBar-> JMenu-> JMenuItem */class MenuBar extends JFrame implements ActionListener{    JMenuBar jMenuBar;    JMenuItem loadItem;    JMenuItem saveItem;    JMenuItem exitItem;    JMenu fileMenu;    JMenu editMenu;    JMenu helpMenu;    MenuBar(){        jMenuBar = new JMenuBar();        fileMenu = new JMenu("File");        editMenu = new JMenu("Edit");        helpMenu = new JMenu("Help");        loadItem = new JMenuItem("Load");        saveItem = new JMenuItem("Save");        exitItem = new JMenuItem("Exit");        /*Add action listener*/        loadItem.addActionListener(this);        saveItem.addActionListener(this);        exitItem.addActionListener(this);        loadItem.setMnemonic(KeyEvent.VK_L); /*l for load*/        saveItem.setMnemonic(KeyEvent.VK_S); /*l for save*/        exitItem.setMnemonic(KeyEvent.VK_E); /*l for exit*/        fileMenu.setMnemonic(KeyEvent.VK_F); /*Alt + f -> for file*/        editMenu.setMnemonic(KeyEvent.VK_E); /*Alt + e -> for edit*/        helpMenu.setMnemonic(KeyEvent.VK_H); /*Alt + h -> for help*/        fileMenu.add(loadItem);        fileMenu.add(saveItem);        fileMenu.add(exitItem);        jMenuBar.add(fileMenu);        jMenuBar.add(editMenu);        jMenuBar.add(helpMenu);        this.setJMenuBar(jMenuBar);        this.setTitle("Menu bar example");        this.setSize(500, 500);        this.setLocation(720, 100);        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        this.setLayout(new FlowLayout());        this.getContentPane().setBackground(Color.DARK_GRAY);        this.setVisible(true);    }    @Override    public void actionPerformed(ActionEvent e) {        if(e.getSource() == loadItem){            System.out.println("Pressed load item");        }        else if(e.getSource() == saveItem){            System.out.println("Pressed save item");        }        else if(e.getSource() == exitItem){           System.exit(0);        }    }}public class MyMenuBar {    public static void main(String[] args) {        new MenuBar();    }}