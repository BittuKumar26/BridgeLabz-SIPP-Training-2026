import java.util.*;
public class Scenario5UndirectedCycle{
boolean hasWiringLoop(Map<Integer,List<Integer>> g,int n){
Set<Integer> vis=new HashSet<>();
for(int i=0;i<n;i++) if(!vis.contains(i)&&dfs(g,i,-1,vis)) return true;
return false;
}
boolean dfs(Map<Integer,List<Integer>> g,int node,int parent,Set<Integer> vis){
vis.add(node);
for(int nei:g.getOrDefault(node,Collections.emptyList())){
if(!vis.contains(nei)){ if(dfs(g,nei,node,vis)) return true; }
else if(nei!=parent) return true;
}
return false;
}
}