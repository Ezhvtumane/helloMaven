package src.main.java.hello;

import org.joda.time.LocalTime;
import org.springframework.core.SpringVersion;
import javax.swing.*;

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
	}
}