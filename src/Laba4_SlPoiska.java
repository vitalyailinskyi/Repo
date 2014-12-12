
public class Laba4_SlPoiska {
	
	static double[] toch = { 0.5, 0.1, 0.05, 0.01, 0.005, 0.001};
	
	static double x_k1 = 0, x_k = 10,y_k1 = 0, y_k = 10, a_k = 50, m0 = 0, R = 50;
	
	static int n = 6;
	
	public static double F(double x_k, double y_k){
		return Math.pow(n, 2)*Math.pow(x_k, 2)+(n/n+1)+15*(n+1)*Math.pow(y_k, 2)-2*n*y_k+4*n;
	}
	
	public static void main(String[] args)
	{
		
		for(int i = 0;i < 6; i++)
		while(a_k>toch[i])
		{
			System.out.println("X: " + x_k + " Y: " + y_k + " F: " + F(x_k,y_k));
			a_k = R;
			
				
				
				x_k1 = x_k + a_k * (Math.random() * 2 - 1);
				y_k1 = y_k + a_k * (Math.random() * 2 - 1);
				
				
				if(F(x_k1,y_k1)<F(x_k,y_k))
				{
					x_k = x_k1;
					y_k = y_k1;
					m0 = 0;
				}else{
					m0 += 1;
				}
				if( m0 >= 7)
				{
					R = R/2;
				}
			}
		}
	}

