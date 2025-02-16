package main;

import java.util.function.Function;

@FunctionalInterface
public interface Integrable extends Function<Double,Double>{
	
	// intègre une portion de la fonction Integrable (désignée par 'double apply(double x)')
	// sur un intervalle ([a; b]) en utilisant la méthode des trapèzes
	default double integr(double a, double b) {
		return (b-a)*((this.apply(a)+this.apply(b))/2);
	}
	
	// applique l'intégration de manière itérative n fois sur l'intervalle [a; b]
	default double integr(double a, double b, int n) {
		double somme = 0;
		double pas=(b-a)/n;
		double debut=a;
		double fin=a+pas;
		for (int i=0;i<n;i++) {
			somme+=integr(debut,fin);
			debut=fin;
			fin+=pas;
		}
		return somme;
	}
	
}
