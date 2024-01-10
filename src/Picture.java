import java.awt.*;
// tomorrow's plans: maybe add the lines to the garage, add the
// plants outside the house, the door (and designs), the two windows
// and the colors for everything.
public class Picture
{
    private Square wall;
    private Square wallTwo;
    private Square window;
    private Square middleGarageWindow;
    private Triangle roof;
    private Triangle miniRoofOne;
    private Circle sun;

    private Circle leftGarageWindow;

    private Circle rightGarageWindow;

    private Square garageCover;

    private Circle middleGarageCircle;

    private Square brickEntrance;

    private Triangle wallTwoRoof;

    private Square wallTwoRoofSquare;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        middleGarageWindow = new Square();
        miniRoofOne = new Triangle();
        leftGarageWindow = new Circle ();
        rightGarageWindow = new Circle ();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
        garageCover = new Square ();
        middleGarageCircle = new Circle ();
        wallTwo = new Square();
        brickEntrance = new Square ();
        wallTwoRoof = new Triangle ();
        wallTwoRoofSquare = new Square ();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {

            wallTwoRoofSquare.changeColor ("brown");
            wallTwoRoofSquare.moveHorizontal(-180);
            wallTwoRoofSquare.moveVertical(-35);
            wallTwoRoofSquare.changeSize(240);
            wallTwoRoofSquare.makeVisible();

            wallTwo.changeColor ("lightGreen");
            wallTwo.moveHorizontal(-90);
            wallTwo.moveVertical(23);
            wallTwo.changeSize(220);
            wallTwo.makeVisible();

            brickEntrance.changeColor ("brickRed");
            brickEntrance.moveHorizontal(-90);
            brickEntrance.moveVertical(160);
            brickEntrance.changeSize(200);
            brickEntrance.makeVisible();

            wall.changeColor ("lightGreen");
            wall.moveHorizontal(-290);
            wall.moveVertical(60);
            wall.changeSize(220);
            wall.makeVisible();

            window.changeColor ("white");
            window.moveHorizontal(-265);
            window.moveVertical(90);
            window.changeSize(170);
            window.makeVisible();

            wallTwoRoof.changeColor ("brown");
            wallTwoRoof.changeSize(60, 260);
            wallTwoRoof.moveHorizontal(120);
            wallTwoRoof.moveVertical(-55);
            wallTwoRoof.makeVisible();

            roof.changeColor ("brown");
            roof.changeSize(60, 260);
            roof.moveHorizontal(-80);
            roof.moveVertical(-20);
            roof.makeVisible();

            miniRoofOne.changeColor ("lightGreen");
            miniRoofOne.changeSize(10, 60);
            miniRoofOne.moveHorizontal(-80);
            miniRoofOne.moveVertical(-10);
            miniRoofOne.makeVisible();

            leftGarageWindow.changeColor("black");
            leftGarageWindow.moveHorizontal(-177);
            leftGarageWindow.moveVertical(127);
            leftGarageWindow.changeSize(50);
            leftGarageWindow.makeVisible();

            rightGarageWindow.changeColor ("black");
            rightGarageWindow.moveHorizontal(-74);
            rightGarageWindow.moveVertical(127);
            rightGarageWindow.changeSize(50);
            rightGarageWindow.makeVisible();

            middleGarageWindow.changeColor ("black");
            middleGarageWindow.moveHorizontal(-200);
            middleGarageWindow.moveVertical(101);
            middleGarageWindow.changeSize(40);
            middleGarageWindow.makeVisible();

            garageCover.changeColor ("white");
            garageCover.moveHorizontal(-265);
            garageCover.moveVertical(113);
            garageCover.changeSize(170);
            garageCover.makeVisible();

            middleGarageCircle.changeColor ("white");
            middleGarageCircle.moveHorizontal(-113);
            middleGarageCircle.moveVertical(136);
            middleGarageCircle.changeSize(25);
            middleGarageCircle.makeVisible();

           /* sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible(); */
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        miniRoofOne.changeColor ("brown");
        leftGarageWindow.changeColor ("black");
        rightGarageWindow.changeColor ("black");
        middleGarageWindow.changeColor ("black");
        garageCover.changeColor ("white");
        middleGarageCircle.changeColor ("white");
        wallTwo.changeColor ("lightGreen");
        brickEntrance.changeColor ("brickRed");
        wallTwoRoof.changeColor ("brown");
        wallTwoRoofSquare.changeColor("brown");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        miniRoofOne.changeColor ("brown");
        leftGarageWindow.changeColor ("black");
        rightGarageWindow.changeColor ("black");
        middleGarageWindow.changeColor ("black");
        garageCover.changeColor ("white");
        middleGarageCircle.changeColor ("white");
        wallTwo.changeColor ("lightGreen");
        brickEntrance.changeColor ("brickRed");
        wallTwoRoof.changeColor ("brown");
        wallTwoRoofSquare.changeColor("brown");
    }
}
