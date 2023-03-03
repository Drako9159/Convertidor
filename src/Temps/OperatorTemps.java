package Temps;
import java.text.DecimalFormat;
public class OperatorTemps {
    public String operatorTemps(String from, String to, Double amount){
        double result = libraryValues(from, amount);
        DecimalFormat df = new DecimalFormat("0.00");

        String formatter;
        formatter = df.format(result) +" "+to;
        return formatter;
    }
    public Double libraryValues(String temp, Double amount){
        switch (temp) {
            case "°F" -> {
                return toC(amount);
            }
            case "°C" -> {
                return toF(amount);
            }
        }
        return 0.2;
    }
    public Double toC(Double f){
        return (f - 32) * 5/9;
    }
    public Double toF(Double c){
        return (c * 9/5) + 32;
    }
}
