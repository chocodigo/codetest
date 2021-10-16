class BinarySearchTree{
    private BinaryNode root;

    BinarySearchTree(){
        root=null;
    }

    public BinaryNode getRoot(){
        return root;
    }

    public void insert(BinaryNode value){
        if(root==null)
            root=value;
        else
            insertNode(root,value);
    }

    public void insertNode(BinaryNode current, BinaryNode value){
        if(value.getValue() < current.getValue()){
            if(current.getLeft()==null){
                current.setLeft(value);
            }else{
                insertNode(current.getLeft(),value);
            }
        }else{
            if(current.getRight()==null){
                current.setRight(value);
            }else{
                insertNode(current.getRight(),value);
            }
        }
    }

    public void preorder(BinaryNode node){
        if(node!=null){
            System.out.print(node.getValue()+" ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }
}
