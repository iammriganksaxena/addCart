public class india implements asia{
    @Override
    public boolean isCountryAsian() {
        return true;
    }

    @Override
    public boolean isCountryBRICS() {
        return true;
    }

    @Override
    public boolean isCountryAtomic() {
        return true;
    }

    public static void main(String[] args) {

        asia asia = new india();
        System.out.println(asia.isCountryAsian());
        System.out.println(asia.isCountryAtomic());
        System.out.println(asia.isCountryBRICS());
    }
}
