import java.util.ArrayList;

public class Main {
	private boolean[] garfos;
	
private static void Iniciar(Garfo cGarfo) {
	for(int inf = 0;inf<5;inf++){

		new ThreadJantar(inf, cGarfo).start();
		//Thread.start(inf,cGarfo)
	}
			
	}
	
	public static void main(String[] args) {
		Garfo cGarfo = new Garfo(garfos);
		Iniciar(cGarfo);	
	}

}
