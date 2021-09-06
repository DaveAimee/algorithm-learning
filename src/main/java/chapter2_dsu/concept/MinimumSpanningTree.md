### 最小生成树
#### Kruskal算法
1. 把图中的所有边按代价从小到大排序；
2. 把图中的$n$个顶点看成独立的$n$棵树组成的森林；
3. 按权值从小到大选择边，所选的边连接的两个顶点$u_i,v_i$应属于两颗不同的树，则成为最小生成树的一条边，并将这两颗树合并作为一颗树。
4. 重复(3),直到所有顶点都在一颗树内或者有n-1条边为止。

<img src="https://i.loli.net/2021/08/24/bHq9AEkz514WRsy.png" style="zoom: 33%;" />

<img src="https://i.loli.net/2021/08/24/8If5NCVWM71ukml.png" style="zoom: 33%;" />

#### Prim算法

1. 图中所有顶点的集合为$$V$$,初始令集合$U=\{s\},R=V-U$;
2. 在两个集合$U,R$能够组成的边中，选择一条代价最小的边$(u_0,r_0)$，并把$r_0$加入到集合$U$中。
3. 重复(2),直到所有顶点都在一颗树内或者有n-1条边为止。