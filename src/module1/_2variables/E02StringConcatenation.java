package module1._2variables;

public class E02StringConcatenation {
	//Exercise 2: Run the code to see how Strings can
	//be concatenated with variables
	public static void main(String[] args) {
		int score;
		score = 0;
		System.out.println("The score is " + score);

		double price = 23.25;
		System.out.println("The price is " + price);

		boolean won = false;
		System.out.println("Won? " + won);
		won = true;
		System.out.println("Won? " + won);

		String name = "Jose";
		System.out.println("Hi " + name);
		
		String color = "pink";
		System.out.println("Favorite " + color + "is ");
	}
}

