
public class TRPR_laba5 {

	
	
	static double[] toch = { 0.5, 0.1, 0.05, 0.01, 0.005, 0.001};
	
	static int n = 5;
	
	static double	delta1 = 0, delta2 = 0,
			
					rebro = 2, 
					
					x_c12 = 2, x_m = 0;
					
					//x1[0] = 0, x1[1] = 0,

					//x2[0] = 0, x2[1] = 0,

					//x31 = 0, x32 = 0;

	static double[] x_start = { 0, 0 };

	static double[] x_cent = { 0, 0 };
	
	static double[] x1 = { 0, 0 };
	
	static double[] x2 = { 0, 0 };
	
	static double[] x3 = { 0, 0 };
	
	public static double F(double x1, double x2){
		
		return Math.pow((x1 * x1 + x2 - 11 * (n / n + 5)), 2) + Math.pow((x1 + x2 * x2 - 7 * (n / n + 5)), 2);
	}
	
	
	
	public static void main(String[] args)
	{
		
		for(int m = 0; m < 6; m++ ){
			
			while(toch[m] < rebro){
				
			// Для двумерного пространства	
				
			delta1 = ((Math.pow( 2 + 1 , 0.5) + 2 - 1)/ 2 * Math.pow( 2, 0.5))*rebro;
			
			delta2 = ((Math.pow( 2 + 1 , 0.5) - 1)/ 2 * Math.pow( 2, 0.5))*rebro;
					
			x1[0] = x_start[0] + delta2;
			x1[1] = x_start[1] + delta1;
			x2[0] = x_start[0] + delta1;
			x2[1] = x_start[1] + delta2;
			
			double F0 = F(x_start[0], x_start[1]);
			double F1 = F(x1[0], x1[1]);
			double F2 = F(x2[0], x2[1]);
			
			System.out.println(
			  "x1:[ "+x1[0]+"; " +x1[1]+"]\n"
			+ "x2:[ "+x2[0]+"; " +x2[1]+"]"
			+ "\nF0 " + F0
			+ " F1 " + F1
			+ " F2 " + F2 + "\n");
			
			if(F0 >= F1 && F0 >= F2){
				
				x_cent[0] = 0.5 * (x1[0] + x2[0]);		x_cent[1] = 0.5 * (x1[1] + x2[1]);
			
				x3[0] = 2 * x_cent[0] - x_start[0];		x3[1] = 2 * x_cent[1] - x_start[1];
				
				System.out.println("0" + "x_cent:[ "+x_cent[0]+"; " +x_cent[1]+"]\n");
				
				x_start[0] = x3[0];		x_start[1] = x3[1];
			
			}else if(F1 >= F0 && F1 >= F2){
				
				x1[0] = 0.5 * (x_cent[0] + x2[0]);		x1[1] = 0.5 * (x_cent[1] + x2[1]);
				
				x3[0] = 2 * x1[0] - x_start[0];		x3[1] = 2 * x1[1] - x_start[1];
				
				System.out.println("1" + "x_cent:[ "+x_cent[0]+"; " +x_cent[1]+"]\n");
				
				x_start[0] = x3[0];		x_start[1] = x3[1];

				
			}else if(F2 >= F0 && F2 >= F1){
				
				x2[0] = 0.5 * (x1[0] + x_cent[0]);		x2[1] = 0.5 * (x1[1] + x_cent[1]);
				
				x3[0] = 2 * x2[0] - x_start[0];		x3[1] = 2 * x2[1] - x_start[1];
				
				System.out.println("2" + "x_cent:[ "+x_cent[0]+"; " +x_cent[1]+"]\n");
				
				x_start[0] = x3[0];		x_start[1] = x3[1];

			}
			
			System.out.println("x3:[ "+x3[0]+"; " +x3[1]+"]\n");
			
			rebro = rebro / 2;
			
			
//		for(int i = 1; i < 2; i++){
//			for(int j = 1; j < 2; j++){
//				
//				
//				if(i == j){
//					
//					x_i = x_start[0] + delta2;
//					
//					x_c12 = 1/2 * ( x_start[0] + x_start[1] ); 
//					
//					
//				}else{
//					
//					x_i = x_start[0] + delta1;
//							
//					}
//				
//				//x3 = x_i + 2 * (x_m - x_i);
//			}
//		}
		

			//for tochnost'
			}
		//while
		}
	//main
	}
//class
}
