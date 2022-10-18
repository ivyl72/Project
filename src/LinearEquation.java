public class LinearEquation {

        private String cord1;
        private String cord2;

        /**
         * PRECONDITION: x1 and x2 are NOT equal (client programs are responsible for ensuring
         * this precondition is not violated)
         */
        public LinearEquation(String cord1, String cord2) {
                System.out.println("The two points are: " + cord1 + "and" + cord2);
        }

        public int X1Y1() {
                int comma1 = cord1.indexOf(",");
                if (cord1.length() == 5) {
                int x1 = Integer.parseInt(cord1.substring(1, 2));
                int y1 = Integer.parseInt(cord1.substring(3, 4));
                return x1;
                return y1;
                }else if (comma1 == 4 && cord1.length() == 7) {
                  int x1 = Integer.parseInt(cord1.substring(1, 3));
                  int y1 = Integer.parseInt(cord1.substring(5, 7));
                        return x1;
                        return y1;
                } else if (comma1 == 4 && cord1.length() == 6) {
                 int x1 = Integer.parseInt(cord1.substring(1, 3));
                 int y1 = Integer.parseInt(cord1.substring(5, 6));
                        return x1;
                        return y1;
                        }
                }

        public int X2Y2() {
                int comma2 = cord2.indexOf(",");
                if (cord2.length() == 5) {
                        int x2 = Integer.parseInt(cord2.substring(1, 2));
                        int y2 = Integer.parseInt(cord2.substring(3, 4));
                        return x2;
                        return y2;
                }else if (comma2 == 4 && cord2.length() == 7) {
                        int x2 = Integer.parseInt(cord2.substring(1, 3));
                        int y2 = Integer.parseInt(cord1.substring(5, 7));
                        return x2;
                        return y2;
                } else if (comma2 == 4 && cord2.length() == 6) {
                        int x2 = Integer.parseInt(cord1.substring(1, 3));
                        int y2 = Integer.parseInt(cord1.substring(5, 6));
                        return x2;
                        return y2;
                }
        }
}



