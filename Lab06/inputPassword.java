import java.util.Scanner;
public class inputPassword {
    public static void main(String[] args) {

        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);

        for (int inputTime = 3; inputTime > 0; inputTime--) {
            System.out.print("Please input your password: ");
            String enteredPassword = scanner.next();
            if(enteredPassword.equals(myPassword)){
                System.out.println("You are login successfully");
                break;
            }else{
                System.out.printf("Your password is not correct!!! You only have %d inputTime(s) remain\n",inputTime-1);
            }
        }
    }
}

