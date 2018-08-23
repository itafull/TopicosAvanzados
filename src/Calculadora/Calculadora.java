package Calculadora;

public class Calculadora {
	private int ans;
		
	
  public Calculadora() {
	   ans = 0;
  }
  public  int Sumar(int a, int b) {
	    ans = a+b;
	  return ans;
  }
  public  int Restar(int a, int b) {
	  ans=a-b;
	  return ans;
}
  public  int Multiplicar(int a, int b) {
	  ans=a*b;
	  return ans;
}
  public  double Dividir(double a, double b) {
	  double ans=a/b;
	  return ans;
}
}
