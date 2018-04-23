
public class Garfo {
	private int ig;
	
	private boolean[] garfos;
	
	
	public Garfo(boolean[]garfos) {
		this.garfos =new boolean[5];
		for (int i = 0;i<5;i++) {
			garfos[i] = false;
		}
		
	}
		
	public synchronized boolean pegarGarfoDireita(int inf){
		ig = inf;
		if(inf == ig){	
			if (garfos[ig]==false){
				System.out.println("pega a porra do garfo");
				garfos[ig] = true;
				return true;
			}else{
				System.out.println("garfo "+ig+" em uso");
				if (pegarGarfoEsquerda(inf) == true){ //caso este garfo esteja ocupado e o filósofo já tenha pego outro garfo, ele solta
					soltarGarfo(inf);
				}
				try {
					Thread.sleep((long)(Math.random() * 2000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return false;	
				}
		}else{
		System.out.println("ta dando erro ao pegar garfo direito");
		return false;
		}
	}
	public synchronized boolean pegarGarfoEsquerda(int inf){
		int i = inf;
		if(inf == 4) {
			i = 1;
		}else {
			i++;
		}
		if(inf == (i-1)){	
			if (garfos[i]==false){
				System.out.println("Filosofo "+inf+" pega o garfo "+i);
				garfos[i] = true;
				return true;
			}else{
				System.out.println("garfo "+i+" em uso");
				if (pegarGarfoDireita(inf) == true){ //caso este garfo esteja ocupado e o filósofo já tenha pego outro garfo, ele solta
					this.soltarGarfo(inf);
				}
				try {
					Thread.sleep((long)(Math.random() * 2000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return false;	
				}
		}else{
			System.out.println("ta dando erro ao pegar garfo esquerdo");
			return false;
		}
		
	
	}
	public synchronized void soltarGarfo(int inf) {
		try {
			if(inf==ig) {
				if(garfos[ig]==true) {
					
					System.out.println("O filosofo "+inf+" soltou o garfo "+ig);
					garfos[ig] = false;
			
				}else {
					Thread.sleep((long)(Math.random() * 2000));
				}
		}
		ig++;
		if(inf==(ig+1)) {
			 if(garfos[ig+1]==true) {
				 System.out.println("O filosofo "+inf+" soltou o garfo"+ig);
				 garfos[ig+1]= false;
			 }else {
				 Thread.sleep((long)(Math.random() * 2000));
				 
			 }
			
		}if(inf == 4) {
			ig = 0;
			if (garfos[ig]==true) {
				garfos[ig] = false;
				System.out.println("O filosofo"+inf+"soltou o garfo"+ig);
				
			}
		}
		
	}catch (Exception e) {
		System.err.println("Erro ao filosofo "+inf+" soltar garfo");
	}
	}
}
	
	
	
