package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Message flags used in {@link DBusMessage}.
 * @version 2.26
 */
public class DBusMessageFlags extends io.github.jwharm.javagi.Bitfield {
    
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
    public static final DBusMessageFlags NONE = new DBusMessageFlags(0);
    
    /**
     * A reply is not expected.
     */
    public static final DBusMessageFlags NO_REPLY_EXPECTED = new DBusMessageFlags(1);
    
    /**
     * The bus must not launch an
     * owner for the destination name in response to this message.
     */
    public static final DBusMessageFlags NO_AUTO_START = new DBusMessageFlags(2);
    
    /**
     * If set on a method
     * call, this flag means that the caller is prepared to wait for interactive
     * authorization. Since 2.46.
     */
    public static final DBusMessageFlags ALLOW_INTERACTIVE_AUTHORIZATION = new DBusMessageFlags(4);
    
    public DBusMessageFlags(int value) {
        super(value);
    }
}
