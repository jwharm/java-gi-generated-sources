package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to finalize a class.
 * <p>
 * This function is rarely needed, as dynamically allocated class resources
 * should be handled by GBaseInitFunc() and GBaseFinalizeFunc().
 * <p>
 * Also, specification of a GClassFinalizeFunc() in the {@link TypeInfo}
 * structure of a static type is invalid, because classes of static types
 * will never be finalized (they are artificially kept alive when their
 * reference count drops to zero).
 */
/**
 * Functional interface declaration of the {@code ClassFinalizeFunc} callback.
 */
@FunctionalInterface
public interface ClassFinalizeFunc {

    /**
     * A callback function used by the type system to finalize a class.
     * <p>
     * This function is rarely needed, as dynamically allocated class resources
     * should be handled by GBaseInitFunc() and GBaseFinalizeFunc().
     * <p>
     * Also, specification of a GClassFinalizeFunc() in the {@link TypeInfo}
     * structure of a static type is invalid, because classes of static types
     * will never be finalized (they are artificially kept alive when their
     * reference count drops to zero).
     */
    void run(org.gtk.gobject.TypeClass gClass);
    
    @ApiStatus.Internal default void upcall(MemoryAddress gClass, MemoryAddress classData) {
        run(org.gtk.gobject.TypeClass.fromAddress.marshal(gClass, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ClassFinalizeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
