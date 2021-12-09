public class BandMatrix {
		
	public static void main(String[] args) 
	{
		Integer n = Integer.parseInt(args[0]);
		Integer num1 = Integer.parseInt(args[1]);
		int num = Math.abs(n);
		int width = Math.abs(num1);
	
		for(int i = 0; i < num; i++) 
		{
			for(int j = 0; j < num; j++) 
			{
				if(i-j>width || j-i >width) 
				{
					System.out.print(0+" ");
				}else 
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}

}