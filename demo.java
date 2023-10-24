public class demo {
    public static void main(String[] arg){
        int n=5;
        for (int row=0;row<=n;row++){
            int noofspace =n-row;
            for( int s=0;s<row ;s++){
                System.out.print("*");
            }
            for(int col=0;col<n-row;col++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
