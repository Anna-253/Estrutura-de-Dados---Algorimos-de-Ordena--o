package pesquisa.sentinela;

public class PesquisaSentinela {

	public int pesquisa(int k, int[] v) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] == k)
				return i+1;
		}
		return 0;
	}
}
