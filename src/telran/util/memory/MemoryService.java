package telran.util.memory;



public class MemoryService {
public static int getMaxAvailableMemory() {
	long maxMemory = Runtime.getRuntime().maxMemory();
	int maxSize = maxMemory > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) maxMemory;
	while (true) {
		try {
			byte ar[] = new byte[maxSize];
			ar = null;
			break;
		} catch (Throwable e) {
			maxSize--;
		}
		
	}
	return maxSize;
}
}
