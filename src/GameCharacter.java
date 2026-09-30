public class GameCharacter {
    protected String name;
    protected int hp;
    protected int strength;

    public GameCharacter(String name, int hp, int strength) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
    }

    public void takeDamage(int damage) {
        this.hp = this.hp - damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public int getHp() {
        return this.hp;
    }

    public String getName() {
        return this.name;
    }

    public int getStrength() {
        return this.strength;
    }
}