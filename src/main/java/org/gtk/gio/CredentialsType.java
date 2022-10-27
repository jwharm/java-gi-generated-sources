package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enumeration describing different kinds of native credential types.
 * @version 2.26
 */
public class CredentialsType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Indicates an invalid native credential type.
     */
    public static final CredentialsType INVALID = new CredentialsType(0);
    
    /**
     * The native credentials type is a {@code struct ucred}.
     */
    public static final CredentialsType LINUX_UCRED = new CredentialsType(1);
    
    /**
     * The native credentials type is a {@code struct cmsgcred}.
     */
    public static final CredentialsType FREEBSD_CMSGCRED = new CredentialsType(2);
    
    /**
     * The native credentials type is a {@code struct sockpeercred}. Added in 2.30.
     */
    public static final CredentialsType OPENBSD_SOCKPEERCRED = new CredentialsType(3);
    
    /**
     * The native credentials type is a {@code ucred_t}. Added in 2.40.
     */
    public static final CredentialsType SOLARIS_UCRED = new CredentialsType(4);
    
    /**
     * The native credentials type is a {@code struct unpcbid}. Added in 2.42.
     */
    public static final CredentialsType NETBSD_UNPCBID = new CredentialsType(5);
    
    /**
     * The native credentials type is a {@code struct xucred}. Added in 2.66.
     */
    public static final CredentialsType APPLE_XUCRED = new CredentialsType(6);
    
    /**
     * The native credentials type is a PID {@code DWORD}. Added in 2.72.
     */
    public static final CredentialsType WIN32_PID = new CredentialsType(7);
    
    public CredentialsType(int value) {
        super(value);
    }
}
