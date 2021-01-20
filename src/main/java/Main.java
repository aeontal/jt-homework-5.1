public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        //long bonusBelowLimitForRegistered = service.calculate(1000_60, true);
        //System.out.println(bonusBelowLimitForRegistered);
        //long bonusOverLimitForRegistered = service.calculate(1_000_000_60, true);
        //System.out.println(bonusOverLimitForRegistered);
        //long bonusBelowLimitForUnRegistered = service.calculate(1000_60, false);
        //System.out.println(bonusBelowLimitForUnRegistered);
        //long bonusOverLimitForUnRegistered = service.calculate(1_000_000_60, true);
       // System.out.println(bonusOverLimitForUnRegistered);
        long amount=0;
        boolean registered=true;
        long expected =30;
        long actual=service.calculate(amount, registered);
        System.out.println(actual);

        }
}
