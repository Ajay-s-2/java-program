
import java.util.Scanner;
public class pattern1 {
        public static void main(String[]arg){
             int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of row:");
        n=scanner.nextInt();
        // the first row is represent the number of rows
        for (int row=0;row<=n;row++){
            // her the col represent the numder of column and no.of row = to no.of .column
            for (int col=0;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        }
    
}
