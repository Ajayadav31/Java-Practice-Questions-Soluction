package looping.statements;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  /*1 
	22 
	333 
	4444 */	
		
		
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
              System.out.print(i);
			}
			System.out.println();
		}

}
}