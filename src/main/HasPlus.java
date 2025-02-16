package main;

public interface HasPlus<N extends HasPlus<N>> extends HasSucc<N> {
	default HasPlus<N> add(N m) {
		return cases(m,p -> p.add(m).Succ());
	}
}
