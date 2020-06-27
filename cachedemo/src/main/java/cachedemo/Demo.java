package cachedemo;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class Demo implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		System.out.println("inside java class");
		Thread.sleep(20000);
		return "MEssage from java class";
	}

}
