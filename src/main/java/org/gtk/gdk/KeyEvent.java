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
    protected KeyEvent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, KeyEvent> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new KeyEvent(input, ownership);
    
    /**
     * Extracts the consumed modifiers from a key event.
     * @return the consumed modifiers or {@code event}
     */
    public org.gtk.gdk.ModifierType getConsumedModifiers() {
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
    public boolean getMatch(Out<Integer> keyval, Out<org.gtk.gdk.ModifierType> modifiers) {
        MemorySegment keyvalPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public org.gtk.gdk.KeyMatch matches(int keyval, org.gtk.gdk.ModifierType modifiers) {
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gdk_key_event_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
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
