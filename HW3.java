import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Q1();
		Q2();
	}

	public static void Q1() {

		Scanner scn = new Scanner(System.in);
		System.out.println("Question 1:\nEnter the searched word:");
		String word = scn.next();
		System.out.println("Enter number of articles:");
		int num = Integer.parseInt(scn.next());
		Thread[] tARR = new Thread[num];
		searchInFile[] sARR = new searchInFile[num];
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter name of article no "+i+":");
			String file = scn.next();
			sARR[i-1]= new searchInFile(file,word);
			Thread t = new Thread(sARR[i-1]);
			tARR[i-1] = t;
		}
		
		for(Thread t : tARR) t.start();
		for(Thread t : tARR)
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		System.out.println("Total number of times the word '" +word+
				"' appears in articles is " + searchInFile.countOfAllFiles);
		scn.close();
	}

	public static void Q2() {
		System.out.println("Question 2:");
		Product p1 = new PersonalPizza();
		System.out.println(p1.getClass() + ": " + p1.getTotal());
		Product p2 = new FamilyPizza();
		System.out.println(p2.getClass() + ": " + p2.getTotal());
		Product p3 = new HugePizza();
		System.out.println(p3.getClass() + ": " + p3.getTotal());
		Product p4 = new BulgarianCheese(new Olives(new PersonalPizza()));
		System.out.println(p4.getClass() + " With Bulgarian Cheese and Olives: " + p4.getTotal());
		Product p5 = new Mushrooms(new Tomatoes(new FamilyPizza()));
		System.out.println(p5.getClass() + " With Mushrooms and Tomatoes: " + p5.getTotal());
		Product p6 = new Tomatoes(new Olives(new HugePizza()));
		System.out.println(p6.getClass() + " With Tomatoes and Olives: " + p6.getTotal());
	}
}
