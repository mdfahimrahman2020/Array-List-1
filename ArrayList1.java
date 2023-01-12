import java.util.ArrayList;
public class ArrayList1
{
	public static void main(String[] args)
	{
		ArrayList <Integer> number = new ArrayList <Integer>();
		 

		//Adding, element.
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(50);
		

        //Printing ArrayList.
		System.out.print("\n\nArray List (general method):"+number);


        System.out.print("\n\nArray List (for each loop): ");
		for(int x:number)
		{
			System.out.print(" "+x);
		}
		

		//Print ArrayList Size.
		System.out.print("\nSize = "+number.size());

		

		//Check empty arrayList.

		boolean check = number.isEmpty();
		System.out.print("\n\nArray List is empty : "+check);

		//Check finding element.
		boolean contain = number.contains(20);
		System.out.print("\n\n20 is in the list : "+contain);

		//To know Index.
		int pos = number.indexOf(50);
		System.out.print("\n\nThe index of 50 is : "+pos);

		//For replacing a value.
		number.set(4,60);
		System.out.print("\n\nAfter replacing the 4th number value is : "+number);

		//For getting a value.
		int g = number.get(0);
		System.out.print("\n\nWe get the velue of index 0 : "+g);

		//Removing element,
		number.remove(2);
		System.out.print("\n\nAfter removing 3rd number element : "+number);

		//All remove element.
		number.removeAll(number);
		System.out.print("\n\nAfter removing all element(remove method) : "+number);

		//Another removing method.
		number.clear();
		System.out.print("\n\nAfter removing all element(clear method) : "+number);


	}
}