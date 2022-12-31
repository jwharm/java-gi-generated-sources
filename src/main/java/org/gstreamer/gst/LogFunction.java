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
@FunctionalInterface
public interface LogFunction {
    void run(org.gstreamer.gst.DebugCategory category, org.gstreamer.gst.DebugLevel level, java.lang.String file, java.lang.String function, int line, org.gtk.gobject.GObject object, org.gstreamer.gst.DebugMessage message);

    @ApiStatus.Internal default void upcall(MemoryAddress category, int level, MemoryAddress file, MemoryAddress function, int line, MemoryAddress object, MemoryAddress message, MemoryAddress userData) {
        run(org.gstreamer.gst.DebugCategory.fromAddress.marshal(category, Ownership.NONE), org.gstreamer.gst.DebugLevel.of(level), Marshal.addressToString.marshal(file, null), Marshal.addressToString.marshal(function, null), line, (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE), org.gstreamer.gst.DebugMessage.fromAddress.marshal(message, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LogFunction.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
