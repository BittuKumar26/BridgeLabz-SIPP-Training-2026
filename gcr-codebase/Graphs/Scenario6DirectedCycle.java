import java.util.*;
public class Scenario6DirectedCycle{
boolean hasCircularDependency(Map<Integer,List<Integer>> tasks,int n){
int[] state=new int[n];
for(int i=0;i<n;i++) if(state[i]==0&&dfs(tasks,i,state)) return true;
return false;
}
boolean dfs(Map<Integer,List<Integer>> tasks,int node,int[] state){
state[node]=1;
for(int dep:tasks.getOrDefault(node,Collections.emptyList())){
if(state[dep]==1) return true;
if(state[dep]==0&&dfs(tasks,dep,state)) return true;
}
state[node]=2;
return false;
}
}