class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                // System.out.println(matrix[i][j] + " "+matrix[j][i]);
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        int stop=n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j>=stop) break;
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-j-1];
                matrix[i][m-j-1]=temp;
            }
        }
    }
}