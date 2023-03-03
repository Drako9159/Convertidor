package Info;
import Views.Primary;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class Info extends Primary{
    JLabel lblGit, lblWeb, message;
    public void Info(JFrame frame) {
        frame.setTitle("Acerca De");
        //frame.setVisible(true);

        message = new JLabel("Converter created by Antonio Jaramillo");
        message.setBounds(70,20,260,30);

        lblGit = new JLabel("github");
        lblGit.setText("<html> <a href=\" https://github.com/Drako9159 \">github</a> </html>");
        lblGit.setBounds(160,40,200,30);

        lblWeb = new JLabel("webpage");
        lblWeb.setText("<html> <a href=\" https://www.drako.icu \">webpage</a> </html>");
        lblWeb.setBounds(155,60,200,30);

        frame.add(message);
        frame.add(lblGit);
        frame.add(lblWeb);
        frame.repaint();

        lblGit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me){
                lblGit.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent me){
                lblGit.setCursor(Cursor.getDefaultCursor());
            }
            public void mouseClicked(MouseEvent me){
                try {
                    Desktop.getDesktop().browse(new URI("https://github.com/Drako9159"));
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        });
        lblWeb.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me){
                lblWeb.setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
            public void mouseExited(MouseEvent me){
                lblWeb.setCursor(Cursor.getDefaultCursor());
            }
            public void mouseClicked(MouseEvent me){
                try {
                    Desktop.getDesktop().browse(new URI("https://www.drako.icu"));
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        });
    }
}
