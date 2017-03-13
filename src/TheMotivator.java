public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You're awesome");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("Well, what can I say?");
	}
	
	public void activity(int num)
	{
		if (num == 100)
			System.out.println("You ran a mile");
		else if (num > 90)
			System.out.println("You walked a mile");
		else if (num > 60)
			System.out.println("You got out of bed");
		else
			System.out.println("You stayed in bed all day");
	}
	
	public void eatFood(int num)
	{
		if (num == 100)
			System.out.println("You ate a salad");
		else if (num > 90)
			System.out.println("You ate a sandwich");
		else if (num > 60)
			System.out.println("You ate a burger");
		else
			System.out.println("You ate ice cream");
	}
	
	public void printHeader(String name)
	{
		System.out.println(name + " activities for the day");
	}
	
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.printHeader("Madison");
		tm.activity(70);
		tm.eatFood(90);
		tm.feedback(70);
	}
}