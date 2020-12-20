
public class Weapon extends Object {

	private char weaponType;
	private int weaponDamage;
	
	public Weapon(int id, String name, char type, int damage) {
		super(id, name);
		if (type == 's' | type == 'a' | type == 'b') {
			this.weaponType = type;
		}
		else {
			this.weaponType = 's';
		}
		this.weaponDamage = damage;
	}
	
	public char getWeaponType() {
		return weaponType;
	}
	
	public int getWeaponDamage() {
		return weaponDamage;
	}
	
	
	
}
