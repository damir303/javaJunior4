package lesson10.matrix;

public class Matrix implements IMatrix {
    private double[][] arr;

    public Matrix() {
        this.arr = new double[DEFAULT_MATRIX_SIZE][DEFAULT_MATRIX_SIZE];
    }

    public Matrix(int rowIndex, int colIndex) {
        this.arr = new double[rowIndex][colIndex];
    }

    @Override
    public int getRows() {
        return this.arr.length;
    }

    @Override
    public int getColumns() {
        return this.arr[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        return this.arr[rowIndex][colIndex];
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        arr[rowIndex][colIndex] = value;
    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getRows() == otherMatrix.getRows()
                && this.getColumns() == otherMatrix.getColumns()) {
            Matrix res = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    res.setValueAt(i, j, (this.getValueAt(i, j) + otherMatrix.getValueAt(i, j)));
                }
            }
            return res;
        } else return null;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() == otherMatrix.getColumns() &&
                this.getRows() == otherMatrix.getRows()) {
            Matrix res = new Matrix(this.getRows(), this.getColumns());
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    res.setValueAt(i, j, (this.getValueAt(i, j) - otherMatrix.getValueAt(i, j)));
                }
            }

            return res;

        } else return null;


    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //�������
        Matrix res = new Matrix(this.getRows(), otherMatrix.getColumns());

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                for (int k = 0; k < otherMatrix.getColumns(); k++) {
                     res.setValueAt(i, j, (res.getValueAt(i, j)
                            + this.getValueAt(i, j)
                            * otherMatrix.getValueAt(k, j)));
                }
            }
        }
        return res;
    }

    @Override
    public IMatrix mul(double value) {

        Matrix res = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res.setValueAt(i, j, (this.getValueAt(i, j) * value));
            }
        }
        return res;
    }

    @Override
    public IMatrix transpose() {
        Matrix res = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res.setValueAt(j, i, arr[i][j]);
            }
        }
        return res;
    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                this.arr[i][j] = value;
            }
        }

    }

    @Override
    public double determinant() {
        return 0;
    }

    @Override
    public boolean isNullMatrix() {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0) {
                    c++;
                }
            }
        }

        return c == 0 ? true : false;

    }

    @Override
    public boolean isIdentityMatrix() {
        int diag = 0;
        int ostalnie = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    if (arr[i][j] != 1) {
                        diag++;
                    }
                } else {
                    if (arr[i][j] != 0) {
                        ostalnie++;
                    }
                }
            }
        }

        return diag == 0 && ostalnie == 0 ? true : false;
    }

    @Override
    public boolean isSquareMatrix() {
        return this.getColumns() == this.getRows();
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
