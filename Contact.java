package main;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Contact implements Externalizable {
    private String name;

    public Contact() {
    }

    @Override
    public void writeExternal(ObjectOutput objectOut) throws IOException {
        objectOut.writeObject(name);
    }

    @Override
    public void readExternal(ObjectInput objectIn) throws IOException,
            ClassNotFoundException {
        name = (String) objectIn.readObject();
    }

    @Override
    public String toString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}