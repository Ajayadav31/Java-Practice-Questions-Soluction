package looping.statements;

public class Class7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ABCD
		 * ABC
		 * AB
		 * A
		 */
		
		char i,j;
		for(i=68;i<=68&&i>=65;i--)
		{
			for(j=65;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}
