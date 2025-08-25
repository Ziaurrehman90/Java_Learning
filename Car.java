class Car{
    String Name;
    int Model;
    double Price;
    Car(String n,int m,double p){
        Name=n;
        Model=m;
    }
    Car(String n){
        Name=n;
    }
    Car(){
    }
    Car(String n,int m){
        Name=n;
    }

    public int getModel() {
        return Model;
    }

    public double getPrice() {
        return Price;
    }

    public void setName(String name) {
        Name = name;
    }
}