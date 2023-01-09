package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different return values for the {@link PadProbeCallback}.
 */
public enum PadProbeReturn implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * drop data in data probes. For push mode this means that
     *        the data item is not sent downstream. For pull mode, it means that
     *        the data item is not passed upstream. In both cases, no other probes
     *        are called for this item and {@link FlowReturn#OK} or {@code true} is returned to the
     *        caller.
     */
    DROP(0),
    
    /**
     * normal probe return value. This leaves the probe in
     *        place, and defers decisions about dropping or passing data to other
     *        probes, if any. If there are no other probes, the default behaviour
     *        for the probe type applies ('block' for blocking probes,
     *        and 'pass' for non-blocking probes).
     */
    OK(1),
    
    /**
     * remove this probe, passing the data. For blocking probes
     *        this will cause data flow to unblock, unless there are also other
     *        blocking probes installed.
     */
    REMOVE(2),
    
    /**
     * pass the data item in the block probe and block on the
     *        next item. Note, that if there are multiple pad probes installed and
     *        any probe returns PASS, the data will be passed.
     */
    PASS(3),
    
    /**
     * Data has been handled in the probe and will not be
     *        forwarded further. For events and buffers this is the same behaviour as
     *        {@link PadProbeReturn#DROP} (except that in this case you need to unref the buffer
     *        or event yourself). For queries it will also return {@code true} to the caller.
     *        The probe can also modify the {@link FlowReturn} value by using the
     *        {@code GST_PAD_PROBE_INFO_FLOW_RETURN}() accessor.
     *        Note that the resulting query must contain valid entries.
     *        Since: 1.6
     */
    HANDLED(4);
    
    private static final java.lang.String C_TYPE_NAME = "GstPadProbeReturn";
    
    private final int value;
    
    /**
     * Create a new PadProbeReturn for the provided value
     * @param numeric value the enum value
     */
    PadProbeReturn(int value) {
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
     * Create a new PadProbeReturn for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PadProbeReturn of(int value) {
        return switch (value) {
            case 0 -> DROP;
            case 1 -> OK;
            case 2 -> REMOVE;
            case 3 -> PASS;
            case 4 -> HANDLED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
