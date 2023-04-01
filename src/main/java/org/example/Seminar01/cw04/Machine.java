package org.example.cw04;

import java.util.ArrayList;

public interface Machine {
    Product getProduct(String name) throws IllegalStateException;

}
