public class Program {
    public static void main(String[] args) {
        Contact ct1 = new Contact();
        ct1.setFullNm("Иванов Иван Иванович");
        ct1.setPhone("+795123658741236");
        PhoneBook b1 = new PhoneBook();
        b1.addContact(ct1);
        ConsoleOutput cop = new ConsoleOutput();
        cop.write(b1);
        Contact ct2 = new Contact();
        ct2.setFullNm("Иванов Иван");
        ct2.setPhone("+795123658741237");
        b1.updateContact(ct2);
        cop.write(b1);

    }
}
