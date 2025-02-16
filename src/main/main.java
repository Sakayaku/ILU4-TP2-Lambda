package main;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class main {

	public static void main(String[] args) {
		Integrable carre= x -> x*x;
		System.out.println(carre.integr(0, 10, 20));
		Integrable sin =Math::sin;
		System.out.println(sin.integr(0, Math.PI, 20));

		Map<String, Integer> envMap = new HashMap<>();
		envMap.put("x", 2);
		envMap.put("y", 5);
		Function<String, Integer> env= x -> envMap.get(x);
		Expr<String> x = Expr.Var("x");
		Expr<String> y = Expr.Var("y");
		Expr<String> xfoixplusy = x.mul(x).add(y);
		System.out.println(xfoixplusy.eval(env));
		
		MyNat n1 = new MyNat(2);
		MyNat n2 = new MyNat(3);
		System.out.println("Somme "+n1.add(n2)); // affiche 5
		
			list<String> l = null;
			l.empty();
			l = l.add("a").add("b").add("c");
			System.out.println("longueur:"+l.length());


	}

}
