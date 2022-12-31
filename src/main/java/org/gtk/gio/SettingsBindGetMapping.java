package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type for the function that is used to convert from {@link Settings} to
 * an object property. The {@code value} is already initialized to hold values
 * of the appropriate type.
 */
@FunctionalInterface
public interface SettingsBindGetMapping {
    boolean run(org.gtk.gobject.Value value, org.gtk.glib.Variant variant);

    @ApiStatus.Internal default int upcall(MemoryAddress value, MemoryAddress variant, MemoryAddress userData) {
        var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(variant, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SettingsBindGetMapping.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
