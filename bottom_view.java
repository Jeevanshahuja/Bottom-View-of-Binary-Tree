class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        Queue <Node> q = new LinkedList<>();
        Queue <Integer> hd = new LinkedList<>();
        q.add(root);
        hd.add(0);
        while(!q.isEmpty()){
            Node node = q.poll();
            int currhd=hd.poll();
            map.put(currhd,node.data);
            if(node.left!=null){
                q.add(node.left);
                hd.add(currhd-1);
            }
            if(node.right!=null){
                q.add(node.right);
                hd.add(currhd+1);
            }
        }
        for(int value : map.values()){
            ans.add(value);
        }
        return ans;
    }
}
