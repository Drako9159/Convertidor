package Currency;

import java.text.DecimalFormat;

public class Operator {
    public String Operator(String from, String to, Double cantidad){

        double value1 = Double.parseDouble(libraryValues(from));
        double value2 = Double.parseDouble(libraryValues(to));
        double result = value2 / value1 * cantidad;
        DecimalFormat df = new DecimalFormat("0.00");

        String formatter = df.format(result) +" "+to;
        return formatter;

    }
    public String libraryValues(String moneda){
        String[] values = {"18.11", "1", "0.94", "136.69", "0.84", "1305.68"};
        switch (moneda){
            case "MXN":{
                return values[0];
            }
            case "USD":{
                return values[1];
            }
            case "EUR":{
                return values[2];
            }
            case "JPY":{
                return values[3];
            }
            case "GBP":{
                return values[4];
            }
            case "KRW":{
                return values[5];
            }
        }
        return "No value such";
    }
}
