import java.util.*;

public class CS1 {
    public static void main(String[] args){
        CS1 cs = new CS1();
        int numCourses=4;
        int prerequisites[][] = {{1,0},{2,1},{3,2}};
        cs.canFinish(numCourses,prerequisites);

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses == 0 || prerequisites.length == 0) return true;

        // Convert graph presentation from edges to indegree of adjacent list.
        int indegree[] = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++){
            int p =prerequisites[i][0];
            indegree[p]++;
            // Indegree - how many prerequisites are needed.
        }


        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < numCourses; i++)
            if (indegree[i] == 0)
                queue.add(i);

        // How many courses don't need prerequisites.
        int canFinishCount = queue.size();
        while (!queue.isEmpty()) {
            int prerequisite = queue.remove(); // Already finished this prerequisite course.
            for (int i = 0; i < prerequisites.length; i++)  {
                if (prerequisites[i][1] == prerequisite) {
                    indegree[prerequisites[i][0]]--;
                    if (indegree[prerequisites[i][0]] == 0) {
                        canFinishCount++;
                        queue.add(prerequisites[i][0]);
                    }
                }
            }
        }

        return (canFinishCount == numCourses);
    }
}
