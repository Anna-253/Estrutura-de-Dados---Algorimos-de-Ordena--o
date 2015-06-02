package pesquisa.dummy;

public class PesquisaDummy {

	public int pesquisa(int k, int[] v) {
		v[v.length-1] = k;
		int i = 0;
		for (;i < v.length; i++) {
			if(v[i] == k)
				break;
		} if (i == v.length-1) {
			return 0;
		} else {
			return i+1;
		}
	}
}
