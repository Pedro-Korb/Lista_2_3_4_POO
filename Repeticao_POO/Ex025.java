public class Ex025 {

	public static void main(String[] args) {
		// QUASE-DOIS  store
		
		for (int i = 1; i <= 50; i++)
		{
			if (i < 10)
			{
				System.out.println(i + "  - R$ " + (i * 1.99));
			}
			else if (i % 10 == 0)
			{
				System.out.println(i + " - R$ " + (i * 1.99) + "0");
			}
			else
			{
				System.out.println(i + " - R$ " + (i * 1.99));
			}
			
		}
		System.out.println(" ");

	}

}
