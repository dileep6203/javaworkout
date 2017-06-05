package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import sapmlework.QueueApp;

public class QueueAppTest {

	private QueueApp queueApp;
	@Before
	public void init() {
		queueApp = new QueueApp(2);
	}
	@Test
    public void testisQEmpty() {
        assertTrue(queueApp.isQEmpty());
    }
	
	@Test
	public void testPush() {
		queueApp.push(2);
		queueApp.push(2);
		queueApp.push(2);
	
		
		
		
	}
	@Ignore
    public void testisQFull() {
        assertTrue(queueApp.isQFull());
    }

}
