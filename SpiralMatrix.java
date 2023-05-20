// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {

//         ArrayList<Integer> list = new ArrayList<>();

//         int start_row = 0;
//         int end_row = matrix.length-1;
//         int start_col = 0;
//         int end_col = matrix[0].length-1;

//         while(start_row <= end_row && start_col <= end_col){

//             //print top 
//             for(int j=start_col; j<=end_col; j++){
//                 list.add(matrix[start_row][j]);
//             }

//             //print right
//             for(int i=start_row+1 ; i<=end_row; i++){
//                 list.add(matrix[i][end_col]);
//             }

//             //bottom
//             for(int j=end_col-1; j>= start_col; j--){
//                 list.add(matrix[end_row][j]);
//             }

//             //left side
//             for(int i=end_row-1; i>=start_row+1; i--){
//                 list.add(matrix[i][start_col]);
//             }
//         }
//         return list;

//         //TLE
//     }
// }

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int left = 0, right = matrix[0].length-1, top = 0, bottom = matrix.length-1;

        while(left <= right && top <= bottom){
            for(int i = left; i <= right; i++){
                res.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }

        return res;
    }
}
