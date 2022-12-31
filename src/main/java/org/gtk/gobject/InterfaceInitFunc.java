package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to initialize a new
 * interface.
 * <p>
 * This function should initialize all internal data and* allocate any
 * resources required by the interface.
 * <p>
 * The members of {@code iface_data} are guaranteed to have been filled with
 * zeros before this function is called.
 */
@FunctionalInterface
public interface InterfaceInitFunc {
    void run(org.gtk.gobject.TypeInterface gIface);

    @ApiStatus.Internal default void upcall(MemoryAddress gIface, MemoryAddress ifaceData) {
        run(org.gtk.gobject.TypeInterface.fromAddress.marshal(gIface, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InterfaceInitFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
