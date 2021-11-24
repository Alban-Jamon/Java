package champions;

public class Wizard extends Champion{
	

	public Wizard() {
		super(20, 3);
	}

	public void attack(Champion target) {
		super.attack(target);
		super.attack(target);	
	}
	

}
