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
    
    private static final java.lang.String C_TYPE_NAME = "GDBusSendMessageFlags";
    
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
