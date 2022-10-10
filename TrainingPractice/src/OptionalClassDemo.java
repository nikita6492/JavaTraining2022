import java.util.Optional;

public class OptionalClassDemo {

	public static void main(String[] args) {
		String[] str =new String[10];
		str[5]="HELLO";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			System.out.println(str[5].toLowerCase());
		}else {
			System.out.println("String not present");
		}
	}

}
