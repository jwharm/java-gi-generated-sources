package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different types of QoS events that can be given to the
 * gst_event_new_qos() method.
 */
public enum QOSType implements io.github.jwharm.javagi.Enumeration {
    /**
     * The QoS event type that is produced when upstream
     *    elements are producing data too quickly and the element can't keep up
     *    processing the data. Upstream should reduce their production rate. This
     *    type is also used when buffers arrive early or in time.
     */
    OVERFLOW(0),
    /**
     * The QoS event type that is produced when upstream
     *    elements are producing data too slowly and need to speed up their
     *    production rate.
     */
    UNDERFLOW(1),
    /**
     * The QoS event type that is produced when the
     *    application enabled throttling to limit the data rate.
     */
    THROTTLE(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstQOSType";
    
    private final int value;
    QOSType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static QOSType of(int value) {
        return switch (value) {
            case 0 -> OVERFLOW;
            case 1 -> UNDERFLOW;
            case 2 -> THROTTLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
