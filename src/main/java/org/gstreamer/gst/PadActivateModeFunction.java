package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The prototype of the push and pull activate functions.
 */
/**
 * Functional interface declaration of the {@code PadActivateModeFunction} callback.
 */
@FunctionalInterface
public interface PadActivateModeFunction {

    /**
     * The prototype of the push and pull activate functions.
     */
    boolean run(org.gstreamer.gst.Pad pad, org.gstreamer.gst.GstObject parent, org.gstreamer.gst.PadMode mode, boolean active);
    
    @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress parent, int mode, int active) {
        var RESULT = run((org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null), (org.gstreamer.gst.GstObject) Interop.register(parent, org.gstreamer.gst.GstObject.fromAddress).marshal(parent, null), org.gstreamer.gst.PadMode.of(mode), Marshal.integerToBoolean.marshal(active, null).booleanValue());
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PadActivateModeFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
