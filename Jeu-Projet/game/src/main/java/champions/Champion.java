package champions;

public abstract class Champion implements InterfaceChampion {
	
	private static int count=0;
	private int id, hp, damage;
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
		if( target.isProtect())
		{
			if (target.getClass().getSimpleName()=="Knight")
			{
				//�a fait rien et on sors avec un return; 
			}
			
		}
		if ((target.getHp()-this.damage) < 0)
			target.setHp(target.getHp()-this.damage);		
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


	protected void setHp(int hp) {
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
