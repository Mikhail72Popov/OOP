package org.example.Seminar02.cw02;

public interface QueueBehavior {
    public void takelnQueue(Human human);
    public void takeOrders();
    public void giveOrders();
    public void releaseFromQueue();
}
