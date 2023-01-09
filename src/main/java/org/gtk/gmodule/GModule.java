package org.gtk.gmodule;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GModule namespace.
 */
public final class GModule {
    
    static {
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}

/**
 * A portable way to build the filename of a module. The platform-specific
 * prefix and suffix are added to the filename, if needed, and the result
 * is added to the directory, using the correct separator character.
 * <p>
 * The directory should specify the directory where the module can be found.
 * It can be {@code null} or an empty string to indicate that the module is in a
 * standard platform-specific directory, though this is not recommended
 * since the wrong module may be found.
 * <p>
 * For example, calling g_module_build_path() on a Linux system with a
 * {@code directory} of {@code /lib} and a {@code module_name} of "mylibrary" will return
 * {@code /lib/libmylibrary.so}. On a Windows system, using {@code \\Windows} as the
 * directory it will return {@code \\Windows\\mylibrary.dll}.
 * @param directory the directory where the module is. This can be
 *     {@code null} or the empty string to indicate that the standard platform-specific
 *     directories will be used, though that is not recommended
 * @param moduleName the name of the module
 * @return the complete path of the module, including the standard library
 *     prefix and suffix. This should be freed when no longer needed
 */
public static java.lang.String moduleBuildPath(@Nullable java.lang.String directory, java.lang.String moduleName) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_module_build_path.invokeExact(
                    (Addressable) (directory == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(directory, SCOPE)),
                    Marshal.stringToAddress.marshal(moduleName, SCOPE));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
}

/**
 * Gets a string describing the last module error.
 * @return a string describing the last module error
 */
public static java.lang.String moduleError() {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.g_module_error.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.addressToString.marshal(RESULT, null);
}

public static org.gtk.glib.Quark moduleErrorQuark() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_module_error_quark.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return new org.gtk.glib.Quark(RESULT);
}

/**
 * Checks if modules are supported on the current platform.
 * @return {@code true} if modules are supported
 */
public static boolean moduleSupported() {
    int RESULT;
    try {
        RESULT = (int) DowncallHandles.g_module_supported.invokeExact();
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
}
    
    private static class DowncallHandles {

private static final MethodHandle g_module_build_path = Interop.downcallHandle(
        "g_module_build_path",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_module_error = Interop.downcallHandle(
        "g_module_error",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle g_module_error_quark = Interop.downcallHandle(
        "g_module_error_quark",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle g_module_supported = Interop.downcallHandle(
        "g_module_supported",
        FunctionDescriptor.of(Interop.valueLayout.C_INT),
        false
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
    }
}
