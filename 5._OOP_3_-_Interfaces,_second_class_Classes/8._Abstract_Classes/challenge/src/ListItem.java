public abstract class ListItem {
    protected ListItem rightLink = null, leftLink = null; // references, not recursive class
    protected Object value; // object value is left generic

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem getNext();

    abstract ListItem setNext(ListItem item);

    abstract ListItem getPrevious();

    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return this.value;
    }

    public void setObject(Object value) {
        this.value = value;
    }
}
