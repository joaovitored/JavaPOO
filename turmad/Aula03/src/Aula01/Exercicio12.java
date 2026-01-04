package Aula01;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	
    	int A[] = new int [4];
    	int B[] = new int [4];
    	int C[] = new int [4];
    	int D[] = new int [4];
    	
    	for(int x=0; x<A.length;x++) {
    		System.out.printf("Digite o %d array A: " , x+1);
    		A[x]=sc.nextInt();

    		System.out.printf("Digite o %d array A: " , x+1);
    		B[x]=sc.nextInt();
    		
    		System.out.printf("Digite o %d array A: " , x+1);
    		C[x]=sc.nextInt();
    		
    		System.out.printf("Digite o %d array A: " , x+1);
    		D[x]=sc.nextInt();
    			
    	}
      System.out.println(Arrays.toString(A));
      System.out.println(Arrays.toString(B));
      System.out.println(Arrays.toString(C));
      System.out.println(Arrays.toString(D));

      

}}
