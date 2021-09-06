package chapter15_shortest_path.concept;

import java.util.ArrayList;
import java.util.Arrays;


public class NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        //邻接表结构
        ArrayList<int[]>[] adj = new ArrayList[n+1];
        for(int i=0;i<adj.length;i++) {
            adj[i] = new ArrayList<>();
        }
        //建立邻接表
        for(int[] time: times) {
            adj[time[0]].add(new int[] {time[1],time[2]});
        }
        int[] distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        //初始化distance
        distance[k]=0;
        for(int[] edge:adj[k]) {
            distance[edge[0]] = edge[1];
        }
        boolean[] visited = new boolean[n+1];
        visited[k] = true;
        int repeatTimes = n+1;
        while(repeatTimes-->0) {
            int min_node = -1;
            int min_weight = Integer.MAX_VALUE;
            for(int i=0;i<distance.length;i++) {
                if(!visited[i] && distance[i] < min_weight && distance[i]!=Integer.MAX_VALUE) {
                    min_weight=distance[i];
                    min_node=i;
                }
            }
            if(min_node==-1) {
                break;
            }
            visited[min_node]=true;
            for(int [] edge: adj[min_node]) {
                if(min_weight+edge[1] < distance[edge[0]]) {
                    distance[edge[0]]=min_weight+edge[1];
                }
            }
        }
        int maxDistance = Integer.MIN_VALUE;
        for(int i=1;i<distance.length;i++) {
            if(distance[i]==Integer.MAX_VALUE) {
                return -1;
            }
            if(maxDistance<distance[i] && i!=k) {
                maxDistance=distance[i];
            }
        }
        return maxDistance;
    }
}
