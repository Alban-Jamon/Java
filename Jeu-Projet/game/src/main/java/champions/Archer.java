package champions;

public class Archer extends Champion{
	

	public Archer() {
		super(20, 3);
	}

	public void attack(Champion target) {
		super.attack(target);
		super.attack(target);	
	}
	

}
