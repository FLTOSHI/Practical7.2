public class Phone {
    private String number;
    private String name;
    private String model;
    private double weight;

    public Phone(String number, String name, String model, double weight) {
        this(number, name);
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public Phone() {
        this("undefined", "undefined");
    }

    public String getReceiveCall(String callerName) {
        return "Звонит " + callerName;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getReceiveCall(String callerName, String callerNumber) {
        return "Звонит " + callerName + ", номер " + callerNumber;
    }
}