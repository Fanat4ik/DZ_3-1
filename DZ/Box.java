package ru.geekbrains.DZ;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    private List <T>  contentBox;
    private float boxWeight;


    public Box (){
        //конструктор по умолчанию
        this.contentBox = new ArrayList<>();
        boxWeight = 0;
    }
    public float getWeightBox(){
        // показывает вес коробки
        return boxWeight;
    }


   public boolean compare(Box box) {
       //метод сравнения коробок
       //позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра,
       //true - если их веса равны,
       //false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
        if (this.getWeightBox() == box.getWeightBox()){
            return true;
        }
        return false;
    }
    public void fromBoxToBox (Box box) {
        //метод перемещения фруктос из текущией коробки в коробку, подаваемую в качестве параметра метода
        for (int i = 0; i < this.contentBox.size(); i++) {
            if(box.addFruitToBox(this.contentBox.get(i))){
                //уменьшаем массу коробки на массу вынутого фрукта
                boxWeight = boxWeight - this.contentBox.get(i).getWeight();
                //удаляем фрукт
                this.contentBox.remove(i);
                // делаем i-- поскольку после удаления фрукта их ArrayList происходит смещение
                i--;
            }
        }
    }

    public boolean addFruitToBox(T fruit){
        //метод добавляет фрукт в коробку
        if (fruit instanceof Fruit) {
            if (contentBox.size() == 0) {
                contentBox.add(fruit);
                System.out.println("в коробку добавили " + fruit.getName());
                boxWeight = boxWeight + fruit.getWeight();
                return true;
            }
            if ((contentBox.get(0) instanceof Apple) & (fruit instanceof Apple)) {
                contentBox.add(fruit);
                System.out.println("в коробку добавили " + fruit.getName());
                boxWeight = boxWeight + fruit.getWeight();
                return true;
            }
            if ((contentBox.get(0) instanceof Orange) & (fruit instanceof Orange)) {
                contentBox.add(fruit);
                System.out.println("в коробку добавили " + fruit.getName());
                boxWeight = boxWeight + fruit.getWeight();
                return true;
            }
        }
        System.out.println(fruit.getName() + " не может быть добавлен в эту коробку");
        return false;
    }
//    static <T, V> boolean isIn(T x, ArrayList<V> arrList){
//        for (V element : arrList){
//            if (x.equals(element)){
//                return true;
//            }
//        }return false;
//    }
}


