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
/**
 * Functional interface declaration of the {@code VfsFileLookupFunc} callback.
 */
@FunctionalInterface
public interface VfsFileLookupFunc {

    /**
     * This function type is used by g_vfs_register_uri_scheme() to make it
     * possible for a client to associate an URI scheme to a different {@link File}
     * implementation.
     * <p>
     * The client should return a reference to the new file that has been
     * created for {@code uri}, or {@code null} to continue with the default implementation.
     * @version 2.50
     */
    org.gtk.gio.File run(org.gtk.gio.Vfs vfs, java.lang.String identifier);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress vfs, MemoryAddress identifier, MemoryAddress userData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run((org.gtk.gio.Vfs) Interop.register(vfs, org.gtk.gio.Vfs.fromAddress).marshal(vfs, null), Marshal.addressToString.marshal(identifier, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VfsFileLookupFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
