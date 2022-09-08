package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkShortcutAction` that calls gtk_widget_mnemonic_activate().
 */
public class MnemonicAction extends ShortcutAction {

    public MnemonicAction(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MnemonicAction */
    public static MnemonicAction castFrom(org.gtk.gobject.Object gobject) {
        return new MnemonicAction(gobject.getReference());
    }
    
}
