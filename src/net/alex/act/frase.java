package net.alex.act;

import java.util.Scanner;

public class frase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub PAaZ
		
		
		Scanner lector= new Scanner(System.in);
	    System.out.println("Escriu una frase, et donare info:");
	        
	        String primera = lector.nextLine();
	        String abe ="abcdefghijklmnñopqrstvwxyz";
	        int [] lala = new int[26];
	        int contador = 0;
	        
	        for(int i=0;i<primera.length();i++){
	        	char a = primera.charAt(i);
	        	for (int j=0;j<abe.length();j++){
	        		char e = abe.charAt(j);
	        		if(a==e){lala[j]=lala[j]+1;}
	        	}
	       
	        }
	        
	        for(int i=0;i<lala.length;i++){
	        		if(lala[i]!=0){
	        		char e = abe.charAt(i);
	        		System.out.print(e+" aparaeix: ");
	        	
	        	System.out.println(lala[i]+ "vegades.");}}
	        }
	    
		
		

	}


