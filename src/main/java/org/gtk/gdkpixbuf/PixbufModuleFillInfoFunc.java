package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function used to fill a
 * {@link PixbufFormat} structure with information about a module.
 * @version 2.2
 */
@FunctionalInterface
public interface PixbufModuleFillInfoFunc {
    void run(org.gtk.gdkpixbuf.PixbufFormat info);

    @ApiStatus.Internal default void upcall(MemoryAddress info) {
        run(org.gtk.gdkpixbuf.PixbufFormat.fromAddress.marshal(info, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufModuleFillInfoFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
