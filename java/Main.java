public class Main {

	public static void main(String[] nousan) {
		SLR slr = new SLR();

		double[] x = {23, 26, 30, 34, 43, 48, 42, 57, 58};
		double[] y = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518};

	        slr.regress(x,y);	
		slr.predict(42);
	
	}
}
