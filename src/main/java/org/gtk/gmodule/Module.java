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
    
    static {
        GModule.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Module(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Closes a module.
     * @return {@code true} on success
     */
    public boolean close() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_module_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Ensures that a module will never be unloaded.
     * Any future g_module_close() calls on the module will be ignored.
     */
    public void makeResident() {
        try {
            DowncallHandles.g_module_make_resident.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the filename that the module was opened with.
     * <p>
     * If {@code module} refers to the application itself, "main" is returned.
     * @return the filename of the module
     */
    public @NotNull java.lang.String name() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_module_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a symbol pointer from a module, such as one exported
     * by {@code G_MODULE_EXPORT}. Note that a valid symbol can be {@code null}.
     * @param symbolName the name of the symbol to find
     * @param symbol returns the pointer to the symbol value
     * @return {@code true} on success
     */
    public boolean symbol(@NotNull java.lang.String symbolName, @Nullable Out<java.lang.foreign.MemoryAddress> symbol) {
        java.util.Objects.requireNonNull(symbolName, "Parameter 'symbolName' must not be null");
        java.util.Objects.requireNonNullElse(symbol, MemoryAddress.NULL);
        MemorySegment symbolPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_module_symbol.invokeExact(handle(), Interop.allocateNativeString(symbolName), (Addressable) symbolPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        symbol.set(symbolPOINTER.get(ValueLayout.ADDRESS, 0));
        return RESULT != 0;
    }
    
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
    public static @NotNull java.lang.String buildPath(@Nullable java.lang.String directory, @NotNull java.lang.String moduleName) {
        java.util.Objects.requireNonNullElse(directory, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(moduleName, "Parameter 'moduleName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_module_build_path.invokeExact(Interop.allocateNativeString(directory), Interop.allocateNativeString(moduleName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a string describing the last module error.
     * @return a string describing the last module error
     */
    public static @NotNull java.lang.String error() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_module_error.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    public static @NotNull org.gtk.glib.Quark errorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_module_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * A thin wrapper function around g_module_open_full()
     * @param fileName the name of the file containing the module, or {@code null}
     *     to obtain a {@link Module} representing the main program itself
     * @param flags the flags used for opening the module. This can be the
     *     logical OR of any of the {@link ModuleFlags}.
     * @return a {@link Module} on success, or {@code null} on failure
     */
    public static @NotNull org.gtk.gmodule.Module open(@Nullable java.lang.String fileName, @NotNull org.gtk.gmodule.ModuleFlags flags) {
        java.util.Objects.requireNonNullElse(fileName, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_module_open.invokeExact(Interop.allocateNativeString(fileName), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gmodule.Module(Refcounted.get(RESULT, false));
    }
    
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
     * @param fileName the name of the file containing the module, or {@code null}
     *     to obtain a {@link Module} representing the main program itself
     * @param flags the flags used for opening the module. This can be the
     *     logical OR of any of the {@link ModuleFlags}
     * @return a {@link Module} on success, or {@code null} on failure
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @NotNull org.gtk.gmodule.Module openFull(@Nullable java.lang.String fileName, @NotNull org.gtk.gmodule.ModuleFlags flags) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNullElse(fileName, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_module_open_full.invokeExact(Interop.allocateNativeString(fileName), flags.getValue(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gmodule.Module(Refcounted.get(RESULT, false));
    }
    
    /**
     * Checks if modules are supported on the current platform.
     * @return {@code true} if modules are supported
     */
    public static boolean supported() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_module_supported.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_module_close = Interop.downcallHandle(
            "g_module_close",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_module_make_resident = Interop.downcallHandle(
            "g_module_make_resident",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_module_name = Interop.downcallHandle(
            "g_module_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_module_symbol = Interop.downcallHandle(
            "g_module_symbol",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_module_build_path = Interop.downcallHandle(
            "g_module_build_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_module_error = Interop.downcallHandle(
            "g_module_error",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_module_error_quark = Interop.downcallHandle(
            "g_module_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_module_open = Interop.downcallHandle(
            "g_module_open",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_module_open_full = Interop.downcallHandle(
            "g_module_open_full",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_module_supported = Interop.downcallHandle(
            "g_module_supported",
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
    }
}
