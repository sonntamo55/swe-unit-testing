package de.hse.swt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import de.hse.swt.SwtLabMocks.Person;

@ExtendWith(MockitoExtension.class)
public class SwtLabMocksTest {

	/**
	 * A person is found and returned
	 */
	@Test
	public void testNormalFlow() {
		/*
		 * 1. Create Mock 
		 * 2. Define Mock behavior 
		 * 3. Create class under test (and hand-over the mock) 
		 * 4. Call class under test 
		 * 5. Assert result (person id and name) 
		 * 6. Verify the mock calls
		 */
		fail("Not yet implemented");
	}

	/**
	 * There is not database connectivity
	 */
	@Test
	public void testNoConnectivity() {
		fail("Not yet implemented");
	}

	/**
	 * The searched person is not found
	 */
	@Test
	public void testPersonNotFound() {
		fail("Not yet implemented");
	}

}
