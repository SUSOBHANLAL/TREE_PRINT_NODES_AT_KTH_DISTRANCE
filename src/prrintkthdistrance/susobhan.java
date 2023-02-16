package prrintkthdistrance;
class node{
	int key;
	node left;
	node right;
	node(int key){
		this.key= key;
		left= null;
		right = null;
		
	}
}
public class susobhan {
	public static void main(String args[]) {
		node root = new node(10);
		root.left=new node(20);
		root.left.left= new node(40);
		root.left.right= new node(50);
		root.right=new node(30);
		root.right.right= new node(70);
		root.right.right.right= new node(80);
		printkthdist(2,root);
	}
	
      static void printkthdist(int k,node root) {
    	  if(root==null) {
    		  return;
    	  }
    	  if(k==0) {
    		  System.out.print(root.key+" ");
    	  }
    	  else {
    		  printkthdist(k-1,root.left);
    		  printkthdist(k-1,root.right);
    		  
    	  }
      }

}
