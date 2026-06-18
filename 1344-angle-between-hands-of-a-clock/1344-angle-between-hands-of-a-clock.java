class Solution {
    public double angleClock(int hour, int minutes) {
        double angle = Math.abs((hour * 30 + minutes * 0.5) - (minutes * 6));
        return Math.min(angle, 360 - angle);
    }
}