
public class CNumberDecorator implements IDecorator{

	

	@Override
	public String decorate(String str) {
		
		StringBuffer cardNumber = new StringBuffer();
		for(int i=0;i<str.length();i++) {
			if(i==4 || i==8 || i==12)
				cardNumber.append(" " + str.charAt(i));
			else
				cardNumber.append(str.charAt(i));
		}
		return cardNumber.toString();
	}

	

}
