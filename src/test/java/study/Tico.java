package study;

// 상속
class Tico extends Car {

    // default construct
    public Tico(){
        super(0,"default",10);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed();
    }
}