
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
		if (a < 3 && b < 3) {
			
			
		//}else if (a < 4 && b < 4) {
			
	//newton-rapson
	// x_1 = x_0 - f(x_0)/f'(x_0)
	//f(x_0^-a - x_0^-b -1) = 0
	//f'(a*x_0^-a-1 - b*x_0^-b-1) = ?
			
		}else {
			double x_0 = 0;
			double x_1 = 0;
			do {
				double Fx = Math.pow(x_0 , -a) - Math.pow(x_0,-b) -1;
				double Gx = -a * Math.pow(x_0 , -a-1) -b * Math.pow(x_0,-b-1);
				
			}while(x_0 - x_1 > 0.0001);
			
		}
		
	}
	
	public void printTuple() {
		System.out.println("tuple{" + a + b + ")" );
	}
	
	public double getTau() {
		
		return tau;
	}
	
	public void setTau( float root) {
		
		
		
	}
	 

}
