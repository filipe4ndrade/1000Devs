import java.util.Scanner;
import validacoes.validacoes;
public class App {
   
    
    
    
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
    validacoes verificar = new validacoes();

	int minimoMinuscula, minimoMaiuscula, minimoDigitos, minimoCaracteresEsp, minimoCaracteres;
	boolean validaMaiuscula, validaMiniscula, validaDigitos, validaCaracteresEsp, validaMinCaracteres;
	
	System.out.print("Digite uma senha para validação: ");
	String senha = teclado.nextLine();
	
	minimoMinuscula = 1;
	minimoMaiuscula = 1;
	minimoDigitos = 1;
	minimoCaracteresEsp = 1;
	minimoCaracteres = 8;
	

	validaMiniscula = verificar.verificaMinusculas(senha,minimoMinuscula);
	validaMaiuscula = verificar.verificaMaiusculas(senha,minimoMaiuscula);
	validaDigitos = verificar.verificaDigitos(senha,minimoDigitos);
	validaCaracteresEsp = verificar.verificaCaracteresEsp(senha,minimoCaracteresEsp);
	validaMinCaracteres = verificar.verificaMinCaract(senha,minimoCaracteres);
	
	String mensagem = "Senha não aceita. Sua senha deve contar com no mínimo: ";
	
	if(!validaMiniscula)
	mensagem += "\n- " + minimoMinuscula + " caractere(s) minúsculo(s).";
	if(!validaMaiuscula)
	mensagem += "\n- " + minimoMaiuscula + " caractere(s) maiúsculo(s).";
	if(!validaDigitos)
	mensagem += "\n- " + minimoDigitos + " dígito(s).";
	if(!validaCaracteresEsp)
	mensagem += "\n- " + minimoCaracteresEsp + " caractere(s) especial(ais).";
	if(!validaMinCaracteres)
	mensagem += "\n- " + minimoCaracteres + " caractere(s).";
	if(validaMiniscula&&validaMaiuscula&&validaDigitos&&validaCaracteresEsp&&validaMinCaracteres)
	mensagem = "Senha Aceita.";
	
	System.out.println(mensagem);
	
	
	}

}
