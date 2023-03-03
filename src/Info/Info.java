package Info;
import Views.Primary;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class Info extends Primary{
    JLabel lblGit, lblWeb, message, date;
    public void Info(JPanel panel) {

        message = new JLabel("Converter created by Antonio Jaramillo");
        message.setBounds(70,10,260,30);

        date = new JLabel("creation 03/03/2023");
        date.setBounds(120,30,260,30);

        lblGit = new JLabel("github");
        lblGit.setText("<html> <a href=\" https://github.com/Drako9159 \">github</a> </html>");
        lblGit.setBounds(160,50,200,30);

        lblWeb = new JLabel("webpage");
        lblWeb.setText("<html> <a href=\" https://www.drako.icu \">webpage</a> </html>");
        lblWeb.setBounds(155,70,200,30);

        panel.add(message);
        panel.add(date);
        panel.setVisible(true);
        panel.add(lblGit);
        panel.add(lblWeb);

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
