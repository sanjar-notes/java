public class Node extends ListItem { // Concrete class - for the value
    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem getNext() {
        return this.rightLink;
    }

    @Override
    public ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    public ListItem getPrevious() {
        return this.leftLink;

    }

    @Override
    public ListItem setPrevious(ListItem item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    public int compareTo(ListItem item) {
        if (item != null)
            return ((String) super.getValue()).compareTo((String) item.getValue());
        return -1;
    }
}
