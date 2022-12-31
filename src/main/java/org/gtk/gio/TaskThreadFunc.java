package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The prototype for a task function to be run in a thread via
 * g_task_run_in_thread() or g_task_run_in_thread_sync().
 * <p>
 * If the return-on-cancel flag is set on {@code task}, and {@code cancellable} gets
 * cancelled, then the {@link Task} will be completed immediately (as though
 * g_task_return_error_if_cancelled() had been called), without
 * waiting for the task function to complete. However, the task
 * function will continue running in its thread in the background. The
 * function therefore needs to be careful about how it uses
 * externally-visible state in this case. See
 * g_task_set_return_on_cancel() for more details.
 * <p>
 * Other than in that case, {@code task} will be completed when the
 * {@link TaskThreadFunc} returns, not when it calls a
 * {@code g_task_return_} function.
 * @version 2.36
 */
@FunctionalInterface
public interface TaskThreadFunc {
    void run(org.gtk.gio.Task task, org.gtk.gobject.GObject sourceObject, @Nullable org.gtk.gio.Cancellable cancellable);

    @ApiStatus.Internal default void upcall(MemoryAddress task, MemoryAddress sourceObject, MemoryAddress taskData, MemoryAddress cancellable) {
        run((org.gtk.gio.Task) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(task)), org.gtk.gio.Task.fromAddress).marshal(task, Ownership.NONE), (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sourceObject)), org.gtk.gobject.GObject.fromAddress).marshal(sourceObject, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TaskThreadFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
