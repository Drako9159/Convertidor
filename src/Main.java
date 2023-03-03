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
        Primary primary = new Primary();
        primary.Primary();
        /*
        Primary primary = new Primary();
        primary.Primary();*/


        /*


        float resultado;
        boolean x;
        do {
            //Escoger el conversor que desea
            String opcion = (JOptionPane.showInputDialog(null, "Selecciona la conversion que deseas","Conversor",
                    JOptionPane.PLAIN_MESSAGE,null,
                    new Object[] {"Conversor de moneda","Conversor de temperatura"},null)).toString();

            if(opcion == "Conversor de moneda") {
                //Cuadro de diálogo - Valor de la conversión
                float dinero;
                boolean comprobante = true;
                do {
                    dinero = Float.parseFloat(JOptionPane.showInputDialog(null,"Cantidad de dinero a convertir",
                            "Ingrese un valor numerico"));
                    if(dinero < 0) {
                        JOptionPane.showMessageDialog(null, "Valor no valido");

                    }
                }while(dinero<=0 || comprobante == false);

                //Escoger las monedas a converir
                String monedas = (JOptionPane.showInputDialog(null, "Selecciona la opcion que deseas","Conversor de monedas",
                        JOptionPane.PLAIN_MESSAGE,null,
                        new Object[] {"COP a USD","COP a EUR","COP a GBP","COP a JPY","COP a KRW",
                                "USD a COP","EUR a COP","GBP a COP","JPY a COP","KRW a COP"},null)).toString();

                //Conversion de monedas
                switch(monedas) {
                    case "COP a USD":
                        resultado = dinero * 0.00020f;
                        JOptionPane.showMessageDialog(null, dinero+" pesos colombianos son "+resultado+" dolares");
                        break;
                    case "USD a COP":
                        resultado = dinero * 4857.53f;
                        JOptionPane.showMessageDialog(null, dinero+" dolares son "+resultado+" pesos colombianos");
                        break;
                    case "COP a EUR":
                        resultado = dinero * 0.00020f;
                        JOptionPane.showMessageDialog(null, dinero+" pesos colombianos son "+resultado+" euros");
                        break;
                    case "EUR a COP":
                        resultado = dinero * 5118.43f;
                        JOptionPane.showMessageDialog(null, dinero+" euros son "+resultado+" pesos colombianos");
                        break;
                    case "COP a GBP":
                        resultado = dinero * 0.00017f;
                        JOptionPane.showMessageDialog(null, dinero+" pesos colombianos son "+resultado+" libras esterlinas");
                        break;
                    case "GBP a COP":
                        resultado = dinero * 5796.70f;
                        JOptionPane.showMessageDialog(null, dinero+" libras esterlinas son "+resultado+" pesos colombianos");
                        break;
                    case "COP a JPY":
                        resultado = dinero * 0.028f;
                        JOptionPane.showMessageDialog(null, dinero+" pesos colombianos son "+resultado+" yen japoneses");
                        break;
                    case "JPY a COP":
                        resultado = dinero * 35.63f;
                        JOptionPane.showMessageDialog(null, dinero+" yen japoneses son "+resultado+" pesos colombianos");
                        break;
                    case "COP a KRW":
                        resultado = dinero * 0.27f;
                        JOptionPane.showMessageDialog(null, dinero+" pesos colombianos son "+resultado+" won surcoreanos");
                        break;
                    case "KRW a COP":
                        resultado = dinero * 3.69f;
                        JOptionPane.showMessageDialog(null, dinero+" won surcoreanos son "+resultado+" pesos colombianos");
                        break;
                }
            }

            //Conversor de temperatura
            if(opcion == "Conversor de temperatura") {
                //Cuadro de diálogo - Valor de la conversión
                float temp;
                do {
                    temp = Float.parseFloat(JOptionPane.showInputDialog(null,"Temperatura a convertir",
                            "Ingrese un valor numerico"));
                    if(temp < 0) {
                        JOptionPane.showMessageDialog(null, "Valor no valido");
                    }
                }while(temp<=0);

                String temperaturas = (JOptionPane.showInputDialog(null, "Selecciona la opcion que deseas","Conversor de temperaturas",
                        JOptionPane.PLAIN_MESSAGE,null,
                        new Object[] {"Celsius a Kelvin","Celsius a Fahrenheit","Kelvin a Celsius",
                                "Kelvin a Fahrenheit","Fahrenheit a Celsius","Fahrenheit a Kelvin"},null)).toString();

                //Conversion de temperaturas
                switch(temperaturas){
                    case "Celsius a Kelvin":
                        resultado = temp + 273.15f;
                        JOptionPane.showMessageDialog(null, temp+" ºC son "+resultado+" K");
                        break;
                    case "Celsius a Fahrenheit":
                        resultado = temp * 1.8f + 32;
                        JOptionPane.showMessageDialog(null, temp+" ºC son "+resultado+" ºF");
                        break;
                    case "Kelvin a Celsius":
                        resultado =  temp - 273.15f;
                        JOptionPane.showMessageDialog(null, temp+" K son "+resultado+" ºC");
                        break;
                    case "Kelvin a Fahrenheit":
                        resultado = (1.8f * (temp - 273.15f) + 32);
                        JOptionPane.showMessageDialog(null, temp+" K son "+resultado+" ºF");
                        break;
                }
            }
            //Cuadro de diálogo - ¿Desea continuar?
            int i = JOptionPane.showConfirmDialog(null, "Desea continuar?");
            if(i == 0 ) {
                x = true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Programa finalizado");
                break;
            }
        }while(x == true);
    }*/
    }
}