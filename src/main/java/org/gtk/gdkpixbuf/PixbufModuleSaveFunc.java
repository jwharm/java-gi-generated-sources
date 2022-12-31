package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Saves a {@code GdkPixbuf} into a standard C file stream.
 * <p>
 * The optional {@code param_keys} and {@code param_values} arrays contain the keys and
 * values (in the same order) for attributes to be saved alongside the image
 * data.
 */
@FunctionalInterface
public interface PixbufModuleSaveFunc {
    boolean run(@Nullable java.lang.foreign.MemoryAddress f, org.gtk.gdkpixbuf.Pixbuf pixbuf, @Nullable PointerString paramKeys, @Nullable PointerString paramValues);

    @ApiStatus.Internal default int upcall(MemoryAddress f, MemoryAddress pixbuf, MemoryAddress paramKeys, MemoryAddress paramValues) {
        var RESULT = run(f, (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pixbuf)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(pixbuf, Ownership.NONE), new PointerString(paramKeys), new PointerString(paramValues));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufModuleSaveFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
