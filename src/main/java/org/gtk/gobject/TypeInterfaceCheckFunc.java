package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback called after an interface vtable is initialized.
 * <p>
 * See g_type_add_interface_check().
 * @version 2.4
 */
@FunctionalInterface
public interface TypeInterfaceCheckFunc {
    void run(org.gtk.gobject.TypeInterface gIface);

    @ApiStatus.Internal default void upcall(MemoryAddress checkData, MemoryAddress gIface) {
        run(org.gtk.gobject.TypeInterface.fromAddress.marshal(gIface, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TypeInterfaceCheckFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
