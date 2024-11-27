public class Car {
 String companyName;
 String modelName;
 String fuelType;
 String colour;
 int sittingCap;
 int maxSpeed;
 Car(String Comp,String Mod,String F,String clr,int sc,int ms){
   companyName=Comp;
   modelName=Mod;
   fuelType=F;
   colour=clr;
   sittingCap=sc;
   maxSpeed=ms;
 }
 
 public void start(){
    System.out.println("car started....");
 }
 public void drive(){
    System.out.println("car is in driving mode....");
 }
 public void breaks(){
    System.out.println("break applied....");
 }
public void stop(){
    System.out.println("car stopped....");
}
public static void main(String arg[]){
    Car myCar1= new Car("Tata","Rangerover","CNG","Black",5,200);
    myCar1.companyName="Tata";
    myCar1.modelName="Rangerover";
    myCar1.fuelType="CNG";
    myCar1.colour="Black";
    myCar1.sittingCap=5;
    myCar1.maxSpeed=200;

    myCar1.start();
    myCar1.drive();
    myCar1.breaks();
    myCar1.stop();

} 
}