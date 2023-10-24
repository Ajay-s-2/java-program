import java.util.Scanner;
/*
 * her the coloum is 0 and row is 0 so no star is printed 
 * and when the row is 1 and create the 1 col 
 * and print the star 
 * and again  when the row is 2 and create the 2 col(print 2 star)
 * it will continue the untill te the condition is false
 */
public  class pattern0{
    public static void main(String[]arg)
    {   int n;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of row:");
        n=scanner.nextInt();
        // the first row is represent the number of rows
        for (int row=0;row<=n;row++){
            // her the col represent the numder of column and no.of row = to no.of .column
            for (int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }  
}
