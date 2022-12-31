package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function used to set the vtable of a
 * {@link PixbufModule} when it is loaded.
 * @version 2.2
 */
@FunctionalInterface
public interface PixbufModuleFillVtableFunc {
    void run(org.gtk.gdkpixbuf.PixbufModule module);

    @ApiStatus.Internal default void upcall(MemoryAddress module) {
        run(org.gtk.gdkpixbuf.PixbufModule.fromAddress.marshal(module, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufModuleFillVtableFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
