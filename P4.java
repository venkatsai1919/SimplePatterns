/*
        * 
      * * * 
    *   *   * 
  *     *     * 
* * * * * * * * * 
  *     *     * 
    *   *   * 
      * * * 
        *               
*/
public class P4 {
	public static void main(String[] args) {
				for(int i=1;i<=5;i++) {
					for(int j=1;j<=5;j++) {
						if(j==5-i+1||i==5||j==5)
						System.out.print("* ");
						else
							System.out.print("  ");
					}
					for(int j=1;j<i;j++) {
						if(j==i-1||i==5)
						System.out.print("* ");
						else
							System.out.print("  ");	
					}
					System.out.println();
					
				}
				for(int i=4;i>=1;i--) {
					for(int j=1;j<=5;j++) {
						if(j==5-i+1||i==5||j==5)
						System.out.print("* ");
						else
							System.out.print("  ");
					}
					for(int j=1;j<i;j++) {
						if(j==i-1||i==5)
						System.out.print("* ");
						else
							System.out.print("  ");	
					}
					System.out.println();
					
				}
	}
}
