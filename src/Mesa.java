import java.util.ArrayList;

class Mesa {
	
	private String nome;
	private int ig,inf;
	private ArrayList<String> filosofo, garfo;
	private Mesa mesa;
	private boolean ocupado;
	
	Garfo cGarfo = new Garfo(ig, inf, nome, mesa,filosofo(),ocupado);
		
	public Mesa(ArrayList<String> filosofo,ArrayList<String> garfo,boolean ocupado) {
		this.filosofo = filosofo;
		this.garfo = garfo;
		this.ig = 0;
		this.inf = 0;
		this.ocupado = ocupado;
} 
	
	public synchronized void jantar(long tempo,ThreadJantar thread, Garfo cGarfo) {
	  	while(true){
	  		if (cGarfo.garfo_esquerda(nome,ig,tempo,ocupado)==true && cGarfo.garfo_direita(nome,ig,tempo,ocupado)==true){
	  			System.out.println(nome +" esta comendo");
	  			Thread.sleep(tempo);
	  			ocupado = false;
	  			cGarfo.garfo_direita(nome, ig, tempo,ocupado);
	  			cGarfo.garfo_esquerda(nome, ig, tempo,ocupado);
	  		}
	  		else{
	  			if(cGarfo.garfo_esquerda(nome,ig,tempo,ocupado)==true){
	  				ocupado = false;
	  				cGarfo.garfo_direita(nome, ig, tempo,ocupado);
		  			cGarfo.garfo_esquerda(nome, ig, tempo,ocupado);
	  				ThreadJantar.pensar(tempo,nome);
	  			}else{
	  				ocupado = false;
	  				cGarfo.garfo_direita(nome, ig, tempo, ocupado);
	 				ThreadJantar.pensar(tempo,nome);
	  		}

	  		
	  		
	  		}
  		}
	
	}
}

