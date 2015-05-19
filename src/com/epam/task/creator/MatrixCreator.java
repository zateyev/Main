package com.epam.task.creator;
import com.epam.task.entity.Matrix;
import com.epam.task.exceptions.MatrixException;
public class MatrixCreator {
    public static void fillRandomized(Matrix t, int start, int end) {
        int v = t.getVerticalSize();
        int h = t.getHorizontalSize();
        for(int i = 0; i < v; i++) {
            for(int j = 0; j < h; j++) {
                try {
                    int value = (int)(Math.random() * (end - start) + start);
                    t.setElement(i, j, value);
                } catch (MatrixException e) {
/* � ������ ������ exception ����������, ������� ��������� ����������� */
                }
            }
        }
    }
// public void fillFromFile(Matrix t, File f) { /* ���*/ }
// public void fillFromStream(Matrix t, InputStream input) { /* ���*/ }
// public void fillFromDataBase(Matrix t, Connection conn) { /* ���*/ }
}