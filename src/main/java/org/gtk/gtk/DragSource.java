package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkDragSource} is an event controller to initiate Drag-And-Drop operations.
 * <p>
 * {@code GtkDragSource} can be set up with the necessary
 * ingredients for a DND operation ahead of time. This includes
 * the source for the data that is being transferred, in the form
 * of a {@link org.gtk.gdk.ContentProvider}, the desired action, and the icon to
 * use during the drag operation. After setting it up, the drag
 * source must be added to a widget as an event controller, using
 * {@link Widget#addController}.
 * <pre>{@code c
 * static void
 * my_widget_init (MyWidget *self)
 * {
 *   GtkDragSource *drag_source = gtk_drag_source_new ();
 * 
 *   g_signal_connect (drag_source, "prepare", G_CALLBACK (on_drag_prepare), self);
 *   g_signal_connect (drag_source, "drag-begin", G_CALLBACK (on_drag_begin), self);
 * 
 *   gtk_widget_add_controller (GTK_WIDGET (self), GTK_EVENT_CONTROLLER (drag_source));
 * }
 * }</pre>
 * <p>
 * Setting up the content provider and icon ahead of time only makes
 * sense when the data does not change. More commonly, you will want
 * to set them up just in time. To do so, {@code GtkDragSource} has
 * {@code Gtk.DragSource::prepare} and {@code Gtk.DragSource::drag-begin}
 * signals.
 * <p>
 * The ::prepare signal is emitted before a drag is started, and
 * can be used to set the content provider and actions that the
 * drag should be started with.
 * <pre>{@code c
 * static GdkContentProvider *
 * on_drag_prepare (GtkDragSource *source,
 *                  double         x,
 *                  double         y,
 *                  MyWidget      *self)
 * {
 *   // This widget supports two types of content: GFile objects
 *   // and GdkPixbuf objects; GTK will handle the serialization
 *   // of these types automatically
 *   GFile *file = my_widget_get_file (self);
 *   GdkPixbuf *pixbuf = my_widget_get_pixbuf (self);
 * 
 *   return gdk_content_provider_new_union ((GdkContentProvider *[2]) {
 *       gdk_content_provider_new_typed (G_TYPE_FILE, file),
 *       gdk_content_provider_new_typed (GDK_TYPE_PIXBUF, pixbuf),
 *     }, 2);
 * }
 * }</pre>
 * <p>
 * The ::drag-begin signal is emitted after the {@code GdkDrag} object has
 * been created, and can be used to set up the drag icon.
 * <pre>{@code c
 * static void
 * on_drag_begin (GtkDragSource *source,
 *                GdkDrag       *drag,
 *                MyWidget      *self)
 * {
 *   // Set the widget as the drag icon
 *   GdkPaintable *paintable = gtk_widget_paintable_new (GTK_WIDGET (self));
 *   gtk_drag_source_set_icon (source, paintable, 0, 0);
 *   g_object_unref (paintable);
 * }
 * }</pre>
 * <p>
 * During the DND operation, {@code GtkDragSource} emits signals that
 * can be used to obtain updates about the status of the operation,
 * but it is not normally necessary to connect to any signals,
 * except for one case: when the supported actions include
 * {@link org.gtk.gdk.DragAction#MOVE}, you need to listen for the
 * {@code Gtk.DragSource::drag-end} signal and delete the
 * data after it has been transferred.
 */
public class DragSource extends org.gtk.gtk.GestureSingle {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDragSource";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DragSource proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DragSource(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DragSource> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DragSource(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drag_source_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkDragSource} object.
     */
    public DragSource() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Cancels a currently ongoing drag operation.
     */
    public void dragCancel() {
        try {
            DowncallHandles.gtk_drag_source_drag_cancel.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the actions that are currently set on the {@code GtkDragSource}.
     * @return the actions set on {@code source}
     */
    public org.gtk.gdk.DragAction getActions() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drag_source_get_actions.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DragAction(RESULT);
    }
    
    /**
     * Gets the current content provider of a {@code GtkDragSource}.
     * @return the {@code GdkContentProvider} of {@code source}
     */
    public @Nullable org.gtk.gdk.ContentProvider getContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drag_source_get_content.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.ContentProvider) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.ContentProvider.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the underlying {@code GdkDrag} object for an ongoing drag.
     * @return the {@code GdkDrag} of the current
     *   drag operation
     */
    public @Nullable org.gtk.gdk.Drag getDrag() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drag_source_get_drag.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Drag) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Drag.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the actions on the {@code GtkDragSource}.
     * <p>
     * During a DND operation, the actions are offered to potential
     * drop targets. If {@code actions} include {@link org.gtk.gdk.DragAction#MOVE}, you need
     * to listen to the {@code Gtk.DragSource::drag-end} signal and
     * handle {@code delete_data} being {@code true}.
     * <p>
     * This function can be called before a drag is started,
     * or in a handler for the {@code Gtk.DragSource::prepare} signal.
     * @param actions the actions to offer
     */
    public void setActions(org.gtk.gdk.DragAction actions) {
        try {
            DowncallHandles.gtk_drag_source_set_actions.invokeExact(
                    handle(),
                    actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a content provider on a {@code GtkDragSource}.
     * <p>
     * When the data is requested in the cause of a DND operation,
     * it will be obtained from the content provider.
     * <p>
     * This function can be called before a drag is started,
     * or in a handler for the {@code Gtk.DragSource::prepare} signal.
     * <p>
     * You may consider setting the content provider back to
     * {@code null} in a {@code Gtk.DragSource::drag-end} signal handler.
     * @param content a {@code GdkContentProvider}
     */
    public void setContent(@Nullable org.gtk.gdk.ContentProvider content) {
        try {
            DowncallHandles.gtk_drag_source_set_content.invokeExact(
                    handle(),
                    (Addressable) (content == null ? MemoryAddress.NULL : content.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a paintable to use as icon during DND operations.
     * <p>
     * The hotspot coordinates determine the point on the icon
     * that gets aligned with the hotspot of the cursor.
     * <p>
     * If {@code paintable} is {@code null}, a default icon is used.
     * <p>
     * This function can be called before a drag is started, or in
     * a {@code Gtk.DragSource::prepare} or
     * {@code Gtk.DragSource::drag-begin} signal handler.
     * @param paintable the {@code GdkPaintable} to use as icon
     * @param hotX the hotspot X coordinate on the icon
     * @param hotY the hotspot Y coordinate on the icon
     */
    public void setIcon(@Nullable org.gtk.gdk.Paintable paintable, int hotX, int hotY) {
        try {
            DowncallHandles.gtk_drag_source_set_icon.invokeExact(
                    handle(),
                    (Addressable) (paintable == null ? MemoryAddress.NULL : paintable.handle()),
                    hotX,
                    hotY);
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
            RESULT = (long) DowncallHandles.gtk_drag_source_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface DragBegin {
        void run(org.gtk.gdk.Drag drag);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDragSource, MemoryAddress drag) {
            run((org.gtk.gdk.Drag) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drag)), org.gtk.gdk.Drag.fromAddress).marshal(drag, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragBegin.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted on the drag source when a drag is started.
     * <p>
     * It can be used to e.g. set a custom drag icon with
     * {@link DragSource#setIcon}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DragSource.DragBegin> onDragBegin(DragSource.DragBegin handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drag-begin"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragCancel {
        boolean run(org.gtk.gdk.Drag drag, org.gtk.gdk.DragCancelReason reason);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceDragSource, MemoryAddress drag, int reason) {
            var RESULT = run((org.gtk.gdk.Drag) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drag)), org.gtk.gdk.Drag.fromAddress).marshal(drag, Ownership.NONE), org.gtk.gdk.DragCancelReason.of(reason));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragCancel.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted on the drag source when a drag has failed.
     * <p>
     * The signal handler may handle a failed drag operation based on
     * the type of error. It should return {@code true} if the failure has been handled
     * and the default "drag operation failed" animation should not be shown.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DragSource.DragCancel> onDragCancel(DragSource.DragCancel handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drag-cancel"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragEnd {
        void run(org.gtk.gdk.Drag drag, boolean deleteData);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDragSource, MemoryAddress drag, int deleteData) {
            run((org.gtk.gdk.Drag) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drag)), org.gtk.gdk.Drag.fromAddress).marshal(drag, Ownership.NONE), Marshal.integerToBoolean.marshal(deleteData, null).booleanValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragEnd.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted on the drag source when a drag is finished.
     * <p>
     * A typical reason to connect to this signal is to undo
     * things done in {@code Gtk.DragSource::prepare} or
     * {@code Gtk.DragSource::drag-begin} handlers.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DragSource.DragEnd> onDragEnd(DragSource.DragEnd handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drag-end"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Prepare {
        @Nullable org.gtk.gdk.ContentProvider run(double x, double y);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceDragSource, double x, double y) {
            var RESULT = run(x, y);
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Prepare.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when a drag is about to be initiated.
     * <p>
     * It returns the {@code GdkContentProvider} to use for the drag that is about
     * to start. The default handler for this signal returns the value of
     * the {@code Gtk.DragSource:content} property, so if you set up that
     * property ahead of time, you don't need to connect to this signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DragSource.Prepare> onPrepare(DragSource.Prepare handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("prepare"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DragSource.Builder} object constructs a {@link DragSource} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DragSource.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.GestureSingle.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DragSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DragSource}.
         * @return A new instance of {@code DragSource} with the properties 
         *         that were set in the Builder object.
         */
        public DragSource build() {
            return (DragSource) org.gtk.gobject.GObject.newWithProperties(
                DragSource.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The actions that are supported by drag operations from the source.
         * <p>
         * Note that you must handle the {@code Gtk.DragSource::drag-end} signal
         * if the actions include {@link org.gtk.gdk.DragAction#MOVE}.
         * @param actions The value for the {@code actions} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActions(org.gtk.gdk.DragAction actions) {
            names.add("actions");
            values.add(org.gtk.gobject.Value.create(actions));
            return this;
        }
        
        /**
         * The data that is offered by drag operations from this source.
         * @param content The value for the {@code content} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setContent(org.gtk.gdk.ContentProvider content) {
            names.add("content");
            values.add(org.gtk.gobject.Value.create(content));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_drag_source_new = Interop.downcallHandle(
            "gtk_drag_source_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drag_source_drag_cancel = Interop.downcallHandle(
            "gtk_drag_source_drag_cancel",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drag_source_get_actions = Interop.downcallHandle(
            "gtk_drag_source_get_actions",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drag_source_get_content = Interop.downcallHandle(
            "gtk_drag_source_get_content",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drag_source_get_drag = Interop.downcallHandle(
            "gtk_drag_source_get_drag",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drag_source_set_actions = Interop.downcallHandle(
            "gtk_drag_source_set_actions",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_drag_source_set_content = Interop.downcallHandle(
            "gtk_drag_source_set_content",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drag_source_set_icon = Interop.downcallHandle(
            "gtk_drag_source_set_icon",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_drag_source_get_type = Interop.downcallHandle(
            "gtk_drag_source_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
