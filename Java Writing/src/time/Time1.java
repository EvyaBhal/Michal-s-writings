package time;

public class Time1 implements Time{
    private short hour;
    private short minute;
    private short second;

    public Time1(int h, int m, int s){
        hour = (short)h;
        minute = (short)m;
        second = (short)s;
    }
    public Time1(Time t){
        hour = (short)t.getHour();
        minute = (short)t.getMinute();
        second = (short)t.getSecond();

    }
    @Override
    public int getHour() {
        return hour;
    }

    @Override
    public int getMinute() {
        return minute;
    }

    @Override
    public int getSecond() {
        return second;
    }

    @Override
    public void setHour(int hour) {
        this.hour = (short)hour;
    }

    @Override
    public void setMinute(int min) {
        this.minute = (short)min;
    }

    @Override
    public void serSecond(int sec) {
        this.second = (short)sec;
    }

    @Override
    public boolean equals(Time t) {
        if (t.getHour()==hour && t.getMinute() == minute && t.getSecond() == second)
            return true;
        return false;
    }

    @Override
    public boolean before(Time t) {
        return false;
    }

    @Override
    public boolean after(Time t) {
        return false;
    }

    @Override
    public int differece(Time t) {
        return 0;
    }
}
