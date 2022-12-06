
// Remove Primes from an ArrayList
//Link of Question( https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/remove-primes-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {
    
    
    public static boolean isPrime(int num){
        
        for(int i=2 ; i<num ; i++){
            if(num%i == 0)
                return false ;
        }
            return true;
      
    }
    
	public static void solution(ArrayList<Integer> al){
	
	   for(int i=al.size()-1 ; i>=0 ; i--){
	       
	       int num = al.get(i);
	       boolean check = isPrime(num);
	       
	       if(check == true){
	           al.remove(i);
	       }
	       
	   }	
	
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}