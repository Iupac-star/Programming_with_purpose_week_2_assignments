public class RandomWalker 
{
		
	public static void main(String[] args) 
	{
		Integer manhattan = Integer.parseInt(args[0]);
		int x = 0;
		int y = 0;
		int cont = 0;
		
		do {
			double prob = Math.random();
			System.out.println("("+x+","+" "+y+")");
			if(prob <= 0.25) 
			{
				x++;
			}
			else if(prob <=0.50) 
			{
				y++;
			}
			else if(prob <= 0.75) 
			{
				x--;
			}
			else if(prob <=1.0) 
			{
				y--;
			}
			cont++;
			
			
		}while(Math.abs(x)+Math.abs(y) != (manhattan+1));
		
			
		System.out.println("steps ="+" "+cont);
	}

}
