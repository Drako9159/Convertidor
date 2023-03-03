package Currency;
import Toast.Toast;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Currency {
    JPanel primary, pnlAmount, pnlOptions, actions;
    JTextField amount, result;
    JLabel lblAmount, lblOption0, lblOption1, lblResult;

    JButton handleConverter;
    JComboBox box0, box1;
    public void Currency(JFrame frame){
        frame.setTitle("Conversor de Moneda");

        primary = new JPanel();

        pnlAmount = new JPanel();
        pnlAmount.setBounds(0,10,360,40);
        pnlAmount.setLayout(null);

        amount = new JTextField();
        amount.setBounds(150,8,120,30);


        amount.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e){
                if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE){
                    amount.setEditable(true);

                } else {
                    amount.setEditable(false);
                    frame.getContentPane().add(new Toast().AlertToast(
                            "Por favor solo números del 1-9", "red"));
                    frame.setVisible(true);
                }
            }
        });

        lblAmount = new JLabel("Cantidad");
        lblAmount.setBounds(88, 4, 60, 40);

        pnlAmount.add(lblAmount);
        pnlAmount.add(amount);
        /*
        String opcion = (JOptionPane.showInputDialog(null, "Selecciona la conversion que deseas","Conversor",
                JOptionPane.PLAIN_MESSAGE,null,
                new Object[] {"Conversor de moneda","Conversor de temperatura"},null)).toString();
        JOptionPane option = new JOptionPane();*/

        pnlOptions = new JPanel();
        pnlOptions.setBounds(0,30,360,100);
        //pnlOptions.setBackground(new Color(133, 133, 133));
        pnlOptions.setLayout(null);

        String[] options = {"MXN", "COL"};

        box0 = new JComboBox(options);
        box0.setBounds(80, 40, 80, 40);
        box0.setSelectedIndex(1);

        box1 = new JComboBox(options);
        box1.setBounds(200, 40, 80, 40);
        box1.setSelectedIndex(1);

        lblOption0 = new JLabel("De");
        lblOption0.setBounds(50, 40, 40, 40);
        lblOption1 = new JLabel("A");
        lblOption1.setBounds(180, 40, 40, 40);

        pnlOptions.add(box0);
        pnlOptions.add(box1);
        pnlOptions.add(lblOption0);
        pnlOptions.add(lblOption1);

        actions = new JPanel();
        actions.setBounds(0, 130, 360, 70);
        actions.setBackground(Color.yellow);
        actions.setLayout(null);
        actions.setVisible(true);

        handleConverter = new JButton("Convertir");
        handleConverter.setBounds(125, 0, 90, 30);

        result = new JTextField();
        result.setBounds(140, 30, 120, 35);
        result.setEditable(false);

        lblResult = new JLabel("Resultado");
        lblResult.setBounds(83, 30, 60, 30);

        actions.add(handleConverter);
        actions.add(lblResult);
        actions.add(result);




        primary.add(pnlAmount);
        primary.add(pnlOptions);
        primary.add(actions);
        primary.setLayout(null);
        primary.setBackground(Color.red);
        primary.setVisible(true);
        primary.setBounds(0,0,360,250);


        frame.getContentPane().add(primary);
        frame.setVisible(true);
        frame.repaint();
    }
}
