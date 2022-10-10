import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> mylist = new ArrayList<Integer>();
		for(int i =0; i<50; i++) {
			mylist.add(i);
		}

		Stream<Integer> seqStream = mylist.stream();
		
		Stream<Integer> parStream = mylist.parallelStream();
		
		Stream<Integer> highNums = parStream.filter(p -> p>40);
		highNums.forEach(p->System.out.println("parallelstream ::"+p));
		
		Stream<Integer> highNums2 = seqStream.filter(p ->p>40);
		highNums2.forEach(p->System.out.println("seqstream ::"+p));
	}

}
