import java.util.ArrayList;

public class Main {
	private boolean ocupado = false;
	
private static void Iniciar() {
	
	Mesa mesa = new Mesa(filosofo(),garfo(),ocupado);
	
	
	ThreadJantar Thread = new ThreadJantar(mesa);
	Thread.start();
	}
	private static ArrayList<String> filosofo(){
		ArrayList<String> filosofo = new ArrayList<String>();
		filosofo.add("Filosofo 1");
		filosofo.add("Filosofo 2");
		filosofo.add("Filosofo 3");
		filosofo.add("Filosofo 4");
		filosofo.add("Filosofo 5");
		return filosofo;
	}
	private static ArrayList<String> garfo(){
		ArrayList<String> garfo = new ArrayList<String>();
		garfo.add("Garfo 1");
		garfo.add("Garfo 2");
		garfo.add("Garfo 3");
		garfo.add("Garfo 4");
		garfo.add("Garfo 5");
		return garfo;
	}
	
	public static void main(String[] args) {
		Iniciar();	
	}

}
