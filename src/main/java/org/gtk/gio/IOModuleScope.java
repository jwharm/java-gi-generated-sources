package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a scope for loading IO modules. A scope can be used for blocking
 * duplicate modules, or blocking a module you don't want to load.
 * <p>
 * The scope can be used with g_io_modules_load_all_in_directory_with_scope()
 * or g_io_modules_scan_all_in_directory_with_scope().
 */
public class IOModuleScope extends io.github.jwharm.javagi.ResourceBase {

    public IOModuleScope(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_io_module_scope_block = Interop.downcallHandle(
        "g_io_module_scope_block",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Block modules with the given {@code basename} from being loaded when
     * this scope is used with g_io_modules_scan_all_in_directory_with_scope()
     * or g_io_modules_load_all_in_directory_with_scope().
     */
    public @NotNull void block(@NotNull java.lang.String basename) {
        try {
            g_io_module_scope_block.invokeExact(handle(), Interop.allocateNativeString(basename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_io_module_scope_free = Interop.downcallHandle(
        "g_io_module_scope_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Free a module scope.
     */
    public @NotNull void free() {
        try {
            g_io_module_scope_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_io_module_scope_new = Interop.downcallHandle(
        "g_io_module_scope_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Create a new scope for loading of IO modules. A scope can be used for
     * blocking duplicate modules, or blocking a module you don't want to load.
     * <p>
     * Specify the {@link IOModuleScopeFlags#BLOCK_DUPLICATES} flag to block modules
     * which have the same base name as a module that has already been seen
     * in this scope.
     */
    public static @NotNull IOModuleScope new_(@NotNull IOModuleScopeFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_io_module_scope_new.invokeExact(flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new IOModuleScope(Refcounted.get(RESULT, true));
    }
    
}
