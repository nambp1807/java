package jv2_labsession7;

public class Contact {
    Integer personID;
    String person_name;
    String company;
    String adress;

    public Contact() {
    }
    public Contact(String person_name, String company, String adress) {
        this.person_name = person_name;
        this.company = company;
        this.adress = adress;
    }
    public Contact(int personID, String person_name, String company, String adress) {
        this.personID = personID;
        this.person_name = person_name;
        this.company = company;
        this.adress = adress;
    }

    public Integer getPersonID() { return personID; }
    public void setPersonID(int personID) { this.personID = personID; }
    public String getPerson_name() { return person_name; }
    public void setPerson_name(String person_name) { this.person_name = person_name; }
    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }
    public String getAdress() { return adress; }
    public void setAdress(String adress) { this.adress = adress; }

    public String toString(){
        return getPersonID()+" - "+getPerson_name()
                +" - "+getAdress()+" - "+getCompany();
    }
}