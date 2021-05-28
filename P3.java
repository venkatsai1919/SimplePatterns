/*

A 
A B 
A B C 
A B C D 
A B C D E

*/
public class P3 {
	public static void main(String[] args) {
		//3
				for(int i=1;i<=5;i++) {
					for(int j=1;j<=i;j++) {
						char c=(char)(64+j);
						System.out.print(c+" ");
					}
					System.out.println();
				}
	}
}
