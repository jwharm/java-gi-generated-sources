package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkDropControllerMotion} is an event controller tracking
 * the pointer during Drag-and-Drop operations.
 * <p>
 * It is modeled after {@link EventControllerMotion} so if you
 * have used that, this should feel really familiar.
 * <p>
 * This controller is not able to accept drops, use {@link DropTarget}
 * for that purpose.
 */
public class DropControllerMotion extends org.gtk.gtk.EventController {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDropControllerMotion";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DropControllerMotion proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DropControllerMotion(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DropControllerMotion if its GType is a (or inherits from) "GtkDropControllerMotion".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DropControllerMotion} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkDropControllerMotion", a ClassCastException will be thrown.
     */
    public static DropControllerMotion castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), DropControllerMotion.getType())) {
            return new DropControllerMotion(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkDropControllerMotion");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_controller_motion_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new event controller that will handle pointer motion
     * events during drag and drop.
     */
    public DropControllerMotion() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Returns if a Drag-and-Drop operation is within the widget
     * {@code self} or one of its children.
     * @return {@code true} if a dragging pointer is within {@code self} or one of its children.
     */
    public boolean containsPointer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_controller_motion_contains_pointer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the {@code GdkDrop} of a current Drag-and-Drop operation
     * over the widget of {@code self}.
     * @return The {@code GdkDrop} currently
     *   happening within {@code self}
     */
    public @Nullable org.gtk.gdk.Drop getDrop() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_drop_controller_motion_get_drop.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Drop(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns if a Drag-and-Drop operation is within the widget
     * {@code self}, not one of its children.
     * @return {@code true} if a dragging pointer is within {@code self} but
     *   not one of its children
     */
    public boolean isPointer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drop_controller_motion_is_pointer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_drop_controller_motion_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Enter {
        void signalReceived(DropControllerMotion source, double x, double y);
    }
    
    /**
     * Signals that the pointer has entered the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropControllerMotion.Enter> onEnter(DropControllerMotion.Enter handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("enter"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropControllerMotion.Callbacks.class, "signalDropControllerMotionEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DropControllerMotion.Enter>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Leave {
        void signalReceived(DropControllerMotion source);
    }
    
    /**
     * Signals that the pointer has left the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropControllerMotion.Leave> onLeave(DropControllerMotion.Leave handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("leave"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropControllerMotion.Callbacks.class, "signalDropControllerMotionLeave",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DropControllerMotion.Leave>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Motion {
        void signalReceived(DropControllerMotion source, double x, double y);
    }
    
    /**
     * Emitted when the pointer moves inside the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropControllerMotion.Motion> onMotion(DropControllerMotion.Motion handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("motion"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropControllerMotion.Callbacks.class, "signalDropControllerMotionMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DropControllerMotion.Motion>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.EventController.Build {
        
         /**
         * A {@link DropControllerMotion.Build} object constructs a {@link DropControllerMotion} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DropControllerMotion} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DropControllerMotion} using {@link DropControllerMotion#castFrom}.
         * @return A new instance of {@code DropControllerMotion} with the properties 
         *         that were set in the Build object.
         */
        public DropControllerMotion construct() {
            return DropControllerMotion.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DropControllerMotion.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether the pointer of a Drag-and-Drop operation is in
         * the controller's widget or a descendant.
         * <p>
         * See also {@code Gtk.DropControllerMotion:is-pointer}.
         * <p>
         * When handling crossing events, this property is updated
         * before {@code Gtk.DropControllerMotion::enter}, but after
         * {@code Gtk.DropControllerMotion::leave} is emitted.
         * @param containsPointer The value for the {@code contains-pointer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setContainsPointer(boolean containsPointer) {
            names.add("contains-pointer");
            values.add(org.gtk.gobject.Value.create(containsPointer));
            return this;
        }
        
        /**
         * The ongoing drop operation over the controller's widget or
         * its descendant.
         * <p>
         * If no drop operation is going on, this property returns {@code null}.
         * <p>
         * The event controller should not modify the {@code drop}, but it might
         * want to query its properties.
         * <p>
         * When handling crossing events, this property is updated
         * before {@code Gtk.DropControllerMotion::enter}, but after
         * {@code Gtk.DropControllerMotion::leave} is emitted.
         * @param drop The value for the {@code drop} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDrop(org.gtk.gdk.Drop drop) {
            names.add("drop");
            values.add(org.gtk.gobject.Value.create(drop));
            return this;
        }
        
        /**
         * Whether the pointer is in the controllers widget itself,
         * as opposed to in a descendent widget.
         * <p>
         * See also {@code Gtk.DropControllerMotion:contains-pointer}.
         * <p>
         * When handling crossing events, this property is updated
         * before {@code Gtk.DropControllerMotion::enter}, but after
         * {@code Gtk.DropControllerMotion::leave} is emitted.
         * @param isPointer The value for the {@code is-pointer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsPointer(boolean isPointer) {
            names.add("is-pointer");
            values.add(org.gtk.gobject.Value.create(isPointer));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_drop_controller_motion_new = Interop.downcallHandle(
            "gtk_drop_controller_motion_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_controller_motion_contains_pointer = Interop.downcallHandle(
            "gtk_drop_controller_motion_contains_pointer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_controller_motion_get_drop = Interop.downcallHandle(
            "gtk_drop_controller_motion_get_drop",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_controller_motion_is_pointer = Interop.downcallHandle(
            "gtk_drop_controller_motion_is_pointer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_drop_controller_motion_get_type = Interop.downcallHandle(
            "gtk_drop_controller_motion_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalDropControllerMotionEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DropControllerMotion.Enter) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DropControllerMotion(source, Ownership.NONE), x, y);
        }
        
        public static void signalDropControllerMotionLeave(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DropControllerMotion.Leave) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DropControllerMotion(source, Ownership.NONE));
        }
        
        public static void signalDropControllerMotionMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (DropControllerMotion.Motion) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DropControllerMotion(source, Ownership.NONE), x, y);
        }
    }
}
