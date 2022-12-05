package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Result values from gst_pad_link and friends.
 */
public enum PadLinkReturn implements io.github.jwharm.javagi.Enumeration {
    /**
     * link succeeded
     */
    OK(0),
    /**
     * pads have no common grandparent
     */
    WRONG_HIERARCHY(-1),
    /**
     * pad was already linked
     */
    WAS_LINKED(-2),
    /**
     * pads have wrong direction
     */
    WRONG_DIRECTION(-3),
    /**
     * pads do not have common format
     */
    NOFORMAT(-4),
    /**
     * pads cannot cooperate in scheduling
     */
    NOSCHED(-5),
    /**
     * refused for some reason
     */
    REFUSED(-6);
    
    private static final java.lang.String C_TYPE_NAME = "GstPadLinkReturn";
    
    private final int value;
    PadLinkReturn(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PadLinkReturn of(int value) {
        return switch (value) {
            case 0 -> OK;
            case -1 -> WRONG_HIERARCHY;
            case -2 -> WAS_LINKED;
            case -3 -> WRONG_DIRECTION;
            case -4 -> NOFORMAT;
            case -5 -> NOSCHED;
            case -6 -> REFUSED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
