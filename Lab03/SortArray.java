public class SortArray {
    public static void main(String[] args) {
        int arrayLength = 5;
        int[] myIntArray = new int[arrayLength];
        int[] newArray = new int[arrayLength];
        myIntArray[0] = 12;
        myIntArray[1] = 34;
        myIntArray[2] = 1;
        myIntArray[3] = 16;
        myIntArray[4] = 28;

        for (int i = 0; i < newArray.length; i++) {
            int Min = myIntArray[0];
            int Max = myIntArray[0];
            for (int j = 0; j < myIntArray.length; j++) {
                if(Min > myIntArray[j]){
                    Min = myIntArray[j];
                }
                if (Max < myIntArray[j]){
                    Max = myIntArray[j];
                }
            }
            for (int j = 0; j < myIntArray.length; j++){
                if(myIntArray[j] == Min){
                    myIntArray[j] = Max;
                    break;
                }
            }
            newArray[i] = Min;
        }

        for (int index = 0; index < newArray.length; index++) {
            System.out.println(newArray[index]);
        }
    }
}


