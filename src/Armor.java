public class Armor extends Object {
        private char armorType;
        private int armorDefense;

        public Armor(int id, String name, char type, int defense) {
            super(id, name);
            if (type == 'h' | type == 't' | type == 'l') {
                this.armorType = type;
            } else {
                this.armorType = 's';
            }
            this.armorDefense = defense;
        }

    public int getArmorDefense() { return armorDefense; }




    }
