package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to a key-based device.
 */
public class KeyEvent extends org.gtk.gdk.Event {
    
    static {
        Gdk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GdkKeyEvent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a KeyEvent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public KeyEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to KeyEvent if its GType is a (or inherits from) "GdkKeyEvent".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code KeyEvent} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GdkKeyEvent", a ClassCastException will be thrown.
     */
    public static KeyEvent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), KeyEvent.getType())) {
            return new KeyEvent(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GdkKeyEvent");
        }
    }
    
    /**
     * Extracts the consumed modifiers from a key event.
     * @return the consumed modifiers or {@code event}
     */
    public @NotNull org.gtk.gdk.ModifierType getConsumedModifiers() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_key_event_get_consumed_modifiers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ModifierType(RESULT);
    }
    
    /**
     * Extracts the keycode from a key event.
     * @return the keycode of {@code event}
     */
    public int getKeycode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_key_event_get_keycode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Extracts the keyval from a key event.
     * @return the keyval of {@code event}
     */
    public int getKeyval() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_key_event_get_keyval.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Extracts the layout from a key event.
     * @return the layout of {@code event}
     */
    public int getLayout() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_key_event_get_layout.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Extracts the shift level from a key event.
     * @return the shift level of {@code event}
     */
    public int getLevel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_key_event_get_level.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets a keyval and modifier combination that will match
     * the event.
     * <p>
     * See {@link KeyEvent#matches}.
     * @param keyval return location for a keyval
     * @param modifiers return location for modifiers
     * @return {@code true} on success
     */
    public boolean getMatch(Out<Integer> keyval, @NotNull Out<org.gtk.gdk.ModifierType> modifiers) {
        java.util.Objects.requireNonNull(keyval, "Parameter 'keyval' must not be null");
        MemorySegment keyvalPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(modifiers, "Parameter 'modifiers' must not be null");
        MemorySegment modifiersPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_key_event_get_match.invokeExact(
                    handle(),
                    (Addressable) keyvalPOINTER.address(),
                    (Addressable) modifiersPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        keyval.set(keyvalPOINTER.get(Interop.valueLayout.C_INT, 0));
        modifiers.set(new org.gtk.gdk.ModifierType(modifiersPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return RESULT != 0;
    }
    
    /**
     * Extracts whether the key event is for a modifier key.
     * @return {@code true} if the {@code event} is for a modifier key
     */
    public boolean isModifier() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_key_event_is_modifier.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Matches a key event against a keyval and modifiers.
     * <p>
     * This is typically used to trigger keyboard shortcuts such as Ctrl-C.
     * <p>
     * Partial matches are possible where the combination matches
     * if the currently active group is ignored.
     * <p>
     * Note that we ignore Caps Lock for matching.
     * @param keyval the keyval to match
     * @param modifiers the modifiers to match
     * @return a {@code GdkKeyMatch} value describing whether {@code event} matches
     */
    public @NotNull org.gtk.gdk.KeyMatch matches(int keyval, @NotNull org.gtk.gdk.ModifierType modifiers) {
        java.util.Objects.requireNonNull(modifiers, "Parameter 'modifiers' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gdk_key_event_matches.invokeExact(
                    handle(),
                    keyval,
                    modifiers.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gdk.KeyMatch.of(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_key_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gdk.Event.Build {
        
         /**
         * A {@link KeyEvent.Build} object constructs a {@link KeyEvent} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link KeyEvent} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link KeyEvent} using {@link KeyEvent#castFrom}.
         * @return A new instance of {@code KeyEvent} with the properties 
         *         that were set in the Build object.
         */
        public KeyEvent construct() {
            return KeyEvent.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    KeyEvent.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gdk_key_event_get_consumed_modifiers = Interop.downcallHandle(
            "gdk_key_event_get_consumed_modifiers",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_key_event_get_keycode = Interop.downcallHandle(
            "gdk_key_event_get_keycode",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_key_event_get_keyval = Interop.downcallHandle(
            "gdk_key_event_get_keyval",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_key_event_get_layout = Interop.downcallHandle(
            "gdk_key_event_get_layout",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_key_event_get_level = Interop.downcallHandle(
            "gdk_key_event_get_level",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_key_event_get_match = Interop.downcallHandle(
            "gdk_key_event_get_match",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_key_event_is_modifier = Interop.downcallHandle(
            "gdk_key_event_is_modifier",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gdk_key_event_matches = Interop.downcallHandle(
            "gdk_key_event_matches",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gdk_key_event_get_type = Interop.downcallHandle(
            "gdk_key_event_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
