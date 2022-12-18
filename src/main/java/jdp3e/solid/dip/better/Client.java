package jdp3e.solid.dip.better;

public class Client {
    public static void main(String[] args) {
        System.out.println("A demo that follows teh DIP");

        Database database = new OracleDatabase();
        UserInterface userInterface = new UserInterface(database);

        userInterface.saveEmployeeId("E0001");

        database = new MySQLDatabase();

        userInterface = new UserInterface(database);
        userInterface.saveEmployeeId("E0002");
    }
}
