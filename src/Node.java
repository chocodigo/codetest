class Node{
    private String data;
    private Node next;

    public Node(){
        this.data="";
        this.next=null;
    }

    public void setData(String data){
        this.data=data;
    }

    public String getData(){
        return data;
    }

    public void setNext(Node next){
        this.next=next;
    }

    public Node getNext(){
        return next;
    }
}
