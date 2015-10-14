import java.util.LinkedList;

public class Solution06{
	public class animalShelter{
		class Animal {
			String name;
			int order;
			public Animal(int x, String n) {
				this.order = x;
				this.name = n;

			}
		}
		Linkedlist<Animal> dog = new Linkedlist<>();
		Linkedlist<Animal> cat = new Linkedlist<>();

		void enqueue(Animal a)
		{
			if (a.name == "dog")
				return dog.add(a(order++, "dog"));
			if (a.name == "cat")
				return cat.add(a.(order++, "cat"));
		}

		Object dequeueAny()
		{
			if (dog.isEmpty() && cat.isEmpty())
				throw new Exception();
			if (dog.isEmpty())
				return cat.removeFirst();
			if (cat.isEmpty())
				return dog.removeFirst();
			if (dog.getFirst().order > cat.getFirst().order)
				return dog.removeFirst();
			return cat.removeFirst();
		}

		Animal dequeueDog()
		{
			if (dog.isEmpty())
				throw new Exception();
			return dog.removeFirst();
		}

		Animal dequeueCat()
		{
			if (cat.isEmpty())
				throw new Exception();
			return cat.removeFirst();
		}

	}
}