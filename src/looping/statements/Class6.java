package looping.statements;

public class Class6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * A
		 * AB
		 * ABC
		 * ABCD
		 */
		
	char i,j;
	for(i=65;i<=68;i++)
	{
		for(j=65;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println(" ");
	}
		
		
	}

}
