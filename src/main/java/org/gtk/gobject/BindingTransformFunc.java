package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function to be called to transform {@code from_value} to {@code to_value}.
 * <p>
 * If this is the {@code transform_to} function of a binding, then {@code from_value}
 * is the {@code source_property} on the {@code source} object, and {@code to_value} is the
 * {@code target_property} on the {@code target} object. If this is the
 * {@code transform_from} function of a {@link BindingFlags#BIDIRECTIONAL} binding,
 * then those roles are reversed.
 * @version 2.26
 */
/**
 * Functional interface declaration of the {@code BindingTransformFunc} callback.
 */
@FunctionalInterface
public interface BindingTransformFunc {

    /**
     * A function to be called to transform {@code from_value} to {@code to_value}.
     * <p>
     * If this is the {@code transform_to} function of a binding, then {@code from_value}
     * is the {@code source_property} on the {@code source} object, and {@code to_value} is the
     * {@code target_property} on the {@code target} object. If this is the
     * {@code transform_from} function of a {@link BindingFlags#BIDIRECTIONAL} binding,
     * then those roles are reversed.
     * @version 2.26
     */
    boolean run(org.gtk.gobject.Binding binding, org.gtk.gobject.Value fromValue, org.gtk.gobject.Value toValue);
    
    @ApiStatus.Internal default int upcall(MemoryAddress binding, MemoryAddress fromValue, MemoryAddress toValue, MemoryAddress userData) {
        var RESULT = run((org.gtk.gobject.Binding) Interop.register(binding, org.gtk.gobject.Binding.fromAddress).marshal(binding, null), org.gtk.gobject.Value.fromAddress.marshal(fromValue, null), org.gtk.gobject.Value.fromAddress.marshal(toValue, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BindingTransformFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
