package ut1IntroProg;

public class Ejercicio40TiposConver {

	public static void main(String[] args) {
		//tipos basicos
		byte byEdad = 30;
		double dAltura = 1.5;
		char cInicial = 'A';
		float fNum = 3;
		boolean bEstudiante = true;
		int iNum = 3; //ocupa 32
		System.out.println("Edad: "+byEdad);
		System.out.println("Altura: "+dAltura);
		System.out.println("Inicial: "+cInicial);
		System.out.println("Estudiante: "+bEstudiante);
		System.out.println("iNum: "+iNum);
		
		double dNum = iNum;
		System.out.println("dNum: "+dNum);
	}

}
