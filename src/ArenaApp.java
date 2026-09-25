import java.util.Scanner;

public class ArenaApp {
    public static void main(String[] args){
        System.out.println("welcome to the Arena!");
        System.out.println("enter the hero name");
        Scanner input = new Scanner(System.in);
        String heroName = input.nextLine();

        System.out.println("enter the initial hp :");
        int hp = input.nextInt();
        System.out.println("enter the initial strength :");
        int strength = input.nextInt();

        System.out.println("\nchoose your hero class :");
        System.out.println("1. Warrior(+strength)");
        System.out.println("2.Mage (+magic)");
        System.out.println("3.Rouge(+speed)");

        int choice = input.nextInt();
        String heroClass = "unknown";

        if(choice==1){
            heroClass="Warrior";
            System.out.println("u grabed a heavy sword!");
        }else if(choice==2){
            heroClass="Mage";
             System.out.println("u begin to casting a spell!");
        }else if(choice==3){
            heroClass="Rouge";
            System.out.println("u hide in the shadwos..");
        }else{
            heroClass="villager";
            System.out.println("invalid chioce , u are jst a villager..");

        }
        System.out.println("----Hero Status----");
        System.out.println("Name:"+heroName);
        System.out.println("class:"+heroClass);
        System.out.println("HP:"+hp);
        System.out.println("stength:"+strength);


    }

}