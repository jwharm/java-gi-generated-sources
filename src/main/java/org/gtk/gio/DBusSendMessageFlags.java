package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when sending {@code GDBusMessages} on a {@link DBusConnection}.
 * @version 2.26
 */
public class DBusSendMessageFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No flags set.
     */
    public static final DBusSendMessageFlags NONE = new DBusSendMessageFlags(0);
    
    /**
     * Do not automatically
     * assign a serial number from the {@link DBusConnection} object when
     * sending a message.
     */
    public static final DBusSendMessageFlags PRESERVE_SERIAL = new DBusSendMessageFlags(1);
    
    public DBusSendMessageFlags(int value) {
        super(value);
    }
}
