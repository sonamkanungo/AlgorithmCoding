package leetcode;

/**
 * Created by kanunso on 3/14/17.
 */
public class MatrixNode {

    public Integer row;

    public Integer column;

    public Integer value;

    public MatrixNode(Integer row, Integer column, Integer value) {
        this.row = row;
        this.column = column;
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
