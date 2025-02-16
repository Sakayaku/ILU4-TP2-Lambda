package main;

public interface HasAppend<E, L extends HasAppend<E, L>> extends IsList<E, L> {
	default HasAppend<E,L> append(HasAppend<E,L> li){
		return cases(li,(e,l) -> this.append(l.add(e)));
	}
}
