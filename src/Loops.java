
public class Loops {

	public static void main(String[] args) {
		
		//5a all even numbers 0-100
		System.out.println("5. A");
		
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		//spacer
		System.out.println("\n5. B");
		
		//5b Every 3rd number going backwards from 100 to 0
		int i = 100;
		while (i > 0) {
			System.out.println(i);
			i -= 3;
		}
		
		//spacer
		System.out.println("\n5. C");
		
		//5c every other number 1-100
		
		i = 1;
		do {
			System.out.println(i);
			i += 2;
		} while(i < 100);
		
		System.out.println("\n5. D");
		// 0 - 100, but if divisible by 3 print "Hello", if divisible by 5 print "World", if divisible by 3 & 5 print "Hello World"
		for (i = 0; i <= 100; i++) {
			if (i % 3 == 0 && i %5 == 0) {
				System.out.println("Hello World");
			} else if (i % 3 == 0){
				System.out.println("Hello");
			} else if (i % 5 == 0) {
				System.out.println("World");
			}else {
				System.out.println(i);
			}
		}
		
		
	}	

}
