public class ConsoleOutput implements DataOutputHelper{

    @Override
    public void write(PhoneBook b) {
        for (Contact item : b.getLs()) {
            System.out.println(item);
        }
        
    }
    
}
