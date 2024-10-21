class Item {
    private int itemPrice; // Menyimpan harga barang sebagai int.
    private String itemName; // Menyimpan nama barang.
    private String itemCode; // Menyimpan kode barang.
    private int itemQty; // Menyimpan jumlah barang.

    public Item(String code, String name, int price, int qty) {
        this.itemCode = code;
        this.itemName = name;
        this.itemPrice = price;
        this.itemQty = qty;
    }

    public int getSubTotal() {
        return itemPrice * itemQty;
    }

    public int getPrice() {
        return itemPrice;
    }

    public String getCode() {
        return itemCode;
    }

    public String getName() {
        return itemName;
    }

    public int getQty() {
        return itemQty;
    }
}