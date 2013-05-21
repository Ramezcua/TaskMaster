
import javax.swing.*;
import java.awt.*;


public class TaskMaster {
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Task Master");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500, 700);
		window.setLayout(new BoxLayout(window.getContentPane(), BoxLayout.PAGE_AXIS));
		
		JPanel topButtons = new JPanel();
		JPanel taskPanel = new JPanel();
		
		topButtons.setLayout(new FlowLayout());
		
		JButton newTaskButton = new JButton("New Task");
		JButton removeCompletedTasksButton = new JButton("Remove Completed Tasks");
		
		topButtons.add(newTaskButton);
		topButtons.add(removeCompletedTasksButton);
		
		JTextArea text = new JTextArea("Get the milk");
		
		taskPanel.add(text);
		
		window.add(topButtons);
		window.add(Box.createRigidArea(new Dimension(0,5)));
		window.add(taskPanel);
		window.setVisible(true);
	}

}
