import java.util.Scanner;

public class pattern5 {
    public static void main(String[]arg){
             int n ,col,row;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of row:");
        n=scanner.nextInt();
        // the first row is represent the number of rows
        for ( row=0;row<2*n;row++){
            // her the col represent the numder of column and no.of row = to no.of .column
            if ( row>n )
            {
                for(col=0;col < 2*n-row;col++)
                {
                    System.out.print("*");
                }
            }
            else
            {
            for ( col=0;col<row;col++)
                {
                    System.out.print("*");
                }
            }
           
            System.out.println();
        }
        }
    
}
