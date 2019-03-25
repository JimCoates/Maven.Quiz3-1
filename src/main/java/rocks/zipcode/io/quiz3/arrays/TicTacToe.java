package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    String [][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        ArrayList<String> row = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            row.add(getRow(i)[value]);
        }
        String[] answer = row.toArray(new String[row.size()]);
        return answer;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String [] test = getRow(rowIndex);
        return checkHomogenous(test);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String [] test = getColumn(columnIndex);
        return checkHomogenous(test);
    }

    private Boolean checkHomogenous(String[] test) {
        String mark1 = test[0];

        for (String mark: test) {
            if(mark1 != mark){
                return false;
            }
        }
        return true;
    }

    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            if (isColumnHomogeneous(i)) {
                return getWinningValueColumn(i);
            } else if (isRowHomogenous(i)) {
                return getWinningValueRow(i);
            }
        }
            if(checkDiagonalWinnerLR()){
                return getWinningValueRow(2);
            } else if(checkDiagonalWinnerRL()){
                return getWinningValueRow(1);
            }

        return null;
    }

    public String[][] getBoard() {
        return board;
    }

    public String getWinningValueRow(Integer index){
        String [] row = getRow(index);
        return  row[1];
    }

    public String getWinningValueColumn(Integer index){
        String [] column = getColumn(index);
        return column[1];
    }

    public Boolean checkDiagonalWinnerLR(){
        if(getRow(0)[0] == getRow(1)[1] && getRow(0)[0] == getRow(2)[2]){
            return true;
        }
        return false;
    }

    public Boolean checkDiagonalWinnerRL(){
        if(getRow(0)[2] == getRow(1)[1] && getRow(0)[2] == getRow(2)[0]){
            return true;
        }
        return false;
    }
}
