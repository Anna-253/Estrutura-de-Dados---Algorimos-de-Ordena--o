package pesquisa.binaria.normal;

public class PesquisaBinariaNormal {

	public int pesquisa(int[] v, int k) {
		int inicio = 0;
		int fim = v.length-1;
		
		while(inicio <= fim) {
			int meio = (inicio+fim)/2;
			
			if (v[meio] == k) {
				return meio;
			}
			if (k > v[meio]) {
				inicio = meio+1;
			} else {
				fim = meio-1;
			}
		}
		return -1;
	}
}
