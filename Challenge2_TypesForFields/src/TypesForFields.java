import java.time.Month;

public class TypesForFields {

    public static void main(String[] args) {
        final ManyTypes manyTypes = new ManyTypes();

        if (manyTypes.a0 != Byte.MIN_VALUE && manyTypes.a0 != Byte.MAX_VALUE) {
            throw new RuntimeException("Invalid type or value of a0.");
        }
        if (manyTypes.a1 != Short.MIN_VALUE && manyTypes.a1 != Short.MAX_VALUE) {
            throw new RuntimeException("Invalid type or value of a1.");
        }
        if (!(manyTypes.a2.getClass().getName().equals("java.lang.Character"))
                | (Character.getNumericValue(manyTypes.a2) < 0)
                | (Character.getNumericValue(manyTypes.a2) > 10)) {
            throw new RuntimeException("Invalid type or value of a2.");
        }
        if (manyTypes.a3 != Integer.MIN_VALUE & manyTypes.a3 != Integer.MAX_VALUE) {
            throw new RuntimeException("Invalid type or value of a3.");
        }
        if (manyTypes.a4 != Long.MIN_VALUE & manyTypes.a4 != Long.MAX_VALUE) {
            throw new RuntimeException("Invalid type or value of a4.");
        }
        if (manyTypes.a5 != (Float.MAX_VALUE / 0.1F)) {
            throw new RuntimeException("Invalid type or value of a5.");
        }
        if (manyTypes.a6 != Double.NEGATIVE_INFINITY) {
            throw new RuntimeException("Invalid type or value of a6.");
        }


        // logical type
        if (!manyTypes.tumbler) {
            throw new RuntimeException("Invalid type or value of tumbler.");
        }

        // reference types
        manyTypes.day = DaysOfTheWeek.Wednesday;
        if (!manyTypes.day.getClass().getName().equals("DaysOfTheWeek")) {
            throw new RuntimeException("Invalid type of day.");
        }

        manyTypes.month = Month.FEBRUARY;
        if (!manyTypes.month.getClass().getName().equals("java.time.Month")) {
            throw new RuntimeException("Invalid type of month.");
        }

        manyTypes.someName = "Trololosh";
        if (!manyTypes.someName.getClass().getName().equals("java.lang.String")) {
            throw new RuntimeException("Invalid type of someName.");
        }

        manyTypes.mail = "example@mail";
        if (!manyTypes.someName.getClass().getName().equals("java.lang.String")) {
            throw new RuntimeException("Invalid type of mail.");
        }
    }
}
