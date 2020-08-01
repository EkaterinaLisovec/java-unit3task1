public class Mili {
    public static void main(String[] args) {
        float ticket_price = (int)657643.01F; //INPUT
        int Miles = (int)ticket_price / 20; //округление происходит в меньшую сторону
        System.out.println("Miles = " + Miles);
    }
}
