//Atividade Feita por José Filipe Silva de Andrade;
//Obs.: Tenho conhecimento que para minimizar o código eu poderia usar noções de procedimento ou funções, optei pelo desafio da repetição ;
//Obs.: Não foi realizado nenhum comando adicional.


import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner teclado = new Scanner(System.in);
	     
	    int chave = 0; // Se for 0 será compras à vista, se for 1 parcelada, se for 2 não será adicionada.
	    float compraPar1 = 0;
	    float compraPar2 = 0;
	    float compraPar3 = 0;
	    float compraPar4 = 0;
	    float compraPar5 = 0;
	    
	    float compraVis1 = 0;
	    float compraVis2 = 0;
	    float compraVis3 = 0;
	    float compraVis4 = 0;
	    float compraVis5 = 0;
	    
		System.out.println("COMPRA 01");
		System.out.print("Digite o valor total: R$ ");
		float compra1 = 0;
		try{
		   compra1 = teclado.nextFloat();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		System.out.println("Digite a forma de pagamento:\n");
		System.out.println("Código Classificação");
        System.out.println("1 - À vista, com 8% de desconto");
        System.out.println("2 - À vista no cartão, 4% de desconto");
        System.out.println("3 - Em 2x, preço normal sem juros");
        System.out.println("4 - Em 4x, preço acrescido de 8%\n ");
        System.out.print("->");
        
		int codigo1 = 0;
		float desconto1 = 0;
		float juros1 = 0;
		float fatura1 = 0;
		
		try{
		   codigo1 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		switch(codigo1){
		    
		  case 1:
		        desconto1 = compra1*0.08f;
		        compra1 = compra1 - desconto1;
		        System.out.println("Desconto de 8%");
		        chave = 0;
		        break;
		  case 2:
		        desconto1 = compra1*0.04f;
		        compra1 = compra1 - desconto1;
		        System.out.println("Desconto de 4%");
		        chave = 0;
		        break;
		  case 3:
		        fatura1 = compra1/2f;
		        System.out.printf("Em 2x de R$ %.2f\n",fatura1);
		        chave = 1;
		        break;
		  case 4:
		        juros1 = compra1*0.08f;
		        compra1 = compra1 + juros1;
		        fatura1 = compra1/4f;
		        System.out.printf("Em 4x de R$ %.2f\n",fatura1);
		        chave = 1;
		        break;
		  default:
		        System.out.println("Opção Inválida!");
		        chave = 2;
		        
		}
		System.out.printf("Valor Final: R$ %.2f\n", compra1);
		if(chave == 1){
		    //compra parcelada
		    compraPar1 = compra1;
		}else if(chave == 0){
		    //compra à vista
		     compraVis1 = compra1;
		}else{
		    compraVis1 = 0;
		    System.out.println("A compra não será processada.");
		}
		
		
		System.out.println("===============================");
		
		System.out.println("COMPRA 02");
		System.out.print("Digite o valor total: R$ ");
		float compra2 = 0;
		try{
		   compra2 = teclado.nextFloat();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		System.out.println("Digite a forma de pagamento:\n");
		System.out.println("Código Classificação");
        System.out.println("1 - À vista, com 8% de desconto");
        System.out.println("2 - À vista no cartão, 4% de desconto");
        System.out.println("3 - Em 2x, preço normal sem juros");
        System.out.println("4 - Em 4x, preço acrescido de 8%\n ");
        System.out.print("->");
        
		int codigo2 = 0;
		float desconto2 = 0;
		float juros2 = 0;
		float fatura2 = 0;
		
		try{
		   codigo2 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		switch(codigo2){
		    
		  case 1:
		        desconto2 = compra2*0.08f;
		        compra2 = compra2 - desconto2;
		        System.out.println("Desconto de 8%");
		        chave = 0;
		        break;
		  case 2:
		        desconto2 = compra2*0.04f;
		        compra2 = compra2 - desconto2;
		        System.out.println("Desconto de 4%");
		        chave = 0;
		        break;
		  case 3:
		        fatura2 = compra2/2f;
		        System.out.printf("Em 2x de R$ %.2f\n",fatura2);
		        chave = 1;
		        break;
		  case 4:
		        juros2 = compra2*0.08f;
		        compra2 = compra2 + juros2;
		        fatura2 = compra2/4f;
		        System.out.printf("Em 4x de R$ %.2f\n",fatura2);
		        chave = 1;
		        break;
		  default:
		        System.out.println("Opção Inválida!");
		        chave = 2;
		        
		}
		System.out.printf("Valor Final: R$ %.2f\n", compra2);
		if(chave == 1){
		    //compra parcelada
		     compraPar2 = compra2;
		}else if(chave == 0){
		    //compra à vista
		     compraVis2 = compra2;
		}else{
		    compraVis2 = 0;
		    System.out.println("A compra não será processada.");
		}
		
		
		
		System.out.println("===============================");
		
		System.out.println("COMPRA 03");
		System.out.print("Digite o valor total: R$ ");
		float compra3 = 0;
		try{
		   compra3 = teclado.nextFloat();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		System.out.println("Digite a forma de pagamento:\n");
		System.out.println("Código Classificação");
        System.out.println("1 - À vista, com 8% de desconto");
        System.out.println("2 - À vista no cartão, 4% de desconto");
        System.out.println("3 - Em 2x, preço normal sem juros");
        System.out.println("4 - Em 4x, preço acrescido de 8%\n ");
        System.out.print("->");
        
		int codigo3 = 0;
		float desconto3 = 0;
		float juros3 = 0;
		float fatura3 = 0;
		
		try{
		   codigo3 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		switch(codigo3){
		    
		  case 1:
		        desconto3 = compra3*0.08f;
		        compra3 = compra3 - desconto3;
		        System.out.println("Desconto de 8%");
		        chave = 0;
		        break;
		  case 2:
		        desconto3 = compra3*0.04f;
		        compra3 = compra3 - desconto3;
		        System.out.println("Desconto de 4%");
		        chave = 0;
		        break;
		  case 3:
		        fatura3 = compra3/2f;
		        System.out.printf("Em 2x de R$ %.2f\n",fatura3);
		        chave = 1;
		        break;
		  case 4:
		        juros3 = compra3*0.08f;
		        compra3 = compra3 + juros3;
		        fatura3 = compra3/4f;
		        System.out.printf("Em 4x de R$ %.2f\n",fatura3);
		        chave = 1;
		        break;
		  default:
		        System.out.println("Opção Inválida!");
		        chave = 2;
		        
		}
		System.out.printf("Valor Final: R$ %.2f\n", compra3);
		if(chave == 1){
		    //compra parcelada
		     compraPar3 = compra3;
		}else if(chave == 0){
		    //compra à vista
		     compraVis3 = compra3;
		}else{
		    compraVis3 = 0;
		    System.out.println("A compra não será processada.");
		}
		
		
		
		System.out.println("===============================");
		
		System.out.println("COMPRA 04");
		System.out.print("Digite o valor total: R$ ");
		float compra4 = 0;
		try{
		   compra4 = teclado.nextFloat();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		System.out.println("Digite a forma de pagamento:\n");
		System.out.println("Código Classificação");
        System.out.println("1 - À vista, com 8% de desconto");
        System.out.println("2 - À vista no cartão, 4% de desconto");
        System.out.println("3 - Em 2x, preço normal sem juros");
        System.out.println("4 - Em 4x, preço acrescido de 8%\n ");
        System.out.print("->");
        
		int codigo4 = 0;
		float desconto4 = 0;
		float juros4 = 0;
		float fatura4 = 0;
		
		try{
		   codigo4 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		switch(codigo4){
		    
		  case 1:
		        desconto4 = compra4*0.08f;
		        compra4 = compra4 - desconto4;
		        System.out.println("Desconto de 8%");
		        chave = 0;
		        break;
		  case 2:
		        desconto4 = compra4*0.04f;
		        compra4 = compra4 - desconto4;
		        System.out.println("Desconto de 4%");
		        chave = 0;
		        break;
		  case 3:
		        fatura4 = compra4/2f;
		        System.out.printf("Em 2x de R$ %.2f\n",fatura4);
		        chave = 1;
		        
		        break;
		  case 4:
		        juros4 = compra4*0.08f;
		        compra4 = compra4 + juros4;
		        fatura4 = compra4/4f;
		        System.out.printf("Em 4x de R$ %.2f\n",fatura4);
		        chave = 1;
		        break;
		  default:
		        System.out.println("Opção Inválida!");
		        chave = 2;
		        
		}
		System.out.printf("Valor Final: R$ %.2f\n", compra4);	
		if(chave == 1){
		    //compra parcelada
		     compraPar4 = compra4;
		}else if(chave == 0){
		    //compra à vista
		     compraVis4 = compra4;
		}else{
		    compraVis4 = 0;
		    System.out.println("A compra não será processada.");
		}
		
		
		
		System.out.println("===============================");
		
		System.out.println("COMPRA 05");
		System.out.print("Digite o valor total: R$ ");
		float compra5 = 0;
		try{
		   compra5 = teclado.nextFloat();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		System.out.println("Digite a forma de pagamento:\n");
		System.out.println("Código Classificação");
        System.out.println("1 - À vista, com 8% de desconto");
        System.out.println("2 - À vista no cartão, 4% de desconto");
        System.out.println("3 - Em 2x, preço normal sem juros");
        System.out.println("4 - Em 4x, preço acrescido de 8%\n ");
        System.out.print("->");
        
		int codigo5 = 0;
		float desconto5 = 0;
		float juros5 = 0;
		float fatura5 = 0;
		
		try{
		   codigo5 = teclado.nextInt();
		}catch(InputMismatchException ex){
		    System.out.println("Valor digitado inválido!");
		   
		}
		
		switch(codigo5){
		    
		  case 1:
		        desconto5 = compra5*0.08f;
		        compra5 = compra5 - desconto5;
		        System.out.println("Desconto de 8%");
		        chave = 0;
		        break;
		  case 2:
		        desconto5 = compra5*0.04f;
		        compra5 = compra5 - desconto5;
		        System.out.println("Desconto de 4%");
		        chave = 0;
		        break;
		  case 3:
		        fatura5 = compra5/2f;
		        System.out.printf("Em 2x de R$ %.2f\n",fatura5);
		        chave = 1;
		        break;
		  case 4:
		        juros5 = compra5*0.08f;
		        compra5 = compra5 + juros5;
		        fatura5 = compra5/4f;
		        System.out.printf("Em 4x de R$ %.2f\n",fatura5);
		        chave = 1;
		        break;
		  default:
		        System.out.println("Opção Inválida!");
		        chave = 5;
		        
		}
	    System.out.printf("Valor Final: R$ %.2f\n", compra5);
	    
	    if(chave == 1){
		    //compra parcelada
		    compraPar5 = compra5;
		}else if(chave == 0){
		    //compra à vista
		     compraVis5 = compra5;
		}else{
		    compraVis5 = 0;
		    System.out.println("A compra não será processada.");
		}
		
		 float totalVis = compraVis1+compraVis2+compraVis3+compraVis4+compraVis5;
		 float totalPar = compraPar1+compraPar2+compraPar3+compraPar4+compraPar5;
		 float totalDesconto = desconto1+desconto2+desconto3+desconto4+desconto5;
		 float totalJuros = juros1+juros2+juros3+juros4+juros5;
		 System.out.printf("\nTotal de Compras à Vista:    R$ %.2f\n",totalVis);
		 System.out.printf("Total de Compras Parceladas: R$ %.2f\n",totalPar);
		 System.out.printf("\nTotal de Descontos: R$ %.2f\n",totalDesconto);
		 System.out.printf("Total de Juros: R$ %.2f\n",totalJuros);
	    
	}
}
