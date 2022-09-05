package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutTrigger` that triggers when a specific mnemonic is pressed.
 * 
 * Mnemonics require a *mnemonic modifier* (typically <kbd>Alt</kbd>) to be
 * pressed together with the mnemonic key.
 */
public class MnemonicTrigger extends ShortcutTrigger {

    public MnemonicTrigger(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to MnemonicTrigger */
    public static MnemonicTrigger castFrom(org.gtk.gobject.Object gobject) {
        return new MnemonicTrigger(gobject.getProxy());
    }
    
    /**
     * Creates a `GtkShortcutTrigger` that will trigger whenever the key with
     * the given @keyval is pressed and mnemonics have been activated.
     * 
     * Mnemonics are activated by calling code when a key event with the right
     * modifiers is detected.
     */
    public MnemonicTrigger(int keyval) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_mnemonic_trigger_new(keyval), true));
    }
    
    /**
     * Gets the keyval that must be pressed to succeed triggering @self.
     */
    public int getKeyval() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_mnemonic_trigger_get_keyval(HANDLE());
        return RESULT;
    }
    
}
