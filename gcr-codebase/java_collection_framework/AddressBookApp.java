import java.util.*;
class Contact{
    String name,phone,email;
    Contact(String n,String p,String e){name=n;phone=p;email=e;}
}
public class AddressBookApp{
    ArrayList<Contact> contacts=new ArrayList<>();
    HashMap<String,Contact> map=new HashMap<>();
    HashSet<String> phones=new HashSet<>();
    void add(String n,String p,String e){
        if(!phones.add(p)){System.out.println("Duplicate phone!");return;}
        Contact c=new Contact(n,p,e);
        contacts.add(c); map.put(n,c);
    }
    void search(String n){
        Contact c=map.get(n);
        System.out.println(c==null?"Not Found":c.name+" "+c.phone+" "+c.email);
    }
    void delete(String n){
        Contact c=map.remove(n);
        if(c!=null){phones.remove(c.phone); contacts.remove(c);}
    }
    void display(){
        Collections.sort(contacts,Comparator.comparing(a->a.name));
        for(Contact c:contacts)
            System.out.println(c.name+" "+c.phone+" "+c.email);
    }
    public static void main(String[] args){
        AddressBookApp a=new AddressBookApp();
        a.add("Rahul","111","r@mail.com");
        a.add("Aman","222","a@mail.com");
        a.search("Rahul");
        a.display();
        a.delete("Rahul");
        a.display();
    }
}