import java.util.Scanner;
public class pattern4{
    public static void main(String[]arg){
            int n;
       Scanner scanner=new Scanner(System.in);
       System.out.print("Enter the number of row:");
       n=scanner.nextInt();
       // the first row is represent the number of rows
       for (int row=1;row<=n;row++){
           // her the col represent the numder of column and no.of row = to no.of .column
           for (int col=1;col<=row;col++){
               System.out.print( col+" " );
           }
           System.out.println();
       }
       
    }
}