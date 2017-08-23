
package main;
/**
 * Created by vadim_vil on 22.08.2017.
 */

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;

    @Override
    public String toString() {
        return "Employee {name = " + name + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}