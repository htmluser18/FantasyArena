public class Hero{
    private String name;
    private String heroClass;
    private int hp;
    private int strength;


    public Hero(String inputName, int inputHp, int inputStrength) {
        this.name = inputName;
        this.hp = inputHp;
        this.strength = inputStrength;
        this.heroClass = "unknown";
    }
        public String getName() { return this.name; }
        public String getHeroClass() { return this.heroClass; }
        public int getHp() { return this.hp; }
        public int getStrength() { return this.strength; }

        public void setHeroClass(String newClass) {

        this.heroClass = newClass;
        }

        public void takeDamage(int damage) {
            this.hp = this.hp - damage;

            if (this.hp < 0) {
                this.hp = 0;
            }

    }

}