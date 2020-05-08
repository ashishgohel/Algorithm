import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SumOfSubArray {

    public static void main(String[] args) {

        int inputList[] = new int[]{1,2,4,2,3,5,4,7,3,5};
        int oddArr[] = new int[inputList.length];
        int evenArr[] = new int[inputList.length];

        int desiredSum = 6;

        Arrays.sort(inputList); //TC: O(n Log n)

        int oddCounter = 0;
        int evenCounter = 0;

        for (int i : inputList) {
            if (i%2 == 0)
                evenArr[evenCounter++]=i;
            else
                oddArr[oddCounter++]=i;
        }



    }
}
