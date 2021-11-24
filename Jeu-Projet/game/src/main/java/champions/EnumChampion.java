package champions;

public class EnumChampion {
	
	private enum KindChampion{
		Knight{
			public String toString() {
				return "Knight";
			}
		},
		Archer{
			public String toString() {
				return "Archer";
			}
		},
		Wizard{
			public String toString() {
				return "Wizard";
			}
		},
	}

}
