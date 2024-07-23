public class staff extends School {
    String position;
    String nrc;
    public staff(String name, String address,String phno,String position,String nrc) {
        super(name, address, phno);
        this.nrc = nrc;
        this.position = position;
    }
    public String getNrc() {
        return nrc;
    }
    public String getPosition() {
        return position;
    }
}
