public class Factorial {
	public int Fact(int n) {
		// TODO Auto-generated method stub
		if (n == 0 || n == 1) {
            return 1;
        }
        return n * Fact(n - 1);
	}
}
