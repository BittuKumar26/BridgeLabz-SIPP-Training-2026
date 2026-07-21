import java.util.*;
class LogEntry{
    int timestamp;
    String message;
    LogEntry(int timestamp,String message){
        this.timestamp=timestamp;
        this.message=message;
    }
}
public class Scenario6MergeKSortedLogs{
    List<LogEntry> mergeKSortedLogs(List<List<LogEntry>> sources){
        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a,b)->
            sources.get(a[0]).get(a[1]).timestamp-
            sources.get(b[0]).get(b[1]).timestamp);
        for(int i=0;i<sources.size();i++)
            if(!sources.get(i).isEmpty())
                minHeap.offer(new int[]{i,0});
        List<LogEntry> merged=new ArrayList<>();
        while(!minHeap.isEmpty()){
            int[] top=minHeap.poll();
            int s=top[0],e=top[1];
            merged.add(sources.get(s).get(e));
            if(e+1<sources.get(s).size())
                minHeap.offer(new int[]{s,e+1});
        }
        return merged;
    }
}
