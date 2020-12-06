package kurs.qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void distance() {
        Point p1 = new Point(7,9);
        Point p2 = new Point(10,18);

        Assert.assertEquals(Point.distance(p1, p2), 8.54400374531753);
    }
}
