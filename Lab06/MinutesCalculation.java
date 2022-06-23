
import java.util.Arrays;

public class MinutesCalculation {

    public static void main(String[] args) {

        String str = "2hrs and 5 minutes";
        String[] splitStr = str.split("and");
        System.out.println(Arrays.toString(splitStr));
        String hrs = splitStr[0].replaceAll("\\D", "");
        String minutes = splitStr[1].replaceAll("\\D", "");

        int totalMinutes = Integer.parseInt(hrs) * 60 + Integer.parseInt(minutes);
        System.out.printf("Total minutes is : " + totalMinutes);
    }
}

