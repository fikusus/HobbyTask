package TaskHobby;


public abstract class Hobby {
    private byte howMuchHourInDay;
    private short howManyYears;
    private int numberOfLikeMindedPeople;
    private long priority;
    private float moneySpentPerMonth;
    private double moneySpentAtAll;
    private char firstLetterInTitle;
    private boolean nowActive;

    public Hobby() {
        this.firstLetterInTitle = 'N';

    }

    public Hobby(char firstLetterInTitle, short howManyYears) {
        this.howManyYears = howManyYears;
        this.firstLetterInTitle = firstLetterInTitle;
    }

    public Hobby(char firstLetterInTitle, short howManyYears, byte howMuchHourInDay) {
        this.howMuchHourInDay = howMuchHourInDay;
        this.howManyYears = howManyYears;
        this.firstLetterInTitle = firstLetterInTitle;
    }


    public byte getHowMuchHourInDay() {
        return howMuchHourInDay;
    }

    public short getHowManyYears() {
        return howManyYears;
    }

    public int getNumberOfLikeMindedPeople() {
        return numberOfLikeMindedPeople;
    }

    public long getPriority() {
        return priority;
    }

    public float getMoneySpentPerMonth() {
        return moneySpentPerMonth;
    }

    public double getMoneySpentAtAll() {
        return moneySpentAtAll;
    }

    public char getFirstLetterInTitle() {
        return firstLetterInTitle;
    }

    public boolean isNowActive() {
        return nowActive;
    }

    public void setHowMuchHourInDay(byte howMuchHourInDay) {
        this.howMuchHourInDay = howMuchHourInDay;
    }

    public void setHowManyYears(short howManyYears) {
        this.howManyYears = howManyYears;
    }

    public void setNumberOfLikeMindedPeople(int numberOfLikeMindedPeople) {
        this.numberOfLikeMindedPeople = numberOfLikeMindedPeople;
    }

    public void setPriority(long priority) {
        this.priority = priority;
    }

    public void setMoneySpentPerMonth(float moneySpentPerMonth) {
        this.moneySpentPerMonth = moneySpentPerMonth;
    }

    public void setMoneySpentAtAll(double moneySpentAtAll) {
        this.moneySpentAtAll = moneySpentAtAll;
    }

    public void setFirstLetterInTitle(char firstLetterInTitle) {
        this.firstLetterInTitle = firstLetterInTitle;
    }

    public void setNowActive(boolean nowActive) {
        this.nowActive = nowActive;
    }

    public void tellAboutHobby() {
        System.out.println("Первая буква в названии хобби - " + firstLetterInTitle + " ,ты занимаешся этим " + howManyYears + " лет, количество единомышленников " + numberOfLikeMindedPeople + " ,ты тратиш в день " + howMuchHourInDay + " часов");
    }
}
