package model;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ticket extends Thread {

    //获得控件
    JComboBox pathCom, com1, com2;
    JTextField jtf1, jtf2;
    JTextArea showMessage;
    ArrayList<Path> list = null;
    
    
    public JComboBox getPathCom() {
        return pathCom;
    }

    public void setPathCom(JComboBox pathCom) {
        this.pathCom = pathCom;
    }

    public JComboBox getCom1() {
        return com1;
    }

    public void setCom1(JComboBox com1) {
        this.com1 = com1;
    }

    public JComboBox getCom2() {
        return com2;
    }

    public void setCom2(JComboBox com2) {
        this.com2 = com2;
    }

    public JTextField getJtf1() {
        return jtf1;
    }

    public void setJtf1(JTextField jtf1) {
        this.jtf1 = jtf1;
    }

    public JTextField getJtf2() {
        return jtf2;
    }

    public void setJtf2(JTextField jtf2) {
        this.jtf2 = jtf2;
    }

    public JTextArea getShowMessage() {
        return showMessage;
    }

    public void setShowMessage(JTextArea showMessage) {
        this.showMessage = showMessage;
    }

    public ArrayList<Path> getList() {
        return list;
    }

    public void setList(ArrayList<Path> list) {
        this.list = list;
    }

    public void run() {
        synchronized (this) {
            
            if (Thread.currentThread().getName().equals("1号窗")) {
                int ticketCount = Integer.parseInt(jtf1.getText());
                for (int i = 0; i < 4; i++) {
                    Path pathTemp = list.get(i);
                    if (com1.getSelectedItem().toString() == "2001" && pathTemp.getPathId() == "2001") {
                        int ticket = pathTemp.getPathTicket();
                        if (ticket - ticketCount >= 0) {
                            ticket = ticket - ticketCount;
                            pathTemp.setPathTicket(ticket);
                            showMessage.append(Thread.currentThread().getName() + "售票，2001号列车，车票剩余：" + ticket);
                            showMessage.append("\n");
                        } else {
                            showMessage.append("车票剩余不足，请查询具体班次列车剩余车票");
                            showMessage.append("\n");
                        }
                    }
                    if (com1.getSelectedItem().toString() == "2002" && pathTemp.getPathId() == "2002") {
                        int ticket = pathTemp.getPathTicket();
                        if (ticket - ticketCount >= 0) {
                            ticket = ticket - ticketCount;
                            pathTemp.setPathTicket(ticket);
                            showMessage.append(Thread.currentThread().getName() + "售票，2002号列车，车票剩余：" + ticket);
                            showMessage.append("\n");
                        } else {
                            showMessage.append("车票剩余不足，请查询具体班次列车剩余车票");
                            showMessage.append("\n");
                        }
                    }
                    if (com1.getSelectedItem().toString() == "2003" && pathTemp.getPathId() == "2003") {
                        int ticket = pathTemp.getPathTicket();
                        if (ticket - ticketCount >= 0) {
                            ticket = ticket - ticketCount;
                            pathTemp.setPathTicket(ticket);
                            showMessage.append(Thread.currentThread().getName() + "售票，2003号列车，车票剩余：" + ticket);
                            showMessage.append("\n");
                        } else {
                            showMessage.append("车票剩余不足，请查询具体班次列车剩余车票");
                            showMessage.append("\n");
                        }
                    }
                    if (com1.getSelectedItem().toString() == "2004" && pathTemp.getPathId() == "2004") {
                        int ticket = pathTemp.getPathTicket();
                        if (ticket - ticketCount >= 0) {
                            ticket = ticket - ticketCount;
                            pathTemp.setPathTicket(ticket);
                            showMessage.append(Thread.currentThread().getName() + "售票，2004号列车，车票剩余：" + ticket);
                            showMessage.append("\n");
                        } else {
                            showMessage.append("车票剩余不足，请查询具体班次列车剩余车票");
                            showMessage.append("\n");
                        }
                    }
                }
            } else if (Thread.currentThread().getName().equals("2号窗")) {
                int ticketCount = Integer.parseInt(jtf2.getText());
                for (int i = 0; i < 4; i++) {
                    Path pathTemp = list.get(i);
                    if (com2.getSelectedItem().toString() == "2001" && pathTemp.getPathId() == "2001") {
                        int ticket = pathTemp.getPathTicket();
                        if (ticket - ticketCount >= 0) {
                            ticket = ticket - ticketCount;
                            pathTemp.setPathTicket(ticket);
                            showMessage.append(Thread.currentThread().getName() + "售票，2001号列车，车票剩余：" + ticket);
                            showMessage.append("\n");
                        } else {
                            showMessage.append("车票剩余不足，请查询具体班次列车剩余车票");
                            showMessage.append("\n");
                        }
                    }
                    if (com2.getSelectedItem().toString() == "2002" && pathTemp.getPathId() == "2002") {
                        int ticket = pathTemp.getPathTicket();
                        if (ticket - ticketCount >= 0) {
                            ticket = ticket - ticketCount;
                            pathTemp.setPathTicket(ticket);
                            showMessage.append(Thread.currentThread().getName() + "售票，2002号列车，车票剩余：" + ticket);
                            showMessage.append("\n");
                        } else {
                            showMessage.append("车票剩余不足，请查询具体班次列车剩余车票");
                            showMessage.append("\n");
                        }
                    }
                    if (com2.getSelectedItem().toString() == "2003" && pathTemp.getPathId() == "2003") {
                        int ticket = pathTemp.getPathTicket();
                        if (ticket - ticketCount >= 0) {
                            ticket = ticket - ticketCount;
                            pathTemp.setPathTicket(ticket);
                            showMessage.append(Thread.currentThread().getName() + "售票，2003号列车，车票剩余：" + ticket);
                            showMessage.append("\n");
                        } else {
                            showMessage.append("车票剩余不足，请查询具体班次列车剩余车票");
                            showMessage.append("\n");
                        }
                    }
                    if (com2.getSelectedItem().toString() == "2004" && pathTemp.getPathId() == "2004") {
                        int ticket = pathTemp.getPathTicket();
                        if (ticket - ticketCount >= 0) {
                            ticket = ticket - ticketCount;
                            pathTemp.setPathTicket(ticket);
                            showMessage.append(Thread.currentThread().getName() + "售票，2004号列车，车票剩余：" + ticket);
                            showMessage.append("\n");
                        } else {
                            showMessage.append("车票剩余不足，请查询具体班次列车剩余车票");
                            showMessage.append("\n");
                        }
                    }
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
