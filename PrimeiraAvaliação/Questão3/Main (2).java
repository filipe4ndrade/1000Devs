//Atividade Feita por José Filipe Silva de Andrade;
//Obs.: Nenhum comando adicional foi adicionado neste código.

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
	    
		System.out.print("Digite o nome do indivíduo: ");
		String nome1 = null;
		try{
		   nome1 = teclado.nextLine();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		System.out.printf("Digite a idade de %s: ",nome1);
		int idade1 = 0; 
		try{
		   idade1 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		System.out.printf("Digite o sexo de %s: ",nome1);
		String sexo = null; 
		teclado.nextLine(); // corrigir buffer
		try{
		   sexo = teclado.nextLine();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
	
		// == não compara conteúdo, compara referências de local de memória
		if(sexo.equals("f") || sexo.equals("F") || sexo.equals("M") || sexo.equals("m") ){
		    
		    if(idade1<=13){
		        System.out.printf("%s é Criança\n",nome1);
		    } else if((idade1>13)&&(idade1<=20)){
		        System.out.printf("%s é Adolescente\n",nome1);
		    } else if((idade1>20)&&(idade1<=50)){
		        System.out.printf("%s é Adulto\n",nome1);
		    } else if(idade1>50){
		        System.out.printf("%s é da Melhor Idade\n",nome1);
		    } else{
		        System.out.printf("Idade zerada ou negativa não confere\n");
		    }
		    
		}else{
		    System.out.println("Valor digitado inválido!");
		}
		
		
		
		
		System.out.println("**************************");
		
		
		
		
		System.out.print("Digite o nome do indivíduo: ");
		String nome2 = null;
		try{
		   nome2 = teclado.nextLine();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		System.out.printf("Digite a idade de %s: ",nome2);
		int idade2 = 0; 
		try{
		   idade2 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		System.out.printf("Digite o sexo de %s: ",nome2);
		
		teclado.nextLine(); // corrigir buffer
		try{
		   sexo = teclado.nextLine();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
	
		// == não compara conteúdo, compara referências de local de memória
		if(sexo.equals("f") || sexo.equals("F") || sexo.equals("M") || sexo.equals("m") ){
		    
		    if(idade2<=13){
		        System.out.printf("%s é Criança\n",nome2);
		    } else if((idade2>13)&&(idade2<=20)){
		        System.out.printf("%s é Adolescente\n",nome2);
		    } else if((idade2>20)&&(idade2<=50)){
		        System.out.printf("%s é Adulto\n",nome2);
		    } else if(idade2>50){
		        System.out.printf("%s é da Melhor Idade\n",nome2);
		    } else{
		        System.out.printf("Idade zerada ou negativa não confere\n");
		    }
		    
		}else{
		    System.out.println("Valor digitado inválido!");
		}
		
		
		
		System.out.println("**************************");
		
		
		
		
		System.out.print("Digite o nome do indivíduo: ");
		String nome3 = null;
		try{
		   nome3 = teclado.nextLine();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		System.out.printf("Digite a idade de %s: ",nome3);
		int idade3 = 0; 
		try{
		   idade3 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		System.out.printf("Digite o sexo de %s: ",nome3);
		
		teclado.nextLine(); // corrigir buffer
		try{
		   sexo = teclado.nextLine();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
	
		// == não compara conteúdo, compara referências de local de memória
		if(sexo.equals("f") || sexo.equals("F") || sexo.equals("M") || sexo.equals("m") ){
		    
		    if(idade3<=13){
		        System.out.printf("%s é Criança\n",nome3);
		    } else if((idade3>13)&&(idade3<=20)){
		        System.out.printf("%s é Adolescente\n",nome3);
		    } else if((idade3>20)&&(idade3<=50)){
		        System.out.printf("%s é Adulto\n",nome3);
		    } else if(idade3>50){
		        System.out.printf("%s é da Melhor Idade\n",nome3);
		    } else{
		        System.out.printf("Idade zerada ou negativa não confere\n");
		    }
		    
		}else{
		    System.out.println("Valor digitado inválido!");
		}
		
		 System.out.println("\n");
		 
		if(idade1>idade2 && idade1>idade3){
		    System.out.printf("O nome do indivíduo mais velho é %s",nome1);
		} else if(idade2>idade1 && idade2>idade3){
		    System.out.printf("O nome do indivíduo mais velho é %s",nome2);
		} else if(idade3>idade2 && idade3>idade1){
		    System.out.printf("O nome do indivíduo mais velho é %s",nome3);
		}
		
		
	}
}
