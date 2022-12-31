package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the function that is used to convert from a value stored
 * in a {@link Settings} to a value that is useful to the application.
 * <p>
 * If the value is successfully mapped, the result should be stored at
 * {@code result} and {@code true} returned.  If mapping fails (for example, if {@code value}
 * is not in the right format) then {@code false} should be returned.
 * <p>
 * If {@code value} is {@code null} then it means that the mapping function is being
 * given a "last chance" to successfully return a valid value.  {@code true}
 * must be returned in this case.
 */
@FunctionalInterface
public interface SettingsGetMapping {
    boolean run(org.gtk.glib.Variant value, @Nullable Out<java.lang.foreign.MemoryAddress> result);

    @ApiStatus.Internal default int upcall(MemoryAddress value, MemoryAddress result, MemoryAddress userData) {
        Out<java.lang.foreign.MemoryAddress> resultOUT = new Out<>(result);
        var RESULT = run(org.gtk.glib.Variant.fromAddress.marshal(value, Ownership.NONE), resultOUT);
        result.set(Interop.valueLayout.ADDRESS, 0, (Addressable) resultOUT.get());
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SettingsGetMapping.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
