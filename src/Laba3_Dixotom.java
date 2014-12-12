public class Laba3_Dixotom {

	public static void main(String[] args) {

		double[] toch = new double[] { 0.5, 0.1, 0.05, 0.01, 0.005, 0.001 };

		int n = 6;
		int function = 1;
// Comment with changes in fix
// Comment with changes in fix second time
// COMMENT IN BRANCH HOTFIX in the same file branch FIX
// Comment with changes in fix re steps 1-9
// Comment with changes after delete HOTFIX
		double a = -n;
		double b = n;
		double L = b - a;
		double x_c = (a + b) / 2;
		double f_xc = n * n * x_c * 2 + n * n * n * x_c / (n + 1) + 4 * n;

		for (int i = 0; i < 6; i++) {
			// function=1;
			System.out.println();
			while (L > toch[i]) {
				System.out.println("Toch " + toch[i] + " a " + a + " b " + b);

				double x1 = a + L / 4;
				double x2 = b - L / 4;
				double f_x1 = n * n * x1 * 2 + n * n * n * x1 / (n + 1) + 4 * n;
				double f_x2 = n * n * x2 * 2 + n * n * n * x2 / (n + 1) + 4 * n;
				function = function + 2;

				if (f_x1 < f_xc) {
					b = x_c;
					x_c = x1;
					f_xc = f_x1;
				} else if (f_x2 < f_xc) {
					a = x_c;
					x_c = x2;
					f_xc = f_x2;
				} else {
					a = x1;
					b = x2;
				}

				L = b - a;
				System.out.println("L " + L
						+ " Вычисления значений целевой функции " + function); // Comment with changes in file to commit
			}
		}

	}
}

