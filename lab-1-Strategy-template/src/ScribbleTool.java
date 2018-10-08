import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ScribbleTool implements Tool,MouseListener,MouseMotionListener {

    protected int xStart, yStart;
    protected Graphics onscreen, offscreen;


    /*@Override
    public void mousePressed(Point p,ScribbleCanvas canvas,Graphics onscreen,Graphics offscreen,int xStart, int yStart) {

        canvas.mouseButtonDown = true;
        canvas.x = p.x;
        canvas.y = p.y;

    }*/

    /*@Override
    public void mouseReleased(Point p,ScribbleCanvas canvas,Graphics onscreen,Graphics offscreen,int xStart, int yStart) {
        canvas.mouseButtonDown = false;
        onscreen = canvas.getGraphics();
        onscreen.setPaintMode();
        offscreen = canvas.getOffScreenGraphics();
        offscreen.drawLine(xStart, yStart, p.x, p.y);
        canvas.repaint();

    }*/

    /*@Override
    public void mouseDragged(Point p,ScribbleCanvas canvas,Graphics onscreen,Graphics offscreen,int xStart, int yStart) {
        if (canvas.mouseButtonDown) {
            canvas.getOffScreenGraphics().drawLine(canvas.x, canvas.y, p.x, p.y);
            int xs = Math.min(canvas.x, p.x);
            int ys = Math.min(canvas.y, p.y);
            int dx = Math.abs(p.x-canvas.x) +1;
            int dy = Math.abs(p.y-canvas.y) +1;
            canvas.repaint(xs, ys, dx, dy);
            canvas.x = p.x;
            canvas.y = p.y;
        }

    }*/



    @Override
    public void mousePressed(MouseEvent e) {
        Point p=e.getPoint();
        Lab1.canvas.mouseButtonDown = true;
        Lab1.canvas.x = p.x;
        Lab1.canvas.y = p.y;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Point p=e.getPoint();
        Lab1.canvas.mouseButtonDown = false;
        onscreen = Lab1.canvas.getGraphics();
        onscreen.setPaintMode();
        offscreen = Lab1.canvas.getOffScreenGraphics();
        offscreen.drawLine(xStart, yStart, p.x, p.y);
        Lab1.canvas.repaint();

    }



    @Override
    public void mouseDragged(MouseEvent e) {
        Point p=e.getPoint();
        if (Lab1.canvas.mouseButtonDown) {
            Lab1.canvas.getOffScreenGraphics().drawLine(Lab1.canvas.x, Lab1.canvas.y, p.x, p.y);
            int xs = Math.min(Lab1.canvas.x, p.x);
            int ys = Math.min(Lab1.canvas.y, p.y);
            int dx = Math.abs(p.x- Lab1.canvas.x) +1;
            int dy = Math.abs(p.y- Lab1.canvas.y) +1;
            Lab1.canvas.repaint(xs, ys, dx, dy);
            Lab1.canvas.x = p.x;
            Lab1.canvas.y = p.y;
        }

    }

    public void mouseMoved(MouseEvent e) {}
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
}
