package app_lottery_toys;

public class Counter_id {
    private int id;

    public Counter_id(int id) {
        this.id = id;
    }

    public int getId() {
        id++;
        return id;
    }
}
