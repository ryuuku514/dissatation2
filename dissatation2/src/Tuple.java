
 class Tuple {
	
	double a;
	double b;
	double tau;
	
	
	public Tuple(int i, int j){
		this.a = i;
		this.b = j;
	// tau formula 
	//tau(a,b) = tau(a,b)^-a + tau(a,b)^-b - 1 = 0
	//quadratic 
	// -b± math.squarroot(b^2 -4ac)/2a
		if ((a < 3 && b < 3) && (a != b)) {
			int A = 1;
			int B = -1;
			int C = -1;
			double root = (B^2) - 4*A*C;
		 	double posQuad = -B + Math.sqrt(root)/2*A;
			double minQaud1 = -B - Math.sqrt(root)/2*A;
			boolean check = minQaud1<posQuad;   
				if (check = true) {
					System.out.println("tuple{" + a + "," +  b + ") has tau : " + posQuad+ " " + root + " " + check);
					
				} else {
					System.out.println("tuple{" + a + "," +  b + ") has tau : " + minQaud1 + " " + check);
				}
			 
			
			
			
		//}else if (a < 4 && b < 4) {
			
	//newton-rapson
	// x_1 = x_0 - f(x_0)/f'(x_0)
	//f(x_0^-a + x_0^-b -1) = 0
	//f'(a*x_0^-a-1 - b*x_0^-b-1) = ?
			
		}else {
			double x_0 = 0;
			double x_1 = 1;
			int k = 0;
			do {
				x_0 = x_1;
				double Fx = Math.pow(x_0 , -a) + Math.pow(x_0,-b) -1;
				double Gx = -a * Math.pow(x_0 , -a-1) -b * Math.pow(x_0,-b-1);
				x_1 = x_0 - (Fx / Gx);
				
				k++;
				//System.out.println("tuple{" + a + " " + + b + ") " + k + " " + x_0 + " " + x_1);
			}while(Math.abs(x_0 - x_1) > 0.0001);
			
		}
		
	}
	
	public void printTuple() {
		System.out.println("tuple{" + a + b + ")" );
	}
	
	public double getTau() {
		
		return tau;
	}
	
	
	 

}
