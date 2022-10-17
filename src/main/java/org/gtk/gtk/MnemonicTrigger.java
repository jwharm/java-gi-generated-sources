package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutTrigger} that triggers when a specific mnemonic is pressed.
 * <p>
 * Mnemonics require a <strong>mnemonic modifier</strong> (typically &lt;kbd&gt;Alt&lt;/kbd&gt;) to be
 * pressed together with the mnemonic key.
 */
public class MnemonicTrigger extends ShortcutTrigger {

    public MnemonicTrigger(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MnemonicTrigger */
    public static MnemonicTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new MnemonicTrigger(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_mnemonic_trigger_new = Interop.downcallHandle(
        "gtk_mnemonic_trigger_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull int keyval) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_mnemonic_trigger_new.invokeExact(keyval), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkShortcutTrigger} that will trigger whenever the key with
     * the given {@code keyval} is pressed and mnemonics have been activated.
     * <p>
     * Mnemonics are activated by calling code when a key event with the right
     * modifiers is detected.
     */
    public MnemonicTrigger(@NotNull int keyval) {
        super(constructNew(keyval));
    }
    
    private static final MethodHandle gtk_mnemonic_trigger_get_keyval = Interop.downcallHandle(
        "gtk_mnemonic_trigger_get_keyval",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the keyval that must be pressed to succeed triggering {@code self}.
     */
    public int getKeyval() {
        int RESULT;
        try {
            RESULT = (int) gtk_mnemonic_trigger_get_keyval.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
