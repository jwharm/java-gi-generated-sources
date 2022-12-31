package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function that gets called every time a region
 * of {@code pixbuf} is updated.
 * <p>
 * {@link PixbufLoader} uses a function of this type to emit the
 * "&lt;link linkend="GdkPixbufLoader-area-updated"&gt;area_updated&lt;/link&gt;"
 * signal.
 * @version 2.2
 */
@FunctionalInterface
public interface PixbufModuleUpdatedFunc {
    void run(org.gtk.gdkpixbuf.Pixbuf pixbuf, int x, int y, int width, int height);

    @ApiStatus.Internal default void upcall(MemoryAddress pixbuf, int x, int y, int width, int height, MemoryAddress userData) {
        run((org.gtk.gdkpixbuf.Pixbuf) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pixbuf)), org.gtk.gdkpixbuf.Pixbuf.fromAddress).marshal(pixbuf, Ownership.NONE), x, y, width, height);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PixbufModuleUpdatedFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
