import java.util.*;
public class EmployeeAttendanceRanking {
    static class Employee{
        int id,attendance;
        Employee(int id,int attendance){
            this.id=id; this.attendance=attendance;
        }
    }
    public static int[] topKEmployees(int[] employeeIds,int[] attendance,int k){
        Employee[] arr=new Employee[employeeIds.length];
        for(int i=0;i<employeeIds.length;i++)
            arr[i]=new Employee(employeeIds[i],attendance[i]);
        Arrays.sort(arr,(a,b)->{
            if(b.attendance!=a.attendance)
                return b.attendance-a.attendance;
            return a.id-b.id;
        });
        int[] ans=new int[k];
        for(int i=0;i<k;i++) ans[i]=arr[i].id;
        return ans;
    }
    public static void main(String[] args){
        int[] employeeIds={101,102,103,104,105};
        int[] attendance={92,85,98,92,80};
        int k=3;
        int[] result=topKEmployees(employeeIds,attendance,k);
        System.out.println(Arrays.toString(result));
    }
}