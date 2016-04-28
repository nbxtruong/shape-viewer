package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;

public class Square implements Shape {
	private Rectangle delegate;

	public Square(Point2D p0, double size) {
		delegate = new Rectangle(p0, size, size);
	}

	public Point2D position() {
		return delegate.position();
	}

	public double size() {
		return delegate.height();
	}

	public double area() {
		return delegate.area();
	}

	public double perimeter() {
		return delegate.perimeter();
	}

	public void move(double dx, double dy) {
		delegate.move(dx, dy);
	}

	public void moveTo(Point2D newPosition) {
		delegate.moveTo(newPosition);
	}

	public String toString() {
		return "Square " + position() + ", size = " + size();
	}

	@Override
	public void redessiner(Graphics g) {
		g.setColor(Color.BLUE);
		g.drawRect((int) Math.round(delegate.position().getX()), (int) Math.round(delegate.position().getY()),
				(int) Math.round(size()), (int) Math.round(size()));
	}
}
