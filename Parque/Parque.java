import java.util.ArrayList;

public class Parque {
		
		private static int qthreads;
		private static int threadsVisitando;
		private static int id;
		private static ArrayList<String> pp;
		
		public static boolean inOut() { //Caso o parâmetro do array seja menor que o tamanho do array, retorna 'true' 
			if (id<pp.size()){
				return true;
			}else {						//Caso o parâmetro seja igual ao tamanho do array, retorna 'false'
				return false;
		
			}
		}
		
		public Parque(int qthreads, ArrayList<String> pp) {
			this.qthreads = qthreads;
			this.threadsVisitando = 0;
			this.id = 0;				//índice do array
			this.pp = pp;				
	
		}
		//
		public synchronized void noParque(long tempo, String nome, ThreadSegundo thread) { //Recebe os dados da Thread 
				try {
				System.out.println("A "+ nome + " esta dentro do parque " + pp.get(id));
				Thread.sleep(tempo); //Coloca as threads em repouso até que todas terminem o processo
			}catch (Exception e) {
				System.err.println("ERRO na funcao 'noParque'");
			}finally {
				Fila(nome);	
			}
		}	
			public synchronized void Fila(String nome1){	//Abre a fila de espera das threads em repouso
				
			threadsVisitando++;
			if(threadsVisitando<qthreads) {
				try {
					System.out.println(nome1 + " esta esperando para sair ");
					
					} catch (Exception e) {
					System.err.println("ERRO na funcao 'Fila 1'");
				}
				
			}else {
				
				try {
					id++; 		//Acrescenta o índice do array 
					threadsVisitando = 0;
					System.out.println("A fila de espera esta cheia");
					notifyAll();	//Libera as threads em repouso após todas terminarem o processo
				} catch (Exception e) {
					System.err.println("ERRO na funcao 'Fila 2'");
				}
			}
			
		}
	}
