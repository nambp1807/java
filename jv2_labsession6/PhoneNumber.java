package jv2_labsession6;

public class PhoneNumber {

      public int id;
      public String phone;
      public String type;
      public int u_id;

    public PhoneNumber() {
    }

    public PhoneNumber(int id, String phone, String type, int u_id) {
        this.id = id;
        this.phone = phone;
        this.type = type;
        this.u_id = u_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    @Override
    public String toString() {
        return "Phone : "+phone+ "   Type : "+type;
    }
}
