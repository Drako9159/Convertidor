package Views;
import Currency.Currency;
import Info.Info;
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


    ListenButton listener;
    public void Primary() {
        String path = System.getProperty("user.dir");

        System.out.println(path);
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
        frame.add(area);


        btnA = new JButton("Converson de moneda");
        btnA.setBounds(10,30,260,40);
        btnA.setBackground(Color.green);
        btnB = new JButton("Conversor de temperatura");
        btnB.setBounds(10,80,260,40);
        btnB.setBackground(Color.yellow);

        // add buttons on panel
        // frame.getContentPane().add(btnA);
        // frame.getContentPane().add(btnB);

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
                area.setVisible(false);
                Info info = new Info();
                info.Info(frame);
            }
            if(e.getSource() == currency){
                area.setVisible(false);
                Currency currency  = new Currency();
                currency.Currency(frame);
            }
            if(e.getSource() == temps){
                Info info = new Info();
                info.Info(frame);
            }
        }
    }
}
