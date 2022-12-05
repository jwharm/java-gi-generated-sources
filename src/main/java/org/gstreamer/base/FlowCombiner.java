package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Utility struct to help handling {@link org.gstreamer.gst.FlowReturn} combination. Useful for
 * {@link org.gstreamer.gst.Element}&lt;!-- --&gt;s that have multiple source pads and need to combine
 * the different {@link org.gstreamer.gst.FlowReturn} for those pads.
 * <p>
 * {@link FlowCombiner} works by using the last {@link org.gstreamer.gst.FlowReturn} for all {@link org.gstreamer.gst.Pad}
 * it has in its list and computes the combined return value and provides
 * it to the caller.
 * <p>
 * To add a new pad to the {@link FlowCombiner} use gst_flow_combiner_add_pad().
 * The new {@link org.gstreamer.gst.Pad} is stored with a default value of {@link org.gstreamer.gst.FlowReturn#OK}.
 * <p>
 * In case you want a {@link org.gstreamer.gst.Pad} to be removed, use gst_flow_combiner_remove_pad().
 * <p>
 * Please be aware that this struct isn't thread safe as its designed to be
 *  used by demuxers, those usually will have a single thread operating it.
 * <p>
 * These functions will take refs on the passed {@link org.gstreamer.gst.Pad}&lt;!-- --&gt;s.
 * <p>
 * Aside from reducing the user's code size, the main advantage of using this
 * helper struct is to follow the standard rules for {@link org.gstreamer.gst.FlowReturn} combination.
 * These rules are:
 * <p>
 * * {@link org.gstreamer.gst.FlowReturn#EOS}: only if all returns are EOS too
 * * {@link org.gstreamer.gst.FlowReturn#NOT_LINKED}: only if all returns are NOT_LINKED too
 * * {@link org.gstreamer.gst.FlowReturn#ERROR} or below: if at least one returns an error return
 * * {@link org.gstreamer.gst.FlowReturn#NOT_NEGOTIATED}: if at least one returns a not-negotiated return
 * * {@link org.gstreamer.gst.FlowReturn#FLUSHING}: if at least one returns flushing
 * * {@link org.gstreamer.gst.FlowReturn#OK}: otherwise
 * <p>
 * {@link org.gstreamer.gst.FlowReturn#ERROR} or below, GST_FLOW_NOT_NEGOTIATED and GST_FLOW_FLUSHING are
 * returned immediately from the gst_flow_combiner_update_flow() function.
 * @version 1.4
 */
public class FlowCombiner extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstFlowCombiner";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link FlowCombiner}
     * @return A new, uninitialized @{link FlowCombiner}
     */
    public static FlowCombiner allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FlowCombiner newInstance = new FlowCombiner(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a FlowCombiner proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FlowCombiner(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_flow_combiner_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link FlowCombiner}, use gst_flow_combiner_free() to free it.
     */
    public FlowCombiner() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Adds a new {@link org.gstreamer.gst.Pad} to the {@link FlowCombiner}.
     * @param pad the {@link org.gstreamer.gst.Pad} that is being added
     */
    public void addPad(@NotNull org.gstreamer.gst.Pad pad) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        try {
            DowncallHandles.gst_flow_combiner_add_pad.invokeExact(
                    handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all pads from a {@link FlowCombiner} and resets it to its initial state.
     */
    public void clear() {
        try {
            DowncallHandles.gst_flow_combiner_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees a {@link FlowCombiner} struct and all its internal data.
     */
    public void free() {
        try {
            DowncallHandles.gst_flow_combiner_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increments the reference count on the {@link FlowCombiner}.
     * @return the {@link FlowCombiner}.
     */
    public @NotNull org.gstreamer.base.FlowCombiner ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_flow_combiner_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.base.FlowCombiner(RESULT, Ownership.FULL);
    }
    
    /**
     * Removes a {@link org.gstreamer.gst.Pad} from the {@link FlowCombiner}.
     * @param pad the {@link org.gstreamer.gst.Pad} to remove
     */
    public void removePad(@NotNull org.gstreamer.gst.Pad pad) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        try {
            DowncallHandles.gst_flow_combiner_remove_pad.invokeExact(
                    handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reset flow combiner and all pads to their initial state without removing pads.
     */
    public void reset() {
        try {
            DowncallHandles.gst_flow_combiner_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decrements the reference count on the {@link FlowCombiner}.
     */
    public void unref() {
        try {
            DowncallHandles.gst_flow_combiner_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Computes the combined flow return for the pads in it.
     * <p>
     * The {@link org.gstreamer.gst.FlowReturn} parameter should be the last flow return update for a pad
     * in this {@link FlowCombiner}. It will use this value to be able to shortcut some
     * combinations and avoid looking over all pads again. e.g. The last combined
     * return is the same as the latest obtained {@link org.gstreamer.gst.FlowReturn}.
     * @param fret the latest {@link org.gstreamer.gst.FlowReturn} received for a pad in this {@link FlowCombiner}
     * @return The combined {@link org.gstreamer.gst.FlowReturn}
     */
    public @NotNull org.gstreamer.gst.FlowReturn updateFlow(@NotNull org.gstreamer.gst.FlowReturn fret) {
        java.util.Objects.requireNonNull(fret, "Parameter 'fret' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_flow_combiner_update_flow.invokeExact(
                    handle(),
                    fret.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Sets the provided pad's last flow return to provided value and computes
     * the combined flow return for the pads in it.
     * <p>
     * The {@link org.gstreamer.gst.FlowReturn} parameter should be the last flow return update for a pad
     * in this {@link FlowCombiner}. It will use this value to be able to shortcut some
     * combinations and avoid looking over all pads again. e.g. The last combined
     * return is the same as the latest obtained {@link org.gstreamer.gst.FlowReturn}.
     * @param pad the {@link org.gstreamer.gst.Pad} whose {@link org.gstreamer.gst.FlowReturn} to update
     * @param fret the latest {@link org.gstreamer.gst.FlowReturn} received for a pad in this {@link FlowCombiner}
     * @return The combined {@link org.gstreamer.gst.FlowReturn}
     */
    public @NotNull org.gstreamer.gst.FlowReturn updatePadFlow(@NotNull org.gstreamer.gst.Pad pad, @NotNull org.gstreamer.gst.FlowReturn fret) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        java.util.Objects.requireNonNull(fret, "Parameter 'fret' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_flow_combiner_update_pad_flow.invokeExact(
                    handle(),
                    pad.handle(),
                    fret.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_flow_combiner_new = Interop.downcallHandle(
            "gst_flow_combiner_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_flow_combiner_add_pad = Interop.downcallHandle(
            "gst_flow_combiner_add_pad",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_flow_combiner_clear = Interop.downcallHandle(
            "gst_flow_combiner_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_flow_combiner_free = Interop.downcallHandle(
            "gst_flow_combiner_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_flow_combiner_ref = Interop.downcallHandle(
            "gst_flow_combiner_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_flow_combiner_remove_pad = Interop.downcallHandle(
            "gst_flow_combiner_remove_pad",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_flow_combiner_reset = Interop.downcallHandle(
            "gst_flow_combiner_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_flow_combiner_unref = Interop.downcallHandle(
            "gst_flow_combiner_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_flow_combiner_update_flow = Interop.downcallHandle(
            "gst_flow_combiner_update_flow",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_flow_combiner_update_pad_flow = Interop.downcallHandle(
            "gst_flow_combiner_update_pad_flow",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
