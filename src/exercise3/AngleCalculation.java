package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value;
        char type; // r or double

        do {
          value = input.nextDouble();
          type = input.next().charAt(0);

          if (type == 'r') {
            double convertedValue = value / Math.PI * 180;
            System.out.println("Angle: " + convertedValue + "d");
          } else if (type == 'd') {
            double convertedValue = value * Math.PI / 180;
            System.out.println("Angle: " + convertedValue + "r");
          }

        }while (type == 'r' || type == 'd');
    }

}
