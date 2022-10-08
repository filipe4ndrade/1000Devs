package validacoes;

public class validacoes {
    
    public static boolean verificaMinusculas(String senha,
                                             int qtd){
                                                 
     String alfabetoMinusculo = "abcdefghijklmnopqrstuvwxyz";
     int contador = 0;
    
     
        for(int i = 0; i<alfabetoMinusculo.length(); i++)
        {
            for(int y = 0; y<senha.length(); y++){
                
                if(senha.charAt(y) == alfabetoMinusculo.charAt(i))
                contador++;
                
            }
        }
        
        if(contador>=qtd) return true;
        else return false; 
        
    
     }
     
     
      public static boolean verificaMaiusculas(String senha,
                                             int qtd){
                                                 
     String alfabetoMaiusculo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     int contador = 0;
    
     
        for(int i = 0; i<alfabetoMaiusculo.length(); i++)
        {
            for(int y = 0; y<senha.length(); y++){
                
                if(senha.charAt(y) == alfabetoMaiusculo.charAt(i))
                contador++;
                
            }
        }
        
        if(contador>=qtd) return true;
        else return false; 
        
    
     }
     
     public static boolean verificaDigitos(String senha,
                                             int qtd){
                                                 
     String digitos = "0123456789";
     int contador = 0;
     
     
        for(int i = 0; i<digitos.length(); i++)
        {
            for(int y = 0; y<senha.length(); y++){
                
                if(senha.charAt(y) == digitos.charAt(i))
                contador++;
                
            }
        }
        
        if(contador>=qtd) return true;
        else return false; 
        
    
     }
     
      public static boolean verificaCaracteresEsp(String senha,
                                                  int qtd){
                                                 
     String caracteresEsp = " \'\"!@#$%¨&*()_-+=§|\\´`[{ª^~}]º,<.>;:/?°";
     int contador = 0;
    
     
        for(int i = 0; i<caracteresEsp.length(); i++)
        {
            for(int y = 0; y<senha.length(); y++){
                
                if(senha.charAt(y) == caracteresEsp.charAt(i))
                contador++;
                
            }
        }
        
        if(contador>=qtd) return true;
        else return false; 
        
    
     }
     
     public static boolean verificaMinCaract(String senha,
                                                  int qtd){
                                                 
     
        if(senha.length()>=qtd) return true;
        else return false; 
        
    
     }

}
