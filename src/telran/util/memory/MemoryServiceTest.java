package telran.util.memory;
//HW_15 Ilya_L

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemoryServiceTest {
byte ar[];
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		int maxSize = MemoryService.getMaxAvailableMemory();
		ar = new byte[maxSize]; //normal allocation
		ar = null;
		boolean fl = false;
	try {
		ar = new byte[maxSize + 1]; //exception
			
		} catch (Throwable e) {
			fl = true;
		}
	assertTrue(fl);
		
	}

}
