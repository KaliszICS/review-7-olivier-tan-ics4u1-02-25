public class PracticeProblem {

	public static void main(String args[]) {

	}

	//Write your functions here
	//q1
	public static String _evenOrOdd_(int num){
		if (num%2==0){
			return ("Even");		}
		else{
			return ("Odd");			}
	}

	//q2
	public static String _teacherOrStudent_ (String words){
		if (words == "Kalisz"){
			return ("Teacher");		}
		else{
			return ("Student");		}
	}

	//q3
	public static int _fartherFromZero_(int num){
		if (num>0){
			return (num+5);	}
		if (num<0){
			return(num-5);	}
		else{
			return(num);	}
		}
		
	//q4
	public static String isFive(int num){
		if (num == 5){
			return ("The number is five");	}
		else{
			return ("The number is not five");	}
		}

	//q5
	public static String postiveOrNegative(double num){
		if (num>0){
			return ("Positive");	}
		else{
			return ("Negative");		}
		}

	//q6
	public static String highOrLow(int num){
		if (num>100){
			return ("High");	}
		else{
			return ("Low");		}
		}

	//q7
	public static String isHello(String words){
		if (words == "Hello"){
			return ("The word is Hello");	}
		else{
			return ("The word is not Hello");}
		}	
}
	



