package champions;

public class Wizard extends Champion implements Iwizard{
	private int healPoint=5;
	

	public Wizard() {
		super(20, 4);
	}

	public void attack(Champion target) {
		super.attack(target);
	}
	
	public void heal()
	{
		this.setHp(this.getHp()+healPoint);
		System.out.println("Wizzard did a spell, and his life increase of "+ healPoint+ "Hp!");
	}
	

}
