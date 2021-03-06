package champions;

public abstract class Champion implements InterfaceChampion {
	
	private static int count=0;
	private int id;
	private int hp;
	private int damage;
	private boolean protect;
	
	
	// Constructor
	public Champion(int hp, int damage) {
		Champion.count++;
		this.id=Champion.count;
		this.hp = hp;
		this.damage = damage;
		this.protect = false;
	}
	
	
	// some functions that you could like ... yes You ... I see you !
	
	public void protect(){
		this.setProtect(true);		
	}
	
	public void attack(Champion target) {
		int damage=this.damage;
		if( target.isProtect())
		{
			if (target.getClass().getSimpleName().equals("Knight"))
			{
				System.out.println("The "+target.getClass().getSimpleName()+ " with id "+ target.getId()+" use protection and he took no dommage");
				return;
			}
			else {
				damage/=2;
			}
			
		}
		
		target.setHp(target.getHp()-damage);
		
		if (target.getHp() > 0)
		{
			System.out.println(target.getClass().getSimpleName()+" with id "+target.getId()+ " receive "+damage+ "damage");
		}
			
		else {
			System.out.println(target.getClass().getSimpleName()+" with id "+ target.getId()+ "has been slain !");
			System.out.println("After took "+ damage + "damage points, he has gone to the Valhalla! ");
			System.out.println("RIP");
			
		}
		
		
	}
	
	public void heal() {
		
	}
	

	
	//ToString
	
	@Override
	public String toString() {
		String carriageReturn = System.getProperty("line.separator");
		return carriageReturn+this.getClass().getSimpleName()+" id=" + id + ", hp=" + hp + ", damage=" + damage + ", protect=" + protect  ;
	}
	
	
	//Getter ---- Setter
	public static int getCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getDamage() {
		return damage;
	}


	public boolean isProtect() {
		return protect;
	}


	public void setProtect(boolean protect) {
		this.protect = protect;
	}

	

}
