import java.util.ArrayList;
import java.util.HashMap;

/**
 * Part of this code was copied from our book's solution, cuz I think it is too difficult for me
 * to solve this problem without the idea provided by our book.
 * I would update my own algorithm in the future.
 */


public class Solution07 {
	Project[] findBuildOrder(String[] projects, String[][] dependencies) {
		Graph graph = buildGraph(projects, dependencies);
		return orderProjects(graph.getNodes());
	}
		
	Project[] orderProjects(ArrayList<Project> projects) {
		Project[] order = new Project[projects.size()];
		
		int endOfList = addNonDependent(order, projects, 0);
		int toBeProcessed = 0;
		while(toBeProcessed < order.length) {
			Project current = order[toBeProcessed];
			
			if(current == null) {
				return null;
			}
			
			ArrayList<Project> children = current.getChildren();
			for(Project child : children) {
				child.decrementDependencies();
			}
			
			endOfList = addNonDependent(order, children, endOfList);
			toBeProcessed++;
		}
		return order;
	}

	Graph buildGraph(String[] projects, String[][] dependencies) {
		Graph graph = new Graph();
		for(String project : projects) {
			graph.getOrCreateNode(project);
		}
		
		for(String[] dependency : dependencies) {
			String first = dependency[0];
			String second = dependency[1];
			graph.addEdge(first,second);
		}
		
		return graph;
	}
	
	int addNonDependent(Project[] order, ArrayList<Project> projects, int offset) {
		for(Project project : projects) {
			if(project.getNumberDependencies() == 0) {
				order[offset] = project;
				offset++;
			}
		}
		return offset;
	}
	
	public class Project {
		private ArrayList<Project> children = new ArrayList<>();
		private HashMap<String, Project> map = new HashMap<>();
		private String name;
		private int dependencies = 0;
		
		public Project(String n) {name = n;}
		
		public void addNeighbor(Project node) {
			if(!map.containsKey(node.getName())) {
				children.add(node);
				node.incrementDependencies();
			}
		}
		
		public void incrementDependencies() {
			dependencies++;
		}
		
		public void decrementDependencies() {
			dependencies--;
		}
		
		public String getName() {
			return name;
		}
		
		public ArrayList<Project> getChildren() {
			return children;
		}
		
		public int getNumberDependencies() {
			return dependencies;
		}
	}

	class Graph {
		private ArrayList<Project> nodes = new ArrayList<>();
		private HashMap<String, Project> map = new HashMap<>();
		
		public Project getOrCreateNode(String name) {
			if(!map.containsKey(name)) {
				Project node = new Project(name);
				nodes.add(node);
			}
			return map.get(name);
		}
		
		public void addEdge(String startName, String endName) {
			Project start = getOrCreateNode(startName);
			Project end = getOrCreateNode(endName);
			
			start.addNeighbor(end);
		}
		
		public ArrayList<Project> getNodes() {return nodes;}
	}
	
	
}