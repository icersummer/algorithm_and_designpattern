package vjia.sorting;

public class StraightInsertionSort {

	static void straightInserSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			if (a[i] < a[i - 1]) {
				int j = i - 1;
				int x = a[i];
				a[i] = a[i - 1];
				while (x < a[j]) {
					a[j + 1] = a[j];
					j--;
					if(j==-1){
						System.out.println("j= -1 !, continue.");
						break;
					}
				}
				a[j + 1] = x;
			}
			print(a, n, i);
		}
	}

	private static void print(int[] a, int n, int i) {
		// TODO Auto-generated method stub
		System.out.print(i + ":");
		for (int j = 0; j < 8; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a = {3,1,5,7,2,4,9,6};
		straightInserSort(a, 8);
		print(a,8,8);
	}

}
