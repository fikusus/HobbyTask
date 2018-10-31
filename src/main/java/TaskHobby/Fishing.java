package TaskHobby;

public class Fishing extends Hobby {
    private int recordFish;


    public int getRecordFish() {
        return recordFish;
    }

    public void setRecordFish(int recordFish) {
        this.recordFish = recordFish;
    }

    public Fishing(char firstLetterInTitle, short howManyYears, byte howMuchHourInDay, int recordFish) {
        super(firstLetterInTitle, howManyYears, howMuchHourInDay);
        this.recordFish = recordFish;
    }
    @Override
    public void tellAboutHobby() {
        System.out.println("Рыбалка.Первая буква в названии хобби - " + this.getFirstLetterInTitle() + " ,ты занимаешся этим " + this.getHowManyYears() + " лет, количество единомышленников " + this.getNumberOfLikeMindedPeople() + " ,ты тратиш в день " + this.getHowMuchHourInDay() + " часов, вес самой большой рыбы " + this.getRecordFish() + " кг" );
    }
}
