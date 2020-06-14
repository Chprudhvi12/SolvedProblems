/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practise2;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Practise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList();
        for(int i =0;i<3;i++){
            System.out.println("Enter the Sorted Arrays");
            ArrayList<Integer> subArray = new ArrayList();
            for(int j =0 ;j<3 ; j++){
                subArray.add(sc.nextInt());
            }
            arr.add(subArray);
        }
        //ArrayList<Integer> finalArray = new ArrayList();
        ArrayList<Integer> prev = arr.get(0);
        for(int i = 1; i<arr.size() ; i++){
            ArrayList<Integer> curr = arr.get(i);
            ArrayList<Integer> finalArray = new ArrayList();
            int firstStart = 0, secondStart = 0;
            while(true){
                if(firstStart<prev.size() && secondStart<curr.size()){
                    if(prev.get(firstStart) <= curr.get(secondStart)){
                        finalArray.add(prev.get(firstStart));
                        firstStart++;
                    }
                    else{
                    finalArray.add(curr.get(secondStart));
                    secondStart++;
                    }
                }
                else if(firstStart<prev.size()){
                    finalArray.add(prev.get(firstStart));
                        firstStart++;
                }
                else if(secondStart<curr.size()){
                    finalArray.add(curr.get(secondStart));
                    secondStart++;
                }
                else{
                    break;
                }
            }
            prev = finalArray;
        }
        System.out.println(prev);
    }
    
}
