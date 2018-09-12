
public class Jogar{

		public static void main(String[] args) {
			
			Tabuleiro t = new Tabuleiro();
			
			Peao p = new Peao();
			p.setNome("Peao1 Branco");
			p.setCor("Branco");
			
			t.moverPeca(p, 0, 1);
			t.moverPeca(p, 0, 2);
			
		}
}
