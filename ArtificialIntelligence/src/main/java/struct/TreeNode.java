package struct;

import java.util.List;

public class TreeNode<T> extends Node<T> {

	private TreeNode<T> parent;
	private List<TreeNode<T>> children;
	
	public TreeNode() {
		super();
		parent = null;
		children = null;
	}
	
	public TreeNode(T data) {
		super(data);
		parent = null;
		children = null;
	}
	
	public void setParent(TreeNode<T> parent) {
		this.parent = parent;
	}
	
	public TreeNode<T> getParent() {
		return parent;
	}
	
	public void setChildren(List<TreeNode<T>> children) {
		this.children = children;
	}
	
	public List<TreeNode<T>> getChildren() {
		return children;
	}
	
}
