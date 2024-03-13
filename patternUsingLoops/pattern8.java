package level4;

public class loop6 {
	/*pattern	
*
 **
  ***
   ****
    *****
    *****
   ****
  ***
 **
*
	*/
	public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int k=1;k<=i;k++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}			
		System.out.println();
		}
		
	for(int i=5;i>=0;i--) {
		for(int k=1;k<=i;k++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	}
}
