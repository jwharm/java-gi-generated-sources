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
/**
 * Functional interface declaration of the {@code TypeInterfaceCheckFunc} callback.
 */
@FunctionalInterface
public interface TypeInterfaceCheckFunc {

    /**
     * A callback called after an interface vtable is initialized.
     * <p>
     * See g_type_add_interface_check().
     * @version 2.4
     */
    void run(org.gtk.gobject.TypeInterface gIface);
    
    @ApiStatus.Internal default void upcall(MemoryAddress checkData, MemoryAddress gIface) {
        run(org.gtk.gobject.TypeInterface.fromAddress.marshal(gIface, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TypeInterfaceCheckFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
