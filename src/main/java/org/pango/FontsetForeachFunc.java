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
@FunctionalInterface
public interface FontsetForeachFunc {
    boolean run(org.pango.Fontset fontset, org.pango.Font font);

    @ApiStatus.Internal default int upcall(MemoryAddress fontset, MemoryAddress font, MemoryAddress userData) {
        var RESULT = run((org.pango.Fontset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(fontset)), org.pango.Fontset.fromAddress).marshal(fontset, Ownership.NONE), (org.pango.Font) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(font)), org.pango.Font.fromAddress).marshal(font, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FontsetForeachFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
