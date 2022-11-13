package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GdkDrag} object represents the source of an ongoing DND operation.
 * <p>
 * A {@code GdkDrag} is created when a drag is started, and stays alive for duration of
 * the DND operation. After a drag has been started with {@link Drag#begin},
 * the caller gets informed about the status of the ongoing drag operation
 * with signals on the {@code GdkDrag} object.
 * <p>
 * GTK provides a higher level abstraction based on top of these functions,
 * and so they are not normally needed in GTK applications. See the
 * "Drag and Drop" section of the GTK documentation for more information.
 */
public class Drag extends org.gtk.gobject.Object {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkDrag";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Drag proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Drag(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Drag if its GType is a (or inherits from) "GdkDrag".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Drag} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkDrag", a ClassCastException will be thrown.
     */
    public static Drag castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GdkDrag"))) {
            return new Drag(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkDrag");
        }
    }
    
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
     * @param success whether the drag was ultimatively successful
     */
    public void dropDone(boolean success) {
        try {
            DowncallHandles.gdk_drag_drop_done.invokeExact(
                    handle(),
                    success ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Determines the bitmask of possible actions proposed by the source.
     * @return the {@code GdkDragAction} flags
     */
    public @NotNull org.gtk.gdk.DragAction getActions() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_drag_get_actions.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DragAction(RESULT);
    }
    
    /**
     * Returns the {@code GdkContentProvider} associated to the {@code GdkDrag} object.
     * @return The {@code GdkContentProvider} associated to {@code drag}.
     */
    public @NotNull org.gtk.gdk.ContentProvider getContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drag_get_content.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentProvider(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the {@code GdkDevice} associated to the {@code GdkDrag} object.
     * @return The {@code GdkDevice} associated to {@code drag}.
     */
    public @NotNull org.gtk.gdk.Device getDevice() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drag_get_device.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Device(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code GdkDisplay} that the drag object was created for.
     * @return a {@code GdkDisplay}
     */
    public @NotNull org.gtk.gdk.Display getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drag_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Display(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the surface on which the drag icon should be rendered
     * during the drag operation.
     * <p>
     * Note that the surface may not be available until the drag operation
     * has begun. GDK will move the surface in accordance with the ongoing
     * drag operation. The surface is owned by {@code drag} and will be destroyed
     * when the drag operation is over.
     * @return the drag surface
     */
    public @Nullable org.gtk.gdk.Surface getDragSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drag_get_drag_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Surface(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the formats supported by this {@code GdkDrag} object.
     * @return a {@code GdkContentFormats}
     */
    public @NotNull org.gtk.gdk.ContentFormats getFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drag_get_formats.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentFormats(RESULT, Ownership.NONE);
    }
    
    /**
     * Determines the action chosen by the drag destination.
     * @return a {@code GdkDragAction} value
     */
    public @NotNull org.gtk.gdk.DragAction getSelectedAction() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_drag_get_selected_action.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DragAction(RESULT);
    }
    
    /**
     * Returns the {@code GdkSurface} where the drag originates.
     * @return The {@code GdkSurface} where the drag originates
     */
    public @NotNull org.gtk.gdk.Surface getSurface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drag_get_surface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Surface(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the position of the drag surface that will be kept
     * under the cursor hotspot.
     * <p>
     * Initially, the hotspot is at the top left corner of the drag surface.
     * @param hotX x coordinate of the drag surface hotspot
     * @param hotY y coordinate of the drag surface hotspot
     */
    public void setHotspot(int hotX, int hotY) {
        try {
            DowncallHandles.gdk_drag_set_hotspot.invokeExact(
                    handle(),
                    hotX,
                    hotY);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param surface the source surface for this drag
     * @param device the device that controls this drag
     * @param content the offered content
     * @param actions the actions supported by this drag
     * @param dx the x offset to {@code device}'s position where the drag nominally started
     * @param dy the y offset to {@code device}'s position where the drag nominally started
     * @return a newly created {@code GdkDrag}
     */
    public static @Nullable org.gtk.gdk.Drag begin(@NotNull org.gtk.gdk.Surface surface, @NotNull org.gtk.gdk.Device device, @NotNull org.gtk.gdk.ContentProvider content, @NotNull org.gtk.gdk.DragAction actions, double dx, double dy) {
        java.util.Objects.requireNonNull(surface, "Parameter 'surface' must not be null");
        java.util.Objects.requireNonNull(device, "Parameter 'device' must not be null");
        java.util.Objects.requireNonNull(content, "Parameter 'content' must not be null");
        java.util.Objects.requireNonNull(actions, "Parameter 'actions' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gdk_drag_begin.invokeExact(
                    surface.handle(),
                    device.handle(),
                    content.handle(),
                    actions.getValue(),
                    dx,
                    dy);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Drag(RESULT, Ownership.FULL);
    }
    
    @FunctionalInterface
    public interface Cancel {
        void signalReceived(Drag source, @NotNull org.gtk.gdk.DragCancelReason reason);
    }
    
    /**
     * Emitted when the drag operation is cancelled.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Drag.Cancel> onCancel(Drag.Cancel handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cancel"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drag.Callbacks.class, "signalDragCancel",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Drag.Cancel>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DndFinished {
        void signalReceived(Drag source);
    }
    
    /**
     * Emitted when the destination side has finished reading all data.
     * <p>
     * The drag object can now free all miscellaneous data.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Drag.DndFinished> onDndFinished(Drag.DndFinished handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("dnd-finished"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drag.Callbacks.class, "signalDragDndFinished",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Drag.DndFinished>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DropPerformed {
        void signalReceived(Drag source);
    }
    
    /**
     * Emitted when the drop operation is performed on an accepting client.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Drag.DropPerformed> onDropPerformed(Drag.DropPerformed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drop-performed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Drag.Callbacks.class, "signalDragDropPerformed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Drag.DropPerformed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_drag_drop_done = Interop.downcallHandle(
            "gdk_drag_drop_done",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gdk_drag_get_actions = Interop.downcallHandle(
            "gdk_drag_get_actions",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_content = Interop.downcallHandle(
            "gdk_drag_get_content",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_device = Interop.downcallHandle(
            "gdk_drag_get_device",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_display = Interop.downcallHandle(
            "gdk_drag_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_drag_surface = Interop.downcallHandle(
            "gdk_drag_get_drag_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_formats = Interop.downcallHandle(
            "gdk_drag_get_formats",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_selected_action = Interop.downcallHandle(
            "gdk_drag_get_selected_action",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_surface = Interop.downcallHandle(
            "gdk_drag_get_surface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_set_hotspot = Interop.downcallHandle(
            "gdk_drag_set_hotspot",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gdk_drag_begin = Interop.downcallHandle(
            "gdk_drag_begin",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalDragCancel(MemoryAddress source, int reason, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Drag.Cancel) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Drag(source, Ownership.UNKNOWN), new org.gtk.gdk.DragCancelReason(reason));
        }
        
        public static void signalDragDndFinished(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Drag.DndFinished) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Drag(source, Ownership.UNKNOWN));
        }
        
        public static void signalDragDropPerformed(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Drag.DropPerformed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Drag(source, Ownership.UNKNOWN));
        }
    }
}
