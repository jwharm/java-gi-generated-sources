package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This function type is used by g_vfs_register_uri_scheme() to make it
 * possible for a client to associate an URI scheme to a different {@link File}
 * implementation.
 * <p>
 * The client should return a reference to the new file that has been
 * created for {@code uri}, or {@code null} to continue with the default implementation.
 * @version 2.50
 */
@FunctionalInterface
public interface VfsFileLookupFunc {
    org.gtk.gio.File run(org.gtk.gio.Vfs vfs, java.lang.String identifier);

    @ApiStatus.Internal default Addressable upcall(MemoryAddress vfs, MemoryAddress identifier, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.Vfs) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vfs)), org.gtk.gio.Vfs.fromAddress).marshal(vfs, Ownership.NONE), Marshal.addressToString.marshal(identifier, null));
        return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VfsFileLookupFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
