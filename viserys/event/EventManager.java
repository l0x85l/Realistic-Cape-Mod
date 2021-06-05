package viserys.event;

import pisi.unitedmeows.eventapi.system.DefaultEventSystem;
import viserys.event.events.EventRenderPlayer;

public class EventManager {

    public static DefaultEventSystem INSTANCE = new DefaultEventSystem() {
        @Override
        public void setup() {
            registerEvent(EventRenderPlayer.class);
        }
    };
}
