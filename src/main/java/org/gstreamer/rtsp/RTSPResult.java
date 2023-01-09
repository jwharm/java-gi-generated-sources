package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Result codes from the RTSP functions.
 */
public enum RTSPResult implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no error
     */
    OK(0),
    
    /**
     * some unspecified error occurred
     */
    ERROR(-1),
    
    /**
     * invalid arguments were provided to a function
     */
    EINVAL(-2),
    
    /**
     * an operation was canceled
     */
    EINTR(-3),
    
    /**
     * no memory was available for the operation
     */
    ENOMEM(-4),
    
    /**
     * a host resolve error occurred
     */
    ERESOLV(-5),
    
    /**
     * function not implemented
     */
    ENOTIMPL(-6),
    
    /**
     * a system error occurred, errno contains more details
     */
    ESYS(-7),
    
    /**
     * a parsing error occurred
     */
    EPARSE(-8),
    
    /**
     * windows networking could not start
     */
    EWSASTART(-9),
    
    /**
     * windows networking stack has wrong version
     */
    EWSAVERSION(-10),
    
    /**
     * end-of-file was reached
     */
    EEOF(-11),
    
    /**
     * a network problem occurred, h_errno contains more details
     */
    ENET(-12),
    
    /**
     * the host is not an IP host
     */
    ENOTIP(-13),
    
    /**
     * a timeout occurred
     */
    ETIMEOUT(-14),
    
    /**
     * the tunnel GET request has been performed
     */
    ETGET(-15),
    
    /**
     * the tunnel POST request has been performed
     */
    ETPOST(-16),
    
    /**
     * last error
     */
    ELAST(-17);
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPResult";
    
    private final int value;
    
    /**
     * Create a new RTSPResult for the provided value
     * @param numeric value the enum value
     */
    RTSPResult(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new RTSPResult for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static RTSPResult of(int value) {
        return switch (value) {
            case 0 -> OK;
            case -1 -> ERROR;
            case -2 -> EINVAL;
            case -3 -> EINTR;
            case -4 -> ENOMEM;
            case -5 -> ERESOLV;
            case -6 -> ENOTIMPL;
            case -7 -> ESYS;
            case -8 -> EPARSE;
            case -9 -> EWSASTART;
            case -10 -> EWSAVERSION;
            case -11 -> EEOF;
            case -12 -> ENET;
            case -13 -> ENOTIP;
            case -14 -> ETIMEOUT;
            case -15 -> ETGET;
            case -16 -> ETPOST;
            case -17 -> ELAST;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
