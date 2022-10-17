package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An event related to a key-based device.
 */
public class KeyEvent extends Event {

    public KeyEvent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to KeyEvent */
    public static KeyEvent castFrom(org.gtk.gobject.Object gobject) {
        return new KeyEvent(gobject.refcounted());
    }
    
    private static final MethodHandle gdk_key_event_get_consumed_modifiers = Interop.downcallHandle(
        "gdk_key_event_get_consumed_modifiers",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the consumed modifiers from a key event.
     */
    public @NotNull ModifierType getConsumedModifiers() {
        int RESULT;
        try {
            RESULT = (int) gdk_key_event_get_consumed_modifiers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ModifierType(RESULT);
    }
    
    private static final MethodHandle gdk_key_event_get_keycode = Interop.downcallHandle(
        "gdk_key_event_get_keycode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the keycode from a key event.
     */
    public int getKeycode() {
        int RESULT;
        try {
            RESULT = (int) gdk_key_event_get_keycode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_key_event_get_keyval = Interop.downcallHandle(
        "gdk_key_event_get_keyval",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the keyval from a key event.
     */
    public int getKeyval() {
        int RESULT;
        try {
            RESULT = (int) gdk_key_event_get_keyval.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_key_event_get_layout = Interop.downcallHandle(
        "gdk_key_event_get_layout",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the layout from a key event.
     */
    public int getLayout() {
        int RESULT;
        try {
            RESULT = (int) gdk_key_event_get_layout.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_key_event_get_level = Interop.downcallHandle(
        "gdk_key_event_get_level",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts the shift level from a key event.
     */
    public int getLevel() {
        int RESULT;
        try {
            RESULT = (int) gdk_key_event_get_level.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gdk_key_event_get_match = Interop.downcallHandle(
        "gdk_key_event_get_match",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets a keyval and modifier combination that will match
     * the event.
     * <p>
     * See {@link KeyEvent#matches}.
     */
    public boolean getMatch(@NotNull Out<Integer> keyval, @NotNull Out<ModifierType> modifiers) {
        MemorySegment keyvalPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment modifiersPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) gdk_key_event_get_match.invokeExact(handle(), (Addressable) keyvalPOINTER.address(), (Addressable) modifiersPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        keyval.set(keyvalPOINTER.get(ValueLayout.JAVA_INT, 0));
        modifiers.set(new ModifierType(modifiersPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_key_event_is_modifier = Interop.downcallHandle(
        "gdk_key_event_is_modifier",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Extracts whether the key event is for a modifier key.
     */
    public boolean isModifier() {
        int RESULT;
        try {
            RESULT = (int) gdk_key_event_is_modifier.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gdk_key_event_matches = Interop.downcallHandle(
        "gdk_key_event_matches",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Matches a key event against a keyval and modifiers.
     * <p>
     * This is typically used to trigger keyboard shortcuts such as Ctrl-C.
     * <p>
     * Partial matches are possible where the combination matches
     * if the currently active group is ignored.
     * <p>
     * Note that we ignore Caps Lock for matching.
     */
    public @NotNull KeyMatch matches(@NotNull int keyval, @NotNull ModifierType modifiers) {
        int RESULT;
        try {
            RESULT = (int) gdk_key_event_matches.invokeExact(handle(), keyval, modifiers.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new KeyMatch(RESULT);
    }
    
}
