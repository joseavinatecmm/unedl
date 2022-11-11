
public class SLR {

	private double beta0;
	private double beta1;

	public SLR() {}

       double sumX(double[] x) {
		double total = 0;

		for(int i=0; i < x.length; i++) 
			total = total + x[i];
		return total;
	
       }

       double sumXSquared(double[] x) {
		double total = 0;

		for(int i=0; i < x.length; i++) 
			total = total + (x[i] * x[i]);
		return total;
	
       }



       double sumY(double[] y) {
		double total = 0;

		for(int i=0; i < y.length; i++) 
			total = total + y[i];
		return total;
       }

       double sumXY(double[] x,  double[] y) {
		double total = 0;

		for(int i=0; i < x.length; i++) 
			total = total + (x[i] * y[i]);
		return total;
	} 
       
         double sumXXSquared(double[] x) {
		double total = 0;
		double gtotal = 0;

		for(int i=0; i < x.length; i++) 
			total = total + x[i];
 
		gtotal = total * total;
		        
		return gtotal;
       }

      void getB1(double[] x, double[] y) {
	   double num =0;
	   double den =0;
	   double total =0;

	   num = (9 * sumXY(x,y)) - (sumX(x) * sumY(y));
           den = (9 * sumXSquared(x)) - sumXXSquared(x);

           beta1 = num / den;
      }

      void getB0(double[] x, double[] y) {

	      double num =  sumY(y) * sumXSquared(x) - sumX(x) * sumXY(x,y);
	      double den = 9 * sumXSquared(x) - sumXXSquared(x);
	      
	      beta0 = num /den; 
      }

      void regress(double[] x,double[] y) {
	      getB0(x,y);	
	      getB1(x,y);	
      }

      void predict(double x) {
	      double prediction= 0.0;

	      prediction = beta0 + (beta1 * x);

	      System.out.println("Prediction: " + prediction );
      } 



}

