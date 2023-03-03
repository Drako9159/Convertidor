package Currency;
import Toast.Toast;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Currency {
    JPanel pnlAmount, pnlOptions, actions;
    JTextField amount, result;
    JLabel lblAmount, lblOption0, lblOption1, lblResult;

    JButton handleConverter;
    JComboBox box0, box1;
    public void Currency(JFrame frame, JPanel panel){

        pnlAmount = new JPanel();
        pnlAmount.setBounds(0,10,360,40);
        pnlAmount.setLayout(null);
        amount = new JTextField();
        amount.setBounds(150,8,120,30);

        amount.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent e){

                if(e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE
                    ||e.getKeyCode() == 46
                ){
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


        pnlOptions = new JPanel();
        pnlOptions.setBounds(0,30,360,80);
        //pnlOptions.setBackground(new Color(133, 133, 133));
        pnlOptions.setLayout(null);

        String[] options = {"MXN", "USD", "EUR", "JPY", "GBP", "KRW"};

        box0 = new JComboBox(options);
        box0.setBounds(80, 33, 80, 40);
        box0.setSelectedIndex(0);

        box1 = new JComboBox(options);
        box1.setBounds(200, 33, 80, 40);
        box1.setSelectedIndex(1);

        lblOption0 = new JLabel("De");
        lblOption0.setBounds(50, 33, 40, 35);
        lblOption1 = new JLabel("A");
        lblOption1.setBounds(180, 33, 40, 40);

        pnlOptions.add(box0);
        pnlOptions.add(box1);
        pnlOptions.add(lblOption0);
        pnlOptions.add(lblOption1);


        actions = new JPanel();
        actions.setBounds(0, 110, 360, 80);

        actions.setLayout(null);
        actions.setVisible(true);


        handleConverter = new JButton("Convertir");
        handleConverter.setBounds(125, 0, 90, 30);
        handleConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(amount.getText().equals("")){
                    frame.getContentPane().add(new Toast().AlertToast(
                            "Ingrese una cantidad", "red"));
                    frame.setVisible(true);
                } else {
                    String value0 = ""+box0.getSelectedItem();
                    String value1 = ""+box1.getSelectedItem();
                    Operator operator = new Operator();
                    String conversion = operator.Operator(value0, value1, Double.parseDouble(amount.getText()));
                    result.setText(conversion);
                }
            }
        });

        result = new JTextField();
        result.setBounds(140, 35, 120, 35);
        result.setEditable(false);

        lblResult = new JLabel("Resultado");
        lblResult.setBounds(83, 35, 60, 30);

        actions.add(handleConverter);
        actions.add(lblResult);
        actions.add(result);

        panel.add(pnlAmount);
        panel.add(pnlOptions);
        panel.add(actions);
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setBounds(0,0,360,250);


    }
}
