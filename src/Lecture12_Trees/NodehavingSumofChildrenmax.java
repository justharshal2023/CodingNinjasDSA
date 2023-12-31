package Lecture12_Trees;

public class NodehavingSumofChildrenmax {
    public static TreeNode<Integer> ans;
    public static int max=0;
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        if(root.children.size()==0){
            return root;
        }
        int sum=root.data;
        for(int i=0;i<root.children.size();i++){
            sum+=root.children.get(i).data;
        }
        if(sum>max){
            max=sum;
            ans=root;
        }
        for(int i=0;i<root.children.size();i++){
            TreeNode<Integer> temp=maxSumNode(root.children.get(i));
            if(temp.data>max){
                max=temp.data;
                ans=root.children.get(i);
            }
        }
        return ans;
    }


}
