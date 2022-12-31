package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to finalize an interface.
 * <p>
 * This function should destroy any internal data and release any resources
 * allocated by the corresponding GInterfaceInitFunc() function.
 */
@FunctionalInterface
public interface InterfaceFinalizeFunc {
    void run(org.gtk.gobject.TypeInterface gIface);

    @ApiStatus.Internal default void upcall(MemoryAddress gIface, MemoryAddress ifaceData) {
        run(org.gtk.gobject.TypeInterface.fromAddress.marshal(gIface, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceFinalizeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
