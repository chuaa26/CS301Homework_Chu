package edu.up.cs301homework;

public class DrawableElement {

    public enum ShapeType {
        CIRCLE, RECTANGLE
    }

    private String name;
    private float x, y;
    private int color;
    private ShapeType shapeType;
    private float radius;
    private float width, height;

    DrawableElement(String name, float x, float y, int color, float radius) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
        this.shapeType = ShapeType.CIRCLE;
        this.radius = radius;
    }

    public DrawableElement(String name, float x, float y, int color, float width, float height) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
        this.shapeType = ShapeType.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public ShapeType getShapeType() {
        return shapeType;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getRadius() {
        return radius;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    // Check if a circle was tapped
    public boolean isTapped(float touchX, float touchY) {
        if (shapeType == ShapeType.CIRCLE) {
            return Math.sqrt(Math.pow(touchX - x, 2) + Math.pow(touchY - y, 2)) <= radius;
        } else if (shapeType == ShapeType.RECTANGLE) {
            return touchX >= x && touchX <= x + width && touchY >= y && touchY <= y + height;
        }
        return false;
    }

    public DrawableElement(String name, float x, float y, int color) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
    }

}
