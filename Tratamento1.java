package Erro;

public class Tratamento1 {
	
	public static void main(String[] args) {
		int i=0;
		String palavras[] = {"dez","vinte","trinta","quareta"};
		while(i<5)
		{
			try{			
			System.out.println(palavras[i]);
			
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Erro de acesso ao vetor");
			}		
			i++;			
		}				
	}
}


