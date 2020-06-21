package time;

public interface Time {
    public int getHour();

    public int getMinute();

    public int getSecond();

    public void setHour(int hour);

    public void setMinute(int min);

    public void serSecond(int sec);

    public boolean equals(Time t);

    public boolean before(Time t);

    public boolean after(Time t);

    public int differece(Time t);

    public String toString();
}