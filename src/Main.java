import javax.swing.*;
import Views.Primary;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
public class Main {
    public static void main(String[] args) {
        // apply look & feel
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
            UIManager.setLookAndFeel(new FlatMaterialDeepOceanIJTheme());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        // active conversor
        new Primary().primary();
    }
}