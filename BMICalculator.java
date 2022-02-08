import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        BMI currentBMI = new BMI();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        currentBMI.setWeight(input.nextDouble());
        System.out.print("Enter height in inches: ");
        currentBMI.setHeight(input.nextDouble());
        System.out.println("BMI is " + currentBMI.getIndex());
        System.out.println(currentBMI.getCategory());
    }
}
