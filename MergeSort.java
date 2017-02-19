// Extraído de http://javahungry.blogspot.com/2013/06/java-sorting-program-code-merge-sort.html

public class MergeSort implements Comparable{
	
	/**
	 * Se unen dos mitades del array en un array resultado
	 * @param primero
	 * @param segundo
	 * @param resultado
	 */
	private static void merge(int[] primero, int[] segundo, int[] resultado){
		
		int xPrimero = 0; // Elemento del primer array
        int xSegundo = 0; // elemento del segundo array
        int j = 0; // elemento vacio en resultado
        
        while (xPrimero < primero.length && xSegundo < segundo.length) {
            if (primero[xPrimero] < segundo[xSegundo]) {
                resultado[j] = primero[xPrimero];
                xPrimero++;
                } else {
                resultado[j] = segundo[xSegundo];
                xSegundo++;
            }
            j++;
        }
        System.arraycopy(primero, xPrimero, resultado, j, primero.length - xPrimero);
        System.arraycopy(segundo, xSegundo, resultado, j, segundo.length - xSegundo);
	}
	
	/**
	 * Metodo que divide el array en dos, los ordena y los une de nuevo
	 * @param list
	 * @return
	 */
	public static int[] mergeSort(int [] list){
		if (list.length <= 1){ // si solo hay un elemento, se devuelve el mismo
			return list;
		}
		// Se parte el array a la mitad
		int [] primero = new int[list.length/2];
		int [] segundo = new int[list.length - primero.length];
		System.arraycopy(list, 0, primero, 0, primero.length);
	    System.arraycopy(list, primero.length, segundo, 0, segundo.length);
	    // Se ordena cada mitad
	    mergeSort(primero);
	    mergeSort(segundo);
	    // Se unen ambas mitades y se guarda en el array original
	    merge(primero, segundo, list);
	    return list;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}