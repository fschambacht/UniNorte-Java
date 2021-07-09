import java.util.Scanner;

public class Reto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // input of array length
        double[] clasificationsIRCA = new double[n];
        double promIRCA, sumIRCA = 0, sumIRCAoverAlto = 0, overAltoIRCA;
        boolean noRisk = false;
        // input of array values
        for (int i = 0; i < n; i++) {
            clasificationsIRCA[i] = sc.nextDouble();
        }

        for (double valueIRCA : clasificationsIRCA) {
            if (valueIRCA > 35){
                sumIRCAoverAlto++;
            }
            if (valueIRCA <= 5){
                noRisk = true;
            }
            sumIRCA += valueIRCA;
        }
        overAltoIRCA = sumIRCAoverAlto/n * 100; // depending of array length get the percentage of how many is over "ALTO"

        promIRCA = sumIRCA/n;

        if (promIRCA>80){
            System.out.println("INVIABLE SANITARIAMENTE");
        } else if (promIRCA<=80 && promIRCA>35){
            System.out.println("ALTO");
        } else if (promIRCA<=35 && promIRCA>14){
            System.out.println("MEDIO");
        } else if (promIRCA<=14 && promIRCA>5){
            System.out.println("BAJO");
        } else {
            System.out.println("Continuar el control y la vigilancia");
        }

        System.out.printf("%.2f\n",overAltoIRCA); // output with format to get two decimal number

        if (noRisk){
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
    }
}
