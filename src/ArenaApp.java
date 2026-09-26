import java.util.Scanner;
import java.util.Random;

public class ArenaApp {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Hero player = new Hero();

        System.out.println("welcome to the Arena!");
        System.out.println("enter the hero name");
        player.name= input.nextLine();

        System.out.println("enter the initial hp :");
        player.hp = input.nextInt();

        System.out.println("enter the initial strength :");
        player.strength = input.nextInt();

        System.out.println("\nchoose your hero class :");
        System.out.println("1. Warrior(+strength)");
        System.out.println("2.Mage (+magic)");
        System.out.println("3.Rouge(+speed)");

        int choice = input.nextInt();
        String heroClass = "unknown";

        if(choice==1){
            player.heroClass="Warrior";
            System.out.println("u grabed a heavy sword!");
        }else if(choice==2){
            player.heroClass="Mage";
             System.out.println("u begin to casting a spell!");
        }else if(choice==3){
            player.heroClass="Rouge";
            System.out.println("u hide in the shadwos..");
        }else{
            player.heroClass="villager";
            System.out.println("invalid chioce , u are jst a villager..");

        }
        System.out.println("----Hero Status----");
        System.out.println("Name:"+player.name);
        System.out.println("class:"+player.heroClass);
        System.out.println("HP:"+player.hp);
        System.out.println("stength:"+player.strength);

        int goblinHP = 30;
        int goblinDamage = 5;
        Random dice = new Random();

        while(player.hp>0 && goblinHP>0) {
            System.out.println("----new turn----");
            int turnDamage = dice.nextInt(player.strength) + 1;
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
            player.hp = player.hp - goblinDamage;
            System.out.println("goblin hit u back ! your hp is now "+player.hp);

            if(player.hp<=0){
                System.out.println("you have fallen in battle.GAME OVER");
            }

        }

    }

}