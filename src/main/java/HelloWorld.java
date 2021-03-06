

import org.joda.time.LocalTime;

public class HelloWorld {
	public static void main(String[] args) {
		ID id = new ID();
		Greeter greeter = new Greeter();
		Pusher pusher = new Pusher();
		System.out.println(greeter.sayHello());
		System.out.println(pusher.push());
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		System.out.println(greeter.sayBye());
		CalculateScreen calc = new CalculateScreen();
		calc.execute(args);
		CalculateSpring cs = new CalculateSpring();
		cs.calculateSpring(args);
	}
}