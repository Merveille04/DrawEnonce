
import java.awt.Graphics2D;
import java.awt.Point;
import static java.util.Collections.list;
import java.util.List;
import simpledraw.Circle;
import simpledraw.Line;
import simpledraw.Shape;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Merveille Divine
 */
public class Group extends Shape {

    List<Shape> listShape;

    @Override
    public void draw(Graphics2D g) {
        for (Shape s: listShape)
        {
            s.draw(g);
        }
    }

    @Override
    public void translateBy(int dx, int dy) {
        for (Shape s : listShape) {
            s.translateBy(dx, dy);
        }

    }

    @Override
    public boolean isPickedBy(Point p) {
        int i;
        for (Shape s : listShape) {
            if (s.isPickedBy(p)) {
                return true;
            }
        }
        return false;
    }

    public Group(List<Shape> listShape) {
        this.listShape = listShape;
    }

    /**
     *
     * @param shape
     */
    public void addShape(Shape shape) {
        listShape.add(shape);
    }

    public void deleteShape(Shape shape) {
        listShape.remove(shape);
    }

}
