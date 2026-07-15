import java.util.*;
public class SmartClassroomAttendanceTracker{
    HashMap<String,ArrayList<String>> map=new HashMap<>();
    void mark(String subject,String student){
        map.putIfAbsent(subject,new ArrayList<>());
        ArrayList<String> list=map.get(subject);
        if(!list.contains(student)) list.add(student);
        else System.out.println("Duplicate attendance for "+student);
    }
    void display(){
        for(String s:map.keySet()){
            System.out.println(s+" -> "+map.get(s));
            System.out.println("Total: "+map.get(s).size());
        }
    }
    public static void main(String[] args){
        SmartClassroomAttendanceTracker t=new SmartClassroomAttendanceTracker();
        t.mark("Java","Aman");
        t.mark("Java","Rahul");
        t.mark("Java","Aman");
        t.mark("DBMS","Aman");
        t.display();
    }
}