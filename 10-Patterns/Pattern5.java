
public class Pattern5 {
    public static void main(String[] args) {
        pattern5(10);
    }

    public static void pattern5(int n){
        for(int row=0;row<2*n;row++){
            int totalCol=row>n? 2*n-row: row;
            for(int col=0;col<totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
