package main;

import java.util.function.Function;

public class MyNat implements HasPlus<MyNat> {

	private int n;
	
	public MyNat(int n) {
		this.n = n;
	}

	@Override
	public MyNat Succ() {
		return new MyNat(n+1);
	}

	@Override
	public <T> T cases(T x, Function<MyNat, T> f) {
		if (n==0) {
			return x;
		}else {
			return f.apply(new MyNat(n-1));
		}
	}
	@Override
	public String toString() {
		return String.valueOf(n);
	}

}
