package jv2_labsession8;


import connector.Connector;
import jv2_session8.DataAccessObject;

import java.util.ArrayList;

public class DataAccessObjectPhoneNumber implements DataAccessObject<PhoneNumber> {
    @Override
    public boolean create(PhoneNumber phoneNumber) {
        return false;
    }

    @Override
    public int update(PhoneNumber phoneNumber) {
        return 0;
    }

    @Override
    public int delete(PhoneNumber phoneNumber) {
        Connector connector = Connector.getInstance();
        String sql = "DELETE FROM "+phoneNumber.tableName+" WHERE id="+phoneNumber.getId();
        return connector.updateQuery(sql)?1:0;
    }

    @Override
    public ArrayList<PhoneNumber> read() {
        return null;
    }

    @Override
    public PhoneNumber find(Integer id) {
        return null;
    }
}