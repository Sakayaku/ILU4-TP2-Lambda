package main;

import java.util.function.BiFunction;

public class list<E> implements HasLength<E, list<E>> {

	public static class Empty<E> extends list<E>{
		@Override
		public <T> T cases(T z, BiFunction<E, list<E>, T> f) {
			return z;
		}
	}
	public static class NotEmpty<E> extends list<E>{
		public E head;
		public list<E> tail; 
		@Override
		public <T> T cases(T z, BiFunction<E, list<E>, T> f) {
			return f.apply(head, tail);
		}
	}
	@Override
	public list<E> add(E x) {
		return this.add(x);
	}
	@Override
	public <T> T cases(T z, BiFunction<E, list<E>, T> f) {
		return null;
	}
	public static boolean empty() {
		return false;
	}
}
