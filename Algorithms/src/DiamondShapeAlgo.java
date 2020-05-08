public class DiamondShapeAlgo {

    public static void main(String[] args) {
        int counter = 7; // Depth of the Pyramid

        /**
         * First loop is for pyramid
         * Second loop is for inverted pyramid
         */

        //First Loop
        for (int i = 1; i <= counter; i++) {
            for (int j = counter; j >i ; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                if(j<=i)
                    System.out.print(j);
            for (int j = i-1; j > 0 ; j--)
                System.out.print(j);
            System.out.println("");
        }

        //Second Loop
        for (int i = counter-1; i >= 1; i--) {
            for (int j = counter; j > i ; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                if(j<=i)
                    System.out.print(j);
            for (int j = i-1; j > 0 ; j--)
                System.out.print(j);
            System.out.println("");
        }
    }
}
