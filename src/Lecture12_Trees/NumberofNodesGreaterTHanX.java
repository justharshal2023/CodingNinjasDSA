package Lecture12_Trees;
import java.util.*;
public class NumberofNodesGreaterTHanX {
    static int sum=0;

    public static int sumOfAllNode(TreeNode<Integer> root){

        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty())
        {
            TreeNode<Integer> frontNode = queue.remove();
            if(frontNode == null){
                if(queue.isEmpty()){
                    break;
                }

                queue.add(null);
            }
            else{
                sum+=frontNode.data;
                for(int i=0;i<frontNode.children.size();i++){
                    queue.add(frontNode.children.get(i));
                }
            }

        }

        return sum;
    }
}
