package looping.statements;

public class Class4 {
  
	public static void main(String[] args) {
	
	/*	4 
		43 
		432 
      	4321 
	 */
		
int i,j;
for(i=4;i>=1;i--)
{
	for(j=4;j>=i;j--)
	{
		System.out.print(j);
	}
	System.out.println(" ");
}
	
	}
}
