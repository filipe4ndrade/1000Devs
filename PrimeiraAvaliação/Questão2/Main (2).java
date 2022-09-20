//Atividade Feita por José Filipe Silva de Andrade;
//Obs.: O try catch() uilizado não atendeu as minhas expectativas. Visto que para uma possíve
//      abstenção de algum voto, os demais deveriam continuar validando;
//Obs.: Nenhum comando adicional foi adicionado neste código

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
	    
	    
    	System.out.println("==========MENU DE VOTAÇÃO=============");
	    System.out.println("1 - Candidato A");
	    System.out.println("2 - Candidato B");
	    System.out.println("3 - Candidato C");
	    System.out.println("4 - Voto nulo");
	    
    	int voto1Per = 0;
		int voto2Per = 0;
		int voto3Per = 0;
		int voto4Per = 0;


	    
		System.out.print("\nDigite o código do candidato para o primeiro voto: ");
		int voto1 = 0;
		try{
		    voto1 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		switch(voto1){
		    
		    case 1:
		        voto1Per = 1+ voto1Per;
		        break;
		    case 2:
		        voto1Per = 1+ voto2Per;
		        break;
		    case 3:
		        voto3Per = 1+ voto3Per;
		        break;
		    case 4:
		        voto4Per = 1+ voto4Per;
		        break;
	
		    default:
		    System.out.println("\nOpção Inválida.");
		}
		
		
		System.out.print("Digite o código do candidato para o segundo  voto: ");
		int voto2 = 0;
		try{
		    voto2 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		    
		}
		switch(voto2){
		    
		    case 1:
		        voto1Per = 1+ voto1Per;
		        break;
		    case 2:
		        voto2Per = 1+ voto2Per;
		        break;
		    case 3:
		        voto3Per = 1+ voto3Per;
		        break;
		    case 4:
		        voto4Per = 1+ voto4Per;
		        break;
		 
		    default:
		    System.out.println("\nOpção Inválida.");
		}
		
		
		
		System.out.print("Digite o código do candidato para o terceiro voto: ");
		int voto3 = 0;
		try{
		    voto3 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		}
		switch(voto3){
		    
		    case 1:
		        voto1Per = 1+ voto1Per;
		        break;
		    case 2:
		        voto2Per = 1+ voto2Per;
		        break;
		    case 3:
		        voto3Per = 1+ voto3Per;
		        break;
		    case 4:
		        voto4Per = 1+ voto4Per;
		        break;
		  
		    default:
		    System.out.println("\nOpção Inválida.");
		}
		
		
		
		System.out.print("Digite o código do candidato para o quarto   voto: ");
		int voto4 = 0;
		try{
		    voto4 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		}
		switch(voto4){
		    
		    case 1:
		        voto1Per = 1+ voto1Per;
		        break;
		    case 2:
		        voto2Per = 1+ voto2Per;
		        break;
		    case 3:
		        voto3Per = 1+ voto3Per;
		        break;
		    case 4:
		        voto4Per = 1+ voto4Per;
		        break;
		   
		    default:
		    System.out.println("\nOpção Inválida.");
		}
		
		
		
		System.out.print("Digite o código do candidato para o quinto   voto: ");
		int voto5 = 0;
		try{
		    voto5 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		}
		switch(voto5){
		    
		    case 1:
		        voto1Per = 1+ voto1Per;
		        break;
		    case 2:
		        voto2Per = 1+ voto2Per;
		        break;
		    case 3:
		        voto3Per = 1+ voto3Per;
		        break;
		    case 4:
		        voto4Per = 1+ voto4Per;
		        break;
		   
		    default:
		    System.out.println("\nOpção Inválida.");
		}
		
		
		
	
		float porcentagemValidos = (float)Math.abs((voto1Per+voto2Per+voto3Per)*20f);
		
		
		//Seja os votos válidos = Desconsiderando Votos Nulos:
		float porcentagemCand1 = (float)(voto1Per*20)*100/porcentagemValidos;
		float porcentagemCand2 = (float)(voto2Per*20)*100/porcentagemValidos;
		float porcentagemCand3 = (float)(voto3Per*20)*100/porcentagemValidos;
		
		
		System.out.printf("\nPercentual de votos válidos:                %.2f%%\n",porcentagemValidos);
		System.out.printf("Percentual de votos válidos ao Candidato 1: %.2f%%\n",porcentagemCand1);
		System.out.printf("Percentual de votos válidos ao Candidato 2: %.2f%%\n",porcentagemCand2);
		System.out.printf("Percentual de votos válidos ao Candidato 3: %.2f%%\n",porcentagemCand3);
		
		if(porcentagemCand1>porcentagemCand2 && porcentagemCand1>porcentagemCand3){
		    System.out.println("\nCandidato vencedor: Candidato A");
		} else if(porcentagemCand2>porcentagemCand1 && porcentagemCand2>porcentagemCand3){
		    System.out.println("\nCandidato vencedor: Candidato B");
		} else if(porcentagemCand3>porcentagemCand2 && porcentagemCand3>porcentagemCand1){
		    System.out.println("\nCandidato vencedor: Candidato C");
		}
		
		
		
	}
}
