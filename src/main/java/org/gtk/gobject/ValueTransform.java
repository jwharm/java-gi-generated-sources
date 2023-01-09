package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of value transformation functions which can be registered with
 * g_value_register_transform_func().
 * <p>
 * {@code dest_value} will be initialized to the correct destination type.
 */
/**
 * Functional interface declaration of the {@code ValueTransform} callback.
 */
@FunctionalInterface
public interface ValueTransform {

    /**
     * The type of value transformation functions which can be registered with
     * g_value_register_transform_func().
     * <p>
     * {@code dest_value} will be initialized to the correct destination type.
     */
    void run(org.gtk.gobject.Value srcValue, org.gtk.gobject.Value destValue);
    
    @ApiStatus.Internal default void upcall(MemoryAddress srcValue, MemoryAddress destValue) {
        run(org.gtk.gobject.Value.fromAddress.marshal(srcValue, null), org.gtk.gobject.Value.fromAddress.marshal(destValue, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueTransform.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
