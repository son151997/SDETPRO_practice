public class CountOddEvenNumber {
    public static void main(String[] args) {
                int arrayLength = 5;
                int[] myIntArray = new int[arrayLength];
                int evenNumber = 0;
                int oddNumber = 0;


                myIntArray[0] = 1;
                myIntArray[1] = 2;
                myIntArray[2] = 3;
                myIntArray[3] = 4;
                myIntArray[4] = 5;
                for (int index = 0; index < myIntArray.length; index++) {
                    if (myIntArray[index] % 2 == 0) {
                        evenNumber++;
                    } else {
                        oddNumber++;
                    }
                }
                System.out.println(" Number of EvenNumber:" + evenNumber);
                System.out.println(" Number of OddNumber :" + oddNumber);
            }
        }
