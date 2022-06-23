import java.util.Scanner;

public class Lab02_BMICaculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight :");
        float weight = scanner.nextFloat();
        System.out.println(" Please input your height : ");
        float height = scanner.nextFloat();
        float BMI = weight / (height * 2);
        System.out.println(" Your BMI is :" + BMI);
        if (BMI <= 18.5) {
            System.out.println(" Your are underweight");
        } else if (BMI > 18.5 && BMI < 24.9) {
            System.out.println(" Your are normal weight");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println(" Your are overweight");

        } else {
            System.out.println(" Your are Obesity");
        }

    }
}