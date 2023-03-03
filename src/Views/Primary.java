package Views;
import Currency.Currency;
import Info.Info;
import Temps.Temps;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Primary extends JFrame{
    JFrame frame;
    JTextArea area;
    JButton btnA, btnB;
    JMenuItem currency, temps, about;
    JMenu menu;
    JPanel primary, pnlCurrency, pnlInfo, pnlTemps;
    ListenButton listener;
    public void Primary() {

        String path = System.getProperty("user.dir");
        // Create panel
        frame = new JFrame();
        frame.setTitle("Conversor");
        frame.setSize(360, 260);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        // options
        JMenuBar nav = new JMenuBar();
        menu = new JMenu("Menú");
        currency = new JMenuItem("Moneda");
        temps = new JMenuItem("Temperaturas");
        about = new JMenuItem("Acerca De");
        menu.add(currency);
        menu.add(temps);
        menu.add(about);
        nav.add(menu);
        frame.setJMenuBar(nav);

        // add icon app
        ImageIcon img = new ImageIcon(path+ "/src/assets/currency.png");
        ImageIcon img2 = new ImageIcon(path+ "/src/assets/temps.png");
        frame.setIconImage(img.getImage());

        // front
        area = new JTextArea();
        area.setText("Conversor de Moneda y"+"\n" +"Temperatura");
        area.setEnabled(false);
        area.setBounds(13,10,320,200);
        area.setFont(new Font("FreeSans", Font.BOLD, 22));
        area.setBorder(BorderFactory.createLineBorder(new Color(40, 115, 206)));

        // add padding
        area.setBorder(BorderFactory.createCompoundBorder(area.getBorder(),
                BorderFactory.createEmptyBorder(5,5,5,5)
        ));

        primary = new JPanel();
        primary.add(area);
        primary.setLayout(null);
        primary.setBounds(0, 0, 360, 250);
        frame.getContentPane().add(primary);

        pnlCurrency = new JPanel();
        pnlCurrency.setLayout(null);
        pnlCurrency.setBounds(0, 0, 360, 250);
        frame.getContentPane().add(pnlCurrency);

        pnlInfo = new JPanel();
        pnlInfo.setLayout(null);
        pnlInfo.setBounds(0, 0, 360, 250);
        frame.getContentPane().add(pnlInfo);

        pnlTemps = new JPanel();
        pnlTemps.setLayout(null);
        pnlTemps.setBounds(0, 0, 360, 250);
        frame.getContentPane().add(pnlTemps);

        // actions listener
        listener = new ListenButton();
        menu.addActionListener(listener);
        currency.addActionListener(listener);
        temps.addActionListener(listener);
        about.addActionListener(listener);
        // active frame
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public class ListenButton implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == about){
                pnlCurrency.setVisible(false);
                primary.setVisible(false);
                pnlTemps.setVisible(false);
                frame.setTitle("Acerca De");
                Info info = new Info();
                info.Info(pnlInfo);
            }
            if(e.getSource() == currency){
                primary.setVisible(false);
                pnlTemps.setVisible(false);
                pnlInfo.setVisible(false);
                frame.setTitle("Conversor de Moneda");
                Currency currency = new Currency();
                currency.Currency(frame, pnlCurrency);
            }
            if(e.getSource() == temps){
                pnlCurrency.setVisible(false);
                primary.setVisible(false);
                pnlInfo.setVisible(false);
                frame.setTitle("Conversor de Temperatura");
                Temps temps = new Temps();
                temps.Temps(frame, pnlTemps);
            }
        }
    }
}
