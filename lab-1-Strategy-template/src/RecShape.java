import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;

public class RecShape implements Tool, MouseListener, MouseMotionListener {

    protected int xStart, yStart;
    protected Graphics onscreen, offscreen;


    @Override
    public void mousePressed(MouseEvent e) {
        Point p=e.getPoint();

        Lab1.canvas.mouseButtonDown = true;
        xStart = Lab1.canvas.x = p.x;
        yStart = Lab1.canvas.y = p.y;
        onscreen = Lab1.canvas.getGraphics();
        onscreen.setXORMode(Color.darkGray);
        onscreen.setColor(Color.lightGray);
        onscreen.drawRect(xStart, yStart, 1, 1);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Point p=e.getPoint();

        Lab1.canvas.mouseButtonDown = false;
        onscreen.setPaintMode();
        offscreen = Lab1.canvas.getOffScreenGraphics();
        offscreen.drawRect(xStart, yStart, p.x-xStart+1, p.y-yStart+1);
        Lab1.canvas.repaint();

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point p=e.getPoint();

        if (Lab1.canvas.mouseButtonDown) {
            onscreen.drawRect(xStart, yStart, Lab1.canvas.x - xStart + 1, Lab1.canvas.y - yStart + 1);
            onscreen.drawRect(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);
        }
        Lab1.canvas.x = p.x;
        Lab1.canvas.y = p.y;

    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
}
