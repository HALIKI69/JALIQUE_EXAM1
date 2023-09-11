/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalique_exam1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JALIQUE_EXAM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    }
    
    public static void number1(){
     //Number 1
        System.out.println("Input Array Elements: ");
        Scanner scn= new Scanner(System.in);
       
        int[] newarr = new int [5];
        for (int i = 0; i < 5; i++) {
            newarr[i]= scn.nextInt();
//           
//       if (newarr[i] > 0){
//            
//                int sum = newarr[i + i];
//            
//        } else {
//            System.out.println("No positive integer");
//        }
            
        } 
        System.out.println("Your Array: " + Arrays.toString(newarr));
        
}
    public static void number2(){
        String[] fruits = {};
                
              
    }
    
    public static void number3() {
      int myarr[]= {1,2,3,5,6,4,9};  
        System.out.println("Your Array: " + Arrays.toString(myarr));
    System.out.println("Array size: "+ myarr.length);
}
    
    public static void number4(){
        int[] positiveEvenNumbers = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] evenNum = new int[20];
        
        System.out.println("Even numbers: " + Arrays.toString(positiveEvenNumbers));
        
    }
            public static void number5() {
        System.out.println("Enter Array size:");
         Scanner scanner = new Scanner(System.in);
        int elemArr = scanner.nextInt();
        int[] newArr = new int[elemArr];
        
                for (int i = 0; i < elemArr; i++) {
                    System.out.print( fibo(i) + "");
                    
                }
        
    }
            public static int fibo(int m){
                if(m == 0){
                    return 0;
                }else if(m==1){
                    return 1;
                }
                else{
                    return fibo(m-1) + fibo(m-2);
                }
            }
    }
    



