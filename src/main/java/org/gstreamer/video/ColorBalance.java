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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ColorBalanceImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ColorBalanceImpl(input, ownership);
    
    /**
     * Get the {@link ColorBalanceType} of this implementation.
     * @return A the {@link ColorBalanceType}.
     */
    default org.gstreamer.video.ColorBalanceType getBalanceType() {
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
    default int getValue(org.gstreamer.video.ColorBalanceChannel channel) {
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
    default org.gtk.glib.List listChannels() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_color_balance_list_channels.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.NONE);
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
    default void setValue(org.gstreamer.video.ColorBalanceChannel channel, int value) {
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
    default void valueChanged(org.gstreamer.video.ColorBalanceChannel channel, int value) {
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
    public static org.gtk.glib.Type getType() {
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
        void run(org.gstreamer.video.ColorBalanceChannel channel, int value);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceColorBalance, MemoryAddress channel, int value) {
            run((org.gstreamer.video.ColorBalanceChannel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(channel)), org.gstreamer.video.ColorBalanceChannel.fromAddress).marshal(channel, Ownership.NONE), value);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Fired when the value of the indicated channel has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ColorBalance.ValueChanged> onValueChanged(ColorBalance.ValueChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("value-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
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
    
    class ColorBalanceImpl extends org.gtk.gobject.GObject implements ColorBalance {
        
        static {
            GstVideo.javagi$ensureInitialized();
        }
        
        public ColorBalanceImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
