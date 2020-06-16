package helloworld;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class Test implements Callable{

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		Thread.sleep(6000);
		return "from Java class";
	}

}
