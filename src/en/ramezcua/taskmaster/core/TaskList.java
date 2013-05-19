package en.ramezcua.taskmaster.core;

import java.util.ArrayList;

public class TaskList {
	
	private ArrayList<Task> tasks = new ArrayList<Task>();
	
	TaskList(){

	}
	
	public int numberOfTasks(){
		return tasks.size();
	}
	
	public Task getTask(int index){
		return tasks.get(index);
	}
	
	public void addTask(String description){
		Task task = new Task(description);
		this.tasks.add(task);
	}
	
	public void addTask(Task task){
		this.tasks.add(task);
	}
	
	public void removeTask(int index){
		this.tasks.remove(index);
	}
	
	public void removeTask(Task task){
		this.tasks.remove(task);
	}
	
	public void removeCompletedTasks(){
		
		for(int i = 0; i < this.tasks.size(); i++){
		
			Task task = getTask(i);
			if (task.getCompletion() == true){
				removeTask(i);
			}
		}
		
		
	}
	
}
