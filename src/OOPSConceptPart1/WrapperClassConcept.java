package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "100";
		
		System.out.println(x+20);
		// Data conversion String to int:
		int y = Integer.parseInt(x);
		System.out.println(y+20);
		// Integer, Double, Boolean
		// String to double conversion
		String a = "12.33";
		System.out.println(a+10);
		double d = Double.parseDouble(a);
		System.out.println(d+10);
		//String to boolean conversion
		String i = "true";
		System.out.println(i+" world");
		
		boolean b = Boolean.parseBoolean(i);
		System.out.println(b);
		
		// int to String conversion
		int m =200;
		System.out.println(m+20);
		String s = String.valueOf(m);
		System.out.println(s+20);
		
		String u = "100A";  //NumberFormatException -- For input String "100A"
		Integer.parseInt(u);
				
		
			

	}

}
