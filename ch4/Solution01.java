public class Solution01
{
	public boolean routeBnodes(int[][] graph, int u, int v)
	{
		int length = graph.length;
		boolean[] isVisited = new boolean[length];
		// isVisited[u] = true;
		dfs(graph, isVisited, u);
		return isVisited[v];
	}

	void dfs(int[][] graph, boolean[] isVisited, int point)
	{
		isVisited[point] = true;
		for (int i = 0; i < graph.length; i++)
		{
			if (graph[point][i] > 0 && isVisited[i] == false)
			{
				dfs(graph, isVisited, i);
			}
		}
		return;
	}

}