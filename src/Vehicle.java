//import com.sun.xml.internal.ws.api.pipe.Engine;

public abstract class Vehicle {
    String ID_plate;
    String Brand;
    String time;
    String date;

    abstract void getInfo(String a,String b,String c,String d);

    public void printInfo(){
        System.out.println("Vehicle ID "+this.ID_plate+"\nBrand "+this.Brand);
    }

}

class Car extends Vehicle{
    int DoorNos;
    String color;
    @Override
    void getInfo(String ID_plate,String Brand,String time,String date) {
        super.ID_plate=ID_plate;
        super.Brand=Brand;
        super.time=time;
        super.date=date;
    }

    public void getCarInfo(int DoorNos,String color){
        this.DoorNos=DoorNos;
        this.color=color;
    }

}

 class Van extends Vehicle{
     int CargoVolume;
     //String color;
     @Override
     void getInfo(String ID_plate,String Brand,String time,String date) {
         super.ID_plate=ID_plate;
         super.Brand=Brand;
         super.time=time;
         super.date=date;
     }

     public void getVanInfo(int CargoVolume){
         this.CargoVolume=CargoVolume;
         //this.color=color;
     }

 }

 class MotorBike extends Vehicle{
     int EngineCapacity;
     //String color;
     @Override
     void getInfo(String ID_plate,String Brand,String time,String date) {
         super.ID_plate=ID_plate;
         super.Brand=Brand;
         super.time=time;
         super.date=date;
     }

     public void geMotorBikeInfo(int EngineCapacity){
         this.EngineCapacity=EngineCapacity;
         //this.color=color;
     }

 }
