package org.gstreamer.insertbin;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the prototype of callbacks to be called when the operation completes.
 * It could be called at any time, including as a re-entrant call while the
 * operation is requested.
 */
/**
 * Functional interface declaration of the {@code InsertBinCallback} callback.
 */
@FunctionalInterface
public interface InsertBinCallback {

    /**
     * This is the prototype of callbacks to be called when the operation completes.
     * It could be called at any time, including as a re-entrant call while the
     * operation is requested.
     */
    void run(org.gstreamer.insertbin.InsertBin insertbin, org.gstreamer.gst.Element element, boolean success);
    
    @ApiStatus.Internal default void upcall(MemoryAddress insertbin, MemoryAddress element, int success, MemoryAddress userData) {
        run((org.gstreamer.insertbin.InsertBin) Interop.register(insertbin, org.gstreamer.insertbin.InsertBin.fromAddress).marshal(insertbin, null), (org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null), Marshal.integerToBoolean.marshal(success, null).booleanValue());
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertBinCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
