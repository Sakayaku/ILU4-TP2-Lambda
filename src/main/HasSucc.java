package main;

import java.util.function.Function;

public interface HasSucc<N extends HasSucc<N>> {
	N Succ(); // renvoie le successeur de l’objet courant
	<T> T cases(T x, Function<N,T> f); // renvoie x si this n’est pas un successeur, f(p) si this est le successeur de p
	default boolean isSucc(){
		return cases(false, x -> true);
	}
	default HasSucc<N> pred(){
		return cases(this, x -> x);
	}
}
