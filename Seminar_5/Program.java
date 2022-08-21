public class Program {
    public static void main(String[] args) {
        /* Contact ct1 = new Contact();
        ct1.setFullNm("Иванов Иван Иванович");
        ct1.setPhone("+795123658741236"); */
        PhoneBook b1 = new PhoneBook();
        FileInputHelper fit = new FileInput();
        fit.read(b1, "Seminar_5/Book1.txt");
        //b1.addContact(ct1);
        ConsoleOutputHelper cop = new ConsoleOutput();
        cop.write(b1);
       /*  Contact ct2 = new Contact();
        ct2.setFullNm("Иванов Иван");
        ct2.setPhone("+795123658741237"); */
        //b1.updateContact(ct2);
        //cop.write(b1);
        FileOutputHelper fot = new FileOutput("Seminar_5/Book2.txt");
        fot.write(b1); 

    }
}
