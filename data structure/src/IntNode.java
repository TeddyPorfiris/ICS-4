public class IntNode {
    private Integer data;
    private IntNode link;
    public IntNode(Integer data, IntNode link) {
        this.data = data;
        this.link = link;
    }
    public IntNode(Integer data) {
        this.data = data;
        this.link = null;
    }
    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
    //returns the node that this node links to
    public IntNode getLink() {
        return link;
    }
    
    public void setLink(IntNode link) {
        this.link = link;
    }
}