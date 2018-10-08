import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class EraseTool implements Tool, MouseListener, MouseMotionListener {

    protected int xStart, yStart;
    protected Graphics onscreen, offscreen;


    @Override
    public void mousePressed(MouseEvent e) {
        Point p=e.getPoint();

        Lab1.canvas.mouseButtonDown = true;
        Lab1.canvas.x = p.x;
        Lab1.canvas.y = p.y;
        offscreen = Lab1.canvas.getOffScreenGraphics();
        offscreen.setColor(Color.white);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Point p=e.getPoint();

        Lab1.canvas.mouseButtonDown = false;
        Lab1.canvas.setPenColor(Lab1.canvas.penColor);

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point p=e.getPoint();

        if (Lab1.canvas.mouseButtonDown) {
            int xs, ys, dx, dy;
            xs = Math.min(Lab1.canvas.x, p.x) - 2;
            ys = Math.min(Lab1.canvas.y, p.y) - 2;
            dx = Math.abs(p.x - Lab1.canvas.x) +  6;
            dy = Math.abs(p.y - Lab1.canvas.y) +  6;
            offscreen.fillRect(xs, ys, dx, dy);
            Lab1.canvas.repaint(xs, ys, dx, dy);
            Lab1.canvas.x = p.x;
            Lab1.canvas.y = p.y;
        }

    }
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mouseMoved(MouseEvent e) {}
}
