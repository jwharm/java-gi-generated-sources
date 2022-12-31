package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of functions which are used to translate user-visible
 * strings, for &lt;option&gt;--help&lt;/option&gt; output.
 */
@FunctionalInterface
public interface TranslateFunc {
    java.lang.String run(java.lang.String str);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress str, MemoryAddress userData) {
        var RESULT = run(Marshal.addressToString.marshal(str, null));
        return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TranslateFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
