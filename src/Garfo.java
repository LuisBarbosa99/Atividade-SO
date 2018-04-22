import java.util.ArrayList;

public class Garfo {
	private int ig,inf;
	private String nome;
	private boolean ocupado;
	private Mesa mesa;
	private ArrayList <String> filosofo;
	
	public Garfo(int ig,int inf,String nome,Mesa mesa,ArrayList<String> filosofo,boolean ocupado) {
		this.ig = ig;
		this.inf = inf;
		this.nome = nome;
		this.mesa = mesa;
		this.filosofo = filosofo;
		this.ocupado = ocupado;
	}
	public boolean garfo_esquerda(String nome, int ig,long tempo,boolean ocupado) {
		if (ocupado == false) {
			System.out.println(nome +" tenta pegar o garfo"+ig);
			ocupado = true;
			return ocupado;
		}else {
			System.out.println("O garfo "+ig+" esta ocupado");
			ThreadJantar.pensar(tempo,nome);
			return ocupado;
		
		}
			
	}
	public boolean garfo_direita(String nome,int ig, long tempo,boolean ocupado) {
		if (ocupado == false) {
			System.out.println(nome +"tenta pegar o garfo"+ig);
			ocupado = true;
			return ocupado;
		}else {
			System.out.println("O garfo"+ig+"esta ocupado");
			ThreadJantar.pensar(tempo,nome);
			return ocupado;
		}
			
	}
	public void LeftRight(long tempo) {
  		nome = filosofo.get(inf);
	if(inf == ig){
		this.garfo_direita(nome,ig,tempo,ocupado);
	}else if(inf == (ig + 1)){
		this.garfo_esquerda(nome,ig,tempo,ocupado);
	}else if(inf == (ig + 1) && ig >= 5){
		ig = 1;
		this.garfo_esquerda(nome,ig,tempo,ocupado);
	}
	}
}