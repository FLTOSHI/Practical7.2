public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("12345", "Антон Питерский", "iPhone 15", 0.2);
        Phone phone2 = new Phone("54321", "Даша Новгородская");
        Phone phone3 = new Phone();

        System.out.println(phone1.getReceiveCall("Виолетта Саратовская"));
        System.out.println(phone2.getReceiveCall("Вениамин Сочинский", "987654"));
        System.out.println("Номер телефона phone3: " + phone3.getNumber());
    }
}