package org.gtk.gmodule;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public final class GModule {
    
    private static final MethodHandle g_module_build_path = Interop.downcallHandle(
        "g_module_build_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public static @NotNull java.lang.String moduleBuildPath(@Nullable java.lang.String directory, @NotNull java.lang.String moduleName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_module_build_path.invokeExact(Interop.allocateNativeString(directory), Interop.allocateNativeString(moduleName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_module_error = Interop.downcallHandle(
        "g_module_error",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a string describing the last module error.
     */
    public static @NotNull java.lang.String moduleError() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_module_error.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_module_error_quark = Interop.downcallHandle(
        "g_module_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static @NotNull org.gtk.glib.Quark moduleErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) g_module_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static final MethodHandle g_module_supported = Interop.downcallHandle(
        "g_module_supported",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks if modules are supported on the current platform.
     */
    public static boolean moduleSupported() {
        int RESULT;
        try {
            RESULT = (int) g_module_supported.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
