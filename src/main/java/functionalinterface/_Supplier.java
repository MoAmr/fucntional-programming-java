package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author Mohammed Amr
 * @created 16/12/2020 - 20:44
 * @project javafunctional
 */
public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionUrlsSupplier = () ->
            List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/customer"
            );
}
