package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type for the function that is used to convert an object property
 * value to a {@link org.gtk.glib.Variant} for storing it in {@link Settings}.
 */
@FunctionalInterface
public interface SettingsBindSetMapping {
    org.gtk.glib.Variant run(org.gtk.gobject.Value value, org.gtk.glib.VariantType expectedType);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress value, MemoryAddress expectedType, MemoryAddress userData) {
        var RESULT = run(org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), org.gtk.glib.VariantType.fromAddress.marshal(expectedType, Ownership.NONE));
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SettingsBindSetMapping.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
