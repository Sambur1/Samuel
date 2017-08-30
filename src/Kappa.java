
import java.awt.*;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;



class MyCanvas extends JComponent {

    public void paint(Graphics g) {
        g.drawRect (40, 30, 400, 400);
        g.setColor(Color.BLUE);
        g.fillRect(45, 35, 390, 390);
        g.setColor(Color.GREEN);
        g.fillRect(45, 250, 390 , 180);
        g.setColor(Color.RED);
        g.fillRect(70, 270, 100 , 100);
        g.setColor(Color.BLACK);



        {
            int xpoints[] = {190, 50, 120};
            int ypoints[] = {290, 290, 220};
            int npoints = 3;

            g.fillPolygon(xpoints, ypoints, npoints);
        }




    }

}

class DrawRect {
    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 500, 500);
        window.getContentPane().add(new MyCanvas());
        window.setVisible(true);
    }
}
