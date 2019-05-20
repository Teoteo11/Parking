import java.time.LocalDateTime;
import java.util.ArrayList;


public class Parking extends Vehicle {

    private int totalOfSpaces=50;
    private int numOfVehicles=0;
    private ArrayList<Vehicle> vehicles;

    public Parking(String numberPlate, String typology, LocalDateTime start, LocalDateTime end) {
        super(numberPlate, typology, start, end);
        this.vehicles=new ArrayList<>();
    }

    public String addVehicle(Vehicle v){
        if(numOfVehicles==totalOfSpaces) return "Parking is full,please come back later";
        else
            if(getTypology()=="Auto"){
                this.vehicles.add(v);
                this.numOfVehicles++;
            }
            if(getTypology()=="Autotreno"){
                for(int i=0;i<3;i++){
                    this.vehicles.add(v);
                    this.numOfVehicles++;
                }
            }
            return "Insert correct typology of vehicles for this parking.";
    }

    public boolean removeVehicle (Vehicle licensePlate, LocalDateTime end) {
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle v = vehicles.get(i);
            if (licensePlate.equals(v.getNumberPlate()) ){
                this.vehicles.remove(i);
                if (getTypology()== "Auto") this.totalOfSpaces--;
                if (getTypology()=="Tir") {
                    for (int j = 0; j < 3; j++) this.totalOfSpaces--;
                }
                return true;
            }
        }
        return false;
    }

    public double getPrice(Vehicle vehicle) {
        double price;
        int hours = vehicle.getEnd().getHour() - vehicle.getStart().getHour();
        int minutes = (hours * 60) + vehicle.getEnd().getMinute() - vehicle.getEnd().getMinute();
        System.out.println(hours + " " + minutes);
        if (minutes < 120) {
            price = minutes * 0.01;
        } else if (minutes >= 120 && minutes <= 420) {
            price = 2 + (minutes * 0.01);
        } else {
            price = 6;
        }
        return price;
    }








}
