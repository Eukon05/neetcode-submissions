class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] numsRow = new boolean[10];
        boolean[] numsCol = new boolean[10];
        boolean[] numsSq = new boolean[10];
        
        for(int i = 0; i < 9; i++){
            for(int x = 0; x < numsRow.length; x++){
                numsRow[x] = false; //reset zliczania
                numsCol[x] = false;
            }

            for(int j = 0; j < 9; j++){
                // WIERSZE
                if(board[i][j] != '.') {
                    if(numsRow[board[i][j] - '0'])
                        return false; // jak byl to nieprawidlowe sudoku
                    else
                        numsRow[board[i][j] - '0'] = true; //oznacz ze byl
                }

                // KOLUMNY
                if(board[j][i] != '.') {
                    if(numsCol[board[j][i] - '0'])
                        return false; // jak byl to nieprawidlowe sudoku
                    else
                        numsCol[board[j][i] - '0'] = true; //oznacz ze byl
                }
            }
        }

        // KWADRATY
        for(int i = 0; i < 9; i += 3){ //skacz po kwadratach pionowo (wiersze)
            for(int j = 0; j < 9; j += 3){ // skacz po kwadratach poziomo (kolumny)
                for(int z = 0; z < numsSq.length; z++)
                    numsSq[z] = false; //reset zliczania

                for(int x = i; x < i + 3; x++){
                    for(int y = j; y < j + 3; y++){
                        if(board[x][y] == '.')
                            continue;

                        if(numsSq[board[x][y] - '0'])
                            return false;
                        else
                            numsSq[board[x][y] - '0'] = true;
                    }
                }
            }
        }

        return true;
    }
}