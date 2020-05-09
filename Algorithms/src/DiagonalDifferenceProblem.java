import java.util.List;

public class DiagonalDifferenceProblem {

    /**
     *  for 2D array [1,5,9]
     *               [3,6,8]
     *               [2,7,4]
     *  Below code will give diagonal difference(absolute) , i.e. |(1+6+4) - (9+6+2)|
     *
     *
     * @param arr - 2D Integer Array - similar to int[][]
     * @return absolute diff
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("arr.get(i)="+arr.get(i));
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.println("arr.get(j)="+arr.get(j));
                if(i==j){
                    System.out.println("arr.get(i).get(j)="+arr.get(i).get(j));
                    result = result + arr.get(i).get(j);
                }
            }
        }
        System.out.println("SUM = "+result);
        for (int i = arr.size()-1; i >= 0; i--) {
            System.out.println("arr.get(i)="+arr.get(i));
            for (int j = arr.get(i).size()-1; j >=0; j--) {
                System.out.println("arr.get(j)="+arr.get(j));
                if(i==j){
                    System.out.println("arr.get(i).get(j)="+arr.get(i).get(j));
                    result = result + arr.get(i).get(j);
                }
            }
        }
        result = Math.abs(result);
        return result;
    }
}
