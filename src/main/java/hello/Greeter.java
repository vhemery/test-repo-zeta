package hello;

import com.google.common.base.Preconditions;

public class Greeter {
	public String sayHello(String user) {
		Preconditions.checkNotNull(user);
		return String.format("Hello %s!", user);
	}
}
