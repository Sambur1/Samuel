import javax.swing.*;
import java.awt.*;

class Kappa {
    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(60, 30, 300, 300);
        window.getContentPane().add(new MyCanvas());
        window.setVisible(true);
    }

    private static class MyCanvas extends Component {
    }
}
