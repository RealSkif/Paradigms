package seminar_3;

class ElectricSocket {
    void supply_electricity(){System.out.println("Electricity is provided");}
}

interface USPlugAdapter {
    void plug() ;
}
class PlugAdapter implements USPlugAdapter {

    private ElectricSocket electricSocket;

    public PlugAdapter(ElectricSocket electricSocket) {
        this.electricSocket = electricSocket;
    }

    @Override
    public void plug() {
        this.electricSocket.supply_electricity();
    }

    public static void main(String[] args) {
        PlugAdapter plugAdapter = new PlugAdapter(new ElectricSocket());
        plugAdapter.plug();
    }
}