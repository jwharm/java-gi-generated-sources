package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function signature to handle a unlinking the pad prom its peer.
 * <p>
 * The pad's lock is already held when the unlink function is called, so most
 * pad functions cannot be called from within the callback.
 */
/**
 * Functional interface declaration of the {@code PadUnlinkFunction} callback.
 */
@FunctionalInterface
public interface PadUnlinkFunction {

    /**
     * Function signature to handle a unlinking the pad prom its peer.
     * <p>
     * The pad's lock is already held when the unlink function is called, so most
     * pad functions cannot be called from within the callback.
     */
    void run(org.gstreamer.gst.Pad pad, @Nullable org.gstreamer.gst.GstObject parent);
    
    @ApiStatus.Internal default void upcall(MemoryAddress pad, MemoryAddress parent) {
        run((org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null), (org.gstreamer.gst.GstObject) Interop.register(parent, org.gstreamer.gst.GstObject.fromAddress).marshal(parent, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PadUnlinkFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
