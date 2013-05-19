/**
 * 
 */
package en.ramezcua.taskmaster.core;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Ricco Amezcua
 *
 */
public class TaskTest {

	/**
	 * Test method for {@link en.ramezcua.taskmaster.core.Task#Task()}.
	 */
	@Test
	public void testTask() {
		Task task = new Task();
		assertEquals("", task.getTask());
		assertEquals(false, task.getCompletion());
	}

	/**
	 * Test method for {@link en.ramezcua.taskmaster.core.Task#Task(java.lang.String)}.
	 */
	@Test
	public void testTaskString() {
		Task task = new Task("Finish homework");
		assertEquals("Finish homework", task.toString());
	}

	/**
	 * Test method for {@link en.ramezcua.taskmaster.core.Task#getTask()}.
	 */
	@Test
	public void testGetTask() {
		Task task = new Task();
		task.setTask("Finish homework");
		assertEquals("Finish homework", task.getTask());
	}
	
	/**
	 * Test method for {@link en.ramezcua.taskmaster.core.Task#getCompletion()}.
	 */
	@Test
	public void testGetCompletion() {
		Task task = new Task();
		task.setTask("Finish homework");
		assertEquals(false, task.getCompletion());
		task.finishTask();
		assertEquals(true, task.getCompletion());
	}

	/**
	 * Test method for {@link en.ramezcua.taskmaster.core.Task#setTask(java.lang.String)}.
	 */
	@Test
	public void testSetTask() {
		Task task = new Task();
		task.setTask("Finish homework");
		assertEquals("Finish homework", task.getTask());
	}


	/**
	 * Test method for {@link en.ramezcua.taskmaster.core.Task#finishTask()}.
	 */
	@Test
	public void testFinishTask() {
		Task task = new Task("Finish homework");
		task.finishTask();
		assertEquals(true, task.getCompletion());
	}

	/**
	 * Test method for {@link en.ramezcua.taskmaster.core.Task#unfinishTask()}.
	 */
	@Test
	public void testUnfinishTask() {
		Task task = new Task("Finish homework");
		task.finishTask();
		task.unfinishTask();
		assertEquals(false, task.getCompletion());	
	}

	/**
	 * Test method for {@link en.ramezcua.taskmaster.core.Task#toString()}.
	 */
	@Test
	public void testToString() {
		Task task = new Task("Finish homework");
		assertEquals("Finish homework", task.toString());
	}

}
