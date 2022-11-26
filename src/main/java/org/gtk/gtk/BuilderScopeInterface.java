package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table to implement for {@code GtkBuilderScope} implementations.
 * Default implementations for each function do exist, but they usually just fail,
 * so it is suggested that implementations implement all of them.
 */
public class BuilderScopeInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuilderScopeInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("get_type_from_name"),
        Interop.valueLayout.ADDRESS.withName("get_type_from_function"),
        Interop.valueLayout.ADDRESS.withName("create_closure")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BuilderScopeInterface}
     * @return A new, uninitialized @{link BuilderScopeInterface}
     */
    public static BuilderScopeInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BuilderScopeInterface newInstance = new BuilderScopeInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BuilderScopeInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BuilderScopeInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private BuilderScopeInterface struct;
        
         /**
         * A {@link BuilderScopeInterface.Build} object constructs a {@link BuilderScopeInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = BuilderScopeInterface.allocate();
        }
        
         /**
         * Finish building the {@link BuilderScopeInterface} struct.
         * @return A new instance of {@code BuilderScopeInterface} with the fields 
         *         that were set in the Build object.
         */
        public BuilderScopeInterface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setGetTypeFromName(java.lang.foreign.MemoryAddress get_type_from_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_type_from_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_type_from_name == null ? MemoryAddress.NULL : get_type_from_name));
            return this;
        }
        
        public Build setGetTypeFromFunction(java.lang.foreign.MemoryAddress get_type_from_function) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_type_from_function"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_type_from_function == null ? MemoryAddress.NULL : get_type_from_function));
            return this;
        }
        
        public Build setCreateClosure(java.lang.foreign.MemoryAddress create_closure) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_closure"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_closure == null ? MemoryAddress.NULL : create_closure));
            return this;
        }
    }
}
