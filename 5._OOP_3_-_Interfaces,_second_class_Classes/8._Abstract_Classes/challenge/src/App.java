public class App {
    public static void main(String[] args) {
        MyLinkList list = new MyLinkList(null);
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s : data)
            list.addItem(new Node(s));
        list.addItem(new Node("Pizza")); // Node is of type ListItem
        list.traverse(list.getRoot());
    }
}
