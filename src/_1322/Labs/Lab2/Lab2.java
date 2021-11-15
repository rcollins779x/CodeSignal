//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab2;
import java.util.*;

class Lab2 {
    public static void main(String[] args) {
        int myQuantity, menu, index, option, subOption, change;
        double myPrice;
        String name;
        String description;

        Scanner scan = new Scanner(System.in);
        //Creates Object List StockList
        ArrayList<StockItem> StockList = new ArrayList<>();

        //StockItem(String description, double variablePrice, int variableQuantity)
        StockItem item0 = new StockItem("null",-4.95730,-5);
        StockList.add(item0);
        item0.setName("null");

        //Testing of Class Methods
        System.out.println( "Item ID :\t\t"     + StockList.get(0).getID() + "\n" +
                            "Item Name :\t\t"   + StockList.get(0).getName() + "\n" +
                            "Available Qty :\t" + StockList.get(0).getQuantity() + "\n" +
                            "Item Price :\t$"   + String.format("%.2f",StockList.get(0).getPrice()) + "\n" +
                            "Description :\t"   + StockList.get(0).getDescription() + "\n");
        do      //Menu
        {
            System.out.println("Select an option:");
            System.out.println("0. Exit");
            System.out.println("1. Enter a new item.");
            System.out.println("2. Display all items.");
            System.out.println("3. Change an item.");
            menu = scan.nextInt(); scan.nextLine();
            switch (menu)
            {
                case 0:
                    return;
                case 1:
                    StockItem item = new StockItem();

                    System.out.println("2. Enter item name:\t\t");
                    name = scan.nextLine();
                    System.out.print("Enter item quantity:\t");
                    myQuantity = scan.nextInt(); scan.nextLine();
                    System.out.print("Enter item price:\t\t");
                    myPrice = scan.nextDouble(); scan.nextLine();
                    System.out.print("Enter brief item description:\t");
                    description = scan.nextLine();

                    item.setName(name);
                    item.setQuantity(myQuantity);
                    item.setPrice(myPrice);
                    item.setDescription(description);
                    item.setID(StockList.size());
                    StockList.add(item);
                    break;
                case 2:
                    for (StockItem stockItem : StockList) {
                        System.out.println(stockItem);
                    }
                    break;
                case 3:
                    do {
                        System.out.println("0. Go back.");
                        System.out.println("What is the item ID you want to change?");
                        index = scan.nextInt(); scan.nextLine();

                        System.out.println(StockList.get(index));

                        System.out.println("0. Go back.");
                        System.out.println("1. Change Name.");
                        System.out.println("2. Change Quantity.");
                        System.out.println("3. Change Price.");
                        System.out.println("4. Change Description.");

                        option = scan.nextInt(); scan.nextLine();
                        switch(option) {
                            case 0:
                                break;
                            case 1:
                                System.out.println("Enter new Name.");
                                name = scan.nextLine();
                                StockList.get(index).setName(name);
                                break;
                            case 2:
                                System.out.println("0. Go back.");
                                System.out.println("1. Enter new quantity.");
                                System.out.println("2. Add to current quantity.");
                                System.out.println("3. Remove from current quantity.");
                                subOption = scan.nextInt(); scan.nextLine();

                                switch(subOption)
                                {
                                    case 0:
                                        break;
                                    case 1:
                                        System.out.println("Enter new Quantity.");
                                        myQuantity = scan.nextInt(); scan.nextLine();
                                        StockList.get(index).setQuantity(myQuantity);
                                        break;
                                    case 2:
                                        System.out.println("Current quantity for " + StockList.get(index).getName() + " is " + StockList.get(index).getQuantity());
                                        System.out.println("How much do you want to add?");
                                        change = scan.nextInt(); scan.nextLine();

                                        StockList.get(index).addQuantity(change);

                                        System.out.println("New quantity for " + StockList.get(index).getName() + " is " + StockList.get(index).getQuantity());
                                        break;
                                    case 3:
                                        System.out.println("Current quantity for " + StockList.get(index).getName() + " is " + StockList.get(index).getQuantity());
                                        System.out.println("How much do you want to remove?");
                                        change = scan.nextInt(); scan.nextLine();

                                        StockList.get(index).removeQuantity(change);

                                        System.out.println("New quantity for " + StockList.get(index).getName() + " is " + StockList.get(index).getQuantity());
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Enter new Price.");
                                myPrice = scan.nextDouble(); scan.nextLine();
                                StockList.get(index).setPrice(myPrice);
                                break;
                            case 4:
                                System.out.println("Enter new Description.");
                                description = scan.nextLine();
                                StockList.get(index).setDescription(description);
                                break;
                        }
                    } while(index !=0);
                    break;
            }
        } while (true);
    }
}
