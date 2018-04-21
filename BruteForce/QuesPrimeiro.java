
public class QuesPrimeiro {
	
	private static void Comeca(long T, long maximo, String senha) {
		
		final boolean b = true;
		
		int i,id = 0;
		long minimo = 000000000;		//define o valor m�nimo para a senha
		
		//C�lculo para determinar o intervalo de senhas poss�veis em rela��o a quantidade de threads
		long val = (long)Math.round(maximo/T); 		
		maximo = val;
			for(i=0; i< T; i++) {		//In�cio das threads, sendo cada thread percorrendo um intervalo diferente
				try {
					ThreadPrimeiro Thread = new ThreadPrimeiro(id, minimo, maximo, senha, b);
					Thread.start();
					minimo = minimo + val; 
					maximo = minimo + val;
					id++;
					
				} catch (Exception e) {}
				
			}
	}

	public static void main(String[] args) {
		String senha = "000000089";		//Senha a ser encontrada
		
		long T = 5;			//Define o numero de threads a serem utilizados na for�a bruta
		long maximo = 999999999;		//Define o valor m�ximo aceit�vel pela senha
	
			Comeca(T, maximo, senha);
	

	}

}
