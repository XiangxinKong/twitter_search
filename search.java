package pkg2xb3;

public class search {

	private int searchIndex(Comparable[] a, int lo, int hi, Comparable x) {

		if (hi >= lo) {
			int mid = lo + (hi - lo) / 2;

			if (a[mid].equals(x))
				return mid;
			else if (a[mid].compareTo(x) > 0)
				return searchIndex(a, lo, mid - 1, x);
			else
				return searchIndex(a, mid + 1, hi, x);
		}

		return -1;
	}
}
