package vjia.sorting;

public class ShellInsertSort {

	/**
	 * ֱ�Ӳ��������һ����ʽ
	 * 
	 * @param dk
	 *            ��С�����������ֱ�Ӳ�������dk=1
	 * 
	 */
	static void shellInsertSort(int[] a, int n, int dk) {
		for (int i = dk; i < n; ++i) {
			if (a[i] < a[i - dk]) {
				int j = i - dk;
				int x = a[i];
				a[i] = a[i - dk];
				while (x < a[j]) {
					a[j + dk] = a[j];
					j -= dk;
				}
				a[j + dk] = x;
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

	/**
	 * �Ȱ�����d��n/2,nΪҪ�������ĸ�������ϣ������
	 */
	static void shellSort(int[] a, int n) {
		int dk = n / 2;
		while (dk >= 1) {
			shellInsertSort(a, n, dk);
			dk = dk / 2;
		}
	}
	
	public static void main(String[] args) {
		int[] a= {3,1,5,7,2,4,9,6};
		shellSort(a,8);
		//ShellInsertSort(a,8,1); //ֱ�Ӳ�������  
		print(a,8,8);
	}
}
