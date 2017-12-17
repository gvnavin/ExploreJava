package gvnavin.guava.publish_subscribe_event_bus;

import com.google.common.eventbus.EventBus;

import javax.swing.event.ChangeEvent;

public class EVentBusMain {
    public static void main(final String[] args) {
        final EventBus eventBus = new EventBus();
        // somewhere during initialization
        eventBus.register(new EventBusChangeRecorder());
        eventBus.register(new EventBusChangeRecorder2());
        
        final ChangeEvent event = getChangeEvent();
        eventBus.post(event);
        
    }
    
    private static ChangeEvent getChangeEvent() {
        return new ChangeEvent("Hello world");
    }
}
