package pkg2xb3;

public class sort {

	public static void sort(Comparable[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		Comparable[] l = new Comparable[mid];
		Comparable[] r = new Comparable[mid];
		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		sort(l, mid);
		sort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

	private static void merge(Comparable[] a, Comparable[] l, Comparable[] r, int lo, int hi) {
		int i = 0, j = 0, k = 0;
		while (i < lo && j < hi) {
			if (l[i].compareTo(r[j]) < 0)
				a[k++] = l[i++];
			else
				a[k++] = r[j++];
		}
		while (i < lo)
			a[k++] = l[i++];
		while (j < hi)
			a[k++] = r[j++];
	}

}
package pkg2xb3;

public class sort {

	public static void sort(Comparable[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		Comparable[] l = new Comparable[mid];
		Comparable[] r = new Comparable[mid];
		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		sort(l, mid);
		sort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

	private static void merge(Comparable[] a, Comparable[] l, Comparable[] r, int lo, int hi) {
		int i = 0, j = 0, k = 0;
		while (i < lo && j < hi) {
			if (l[i].compareTo(r[j]) < 0)
				a[k++] = l[i++];
			else
				a[k++] = r[j++];
		}
		while (i < lo)
			a[k++] = l[i++];
		while (j < hi)
			a[k++] = r[j++];
	}

}
