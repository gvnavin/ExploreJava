package gvnavin.guava.publish_subscribe_event_bus;

import com.google.common.eventbus.Subscribe;

import javax.swing.event.ChangeEvent;

public class EventBusChangeRecorder2 {
    @Subscribe
    public void recordCustomerChange(final ChangeEvent e) {
        System.out.println("e.toString() = " + e.toString());
    }
}
