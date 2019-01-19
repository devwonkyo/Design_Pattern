

public abstract class HomeAppliancies {
    private int serialNo;
    private String menufacturer;
    private int year;

    public abstract void turnOn();

    public abstract void turnOff();

}

class Wssher extends HomeAppliancies{

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}

class Freezer extends HomeAppliancies {

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}

class DishWasher extends  HomeAppliancies{

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
