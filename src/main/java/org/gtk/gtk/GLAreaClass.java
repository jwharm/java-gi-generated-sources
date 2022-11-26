package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkGLAreaClass} structure contains only private data.
 */
public class GLAreaClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGLAreaClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("render"),
        Interop.valueLayout.ADDRESS.withName("resize"),
        Interop.valueLayout.ADDRESS.withName("create_context"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("_padding")
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
     * Allocate a new {@link GLAreaClass}
     * @return A new, uninitialized @{link GLAreaClass}
     */
    public static GLAreaClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        GLAreaClass newInstance = new GLAreaClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a GLAreaClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLAreaClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private GLAreaClass struct;
        
         /**
         * A {@link GLAreaClass.Build} object constructs a {@link GLAreaClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = GLAreaClass.allocate();
        }
        
         /**
         * Finish building the {@link GLAreaClass} struct.
         * @return A new instance of {@code GLAreaClass} with the fields 
         *         that were set in the Build object.
         */
        public GLAreaClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gtk.WidgetClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setRender(java.lang.foreign.MemoryAddress render) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (render == null ? MemoryAddress.NULL : render));
            return this;
        }
        
        public Build setResize(java.lang.foreign.MemoryAddress resize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("resize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resize == null ? MemoryAddress.NULL : resize));
            return this;
        }
        
        public Build setCreateContext(java.lang.foreign.MemoryAddress create_context) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_context"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_context == null ? MemoryAddress.NULL : create_context));
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
