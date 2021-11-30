package telran.util.memory;
//HW_17 Ilya_L


public class MemoryService {

	public static int getMaxAvailableMemory() {
		long maxMemory = Runtime.getRuntime().maxMemory();
		int right = maxMemory>Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)maxMemory;
		int left = 0;
		int middle = 0;
		byte ar[] = null;
		
		while (left <= right) { //variant in str.15 does not work due to rounding in the last step. str.16 and str.17 work!!!
//			middle = left/2 + right/2;
			middle = (int)(left/2.0 + right/2.0);
//			middle = (int) ((left + (long)right) / 2);
			try {
				ar = new byte[middle];
				left = middle + 1;
				ar = null;
			} catch (OutOfMemoryError e) {
				right = middle - 1;
			}
		}
		return left-1;
		 
	}
}
