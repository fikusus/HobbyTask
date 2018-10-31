package TaskHobby;

public class Football extends Hobby {
    private String yourFavoritePlayer;

    public String getYourFavoritePlayer() {
        return yourFavoritePlayer;
    }

    public void setYourFavoritePlayer(String yourFavoritePlayer) {
        this.yourFavoritePlayer = yourFavoritePlayer;
    }

    public Football(char firstLetterInTitle, short howManyYears, String yourFavoritePlayer) {
        super(firstLetterInTitle, howManyYears);
        this.yourFavoritePlayer = yourFavoritePlayer;
    }


    @Override
    public void tellAboutHobby() {
        System.out.println("Футбол.Первая буква в названии хобби - " + this.getFirstLetterInTitle() + " ,ты занимаешся этим " + this.getHowManyYears() + " лет, количество единомышленников " + this.getNumberOfLikeMindedPeople() + " ,ты тратиш в день " + this.getHowMuchHourInDay() + " твой любимый футболис " + this.getYourFavoritePlayer() );
    }
}
