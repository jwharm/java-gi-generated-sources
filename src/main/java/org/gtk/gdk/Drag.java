package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GdkDrag} object represents the source of an ongoing DND operation.
 * <p>
 * A {@code GdkDrag} is created when a drag is started, and stays alive for duration of
 * the DND operation. After a drag has been started with {@link Gdk#Drag},
 * the caller gets informed about the status of the ongoing drag operation
 * with signals on the {@code GdkDrag} object.
 * <p>
 * GTK provides a higher level abstraction based on top of these functions,
 * and so they are not normally needed in GTK applications. See the
 * "Drag and Drop" section of the GTK documentation for more information.
 */
public class Drag extends org.gtk.gobject.Object {

    public Drag(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Drag */
    public static Drag castFrom(org.gtk.gobject.Object gobject) {
        return new Drag(gobject.refcounted());
    }
    
    static final MethodHandle gdk_drag_drop_done = Interop.downcallHandle(
        "gdk_drag_drop_done",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Informs GDK that the drop ended.
     * <p>
     * Passing {@code false} for {@code success} may trigger a drag cancellation
     * animation.
     * <p>
     * This function is called by the drag source, and should be the
     * last call before dropping the reference to the {@code drag}.
     * <p>
     * The {@code GdkDrag} will only take the first {@link Drag#dropDone}
     * call as effective, if this function is called multiple times,
     * all subsequent calls will be ignored.
     */
    public void dropDone(boolean success) {
        try {
            gdk_drag_drop_done.invokeExact(handle(), success ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_drag_get_actions = Interop.downcallHandle(
        "gdk_drag_get_actions",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines the bitmask of possible actions proposed by the source.
     */
    public DragAction getActions() {
        try {
            var RESULT = (int) gdk_drag_get_actions.invokeExact(handle());
            return new DragAction(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_drag_get_content = Interop.downcallHandle(
        "gdk_drag_get_content",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkContentProvider} associated to the {@code GdkDrag} object.
     */
    public ContentProvider getContent() {
        try {
            var RESULT = (MemoryAddress) gdk_drag_get_content.invokeExact(handle());
            return new ContentProvider(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_drag_get_device = Interop.downcallHandle(
        "gdk_drag_get_device",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkDevice} associated to the {@code GdkDrag} object.
     */
    public Device getDevice() {
        try {
            var RESULT = (MemoryAddress) gdk_drag_get_device.invokeExact(handle());
            return new Device(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_drag_get_display = Interop.downcallHandle(
        "gdk_drag_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GdkDisplay} that the drag object was created for.
     */
    public Display getDisplay() {
        try {
            var RESULT = (MemoryAddress) gdk_drag_get_display.invokeExact(handle());
            return new Display(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_drag_get_drag_surface = Interop.downcallHandle(
        "gdk_drag_get_drag_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the surface on which the drag icon should be rendered
     * during the drag operation.
     * <p>
     * Note that the surface may not be available until the drag operation
     * has begun. GDK will move the surface in accordance with the ongoing
     * drag operation. The surface is owned by {@code drag} and will be destroyed
     * when the drag operation is over.
     */
    public Surface getDragSurface() {
        try {
            var RESULT = (MemoryAddress) gdk_drag_get_drag_surface.invokeExact(handle());
            return new Surface(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_drag_get_formats = Interop.downcallHandle(
        "gdk_drag_get_formats",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the formats supported by this {@code GdkDrag} object.
     */
    public ContentFormats getFormats() {
        try {
            var RESULT = (MemoryAddress) gdk_drag_get_formats.invokeExact(handle());
            return new ContentFormats(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_drag_get_selected_action = Interop.downcallHandle(
        "gdk_drag_get_selected_action",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines the action chosen by the drag destination.
     */
    public DragAction getSelectedAction() {
        try {
            var RESULT = (int) gdk_drag_get_selected_action.invokeExact(handle());
            return new DragAction(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_drag_get_surface = Interop.downcallHandle(
        "gdk_drag_get_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkSurface} where the drag originates.
     */
    public Surface getSurface() {
        try {
            var RESULT = (MemoryAddress) gdk_drag_get_surface.invokeExact(handle());
            return new Surface(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_drag_set_hotspot = Interop.downcallHandle(
        "gdk_drag_set_hotspot",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the position of the drag surface that will be kept
     * under the cursor hotspot.
     * <p>
     * Initially, the hotspot is at the top left corner of the drag surface.
     */
    public void setHotspot(int hotX, int hotY) {
        try {
            gdk_drag_set_hotspot.invokeExact(handle(), hotX, hotY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_drag_begin = Interop.downcallHandle(
        "gdk_drag_begin",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Starts a drag and creates a new drag context for it.
     * <p>
     * This function is called by the drag source. After this call, you
     * probably want to set up the drag icon using the surface returned
     * by {@link Drag#getDragSurface}.
     * <p>
     * This function returns a reference to the {@link Drag} object,
     * but GTK keeps its own reference as well, as long as the DND operation
     * is going on.
     * <p>
     * Note: if {@code actions} include {@link DragAction#MOVE}, you need to listen for
     * the {@code Gdk.Drag::dnd-finished} signal and delete the data at
     * the source if {@link Drag#getSelectedAction} returns
     * {@link DragAction#MOVE}.
     */
    public static Drag begin(Surface surface, Device device, ContentProvider content, DragAction actions, double dx, double dy) {
        try {
            var RESULT = (MemoryAddress) gdk_drag_begin.invokeExact(surface.handle(), device.handle(), content.handle(), actions.getValue(), dx, dy);
            return new Drag(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CancelHandler {
        void signalReceived(Drag source, DragCancelReason reason);
    }
    
    /**
     * Emitted when the drag operation is cancelled.
     */
    public SignalHandle onCancel(CancelHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cancel").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drag.Callbacks.class, "signalDragCancel",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DndFinishedHandler {
        void signalReceived(Drag source);
    }
    
    /**
     * Emitted when the destination side has finished reading all data.
     * <p>
     * The drag object can now free all miscellaneous data.
     */
    public SignalHandle onDndFinished(DndFinishedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("dnd-finished").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drag.Callbacks.class, "signalDragDndFinished",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DropPerformedHandler {
        void signalReceived(Drag source);
    }
    
    /**
     * Emitted when the drop operation is performed on an accepting client.
     */
    public SignalHandle onDropPerformed(DropPerformedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drop-performed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drag.Callbacks.class, "signalDragDropPerformed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalDragCancel(MemoryAddress source, int reason, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Drag.CancelHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Drag(Refcounted.get(source)), new DragCancelReason(reason));
        }
        
        public static void signalDragDndFinished(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Drag.DndFinishedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Drag(Refcounted.get(source)));
        }
        
        public static void signalDragDropPerformed(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Drag.DropPerformedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Drag(Refcounted.get(source)));
        }
        
    }
}
