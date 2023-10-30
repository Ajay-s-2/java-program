/* 
syntax of array
   datatype [] variable_name= new datatype [size];
 */ 
/**
 * array
 */
import java.util.*;
public class array {

    public static void main(String[]args){
        int size;
        System.out.println("Enter the size of the array");
        Scanner in =new Scanner(System.in);
        size=in.nextInt();
        int [] rol = new int [size ];
        for (int i=0;i<rol.length;i++){
            rol[i] = in.nextInt();
        }

        for (int i=0;i<rol.length;i++){
            System.out.println(rol[i]);
        }
    }
}
