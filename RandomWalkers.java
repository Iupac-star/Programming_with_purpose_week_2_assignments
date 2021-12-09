public class RandomWalkers
{
    
    public static void main(String[] args)
	
    {
		Integer manhattan = Integer.parseInt(args[0]);
		Integer trials = Integer.parseInt(args[1]);
		int x = 0;
		int y = 0;
		int cont = 0;
	for(int i = 0; i < trials; i++) 
	{

			do {
				double prob = Math.random();
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
				manhattan = (int)Math.abs(x)+(int)Math.abs(y);
				
			}while(Math.abs(x)+Math.abs(y) != (manhattan+1));
		}
		double avg = cont/trials;
		System.out.println(avg);
        
    }
}