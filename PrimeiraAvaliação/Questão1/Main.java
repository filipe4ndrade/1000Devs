//Atividade Feita por José Filipe Silva de Andrade;
//Obs.: Demorei para deduzir as equações para realização das operações solicitadas;
//Obs.: Comandos adicionais foram adicionados para melhorar a avaliação da atividade, sem comprometer o que foi solicitado.

import java.util.Scanner;
import java.util.InputMismatchException;
public class Main{
    
    public static void agradecimento(){
        System.out.println("\nObrigado, até mais.");
    }
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("***Bem-Vindo ao Caixa Eletrônico 1000Devs***");
        System.out.println("********************************************");
        System.out.print("Digite a Opção desejada: \n 1- Para saque \n 2- Para sair \n-> ");
        int digito = 0;
        int erro = 0; // Chave para limitar os prints em caso de incoerencias na entrada.
        
        try{
             digito = teclado.nextInt();
        }catch(InputMismatchException ex){
            System.out.println("\nValor inserido não pode ser interpretado.");
            agradecimento();
            erro = 1;
        }
        
        int saque = 0;
        
        if(erro==0){
        
        switch(digito){
            
            case 1:
                System.out.print("\nDigite a quantidade de dinheiro a ser sacada: R$ ");
                
                try{
                    saque = teclado.nextInt();
                
                }catch(InputMismatchException ex){
                    System.out.println("\nValor inserido não pode ser interpretado.");
                    agradecimento();
                    erro = 1;
                    
                }
                break;
                
            case 2:
                agradecimento();
                erro = 1;
                break;
                
            default:
                System.out.println("\nOpção Inválida.");
                agradecimento();
                erro = 1;
                
        }
        }
        
        if(saque<=0&& erro==0){
            System.out.println("\nValor precisa ser maior que 0.");
            agradecimento();
            erro =1;
        }
        
        
        
        int nota100 = 0;
        int nota50  = 0;
        int nota20  = 0;
        int nota10  = 0;
        int nota5   = 0;
        
        int resto = saque%100;
        
        if(saque>=100){
            nota100 = saque/100;
            
            if(resto>=50){
                nota50 = resto/50;
                
                if(resto%50>=20){
                    nota20 = resto%50/20;
                    
                    if((resto%50)%20>=10){
                        nota10 = ((resto%50)%20)/10;
                        
                        if(((resto%50)%20)%10>=5){
                            nota5 = (((resto%50)%20)%10)/5;
                        }
                    }else{
                        nota5 = ((resto%50)%20)/5;
                    }
                }else{
                    if(resto%50>=10){
                        nota10 = resto%50/10;
                        if((resto%50)%10>=5){
                            nota5 = resto%50%10/5;
                        }
                    }else{
                        nota5 = resto%50/5;
                    }
                }
                
             } else{
                 if(saque%100>=20){
                     nota20 = (resto)/20;
                     if(resto%20>=10){
                        nota10 = resto%20/10;
                        if(resto%20%10>=5){
                            nota5 = (resto%20%10)/5;
                        }
                     }else {
                         nota5 = (resto%20)/5;
                     }
                 }else{
                     if(resto>=10){
                        nota10 = resto/10;
                     }else {
                         nota5 = resto/5;
                     }
                 }
             }
        }else{
            resto = saque;
             if(resto>=50){
                nota50 = resto/50;
                
                if(resto%50>=20){
                    nota20 = resto%50/20;
                    
                    if((resto%50)%20>=10){
                        nota10 = ((resto%50)%20)/10;
                        
                        if(((resto%50)%20)%10>=5){
                            nota5 = (((resto%50)%20)%10)/5;
                        }
                    }else{
                        nota5 = ((resto%50)%20)/5;
                    }
                }else{
                    if(resto%50>=10){
                        nota10 = resto%50/10;
                        if((resto%50)%10>=5){
                            nota5 = resto%50%10/5;
                        }
                    }else{
                        nota5 = resto%50/5;
                    }
                }
                
             } else{
                 if(saque%100>=20){
                     nota20 = (resto)/20;
                     if(resto%20>=10){
                        nota10 = resto%20/10;
                        if(resto%20%10>=5){
                            nota5 = (resto%20%10)/5;
                        }
                     }else {
                         nota5 = (resto%20)/5;
                     }
                 }else{
                     if(resto>=10){
                        nota10 = resto/10;
                     }else {
                         nota5 = resto/5;
                     }
                 }
             }
            
        }
        
        if(erro ==0){
            
        System.out.println("\nEis a quantidade de cada nota:");
        System.out.println("Notas de 100: "+nota100);
        System.out.println("Notas de 50 : "+nota50 );
        System.out.println("Notas de 20 : "+nota20 );
        System.out.println("Notas de 10 : "+nota10 );
        System.out.println("Notas de 5  : "+nota5  );
        
        agradecimento();
        }
    
    
      
    
    }
}