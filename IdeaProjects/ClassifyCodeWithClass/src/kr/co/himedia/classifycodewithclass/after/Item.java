package kr.co.himedia.classifycodewithclass.after;

public class Item {

    public static final int CASSIFYCODE_BOOK = ItemType.BOOK.getClassifyCode();
    public static final int CASSIFYCODE_DVD = ItemType.DVD.getClassifyCode();
    public static final int CASSIFYCODE_SOFTWARE = ItemType.SOFTWARE.getClassifyCode();

    //private final int classifyCode;
    private ItemType itemType;
    private final String title;
    private final int price;

    public Item(ItemType itemType, String title, int price) {
        this.itemType = itemType;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "classifyCode=" + itemType.getClassifyCode() +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}

















