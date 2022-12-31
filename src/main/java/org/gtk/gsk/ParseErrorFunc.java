package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of callback that is called when an error occurs
 * during node deserialization.
 */
@FunctionalInterface
public interface ParseErrorFunc {
    void run(org.gtk.gsk.ParseLocation start, org.gtk.gsk.ParseLocation end, org.gtk.glib.Error error);

    @ApiStatus.Internal default void upcall(MemoryAddress start, MemoryAddress end, MemoryAddress error, MemoryAddress userData) {
        run(org.gtk.gsk.ParseLocation.fromAddress.marshal(start, Ownership.NONE), org.gtk.gsk.ParseLocation.fromAddress.marshal(end, Ownership.NONE), org.gtk.glib.Error.fromAddress.marshal(error, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ParseErrorFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
