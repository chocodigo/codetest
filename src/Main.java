
class User{
    private String username;    // 사용자 이름
    private ChatRoom currRoom;  // 현재 참여한 방
    private boolean isSupervisor;   // 방장인지 아닌지 여부

    User(){
        username="";
        currRoom=null;
        isSupervisor=false;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ChatRoom getCurrRoom() {
        return currRoom;
    }

    public void setCurrRoom(ChatRoom currRoom) {
        this.currRoom = currRoom;
    }

    public boolean isSupervisor() {
        return isSupervisor;
    }

    public void setSupervisor(boolean supervisor) {
        isSupervisor = supervisor;
    }

    public void createRoom(){
        if(currRoom==null){

        }else{
            System.out.println("참여하고 있는 방이 있습니다.");
        }
    }
}

class Supervisor extends User{

}

class ChatRoom{
    private int usernumber; // 유저수
    private Supervisor leader; //방장
    private boolean isPublic;   //공개여부
    private String PW;  // 비공개일 경우 비밀번호 설정

    ChatRoom(){
        usernumber=1;
        leader=null;
        isPublic=true;
        PW="";
    }

    public int getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(int usernumber) {
        this.usernumber = usernumber;
    }

    public Supervisor getLeader() {
        return leader;
    }

    public void setLeader(Supervisor leader) {
        this.leader = leader;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }
}

public class Main {

    static void minHeightTree(BinarySearchTree tree,int[] arr,int start, int end){
        int mid = (start+end)/2;
        BinaryNode node = new BinaryNode();
        node.setValue(arr[mid]);
        tree.insert(node);
        if(start < mid) minHeightTree(tree,arr,start,mid-1);
        if(end>mid)minHeightTree(tree,arr,mid+1,end);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] arr= new int[]{1,2,3,4,5,6,7};
        minHeightTree(bst,arr,0,arr.length-1);

        bst.preorder(bst.getRoot());
    }
}
