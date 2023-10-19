package exer1_5;

public class CalculadoraArea {
	public static double calcularAreaTotal (FormaGeometrica c1, FormaGeometrica r1, FormaGeometrica t1) {
		double soma=0;
		
		FormaGeometrica[] areas = new FormaGeometrica[3];
		
		areas[0]=c1;
		areas[1]=r1;
		areas[2]=t1;
		
		for (int i =0 ; i< areas.length;i++ ) {
			soma+= areas[i].calcularArea();
		}
		System.out.println("a soma é : ");
		return soma;
	}
	

}
