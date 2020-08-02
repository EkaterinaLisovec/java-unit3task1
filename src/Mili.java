public class Mili {
    public static void main(String[] args) {
        float ticketPrice = (int)657643.01F; //INPUT
        int miles = (int)ticketPrice / 20; //округление происходит в меньшую сторону
        System.out.println("Miles = " + miles);
    }
}
