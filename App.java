/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class App {

        public static void main(String[] args) {
        // TODO code application logic here
        String decision,choice;
        int [] arr = {4,6,7,8,4,5,75};
        sort a = new sort(arr);
        System.out.println("Enter wether you want the array sorted");
        System.out.println("type yes or no");
        Scanner sc = new Scanner(System.in);
        decision = sc.nextLine();
        if(decision.equals("yes")){
            System.out.println("press a for ascending and press d for descending");
                choice = sc.nextLine();
                if(choice.equals("a")){
                    a.bubbleSortAscending();
                    System.out.println("the array is:");
                    a.print();
                }
                else if(choice.equals("d")){
                    a.bubbleSortDescending();
                    System.out.println("the array is:");
                    a.print();
                }
    
        }else{
            System.out.println("the not sorted array is");
            a.print();
        }

    }
    
}
