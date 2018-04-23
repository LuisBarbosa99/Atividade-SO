
public class ThreadJantar extends Thread {
	private long tempo;
	private Garfo cGarfo;
	private String nome;
	private int inf;
	
	public ThreadJantar(int inf,Garfo cGarfo) {
	this.nome = "Filosofo" + inf;	
	this.inf = inf;
	this.cGarfo = cGarfo;
	}
	
	public void pensar() {
		try {
		System.out.println(nome +" esta pensando");
		tempo = ((long)Math.random()*5000);
		sleep(tempo);
	}catch(Exception e){
		
	}
	}
	public void comer() {
		try {
		if(cGarfo.pegarGarfoDireita(inf)==true && cGarfo.pegarGarfoEsquerda(inf)== true){	
				System.out.println(nome +" esta comendo");
				tempo = ((long)Math.random()*5000);
				sleep(tempo);
			
		}else{
		cGarfo.soltarGarfo(inf);
		this.pensar();
		}
		} catch (Exception e) {
			System.err.println("Qualquer erro que der");
		}
	}
	public void run() {
	while(true) {	
		this.pensar();
		cGarfo.pegarGarfoDireita(inf);
		cGarfo.pegarGarfoEsquerda(inf);
		this.comer();
		cGarfo.soltarGarfo(inf);
		
	}
	}
	
}
