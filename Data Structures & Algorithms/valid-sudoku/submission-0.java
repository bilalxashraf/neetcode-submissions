class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int row = 0; row<9; row++) {
            for (int col = 0; col<9; col++) {
                char num = board[row][col];
                if(num!= '.') {
                    if (!seen.add(num + "at row" + row) ||
                    !seen.add(num + "at col" + col) ||
                    !seen.add(num + "in block" + row/3 + "," + col/3))
                    return false;
                }
            }
        }
        return true;

    }
    
}
