import java.util.ArrayList;

public class QuesSegundo {
	
	private static void Comeca(int qthreads) {
	
		Parque parque = new Parque(qthreads, cParque()); //CRIA��O DO OBJETO PARQUE
		
		for(int i = 1; i <= qthreads; i++) { //LA�O PARA INICIALIZAR AS THREADS 
			ThreadSegundo Thread = new ThreadSegundo(i,parque);
			Thread.start();
		}
	}
	
	private static ArrayList<String> cParque() { //CRIA��O DE ARRAY PARA DITAR A QNTD DE PARQUES A PERCORRER
		ArrayList<String> pp = new ArrayList<String>();
		pp.add("dos dinossauros");
		pp.add("da turma da monica");
		pp.add("do beto carrero");
		pp.add("da disney");
		return pp;
		
		
	}
	
	
	public static void main(String[] args) {
		
		int qthreads = 5;//DEFINI��O DA QUANTIDADE DE TURMAS
		
		Comeca(qthreads);
		

	}

}
