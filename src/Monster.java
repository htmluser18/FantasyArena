public class Monster extends GameCharacter {

    private String monsterType;

    public Monster(String name, int hp, int strength, String monsterType) {
        super(name, hp, strength);
        this.monsterType = monsterType;
    }

    public String getMonsterType() {
        return this.monsterType;
    }

    public void battleCry() {
        System.out.println("The " + this.monsterType + " named " + this.getName() + " roars menacingly!");
    }
}