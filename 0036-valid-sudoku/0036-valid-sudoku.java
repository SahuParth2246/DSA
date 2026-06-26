class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet <Character> set1 = new HashSet<>();
        HashSet <Character> set2 = new HashSet<>();
        for(int i = 0;i<9;i++){
            for(int j= 0;j<9;j++){
                //for rows
                if(set1.contains(board[i][j])&&board[i][j]!='.')return false;
                set1.add(board[i][j]);
                //for colums
                if(set2.contains(board[j][i])&&board[j][i]!='.')return false;
                set2.add(board[j][i]);
            }
            set1.clear();
            set2.clear();
        }
        for(int i = 0;i<9;i+=3){
            for(int j= 0;j<9;j+=3){
                int k = 0;
                int p = 0;
                while(k<3){
                    while(p<3){
                        if(set1.contains(board[i+k][j+p])&&board[i+k][j+p]!='.')return false;
                        set1.add(board[i+k][j+p]);
                        p++;
                    }
                    k++;
                    p=0;
                }
                set1.clear();

                
            }
        }

        return true;
    }
    
}