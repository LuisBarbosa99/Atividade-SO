
public class ThreadPrimeiro extends Thread {
	private long minimo, maximo;
	private int id;
	private String fsenha;
	boolean b = true;
	
	public ThreadPrimeiro(int id, long minimo, long maximo, String fsenha, boolean b){
		this.id = id;
		this.minimo = minimo;
		this.maximo = maximo;
		this.fsenha = fsenha;
		this.b = b;
		
	}
	
	public void run() {
		
		System.out.println("INICIO");
			//Condicional para cada intervalo, se a thread respectiva ao intervalo encontrar a senha
			for(long i = minimo; i < maximo && b; i++) {
				String total = String.format("%09d", i);
				if(total.equals(fsenha)) {
					System.out.println("id: " + id + " total: " + total);
					b = false;			//Determina o fim do programa
					Thread.interrupted();
			}
			}
		}
	}

