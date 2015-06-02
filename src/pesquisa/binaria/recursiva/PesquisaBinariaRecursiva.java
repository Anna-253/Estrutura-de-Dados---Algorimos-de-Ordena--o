package pesquisa.binaria.recursiva;

public class PesquisaBinariaRecursiva {

	public int pesquisa(int k, int[] v, int i, int f) {
		if (f < i) {
			return 0;
		}
		int meio = (i+f)/2;
		if (v[meio] == k) {
			return meio+1;
		}
		if (v[meio] > k) {
			return pesquisa(k, v, i, meio);
		} else {
			return pesquisa(k, v, meio+1, f);
		}
	}
}