
public class Consumable extends Object {
	
	private char consumableType;
	private int modifier;
	
	public Consumable (int objectId, String objectName, char type, int modifier) {
		super(objectId, objectName);
		if( type == 'h' | type == 's' | type == 'm') {
		this.consumableType = type;	
		}
		else {
			this.consumableType = 'h';
		}
		this.modifier = modifier;
	}
	
	public char getConsumableType() {
		return consumableType;
	}
	
	public int getModifier() {
		return modifier;
	}


}
