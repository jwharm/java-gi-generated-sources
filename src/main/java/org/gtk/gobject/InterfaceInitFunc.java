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
/**
 * Functional interface declaration of the {@code InterfaceInitFunc} callback.
 */
@FunctionalInterface
public interface InterfaceInitFunc {

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
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InterfaceInitFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
