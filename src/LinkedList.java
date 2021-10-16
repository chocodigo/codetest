class LinkedList{
    Node header;
    Node tail;

    public void add(String data){
        Node newNode = new Node();
        newNode.setData(data);

        if(header == null){
            header=newNode;
            tail=newNode;
        }else{
            tail.setNext(newNode);
            tail=newNode;
        }
    }

    public void print(){
        Node currNode = header;
        while(currNode!=null){
            System.out.println(currNode.getData());
            currNode = currNode.getNext();
        }
    }

    public boolean contains(String value){
        Node currNode = header;
        while(currNode!=null && currNode.getData() != value){
            currNode = currNode.getNext();
        }
        if(currNode==null)
            return false;
        return true;
    }

    public boolean remove(String value){
        if(header.getNext() == null)
            return false;

        Node currNode = header;
        if(currNode.getData() == value){
            if(header == tail){
                header=null;
                tail=null;
            }else{
                header=header.getNext();
            }
            return true;
        }

        while(currNode.getNext()!=null && currNode.getNext().getData() != value){
            currNode = currNode.getNext();
        }

        if(currNode.getNext()!= null){
            if(currNode.getNext() == tail){
                tail=currNode;
            }
            currNode.setNext(currNode.getNext().getNext());
            return true;
        }
        return false;
    }

    public int getSize(){
        int count = 0;
        Node currNode = header;
        while(currNode!=null){
            count++;
            currNode = currNode.getNext();
        }
        return count;
    }

    public void removeDuplicates(){
        Node currNode = header;
        Node compNode;
        while(currNode!=null && currNode.getNext()!=null){
            compNode = currNode;

            while(compNode.getNext() != null){
                if(currNode.getData() == compNode.getNext().getData()){
                    compNode.setNext(compNode.getNext().getNext());
                }else
                    compNode = compNode.getNext();
            }
            currNode = currNode.getNext();
        }
    }
}
