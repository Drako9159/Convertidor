package Temps;

import java.text.DecimalFormat;

public class OperatorTemps {
    public String OperatorTemps(String from, String to, Double cantidad){
        double result = libraryValues(from, cantidad);
        System.out.println(result);
        DecimalFormat df = new DecimalFormat("0.00");
        String formatter = df.format(result) +" "+to;
        return formatter;
    }
    public Double libraryValues(String temp, Double cantidad){
        switch (temp){
            case "°F":{
                return toC(cantidad);
            }
            case "°C":{
                return toF(cantidad);
            }
        }
        return 0.2;
    }
    public Double toC(Double f){
        double c = (f - 32) * 5/9;
        return c;
    }
    public Double toF(Double c){
        double f = (c * 9/5) + 32;
        return f;
    }
}
