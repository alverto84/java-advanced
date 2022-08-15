import models.Person;

import static models.Person.Builder.aPerson;

public class Main {

    public static void main(String[] args) {
        Person p = aPerson()
                .withFirstname("Alberto")
                .withLastname("Dgz")
                .withPhone("123123123")
                .withEmail("alberto.dominguez@email.com")
                .build();


        if ("Dgz".equals(p.getLastname())) {
            System.out.println("Yes");
        }

    }

}
