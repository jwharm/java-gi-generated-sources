package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GdkDrop} object represents the target of an ongoing DND operation.
 * <p>
 * Possible drop sites get informed about the status of the ongoing drag
 * operation with events of type {@link EventType#DRAG_ENTER}, {@link EventType#DRAG_LEAVE},
 * {@link EventType#DRAG_MOTION} and {@link EventType#DROP_START}. The {@code GdkDrop} object can be obtained
 * from these {@link Event}.
 * <p>
 * The actual data transfer is initiated from the target side via an async
 * read, using one of the {@code GdkDrop} methods for this purpose:
 * {@link Drop#readAsync} or {@link Drop#readValueAsync}.
 * <p>
 * GTK provides a higher level abstraction based on top of these functions,
 * and so they are not normally needed in GTK applications. See the
 * "Drag and Drop" section of the GTK documentation for more information.
 */
public class Drop extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Drop(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Drop */
    public static Drop castFrom(org.gtk.gobject.Object gobject) {
        return new Drop(gobject.refcounted());
    }
    
    /**
     * Ends the drag operation after a drop.
     * <p>
     * The {@code action} must be a single action selected from the actions
     * available via {@link Drop#getActions}.
     * @param action the action performed by the destination or 0 if the drop failed
     */
    public void finish(@NotNull org.gtk.gdk.DragAction action) {
        java.util.Objects.requireNonNull(action, "Parameter 'action' must not be null");
        try {
            DowncallHandles.gdk_drop_finish.invokeExact(handle(), action.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the possible actions for this {@code GdkDrop}.
     * <p>
     * If this value contains multiple actions - i.e.
     * {@link DragAction#isUnique} returns {@code false} for the result -
     * {@link Drop#finish} must choose the action to use when
     * accepting the drop. This will only happen if you passed
     * {@link DragAction#ASK} as one of the possible actions in
     * {@link Drop#status}. {@link DragAction#ASK} itself will not
     * be included in the actions returned by this function.
     * <p>
     * This value may change over the lifetime of the {@link Drop}
     * both as a response to source side actions as well as to calls to
     * {@link Drop#status} or {@link Drop#finish}. The source
     * side will not change this value anymore once a drop has started.
     * @return The possible {@code GdkDragActions}
     */
    public @NotNull org.gtk.gdk.DragAction getActions() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_drop_get_actions.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DragAction(RESULT);
    }
    
    /**
     * Returns the {@code GdkDevice} performing the drop.
     * @return The {@code GdkDevice} performing the drop.
     */
    public @NotNull org.gtk.gdk.Device getDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_get_device.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Device(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the {@code GdkDisplay} that {@code self} was created for.
     * @return a {@code GdkDisplay}
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(Refcounted.get(RESULT, false));
    }
    
    /**
     * If this is an in-app drag-and-drop operation, returns the {@code GdkDrag}
     * that corresponds to this drop.
     * <p>
     * If it is not, {@code null} is returned.
     * @return the corresponding {@code GdkDrag}
     */
    public @Nullable org.gtk.gdk.Drag getDrag() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_get_drag.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Drag(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the {@code GdkContentFormats} that the drop offers the data
     * to be read in.
     * @return The possible {@code GdkContentFormats}
     */
    public @NotNull org.gtk.gdk.ContentFormats getFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_get_formats.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the {@code GdkSurface} performing the drop.
     * @return The {@code GdkSurface} performing the drop.
     */
    public @NotNull org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_get_surface.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Surface(Refcounted.get(RESULT, false));
    }
    
    /**
     * Asynchronously read the dropped data from a {@code GdkDrop}
     * in a format that complies with one of the mime types.
     * @param mimeTypes pointer to an array of mime types
     * @param ioPriority the I/O priority for the read operation
     * @param cancellable optional {@code GCancellable} object
     * @param callback a {@code GAsyncReadyCallback} to call when
     *   the request is satisfied
     */
    public void readAsync(java.lang.String[] mimeTypes, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(mimeTypes, "Parameter 'mimeTypes' must not be null");
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.gdk_drop_read_async.invokeExact(handle(), Interop.allocateNativeArray(mimeTypes, false), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an async drop read operation.
     * <p>
     * Note that you must not use blocking read calls on the returned stream
     * in the GTK thread, since some platforms might require communication with
     * GTK to complete the data transfer. You can use async APIs such as
     * g_input_stream_read_bytes_async().
     * <p>
     * See {@link Drop#readAsync}.
     * @param result a {@code GAsyncResult}
     * @param outMimeType return location for the used mime type
     * @return the {@code GInputStream}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable org.gtk.gio.InputStream readFinish(@NotNull org.gtk.gio.AsyncResult result, @NotNull Out<java.lang.String> outMimeType) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        java.util.Objects.requireNonNull(outMimeType, "Parameter 'outMimeType' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment outMimeTypePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_read_finish.invokeExact(handle(), result.handle(), (Addressable) outMimeTypePOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        outMimeType.set(outMimeTypePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        return new org.gtk.gio.InputStream(Refcounted.get(RESULT, true));
    }
    
    /**
     * Asynchronously request the drag operation's contents converted
     * to the given {@code type}.
     * <p>
     * When the operation is finished {@code callback} will be called. You must
     * then call {@link Drop#readValueFinish} to get the resulting
     * {@code GValue}.
     * <p>
     * For local drag-and-drop operations that are available in the given
     * {@code GType}, the value will be copied directly. Otherwise, GDK will
     * try to use {@link Gdk#contentDeserializeAsync} to convert the data.
     * @param type a {@code GType} to read
     * @param ioPriority the I/O priority of the request.
     * @param cancellable optional {@code GCancellable} object, {@code null} to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public void readValueAsync(@NotNull org.gtk.glib.Type type, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNullElse(cancellable, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        try {
            DowncallHandles.gdk_drop_read_value_async.invokeExact(handle(), type.getValue(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.Callbacks.class, "cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finishes an async drop read.
     * <p>
     * See {@link Drop#readValueAsync}.
     * @param result a {@code GAsyncResult}
     * @return a {@code GValue} containing the result.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gobject.Value readValueFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(result, "Parameter 'result' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_read_value_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
    }
    
    /**
     * Selects all actions that are potentially supported by the destination.
     * <p>
     * When calling this function, do not restrict the passed in actions to
     * the ones provided by {@link Drop#getActions}. Those actions may
     * change in the future, even depending on the actions you provide here.
     * <p>
     * The {@code preferred} action is a hint to the drag-and-drop mechanism about which
     * action to use when multiple actions are possible.
     * <p>
     * This function should be called by drag destinations in response to
     * {@link EventType#DRAG_ENTER} or {@link EventType#DRAG_MOTION} events. If the destination does
     * not yet know the exact actions it supports, it should set any possible
     * actions first and then later call this function again.
     * @param actions Supported actions of the destination, or 0 to indicate
     *    that a drop will not be accepted
     * @param preferred A unique action that's a member of {@code actions} indicating the
     *    preferred action
     */
    public void status(@NotNull org.gtk.gdk.DragAction actions, @NotNull org.gtk.gdk.DragAction preferred) {
        java.util.Objects.requireNonNull(actions, "Parameter 'actions' must not be null");
        java.util.Objects.requireNonNull(preferred, "Parameter 'preferred' must not be null");
        try {
            DowncallHandles.gdk_drop_status.invokeExact(handle(), actions.getValue(), preferred.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_drop_finish = Interop.downcallHandle(
            "gdk_drop_finish",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gdk_drop_get_actions = Interop.downcallHandle(
            "gdk_drop_get_actions",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_drop_get_device = Interop.downcallHandle(
            "gdk_drop_get_device",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_drop_get_display = Interop.downcallHandle(
            "gdk_drop_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_drop_get_drag = Interop.downcallHandle(
            "gdk_drop_get_drag",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_drop_get_formats = Interop.downcallHandle(
            "gdk_drop_get_formats",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_drop_get_surface = Interop.downcallHandle(
            "gdk_drop_get_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_drop_read_async = Interop.downcallHandle(
            "gdk_drop_read_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_drop_read_finish = Interop.downcallHandle(
            "gdk_drop_read_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_drop_read_value_async = Interop.downcallHandle(
            "gdk_drop_read_value_async",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_drop_read_value_finish = Interop.downcallHandle(
            "gdk_drop_read_value_finish",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gdk_drop_status = Interop.downcallHandle(
            "gdk_drop_status",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
        );
    }
}
