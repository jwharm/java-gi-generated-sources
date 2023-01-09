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
/**
 * Functional interface declaration of the {@code TaskThreadFunc} callback.
 */
@FunctionalInterface
public interface TaskThreadFunc {

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
    void run(org.gtk.gio.Task task, org.gtk.gobject.GObject sourceObject, @Nullable org.gtk.gio.Cancellable cancellable);
    
    @ApiStatus.Internal default void upcall(MemoryAddress task, MemoryAddress sourceObject, MemoryAddress taskData, MemoryAddress cancellable) {
        run((org.gtk.gio.Task) Interop.register(task, org.gtk.gio.Task.fromAddress).marshal(task, null), (org.gtk.gobject.GObject) Interop.register(sourceObject, org.gtk.gobject.GObject.fromAddress).marshal(sourceObject, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TaskThreadFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
