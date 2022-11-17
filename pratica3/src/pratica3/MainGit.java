package pratica3;

public class MainGit {

	public static void main(String[] args) {
		Integer []vetorx= new Integer[6];
		mult(vetorx);
	}
  static void mult(Integer vetorx[]) {
	for (int i = 0; i < vetorx.length; i++) {
		vetorx[i]= vetorx[i]*2;
	}
  }
}
