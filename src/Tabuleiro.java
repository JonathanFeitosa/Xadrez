
public class Tabuleiro {

	Peao p;
	Rei r;
	
	Tabuleiro(){
		p = new Peao();
		r = new Rei();
	}
	
	public void moverPeca(Peca p, int x, int y){
	
		if(p.mover(x, y)) {
			p.setX(x);
			p.setY(y);
			mostrarPeca(p);
		}
		else{
			System.out.println("Movimento invalido");	
		}
	}
	public void mostrarPeca(Peca p){
		System.out.println((p.getNome().equalsIgnoreCase("Rei") ? "Rei: " : "Peao: ")  +  p.getNome() + ", x = " + p.getX() + ", y = " + p.getY());
	}
}