
public class ThreadJantar extends Thread {
	private long tempo;
	private Mesa mesa;
	public ThreadJantar(Mesa mesa) {
		this.mesa = mesa;
		
	}
	public static void pensar(long tempo,String nome) {
		try {
		System.out.println(nome +" esta pensando");
		Thread.sleep(tempo);
	}catch(Exception e){
		
	}
		}
	
	public void run(Mesa mesa) {
		tempo = ((long)Math.random()*5000);
		mesa.jantar(tempo,this,cGarfo);
	
	}
	
}
