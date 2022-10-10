import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class JavaForEach {

	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<Integer>();
		for(int i =0; i<5; i++) {
			mylist.add(i);
		}

		//Previous to java 8
		Iterator<Integer> it = mylist.iterator();
		while(it.hasNext()) {
			Integer i =it.next();
			System.out.println("Iterator::"+i);
		}
		
		//ForEach
		
		mylist.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println("ForEach::"+t);
			}
		});
		
		MyConsumer action =new MyConsumer();
		mylist.forEach(action);
		
		
	}

}
class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("ConsumerImpl::"+t);
	}
	
}