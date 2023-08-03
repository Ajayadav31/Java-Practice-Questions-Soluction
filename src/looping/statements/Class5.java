package looping.statements;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		   4321 
		   432 
		   43 
           4 
		 */
		
		
		int i,j;
		for(i=1;i>=1&&i<=4;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

}
