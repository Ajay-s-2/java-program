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
         for (int i=0;i<rol.length;i++){
            System.out.println (Arrays.toString (rol));
        }
    }
}
/*
 * // input using for loops
for (int i = 0; i < arr.length; i++) {
arr[i] = in.nextInt ();
}|
for (int i = 0; i < arr.length; i++) {
System.out.print(arr[i] + " ");
}
for (int num: arr) { // for every element in array, print the element
System.out.print(num + ""); // here num represents element of the array
}
System.out.println(arr[5]); // index out of bound error


 */
555556666666666
ksqwehjk
