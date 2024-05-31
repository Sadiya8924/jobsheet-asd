public class BinarryTree24{
    Node24 root;
    int size;

    public BinarryTree24(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(int data){
        if(isEmpty()){
            //tree is empty
            root = new Node24(data); 
        } else { 
            Node24 current = root; 
            while (true) { 
                if (data < current.data) { 
                    if (current.left != null) { 
                        current = current.left; 
                    } else { 
                        current.left = new Node24(data); 
                        break; 
                    } 
                } else if ( data > current.data) {
                    if (current.right == null) { 
                        current.right = new Node24(data); 
                        break; 
                    } else { 
                        current = current.right; 
                    }
                }else{
                    //data is already exist
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node24 current = root;
        while(current != null){
            if(current.data == data){
                result = true;
                break;
            }else if(data < current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }

    void transversePreOrder(Node24 node){
        if(node != null){
            System.out.print(" " + node.data);
            transversePreOrder(node.left);
            transversePreOrder(node.right);
        }
    }

    void transversePostOrder(Node24 node){
        if(node != null){
            transversePostOrder(node.left);
            transversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void transverseInOrder(Node24 node){
        if(node != null){
            transverseInOrder(node.left);
            System.out.print(" " + node.data);
            transverseInOrder(node.right);
        }
    }

    Node24 getSuccessor(Node24 del){
        Node24 successor = del.right;
        Node24 succesorParent = del;
        while(successor.left != null){
            succesorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            succesorParent.left = successor.right;
            successor.right = del.right;
        } 
        return successor;
    }

    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node24 parent = null;
        Node24 current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else{
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        //deletion
        if(current == null){
            System.out.println("Couldn't find data!");
            return;
        }else{
            //if there is no child, simply delete it
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                }else{
                    if(isLeftChild){
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }else if(current.right == null){
                //if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                }else{
                    if (isLeftChild) {
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){
                // if there is 1 child left
                if (current == root) {
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{
                //if there is 2 childs
                Node24 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                }else{
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}