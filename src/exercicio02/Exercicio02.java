package exercicio02;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAltura(20);
		triangulo1.setBase(10);
		System.out.println(triangulo1.area());
		
		Triangulo triangulo2 = new Triangulo();
		triangulo2.setAltura(5);
		triangulo2.setBase(2);
		System.out.println(triangulo2.area());
		
		Triangulo triangulo3 = new Triangulo();
		triangulo3.setAltura(45.5);
		triangulo3.setBase(11);
		System.out.println(triangulo3.area());
		
	}

}
