package machine;

class Resources {
    private int water,
            milk,
            coffeeBeans,
            disposableCups,
            money;

    Resources() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.disposableCups = 9;
        this.money = 550;
    }

    int getWater() {
        return water;
    }

    void setWater(int water) {
        this.water = water;
    }

    int getMilk() {
        return milk;
    }

    void setMilk(int milk) {
        this.milk = milk;
    }

    int getCoffeeBeans() {
        return coffeeBeans;
    }

    void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    int getDisposableCups() {
        return disposableCups;
    }

    void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    int getMoney() {
        return money;
    }

    void setMoney(int money) {
        this.money = money;
    }
}
