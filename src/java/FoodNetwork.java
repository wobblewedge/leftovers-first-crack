import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class FoodNetwork {
	public static void main(String[] args) {
	List<String> ingredients = new ArrayList<String>();
	
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("What you got in the stink bin?");
	String ingredientList = input.nextLine();
	String[] ingredientArr = ingredientList.split(", ");
	
	
	for(int i = 0; i<ingredientArr.length; i++) {
	ingredients.add(ingredientArr[i]);
		}	
	System.out.print(ingredients.get(4));
	}
}