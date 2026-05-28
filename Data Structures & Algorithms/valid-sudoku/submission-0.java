class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] numsRow = new boolean[10];
        boolean[] numsCol = new boolean[10];
        boolean[] numsSq = new boolean[10];
        
        for (int i = 0; i < 9; i++) {
            for (int x = 0; x < numsRow.length; x++) {
                numsRow[x] = false;
                numsCol[x] = false;
            }

            for (int j = 0; j < 9; j++) {
                // ROWS
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    if (numsRow[num]) return false;
                    numsRow[num] = true;
                }

                // COLUMNS
                if (board[j][i] != '.') {
                    int num = board[j][i] - '0';
                    if (numsCol[num]) return false;
                    numsCol[num] = true;
                }
            }
        }

        // 3x3 BOXES
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int z = 0; z < numsSq.length; z++) {
                    numsSq[z] = false;
                }

                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        if (board[x][y] != '.') {
                            int num = board[x][y] - '0';
                            if (numsSq[num]) return false;
                            numsSq[num] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
}