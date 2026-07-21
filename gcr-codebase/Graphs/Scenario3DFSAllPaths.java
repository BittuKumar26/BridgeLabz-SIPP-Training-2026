import java.util.*;
public class Scenario3DFSAllPaths{
void allRoutes(Map<Integer,List<Integer>> roads,int current,int target,List<Integer> path,Set<Integer> visited,List<List<Integer>> all){
path.add(current); visited.add(current);
if(current==target) all.add(new ArrayList<>(path));
else{
for(int next:roads.getOrDefault(current,Collections.emptyList()))
if(!visited.contains(next)) allRoutes(roads,next,target,path,visited,all);
}
path.remove(path.size()-1);
visited.remove(current);
}
}