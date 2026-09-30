public class Hero extends GameCharacter{
  private String heroClass;

    public Hero(String inputName, int inputHp, int inputStrength) {
        super(inputName,inputHp,inputStrength);
        this.heroClass = "unknown";
    }
        public String getHeroClass() {
            return this.heroClass;
            }

        public void setHeroClass(String newClass) {

        this.heroClass = newClass;
        }

    }

