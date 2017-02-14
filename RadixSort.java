
// Método extraído de: http://www.sanfoundry.com/java-program-implement-radix-sort/
public class RadixSort implements Comparable{

	 public static void radixSort( int[] a)
	    {
	        int i, m = a[0], exp = 1, n = a.length;
	        int[] b = new int[10];
	        for (i = 1; i < n; i++)
	            if (a[i] > m)
	                m = a[i];
	        while (m / exp > 0)
	        {
	            int[] bucket = new int[10];

	            for (i = 0; i < n; i++)
	                bucket[(a[i] / exp) % 10]++;
	            for (i = 1; i < 10; i++)
	                bucket[i] += bucket[i - 1];
	            for (i = n - 1; i >= 0; i--)
	                b[--bucket[(a[i] / exp) % 10]] = a[i];
	            for (i = 0; i < n; i++)
	                a[i] = b[i];
	            exp *= 10;
	        }
	    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
