package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * User function that is called to determine if the {@code item} should be matched.
 * <p>
 * If the filter matches the item, this function must return {@code true}. If the
 * item should be filtered out, {@code false} must be returned.
 */
@FunctionalInterface
public interface CustomFilterFunc {
    boolean run(org.gtk.gobject.GObject item);

    @ApiStatus.Internal default int upcall(MemoryAddress item, MemoryAddress userData) {
        var RESULT = run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(item)), org.gtk.gobject.GObject.fromAddress).marshal(item, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CustomFilterFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
