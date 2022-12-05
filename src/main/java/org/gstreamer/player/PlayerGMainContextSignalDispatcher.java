package org.gstreamer.player;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PlayerGMainContextSignalDispatcher extends org.gtk.gobject.Object implements org.gstreamer.player.PlayerSignalDispatcher {
    
    static {
        GstPlayer.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPlayerGMainContextSignalDispatcher";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PlayerGMainContextSignalDispatcher proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PlayerGMainContextSignalDispatcher(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PlayerGMainContextSignalDispatcher if its GType is a (or inherits from) "GstPlayerGMainContextSignalDispatcher".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PlayerGMainContextSignalDispatcher} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstPlayerGMainContextSignalDispatcher", a ClassCastException will be thrown.
     */
    public static PlayerGMainContextSignalDispatcher castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), PlayerGMainContextSignalDispatcher.getType())) {
            return new PlayerGMainContextSignalDispatcher(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstPlayerGMainContextSignalDispatcher");
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_player_g_main_context_signal_dispatcher_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a new GstPlayerSignalDispatcher that uses {@code application_context},
     * or the thread default one if {@code null} is used. See gst_player_new().
     * @param applicationContext GMainContext to use or {@code null}
     * @return the new GstPlayerSignalDispatcher
     */
    public static @NotNull org.gstreamer.player.PlayerSignalDispatcher new_(@Nullable org.gtk.glib.MainContext applicationContext) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_player_g_main_context_signal_dispatcher_new.invokeExact(
                    (Addressable) (applicationContext == null ? MemoryAddress.NULL : applicationContext.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.player.PlayerSignalDispatcher.PlayerSignalDispatcherImpl(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link PlayerGMainContextSignalDispatcher.Build} object constructs a {@link PlayerGMainContextSignalDispatcher} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PlayerGMainContextSignalDispatcher} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PlayerGMainContextSignalDispatcher} using {@link PlayerGMainContextSignalDispatcher#castFrom}.
         * @return A new instance of {@code PlayerGMainContextSignalDispatcher} with the properties 
         *         that were set in the Build object.
         */
        public PlayerGMainContextSignalDispatcher construct() {
            return PlayerGMainContextSignalDispatcher.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PlayerGMainContextSignalDispatcher.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setApplicationContext(org.gtk.glib.MainContext applicationContext) {
            names.add("application-context");
            values.add(org.gtk.gobject.Value.create(applicationContext));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_player_g_main_context_signal_dispatcher_get_type = Interop.downcallHandle(
            "gst_player_g_main_context_signal_dispatcher_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_player_g_main_context_signal_dispatcher_new = Interop.downcallHandle(
            "gst_player_g_main_context_signal_dispatcher_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
