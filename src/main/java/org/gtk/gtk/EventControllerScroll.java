package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkEventControllerScroll} is an event controller that handles scroll
 * events.
 * <p>
 * It is capable of handling both discrete and continuous scroll
 * events from mice or touchpads, abstracting them both with the
 * {@code Gtk.EventControllerScroll::scroll} signal. Deltas in
 * the discrete case are multiples of 1.
 * <p>
 * In the case of continuous scroll events, {@code GtkEventControllerScroll}
 * encloses all {@code Gtk.EventControllerScroll::scroll} emissions
 * between two {@code Gtk.EventControllerScroll::scroll-begin} and
 * {@code Gtk.EventControllerScroll::scroll-end} signals.
 * <p>
 * The behavior of the event controller can be modified by the flags
 * given at creation time, or modified at a later point through
 * {@link EventControllerScroll#setFlags} (e.g. because the scrolling
 * conditions of the widget changed).
 * <p>
 * The controller can be set up to emit motion for either/both vertical
 * and horizontal scroll events through {@link EventControllerScrollFlags#VERTICAL},
 * {@link EventControllerScrollFlags#HORIZONTAL} and {@link EventControllerScrollFlags#BOTH_AXES}.
 * If any axis is disabled, the respective {@code Gtk.EventControllerScroll::scroll}
 * delta will be 0. Vertical scroll events will be translated to horizontal
 * motion for the devices incapable of horizontal scrolling.
 * <p>
 * The event controller can also be forced to emit discrete events on all
 * devices through {@link EventControllerScrollFlags#DISCRETE}. This can be used
 * to implement discrete actions triggered through scroll events (e.g.
 * switching across combobox options).
 * <p>
 * The {@link EventControllerScrollFlags#KINETIC} flag toggles the emission of the
 * {@code Gtk.EventControllerScroll::decelerate} signal, emitted at the end
 * of scrolling with two X/Y velocity arguments that are consistent with the
 * motion that was received.
 */
public class EventControllerScroll extends org.gtk.gtk.EventController {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEventControllerScroll";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EventControllerScroll proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EventControllerScroll(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EventControllerScroll> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EventControllerScroll(input);
    
    private static MemoryAddress constructNew(org.gtk.gtk.EventControllerScrollFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_event_controller_scroll_new.invokeExact(flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new event controller that will handle scroll events.
     * @param flags flags affecting the controller behavior
     */
    public EventControllerScroll(org.gtk.gtk.EventControllerScrollFlags flags) {
        super(constructNew(flags));
        this.takeOwnership();
    }
    
    /**
     * Gets the flags conditioning the scroll controller behavior.
     * @return the controller flags.
     */
    public org.gtk.gtk.EventControllerScrollFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_scroll_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.EventControllerScrollFlags(RESULT);
    }
    
    /**
     * Gets the scroll unit of the last
     * {@code Gtk.EventControllerScroll::scroll} signal received.
     * <p>
     * Always returns {@link org.gtk.gdk.ScrollUnit#WHEEL} if the
     * {@link EventControllerScrollFlags#DISCRETE} flag is set.
     * @return the scroll unit.
     */
    public org.gtk.gdk.ScrollUnit getUnit() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_scroll_get_unit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.ScrollUnit.of(RESULT);
    }
    
    /**
     * Sets the flags conditioning scroll controller behavior.
     * @param flags flags affecting the controller behavior
     */
    public void setFlags(org.gtk.gtk.EventControllerScrollFlags flags) {
        try {
            DowncallHandles.gtk_event_controller_scroll_set_flags.invokeExact(
                    handle(),
                    flags.getValue());
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
            RESULT = (long) DowncallHandles.gtk_event_controller_scroll_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Decelerate} callback.
     */
    @FunctionalInterface
    public interface Decelerate {
    
        /**
         * Emitted after scroll is finished if the
         * {@link EventControllerScrollFlags#KINETIC} flag is set.
         * <p>
         * {@code vel_x} and {@code vel_y} express the initial velocity that was
         * imprinted by the scroll events. {@code vel_x} and {@code vel_y} are expressed in
         * pixels/ms.
         */
        void run(double velX, double velY);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEventControllerScroll, double velX, double velY) {
            run(velX, velY);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Decelerate.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted after scroll is finished if the
     * {@link EventControllerScrollFlags#KINETIC} flag is set.
     * <p>
     * {@code vel_x} and {@code vel_y} express the initial velocity that was
     * imprinted by the scroll events. {@code vel_x} and {@code vel_y} are expressed in
     * pixels/ms.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerScroll.Decelerate> onDecelerate(EventControllerScroll.Decelerate handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("decelerate", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Scroll} callback.
     */
    @FunctionalInterface
    public interface Scroll {
    
        /**
         * Signals that the widget should scroll by the
         * amount specified by {@code dx} and {@code dy}.
         * <p>
         * For the representation unit of the deltas, see
         * {@link EventControllerScroll#getUnit}.
         */
        boolean run(double dx, double dy);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceEventControllerScroll, double dx, double dy) {
            var RESULT = run(dx, dy);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Scroll.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Signals that the widget should scroll by the
     * amount specified by {@code dx} and {@code dy}.
     * <p>
     * For the representation unit of the deltas, see
     * {@link EventControllerScroll#getUnit}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerScroll.Scroll> onScroll(EventControllerScroll.Scroll handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("scroll", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ScrollBegin} callback.
     */
    @FunctionalInterface
    public interface ScrollBegin {
    
        /**
         * Signals that a new scrolling operation has begun.
         * <p>
         * It will only be emitted on devices capable of it.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEventControllerScroll) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ScrollBegin.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Signals that a new scrolling operation has begun.
     * <p>
     * It will only be emitted on devices capable of it.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerScroll.ScrollBegin> onScrollBegin(EventControllerScroll.ScrollBegin handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("scroll-begin", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ScrollEnd} callback.
     */
    @FunctionalInterface
    public interface ScrollEnd {
    
        /**
         * Signals that a scrolling operation has finished.
         * <p>
         * It will only be emitted on devices capable of it.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEventControllerScroll) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ScrollEnd.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Signals that a scrolling operation has finished.
     * <p>
     * It will only be emitted on devices capable of it.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerScroll.ScrollEnd> onScrollEnd(EventControllerScroll.ScrollEnd handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("scroll-end", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link EventControllerScroll.Builder} object constructs a {@link EventControllerScroll} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EventControllerScroll.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.EventController.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link EventControllerScroll} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EventControllerScroll}.
         * @return A new instance of {@code EventControllerScroll} with the properties 
         *         that were set in the Builder object.
         */
        public EventControllerScroll build() {
            return (EventControllerScroll) org.gtk.gobject.GObject.newWithProperties(
                EventControllerScroll.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The flags affecting event controller behavior.
         * @param flags The value for the {@code flags} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gtk.gtk.EventControllerScrollFlags flags) {
            names.add("flags");
            values.add(org.gtk.gobject.Value.create(flags));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_event_controller_scroll_new = Interop.downcallHandle(
                "gtk_event_controller_scroll_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_event_controller_scroll_get_flags = Interop.downcallHandle(
                "gtk_event_controller_scroll_get_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_scroll_get_unit = Interop.downcallHandle(
                "gtk_event_controller_scroll_get_unit",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_event_controller_scroll_set_flags = Interop.downcallHandle(
                "gtk_event_controller_scroll_set_flags",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_event_controller_scroll_get_type = Interop.downcallHandle(
                "gtk_event_controller_scroll_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_event_controller_scroll_get_type != null;
    }
}
