package Toast;
import javax.swing.*;
import java.awt.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class Toast{
    public JPanel AlertToast(String message, String color){
        // receive color of text // green or red
        JPanel pnl = new JPanel();
        JLabel lbl = new JLabel();

        lbl.setText(message);

        if(color.equals("red")){
            lbl.setForeground(Color.red);
        } else if (color.equals("green")){
            lbl.setForeground(Color.green);
        }

        pnl.setBounds(10,190,322,20);
        pnl.add(lbl);
        pnl.setLayout(new FlowLayout(FlowLayout.LEFT));
        pnl.setVisible(true);

        // setTimeout
        CompletableFuture.delayedExecutor(4, TimeUnit.SECONDS).execute(() -> pnl.setVisible(false));

        pnl.setVisible(true);
        return pnl;
    }
}
