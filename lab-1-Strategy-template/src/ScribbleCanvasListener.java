import java.awt.*;
import java.awt.event.*;

public class ScribbleCanvasListener 
    implements MouseListener, MouseMotionListener {
        

  protected Lab1 drawframe;
  protected ScribbleCanvas canvas; 
  protected int xStart, yStart; 
  protected Graphics onscreen, offscreen;
  protected Tool tool;

  public ScribbleCanvasListener(ScribbleCanvas canvas, Lab1 drawframe) {
    this.canvas = canvas;
    this.drawframe=drawframe;

  }

  public void mousePressed(MouseEvent e) {
    Point p = e.getPoint();
    switch (drawframe.getCurrentTool()){
        case 0: // handle mouse pressed for scribble tool
            /*canvas.mouseButtonDown = true;
            canvas.x = p.x; 
            canvas.y = p.y;*/
            tool=new ScribbleTool();
            tool.mouseDragged(e);
            break;
        case 1:  // handle mouse pressed for line tool
            /*canvas.mouseButtonDown = true;
            xStart = canvas.x = p.x;
            yStart = canvas.y = p.y;
            onscreen = canvas.getGraphics();
            onscreen.setXORMode(Color.darkGray);
            onscreen.setColor(Color.lightGray);
            onscreen.drawLine(xStart, yStart, xStart, yStart);*/
            tool=new LineShape();
            tool.mouseDragged(e);
            break;
        case 2:// handle mouse pressed for rectangle tool
            /*canvas.mouseButtonDown = true;
            xStart = canvas.x = p.x;
            yStart = canvas.y = p.y;
            onscreen = canvas.getGraphics();
            onscreen.setXORMode(Color.darkGray);
            onscreen.setColor(Color.lightGray);
            onscreen.drawRect(xStart, yStart, 1, 1);*/
            tool=new RecShape();
            tool.mouseDragged(e);
            break;
        case 3:// handle mouse pressed for oval tool
            /*canvas.mouseButtonDown = true;
            xStart = canvas.x = p.x;
            yStart = canvas.y = p.y;
            onscreen = canvas.getGraphics();
            onscreen.setXORMode(Color.darkGray);
            onscreen.setColor(Color.lightGray);

            onscreen.drawOval(xStart, yStart, 1, 1);*/
            tool=new OvalShape();
            tool.mouseDragged(e);
            break;
        case 4:// handle mouse pressed for eraser tool
            /*canvas.mouseButtonDown = true;
            canvas.x = p.x;
            canvas.y = p.y;
            offscreen = canvas.getOffScreenGraphics();
            offscreen.setColor(Color.white);*/
            tool=new EraseTool();
            tool.mouseDragged(e);
            break;
    }
  } 

  public void mouseReleased(MouseEvent e) {
    Point p = e.getPoint(); 
    switch (drawframe.getCurrentTool()){
        case 0: // handle mouse released for scribble tool
            /*canvas.mouseButtonDown = false;*/
            tool=new ScribbleTool();
            tool.mouseReleased(e);

            break;
        case 1:// handle mouse released for line tool
            /*canvas.mouseButtonDown = false;
            onscreen.setPaintMode();
            offscreen = canvas.getOffScreenGraphics(); 
            offscreen.drawLine(xStart, yStart, p.x, p.y); 
            canvas.repaint();*/
            tool=new LineShape();
            tool.mouseReleased(e);

            break;
        case 2:// handle mouse released for rectangle tool
            /*canvas.mouseButtonDown = false;
            onscreen.setPaintMode();
            offscreen = canvas.getOffScreenGraphics(); 
            offscreen.drawRect(xStart, yStart, p.x-xStart+1, p.y-yStart+1); 
            canvas.repaint();*/
            tool=new RecShape();
            tool.mouseReleased(e);

            break;
        case 3:// handle mouse released for oval tool
            /*canvas.mouseButtonDown = false;
            onscreen.setPaintMode();
            offscreen = canvas.getOffScreenGraphics(); 
            offscreen.drawOval(xStart, yStart, p.x-xStart+1, p.y-yStart+1); 
            canvas.repaint();*/
            tool=new OvalShape();
            tool.mouseReleased(e);
            break;
        case 4:// handle mouse released for eraser tool
            /*canvas.mouseButtonDown = false;
            canvas.setPenColor(canvas.penColor);*/
            tool=new OvalShape();
            tool.mouseReleased(e);
            break;
    }       
  }    

  public void mouseDragged(MouseEvent e) {
    Point p = e.getPoint(); 
    switch (drawframe.getCurrentTool()){
        case 0: // handle mouse dragged for scribble tool
            /*if (canvas.mouseButtonDown) {
            canvas.getOffScreenGraphics().drawLine(canvas.x, canvas.y, p.x, p.y); 
            int xs = Math.min(canvas.x, p.x); 
            int ys = Math.min(canvas.y, p.y); 
            int dx = Math.abs(p.x-canvas.x) +1;
            int dy = Math.abs(p.y-canvas.y) +1; 
            canvas.repaint(xs, ys, dx, dy); 
            canvas.x = p.x; 
            canvas.y = p.y; 
            }*/
            tool=new ScribbleTool();
            tool.mouseDragged(e);
            break;
        case 1:// handle mouse dragged for line tool
           /* if (canvas.mouseButtonDown) {
                onscreen.drawLine(xStart, yStart, canvas.x, canvas.y); 
                onscreen.drawLine(xStart, yStart, p.x, p.y);
            }
            canvas.x = p.x; 
            canvas.y = p.y;*/
           tool=new LineShape();
            tool.mouseDragged(e);
           break;
        case 2:// handle mouse dragged for rectangle tool
           /* if (canvas.mouseButtonDown) {
                onscreen.drawRect(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1);  
                onscreen.drawRect(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1); 
            }
            canvas.x = p.x; 
            canvas.y = p.y;*/
           tool=new RecShape();
            tool.mouseDragged(e);
            break;
        case 3:// handle mouse dragged for oval tool
           /* if (canvas.mouseButtonDown) {
                onscreen.drawOval(xStart, yStart, canvas.x - xStart + 1, canvas.y - yStart + 1); 
                onscreen.drawOval(xStart, yStart, p.x - xStart + 1, p.y - yStart + 1);  
            }
            canvas.x = p.x; 
            canvas.y = p.y;*/
           tool=new OvalShape();
            tool.mouseDragged(e);
            break;
        case 4:// handle mouse dragged for eraser tool
            /*if (canvas.mouseButtonDown) {
                int xs, ys, dx, dy; 
                xs = Math.min(canvas.x, p.x) - 2;
                ys = Math.min(canvas.y, p.y) - 2;
                dx = Math.abs(p.x - canvas.x) +  6;
                dy = Math.abs(p.y - canvas.y) +  6;
                offscreen.fillRect(xs, ys, dx, dy); 
                canvas.repaint(xs, ys, dx, dy); 
                canvas.x = p.x; 
                canvas.y = p.y;
            }*/
            tool=new EraseTool();
            tool.mouseDragged(e);


    }       
  }

  public void mouseClicked(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}  
  public void mouseExited(MouseEvent e) {}
  public void mouseMoved(MouseEvent e) {}     

  
}

