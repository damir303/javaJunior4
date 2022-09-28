package lesson10.matrix;

public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix(2,2);
        Matrix m1 = new Matrix(2,2);

        m.setValueAt(0,1,1);
        m.setValueAt(1,0,1);
        m.setValueAt(0,0,1);
        m.setValueAt(1,1,1);

        m1.setValueAt(0,0,2);
        m1.setValueAt(0,1,3);
        m1.setValueAt(1,0,4);
        m1.setValueAt(1,1,5);

        Matrix m3 = (Matrix) m.mul(m1);

        System.out.println(1);

//        Matrix m = new Matrix(2,3);
//        m.setValueAt(0,1,1);
//        m.setValueAt(1,0,1);
//        m.setValueAt(0,0,1);
//        m.setValueAt(1,1,1);
//
//        m.transpose();
//
//        System.out.println();
    }
}
