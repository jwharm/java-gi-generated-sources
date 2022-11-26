package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkLayoutManagerClass} structure contains only private data, and
 * should only be accessed through the provided API, or when subclassing
 * {@code GtkLayoutManager}.
 */
public class LayoutManagerClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkLayoutManagerClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_request_mode"),
        Interop.valueLayout.ADDRESS.withName("measure"),
        Interop.valueLayout.ADDRESS.withName("allocate"),
        Interop.valueLayout.C_LONG.withName("layout_child_type"),
        Interop.valueLayout.ADDRESS.withName("create_layout_child"),
        Interop.valueLayout.ADDRESS.withName("root"),
        Interop.valueLayout.ADDRESS.withName("unroot"),
        MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("_padding")
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
     * Allocate a new {@link LayoutManagerClass}
     * @return A new, uninitialized @{link LayoutManagerClass}
     */
    public static LayoutManagerClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        LayoutManagerClass newInstance = new LayoutManagerClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code layout_child_type}
     * @return The value of the field {@code layout_child_type}
     */
    public org.gtk.glib.Type layout_child_type$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layout_child_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code layout_child_type}
     * @param layout_child_type The new value of the field {@code layout_child_type}
     */
    public void layout_child_type$set(org.gtk.glib.Type layout_child_type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("layout_child_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), layout_child_type.getValue().longValue());
    }
    
    /**
     * Create a LayoutManagerClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LayoutManagerClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private LayoutManagerClass struct;
        
         /**
         * A {@link LayoutManagerClass.Build} object constructs a {@link LayoutManagerClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = LayoutManagerClass.allocate();
        }
        
         /**
         * Finish building the {@link LayoutManagerClass} struct.
         * @return A new instance of {@code LayoutManagerClass} with the fields 
         *         that were set in the Build object.
         */
        public LayoutManagerClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setGetRequestMode(java.lang.foreign.MemoryAddress get_request_mode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_request_mode == null ? MemoryAddress.NULL : get_request_mode));
            return this;
        }
        
        public Build setMeasure(java.lang.foreign.MemoryAddress measure) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measure == null ? MemoryAddress.NULL : measure));
            return this;
        }
        
        public Build setAllocate(java.lang.foreign.MemoryAddress allocate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("allocate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (allocate == null ? MemoryAddress.NULL : allocate));
            return this;
        }
        
        /**
         * the type of {@code GtkLayoutChild} used by this layout manager
         * @param layout_child_type The value for the {@code layout_child_type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLayoutChildType(org.gtk.glib.Type layout_child_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("layout_child_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (layout_child_type == null ? MemoryAddress.NULL : layout_child_type.getValue().longValue()));
            return this;
        }
        
        public Build setCreateLayoutChild(java.lang.foreign.MemoryAddress create_layout_child) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_layout_child"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_layout_child == null ? MemoryAddress.NULL : create_layout_child));
            return this;
        }
        
        public Build setRoot(java.lang.foreign.MemoryAddress root) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("root"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (root == null ? MemoryAddress.NULL : root));
            return this;
        }
        
        public Build setUnroot(java.lang.foreign.MemoryAddress unroot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unroot"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unroot == null ? MemoryAddress.NULL : unroot));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] _padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(_padding, false)));
            return this;
        }
    }
}
