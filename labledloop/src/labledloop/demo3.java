package labledloop;

public class demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		harsha:do
		{ 
			i++;
			int j=1;
			abcd:do
			{
				System.out.println(" *");
				j++;
				break harsha;
				
			}while(j<=5);
			
		}while(i<=5);

	}

}
