package com.epam.task.action;
import com.epam.task.entity.Matrix;
import com.epam.task.exceptions.MatrixException;
public class Multiplicator {
    public Matrix multiply(Matrix p, Matrix q) throws MatrixException {
        int v = p.getVerticalSize();
        int h = q.getHorizontalSize();
        int temp = p.getHorizontalSize();
// �������� ����������� ���������
        if (temp != q.getVerticalSize()) {
            throw new MatrixException(); // Incompatible matrices
        }
// �������� ������� ����������
        Matrix result = new Matrix(v, h);
        try {
// ���������
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < h; j++) {
                    int value = 0;
                    for (int k = 0; k < temp; k++) {
                        value += p.getElement(i, k) * q.getElement(k, j);
                    }
                    result.setElement(i, j, value);
                }
            }
        } catch (MatrixException e) {
// exception ���������� �� ������ ����,
// ������� ��������� �������
        }
        return result;
    }
}