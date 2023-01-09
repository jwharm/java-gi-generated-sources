package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback used when enumerating fonts in a fontset.
 * <p>
 * See {@link Fontset#foreach}.
 * @version 1.4
 */
/**
 * Functional interface declaration of the {@code FontsetForeachFunc} callback.
 */
@FunctionalInterface
public interface FontsetForeachFunc {

    /**
     * Callback used when enumerating fonts in a fontset.
     * <p>
     * See {@link Fontset#foreach}.
     * @version 1.4
     */
    boolean run(org.pango.Fontset fontset, org.pango.Font font);
    
    @ApiStatus.Internal default int upcall(MemoryAddress fontset, MemoryAddress font, MemoryAddress userData) {
        var RESULT = run((org.pango.Fontset) Interop.register(fontset, org.pango.Fontset.fromAddress).marshal(fontset, null), (org.pango.Font) Interop.register(font, org.pango.Font.fromAddress).marshal(font, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FontsetForeachFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
