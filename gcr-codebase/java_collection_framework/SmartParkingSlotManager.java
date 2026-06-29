import java.util.*;
public class SmartParkingSlotManager{
    ArrayList<String> vehicles=new ArrayList<>();
    void enter(String v){vehicles.add(v);}
    void exit(String v){vehicles.remove(v);}
    void search(String v){System.out.println(vehicles.contains(v)?"Parked":"Not Parked");}
    void display(){
        System.out.println("Vehicles: "+vehicles);
        System.out.println("Occupied Slots: "+vehicles.size());
    }
    public static void main(String[] args){
        SmartParkingSlotManager p=new SmartParkingSlotManager();
        p.enter("UP32AB1234"); p.enter("DL01XY5678");
        p.search("UP32AB1234");
        p.display();
        p.exit("UP32AB1234");
        p.display();
    }
}