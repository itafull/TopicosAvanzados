package Calculadora;

public class Calculadora {
 private int ans;
	public int Sumar(int a, int b) {
		 ans = a + b;
		return ans;
	}
	public int Restar(int a, int b) {
		// TODO Auto-generated method stub
		ans= a -b;
		return ans;
	}
	public int Multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		ans = a * b;
		return ans;
	}
	public double Dividir(double a, double b) {
		// TODO Auto-generated method stub
	  
		double ans = a / b;
		 
		return ans;
	}
	public String DividirCero(int a, int b) {
		// TODO Auto-generated method stub
		if (b == 0) {
			String ans = String.valueOf(b);
			ans ="Math ERROR";
		
		return ans;
	} else if (a == 0) {
		String ans = String.valueOf(a);
		ans ="0";
		return ans;
	} else {
		String ans = String.valueOf(b);
		ans ="Math ERROR";
		return ans;
	}
	
}
	public int Clear(int a) {
		// TODO Auto-generated method stub
		ans = 0;
		return ans;
	}
	public String RestarMinimo() {
		// TODO Auto-generated method stub
		ans = Integer.MIN_VALUE;
		ans = ans + 1 ;
		String anss = String.valueOf(ans);
		anss= "Overflow";
		return anss;
	}
	public String SumarMaximo() {
		// TODO Auto-generated method stub
		ans = Integer.MAX_VALUE;
		ans = ans + 1 ;
		String anss = String.valueOf(ans);
		anss= "Overflow";
		return anss;
}
}



