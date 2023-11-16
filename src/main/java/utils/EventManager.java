package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    private static Map<String, List<EventListener>> eventListeners = new HashMap<>();

    public static void addListener(String eventName, EventListener listener) {
        List<EventListener> listeners = eventListeners.getOrDefault(eventName, new ArrayList<>());
        listeners.add(listener);
        eventListeners.put(eventName, listeners);
    }

    public static void removeListener(String eventName, EventListener listener) {
        List<EventListener> listeners = eventListeners.get(eventName);
        if (listeners != null) {
            listeners.remove(listener);
        }
    }

    public static void fireEvent(String eventName, Object data) {
        List<EventListener> listeners = eventListeners.get(eventName);
        if (listeners != null) {
            for (EventListener listener : listeners) {
                listener.onEvent(eventName, data);
            }
        }
    }
}
