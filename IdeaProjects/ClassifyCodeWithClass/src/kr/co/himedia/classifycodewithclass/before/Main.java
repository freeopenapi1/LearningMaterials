package kr.co.himedia.classifycodewithclass.before;

public class Main {

    public static void main(String[] args) {

        Item book = new Item(Item.CASSIFYCODE_BOOK, "죄와 벌", 20000);
        Item dvd = new Item(Item.CASSIFYCODE_DVD, "도스토예프시키", 50000);
        Item software = new Item(Item.CASSIFYCODE_SOFTWARE, "ChatGTP", 30000);
        //Item item = new Item(100, "ChatGPT", 25000);

        System.out.println(book);
        System.out.println(dvd);
        System.out.println(software);
    }
}
