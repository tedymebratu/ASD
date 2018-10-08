/*
import java.awt.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class TwoEndsTool implements Tool{



    @Override
    public void mousePressed(Point p,ScribbleCanvas canvas,Graphics onscreen,Graphics offscreen,int xStart, int yStart) {
        if(1==1){//for line tool
            canvas.mouseButtonDown = true;
            xStart = canvas.x = p.x;
            yStart = canvas.y = p.y;
            onscreen = canvas.getGraphics();
            onscreen.setXORMode(Color.darkGray);
            onscreen.setColor(Color.lightGray);
            onscreen.drawLine(xStart, yStart, xStart, yStart);
        }else {
            canvas.mouseButtonDown = true;
            xStart = canvas.x = p.x;
            yStart = canvas.y = p.y;
            onscreen = canvas.getGraphics();
            onscreen.setXORMode(Color.darkGray);
            onscreen.setColor(Color.lightGray);
            onscreen.drawRect(xStart, yStart, 1, 1);
        }

    }

    @Override
    public void mouseReleased(Point p,ScribbleCanvas canvas,Graphics onscreen,Graphics offscreen,int xStart, int yStart) {
        if(1==1) {
            canvas.mouseButtonDown = false;
            onscreen.setPaintMode();
            offscreen = canvas.getOffScreenGraphics();
            offscreen.drawLine(xStart, yStart, p.x, p.y);
            canvas.repaint();

        } else {
            canvas.mouseButtonDown = false;
            onscreen.setPaintMode();
            offscreen = canvas.getOffScreenGraphics();
            offscreen.drawRect(xStart, yStart, p.x-xStart+1, p.y-yStart+1);
            canvas.repaint();
        }

    }

    @Override
    public void mouseDragged(Point p,ScribbleCanvas canvas,Graphics onscreen,Graphics offscreen,int xStart, int yStart) {
        if(1==1) {
            if (canvas.mouseButtonDown) {
                onscreen.drawLine(xStart, yStart, canvas.x, canvas.y);
                onscreen.drawLine(xStart, yStart, p.x, p.y);
            }
            canvas.x = p.x;
            canvas.y = p.y;

        } else {
            if (canvas.mouseButtonDown) {
                onscreen.drawRect(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1);
                onscreen.drawRect(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);
            }
            canvas.x = p.x;
            canvas.y = p.y;
        }

    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
}
*/
