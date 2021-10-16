package cone;
import java.util.Scanner;
public class Conne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double raio, altura;
		int nivel;
		System.out.print("Raio ");
		raio = sc.nextDouble();
		System.out.print("Altura ");
		altura = sc.nextDouble();
		System.out.print("Tipo da tinta ");
		nivel = sc.nextInt();
		Cone cn = new Cone(raio,altura,nivel);
		System.out.println(cn.toString());
		sc.close();
	}}
