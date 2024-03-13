package level4;

public class loop1 {
public static void main(String[] args) {
/*pattern	
    $$$$$*****
	$$$$$*****
	*/
	for(int i=1;i<=2;i++) {
		for(int j=1;j<5;j++) {
			System.out.print("$");
		}
		
		for(int j=1;j<5;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	}
	
}

