
public class Calci {
	

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int add = a + b;
        int sub = a - b;

        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        
        
    }
    public boolean isPositive(int number) {
	    if (number > 0) {
	        return true;
	    } else if (number < 0) {
	        return false;
	    } else if (number > 0) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
