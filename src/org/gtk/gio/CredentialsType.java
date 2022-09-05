package org.gtk.gio;

/**
 * Enumeration describing different kinds of native credential types.
 */
public enum CredentialsType {

    /**
     * Indicates an invalid native credential type.
     */
    INVALID,
    
    /**
     * The native credentials type is a `struct ucred`.
     */
    LINUX_UCRED,
    
    /**
     * The native credentials type is a `struct cmsgcred`.
     */
    FREEBSD_CMSGCRED,
    
    /**
     * The native credentials type is a `struct sockpeercred`. Added in 2.30.
     */
    OPENBSD_SOCKPEERCRED,
    
    /**
     * The native credentials type is a `ucred_t`. Added in 2.40.
     */
    SOLARIS_UCRED,
    
    /**
     * The native credentials type is a `struct unpcbid`. Added in 2.42.
     */
    NETBSD_UNPCBID,
    
    /**
     * The native credentials type is a `struct xucred`. Added in 2.66.
     */
    APPLE_XUCRED,
    
    /**
     * The native credentials type is a PID `DWORD`. Added in 2.72.
     */
    WIN32_PID;
    
    public static CredentialsType fromValue(int value) {
        return switch(value) {
            case 0 -> INVALID;
            case 1 -> LINUX_UCRED;
            case 2 -> FREEBSD_CMSGCRED;
            case 3 -> OPENBSD_SOCKPEERCRED;
            case 4 -> SOLARIS_UCRED;
            case 5 -> NETBSD_UNPCBID;
            case 6 -> APPLE_XUCRED;
            case 7 -> WIN32_PID;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case LINUX_UCRED -> 1;
            case FREEBSD_CMSGCRED -> 2;
            case OPENBSD_SOCKPEERCRED -> 3;
            case SOLARIS_UCRED -> 4;
            case NETBSD_UNPCBID -> 5;
            case APPLE_XUCRED -> 6;
            case WIN32_PID -> 7;
        };
    }

}
