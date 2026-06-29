import java.util.*;
public class EventEntryVerificationSystem{
    HashSet<String> emails=new HashSet<>();
    void register(String e){
        if(emails.add(e)) System.out.println("Registered");
        else System.out.println("Duplicate Registration");
    }
    void display(){
        System.out.println("Participants:");
        for(String e:emails) System.out.println(e);
        System.out.println("Total: "+emails.size());
    }
    public static void main(String[] args){
        EventEntryVerificationSystem s=new EventEntryVerificationSystem();
        s.register("a@mail.com");
        s.register("b@mail.com");
        s.register("a@mail.com");
        s.display();
    }
}