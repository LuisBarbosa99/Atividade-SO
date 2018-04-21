
public class ThreadSegundo extends Thread {
	private int id;
	private String nome;
	private Parque parque;
	
	public ThreadSegundo(int id, Parque parque) {
		this.id = id;
		this.nome = "Turma " + id;	//Defini��o do nome da turma
		this.parque = parque;
	}

	public void run() {
		while(Parque.inOut()) { 
			this.NoParque((long)Math.random()* 5000);	//Define um valor aleat�rio de tempo para o processamento das threads
		}
		System.out.println("Fim do programa.");
		
	}
	private void NoParque(long tempo) {
		parque.noParque(tempo, this.nome,this);		//Passa os valores processados na thread para a fun��o de entrar no parque
	}
}
