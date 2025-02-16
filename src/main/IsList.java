package main;

import java.util.function.BiFunction;

public interface IsList<E, L extends IsList<E, L>> {
	L add(E x); //ajout en tête
	<T> T cases(T z, BiFunction<E,L,T> f);
	default boolean isEmpty() {
		return cases(true, (e,l) -> false);
	}
	
}
