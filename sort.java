/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package central;

/**
 *
 * @author OWNER
 */
public class sort {
    
   public int[] array;
   public sort(int [] incoming){
       array = incoming;
   }
   public void bubbleSortAscending(){
       for(int i = (array.length -1); i>=0; i-- ){
           for(int j = 1;j<=i;j++){
               if(array[j-1] > array[j]){
                   int temp = array[j-1];
                   array[j-1] = array[j];
                   array[j] = temp;
               }
           }
       }
   }
      public void bubbleSortDescending(){
       for(int i = (array.length -1); i>=0; i-- ){
           for(int j = 1;j<=i;j++){
               if(array[j-1] > array[j]){
                   int temp = array[j-1];
                   array[j-1] = array[j];
                   array[j] = temp;
               }
           }
       }
      }
      public void print(){
          for(int i = 0; i < array.length; i++){
              System.out.println(array[i]);
          }
      }
   
}
