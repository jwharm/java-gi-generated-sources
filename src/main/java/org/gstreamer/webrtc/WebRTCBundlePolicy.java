package org.gstreamer.webrtc;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * See https://tools.ietf.org/html/draft-ietf-rtcweb-jsep-24{@code section}-4.1.1
 * for more information.
 * @version 1.16
 */
public enum WebRTCBundlePolicy implements io.github.jwharm.javagi.Enumeration {
    /**
     * none
     */
    NONE(0),
    /**
     * balanced
     */
    BALANCED(1),
    /**
     * max-compat
     */
    MAX_COMPAT(2),
    /**
     * max-bundle
     */
    MAX_BUNDLE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstWebRTCBundlePolicy";
    
    private final int value;
    WebRTCBundlePolicy(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static WebRTCBundlePolicy of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> BALANCED;
            case 2 -> MAX_COMPAT;
            case 3 -> MAX_BUNDLE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
