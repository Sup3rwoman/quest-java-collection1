import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 1 : Create an empty heroes list
        List<Hero> heroes = new ArrayList<>();


        // TODO 2 : Add those heroes to the list
        // name: Black Widow, age: 34
        // name: Captain America, age: 100
        // name: Vision, age: 3
        // name: Iron Man, age: 48
        // name: Scarlet Witch, age: 29
        // name: Thor, age: 1500
        // name: Hulk, age: 49
        // name: Doctor Strange, age: 42
        heroes.add(new Hero("Black Widow",34));
        heroes.add(new Hero("Captain America",100));
        heroes.add(new Hero("Vision",3));
        heroes.add(new Hero("Iron Man",48));
        heroes.add(new Hero("Scarlet Witch",29));
        Hero thor = new Hero("Thor", 1500);
        heroes.add(thor);
        heroes.add(new Hero("Hulk",49));
        heroes.add(new Hero("Doctor Strange",42));

        // TODO 3 : It's Thor birthday, now he's 1501
        thor.setAge(1501);
        heroes.set(5, thor);
        //heroes.set(5, heroes.get(5).setAge(1502)); //funktioniert nicht?
        System.out.println("It's Thors birthday. He turned " + heroes.get(5).getAge() + ".");

        // TODO 4 : Shuffle the heroes list
        System.out.println("---------------------");
        for (Hero element : heroes) {
            System.out.println(element.getName());
        }

        Collections.shuffle(heroes);
        System.out.println("---------------------");
        System.out.println("Shuffled list: ");
        for (Hero element : heroes) {
            System.out.println(element.getName());
        }

        // TODO 5 : Keep only the half of the list
        heroes.remove(7);
        heroes.remove(6);
        heroes.remove(5);
        heroes.remove(4);

        // TODO 6 : Loop throught the list and display the name of the remaining heroes
        System.out.println("---------------------");
        System.out.println("Shorted list: ");
        System.out.println("-------------");
        for (Hero element : heroes) {
            System.out.println(element.getName());
        }
    }
}
