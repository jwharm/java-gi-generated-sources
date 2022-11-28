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
public class PadMode extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstPadMode";
    
    /**
     * Pad will not handle dataflow
     */
    public static final PadMode NONE = new PadMode(0);
    
    /**
     * Pad handles dataflow in downstream push mode
     */
    public static final PadMode PUSH = new PadMode(1);
    
    /**
     * Pad handles dataflow in upstream pull mode
     */
    public static final PadMode PULL = new PadMode(2);
    
    public PadMode(int value) {
        super(value);
    }
    
    /**
     * Return the name of a pad mode, for use in debug messages mostly.
     * @param mode the pad mode
     * @return short mnemonic for pad mode {@code mode}
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.gst.PadMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pad_mode_get_name.invokeExact(
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_pad_mode_get_name = Interop.downcallHandle(
            "gst_pad_mode_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
