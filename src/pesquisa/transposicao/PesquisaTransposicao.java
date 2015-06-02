package pesquisa.transposicao;

public class PesquisaTransposicao {

	public int pesquisa(int k, int[] v) {
		for (int i = 0; i < v.length; i++) {
			if (v[i] == k) {
				for (int j = 0; j < v.length; j++)
					v[j] = v[j-1];
				v[0] = k;
				return 1;
			}
		}
		return 0;
	}
}
