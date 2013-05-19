package en.ramezcua.taskmaster.core;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class TaskListTest {

	@Test
	public void testTaskList() {
		TaskList list = new TaskList();
		assertEquals(0, list.numberOfTasks());
		list.addTask("Finish Homework");
		assertEquals(1, list.numberOfTasks());
		list.addTask("Get Milk");
		assertEquals(2, list.numberOfTasks());
	}

	@Ignore
	public void testNumberOfTasks() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTask() {
		TaskList list = new TaskList();
		list.addTask("Finish Homework");
		assertEquals("Finish Homework", list.getTask(0).getTask());
	}

	@Ignore
	public void testAddTaskString() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAddTaskTask() {
		TaskList list = new TaskList();
		Task task = new Task("Finish Homework");
		list.addTask(task);
		assertEquals("Finish Homework", list.getTask(0).getTask());
	}

	@Test
	public void testRemoveTaskInt() {
		TaskList list = new TaskList();
		Task task = new Task("Finish Homework");
		list.addTask(task);
		list.removeTask(0);
		assertEquals(0, list.numberOfTasks());
	}

	@Test
	public void testRemoveTaskTask() {
		TaskList list = new TaskList();
		Task task = new Task("Finish Homework");
		list.addTask(task);
		list.removeTask(task);
		assertEquals(0, list.numberOfTasks());
	}

	@Test
	public void testRemoveCompletedTasks() {
		TaskList list = new TaskList();
		Task task = new Task("Finish Homework");
		list.addTask(task);
		Task task2 = new Task("Get Milk");
		list.addTask(task2);
		Task task3 = new Task("Buy Eggs");
		list.addTask(task3);
	}

}
