
public class Garfo {
	private boolean ocupado = false;
	
	public Garfo() {
		
	}
	public boolean garfo_esquerda(String nome, int ig) {
		if (ocupado == false) {
			System.out.println(nome +" tenta pegar o garfo"+ig);
			ocupado = true;
			return ocupado;
		}else {
			System.out.println("O garfo "+ig+" esta ocupado");
			System.out.println(nome+" esta pensando");
			return ocupado;
		
		}
			
	}
	public boolean garfo_direita(String nome,int ig) {
		if (ocupado == false) {
			System.out.println(nome +"tenta pegar o garfo"+ig);
			ocupado = true;
			return ocupado;
		}else {
			System.out.println("O garfo"+ig+"esta ocupado");
			System.out.println(nome+" esta pensando");
			return ocupado;
		}
			
	}
}
/*	  		nome = filosofo.get(inf);
	if(inf == ig){
		garfo_direita(nome,ig);
	}else if(inf == (ig + 1)){
		garfo_esquerda(nome,ig);
	}else if(inf == (ig + 1) && ig >= 5){
		ig = 1;
		garfo_esquerda(nome,ig);
	if(garfo_esquerda = true && garfo_direita = true){
		System.out.println(nome+ " ta comendo");
	}
*/