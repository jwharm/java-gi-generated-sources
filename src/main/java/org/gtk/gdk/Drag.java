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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Drag.getType())) {
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
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_drag_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
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
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Drag.DropPerformed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link Drag.Build} object constructs a {@link Drag} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Drag} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Drag} using {@link Drag#castFrom}.
         * @return A new instance of {@code Drag} with the properties 
         *         that were set in the Build object.
         */
        public Drag construct() {
            return Drag.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Drag.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The possible actions of this drag.
         * @param actions The value for the {@code actions} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setActions(org.gtk.gdk.DragAction actions) {
            names.add("actions");
            values.add(org.gtk.gobject.Value.create(actions));
            return this;
        }
        
        /**
         * The {@code GdkContentProvider}.
         * @param content The value for the {@code content} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setContent(org.gtk.gdk.ContentProvider content) {
            names.add("content");
            values.add(org.gtk.gobject.Value.create(content));
            return this;
        }
        
        /**
         * The {@code GdkDevice} that is performing the drag.
         * @param device The value for the {@code device} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDevice(org.gtk.gdk.Device device) {
            names.add("device");
            values.add(org.gtk.gobject.Value.create(device));
            return this;
        }
        
        /**
         * The {@code GdkDisplay} that the drag belongs to.
         * @param display The value for the {@code display} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDisplay(org.gtk.gdk.Display display) {
            names.add("display");
            values.add(org.gtk.gobject.Value.create(display));
            return this;
        }
        
        /**
         * The possible formats that the drag can provide its data in.
         * @param formats The value for the {@code formats} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFormats(org.gtk.gdk.ContentFormats formats) {
            names.add("formats");
            values.add(org.gtk.gobject.Value.create(formats));
            return this;
        }
        
        /**
         * The currently selected action of the drag.
         * @param selectedAction The value for the {@code selected-action} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSelectedAction(org.gtk.gdk.DragAction selectedAction) {
            names.add("selected-action");
            values.add(org.gtk.gobject.Value.create(selectedAction));
            return this;
        }
        
        /**
         * The surface where the drag originates.
         * @param surface The value for the {@code surface} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSurface(org.gtk.gdk.Surface surface) {
            names.add("surface");
            values.add(org.gtk.gobject.Value.create(surface));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_drag_drop_done = Interop.downcallHandle(
            "gdk_drag_drop_done",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_drag_get_actions = Interop.downcallHandle(
            "gdk_drag_get_actions",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_content = Interop.downcallHandle(
            "gdk_drag_get_content",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_device = Interop.downcallHandle(
            "gdk_drag_get_device",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_display = Interop.downcallHandle(
            "gdk_drag_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_drag_surface = Interop.downcallHandle(
            "gdk_drag_get_drag_surface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_formats = Interop.downcallHandle(
            "gdk_drag_get_formats",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_selected_action = Interop.downcallHandle(
            "gdk_drag_get_selected_action",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_get_surface = Interop.downcallHandle(
            "gdk_drag_get_surface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_drag_set_hotspot = Interop.downcallHandle(
            "gdk_drag_set_hotspot",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_drag_get_type = Interop.downcallHandle(
            "gdk_drag_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gdk_drag_begin = Interop.downcallHandle(
            "gdk_drag_begin",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalDragCancel(MemoryAddress source, int reason, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Drag.Cancel) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Drag(source, Ownership.NONE), new org.gtk.gdk.DragCancelReason(reason));
        }
        
        public static void signalDragDndFinished(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Drag.DndFinished) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Drag(source, Ownership.NONE));
        }
        
        public static void signalDragDropPerformed(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Drag.DropPerformed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Drag(source, Ownership.NONE));
        }
    }
}
