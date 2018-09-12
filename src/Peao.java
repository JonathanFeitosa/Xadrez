
public class Peao extends Peca {

	public boolean mover(int x, int y) {
		
		if(getCor().equalsIgnoreCase("Branco")){
			
			if(getY()+1 == y && getX() == x){
				
				return true;	
			}
			
		}
		else if(getCor().equalsIgnoreCase("Preto")){
			
			if(getY()-1 == y  && getX() == x){
				return true;	
			}
			
		}
		return false;
	}

}
