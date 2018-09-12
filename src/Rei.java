
public class Rei extends Peca{

	public boolean mover(int x, int y) {

		if(getCor().equalsIgnoreCase("Branco") || getCor().equalsIgnoreCase("Preto")){
		
			// verificar se nao está na ponta do tabuleiro
			
			// Mover para cima
			if(getY()+1 == y && getX() == x){
				return true;	
			}
			// Mover para baixo
			if(getY()-1 == y&& getX() == x){
				return true;	
			}
	
			// Mover para o lado direito
			if(getY() == y && getX()+1 == x){
				return true;	
			}
	
			// Mover para lado esquerdo
			if(getY() == y && getX()-1 == x){
				return true;	
			}	
		}
		return false;
	}
}