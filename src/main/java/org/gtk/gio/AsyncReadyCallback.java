package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type definition for a function that will be called back when an asynchronous
 * operation within GIO has been completed. {@link AsyncReadyCallback}
 * callbacks from {@link Task} are guaranteed to be invoked in a later
 * iteration of the
 * [thread-default main context][g-main-context-push-thread-default]
 * where the {@link Task} was created. All other users of
 * {@link AsyncReadyCallback} must likewise call it asynchronously in a
 * later iteration of the main context.
 * <p>
 * The asynchronous operation is guaranteed to have held a reference to
 * {@code source_object} from the time when the {@code *_async()} function was called, until
 * after this callback returns.
 */
/**
 * Functional interface declaration of the {@code AsyncReadyCallback} callback.
 */
@FunctionalInterface
public interface AsyncReadyCallback {

    /**
     * Type definition for a function that will be called back when an asynchronous
     * operation within GIO has been completed. {@link AsyncReadyCallback}
     * callbacks from {@link Task} are guaranteed to be invoked in a later
     * iteration of the
     * [thread-default main context][g-main-context-push-thread-default]
     * where the {@link Task} was created. All other users of
     * {@link AsyncReadyCallback} must likewise call it asynchronously in a
     * later iteration of the main context.
     * <p>
     * The asynchronous operation is guaranteed to have held a reference to
     * {@code source_object} from the time when the {@code *_async()} function was called, until
     * after this callback returns.
     */
    void run(@Nullable org.gtk.gobject.GObject sourceObject, org.gtk.gio.AsyncResult res);
    
    @ApiStatus.Internal default void upcall(MemoryAddress sourceObject, MemoryAddress res, MemoryAddress userData) {
        run((org.gtk.gobject.GObject) Interop.register(sourceObject, org.gtk.gobject.GObject.fromAddress).marshal(sourceObject, null), (org.gtk.gio.AsyncResult) Interop.register(res, org.gtk.gio.AsyncResult.fromAddress).marshal(res, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AsyncReadyCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
