
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
			double root = Math.pow(B, 2) - 4*A*C;
		 	double posQuad = (-B + Math.sqrt(root))/(2*A);
			double minQaud1 = (-B - Math.sqrt(root))/2*A;
			   
				if (minQaud1 < posQuad) {
					//System.out.println("tuple{" + a + "," +  b + ") has tau : " + posQuad+ " " + root);
					
				} else {
					//System.out.println("tuple{" + a + "," +  b + ") has tau : " + minQaud1 + " " + root);
				}
			 
			this.tau = posQuad; 
			
			
		}else if (a == b) {
			tau = 1000000;
			
			
			
			
			
			

		}else {
			/*newton-rapson
			x_1 = x_0 - f(x_0)/f'(x_0)
			f(x_0^-a + x_0^-b -1) = 0
			f'(a*x_0^-a-1 - b*x_0^-b-1) = ?
			Start point.
			|tau(a,b)|^( 1 / ( sum(tau(a,b)) / |tau(a,b)| ) )
			*/		
			
			double initPower = 1 / ((a + b) / 2) ;  
			double initValue = Math.pow(2, initPower);
			
			double x_0 = 0;
			double x_1 = initValue;
			int k = 0;
			do {
				x_0 = x_1;
				double Fx = Math.pow(x_0 , -a) + Math.pow(x_0,-b) -1;
				double Gx = (-a * Math.pow(x_0 , -a-1)) - (b * Math.pow(x_0,-b-1));
				x_1 = x_0 - (Fx / Gx);
				
				k++;
				//System.out.println("tuple{" + a + " " + + b + ")  has tau : " + x_1 + " " + k + " " + initValue);
			}while(Math.abs(x_0 - x_1) > 0.0001);
			//System.out.println("tuple{" + a + " " + + b + ")  has tau : " + x_1 + " " + k);
			this.tau = x_1;
			//System.out.println(getTau());
		}
		
	}
	
	public void printTuple() {
		System.out.println("tuple{" + a + b + ")" );
	}
	
	public double getTau() {
		
		return this.tau;
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	} 

}
