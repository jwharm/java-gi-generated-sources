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
public class Drop extends org.gtk.gobject.GObject {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDrop";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Drop proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Drop(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Drop> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Drop(input, ownership);
    
    /**
     * Ends the drag operation after a drop.
     * <p>
     * The {@code action} must be a single action selected from the actions
     * available via {@link Drop#getActions}.
     * @param action the action performed by the destination or 0 if the drop failed
     */
    public void finish(org.gtk.gdk.DragAction action) {
        try {
            DowncallHandles.gdk_drop_finish.invokeExact(
                    handle(),
                    action.getValue());
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
    public org.gtk.gdk.DragAction getActions() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_drop_get_actions.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DragAction(RESULT);
    }
    
    /**
     * Returns the {@code GdkDevice} performing the drop.
     * @return The {@code GdkDevice} performing the drop.
     */
    public org.gtk.gdk.Device getDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_get_device.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Device) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Device.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code GdkDisplay} that {@code self} was created for.
     * @return a {@code GdkDisplay}
     */
    public org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Display) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Display.fromAddress).marshal(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_get_drag.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Drag) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Drag.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@code GdkContentFormats} that the drop offers the data
     * to be read in.
     * @return The possible {@code GdkContentFormats}
     */
    public org.gtk.gdk.ContentFormats getFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_get_formats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ContentFormats.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@code GdkSurface} performing the drop.
     * @return The {@code GdkSurface} performing the drop.
     */
    public org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_get_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Surface) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Surface.fromAddress).marshal(RESULT, Ownership.NONE);
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
        try {
            DowncallHandles.gdk_drop_read_async.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(mimeTypes, false),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
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
    public @Nullable org.gtk.gio.InputStream readFinish(org.gtk.gio.AsyncResult result, Out<java.lang.String> outMimeType) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment outMimeTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_read_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) outMimeTypePOINTER.address(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        outMimeType.set(Marshal.addressToString.marshal(outMimeTypePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        return (org.gtk.gio.InputStream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.InputStream.fromAddress).marshal(RESULT, Ownership.FULL);
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
    public void readValueAsync(org.gtk.glib.Type type, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback) {
        try {
            DowncallHandles.gdk_drop_read_value_async.invokeExact(
                    handle(),
                    type.getValue().longValue(),
                    ioPriority,
                    (Addressable) (cancellable == null ? MemoryAddress.NULL : cancellable.handle()),
                    (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback.toCallback()),
                    (Addressable) MemoryAddress.NULL);
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
    public org.gtk.gobject.Value readValueFinish(org.gtk.gio.AsyncResult result) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drop_read_value_finish.invokeExact(
                    handle(),
                    result.handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, Ownership.NONE);
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
    public void status(org.gtk.gdk.DragAction actions, org.gtk.gdk.DragAction preferred) {
        try {
            DowncallHandles.gdk_drop_status.invokeExact(
                    handle(),
                    actions.getValue(),
                    preferred.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_drop_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Drop.Builder} object constructs a {@link Drop} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Drop.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Drop} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Drop}.
         * @return A new instance of {@code Drop} with the properties 
         *         that were set in the Builder object.
         */
        public Drop build() {
            return (Drop) org.gtk.gobject.GObject.newWithProperties(
                Drop.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The possible actions for this drop
         * @param actions The value for the {@code actions} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActions(org.gtk.gdk.DragAction actions) {
            names.add("actions");
            values.add(org.gtk.gobject.Value.create(actions));
            return this;
        }
        
        /**
         * The {@code GdkDevice} performing the drop
         * @param device The value for the {@code device} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDevice(org.gtk.gdk.Device device) {
            names.add("device");
            values.add(org.gtk.gobject.Value.create(device));
            return this;
        }
        
        /**
         * The {@code GdkDisplay} that the drop belongs to.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * The {@code GdkDrag} that initiated this drop
         * @param drag The value for the {@code drag} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDrag(org.gtk.gdk.Drag drag) {
            names.add("drag");
            values.add(org.gtk.gobject.Value.create(drag));
            return this;
        }
        
        /**
         * The possible formats that the drop can provide its data in.
         * @param formats The value for the {@code formats} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFormats(org.gtk.gdk.ContentFormats formats) {
            names.add("formats");
            values.add(org.gtk.gobject.Value.create(formats));
            return this;
        }
        
        /**
         * The {@code GdkSurface} the drop happens on
         * @param surface The value for the {@code surface} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSurface(org.gtk.gdk.Surface surface) {
            names.add("surface");
            values.add(org.gtk.gobject.Value.create(surface));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_drop_finish = Interop.downcallHandle(
            "gdk_drop_finish",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_drop_get_actions = Interop.downcallHandle(
            "gdk_drop_get_actions",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drop_get_device = Interop.downcallHandle(
            "gdk_drop_get_device",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drop_get_display = Interop.downcallHandle(
            "gdk_drop_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drop_get_drag = Interop.downcallHandle(
            "gdk_drop_get_drag",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drop_get_formats = Interop.downcallHandle(
            "gdk_drop_get_formats",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drop_get_surface = Interop.downcallHandle(
            "gdk_drop_get_surface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drop_read_async = Interop.downcallHandle(
            "gdk_drop_read_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drop_read_finish = Interop.downcallHandle(
            "gdk_drop_read_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drop_read_value_async = Interop.downcallHandle(
            "gdk_drop_read_value_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drop_read_value_finish = Interop.downcallHandle(
            "gdk_drop_read_value_finish",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drop_status = Interop.downcallHandle(
            "gdk_drop_status",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_drop_get_type = Interop.downcallHandle(
            "gdk_drop_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
