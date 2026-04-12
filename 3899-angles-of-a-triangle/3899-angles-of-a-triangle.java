class Solution {
    public double[] internalAngles(int[] sides) {
        int a = sides[0], b = sides[1], c = sides[2];
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a){
            return new double[] {};
        }
        double A = Math.toDegrees(Math.acos((b * b + c * c - a * a)/(2.0 * b * c)));
        double B = Math.toDegrees(Math.acos((a * a + c * c - b * b)/(2.0 * a * c)));
        double C = Math.toDegrees(Math.acos((b * b + a * a - c * c)/(2.0 * b * a)));

        double[] res = new double[]{A, B, C};
        Arrays.sort(res);
        return res;
    }
}