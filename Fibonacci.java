import java.util.ArrayList;

public class Fibonacci{
	
	ArrayList<Integer> fibo = new ArrayList<Integer>();
	
	public void makeSequence(int x) {
		/*
		 * Puts the Fibonacci sequence into an ArrayList, begins by adding the 
		 * first two elements then continues by adding the sum of the two most 
		 * recent elements as the next element.
		 */
		fibo.add(1);
		fibo.add(2);
		int i =1;
		do{
			int last = fibo.get(i-1);
			int now = fibo.get(i);
			int next = last + now;
			fibo.add(next);
			i++;
		} while (fibo.get(i)<x);
		/*
		 * I tried various approaches but could not find a way to make the 
		 * control structure stop before exceeding the given boundary, x.
		 * So I added the following if statement to remove the last element if 
		 * it exceeds the boundary.
		 */
		if(fibo.get(i)>x) {
			fibo.remove(i);
		}
	}
	
	
	public void addOdds() {
		/*
		 * Loops through the ArrayList, if value is even it continues, if 
		 * value is odd, the variable sum is increased by value
		 */
		int sum = 0;
		for(int i=0;i<fibo.size();i++) {
			System.out.print(fibo.get(i) + " ");
			int value = fibo.get(i);
			if (value%2==0) {
				continue;
			}
			else {
				sum += value;
			}
		}
		System.out.println();
		System.out.println("The sum of the odd values in the sequence is: " + sum);
	}
	
	public static void main(String[] args) {
		Fibonacci myFibo = new Fibonacci();
		myFibo.makeSequence(1000);
		myFibo.addOdds();
	}
	
	
}