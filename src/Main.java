import javax.swing.*;
import Views.Primary;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;

public class Main {
    public static void main(String[] args) {

        // apply look & feel
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            UIManager.setLookAndFeel(new FlatMaterialDeepOceanIJTheme());
           // UIManager.setLookAndFeel(new FlatMaterialLighterIJTheme());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        new Primary().primary();
        // active conversor

/*
        JFrame frame = new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);


        frame.setSize(400, 300);
        frame.setVisible(true);*/
    }
}