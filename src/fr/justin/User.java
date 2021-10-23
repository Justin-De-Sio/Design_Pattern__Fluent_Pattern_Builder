package fr.justin;

public class User {
    private String lastName;
    private String firstName;
    private String phone;
    private String address;

    public static class UserBuilder {
        private String lastName="none";
        private String firstName="none";
        private String phone="none";
        private String address="none";

        public UserBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder withFistName(String lastName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder withPhoneName(String lastName) {
            this.phone = phone;
            return this;
        }

        public UserBuilder withAddressName(String lastName) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User();
            user.firstName = firstName;
            user.lastName = lastName;
            user.phone = phone;
            user.address = address;
            return user;
        }
    }

}
