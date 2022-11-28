package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different types of QoS events that can be given to the
 * gst_event_new_qos() method.
 */
public class QOSType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstQOSType";
    
    /**
     * The QoS event type that is produced when upstream
     *    elements are producing data too quickly and the element can't keep up
     *    processing the data. Upstream should reduce their production rate. This
     *    type is also used when buffers arrive early or in time.
     */
    public static final QOSType OVERFLOW = new QOSType(0);
    
    /**
     * The QoS event type that is produced when upstream
     *    elements are producing data too slowly and need to speed up their
     *    production rate.
     */
    public static final QOSType UNDERFLOW = new QOSType(1);
    
    /**
     * The QoS event type that is produced when the
     *    application enabled throttling to limit the data rate.
     */
    public static final QOSType THROTTLE = new QOSType(2);
    
    public QOSType(int value) {
        super(value);
    }
}
