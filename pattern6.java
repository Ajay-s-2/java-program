import java.util.Scanner;

public class pattern6 {
    public static void main(String[]arg){
        Scanner insc =new Scanner(System.in);
        System.out.print("Enter the number of row:");
       int  n = insc .nextInt();
        // the first row is represent the number of rows
        for ( int row=0;row<2*n;row++){
            // her the col represent the numder of column and no.of row = to no.of .column
           int   totalnocolinrow = row > n ? 2 * n - row : row;
            int noofspace = n-totalnocolinrow;
            for( int s=0;s<noofspace;s++){
                System.out.print(" ");
            }
            for( int col=0;col<totalnocolinrow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        }
    
}
