package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Prototype for shortcuts based on user callbacks.
 */
@FunctionalInterface
public interface ShortcutFunc {
    boolean run(org.gtk.gtk.Widget widget, @Nullable org.gtk.glib.Variant args);

    @ApiStatus.Internal default int upcall(MemoryAddress widget, MemoryAddress args, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(args, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShortcutFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
