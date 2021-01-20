import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount=1000_60;
        boolean registered=true;
        long expected =30;
        long actual=service.calculate(amount, registered);
        assertEquals(actual,expected);
    }
    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount=26_000_60;
        boolean registered=true;
        long expected =500;
        long actual=service.calculate(amount, registered);
        assertEquals(actual,expected);
    }
    @Test
    void shouldCalculateUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount=9_000_000_00;
        boolean registered=false;
        long expected =500;
        long actual=service.calculate(amount, registered);
        assertEquals(actual,expected);

    }
    @Test
    void shouldCalculateUnRegisteredAndUnderLimit(){
        BonusService service = new BonusService();
        long amount=1000_60;
        boolean registered=false;
        long expected =10;
        long actual=service.calculate(amount, registered);
        assertEquals(actual,expected);}

    @Test
    void shouldCalculateUnRegisteredZero(){
        BonusService service = new BonusService();
        long amount=0;
        boolean registered=false;
        long expected =0;
        long actual=service.calculate(amount, registered);
        assertEquals(actual,expected);}

        @Test
    void shouldCalculateRegisteredZero(){
        BonusService service = new BonusService();
        long amount=0;
        boolean registered=true;
        long expected =0;
        long actual=service.calculate(amount, registered);
        assertEquals(actual,expected);}

}