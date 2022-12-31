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
@FunctionalInterface
public interface BindingTransformFunc {
    boolean run(org.gtk.gobject.Binding binding, org.gtk.gobject.Value fromValue, org.gtk.gobject.Value toValue);

    @ApiStatus.Internal default int upcall(MemoryAddress binding, MemoryAddress fromValue, MemoryAddress toValue, MemoryAddress userData) {
        var RESULT = run((org.gtk.gobject.Binding) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(binding)), org.gtk.gobject.Binding.fromAddress).marshal(binding, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(fromValue, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(toValue, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BindingTransformFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
