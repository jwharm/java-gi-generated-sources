package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Simple thread function that runs an asynchronous operation and
 * checks for cancellation.
 */
/**
 * Functional interface declaration of the {@code SimpleAsyncThreadFunc} callback.
 */
@FunctionalInterface
public interface SimpleAsyncThreadFunc {

    /**
     * Simple thread function that runs an asynchronous operation and
     * checks for cancellation.
     */
    void run(org.gtk.gio.SimpleAsyncResult res, org.gtk.gobject.GObject object, @Nullable org.gtk.gio.Cancellable cancellable);
    
    @ApiStatus.Internal default void upcall(MemoryAddress res, MemoryAddress object, MemoryAddress cancellable) {
        run((org.gtk.gio.SimpleAsyncResult) Interop.register(res, org.gtk.gio.SimpleAsyncResult.fromAddress).marshal(res, null), (org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SimpleAsyncThreadFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
