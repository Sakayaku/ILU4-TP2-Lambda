package main;

import java.util.function.BiFunction;

public abstract class list<E> implements HasLength<E, list<E>>,HasAppend<E, list<E>> {

	public static class Empty<E> extends list<E>{
		@Override
		public <T> T cases(T z, BiFunction<E, list<E>, T> f) {
			return z;
		}
	}
	public static class NotEmpty<E> extends list<E>{
		public E head;
		public list<E> tail;
		
		public NotEmpty(E head, list<E> tail) {
			this.head = head;
			this.tail = tail;
		}

		@Override
		public <T> T cases(T z, BiFunction<E, list<E>, T> f) {
			return f.apply(head, tail);
		}
	}
	@Override
	public list<E> add(E x) {
		return new NotEmpty<>(x,this);
	}
	@Override
	public abstract <T> T cases(T z, BiFunction<E, list<E>, T> f);
	public static <T> list<T> empty() {
		return new Empty<T>();
	}
}
