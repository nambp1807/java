package jv2_labsession6;

public class People {
        public int id;
         public String p_name;
         public String company;
         public String address;

    public People() {
    }

    public People(int id, String p_name, String company, String address) {
        this.id = id;
        this.p_name = p_name;
        this.company = company;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  p_name;
    }
}
