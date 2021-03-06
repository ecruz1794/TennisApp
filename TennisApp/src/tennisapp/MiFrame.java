package tennisApp;
import Library.*;
import Logic.ArcadeDrawingAlg;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class MiFrame extends JFrame { 
 
    public MiFrame() { 
        super("¡Hola mundo con ventanas!"); 
        //setBackground(Color.orange); 
        setSize(500,500); 
        setVisible(true); 
    } 
    
    public void paint(Graphics g) {
        g.drawArc(200, 150,70, 80, 180, 135);
        g.drawLine(123, 400, 400, 200);
        ArcadeDrawingAlg example = new ArcadeDrawingAlg();
        List<Figure> figList = new ArrayList();
        Circle c = new Circle(150,30,50);
        c.setFill(true);
        c.setColor(Color.CYAN);
        c.setStroke(Color.MAGENTA);
        c.setStroke_Thickness(3);
        figList.add(c);

        example.drawFigures(figList, g);
    } 
    public static void main(String args[]) { 
        MiFrame mf = new MiFrame(); 

        mf.addWindowListener( new WindowAdapter() { 
        public void windowClosing( WindowEvent evt ){ 
        System.exit( 0 );} 
        }); 
    }
} 