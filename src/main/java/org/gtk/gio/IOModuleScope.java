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
public class IOModuleScope extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIOModuleScope";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link IOModuleScope}
     * @return A new, uninitialized @{link IOModuleScope}
     */
    public static IOModuleScope allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IOModuleScope newInstance = new IOModuleScope(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IOModuleScope proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected IOModuleScope(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, IOModuleScope> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new IOModuleScope(input, ownership);
    
    /**
     * Block modules with the given {@code basename} from being loaded when
     * this scope is used with g_io_modules_scan_all_in_directory_with_scope()
     * or g_io_modules_load_all_in_directory_with_scope().
     * @param basename the basename to block
     */
    public void block(java.lang.String basename) {
        try {
            DowncallHandles.g_io_module_scope_block.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(basename, null));
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
    public static org.gtk.gio.IOModuleScope new_(org.gtk.gio.IOModuleScopeFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_io_module_scope_new.invokeExact(
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.IOModuleScope.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_io_module_scope_block = Interop.downcallHandle(
            "g_io_module_scope_block",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_module_scope_free = Interop.downcallHandle(
            "g_io_module_scope_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_io_module_scope_new = Interop.downcallHandle(
            "g_io_module_scope_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
    }
}
