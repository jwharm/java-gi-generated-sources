package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The status of a GstPad. After activating a pad, which usually happens when the
 * parent element goes from READY to PAUSED, the GstPadMode defines if the
 * pad operates in push or pull mode.
 */
public enum PadMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * Pad will not handle dataflow
     */
    NONE(0),
    /**
     * Pad handles dataflow in downstream push mode
     */
    PUSH(1),
    /**
     * Pad handles dataflow in upstream pull mode
     */
    PULL(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstPadMode";
    
    private final int value;
    PadMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PadMode of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> PUSH;
            case 2 -> PULL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Return the name of a pad mode, for use in debug messages mostly.
     * @param mode the pad mode
     * @return short mnemonic for pad mode {@code mode}
     */
    public static java.lang.String getName(org.gstreamer.gst.PadMode mode) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_mode_get_name.invokeExact(
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_pad_mode_get_name = Interop.downcallHandle(
            "gst_pad_mode_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
