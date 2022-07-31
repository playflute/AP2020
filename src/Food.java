
public class Food {
	private String category;
	private boolean isChildFriendly;
	private double price;
	
	public Food(String category,boolean isChildFriendly,double price)
	{
		this.category=category;
		this.isChildFriendly=isChildFriendly;
		this.price=price;
	}
	
	public String getCategory()
	{
		return this.category;
		
	}
	public boolean isChildFriendly()
	{
		return this.isChildFriendly;
	}
	public double getPrice()
	{
		return this.price;
	}

}
