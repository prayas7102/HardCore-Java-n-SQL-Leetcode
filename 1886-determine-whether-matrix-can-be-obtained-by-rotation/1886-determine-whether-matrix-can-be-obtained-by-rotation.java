class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean[] v = new boolean[4];
        Arrays.fill(v, true);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                // System.out.print(mat[i][j]+ " ");
                // System.out.print(target[i][j]+ " ");
                // System.out.print(target[mat.length - j - 1][i]+ " ");
                // System.out.print(target[j][mat.length - i - 1]+ " ");
                // System.out.println(target[mat.length - i - 1][mat.length - j - 1]);
                
                if (mat[i][j] != target[i][j]) {
                    v[0]=(false);
                }
                if (mat[i][j] != target[mat.length - j - 1][i]) {
                    v[1]=(false);
                }
                if (mat[i][j] != target[mat.length - i - 1][mat.length - j - 1]) {
                    v[2]=(false);
                }
                if (mat[i][j] != target[j][mat.length - i - 1]) {
                    v[3]=(false);
                }
            }
        }
        return v[0] || v[1] || v[2] || v[3];
    }
}


