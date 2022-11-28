package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different types of URI direction.
 */
public class URIType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstURIType";
    
    /**
     * The URI direction is unknown
     */
    public static final URIType UNKNOWN = new URIType(0);
    
    /**
     * The URI is a consumer.
     */
    public static final URIType SINK = new URIType(1);
    
    /**
     * The URI is a producer.
     */
    public static final URIType SRC = new URIType(2);
    
    public URIType(int value) {
        super(value);
    }
}
