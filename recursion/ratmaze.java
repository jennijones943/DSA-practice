import java.util.*;
class ratmaze{
    void rat(int[][] mat,int r,int c,List<String> ans,String path){
        int n=mat.length;
        if(r<0 || c<0 || r>=n || c>=n || mat[r][c]==0 || mat[r][c]==-1){
            return;
        }
        if(r==n-1 && c==n-1){
            ans.add(path);
            return;
        }
        mat[r][c]=-1;
        rat(mat,r+1,c,ans,path+'D');
        rat(mat,r,c+1,ans,path+'R');
        rat(mat,r-1,c,ans,path+'U');
        rat(mat,r,c-1,ans,path+'L');
        mat[r][c]=1;
    }

}
class oops{
    public static void main(String args[]){
        int[][] mat={
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        String path="";
        List<String> ans=new ArrayList<>();
        ratmaze obj=new ratmaze();
        obj.rat(mat,0,0,ans,path);
        System.out.println(ans);
    }
}