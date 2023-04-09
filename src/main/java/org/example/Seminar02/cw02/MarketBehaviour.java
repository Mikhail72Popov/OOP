package org.example.Seminar02.cw02;

import java.util.List;

public interface MarketBehaviour {
    public void acceptToMarket(Human human);
    public void releaseFromMarket(Human human);
    public void update();
}
