import java.sql.SQLOutput;
import java.util.Scanner;

public class OddNumberAndEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the number: ");
        int Number = scanner.nextInt();
        if (Number % 2 == 0 ){
            System.out.println(" It an even number");
        }
        else {
            System.out.println(" It an odd number " );
        }
    }

}
