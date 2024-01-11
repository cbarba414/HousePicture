import java.awt.*;
// and change background color
// and add the person please!
// and add the sun! maybe a moon? stars?
public class Picture {
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

    private Square entranceSteps;

    private Square doorOne;

    private Square doorTwo;

    private Square doorDetail;

    private Square doorCover;

    private Square darkWindow;

    private Square darkWindowCover;

    private Square lightWindow;

    private Square lightWindowCover;

    private Triangle roofLineWallTwo;

    private Triangle roofLineWallOne;
    private Square pot;

    private Circle potBall;

    private Circle potBallTwo;

    private Square potTwo;

    private Square potThree;

    private Circle potTwoBall;

    private Circle potTwoBallTwo;

    private Circle potTwoBallThree;

    private Circle potTwoRoseOne;

    private Circle potTwoRoseTwo;

    private Circle potTwoRoseThree;

    private Circle potTwoRoseFour;

    private Circle potTwoRoseFive;

    private Circle potThreeBallOne;

    private Square potThreeWood;

    private Square potThreeWoodCoverOne;

    private Square potThreeWoodCoverTwo;

    private Square garageGreyOne;

    private Square garageWhiteOne;

    private Square garageGreyTwo;

    private Square garageWhiteTwo;

    private Square garageGreyThree;

    private Square garageWhiteThree;

    private Square garageGreyFour;

    private Square garageWhiteFour;

    private Circle doorHandle;

    private Person guy;
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
        entranceSteps = new Square ();
        doorOne = new Square ();
        doorTwo = new Square ();
        doorDetail = new Square ();
        doorCover = new Square ();
        darkWindow = new Square ();
        darkWindowCover = new Square ();
        lightWindow = new Square ();
        lightWindowCover = new Square ();
        roofLineWallTwo = new Triangle ();
        roofLineWallOne = new Triangle ();
        pot = new Square ();
        potBall = new Circle ();
        potBallTwo = new Circle ();
        potTwo = new Square ();
        potThree = new Square ();
        potTwoBall = new Circle ();
        potTwoBallTwo = new Circle ();
        potTwoBallThree = new Circle ();
        potTwoRoseOne = new Circle ();
        potTwoRoseTwo = new Circle ();
        potTwoRoseThree = new Circle ();
        potTwoRoseFour = new Circle ();
        potTwoRoseFive = new Circle ();
        potThreeBallOne = new Circle ();
        potThreeWood = new Square ();
        potThreeWoodCoverOne = new Square ();
        potThreeWoodCoverTwo = new Square ();
        garageGreyOne = new Square ();
        garageWhiteOne = new Square ();
        garageGreyTwo = new Square ();
        garageWhiteTwo = new Square ();
        garageGreyThree = new Square ();
        garageWhiteThree = new Square ();
        garageGreyFour = new Square ();
        garageWhiteFour = new Square ();
        doorHandle = new Circle ();
        guy = new Person ();
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
            wallTwoRoofSquare.moveVertical(-38);
            wallTwoRoofSquare.changeSize(240);
            wallTwoRoofSquare.makeVisible();

            wallTwo.changeColor ("lightGreen");
            wallTwo.moveHorizontal(-80);
            wallTwo.moveVertical(25);
            wallTwo.changeSize(225);
            wallTwo.makeVisible();

            doorOne.changeColor ("doorBrown");
            doorOne.moveHorizontal(-35);
            doorOne.moveVertical(113);
            doorOne.changeSize(39);
            doorOne.makeVisible();

            doorTwo.changeColor ("doorBrown");
            doorTwo.moveHorizontal(-35);
            doorTwo.moveVertical(75);
            doorTwo.changeSize(39);
            doorTwo.makeVisible();

            doorDetail.changeColor ("glassyBlue");
            doorDetail.moveHorizontal(-28);
            doorDetail.moveVertical(80);
            doorDetail.changeSize(25);
            doorDetail.makeVisible();

            doorCover.changeColor ("doorBrown");
            doorCover.moveHorizontal(-28);
            doorCover.moveVertical(94);
            doorCover.changeSize(25);
            doorCover.makeVisible();

            entranceSteps.changeColor ("darkerBrickRed");
            entranceSteps.moveHorizontal(-41);
            entranceSteps.moveVertical(150);
            entranceSteps.changeSize(50);
            entranceSteps.makeVisible();


            potTwo.changeColor("clayRed");
            potTwo.moveHorizontal(24);
            potTwo.moveVertical(152);
            potTwo.changeSize(47);
            potTwo.makeVisible();

            potThree.changeColor("clayRed");
            potThree.moveHorizontal(88);
            potThree.moveVertical(150);
            potThree.changeSize(40);
            potThree.makeVisible();

            brickEntrance.changeColor ("brickRed");
            brickEntrance.moveHorizontal(-90);
            brickEntrance.moveVertical(160);
            brickEntrance.changeSize(220);
            brickEntrance.makeVisible();

            darkWindow.changeColor ("darkWindowGrey");
            darkWindow.moveHorizontal(20);
            darkWindow.moveVertical(70);
            darkWindow.changeSize(40);
            darkWindow.makeVisible();

            darkWindowCover.changeColor ("lightGreen");
            darkWindowCover.moveHorizontal(20);
            darkWindowCover.moveVertical(100);
            darkWindowCover.changeSize(40);
            darkWindowCover.makeVisible();

            lightWindow.changeColor ("lightWindowGrey");
            lightWindow.moveHorizontal(88);
            lightWindow.moveVertical(65);
            lightWindow.changeSize(47);
            lightWindow.makeVisible();

            potThreeBallOne.changeColor("plantGreen");
            potThreeBallOne.moveHorizontal(170);
            potThreeBallOne.moveVertical(107);
            potThreeBallOne.changeSize(45);
            potThreeBallOne.makeVisible();

            lightWindowCover.changeColor ("lightGreen");
            lightWindowCover.moveHorizontal(88);
            lightWindowCover.moveVertical(105);
            lightWindowCover.changeSize(47);
            lightWindowCover.makeVisible();

            potThreeWood.changeColor("woodBrown");
            potThreeWood.moveHorizontal(97);
            potThreeWood.moveVertical(105);
            potThreeWood.changeSize(47);
            potThreeWood.makeVisible();

            potThreeWoodCoverOne.changeColor("lightGreen");
            potThreeWoodCoverOne.moveHorizontal(120);
            potThreeWoodCoverOne.moveVertical(105);
            potThreeWoodCoverOne.changeSize(24);
            potThreeWoodCoverOne.makeVisible();

            potThreeWoodCoverTwo.changeColor("lightGreen");
            potThreeWoodCoverTwo.moveHorizontal(120);
            potThreeWoodCoverTwo.moveVertical(128);
            potThreeWoodCoverTwo.changeSize(24);
            potThreeWoodCoverTwo.makeVisible();

            potTwoBallThree.changeColor("darkPlantGreen");
            potTwoBallThree.moveHorizontal(101);
            potTwoBallThree.moveVertical(140);
            potTwoBallThree.changeSize(42);
            potTwoBallThree.makeVisible();

            potTwoBall.changeColor ("plantGreen");
            potTwoBall.moveHorizontal(95);
            potTwoBall.moveVertical(154);
            potTwoBall.changeSize(30);
            potTwoBall.makeVisible();

            potTwoBallTwo.changeColor("plantGreen");
            potTwoBallTwo.moveHorizontal(118);
            potTwoBallTwo.moveVertical(146);
            potTwoBallTwo.changeSize(40);
            potTwoBallTwo.makeVisible();

            potBall.changeColor ("plantGreen");
            potBall.moveHorizontal(14);
            potBall.moveVertical(140);
            potBall.changeSize(30);
            potBall.makeVisible();

            potBallTwo.changeColor ("plantGreen");
            potBallTwo.moveHorizontal(11);
            potBallTwo.moveVertical(105);
            potBallTwo.changeSize(37);
            potBallTwo.makeVisible();

            potTwoRoseOne.changeColor("lightRose");
            potTwoRoseOne.moveHorizontal(110);
            potTwoRoseOne.moveVertical(165);
            potTwoRoseOne.changeSize(10);
            potTwoRoseOne.makeVisible();

            potTwoRoseTwo.changeColor("lightRose");
            potTwoRoseTwo.moveHorizontal(138);
            potTwoRoseTwo.moveVertical(155);
            potTwoRoseTwo.changeSize(10);
            potTwoRoseTwo.makeVisible();

            potTwoRoseThree.changeColor("lightRose");
            potTwoRoseThree.moveHorizontal(128);
            potTwoRoseThree.moveVertical(172);
            potTwoRoseThree.changeSize(10);
            potTwoRoseThree.makeVisible();

            potTwoRoseFour.changeColor("darkRose");
            potTwoRoseFour.moveHorizontal(120);
            potTwoRoseFour.moveVertical(152);
            potTwoRoseFour.changeSize(10);
            potTwoRoseFour.makeVisible();

            potTwoRoseFive.changeColor("darkRose");
            potTwoRoseFive.moveHorizontal(110);
            potTwoRoseFive.moveVertical(143);
            potTwoRoseFive.changeSize(10);
            potTwoRoseFive.makeVisible();

            pot.changeColor ("clayRed");
            pot.moveHorizontal(-60);
            pot.moveVertical(140);
            pot.changeSize(20);
            pot.makeVisible();

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

            roofLineWallTwo.changeColor ("white");
            roofLineWallTwo.changeSize(85, 295);
            roofLineWallTwo.moveHorizontal(135);
            roofLineWallTwo.moveVertical(-53);
            roofLineWallTwo.makeVisible();

            wallTwoRoof.changeColor ("brown");
            wallTwoRoof.changeSize(80, 290);
            wallTwoRoof.moveHorizontal(134);
            wallTwoRoof.moveVertical(-58);
            wallTwoRoof.makeVisible();

            roofLineWallOne.changeColor ("white");
            roofLineWallOne.changeSize(70, 270);
            roofLineWallOne.moveHorizontal(-80);
            roofLineWallOne.moveVertical(-16);
            roofLineWallOne.makeVisible();

            roof.changeColor ("brown");
            roof.changeSize(60, 260);
            roof.moveHorizontal(-80);
            roof.moveVertical(-16);
            roof.makeVisible();

            miniRoofOne.changeColor ("lightGreen");
            miniRoofOne.changeSize(10, 60);
            miniRoofOne.moveHorizontal(-80);
            miniRoofOne.moveVertical(-9);
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

            garageGreyOne.changeColor ("garageGrey");
            garageGreyOne.moveHorizontal(-260);
            garageGreyOne.moveVertical(119);
            garageGreyOne.changeSize(160);
            garageGreyOne.makeVisible();

            garageWhiteOne.changeColor("white");
            garageWhiteOne.moveHorizontal(-260);
            garageWhiteOne.moveVertical(122);
            garageWhiteOne.changeSize(160);
            garageWhiteOne.makeVisible();

            garageGreyTwo.changeColor("garageGrey");
            garageGreyTwo.moveHorizontal(-260);
            garageGreyTwo.moveVertical(135);
            garageGreyTwo.changeSize(160);
            garageGreyTwo.makeVisible();

            garageWhiteTwo.changeColor("white");
            garageWhiteTwo.moveHorizontal(-260);
            garageWhiteTwo.moveVertical(138);
            garageWhiteTwo.changeSize(160);
            garageWhiteTwo.makeVisible();

            garageGreyThree.changeColor("garageGrey");
            garageGreyThree.moveHorizontal(-260);
            garageGreyThree.moveVertical(152);
            garageGreyThree.changeSize(160);
            garageGreyThree.makeVisible();

            garageWhiteThree.changeColor("white");
            garageWhiteThree.moveHorizontal(-260);
            garageWhiteThree.moveVertical(155);
            garageWhiteThree.changeSize(160);
            garageWhiteThree.makeVisible();

            garageGreyFour.changeColor("garageGrey");
            garageGreyFour.moveHorizontal(-260);
            garageGreyFour.moveVertical(168);
            garageGreyFour.changeSize(160);
            garageGreyFour.makeVisible();

           garageWhiteFour.changeColor("white");
           garageWhiteFour.moveHorizontal(-260);
           garageWhiteFour.moveVertical(171);
           garageWhiteFour.changeSize(160);
           garageWhiteFour.makeVisible();

           doorHandle.changeColor("black");
            doorHandle.moveHorizontal(71);
            doorHandle.moveVertical(142);
            doorHandle.changeSize(7);
            doorHandle.makeVisible();

            guy.changeColor("lightRose");
            guy.moveHorizontal(-90);
            guy.moveVertical(71);
            guy.makeVisible();


           sun.changeColor("yellow");
            sun.moveHorizontal(173);
            sun.moveVertical(-60);
            sun.changeSize(60);
            sun.makeVisible();
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
        entranceSteps.changeColor ("darkerBrickRed");
        doorOne.changeColor ("doorBrown");
        doorTwo.changeColor ("doorBrown");
        doorDetail.changeColor ("glassyBlue");
        doorCover.changeColor ("doorBrown");
        darkWindow.changeColor ("darkWindowGrey");
        darkWindowCover.changeColor ("lightGreen");
        lightWindow.changeColor ("lightWindowGrey");
        lightWindowCover.changeColor("lightGreen");
        roofLineWallTwo.changeColor ("white");
        roofLineWallOne.changeColor ("white");
        pot.changeColor ("clayRed");
        potBall.changeColor ("plantGreen");
        potBallTwo.changeColor ("plantGreen");
        potTwo.changeColor("clayRed");
        potThree.changeColor("clayRed");
        potTwoBall.changeColor ("plantGreen");
        potTwoBallTwo.changeColor("plantGreen");
        potTwoBallThree.changeColor("darkPlantGreen");
        potTwoRoseOne.changeColor("lightRose");
        potTwoRoseTwo.changeColor("lightRose");
        potTwoRoseThree.changeColor("lightRose");
        potTwoRoseFour.changeColor("darkRose");
        potTwoRoseFive.changeColor("darkRose");
        potThreeBallOne.changeColor("plantGreen");
        potThreeWood.changeColor("woodBrown");
        potThreeWoodCoverOne.changeColor("lightGreen");
        potThreeWoodCoverTwo.changeColor("lightGreen");
        garageGreyOne.changeColor ("garageGrey");
        garageWhiteOne.changeColor("white");
        garageGreyTwo.changeColor("garageGrey");
        garageWhiteTwo.changeColor("white");
        garageGreyThree.changeColor("garageGrey");
        garageWhiteThree.changeColor("white");
        garageGreyFour.changeColor("garageGrey");
        garageWhiteFour.changeColor("white");
        doorHandle.changeColor("black");
        guy.changeColor("lightRose");
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
        entranceSteps.changeColor ("darkerBrickRed");
        doorOne.changeColor ("doorBrown");
        doorTwo.changeColor ("doorBrown");
        doorDetail.changeColor ("glassyBlue");
        doorCover.changeColor ("doorBrown");
        darkWindow.changeColor ("darkWindowGrey");
        darkWindowCover.changeColor ("lightGreen");
        lightWindow.changeColor ("lightWindowGrey");
        lightWindowCover.changeColor("lightGreen");
        roofLineWallTwo.changeColor ("white");
        roofLineWallOne.changeColor ("white");
        pot.changeColor ("clayRed");
        potBall.changeColor ("plantGreen");
        potBallTwo.changeColor ("plantGreen");
        potTwo.changeColor("clayRed");
        potThree.changeColor("clayRed");
        potTwoBall.changeColor ("plantGreen");
        potTwoBallTwo.changeColor("plantGreen");
        potTwoBallThree.changeColor("darkPlantGreen");
        potTwoRoseOne.changeColor("lightRose");
        potTwoRoseTwo.changeColor("lightRose");
        potTwoRoseThree.changeColor("lightRose");
        potTwoRoseFour.changeColor("darkRose");
        potTwoRoseFive.changeColor("darkRose");
        potThreeBallOne.changeColor("plantGreen");
        potThreeWood.changeColor("woodBrown");
        potThreeWoodCoverOne.changeColor("lightGreen");
        potThreeWoodCoverTwo.changeColor("lightGreen");
        garageGreyOne.changeColor ("garageGrey");
        garageWhiteOne.changeColor("white");
        garageGreyTwo.changeColor("garageGrey");
        garageWhiteTwo.changeColor("white");
        garageGreyThree.changeColor("garageGrey");
        garageWhiteThree.changeColor("white");
        garageGreyFour.changeColor("garageGrey");
        garageWhiteFour.changeColor("white");
        doorHandle.changeColor("black");
        guy.changeColor("lightRose");

    }
}
