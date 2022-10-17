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
 * from these {@code Gdk.DNDEvent.get_drop}.
 * <p>
 * The actual data transfer is initiated from the target side via an async
 * read, using one of the {@code GdkDrop} methods for this purpose:
 * {@code Gdk.Drop.read_value_async}.
 * <p>
 * GTK provides a higher level abstraction based on top of these functions,
 * and so they are not normally needed in GTK applications. See the
 * "Drag and Drop" section of the GTK documentation for more information.
 */
public class Drop extends org.gtk.gobject.Object {

    public Drop(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Drop */
    public static Drop castFrom(org.gtk.gobject.Object gobject) {
        return new Drop(gobject.refcounted());
    }
    
    private static final MethodHandle gdk_drop_finish = Interop.downcallHandle(
        "gdk_drop_finish",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Ends the drag operation after a drop.
     * <p>
     * The {@code action} must be a single action selected from the actions
     * available via {@link Drop#getActions}.
     */
    public @NotNull void finish(@NotNull DragAction action) {
        try {
            gdk_drop_finish.invokeExact(handle(), action.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_drop_get_actions = Interop.downcallHandle(
        "gdk_drop_get_actions",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the possible actions for this {@code GdkDrop}.
     * <p>
     * If this value contains multiple actions - i.e.
     * {@link Gdk#DragAction} returns {@code false} for the result -
     * {@link Drop#finish} must choose the action to use when
     * accepting the drop. This will only happen if you passed
     * {@link DragAction#ASK} as one of the possible actions in
     * {@link Drop#status}. {@link DragAction#ASK} itself will not
     * be included in the actions returned by this function.
     * <p>
     * This value may change over the lifetime of the {@link Drop}
     * both as a response to source side actions as well as to calls to
     * {@code Gdk.Drop.finish}. The source
     * side will not change this value anymore once a drop has started.
     */
    public @NotNull DragAction getActions() {
        int RESULT;
        try {
            RESULT = (int) gdk_drop_get_actions.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DragAction(RESULT);
    }
    
    private static final MethodHandle gdk_drop_get_device = Interop.downcallHandle(
        "gdk_drop_get_device",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkDevice} performing the drop.
     */
    public @NotNull Device getDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_drop_get_device.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Device(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_drop_get_display = Interop.downcallHandle(
        "gdk_drop_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GdkDisplay} that {@code self} was created for.
     */
    public @NotNull Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_drop_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Display(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_drop_get_drag = Interop.downcallHandle(
        "gdk_drop_get_drag",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If this is an in-app drag-and-drop operation, returns the {@code GdkDrag}
     * that corresponds to this drop.
     * <p>
     * If it is not, {@code null} is returned.
     */
    public @Nullable Drag getDrag() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_drop_get_drag.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Drag(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_drop_get_formats = Interop.downcallHandle(
        "gdk_drop_get_formats",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkContentFormats} that the drop offers the data
     * to be read in.
     */
    public @NotNull ContentFormats getFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_drop_get_formats.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ContentFormats(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_drop_get_surface = Interop.downcallHandle(
        "gdk_drop_get_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkSurface} performing the drop.
     */
    public @NotNull Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_drop_get_surface.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Surface(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_drop_read_async = Interop.downcallHandle(
        "gdk_drop_read_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Asynchronously read the dropped data from a {@code GdkDrop}
     * in a format that complies with one of the mime types.
     */
    public @NotNull void readAsync(@NotNull java.lang.String[] mimeTypes, @NotNull int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_drop_read_async.invokeExact(handle(), Interop.allocateNativeArray(mimeTypes), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_drop_read_finish = Interop.downcallHandle(
        "gdk_drop_read_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an async drop read operation.
     * <p>
     * Note that you must not use blocking read calls on the returned stream
     * in the GTK thread, since some platforms might require communication with
     * GTK to complete the data transfer. You can use async APIs such as
     * g_input_stream_read_bytes_async().
     * <p>
     * See {@link Drop#readAsync}.
     */
    public @Nullable org.gtk.gio.InputStream readFinish(@NotNull org.gtk.gio.AsyncResult result, @NotNull Out<java.lang.String> outMimeType) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment outMimeTypePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_drop_read_finish.invokeExact(handle(), result.handle(), (Addressable) outMimeTypePOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        outMimeType.set(outMimeTypePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.InputStream(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gdk_drop_read_value_async = Interop.downcallHandle(
        "gdk_drop_read_value_async",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void readValueAsync(@NotNull org.gtk.gobject.Type type, @NotNull int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            gdk_drop_read_value_async.invokeExact(handle(), type.getValue(), ioPriority, cancellable.handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gdk.class, "__cbAsyncReadyCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gdk_drop_read_value_finish = Interop.downcallHandle(
        "gdk_drop_read_value_finish",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finishes an async drop read.
     * <p>
     * See {@link Drop#readValueAsync}.
     */
    public @NotNull org.gtk.gobject.Value readValueFinish(@NotNull org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gdk_drop_read_value_finish.invokeExact(handle(), result.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gdk_drop_status = Interop.downcallHandle(
        "gdk_drop_status",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public @NotNull void status(@NotNull DragAction actions, @NotNull DragAction preferred) {
        try {
            gdk_drop_status.invokeExact(handle(), actions.getValue(), preferred.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
