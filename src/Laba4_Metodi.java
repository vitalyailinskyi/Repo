
public class Laba4_Metodi {
	// Changes in branch hotfix
		static double[] toch = { 0.5, 0.1, 0.05, 0.01, 0.005, 0.001};
		static double n = 6.0;
		static double x_step = 51.0;
		static double y_step = 51.0;
		static double z_step = 51.0;
		static double radius = 0.0;
		static double start_x = -100.0*n,start_y = -100.0*n,start_z = -100.0*n;
		static double end_x = 100.0*n,end_y = 100.0*n,end_z = 100.0*n;
		static double x = 0.0, y = 0.0, z = 0.0;
		static double Min = 0.0, Min2 = 0.0;
				
		public static double F2x(double x, double y){
			return Math.pow(n, 2)*Math.pow(x, 2)*x+(n/n+1)+15*(n+1)*Math.pow(y, 2)-2*n*y+4*n;
		}
		//double F2x = Math.pow(n, 2)*Math.pow(x, 2)+(n/n+1)+15*(n+1)*Math.pow(y, 2)-2*n*y+4*n;
		
		public static double F3x(double x, double y, double z){
			return  Math.pow(n, 2)*Math.pow(x, 2)+(n/n+1)*x+15*(n+1)*Math.pow(y, 2)-2*n*y+n*Math.pow(z, 2)+3*n*z+4*n;
		}
		
				
	public static void main(String[] args){
		double min_i,min_j,min_k;
		int e = 1;
		int iterations_2D = 0;
		int iterations_3D = 0;
		System.out.println("Точность:   " +toch[e]+ ";");
		
		
			
			while(x_step > toch[e]){
								
				Min=F2x(start_x,start_y);
				min_i = start_x;
				min_j = start_y;
				
														
				for(double i = min_i/*+x_step*/; i < end_x; i += x_step){
						for(double j = min_j/*+y_step*/; j < end_y; j += y_step){
							
							Min2 = F2x(i,j);
							if(Min>Min2){
								Min=Min2;
								min_i = i;
								min_j = j;
								}
							}
					}
				iterations_2D++;		
				System.out.println("\nКоличество итераций = " + iterations_2D);
				System.out.println("Минимальное значение = "+Min);
								
				start_x = min_i - x_step;
				end_x   = min_i + x_step;
				start_y = min_j - y_step;
				end_y   = min_j + y_step;
				
				x_step/=2;
				y_step/=2;
				System.out.println("Координаты: [" +min_i+ "; " +min_j+ "]; ");
				System.out.println("Интервал:   [" +start_x+ "; "+end_x+"] "+"\nШаг Х = " +x_step + "; Шаг Y = " +y_step+";");
				if(x_step/2 <= toch[e]){break;}
				
				
				}
		 
			x_step = 51;
			y_step = 51;
			z_step = 51;
			
			
			while(x_step > toch[e]){
				
				Min=F3x(start_x,start_y,start_z);
				min_i = start_x;
				min_j = start_y;
				min_k = start_z;
				
														
				for(double i = min_i; i < end_x; i += x_step){
						for(double j = min_j; j < end_y; j += y_step){
							for(double k = min_k; k < end_z; k += z_step){
							Min2 = F3x(i,j,k);
							if(Min>Min2){
								Min=Min2;
								min_i = i;
								min_j = j;
								min_k = k;
								}
							}
					}
				iterations_3D++;		
				System.out.println("\nКоличество итераций = " + iterations_3D);
				System.out.println("Минимальное значение = "+Min);
								
				start_x = min_i - x_step;
				end_x   = min_i + x_step;
				start_y = min_j - y_step;
				end_y   = min_j + y_step;
				start_z = min_k - z_step;
				end_z   = min_k + z_step;
				
				x_step/=2;
				y_step/=2;
				z_step/=2;
				System.out.println("Координаты:   [" +min_i+ "; " +min_j+ "; " +min_k+ "]; ");
				System.out.println("Интервал_X:   [" +start_x+ "; "+end_x+"] " + "Шаг Х = " +x_step + ";");
				System.out.println("Интервал_Y:   [" +start_y+ "; "+end_y+"] " + "Шаг Y = " + y_step + ";");
				System.out.println("Интервал_Z:   [" +start_z+ "; "+end_z+"] " + "Шаг Z = " + z_step + ";");

				if(x_step/2 <= toch[e]){break;}
				
				
				}
	
		}
	}
}
