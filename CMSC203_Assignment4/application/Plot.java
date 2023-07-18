/*
 * Class: CMSC203 
 * Instructor: Professor Farnaz
 * Description: (Plot class that manages the actual space taken by a property )
 * Due: 07/17/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Remy Tran
*/

package application;

public class Plot {
	
	// private variables
    private int x;
    private int y;
    private int width;
    private int depth;

    // Constructor
    public Plot() {
        this(0, 0, 1, 1);
    }

    public Plot(int x, int y, int width, int depth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.depth = depth;
    }

    public Plot(Plot otherPlot) {
        this.x = otherPlot.x;
        this.y = otherPlot.y;
        this.width = otherPlot.width;
        this.depth = otherPlot.depth;
    }

    // Methods
    public boolean overlaps(Plot plot) {
        int x2 = plot.x;
        int y2 = plot.y;
        int width2 = plot.width;
        int depth2 = plot.depth;

        return (x < x2 + width2 && x + width > x2 && y < y2 + depth2 && y + depth > y2);
    }

    public boolean encompasses(Plot plot) {
        int x2 = plot.x;
        int y2 = plot.y;
        int width2 = plot.width;
        int depth2 = plot.depth;

        return (x <= x2 && x + width >= x2 + width2 && y <= y2 && y + depth >= y2 + depth2);
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    // toString method
    @Override
    public String toString() {
        return x + "," + y + "," + width + "," + depth;
    }
}