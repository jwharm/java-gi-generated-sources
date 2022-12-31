package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Saves a {@code GdkPixbuf} by calling the provided function.
 * <p>
 * The optional {@code option_keys} and {@code option_values} arrays contain the keys and
 * values (in the same order) for attributes to be saved alongside the image
 * data.
 */
@FunctionalInterface
public interface PixbufModuleSaveCallbackFunc {
    boolean run(org.gtk.gdkpixbuf.PixbufSaveFunc saveFunc, org.gtk.gdkpixbuf.Pixbuf pixbuf, @Nullable PointerString optionKeys, @Nullable PointerString optionValues);

    @ApiStatus.Internal default int upcall(MemoryAddress saveFunc, MemoryAddress userData, MemoryAddress pixbuf, MemoryAddress optionKeys, MemoryAddress optionValues) {
        var RESULT = run(null /* Unsupported parameter type */, (org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pixbuf)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(pixbuf, Ownership.NONE), new PointerString(optionKeys), new PointerString(optionValues));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufModuleSaveCallbackFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
