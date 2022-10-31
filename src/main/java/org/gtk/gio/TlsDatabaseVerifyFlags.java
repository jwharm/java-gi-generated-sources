package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for g_tls_database_verify_chain().
 * @version 2.30
 */
public class TlsDatabaseVerifyFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GTlsDatabaseVerifyFlags";
    
    /**
     * No verification flags
     */
    public static final TlsDatabaseVerifyFlags NONE = new TlsDatabaseVerifyFlags(0);
    
    public TlsDatabaseVerifyFlags(int value) {
        super(value);
    }
}
