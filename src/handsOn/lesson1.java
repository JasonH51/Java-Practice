package handsOn;

public class lesson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isSunny = false;
		boolean atBeach = false;
		
		if(isSunny) {
			System.out.println("Wear sunglasses!");
			if(atBeach) {
				System.out.println("Wear sunblock!");
			} else {
				System.out.println("Don't need sunblock.");
			}
		}else {
			System.out.println("Don't wear sunglasses.");
			if(atBeach) {
				System.out.println("Come back tomorrow.");
			} else {
				System.out.println("Don't go to the beach.");
			}
		}
		
	}

}
