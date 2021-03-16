package lambdas;

interface Drawable{
	public void draw();
}

public class LambdaExpressionsExample {

	public static void main(String[] args) {
		int width = 110;
		
		/*
		 * Drawable d = new Drawable() {
		 * 
		 * @Override 
		 * public void draw() { 
		 * System.out.println("Drawing "+ width);
		 * 
		 * } 
		 * };
		 * d.draw();
		 */
		
		Drawable d2 = () -> {
			System.out.println("Drawing: "+ width);
		};
		
		d2.draw();
		

	}

}
