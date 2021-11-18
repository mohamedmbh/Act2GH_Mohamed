public class test {

	private static int[] array = new int[20];

	public static void main(String[] args) {

	}

	public static void insertarNumeros() {
		for (int i = 0; i < 20; i++) {
			int n = (int) Math.random() * (10 + 1);
			array[i] = n;
		}
	}

}