package app_lottery_toys;

import java.io.FileNotFoundException;

public class LotteryToys {
    public static void main(String[] args) throws FileNotFoundException {

        FileClear.fileClear();                                                                     //очистка файла

        Store store = new Store();                                                                 //создание магазина с
        Counter_id counter = new Counter_id(0);                                                 // создание автозаполнение id
        UI ui = new UI();                                                                          //создание интерфейса с пользователем

        Toy car = new Toy(counter.getId(), "Car", 10, 20);                 //создание игрушек
        Toy transformer = new Toy(counter.getId(), "Transformer", 200, 40);
        Toy ball = new Toy(counter.getId(), "Ball", 200, 40);
        Toy doll = new Toy(counter.getId(), "Dall", 200, 40);
        Toy rubikCube = new Toy(counter.getId(), "rubik's cube", 200, 95);
        Toy soapBubbles = new Toy(counter.getId(), "soap bubbles", 10, 10);


        store.addToy(car);                                                                          //добавления игрушек в магазин
        store.addToy(transformer);
        store.addToy(ball);
        store.addToy(doll);
        store.addToy(rubikCube);
        store.addToy(soapBubbles);

        ui.userMenu(store, counter, store.getToys());                                               // работа приложения в пользовательском интерфейсе





    }

}