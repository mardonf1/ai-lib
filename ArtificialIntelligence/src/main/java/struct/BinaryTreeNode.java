package struct;

public class BinaryTreeNode<T> extends Node<T> {
	private BinaryTreeNode<T> parent, leftChild, rightChild;
	
	public BinaryTreeNode() {
		super();
		parent = null;
		leftChild = null;
		rightChild = null;
	}
	
	public BinaryTreeNode(T data) {
		super(data);
		parent = null;
		leftChild = null;
		rightChild = null;
	}
	
	public void setParent(BinaryTreeNode<T> parent) {
		this.parent = parent;
	}
	
	public BinaryTreeNode<T> getParent() {
		return parent;
	}
	
	public void addChild(BinaryTreeNode<T> child) {
		if (leftChild == null)
			leftChild = child;
		else if (rightChild == null)
			rightChild = child;
	}
	
}