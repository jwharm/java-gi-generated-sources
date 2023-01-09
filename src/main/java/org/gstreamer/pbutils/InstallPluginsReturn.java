package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Result codes returned by gst_install_plugins_async() and
 * gst_install_plugins_sync(), and also the result code passed to the
 * {@link InstallPluginsResultFunc} specified with gst_install_plugins_async().
 * <p>
 * These codes indicate success or failure of starting an external installer
 * program and to what extent the requested plugins could be installed.
 */
public enum InstallPluginsReturn implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * all of the requested plugins could be
     *     installed
     */
    SUCCESS(0),
    
    /**
     * no appropriate installation candidate for
     *     any of the requested plugins could be found. Only return this if nothing
     *     has been installed. Return {@code GST_INSTALL_PLUGINS_PARTIAL_SUCCESS} if
     *     some (but not all) of the requested plugins could be installed.
     */
    NOT_FOUND(1),
    
    /**
     * an error occurred during the installation. If
     *     this happens, the  user has already seen an error message and another
     *     one should not be displayed
     */
    ERROR(2),
    
    /**
     * some of the requested plugins could
     *     be installed, but not all
     */
    PARTIAL_SUCCESS(3),
    
    /**
     * the user has aborted the installation
     */
    USER_ABORT(4),
    
    /**
     * the installer had an unclean exit code
     *     (ie. death by signal)
     */
    CRASHED(100),
    
    /**
     * the helper returned an invalid status code
     */
    INVALID(101),
    
    /**
     * returned by gst_install_plugins_async() to
     *     indicate that everything went fine so far and the provided callback
     *     will be called with the result of the installation later
     */
    STARTED_OK(200),
    
    /**
     * some internal failure has
     *     occurred when trying to start the installer
     */
    INTERNAL_FAILURE(201),
    
    /**
     * the helper script to call the
     *     actual installer is not installed
     */
    HELPER_MISSING(202),
    
    /**
     * a previously-started plugin
     *     installation is still in progress, try again later
     */
    INSTALL_IN_PROGRESS(203);
    
    private static final java.lang.String C_TYPE_NAME = "GstInstallPluginsReturn";
    
    private final int value;
    
    /**
     * Create a new InstallPluginsReturn for the provided value
     * @param numeric value the enum value
     */
    InstallPluginsReturn(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new InstallPluginsReturn for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static InstallPluginsReturn of(int value) {
        return switch (value) {
            case 0 -> SUCCESS;
            case 1 -> NOT_FOUND;
            case 2 -> ERROR;
            case 3 -> PARTIAL_SUCCESS;
            case 4 -> USER_ABORT;
            case 100 -> CRASHED;
            case 101 -> INVALID;
            case 200 -> STARTED_OK;
            case 201 -> INTERNAL_FAILURE;
            case 202 -> HELPER_MISSING;
            case 203 -> INSTALL_IN_PROGRESS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    /**
     * Convenience function to return the descriptive string associated
     * with a status code.  This function returns English strings and
     * should not be used for user messages. It is here only to assist
     * in debugging.
     * @param ret the return status code
     * @return a descriptive string for the status code in {@code ret}
     */
    public static java.lang.String getName(org.gstreamer.pbutils.InstallPluginsReturn ret) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_install_plugins_return_get_name.invokeExact(ret.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_install_plugins_return_get_name = Interop.downcallHandle(
                "gst_install_plugins_return_get_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
}
