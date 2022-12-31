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
@FunctionalInterface
public interface ValueTransform {
    void run(org.gtk.gobject.Value srcValue, org.gtk.gobject.Value destValue);

    @ApiStatus.Internal default void upcall(MemoryAddress srcValue, MemoryAddress destValue) {
        run(org.gtk.gobject.Value.fromAddress.marshal(srcValue, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(destValue, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueTransform.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
