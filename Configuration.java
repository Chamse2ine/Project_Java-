package projet.java.fr;

public class Configuration {
	public double alpha = 0.85;
	public double epsilon = -1.0;
	public int indice = 150;
	public Mode mode = Mode.CREUSE;

	@Override public String toString() {
		return "alpha=" + alpha + ", epsilon=" + epsilon
			+ ", indice=" + indice + ", mode=" + mode;
	}
	public boolean equals(Configuration C1) {
		return this.alpha== C1.alpha && this.epsilon==C1.epsilon && this.indice ==C1.indice && this.mode ==C1.mode;
	}
	
	public static void main(String[] args) {
		Configuration c1 = new Configuration();
	}


}
