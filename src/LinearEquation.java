public class LinearEquation {

    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

/* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
   the nearest hundredth */
    public double distance() {
        double xS = Math.pow(((double) x2 - x1), 2);
        double yS = Math.pow(((double) y2 - y1), 2);
        double tgt = xS + yS;
        double distance = Math.sqrt(tgt);
        return roundedToHundredth(distance);
    }

/* Calculates and returns the slope of the line between (x1, y1) and
   (x2, y2), rounded to the nearest hundredth */
    public double slope() {
        double slope = (double) (y2 - y1) / (x2 - x1);
        return roundedToHundredth(slope);
    }

    public double yIntercept() {
        double yIntercept = y1 - (slope() * (x1));
        return roundedToHundredth(yIntercept);
    }

    /* Returns a String that represents the linear equation of the line through points
       (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form
   */
        public String equation() {
            double numerator = y2 - y1;
            double den = x2 - x1;
            String newEquation = "";
            String fraction = "";

            if (numerator % den == 0) {
                fraction = (int) (numerator / den) + "x";
            }
            if (slope() == 1) {
                fraction = "x";
            } else if (slope() == -1) {
                fraction = "-x";
            }
            if (slope() < 0) {
                fraction = "-" + (int) Math.abs(numerator) + "/" + (int) Math.abs(den) + "x";
            } else if (slope() > 0) {
                fraction = (int) Math.abs(numerator) + "/" + (int) Math.abs(den) + "x";
            }
            if (y1 == y2) {
                newEquation = "y = " + y1;
                return newEquation;
            } else if (yIntercept() < 0) {
                newEquation = "y= " + fraction + "-" + Math.abs(yIntercept());
                return newEquation;
            } else if (yIntercept() == 0) {
                newEquation = "y= " + fraction;
                return newEquation;
            } else {
                newEquation = "y = " + fraction + " + " + yIntercept();
                return newEquation;
            }
        }

        public String coordinateForX(double xValue) {
            boolean equal = x1 == x2;
            String nothing = "";
            if(!equal){
                double newY = (xValue * slope()) + yIntercept();
                String xEquation = ("The point on the line is (" + xValue + "," + newY + ")");
                return xEquation;
            }
            return nothing;
        }
    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
        to the nearest hundredth */
    public double roundedToHundredth(double toRound) {
        toRound = Math.round(toRound * 100) / 100.0;
        return toRound;

    }

/* Returns a string that includes all information about the linear equation, each on
   separate lines: */
    public String lineInfo() {
        boolean equal = x1 == x2;
        String result = "";
        if (equal) {
            result = ("These points are on a vertical line: x = " + x1);
        } else {
            result = ("The two points are: " + "(" + x1 + "," + y1 + ")" + " and " + "(" + x2 + "," + y2 + ")" + "\n" + "The equation of the line between these points is: " + equation() + "\n" + "The slope of this line is: " + slope() + "\n" + "The y-intercept of the line is: " + yIntercept() + "\n" + "The distance between the two points is: " + distance());
        }
            return result;
    }
}



