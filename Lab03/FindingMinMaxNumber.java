public class FindingMinMaxNumber {
    public static void main(String[] args) {
                int arrayLength = 5;
                int[] myIntArray = new int[arrayLength];

                myIntArray[0] = 1;
                myIntArray[1] = 2;
                myIntArray[2] = 3;
                myIntArray[3] = 4;
                myIntArray[4] = 5;
                int Min = myIntArray[0];
                int Max = myIntArray[0];
                for (int index = 1; index < myIntArray.length; index++) {
                    if(Min > myIntArray[index]){
                        Min = myIntArray[index];
                    }
                    if (Max < myIntArray[index]){
                        Max = myIntArray[index];
                    }

                }
                System.out.println(" Max is:" + Max);
                System.out.println(" Min is :" + Min);
            }
        }

