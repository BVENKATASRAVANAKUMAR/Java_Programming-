package level4;

public class loop10 {
/*	01 
	02 03 
	04 05 06 
	07 08 09 10 
	11 12 13 14 15 
	15 14 13 12 11 
	10 09 08 07 
	06 05 04 
	03 02 
	01 
*/
	    public static void main(String[] args) {
	        int n=5;
	        int temp=1;
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(temp<10)
	                System.out.print("0"+temp+" ");
	                else if(temp>=10)
	                System.out.print(temp+" ");
	                temp++;
	            }
	            System.out.println();
	        }
	        temp--;
	        for(int i=n;i>=0;i--){
	            for(int j=1;j<=i;j++){
	                if(temp<10)
	                System.out.print("0"+temp+" ");
	                else if(temp>=10)
	                System.out.print(temp+" ");
	                temp--;
	            }
	            System.out.println();
	        }
	    }
	    
}
