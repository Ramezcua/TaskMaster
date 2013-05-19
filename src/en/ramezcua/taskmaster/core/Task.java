package en.ramezcua.taskmaster.core;

public class Task {
	private String task;
	private boolean completion;
	
	Task(){
		setTask("");
		setCompletion(false);
	}
	
	Task(String task){
		setTask(task);
		setCompletion(false);
	}
	
	public String getTask(){
		return task;
	}
	
	public boolean getCompletion(){
		return completion;
	}
	
	public void setTask(String task){
		
		// If task is longer than 150 characters, truncate it
		
		if (task.length() <= 0){
			this.task = "";
		
		}else if (task.length() > 150){
			this.task = task.substring(0, 150);
		}else{
			this.task = task;
		}	
	}
	
	private void setCompletion(boolean completion){
		
		this.completion = completion;
	}
	
	public void finishTask(){
		this.completion = true;
	}
	
	public void unfinishTask(){
		this.completion = false;
	}
	
	public String toString(){
		return this.getTask();
	}

}
