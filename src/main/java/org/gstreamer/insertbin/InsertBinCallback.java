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
@FunctionalInterface
public interface InsertBinCallback {
    void run(org.gstreamer.insertbin.InsertBin insertbin, org.gstreamer.gst.Element element, boolean success);

    @ApiStatus.Internal default void upcall(MemoryAddress insertbin, MemoryAddress element, int success, MemoryAddress userData) {
        run((org.gstreamer.insertbin.InsertBin) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(insertbin)), org.gstreamer.insertbin.InsertBin.fromAddress).marshal(insertbin, Ownership.NONE), (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(element)), org.gstreamer.gst.Element.fromAddress).marshal(element, Ownership.NONE), Marshal.integerToBoolean.marshal(success, null).booleanValue());
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InsertBinCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
