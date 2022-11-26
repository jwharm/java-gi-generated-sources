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
    @ApiStatus.Internal
    public DragSource(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DragSource if its GType is a (or inherits from) "GtkDragSource".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DragSource} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkDragSource", a ClassCastException will be thrown.
     */
    public static DragSource castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), DragSource.getType())) {
            return new DragSource(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkDragSource");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    public @NotNull org.gtk.gdk.DragAction getActions() {
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
        return new org.gtk.gdk.ContentProvider(RESULT, Ownership.NONE);
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
        return new org.gtk.gdk.Drag(RESULT, Ownership.NONE);
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
    public void setActions(@NotNull org.gtk.gdk.DragAction actions) {
        java.util.Objects.requireNonNull(actions, "Parameter 'actions' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
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
        void signalReceived(DragSource source, @NotNull org.gtk.gdk.Drag drag);
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
                handle(),
                Interop.allocateNativeString("drag-begin"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DragSource.Callbacks.class, "signalDragSourceDragBegin",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DragSource.DragBegin>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragCancel {
        boolean signalReceived(DragSource source, @NotNull org.gtk.gdk.Drag drag, @NotNull org.gtk.gdk.DragCancelReason reason);
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
                handle(),
                Interop.allocateNativeString("drag-cancel"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DragSource.Callbacks.class, "signalDragSourceDragCancel",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DragSource.DragCancel>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragEnd {
        void signalReceived(DragSource source, @NotNull org.gtk.gdk.Drag drag, boolean deleteData);
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
                handle(),
                Interop.allocateNativeString("drag-end"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DragSource.Callbacks.class, "signalDragSourceDragEnd",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DragSource.DragEnd>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Prepare {
        void signalReceived(DragSource source, double x, double y);
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
                handle(),
                Interop.allocateNativeString("prepare"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DragSource.Callbacks.class, "signalDragSourcePrepare",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DragSource.Prepare>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.GestureSingle.Build {
        
         /**
         * A {@link DragSource.Build} object constructs a {@link DragSource} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DragSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DragSource} using {@link DragSource#castFrom}.
         * @return A new instance of {@code DragSource} with the properties 
         *         that were set in the Build object.
         */
        public DragSource construct() {
            return DragSource.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DragSource.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
        public Build setActions(org.gtk.gdk.DragAction actions) {
            names.add("actions");
            values.add(org.gtk.gobject.Value.create(actions));
            return this;
        }
        
        /**
         * The data that is offered by drag operations from this source.
         * @param content The value for the {@code content} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setContent(org.gtk.gdk.ContentProvider content) {
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
    
    private static class Callbacks {
        
        public static void signalDragSourceDragBegin(MemoryAddress source, MemoryAddress drag, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DragSource.DragBegin) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DragSource(source, Ownership.NONE), new org.gtk.gdk.Drag(drag, Ownership.NONE));
        }
        
        public static boolean signalDragSourceDragCancel(MemoryAddress source, MemoryAddress drag, int reason, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DragSource.DragCancel) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new DragSource(source, Ownership.NONE), new org.gtk.gdk.Drag(drag, Ownership.NONE), new org.gtk.gdk.DragCancelReason(reason));
        }
        
        public static void signalDragSourceDragEnd(MemoryAddress source, MemoryAddress drag, int deleteData, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DragSource.DragEnd) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DragSource(source, Ownership.NONE), new org.gtk.gdk.Drag(drag, Ownership.NONE), deleteData != 0);
        }
        
        public static void signalDragSourcePrepare(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DragSource.Prepare) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DragSource(source, Ownership.NONE), x, y);
        }
    }
}
