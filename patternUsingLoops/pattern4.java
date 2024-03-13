package level4;

public class loop2 {
public static void main(String[] args) {
	/*pattern	
#####*****
#####*****
#####*****
#####*****
#####*****
	*/
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			System.out.print("#");
		}
		
		for(int j=1;j<=5;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	}
	
}



