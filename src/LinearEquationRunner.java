
import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome");
        System.out.print("Enter Coordinate 1: ");
        String cord1 = scan.nextLine();
        System.out.print("Enter Coordinate 2: ");
        String cord2 = scan.nextLine();

        int comma1 = cord1.indexOf(",");
        int cord1Length = cord1.length();

        int x1 = Integer.parseInt(cord1.substring(1, comma1));
        int y1 = Integer.parseInt(cord1.substring(comma1 + 1, cord1Length - 1));

        int comma2 = cord2.indexOf(",");
        int cord2Length = cord2.length();

        int x2 = Integer.parseInt(cord2.substring(1, comma2));
        int y2 = Integer.parseInt(cord2.substring(comma2 + 1, cord2Length - 1));

        LinearEquation test = new LinearEquation(x1, y1, x2, y2);
        System.out.println(test.lineInfo());

        boolean equal = x1 == x2;
        if (equal) {
            System.out.println("");
        } else {
            System.out.print("Enter a value for x: ");
            double xValue = Double.parseDouble(scan.nextLine());
            System.out.println(test.coordinateForX(xValue));
        }
    }
}

