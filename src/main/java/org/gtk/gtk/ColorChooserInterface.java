package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ColorChooserInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkColorChooserInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_interface"),
        Interop.valueLayout.ADDRESS.withName("get_rgba"),
        Interop.valueLayout.ADDRESS.withName("set_rgba"),
        Interop.valueLayout.ADDRESS.withName("add_palette"),
        Interop.valueLayout.ADDRESS.withName("color_activated"),
        MemoryLayout.sequenceLayout(12, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link ColorChooserInterface}
     * @return A new, uninitialized @{link ColorChooserInterface}
     */
    public static ColorChooserInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ColorChooserInterface newInstance = new ColorChooserInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_interface}
     * @return The value of the field {@code base_interface}
     */
    public org.gtk.gobject.TypeInterface base_interface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_interface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a ColorChooserInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ColorChooserInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ColorChooserInterface struct;
        
         /**
         * A {@link ColorChooserInterface.Build} object constructs a {@link ColorChooserInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ColorChooserInterface.allocate();
        }
        
         /**
         * Finish building the {@link ColorChooserInterface} struct.
         * @return A new instance of {@code ColorChooserInterface} with the fields 
         *         that were set in the Build object.
         */
        public ColorChooserInterface construct() {
            return struct;
        }
        
        public Build setBaseInterface(org.gtk.gobject.TypeInterface base_interface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_interface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (base_interface == null ? MemoryAddress.NULL : base_interface.handle()));
            return this;
        }
        
        public Build setGetRgba(java.lang.foreign.MemoryAddress get_rgba) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_rgba"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_rgba == null ? MemoryAddress.NULL : get_rgba));
            return this;
        }
        
        public Build setSetRgba(java.lang.foreign.MemoryAddress set_rgba) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_rgba"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_rgba == null ? MemoryAddress.NULL : set_rgba));
            return this;
        }
        
        public Build setAddPalette(java.lang.foreign.MemoryAddress add_palette) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_palette"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (add_palette == null ? MemoryAddress.NULL : add_palette));
            return this;
        }
        
        public Build setColorActivated(java.lang.foreign.MemoryAddress color_activated) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("color_activated"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (color_activated == null ? MemoryAddress.NULL : color_activated));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
