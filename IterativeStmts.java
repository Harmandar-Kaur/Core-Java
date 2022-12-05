public class IterativeStmts {
	public static void main(String[] args) {
		int j=1;
		//using for
		for(int i=0 ; i<=10 ; i++) {
			System.out.println(i);
		}
		System.out.println("========================");
		//using while
		while(j <= 10) {
			System.out.println(j);
			j++;
		}
		System.out.println("========================");
		//using do-while
		int k = 1;
		do {
			System.out.println(k);
			k++;
		}while(k <= 10);
	}

}
