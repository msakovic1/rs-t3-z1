package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField brojn;
    public Label rezultat;

    public static int sumaCifara(int n){
        int suma = 0;
        for (int i = 0; n > 0; i++){
            suma = suma + (n % 10);
            n = n / 10;
        }

        return suma;
    }


    public void sumaCifara(ActionEvent actionEvent) {
        int x;
        x = Integer.parseInt(brojn.getText());

        for (int i = 1; i <= x; i++){

            if (i % sumaCifara(i) == 0){
                System.out.println(i);
            }
        }
    }
}
