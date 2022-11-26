package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkBuildableIface} interface contains methods that are
 * necessary to allow {@code GtkBuilder} to construct an object from
 * a {@code GtkBuilder} UI definition.
 */
public class BuildableIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBuildableIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("set_id"),
        Interop.valueLayout.ADDRESS.withName("get_id"),
        Interop.valueLayout.ADDRESS.withName("add_child"),
        Interop.valueLayout.ADDRESS.withName("set_buildable_property"),
        Interop.valueLayout.ADDRESS.withName("construct_child"),
        Interop.valueLayout.ADDRESS.withName("custom_tag_start"),
        Interop.valueLayout.ADDRESS.withName("custom_tag_end"),
        Interop.valueLayout.ADDRESS.withName("custom_finished"),
        Interop.valueLayout.ADDRESS.withName("parser_finished"),
        Interop.valueLayout.ADDRESS.withName("get_internal_child")
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
     * Allocate a new {@link BuildableIface}
     * @return A new, uninitialized @{link BuildableIface}
     */
    public static BuildableIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BuildableIface newInstance = new BuildableIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface g_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a BuildableIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BuildableIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private BuildableIface struct;
        
         /**
         * A {@link BuildableIface.Build} object constructs a {@link BuildableIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = BuildableIface.allocate();
        }
        
         /**
         * Finish building the {@link BuildableIface} struct.
         * @return A new instance of {@code BuildableIface} with the fields 
         *         that were set in the Build object.
         */
        public BuildableIface construct() {
            return struct;
        }
        
        /**
         * the parent class
         * @param g_iface The value for the {@code g_iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setSetId(java.lang.foreign.MemoryAddress set_id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_id == null ? MemoryAddress.NULL : set_id));
            return this;
        }
        
        public Build setGetId(java.lang.foreign.MemoryAddress get_id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_id == null ? MemoryAddress.NULL : get_id));
            return this;
        }
        
        public Build setAddChild(java.lang.foreign.MemoryAddress add_child) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (add_child == null ? MemoryAddress.NULL : add_child));
            return this;
        }
        
        public Build setSetBuildableProperty(java.lang.foreign.MemoryAddress set_buildable_property) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_buildable_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_buildable_property == null ? MemoryAddress.NULL : set_buildable_property));
            return this;
        }
        
        public Build setConstructChild(java.lang.foreign.MemoryAddress construct_child) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("construct_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (construct_child == null ? MemoryAddress.NULL : construct_child));
            return this;
        }
        
        public Build setCustomTagStart(java.lang.foreign.MemoryAddress custom_tag_start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("custom_tag_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (custom_tag_start == null ? MemoryAddress.NULL : custom_tag_start));
            return this;
        }
        
        public Build setCustomTagEnd(java.lang.foreign.MemoryAddress custom_tag_end) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("custom_tag_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (custom_tag_end == null ? MemoryAddress.NULL : custom_tag_end));
            return this;
        }
        
        public Build setCustomFinished(java.lang.foreign.MemoryAddress custom_finished) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("custom_finished"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (custom_finished == null ? MemoryAddress.NULL : custom_finished));
            return this;
        }
        
        public Build setParserFinished(java.lang.foreign.MemoryAddress parser_finished) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parser_finished"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parser_finished == null ? MemoryAddress.NULL : parser_finished));
            return this;
        }
        
        public Build setGetInternalChild(java.lang.foreign.MemoryAddress get_internal_child) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_internal_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_internal_child == null ? MemoryAddress.NULL : get_internal_child));
            return this;
        }
    }
}
