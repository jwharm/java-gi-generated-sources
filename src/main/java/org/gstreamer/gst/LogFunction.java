package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function prototype for a logging function that can be registered with
 * gst_debug_add_log_function().
 * Use G_GNUC_NO_INSTRUMENT on that function.
 */
/**
 * Functional interface declaration of the {@code LogFunction} callback.
 */
@FunctionalInterface
public interface LogFunction {

    /**
     * Function prototype for a logging function that can be registered with
     * gst_debug_add_log_function().
     * Use G_GNUC_NO_INSTRUMENT on that function.
     */
    void run(org.gstreamer.gst.DebugCategory category, org.gstreamer.gst.DebugLevel level, java.lang.String file, java.lang.String function, int line, org.gtk.gobject.GObject object, org.gstreamer.gst.DebugMessage message);
    
    @ApiStatus.Internal default void upcall(MemoryAddress category, int level, MemoryAddress file, MemoryAddress function, int line, MemoryAddress object, MemoryAddress message, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            run(org.gstreamer.gst.DebugCategory.fromAddress.marshal(category, null), org.gstreamer.gst.DebugLevel.of(level), Marshal.addressToString.marshal(file, null), Marshal.addressToString.marshal(function, null), line, (org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null), org.gstreamer.gst.DebugMessage.fromAddress.marshal(message, null));
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LogFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
