package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function to be used as callback when a parse error occurs.
 */
@FunctionalInterface
public interface OptionErrorFunc {
    void run(org.gtk.glib.OptionContext context, org.gtk.glib.OptionGroup group);

    @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress group, MemoryAddress userData) {
        run(org.gtk.glib.OptionContext.fromAddress.marshal(context, Ownership.NONE), org.gtk.glib.OptionGroup.fromAddress.marshal(group, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OptionErrorFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
