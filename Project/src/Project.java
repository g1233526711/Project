import java.util.*;

public class Project 
{
	public static void main(String[] args) 
	{
		ToDoList toDoList = new ToDoList();
		Scanner scanner = new Scanner(System.in);
		String command = "";
		
		while (!command.equalsIgnoreCase("quit"))
		{
			
			switch (command)
			{
			case "add":
				System.out.println ("Enter a to-do item to add:");
				String itemToAdd = scanner.nextLine();
				toDoList.addItem(itemToAdd);
				break;
				
			case "delete":
				System.out.println ("Enter a to-do item to delete:");
				String itemToDelete = scanner.nextLine();
				toDoList.deleteItem(itemToDelete);
				break;
				
			case "view":
				System.out.println ("Your a to-do list:");
				toDoList.viewItems();
				break; 
				
			case "quit":
				System.out.println ("Exiting the application...");
				break;
				
			default:
				System.out.println ("Ivalid Command. Please enter add, delete, view or quit.");
			break;
			}
		}
		
		scanner.close();
		
	}

}

class ToDoList
{
	private List<String> items;
	
	public ToDoList()
	
	{
		this.items = new ArrayList<>();
	}
	
	public void addItem(String item)
	{
		items.add(item);
		System.out.println("Added: " + item);
	}
	
	public void deleteItem(String item)
	{
		if(items.remove(item))
		{
		    System.out.println("Deleted: " + item);
		}
		else
		{
			System.out.println("Item not found.");
		}
	}
	
	public void viewItems()
	{
		for (String item : items)
		{
			System.out.println(item);
		}
	}
    
	
}
