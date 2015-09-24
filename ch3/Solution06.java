public class Solution06{
	public class animalShelter{
		Linkedlist<dogs> dog = new Linkedlist<>();
		Linkedlist<cats> cat = new Linkedlist<>();

		void enqueue(Linkedlist item)
		{
			rear.next = item;
			rear = rear.next;
		}

		Object dequeueAny()
		{
			Linkedlist tmp = front;
			front = front.next;
			return tmp.data;
		}

		dogs dequeueDog()
		{
			while (Linkedlist.peerFirst() != dogs)
			{
				Linkedlist.remove();
			}
			return Linkedlist.pollFirst();
		}

		cats dequeueCat()
		{
			while (Linkedlist.peerFirst() != cats)
			{
				Linkedlist.remove();
			}
			return Linkedlist.pollFirst();
		}

	}
}