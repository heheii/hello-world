package com.mycompany.myapp.web.rest;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class LambdaTest {

//    test
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(11, "小牙刷", 12.05 ));
        items.add(new Item(5, "日本马桶盖", 999.05 ));
        items.add(new Item(7, "格力空调", 888.88 ));
        items.add(new Item(17, "肥皂", 2.00 ));
        items.add(new Item(9, "冰箱", 4200.00 ));

        items.removeIf(ele -> ele.getId() == 7);

        //通过 foreach 遍历，查看是否已经删除
        items.forEach(System.out::println);
    }

    public static void test01(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("11");
            }
        };
        thread.start();
    }

    public static void test02(){
        Runnable task = () -> {
            System.out.println("test");
        };
        new Thread(task).start();
    }

    public static void test03(){
        Runnable task = () -> {
            System.out.println("test");
        };
        new Thread(task).start();
    }

    public static void test04(){
        MyInterfa task = (a) -> {
            return "return info: " + a;
        };
        System.out.println(task.function("hehe"));;
    }


}

interface MyInterfa {
    public String function(String str);
}

class Item {
    private int id;
    private String name;
    private double price;

    Item(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Item{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price +
            '}';
    }

}
