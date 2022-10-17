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
 * 
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
 * {@code Gtk.DragSource::drag-begin}
 * signals.
 * <p>
 * The ::prepare signal is emitted before a drag is started, and
 * can be used to set the content provider and actions that the
 * drag should be started with.
 * 
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
 * 
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
public class DragSource extends GestureSingle {

    public DragSource(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DragSource */
    public static DragSource castFrom(org.gtk.gobject.Object gobject) {
        return new DragSource(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_drag_source_new = Interop.downcallHandle(
        "gtk_drag_source_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_drag_source_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkDragSource} object.
     */
    public DragSource() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_drag_source_drag_cancel = Interop.downcallHandle(
        "gtk_drag_source_drag_cancel",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Cancels a currently ongoing drag operation.
     */
    public @NotNull void dragCancel() {
        try {
            gtk_drag_source_drag_cancel.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_drag_source_get_actions = Interop.downcallHandle(
        "gtk_drag_source_get_actions",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the actions that are currently set on the {@code GtkDragSource}.
     */
    public @NotNull org.gtk.gdk.DragAction getActions() {
        int RESULT;
        try {
            RESULT = (int) gtk_drag_source_get_actions.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DragAction(RESULT);
    }
    
    private static final MethodHandle gtk_drag_source_get_content = Interop.downcallHandle(
        "gtk_drag_source_get_content",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current content provider of a {@code GtkDragSource}.
     */
    public @Nullable org.gtk.gdk.ContentProvider getContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_drag_source_get_content.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentProvider(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_drag_source_get_drag = Interop.downcallHandle(
        "gtk_drag_source_get_drag",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the underlying {@code GdkDrag} object for an ongoing drag.
     */
    public @Nullable org.gtk.gdk.Drag getDrag() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_drag_source_get_drag.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Drag(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_drag_source_set_actions = Interop.downcallHandle(
        "gtk_drag_source_set_actions",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public @NotNull void setActions(@NotNull org.gtk.gdk.DragAction actions) {
        try {
            gtk_drag_source_set_actions.invokeExact(handle(), actions.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_drag_source_set_content = Interop.downcallHandle(
        "gtk_drag_source_set_content",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void setContent(@Nullable org.gtk.gdk.ContentProvider content) {
        try {
            gtk_drag_source_set_content.invokeExact(handle(), content.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_drag_source_set_icon = Interop.downcallHandle(
        "gtk_drag_source_set_icon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
     */
    public @NotNull void setIcon(@Nullable org.gtk.gdk.Paintable paintable, @NotNull int hotX, @NotNull int hotY) {
        try {
            gtk_drag_source_set_icon.invokeExact(handle(), paintable.handle(), hotX, hotY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragBeginHandler {
        void signalReceived(DragSource source, @NotNull org.gtk.gdk.Drag drag);
    }
    
    /**
     * Emitted on the drag source when a drag is started.
     * <p>
     * It can be used to e.g. set a custom drag icon with
     * {@link DragSource#setIcon}.
     */
    public SignalHandle onDragBegin(DragBeginHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-begin"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DragSource.Callbacks.class, "signalDragSourceDragBegin",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragCancelHandler {
        boolean signalReceived(DragSource source, @NotNull org.gtk.gdk.Drag drag, @NotNull org.gtk.gdk.DragCancelReason reason);
    }
    
    /**
     * Emitted on the drag source when a drag has failed.
     * <p>
     * The signal handler may handle a failed drag operation based on
     * the type of error. It should return {@code true} if the failure has been handled
     * and the default "drag operation failed" animation should not be shown.
     */
    public SignalHandle onDragCancel(DragCancelHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-cancel"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DragSource.Callbacks.class, "signalDragSourceDragCancel",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragEndHandler {
        void signalReceived(DragSource source, @NotNull org.gtk.gdk.Drag drag, @NotNull boolean deleteData);
    }
    
    /**
     * Emitted on the drag source when a drag is finished.
     * <p>
     * A typical reason to connect to this signal is to undo
     * things done in {@code Gtk.DragSource::prepare} or
     * {@code Gtk.DragSource::drag-begin} handlers.
     */
    public SignalHandle onDragEnd(DragEndHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-end"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DragSource.Callbacks.class, "signalDragSourceDragEnd",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PrepareHandler {
        void signalReceived(DragSource source, @NotNull double x, @NotNull double y);
    }
    
    /**
     * Emitted when a drag is about to be initiated.
     * <p>
     * It returns the {@code GdkContentProvider} to use for the drag that is about
     * to start. The default handler for this signal returns the value of
     * the {@code Gtk.DragSource:content} property, so if you set up that
     * property ahead of time, you don't need to connect to this signal.
     */
    public SignalHandle onPrepare(PrepareHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("prepare"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DragSource.Callbacks.class, "signalDragSourcePrepare",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalDragSourceDragBegin(MemoryAddress source, MemoryAddress drag, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DragSource.DragBeginHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DragSource(Refcounted.get(source)), new org.gtk.gdk.Drag(Refcounted.get(drag, false)));
        }
        
        public static boolean signalDragSourceDragCancel(MemoryAddress source, MemoryAddress drag, int reason, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DragSource.DragCancelHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new DragSource(Refcounted.get(source)), new org.gtk.gdk.Drag(Refcounted.get(drag, false)), new org.gtk.gdk.DragCancelReason(reason));
        }
        
        public static void signalDragSourceDragEnd(MemoryAddress source, MemoryAddress drag, int deleteData, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DragSource.DragEndHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DragSource(Refcounted.get(source)), new org.gtk.gdk.Drag(Refcounted.get(drag, false)), deleteData != 0);
        }
        
        public static void signalDragSourcePrepare(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DragSource.PrepareHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DragSource(Refcounted.get(source)), x, y);
        }
        
    }
}
