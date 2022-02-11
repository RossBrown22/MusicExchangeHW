package shop;

import stock.Item;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<Item> items;

    public MusicShop() {
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }
}
