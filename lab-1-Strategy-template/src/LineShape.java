import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.List;

public class LineShape implements Tool, MouseListener, MouseMotionListener {

    protected int xStart, yStart;
    protected Graphics onscreen, offscreen;

    public LineShape() {
        this.xStart = xStart;
        this.yStart = yStart;
        this.onscreen = onscreen;
        this.offscreen = offscreen;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point p=e.getPoint();
        Lab1.canvas.mouseButtonDown = true;
        xStart = Lab1.canvas.x = p.x;
        yStart = Lab1.canvas.y = p.y;
        onscreen = Lab1.canvas.getGraphics();
        onscreen.setXORMode(Color.darkGray);
        onscreen.setColor(Color.lightGray);
        onscreen.drawLine(xStart, yStart, xStart, yStart);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Point p=e.getPoint();

        Lab1.canvas.mouseButtonDown = false;
        onscreen.setPaintMode();
        offscreen = Lab1.canvas.getOffScreenGraphics();
        offscreen.drawLine(xStart, yStart, p.x, p.y);
        Lab1.canvas.repaint();

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point p=e.getPoint();

        if (Lab1.canvas.mouseButtonDown) {
            onscreen.drawLine(xStart, yStart, Lab1.canvas.x, Lab1.canvas.y);
            onscreen.drawLine(xStart, yStart, p.x, p.y);
        }
        Lab1.canvas.x = p.x;
        Lab1.canvas.y = p.y;

    }

    public void mouseMoved(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

}
