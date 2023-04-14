package java1;

public class scoring {
	public int scr(String ar1[], String ar2[], String nm) {
		int w, n, c;
		w = n = c = 0;
		while(w<ar1.length) {
			if(nm == ar1[w]) {
				n = w;
				c++;
			}
			w++;
		}
		if(c == 0) {
			n = ar1.length;
		}
		return n;
	}
}
