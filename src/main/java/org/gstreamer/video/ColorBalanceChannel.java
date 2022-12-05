package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link ColorBalanceChannel} object represents a parameter
 * for modifying the color balance implemented by an element providing the
 * {@link ColorBalance} interface. For example, Hue or Saturation.
 */
public class ColorBalanceChannel extends org.gtk.gobject.Object {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstColorBalanceChannel";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("label"),
        Interop.valueLayout.C_INT.withName("min_value"),
        Interop.valueLayout.C_INT.withName("max_value"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a ColorBalanceChannel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ColorBalanceChannel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ColorBalanceChannel if its GType is a (or inherits from) "GstColorBalanceChannel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ColorBalanceChannel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstColorBalanceChannel", a ClassCastException will be thrown.
     */
    public static ColorBalanceChannel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ColorBalanceChannel.getType())) {
            return new ColorBalanceChannel(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstColorBalanceChannel");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_color_balance_channel_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ValueChanged {
        void signalReceived(ColorBalanceChannel sourceColorBalanceChannel, int value);
    }
    
    /**
     * Fired when the value of the indicated channel has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<ColorBalanceChannel.ValueChanged> onValueChanged(ColorBalanceChannel.ValueChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("value-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ColorBalanceChannel.Callbacks.class, "signalColorBalanceChannelValueChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ColorBalanceChannel.ValueChanged>(handle(), RESULT);
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
         * A {@link ColorBalanceChannel.Build} object constructs a {@link ColorBalanceChannel} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ColorBalanceChannel} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ColorBalanceChannel} using {@link ColorBalanceChannel#castFrom}.
         * @return A new instance of {@code ColorBalanceChannel} with the properties 
         *         that were set in the Build object.
         */
        public ColorBalanceChannel construct() {
            return ColorBalanceChannel.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ColorBalanceChannel.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_color_balance_channel_get_type = Interop.downcallHandle(
            "gst_color_balance_channel_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalColorBalanceChannelValueChanged(MemoryAddress sourceColorBalanceChannel, int value, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ColorBalanceChannel.ValueChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ColorBalanceChannel(sourceColorBalanceChannel, Ownership.NONE), value);
        }
    }
}
