package utilities;

public class Timeout {

public void timeout(int value) {
		
		try {
			Thread.sleep(value);
		}  catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
