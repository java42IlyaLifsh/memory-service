package telran.util.memory;
//HW_17 Ilya_L

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemoryServiceTest {
	byte array[];
	final long MG = 1024 * 1024;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		int maxSize = MemoryService.getMaxAvailableMemory();
		array = new byte[maxSize]; //normal allocation
		array = null;
		boolean gotException = false;
		try {
			array = new byte[maxSize + 1]; //exception	
			array = null;
		} catch (Throwable e) {
			gotException = true;
		}
		assertTrue(gotException);		
		System.out.printf("  Max size=%dM", maxSize/MG);
	}
}