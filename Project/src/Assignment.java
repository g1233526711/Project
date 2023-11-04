import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Random;
public class Assignment
{
	public static void main(String[] args) 
	{
		ArrayList_Op();
		LinkedList_Op();
		HashTable_Op();
	}


	private static void ArrayList_Op() 
	{
		ArrayList<Integer> arr_list = new ArrayList<>();
		Random rand = new Random();
		for(int i=0; i<200000; i++)
		{
			arr_list.add(rand.nextInt(200000));
		}


		for(int i=0; i<200000; i++)
		{
			arr_list.remove(0);
		}

	}

	private static void LinkedList_Op() 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		Random rand = new Random();
		for(int i=0; i<200000; i++)
		{
			list.add(rand.nextInt(200000));
		}


		for(int i=0; i<200000; i++)
		{
			list.remove(0);
		}
	}


	private static void HashTable_Op() 
	{
		Hashtable<Integer, Integer> hash = new Hashtable<>();
		Random rand = new Random();


		for(int i=0; i<200000; i++)
		{
			hash.put(i, rand.nextInt(200000));
		}

		for(int i=0; i<200000; i++)
		{
			hash.remove(i);
		}
	}

}

