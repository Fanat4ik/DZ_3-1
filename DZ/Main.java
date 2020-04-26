package ru.geekbrains.DZ;

import java.util.ArrayList;

public class Main {
    //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static <T> void changeArr (T [] arr , int n1, int n2){
        T n = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = n;
        for (T var: arr) {
            System.out.println(var);
        }
    }
    //2. Написать метод, который преобразует массив в ArrayList;
    public static <T> ArrayList<T> arrToArrayList(T[] arr){
        ArrayList <T> arrList = new ArrayList<>();
        for (T var:arr) {
            arrList.add(var);
        }
        return arrList;
    }
    public static void main(String[] args) {
        String [] arr = new String[] {"A","B","C","D","E"};
        changeArr(arr, 0, 3);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = arrToArrayList(arr);
        System.out.println(arrayList);
    //3.Интересная задача
// фрукты
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
//коробки
        Box<Fruit> fruitBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
// добавляем фрукты в коробки
        fruitBox.addFruitToBox(apple4);
        fruitBox.addFruitToBox(orange1);
        System.out.println(fruitBox.getWeightBox());
        appleBox.addFruitToBox(apple1);
        appleBox.addFruitToBox(apple2);
        appleBox.addFruitToBox(apple3);
        System.out.println(appleBox.getWeightBox());
        orangeBox.addFruitToBox(orange1);
        orangeBox.addFruitToBox(orange2);
        System.out.println(orangeBox.getWeightBox());
//сравниваем коробки
        System.out.println(appleBox.compare(orangeBox));
        System.out.println(fruitBox.compare(appleBox));
//перемещаем фрукты из одной коробки в другую
        appleBox.fromBoxToBox(fruitBox);
//Проверяем изменившуюся массу
        System.out.println(appleBox.getWeightBox());
        System.out.println(fruitBox.getWeightBox());

    }
}
