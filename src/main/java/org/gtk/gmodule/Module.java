package org.gtk.gmodule;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link Module} struct is an opaque data structure to represent a
 * [dynamically-loaded module][glib-Dynamic-Loading-of-Modules].
 * It should only be accessed via the following functions.
 */
public class Module extends io.github.jwharm.javagi.ResourceBase {

    public Module(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_module_close = Interop.downcallHandle(
        "g_module_close",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Closes a module.
     */
    public boolean close() {
        int RESULT;
        try {
            RESULT = (int) g_module_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_module_make_resident = Interop.downcallHandle(
        "g_module_make_resident",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Ensures that a module will never be unloaded.
     * Any future g_module_close() calls on the module will be ignored.
     */
    public @NotNull void makeResident() {
        try {
            g_module_make_resident.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_module_name = Interop.downcallHandle(
        "g_module_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the filename that the module was opened with.
     * <p>
     * If {@code module} refers to the application itself, "main" is returned.
     */
    public @NotNull java.lang.String name() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_module_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_module_symbol = Interop.downcallHandle(
        "g_module_symbol",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a symbol pointer from a module, such as one exported
     * by {@code G_MODULE_EXPORT}. Note that a valid symbol can be {@code null}.
     */
    public boolean symbol(@NotNull java.lang.String symbolName, @Nullable Out<java.lang.foreign.MemoryAddress> symbol) {
        MemorySegment symbolPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_module_symbol.invokeExact(handle(), Interop.allocateNativeString(symbolName), (Addressable) symbolPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        symbol.set(symbolPOINTER.get(ValueLayout.ADDRESS, 0));
        return RESULT != 0;
    }
    
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
    public static @NotNull java.lang.String buildPath(@Nullable java.lang.String directory, @NotNull java.lang.String moduleName) {
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
    public static @NotNull java.lang.String error() {
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
    
    public static @NotNull org.gtk.glib.Quark errorQuark() {
        int RESULT;
        try {
            RESULT = (int) g_module_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static final MethodHandle g_module_open = Interop.downcallHandle(
        "g_module_open",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * A thin wrapper function around g_module_open_full()
     */
    public static @NotNull Module open(@Nullable java.lang.String fileName, @NotNull ModuleFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_module_open.invokeExact(Interop.allocateNativeString(fileName), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Module(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_module_open_full = Interop.downcallHandle(
        "g_module_open_full",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Opens a module. If the module has already been opened,
     * its reference count is incremented.
     * <p>
     * First of all g_module_open_full() tries to open {@code file_name} as a module.
     * If that fails and {@code file_name} has the ".la"-suffix (and is a libtool
     * archive) it tries to open the corresponding module. If that fails
     * and it doesn't have the proper module suffix for the platform
     * ({@code G_MODULE_SUFFIX}), this suffix will be appended and the corresponding
     * module will be opened. If that fails and {@code file_name} doesn't have the
     * ".la"-suffix, this suffix is appended and g_module_open_full() tries to open
     * the corresponding module. If eventually that fails as well, {@code null} is
     * returned.
     */
    public static @NotNull Module openFull(@Nullable java.lang.String fileName, @NotNull ModuleFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_module_open_full.invokeExact(Interop.allocateNativeString(fileName), flags.getValue(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Module(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_module_supported = Interop.downcallHandle(
        "g_module_supported",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks if modules are supported on the current platform.
     */
    public static boolean supported() {
        int RESULT;
        try {
            RESULT = (int) g_module_supported.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
