package champions;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Knight perceval =new Knight();
		Wizard Harry = new Wizard();
		Archer legolum = new Archer();
		
		perceval.attack(legolum);
		System.out.println(legolum.getHp());
		System.out.println(legolum.getId());

	}

}
