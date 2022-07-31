import java.util.ArrayList;

public class Menu {

	public Menu(ArrayList<Food> foodList)
	{
		this.foodList=foodList;
	}
	
	public String getMostChildChoices(String cat1,String cat2)
	{
		int cat1_count=0;
		int cat2_count=0;
		for(Food x:foodList)
		{
			if(x.getCategory().equals(cat1)&&x.isChildFriendly())
				cat1_count++;
			if(x.getCategory().equals(cat2)&&x.isChildFriendly())
				cat2_count++;
		}
		if(cat1_count==0&&cat2_count==0)
			return "";
		else if(cat1_count==cat2_count)
			return cat1;
		else if(cat1_count>cat2_count)
			return cat1;
		else
			return cat2;
	}
	public int[] categoryCounts(String[] foodCategories)
	{
		int[] arr=new int[foodCategories.length];
		for(int i=0;i<foodCategories.length;i++)
		{
			int count=0;
			for(Food x:foodList)
			{
				if(x.getCategory().equals(foodCategories[i]))
				{
					count++;
				}
			}
			arr[i]=count;
		}
		return arr;
	}

}
