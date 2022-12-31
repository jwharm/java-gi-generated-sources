package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Loads XPM data into a new {@code GdkPixbuf}.
 */
@FunctionalInterface
public interface PixbufModuleLoadXpmDataFunc {
    org.gtk.gdkpixbuf.Pixbuf run(PointerString data);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress data) {
        var RESULT = run(new PointerString(data));
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufModuleLoadXpmDataFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
