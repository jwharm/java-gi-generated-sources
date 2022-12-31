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
    protected DropControllerMotion(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DropControllerMotion> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DropControllerMotion(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return (org.gtk.gdk.Drop) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Drop.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
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
        void run(double x, double y);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDropControllerMotion, double x, double y) {
            run(x, y);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Enter.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Signals that the pointer has entered the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropControllerMotion.Enter> onEnter(DropControllerMotion.Enter handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("enter"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Leave {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDropControllerMotion) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Leave.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Signals that the pointer has left the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropControllerMotion.Leave> onLeave(DropControllerMotion.Leave handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("leave"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Motion {
        void run(double x, double y);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceDropControllerMotion, double x, double y) {
            run(x, y);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Motion.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted when the pointer moves inside the widget.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<DropControllerMotion.Motion> onMotion(DropControllerMotion.Motion handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("motion"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link DropControllerMotion.Builder} object constructs a {@link DropControllerMotion} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link DropControllerMotion.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.EventController.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link DropControllerMotion} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DropControllerMotion}.
         * @return A new instance of {@code DropControllerMotion} with the properties 
         *         that were set in the Builder object.
         */
        public DropControllerMotion build() {
            return (DropControllerMotion) org.gtk.gobject.GObject.newWithProperties(
                DropControllerMotion.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setContainsPointer(boolean containsPointer) {
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
        public Builder setDrop(org.gtk.gdk.Drop drop) {
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
        public Builder setIsPointer(boolean isPointer) {
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
}
