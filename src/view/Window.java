package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import model.Path;
import model.Ticket;

public class Window extends JFrame implements ActionListener,ItemListener {

    //定义顶部需要的组件
    JLabel jl1, jl2;
    JComboBox box1;
    JButton jb1;
    JPanel jp1, jp_top;

    //定义中部需要的组件
    JTextArea jta;
    JScrollPane jsp;

    //定义底部需要的组件
    JPanel jp2, jp3, jp_bottom, jp4;
    JLabel jl3, jl4, jl5, jl6;
    JComboBox box2, box3;
    JTextField jtf1, jtf2;
    JButton jb2, jb3, jb_exit;

    Ticket ticket;
    ArrayList<Path> HeToGuang, GuangToHe, GuangToJiang, JiangToGuang;

    public Window() {

        //初始化顶部的组件
        jp1 = new JPanel();
        jp_top = new JPanel(new BorderLayout());
        jl1 = new JLabel("网上售票系统", JLabel.CENTER);
        jl1.setFont(new Font("Monospaced", Font.BOLD, 30));
        jl2 = new JLabel("选择路线：");
        box1 = new JComboBox();
        box1.addItem("和平--〉广州");
        box1.addItem("广州--〉和平");
        box1.addItem("江门--〉广州");
        box1.addItem("广州--〉江门");
        jb1 = new JButton("查询");

        //注册监听
        jb1.addActionListener(this);

        //依次加入到jp1
        jp1.add(jl2);
        jp1.add(box1);
        jp1.add(jb1);
        jp_top.add(jl1, "North");
        jp_top.add(jp1, "South");

        //初始化中部的组件
        jta = new JTextArea(50, 10);
        jsp = new JScrollPane(jta);
        jta.append("\n");

        //初始化底部组件
        jp_bottom = new JPanel(new BorderLayout());
        jp2 = new JPanel();
        jp3 = new JPanel();

        jl3 = new JLabel("班次：", JLabel.CENTER);
        box2 = new JComboBox();
        box2.addItem("2001");
        box2.addItem("2002");
        box2.addItem("2003");
        box2.addItem("2004");
        jl4 = new JLabel("票数：", JLabel.CENTER);
        jtf1 = new JTextField(5);
        jtf1.setText("0");
        jb2 = new JButton("1号窗购买");

        //注册监听
        jb2.addActionListener(this);

        jl5 = new JLabel("班次：", JLabel.CENTER);
        box3 = new JComboBox();
        box3.addItem("2001");
        box3.addItem("2002");
        box3.addItem("2003");
        box3.addItem("2004");
        jl6 = new JLabel("票数：", JLabel.CENTER);
        jtf2 = new JTextField(5);
        jtf2.setText("0");
        jb3 = new JButton("2号窗购买");

        //注册监听
        jb3.addActionListener(this);

        jb_exit = new JButton("退出");
        //Dimension d =new Dimension(20,10);
        //jb_exit.setSize(d);
        jb_exit.addActionListener(this);

        //依次加入到jp2    
        jp2.add(jl3);
        jp2.add(box2);
        jp2.add(jl4);
        jp2.add(jtf1);
        jp2.add(jb2);

        //依次加入到jp3    
        jp3.add(jl5);
        jp3.add(box3);
        jp3.add(jl6);
        jp3.add(jtf2);
        jp3.add(jb3);

        //退出按钮加入到jp4
        jp4 = new JPanel();
        jp4.add(jb_exit);

        jp_bottom.add(jp2, "North");
        jp_bottom.add(jp3, "Center");
        jp_bottom.add(jp4, "South");

        //初始化所有路线的班次
        //和平--〉广州
        HeToGuang = new ArrayList<Path>();
        Path htg2001 = new Path();
        htg2001.setPathId("2001");
        htg2001.setPathTime("7:00");
        htg2001.setPathTicket(100);
        htg2001.setPathPrice(35);
        Path htg2002 = new Path();
        htg2002.setPathId("2002");
        htg2002.setPathTime("8:30");
        htg2002.setPathTicket(100);
        htg2002.setPathPrice(35);
        Path htg2003 = new Path();
        htg2003.setPathId("2003");
        htg2003.setPathTime("12:30");
        htg2003.setPathTicket(100);
        htg2003.setPathPrice(35);
        Path htg2004 = new Path();
        htg2004.setPathId("2004");
        htg2004.setPathTime("15:00");
        htg2004.setPathTicket(100);
        htg2004.setPathPrice(35);
        HeToGuang.add(htg2001);
        HeToGuang.add(htg2002);
        HeToGuang.add(htg2003);
        HeToGuang.add(htg2004);

        //广州--〉和平
        GuangToHe = new ArrayList<Path>();
        Path gth2001 = new Path();
        gth2001.setPathId("2001");
        gth2001.setPathTime("7:00");
        gth2001.setPathTicket(100);
        gth2001.setPathPrice(35);
        Path gth2002 = new Path();
        gth2002.setPathId("2002");
        gth2002.setPathTime("8:30");
        gth2002.setPathTicket(100);
        gth2002.setPathPrice(35);
        Path gth2003 = new Path();
        gth2003.setPathId("2003");
        gth2003.setPathTime("12:30");
        gth2003.setPathTicket(100);
        gth2003.setPathPrice(35);
        Path gth2004 = new Path();
        gth2004.setPathId("2004");
        gth2004.setPathTime("15:00");
        gth2004.setPathTicket(100);
        gth2004.setPathPrice(35);
        GuangToHe.add(gth2001);
        GuangToHe.add(gth2002);
        GuangToHe.add(gth2003);
        GuangToHe.add(gth2004);

        //江门--〉广州
        JiangToGuang = new ArrayList<Path>();
        Path jtg2001 = new Path();
        jtg2001.setPathId("2001");
        jtg2001.setPathTime("7:00");
        jtg2001.setPathTicket(100);
        jtg2001.setPathPrice(35);
        Path jtg2002 = new Path();
        jtg2002.setPathId("2002");
        jtg2002.setPathTime("8:30");
        jtg2002.setPathTicket(100);
        jtg2002.setPathPrice(35);
        Path jtg2003 = new Path();
        jtg2003.setPathId("2003");
        jtg2003.setPathTime("12:30");
        jtg2003.setPathTicket(100);
        jtg2003.setPathPrice(35);
        Path jtg2004 = new Path();
        jtg2004.setPathId("2004");
        jtg2004.setPathTime("15:00");
        jtg2004.setPathTicket(100);
        jtg2004.setPathPrice(35);
        JiangToGuang.add(jtg2001);
        JiangToGuang.add(jtg2002);
        JiangToGuang.add(jtg2003);
        JiangToGuang.add(jtg2004);

        //广州--〉江门
        GuangToJiang = new ArrayList<Path>();
        Path gtj2001 = new Path();
        gtj2001.setPathId("2001");
        gtj2001.setPathTime("7:00");
        gtj2001.setPathTicket(100);
        gtj2001.setPathPrice(35);
        Path gtj2002 = new Path();
        gtj2002.setPathId("2002");
        gtj2002.setPathTime("8:30");
        gtj2002.setPathTicket(100);
        gtj2002.setPathPrice(35);
        Path gtj2003 = new Path();
        gtj2003.setPathId("2003");
        gtj2003.setPathTime("12:30");
        gtj2003.setPathTicket(100);
        gtj2003.setPathPrice(35);
        Path gtj2004 = new Path();
        gtj2004.setPathId("2004");
        gtj2004.setPathTime("15:00");
        gtj2004.setPathTicket(100);
        gtj2004.setPathPrice(35);
        GuangToJiang.add(gtj2001);
        GuangToJiang.add(gtj2002);
        GuangToJiang.add(gtj2003);
        GuangToJiang.add(gtj2004);

        //向ticket传递组件参数
        ticket = new Ticket();
        ticket.setPathCom(box1);
        ticket.setCom1(box2);
        ticket.setCom2(box3);
        ticket.setJtf1(jtf1);
        ticket.setJtf2(jtf2);
        ticket.setShowMessage(jta);

        //依次加入到JFrame
        this.add(jp_top, "North");
        this.add(jsp, "Center");
        this.add(jp_bottom, "South");

        this.setSize(450, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb2) {
            if (Integer.parseInt(jtf1.getText()) <= 0 || Integer.parseInt(jtf1.getText()) > 100) {
                JOptionPane.showMessageDialog(this, "输入有误，请重新输入");
                return;
            }
            if (box1.getSelectedItem().toString().equals("和平--〉广州")) {
                ticket.setList(HeToGuang);
            } else if (box1.getSelectedItem().toString().equals("广州--〉和平")) {
                ticket.setList(GuangToHe);
            } else if (box1.getSelectedItem().toString().equals("江门--〉广州")) {
                ticket.setList(JiangToGuang);
            } else if (box1.getSelectedItem().toString().equals("广州--〉江门")) {
                ticket.setList(GuangToJiang);
            }
            Thread ticket1;
            ticket1 = new Thread(ticket);
            ticket1.setName("1号窗");
            ticket1.start();
        } else if (e.getSource() == jb3) {
            if (Integer.parseInt(jtf2.getText()) <= 0 ) {
                JOptionPane.showMessageDialog(this, "输入有误，请重新输入");
                jtf2.setText("0");
                return;
            }
            if (box1.getSelectedItem().toString().equals("和平--〉广州")) {
                ticket.setList(HeToGuang);
            } else if (box1.getSelectedItem().toString().equals("广州--〉和平")) {
                ticket.setList(GuangToHe);
            } else if (box1.getSelectedItem().toString().equals("江门--〉广州")) {
                ticket.setList(JiangToGuang);
            } else if (box1.getSelectedItem().toString().equals("广州--〉江门")) {
                ticket.setList(GuangToJiang);
            }
            Thread ticket2;
            ticket2 = new Thread(ticket);
            ticket2.setName("2号窗");
            ticket2.start();
        } else if (e.getSource() == jb1) {
            //查询剩余票数
            if (box1.getSelectedItem().toString().equals("和平--〉广州")) {
                jta.append("和平--〉广州");
                jta.append("\n");
                jta.append("班次    时间    剩票    价格");
                jta.append("\n");
                for (int i = 0; i < 4; i++) {
                    Path pathTemp = HeToGuang.get(i);
                    jta.append(pathTemp.getPathId() + "   " + pathTemp.getPathTime() + "  " + pathTemp.getPathTicket() + "    " + pathTemp.getPathPrice());
                    jta.append("\n");
                }
                jta.append("\n");
            } else if (box1.getSelectedItem().toString().equals("广州--〉和平")) {
                jta.append("广州--〉和平");
                jta.append("\n");
                jta.append("班次    时间    剩票    价格");
                jta.append("\n");
                for (int i = 0; i < 4; i++) {
                    Path pathTemp = GuangToHe.get(i);
                    jta.append(pathTemp.getPathId() + "   " + pathTemp.getPathTime() + "  " + pathTemp.getPathTicket() + "    " + pathTemp.getPathPrice());
                    jta.append("\n");
                }
                jta.append("\n");
            } else if (box1.getSelectedItem().toString().equals("江门--〉广州")) {
                jta.append("江门--〉广州");
                jta.append("\n");
                jta.append("班次    时间    剩票    价格");
                jta.append("\n");
                for (int i = 0; i < 4; i++) {
                    Path pathTemp = JiangToGuang.get(i);
                    jta.append(pathTemp.getPathId() + "   " + pathTemp.getPathTime() + "  " + pathTemp.getPathTicket() + "    " + pathTemp.getPathPrice());
                    jta.append("\n");
                }
                jta.append("\n");
            } else if (box1.getSelectedItem().toString().equals("广州--〉江门")) {
                jta.append("广州--〉江门");
                jta.append("\n");
                jta.append("班次    时间    剩票    价格");
                jta.append("\n");
                for (int i = 0; i < 4; i++) {
                    Path pathTemp = GuangToJiang.get(i);
                    jta.append(pathTemp.getPathId() + "   " + pathTemp.getPathTime() + "  " + pathTemp.getPathTicket() + "    " + pathTemp.getPathPrice());
                    jta.append("\n");
                }
                jta.append("\n");
            }
        } else if (e.getSource() == jb_exit) {
            this.dispose();
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       
    }

}
