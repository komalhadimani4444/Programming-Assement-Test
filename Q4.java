public class PatternProblem {
    public static void main(String[] args) {
        pattern4(5);




    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");

            }
            for(int col=row-1;col>0;col--){
                System.out.print(col+" ");
            }
            //when one row is printed, we need to add new line
            System.out.println();

        }
    }
}
