import java.util.*;
public class Scenario4Connectivity{
int countNetworkSegments(Map<Integer,List<Integer>> network,int n){
Set<Integer> vis=new HashSet<>();
int seg=0;
for(int i=0;i<n;i++) if(!vis.contains(i)){seg++; dfs(network,i,vis);}
return seg;
}
void dfs(Map<Integer,List<Integer>> g,int node,Set<Integer> vis){
vis.add(node);
for(int nei:g.getOrDefault(node,Collections.emptyList()))
if(!vis.contains(nei)) dfs(g,nei,vis);
}
}