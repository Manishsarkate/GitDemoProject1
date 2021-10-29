package collect;

import java.util.ArrayList;

public class ArrayListExample
{

	public static void main(String[] args)
	{
		ArrayList<String> list= new ArrayList<String>();
		System.out.println("ArrayList is:"+list);
		list.add("demo");
		list.add("manish");
		System.out.println("ArrayList is:"+list);
		ArrayList<Object> list2= new ArrayList<Object>();
		list2.add("mahesh");
		list2.add("suraj");
		list2.add(1, "mayuri");
		System.out.println("ArrayList is:"+list2);
		list2.addAll(list);
		System.out.println("ArrayList is:"+list2);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

	}

}
