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
 * @version 2.30
 */
public class IOModuleScope extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOModuleScope";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static IOModuleScope allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IOModuleScope newInstance = new IOModuleScope(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public IOModuleScope(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Block modules with the given {@code basename} from being loaded when
     * this scope is used with g_io_modules_scan_all_in_directory_with_scope()
     * or g_io_modules_load_all_in_directory_with_scope().
     * @param basename the basename to block
     */
    public void block(@NotNull java.lang.String basename) {
        java.util.Objects.requireNonNull(basename, "Parameter 'basename' must not be null");
        try {
            DowncallHandles.g_io_module_scope_block.invokeExact(
                    handle(),
                    Interop.allocateNativeString(basename));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Free a module scope.
     */
    public void free() {
        try {
            DowncallHandles.g_io_module_scope_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new scope for loading of IO modules. A scope can be used for
     * blocking duplicate modules, or blocking a module you don't want to load.
     * <p>
     * Specify the {@link IOModuleScopeFlags#BLOCK_DUPLICATES} flag to block modules
     * which have the same base name as a module that has already been seen
     * in this scope.
     * @param flags flags for the new scope
     * @return the new module scope
     */
    public static @NotNull org.gtk.gio.IOModuleScope new_(@NotNull org.gtk.gio.IOModuleScopeFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_module_scope_new.invokeExact(
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.IOModuleScope(Refcounted.get(RESULT, true));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_io_module_scope_block = Interop.downcallHandle(
            "g_io_module_scope_block",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_io_module_scope_free = Interop.downcallHandle(
            "g_io_module_scope_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_io_module_scope_new = Interop.downcallHandle(
            "g_io_module_scope_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
