
public class Converter {

	private String digitOne(int digits) {
		
		String message = ""; 
		
		if (digits == 0) message += "Zero";

		switch (digits) {

		case 1: 
			message = "One";
			break;
		case 2:
			message = "Two";
			break;
		case 3: 
			message = "Three";
			break;
		case 4: 
			message = "Four";
			break;
		case 5: 
			message = "Five";
			break;
		case 6: 
			message = "Six";
			break;
		case 7: 
			message = "Seven";
			break;
		case 8: 
			message = "Eight";
			break;
		case 9: 
			message = "Nine";
			break;
		case 10:
			message = "Ten";
			break;
		case 11:
			message = "Eleven";
			break;
		case 12:
			message = "Twelve";
			break;
		case 13:
			message = "Thirteen";
			break;
		case 14:
			message = "Fourteen";
			break;
		case 15:
			message = "Fifteen";
			break;
		case 16:
			message = "Sixteen";
			break;
		case 17:
			message = "Seventeen";
			break;
		case 18:
			message = "Eighteen";
			break;
		case 19:
			message = "Ninteen";
			break;

		}
		
		return message;

	}
	
	private String digitTWo(int digits) {
		
		String message = ""; 
		
		switch (digits) {
		
		case 20:
			message = "Twenty";
			break;
		case 30:
			message = "Thirty";
			break;
		case 40:
			message = "Fourty";
			break;
		case 50:
			message = "Fifty";
			break;
		case 60:
			message = "Sixty";
			break;
		case 70:
			message = "Seventy";
			break;
		case 80:
			message = "Eighty";
			break;
		case 90:
			message = "Ninty";
			break;
			
		}
		
		return message;		
		
	}

	public String DigitsToWords(int digits) {		

		String message = ""; 
		
		if (digits >= 1000 && digits < 10000) {
			message += digitOne(digits/1000) + " Thousand ";
			digits = digits % 1000;
		}
		if (digits >= 100) {
			message += digitOne(digits/100) + " Hundred And ";
			digits = digits % 100;
		}
		if(digits >= 20) {
			message += digitTWo(digits/10) + " ";
			digits = digits % 10;
		}
		if (digits < 20) {
			message += digitOne(digits);
		}
	

		return message; 

	}

	public static void main(String[] args) {

		Converter c = new Converter();
		String outputMessage = c.DigitsToWords(112);

		System.out.println(outputMessage);
	}		

}
