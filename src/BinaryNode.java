class BinaryNode{
    private int value;
    private BinaryNode left;
    private  BinaryNode right;

    BinaryNode(){
        left=null;
        right=null;
    }


    public void setValue(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }

    public void setLeft(BinaryNode left){
        this.left = left;
    }

    public void setRight(BinaryNode right){
        this.right=right;
    }

    public BinaryNode getLeft(){
        return left;
    }

    public BinaryNode getRight(){
        return right;
    }

}
