package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to initialize a new
 * instance of a type.
 * <p>
 * This function initializes all instance members and allocates any resources
 * required by it.
 * <p>
 * Initialization of a derived instance involves calling all its parent
 * types instance initializers, so the class member of the instance
 * is altered during its initialization to always point to the class that
 * belongs to the type the current initializer was introduced for.
 * <p>
 * The extended members of {@code instance} are guaranteed to have been filled with
 * zeros before this function is called.
 */
/**
 * Functional interface declaration of the {@code InstanceInitFunc} callback.
 */
@FunctionalInterface
public interface InstanceInitFunc {

    /**
     * A callback function used by the type system to initialize a new
     * instance of a type.
     * <p>
     * This function initializes all instance members and allocates any resources
     * required by it.
     * <p>
     * Initialization of a derived instance involves calling all its parent
     * types instance initializers, so the class member of the instance
     * is altered during its initialization to always point to the class that
     * belongs to the type the current initializer was introduced for.
     * <p>
     * The extended members of {@code instance} are guaranteed to have been filled with
     * zeros before this function is called.
     */
    void run(org.gtk.gobject.TypeInstance instance, org.gtk.gobject.TypeClass gClass);
    
    @ApiStatus.Internal default void upcall(MemoryAddress instance, MemoryAddress gClass) {
        run(org.gtk.gobject.TypeInstance.fromAddress.marshal(instance, null), org.gtk.gobject.TypeClass.fromAddress.marshal(gClass, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InstanceInitFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
