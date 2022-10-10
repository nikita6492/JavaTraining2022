
public class DisplayTest {

	public static void main(String[] args) {
	Display di = new Display() {

		@Override
		public void print() {
			System.out.println("printt");
			
		}
		
	};
	di.print();
	}
	
}
