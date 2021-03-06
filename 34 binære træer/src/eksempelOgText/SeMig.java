package eksempelOgText;

/**
 * A binary tree in which each node has two children.
 */
public class SeMig<E> {
	private Node root;

	private class Node {
		public E data;
		public Node left;
		public Node right;
	}

	/**
	 * Constructs an empty tree.
	 */
	public SeMig() {
		root = null;
	}

	/**
	 * Constructs a tree with one node and no children.
	 * 
	 * @param rootData
	 *            the data for the root
	 */
	public SeMig(E rootData) {
		root = new Node();
		root.data = rootData;
		root.left = null;
		root.right = null;
	}

	/**
	 * Constructs a binary tree.
	 * 
	 * @param rootData
	 *            the data for the root
	 * @param left
	 *            the left subtree
	 * @param right
	 *            the right subtree
	 */
	public SeMig(E rootData, SeMig<E> left, SeMig<E> right) {
		root = new Node();
		root.data = rootData;
		if (left != null) {
			root.left = left.root;
		}
		if (right != null) {
			root.right = right.root;
		}
	}

	/**
	 * Checks whether this tree is empty.
	 * 
	 * @return true if this tree is empty
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * Gets the data at the root of this tree.
	 * 
	 * @return the root data
	 */
	public E data() {
		return root.data;
	}

	/**
	 * Gets the left subtree of this tree.
	 * 
	 * @return the left child of the root
	 */
	public SeMig<E> left() {
		SeMig<E> result = new SeMig<E>();
		result.root = root.left;
		return result;
	}

	/**
	 * Gets the right subtree of this tree.
	 * 
	 * @return the right child of the root
	 */
	public SeMig<E> right() {
		SeMig<E> result = new SeMig<E>();
		result.root = root.right;
		return result;

	}

	/**
	 *
	 * @param rootData
	 *            the new data for the root
	 * @return the data previous in the root
	 */
	public E replace(E rootData) {
		Node old = new Node();
		old.data = root.data;
		root.data = rootData;
		return old.data;
	}

	/**
	 * The size of the tree
	 * 
	 * @return the number of nodes in the tree
	 */
	public int size() {
		return size(root);
	}

	// Private recursive helper method
	private int size(Node root) {

		if (root == null) {
			return 0;
		}

		return 1 + size(root.left) + size(root.right);
	}
}
