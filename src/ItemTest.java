public class ItemTest {
    public static void main(String[] args) {
        // Test case for toString method
        Item item1 = new Item("Grapes", 2.99, 5);
        String expectedString = "Item [name=Grapes, price=2.99, quantity=5]";
        assert item1.toString().equals(expectedString);
        System.out.println("toString test passed!");

        // Test case for getName
        Item item2 = new Item("Milk", 3.49, 2);
        assert item2.getName().equals("Milk");

        // Test case for getPrice
        assert item2.getPrice() == 3.49;

        // Test case for getQuantity
        assert item2.getQuantity() == 2;

        // Test case for modifying item properties
        item2.setName("Bread");
        item2.setPrice(2.99);
        item2.setQuantity(3);
        assert item2.getName().equals("Bread");
        assert item2.getPrice() == 2.99;
        assert item2.getQuantity() == 3;

        System.out.println("All tests passed!");
    }
}
