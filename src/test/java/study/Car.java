package study;
/*
*
*
 */
class Car {
    // variable (클래스변수)
    public int year;
    private String make;
    protected double speed;

    // default construct (기본생성자)
    public Car(){
        this(0,"default",0);
    }

    // construct (생성자)
    public Car(int y,String m,double s){
        this.year = y;
        this.make = m;
        this.speed = s;
    }

    // method (메소드)
    public double getSpeed(){
        return this.speed;
    }
    public String getMake(){
        return this.make;
    }
    public int getYear(){
        return this.year;
    }

    public void accelerate(){
        this.speed+=1;
    }
}