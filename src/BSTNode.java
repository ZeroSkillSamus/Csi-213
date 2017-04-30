
public class BSTNode {
private BSTNode left,right;
private String data;

public BSTNode (String name){
	this.data = name;
}

public BSTNode getLeft(){
	return this.left;
}

public void setLeft (BSTNode l){
	this.left = l;
}

public BSTNode getRight(){
	return right;
}

public void setRight (BSTNode r){
	this.right = r;
}
}
