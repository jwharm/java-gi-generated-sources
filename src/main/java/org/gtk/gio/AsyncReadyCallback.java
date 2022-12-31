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
@FunctionalInterface
public interface AsyncReadyCallback {
    void run(@Nullable org.gtk.gobject.GObject sourceObject, org.gtk.gio.AsyncResult res);

    @ApiStatus.Internal default void upcall(MemoryAddress sourceObject, MemoryAddress res, MemoryAddress userData) {
        run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sourceObject)), org.gtk.gobject.GObject.fromAddress).marshal(sourceObject, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(res)), org.gtk.gio.AsyncResult.fromAddress).marshal(res, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AsyncReadyCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
