package lecture;

import java.awt.*;
import java.awt.event.*;

public class whitelistapp extends Frame implements MouseListener, MouseMotionListener {
    String msg = "";
    int mouseX = 0, mouseY = 0;
    public whitelistapp(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MywindowAdapter());
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        msg = msg + " = click received";
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button down";
        repaint();
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button Released";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse entered . ";
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button down";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*" + "mouse at " + mouseX + ", " + mouseY;
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        msg = "Moving mouse at " + me.getX() + " , " + me.getY();
        repaint();
    }
    public void paint (Graphics g){
        g.drawString(msg, mouseX, mouseY);
    }
    public static void main(String[] hello){
        whitelistapp appwin = new whitelistapp();
        appwin.setSize(new Dimension(300, 300));
        appwin.setTitle("Mouse");
        appwin.setVisible(true);
    }
}
class MywindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent we){
        System.exit(0);
    }
}