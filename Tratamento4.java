package Erro;

public class Tratamento4 {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		int i=0;
		String palavras[] = {"dez","vinte","trinta","quareta"};
		while(i<5)
		{						
			System.out.println(palavras[i]);			
			i++;			
		}
		System.out.println("Erro de acesso ao vetor");
	}
	
}

