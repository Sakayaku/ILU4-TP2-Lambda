package main;

public interface HasLength<E, L extends HasLength<E, L>> extends IsList<E,L>{
	default int length() {
		return cases(0, (_,l) -> l.length()+1);
	}
}
