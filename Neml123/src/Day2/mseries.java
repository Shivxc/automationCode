package Day2;

public class mseries implements Basic {

	@Override
	public void in_call() {
		
		System.out.println("Incoming call of m-series");
	}

	@Override
	public void out_call() {
		System.out.println("outgoing call of m-series");

		
	}

	@Override
	public void in_sms() {
		System.out.println("Incoming sms of m-series");
		
	}

	@Override
	public void out_sms() {
		System.out.println("outgoing sms of m-series");
		
	}
	

}
