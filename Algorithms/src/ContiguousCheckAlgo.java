import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This algorithm checks if given list of integer is contiguous in nature of not.
 * It also check for redundancy. If it has duplicate value, it will not consider given list as contiguous.
 */
public class ContiguousCheckAlgo {

    public static void main(String[] args) {

        List<Integer> intArr = Arrays.asList(1, 3, 2, 4, 5, 7, 6, 8);
        Integer result[] = new Integer[intArr.size()];

        int minValue = intArr.get(0);

        for (int i = 0; i < intArr.size(); i++)
            minValue = Integer.min(minValue,intArr.get(i));

        System.out.println("Min="+minValue);

        for (int value: intArr) {
            int position = value - minValue; // This determines the range and it will fall under the size of the result
            /**
             * For example: if the given values ranges from 80-100. Range will be 20 and hence the size of result array will be same.
             * However, when determining position it will always be from 0 to 19.
             */
            if(position >= result.length){
                System.out.println("BREAK !!! Not Contiguous.");
                break;
            }

            //This is for duplicate check. One can remove it also if the problem statement is such.
            if(result[position] != null){
                //Already element is present
                System.out.println("BREAK !!! Dup element found. Condition Violated.");
                break;
            }else
                result[position] = value;
        } //It has O(n) time complexity

        System.out.println("Given List of Integers are Contiguous");
    }
}
