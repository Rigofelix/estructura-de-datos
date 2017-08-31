package doblelista;

import java.util.NoSuchElementException;

import listasLigadas.Node;

public class LinkedList<E> implements List<E> {
	private Node<E> header;
	private int size;
	
	public LinkedList() {
		header = new Node<E>();
		size = 0;
	}
	
	/**
	 * Gets the node at the specified index.
	 * @param index the index of the node to get
	 * @return the node at the specified position
	 * @throws IndexOutOfBoundsException if the index is out of range (index < 0 || index >= size())
	 */
	private Node<E> node(int index) {
		if(index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}
		
		if (index < (size >> 1)) {
            Node<E> x = header.next;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<E> x = header.prev;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
	}

	@Override
	public void addFirst(E e) {
		
		
		Node<E> newElement = new Node<E>(e);
		
		Node<E> firstElement= header.next;
		newElement.next = firstElement;
		firstElement.prev = newElement;
		
		newElement.prev = header;
		header.next = newElement;
		
		size ++;
		
	}

	@Override
	public void addLast(E e) {
		Node<E> newElement = new Node<E>(e);
		
		Node<E> lastElement = header.prev;
		newElement.prev = lastElement;
		lastElement.next = newElement;
		
		newElement.next = header;
		header.next = newElement;
		
	}

	@Override
	public void add(int index, E element) {
		if(index < 0 || index < size()) {
			throw new IndexOutOfBoundsException();
		}
		if(index == size()) {
			addLast(element);
			
		}else {
			Node<E> newNode = new Node<E>(element);
			Node<E> current =node(index);
			Node<E> previousNode = current.prev;
			
			newNode.prev = previousNode;
			previousNode.next =newNode;
			
			newNode.next = current;
			current.prev = newNode;
			size++;
		}
		
		
	}

	@Override
	public E removeFirst() {
		if (header.next == null) {
			throw new NoSuchElementException();
		}
		Node<E> nodeToRemove = header.next;
		
		return null;
	}

	@Override
	public E removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		
		return size == 0;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return null;
	}
}
