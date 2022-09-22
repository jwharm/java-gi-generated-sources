package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkShortcutTrigger} that triggers when a specific mnemonic is pressed.
 * <p>
 * Mnemonics require a <strong>mnemonic modifier</strong> (typically &lt;kbd>Alt</kbd&gt;) to be
 * pressed together with the mnemonic key.
 */
public class MnemonicTrigger extends ShortcutTrigger {

    public MnemonicTrigger(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MnemonicTrigger */
    public static MnemonicTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new MnemonicTrigger(gobject.getReference());
    }
    
    private static Reference constructNew(int keyval) {
        Reference RESULT = References.get(gtk_h.gtk_mnemonic_trigger_new(keyval), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkShortcutTrigger} that will trigger whenever the key with
     * the given {@code keyval} is pressed and mnemonics have been activated.
     * <p>
     * Mnemonics are activated by calling code when a key event with the right
     * modifiers is detected.
     */
    public MnemonicTrigger(int keyval) {
        super(constructNew(keyval));
    }
    
    /**
     * Gets the keyval that must be pressed to succeed triggering {@code self}.
     */
    public int getKeyval() {
        var RESULT = gtk_h.gtk_mnemonic_trigger_get_keyval(handle());
        return RESULT;
    }
    
}
