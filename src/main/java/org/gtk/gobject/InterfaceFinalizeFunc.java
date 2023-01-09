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
/**
 * Functional interface declaration of the {@code InterfaceFinalizeFunc} callback.
 */
@FunctionalInterface
public interface InterfaceFinalizeFunc {

    /**
     * A callback function used by the type system to finalize an interface.
     * <p>
     * This function should destroy any internal data and release any resources
     * allocated by the corresponding GInterfaceInitFunc() function.
     */
    void run(org.gtk.gobject.TypeInterface gIface);
    
    @ApiStatus.Internal default void upcall(MemoryAddress gIface, MemoryAddress ifaceData) {
        run(org.gtk.gobject.TypeInterface.fromAddress.marshal(gIface, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InterfaceFinalizeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
