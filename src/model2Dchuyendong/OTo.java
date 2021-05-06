/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model2Dchuyendong;

import biendoi2D.DoiXungQuaDoanThang;
import java.awt.Color;
import java.awt.Graphics2D;
import model2D.Diem2D;
import model2D.DoanThang;
import model2D.DuongTron;

/**
 *
 * @author Admin
 */
public class OTo {

    private Diem2D A; //Điểm tâm của bánh xe bên trái
    private int r; //Bán kính của bánh xe
    private Diem2D A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21; //Các điểm cơ bản của xe ô tô

    public OTo() {
    }

    public OTo(Diem2D A, int r) {
        this.A = A;
        this.r = r;
        Diem2D trucA = new Diem2D(A.getX() + 3 * r, A.getY());
        Diem2D trucB = new Diem2D(A.getX() + 3 * r, A.getY() + 5 * r);
        this.A1 = new Diem2D(A.getX() - 3 * r, A.getY());
        this.A2 = new Diem2D(A.getX() - r, A.getY());
        this.A3 = new Diem2D(A.getX() + r, A.getY());
        this.A4 = DoiXungQuaDoanThang.layDoiXung(A3, trucA, trucB);
        this.A5 = DoiXungQuaDoanThang.layDoiXung(A, trucA, trucB);
        this.A6 = DoiXungQuaDoanThang.layDoiXung(A2, trucA, trucB);
        this.A7 = DoiXungQuaDoanThang.layDoiXung(A1, trucA, trucB);
        this.A11 = new Diem2D(A.getX() + r, A.getY() + r * 9 / 2);
        this.A10 = DoiXungQuaDoanThang.layDoiXung(A11, trucA, trucB);
        this.A12 = new Diem2D(A.getX(), A.getY() + r * 5 / 2);
        this.A9 = DoiXungQuaDoanThang.layDoiXung(A12, trucA, trucB);
        this.A13 = new Diem2D(A.getX() - 3 * r, A.getY() + 2 * r);
        this.A8 = DoiXungQuaDoanThang.layDoiXung(A13, trucA, trucB);
        this.A14 = new Diem2D(A.getX() + 2, A.getY() + r * 5 / 2);
        this.A15 = new Diem2D(A.getX() + r + 1, A.getY() + r * 9 / 2 - 2);
        this.A16 = new Diem2D(A.getX() + 3 * r - 1, A.getY() + r * 9 / 2 - 2);
        this.A17 = new Diem2D(A.getX() + 3 * r - 1, A.getY() + r * 5 / 2);
        this.A18 = DoiXungQuaDoanThang.layDoiXung(A17, trucA, trucB);
        this.A19 = DoiXungQuaDoanThang.layDoiXung(A16, trucA, trucB);
        this.A20 = DoiXungQuaDoanThang.layDoiXung(A15, trucA, trucB);
        this.A21 = DoiXungQuaDoanThang.layDoiXung(A14, trucA, trucB);
    }

    public void setA(Diem2D A) {
        this.A = A;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setA1(Diem2D A1) {
        this.A1 = A1;
    }

    public void setA2(Diem2D A2) {
        this.A2 = A2;
    }

    public void setA3(Diem2D A3) {
        this.A3 = A3;
    }

    public void setA4(Diem2D A4) {
        this.A4 = A4;
    }

    public void setA5(Diem2D A5) {
        this.A5 = A5;
    }

    public void setA6(Diem2D A6) {
        this.A6 = A6;
    }

    public void setA7(Diem2D A7) {
        this.A7 = A7;
    }

    public void setA8(Diem2D A8) {
        this.A8 = A8;
    }

    public void setA9(Diem2D A9) {
        this.A9 = A9;
    }

    public void setA10(Diem2D A10) {
        this.A10 = A10;
    }

    public void setA11(Diem2D A11) {
        this.A11 = A11;
    }

    public void setA12(Diem2D A12) {
        this.A12 = A12;
    }

    public void setA13(Diem2D A13) {
        this.A13 = A13;
    }

    public void setA14(Diem2D A14) {
        this.A14 = A14;
    }

    public void setA15(Diem2D A15) {
        this.A15 = A15;
    }

    public void setA16(Diem2D A16) {
        this.A16 = A16;
    }

    public void setA17(Diem2D A17) {
        this.A17 = A17;
    }

    public void setA18(Diem2D A18) {
        this.A18 = A18;
    }

    public void setA19(Diem2D A19) {
        this.A19 = A19;
    }

    public void setA20(Diem2D A20) {
        this.A20 = A20;
    }

    public void setA21(Diem2D A21) {
        this.A21 = A21;
    }

    public Diem2D getA() {
        return A;
    }

    public int getR() {
        return r;
    }

    public Diem2D getA1() {
        return A1;
    }

    public Diem2D getA2() {
        return A2;
    }

    public Diem2D getA3() {
        return A3;
    }

    public Diem2D getA4() {
        return A4;
    }

    public Diem2D getA5() {
        return A5;
    }

    public Diem2D getA6() {
        return A6;
    }

    public Diem2D getA7() {
        return A7;
    }

    public Diem2D getA8() {
        return A8;
    }

    public Diem2D getA9() {
        return A9;
    }

    public Diem2D getA10() {
        return A10;
    }

    public Diem2D getA11() {
        return A11;
    }

    public Diem2D getA12() {
        return A12;
    }

    public Diem2D getA13() {
        return A13;
    }

    public Diem2D getA14() {
        return A14;
    }

    public Diem2D getA15() {
        return A15;
    }

    public Diem2D getA16() {
        return A16;
    }

    public Diem2D getA17() {
        return A17;
    }

    public Diem2D getA18() {
        return A18;
    }

    public Diem2D getA19() {
        return A19;
    }

    public Diem2D getA20() {
        return A20;
    }

    public Diem2D getA21() {
        return A21;
    }

    public void draw(Graphics2D g) {
        DuongTron banhTraiL = new DuongTron(A.getX(), A.getY(), r);
        banhTraiL.drawLien1(g);
        DuongTron banhTraiN = new DuongTron(A.getX(), A.getY(), r * 3 / 5);
        banhTraiN.drawLien1(g);

        DuongTron banhPhaiL = new DuongTron(A5.getX(), A5.getY(), r);
        banhPhaiL.drawLien1(g);
        DuongTron banhPhaiN = new DuongTron(A5.getX(), A5.getY(), r * 3 / 5);
        banhPhaiN.drawLien1(g);

        DoanThang A1A2 = new DoanThang(A1.getX(), A1.getY(), A2.getX(), A2.getY());
        A1A2.draw1(g);

        DoanThang A3A4 = new DoanThang(A3.getX(), A3.getY(), A4.getX(), A4.getY());
        A3A4.draw1(g);

        DoanThang A6A7 = new DoanThang(A6.getX(), A6.getY(), A7.getX(), A7.getY());
        A6A7.draw1(g);

        DoanThang A7A8 = new DoanThang(A7.getX(), A7.getY(), A8.getX(), A8.getY());
        A7A8.draw1(g);

        DoanThang A8A9 = new DoanThang(A8.getX(), A8.getY(), A9.getX(), A9.getY());
        A8A9.draw1(g);

        DoanThang A9A10 = new DoanThang(A9.getX(), A9.getY(), A10.getX(), A10.getY());
        A9A10.draw1(g);

        DoanThang A10A11 = new DoanThang(A10.getX(), A10.getY(), A11.getX(), A11.getY());
        A10A11.draw1(g);

        DoanThang A11A12 = new DoanThang(A11.getX(), A11.getY(), A12.getX(), A12.getY());
        A11A12.draw1(g);

        DoanThang A12A13 = new DoanThang(A12.getX(), A12.getY(), A13.getX(), A13.getY());
        A12A13.draw1(g);

        DoanThang A13A1 = new DoanThang(A13.getX(), A13.getY(), A1.getX(), A1.getY());
        A13A1.draw1(g);

        DoanThang A14A15 = new DoanThang(A14.getX(), A14.getY(), A15.getX(), A15.getY());
        A14A15.draw1(g);

        DoanThang A15A16 = new DoanThang(A15.getX(), A15.getY(), A16.getX(), A16.getY());
        A15A16.draw1(g);

        DoanThang A16A17 = new DoanThang(A16.getX(), A16.getY(), A17.getX(), A17.getY());
        A16A17.draw1(g);

        DoanThang A17A14 = new DoanThang(A17.getX(), A17.getY(), A14.getX(), A14.getY());
        A17A14.draw1(g);

        DoanThang A19A20 = new DoanThang(A19.getX(), A19.getY(), A20.getX(), A20.getY());
        A19A20.draw1(g);

        DoanThang A20A21 = new DoanThang(A20.getX(), A20.getY(), A21.getX(), A21.getY());
        A20A21.draw1(g);

        DoanThang A21A18 = new DoanThang(A21.getX(), A21.getY(), A18.getX(), A18.getY());
        A21A18.draw1(g);

        DoanThang A18A19 = new DoanThang(A18.getX(), A18.getY(), A19.getX(), A19.getY());
        A18A19.draw1(g);

        //Tô màu khung lớn phía dưới
        g.setColor(Color.BLUE);
        int x1[] = {700 / 2 + A1.getX() * 5, 700 / 2 + A7.getX() * 5, 700 / 2 + A8.getX() * 5, 700 / 2 + A9.getX() * 5, 700 / 2 + A12.getX() * 5, 700 / 2 + A13.getX() * 5};
        int y1[] = {500 / 2 - A1.getY() * 5, 500 / 2 - A7.getY() * 5, 500 / 2 - A8.getY() * 5, 500 / 2 - A9.getY() * 5, 500 / 2 - A12.getY() * 5, 500 / 2 - A13.getY() * 5};
        g.fillPolygon(x1, y1, 6);
        //Tô màu khung lớn phía trên
        int x2[] = {700 / 2 + A9.getX() * 5, 700 / 2 + A10.getX() * 5, 700 / 2 + A11.getX() * 5, 700 / 2 + A12.getX() * 5};
        int y2[] = {500 / 2 - A9.getY() * 5, 500 / 2 - A10.getY() * 5, 500 / 2 - A11.getY() * 5, 500 / 2 - A12.getY() * 5};
        g.fillPolygon(x2, y2, 4);

        //Tô màu hai cửa sổ
        g.setColor(Color.white);
        int x3[] = {700 / 2 + A14.getX() * 5, 700 / 2 + A15.getX() * 5, 700 / 2 + A16.getX() * 5, 700 / 2 + A17.getX() * 5};
        int y3[] = {500 / 2 - A14.getY() * 5, 500 / 2 - A15.getY() * 5, 500 / 2 - A16.getY() * 5, 500 / 2 - A17.getY() * 5};
        g.fillPolygon(x3, y3, 4);
        int x4[] = {700 / 2 + A18.getX() * 5, 700 / 2 + A19.getX() * 5, 700 / 2 + A20.getX() * 5, 700 / 2 + A21.getX() * 5};
        int y4[] = {500 / 2 - A18.getY() * 5, 500 / 2 - A19.getY() * 5, 500 / 2 - A20.getY() * 5, 500 / 2 - A21.getY() * 5};
        g.fillPolygon(x4, y4, 4);

        //Tô màu hai hình tròn lớn
        g.setColor(Color.DARK_GRAY);
        g.fillOval(700 / 2 + (A.getX() - r) * 5, 500 / 2 - (A.getY() + r) * 5, r * 2 * 5, r * 2 * 5);
        g.fillOval(700 / 2 + (A5.getX() - r) * 5, 500 / 2 - (A5.getY() + r) * 5, r * 2 * 5, r * 2 * 5);

        //Tô màu hai hình tròn nhỏ
        g.setColor(Color.white);
        g.fillOval(700 / 2 + (A.getX() - r * 3 / 5) * 5, 500 / 2 - (A.getY() + r * 3 / 5) * 5, r * 3 / 5 * 2 * 5, r * 3 / 5 * 2 * 5);
        g.fillOval(700 / 2 + (A5.getX() - r * 3 / 5) * 5, 500 / 2 - (A5.getY() + r * 3 / 5) * 5, r * 3 / 5 * 2 * 5, r * 3 / 5 * 2 * 5);
    }
}