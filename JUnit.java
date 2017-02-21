import org.junit;

public class JUnit {

  @Test
	 public void testMergeSort(){
	    MergeSort ms = new MergeSort(){
		      int resultado = test.mergeSort(2, 4, 6, 8, 3);
		        assertEquals(2, 3, 4, 6, 8, resultado);
          }
        }

  @Test
  	public void testRadixSort(){
  	  RadixSort rs = new RadixSort(){
  		  int resultado = test.sort(2, 4, 6, 8, 3);
  		  assertEquals(2, 3, 4, 6, 8, resultado);
      }
    }

    @Test
    	public void testQuickSort(){
    	  QuickSort qs = new QuickSort(){
    		  int resultado = test.quicksort(2, 4, 6, 8, 3);
    		  assertEquals(2, 3, 4, 6, 8, resultado);
        }
      }

      @Test
      	public void testGnomeSort(){
      	  GnomeSort gs = new GnomeSort(){
      		  int resultado = test.gnomeSort(2, 4, 6, 8, 3);
      		  assertEquals(2, 3, 4, 6, 8, resultado);
          }
        }
}
