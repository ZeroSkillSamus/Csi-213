
public class Main {

	public static void main(String[] args) {
		Item I = new Item (24, "Shmoney", 2);
        I.examine(); //prints out the name and weight of item
        System.out.println(I.getQuanity()); //
        System.out.println(I.getName());
        
        //testing for food class
        Food Pancake = new Food (2, "Pancake", 20, 4);
        Pancake.examine();
        System.out.println(Pancake.getNutrition());
        
        //testing for armor
        Armor A = new Armor(50, "Gosh", 1,200);
        System.out.println(A.getDefense());
        A.examine();
        //testing for Weapon
        Weapon W = new Weapon (50, "Excalibur", 1, 40);
        System.out.println(W.getDamage());
        W.examine();
      
	}

}
