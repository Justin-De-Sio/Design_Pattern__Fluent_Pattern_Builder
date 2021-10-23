package fr.justin;

public class Main {

    public static void main(String[] args) {
//        User user = new User("Justin","De Sio","null","null");
        User user = new User.UserBuilder()
                .withLastName("Justin")
                .withFistName("De Sio")
                .build();

    }
}
