public class ArrayList<E> implements List<E> {
	public Object[] top;
	private int size;
	private int initialCapacity = 5;
	private int extraCapacity = 5;
	
	/**
	 * Creates a new ArrayList instance with the default initial capacity.
	 */
	public ArrayList() {
		top = new Object[initialCapacity];
		size = 0;
	}
	
	/**
	 * Increases the capacity of this ArrayList instance so that it 
	 * can hold at least extraCapacity elements more.
	 * This method allocates a new array with greater capacity than the
	 * current one (top.length + extraCapacity) and copies all elements
	 * from top to the newly allocated array. The reference top is then
	 * updated to point to the new array. 
	 * @param extraCapacity increase the capacity of this ArrayList by this amount
	 */
	private void reserveExtraCapacity(int extraCapacity) {
		int currentCapacity = top.length;
		
		if(extraCapacity > currentCapacity) {
			Object [] ListTop = top;
			top = (Object []) new Object[initialCapacity];
			for (int i = 0; i<size; i++ )
				top[i] = ListTop[i];
			ListTop = null;
			
		}
		
	}
	
	/**
	 * Increases the capacity of this list if its size equals the length of the array
	 * where the data is stored. This method calls reserveExtraCapacity when (size() >= top.length).
	 * reserveExtraCapacity is called using the instance variable extraCapacity.
	 */
	private void ensureCapacity() {
		int currentCapacity = top.length;
		
		if(initialCapacity > currentCapacity) {
			Object [] ListTop = top;
			top = (Object []) new Object[initialCapacity];
			for (int i = 0; i<size; i++ )
				top[i] = ListTop[i];
			ListTop = null;
			
		}
	}
	
	/**
	 * Shifts elements in the array (top) to the right, starting at the given position.
	 * @param index the position in which the shift will begin
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index > size())
	 */
	private void shiftContentsRight(int index) {
		if (index <0 || index > size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index < (size >> 1)) {
			Object [] ListTop = top;
			
			for(int i=0; i<index; i++)
			ListTop	 = top.length;
			return top;
		} else {
			ArrayList<E> x = top.prev;
			for(int i = size - 1; i > index; i--)
				x = x.prev;
			return x;
		}
		
	}
	
	@Override
	public void addFirst(E e) {
		List <Object> newElement = new Object[E](e);
		
		Object [] firstElement = top;
		newElement.next = firstElement;
		firstElement.prev = newElement;
		
		newElement.prev = header;
		header.next = newElement;
		
		size++;
	}

	@Override
	public void addLast(E e) {
	}

	@Override
	public void add(int index, E element) {
	}

	@Override
	public E getFirst() {
		return null;
	}

	
	@Override
	public E getLast() {
		return null;
	}

	
	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public E set(int index, E element) {
		return null;
	}

	@Override
	public void clear() {
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public String toString() {
		return null;
	}
}
