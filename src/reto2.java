import java.util.ArrayList;
import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // initialize sc with new Scanner class
        int n = Integer.parseInt(sc.nextLine()); // read how many water body's is going to analyze
        ArrayList<CuerpoDeAgua> waterBody = new ArrayList<>(); // initialize and declare ArrayList waterBody from CuerpoDeAgua class
        ArrayList<String> highRiskLevel = new ArrayList<>(); // initialize and declare ArrayList highRiskLevel to know which is the high level risk between all water body's
        // this for is to: read and store name, id, municipality and IRCA; the input is one word, each attribute is separate whit space
        for (int i = 0; i < n; i++) {
            String data = sc.nextLine();

            String[] splitData = data.split(" ");

            waterBody.add(new CuerpoDeAgua(splitData[0], Integer.parseInt(splitData[1]), splitData[2], Double.parseDouble(splitData[3])));

            highRiskLevel.add(waterBody.get(i).nivel()); // execute method nivel() from CuerpoDeAgua class for each water body
        }

        int howMany = 0; // declare and initialize var howMany to water body's have a high level risk between "ALTO" and "INVIABLE SANITARIAMENTE"
        String highRisk = ""; // declare and initialize var highRisk to the municipality water body's have a level risk "ALTO"
        // this for is to:
        for (int i = 0; i < n; i++) {
            // indicate how many water body's have a high level risk between "ALTO" and "INVIABLE SANITARIAMENTE" getting the value of count in method nivel() from CuerpoDeAgua class
            howMany += waterBody.get(i).getSanitaryUnfeasible();
            howMany += waterBody.get(i).getHigh();
            System.out.println(waterBody.get(i).name + " " + waterBody.get(i).municipality); // indicate name and municipality of each water body
            // this if indicate the name of the municipality water body's have a level risk "ALTO", concatenate and separate with space
            if (waterBody.get(i).irca <= 80 && waterBody.get(i).irca > 35) {
                highRisk += waterBody.get(i).municipality + " ";
            }
        }

        System.out.printf("%.2f %n", (double) howMany); // output with format to get two decimal number
        // this if is to indicate municipality with risk level "ALTO", if no one have this level just print "NA"
        if (highRisk.equals("")) {
            System.out.println("NA");
        } else {
            System.out.println(highRisk);
        }
        // this if is to indicate the high level risk between all water body's
        if (highRiskLevel.contains("INVIABLE SANITARIAMENTE")){
            System.out.println("INVIABLE SANITARIAMENTE");
        } else if (highRiskLevel.contains("ALTO")){
            System.out.println("ALTO");
        } else if (highRiskLevel.contains("MEDIO")){
            System.out.println("MEDIO");
        } else if (highRiskLevel.contains("BAJO")){
            System.out.println("BAJO");
        } else {
            System.out.println("SIN RIESGO");
        }
    }
}
