package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This interface is implemented by elements which can perform some color
 * balance operation on video frames they process. For example, modifying
 * the brightness, contrast, hue or saturation.
 * <p>
 * Example elements are 'xvimagesink' and 'colorbalance'
 */
public interface ColorBalance extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to ColorBalance if its GType is a (or inherits from) "GstColorBalance".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ColorBalance} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstColorBalance", a ClassCastException will be thrown.
     */
    public static ColorBalance castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ColorBalance.getType())) {
            return new ColorBalanceImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstColorBalance");
        }
    }
    
    /**
     * Get the {@link ColorBalanceType} of this implementation.
     * @return A the {@link ColorBalanceType}.
     */
    default @NotNull org.gstreamer.video.ColorBalanceType getBalanceType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_color_balance_get_balance_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.video.ColorBalanceType.of(RESULT);
    }
    
    /**
     * Retrieve the current value of the indicated channel, between min_value
     * and max_value.
     * <p>
     * See Also: The {@link ColorBalanceChannel}.min_value and
     *         {@link ColorBalanceChannel}.max_value members of the
     *         {@link ColorBalanceChannel} object.
     * @param channel A {@link ColorBalanceChannel} instance
     * @return The current value of the channel.
     */
    default int getValue(@NotNull org.gstreamer.video.ColorBalanceChannel channel) {
        java.util.Objects.requireNonNull(channel, "Parameter 'channel' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_color_balance_get_value.invokeExact(
                    handle(),
                    channel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieve a list of the available channels.
     * @return A
     *          GList containing pointers to {@link ColorBalanceChannel}
     *          objects. The list is owned by the {@link ColorBalance}
     *          instance and must not be freed.
     */
    default @NotNull org.gtk.glib.List listChannels() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_color_balance_list_channels.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the current value of the channel to the passed value, which must
     * be between min_value and max_value.
     * <p>
     * See Also: The {@link ColorBalanceChannel}.min_value and
     *         {@link ColorBalanceChannel}.max_value members of the
     *         {@link ColorBalanceChannel} object.
     * @param channel A {@link ColorBalanceChannel} instance
     * @param value The new value for the channel.
     */
    default void setValue(@NotNull org.gstreamer.video.ColorBalanceChannel channel, int value) {
        java.util.Objects.requireNonNull(channel, "Parameter 'channel' must not be null");
        try {
            DowncallHandles.gst_color_balance_set_value.invokeExact(
                    handle(),
                    channel.handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A helper function called by implementations of the GstColorBalance
     * interface. It fires the {@link ColorBalance}::value-changed signal on the
     * instance, and the {@link ColorBalanceChannel}::value-changed signal on the
     * channel object.
     * @param channel A {@link ColorBalanceChannel} whose value has changed
     * @param value The new value of the channel
     */
    default void valueChanged(@NotNull org.gstreamer.video.ColorBalanceChannel channel, int value) {
        java.util.Objects.requireNonNull(channel, "Parameter 'channel' must not be null");
        try {
            DowncallHandles.gst_color_balance_value_changed.invokeExact(
                    handle(),
                    channel.handle(),
                    value);
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
            RESULT = (long) DowncallHandles.gst_color_balance_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ValueChanged {
        void signalReceived(ColorBalance sourceColorBalance, @NotNull org.gstreamer.video.ColorBalanceChannel channel, int value);
    }
    
    /**
     * Fired when the value of the indicated channel has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ColorBalance.ValueChanged> onValueChanged(ColorBalance.ValueChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ColorBalance.Callbacks.class, "signalColorBalanceValueChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ColorBalance.ValueChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_color_balance_get_balance_type = Interop.downcallHandle(
            "gst_color_balance_get_balance_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_color_balance_get_value = Interop.downcallHandle(
            "gst_color_balance_get_value",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_color_balance_list_channels = Interop.downcallHandle(
            "gst_color_balance_list_channels",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_color_balance_set_value = Interop.downcallHandle(
            "gst_color_balance_set_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_color_balance_value_changed = Interop.downcallHandle(
            "gst_color_balance_value_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_color_balance_get_type = Interop.downcallHandle(
            "gst_color_balance_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalColorBalanceValueChanged(MemoryAddress sourceColorBalance, MemoryAddress channel, int value, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ColorBalance.ValueChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ColorBalance.ColorBalanceImpl(sourceColorBalance, Ownership.NONE), new org.gstreamer.video.ColorBalanceChannel(channel, Ownership.NONE), value);
        }
    }
    
    class ColorBalanceImpl extends org.gtk.gobject.Object implements ColorBalance {
        
        static {
            GstVideo.javagi$ensureInitialized();
        }
        
        public ColorBalanceImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
