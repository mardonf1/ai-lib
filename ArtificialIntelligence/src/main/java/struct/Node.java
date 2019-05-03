package struct;

public class Node<T> {
	private T data;
	
	public Node() {
		data = null;
	}
	
	public Node(T data) {
		this.data = data;
	}
	
	public void setData(T newData) {
		data = newData;
	}
	
	public T getData() {
		return data;
	}
}