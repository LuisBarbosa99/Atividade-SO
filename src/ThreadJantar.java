
public class ThreadJantar extends Thread {
	private float tempo;
	private Mesa mesa;
	public ThreadJantar(Mesa mesa) {
		this.mesa = mesa;
	}
	public void run(Mesa mesa) {
		tempo = ((float)Math.random()*5000);
		jantar(tempo);
	}
	private void jantar(float tempo) {
		mesa.jantar(tempo);
	}
}
