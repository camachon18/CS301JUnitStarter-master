package up.edu.dimcalc;

import android.graphics.Point;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by camachon18 on 11/4/2015.
 */
public class TwoPointsTest {

    @Test
    public void testRandomValue() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        TwoPoints testPoints2 = new TwoPoints();
        //testPoints.randomValue(0);
        //testPoints.randomValue(1);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        testPoints2.randomValue(0);
        testPoints2.randomValue(1);
        Point p3 = testPoints2.getPoint(0);
        Point p4 = testPoints2.getPoint(1);
        assertNotEquals(p1.x,p3.x);
        assertNotEquals(p1.y,p3.y);
        assertNotEquals(p2.x,p4.x);
        assertNotEquals(p2.y,p4.y);

    }

    @Test
    public void testSetOrigin() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setOrigin(0);
        testPoints.setOrigin(1);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
        assertEquals(p2.x, 0);
        assertEquals(p2.y, 0);
    }

    @Test
    public void testCopy() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0,5,4);
        testPoints.copy(0,1);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p2.x, 5);
        assertEquals(p2.y, 4);
    }

    @Test
    public void testDistance() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0,0,0);
        testPoints.setPoint(1,1,1);
        double answer = testPoints.distance();
        assertEquals(Math.sqrt(2), answer, 0.01);

    }

    @Test
    public void testSlope() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0,2,3);
        testPoints.setPoint(1,5,5);
        double answer = testPoints.slope();
        assertEquals(0.6,answer,0.2);

    }

    /** when created, getPoint() should show both points at the origin */
    @Test
    public void testGetPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 0);
        assertEquals(p1.y, 0);
        assertEquals(p2.x, 0);
        assertEquals(p2.y, 0);
    }

    /** verify that arbitrary values are properly stored via setPoint() */
    @Test
    public void testSetPoint() throws Exception {
        TwoPoints testPoints = new TwoPoints();
        testPoints.setPoint(0, 5, -3);
        testPoints.setPoint(1, -3, 5);
        Point p1 = testPoints.getPoint(0);
        Point p2 = testPoints.getPoint(1);
        assertEquals(p1.x, 5);//og 5
        assertEquals(p1.y, -3);
        assertEquals(p2.x, -3);
        assertEquals(p2.y, 5);
    }

}