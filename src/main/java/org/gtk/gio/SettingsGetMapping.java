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
/**
 * Functional interface declaration of the {@code SettingsGetMapping} callback.
 */
@FunctionalInterface
public interface SettingsGetMapping {

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
    boolean run(org.gtk.glib.Variant value, @Nullable Out<java.lang.foreign.MemoryAddress> result);
    
    @ApiStatus.Internal default int upcall(MemoryAddress value, MemoryAddress result, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            Out<java.lang.foreign.MemoryAddress> resultOUT = new Out<>(result);
            var RESULT = run(org.gtk.glib.Variant.fromAddress.marshal(value, null), resultOUT);
            result.set(Interop.valueLayout.ADDRESS, 0, (Addressable) resultOUT.get());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SettingsGetMapping.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
