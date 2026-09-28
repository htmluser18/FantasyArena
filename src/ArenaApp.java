import java.util.Scanner;
import java.util.Random;

public class ArenaApp {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random dice = new Random();

        System.out.println("welcome to the Arena!");
        System.out.println("enter the hero name");
        String tempName= input.nextLine();

        System.out.println("enter the initial hp :");
        int tempHp= input.nextInt();

        System.out.println("enter the initial strength :");
        int tempStrength = input.nextInt();

        Hero player = new Hero(tempName, tempHp, tempStrength);

        System.out.println("\nchoose your hero class :");
        System.out.println("1. Warrior(+strength)");
        System.out.println("2.Mage (+magic)");
        System.out.println("3.Rouge(+speed)");

        int choice = input.nextInt();


        if(choice==1){
            player.setHeroClass("Warrior");
            System.out.println("u grabed a heavy sword!");
        }else if(choice==2){
            player.setHeroClass("Mage");
             System.out.println("u begin to casting a spell!");
        }else if(choice==3){
            player.setHeroClass("Rouge");
            System.out.println("u hide in the shadwos..");
        }else{
            player.setHeroClass("villager");
            System.out.println("invalid chioce , u are jst a villager..");

        }
        System.out.println("----Hero Status----");
        System.out.println("Name:"+player.getName());
        System.out.println("class:"+player.getHeroClass());
        System.out.println("HP:"+player.getHp());
        System.out.println("stength:"+player.getStrength());

        int goblinHP = 30;
        int goblinDamage = 5;


        while(player.getHp() > 0 && goblinHP > 0) {
            System.out.println("----new turn----");

            int turnDamage = dice.nextInt(player.getStrength()) + 1;
            int critRoll = dice.nextInt(100) + 1;

            if (critRoll <= 20) {
                System.out.println("crutial hit..!");
                turnDamage *= 2;
            }
            goblinHP -= turnDamage;
            System.out.println("you strick for "+ turnDamage+" damage ! goblin hp is "+goblinHP);

            if(goblinHP<=0){
                System.out.println("you defeated the goblin..!");
                break;
            }

            //goblin attack code
            player.takeDamage(goblinDamage);
            System.out.println("goblin hit u back ! your hp is now "+player.getHp());

            if(player.getHp()<=0){
                System.out.println("you have fallen in battle.GAME OVER");
            }

        }

    }

}