public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void onClick() {
        this.onClickListener.onClick(this.title); // calls the onClick inside the onClickListener
    }

    public interface OnClickListener {
        public void onClick(String title); // prints when clicked
    }

    protected void finalize() {
        System.out.println("I'm dead");
    }
}
