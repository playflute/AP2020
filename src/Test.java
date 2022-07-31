import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Food food1=new Food("Entree", true, 10);
		Food food2=new Food("Dessert", false, 11);
		Food food3=new Food("Appetizer", true, 20);
		Food food4=new Food("Appetizer", true, 19);
		Food food5=new Food("Entree", true, 6);
		ArrayList<Food> list=new ArrayList<Food>();
		list.add(food1);
		list.add(food2);
		list.add(food3);
		list.add(food4);
		list.add(food5);
		
		Menu m=new Menu(list);
		String[] types= {"Entree","Dessert","Appetizer"};
		int[] arr=m.categoryCounts(types);
		
		for(int x:arr)
		{
			System.out.println(x);
		}

		
		

	}

}
