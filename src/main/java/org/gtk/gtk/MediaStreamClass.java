package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MediaStreamClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkMediaStreamClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("play"),
        Interop.valueLayout.ADDRESS.withName("pause"),
        Interop.valueLayout.ADDRESS.withName("seek"),
        Interop.valueLayout.ADDRESS.withName("update_audio"),
        Interop.valueLayout.ADDRESS.withName("realize"),
        Interop.valueLayout.ADDRESS.withName("unrealize"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved5"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved6"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved7"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved8")
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
     * Allocate a new {@link MediaStreamClass}
     * @return A new, uninitialized @{link MediaStreamClass}
     */
    public static MediaStreamClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MediaStreamClass newInstance = new MediaStreamClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a MediaStreamClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MediaStreamClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MediaStreamClass struct;
        
         /**
         * A {@link MediaStreamClass.Build} object constructs a {@link MediaStreamClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MediaStreamClass.allocate();
        }
        
         /**
         * Finish building the {@link MediaStreamClass} struct.
         * @return A new instance of {@code MediaStreamClass} with the fields 
         *         that were set in the Build object.
         */
        public MediaStreamClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setPlay(java.lang.foreign.MemoryAddress play) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("play"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (play == null ? MemoryAddress.NULL : play));
            return this;
        }
        
        public Build setPause(java.lang.foreign.MemoryAddress pause) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pause"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pause == null ? MemoryAddress.NULL : pause));
            return this;
        }
        
        public Build setSeek(java.lang.foreign.MemoryAddress seek) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (seek == null ? MemoryAddress.NULL : seek));
            return this;
        }
        
        public Build setUpdateAudio(java.lang.foreign.MemoryAddress update_audio) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_audio"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (update_audio == null ? MemoryAddress.NULL : update_audio));
            return this;
        }
        
        public Build setRealize(java.lang.foreign.MemoryAddress realize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("realize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (realize == null ? MemoryAddress.NULL : realize));
            return this;
        }
        
        public Build setUnrealize(java.lang.foreign.MemoryAddress unrealize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unrealize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unrealize == null ? MemoryAddress.NULL : unrealize));
            return this;
        }
        
        public Build setGtkReserved1(java.lang.foreign.MemoryAddress _gtk_reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved1 == null ? MemoryAddress.NULL : _gtk_reserved1));
            return this;
        }
        
        public Build setGtkReserved2(java.lang.foreign.MemoryAddress _gtk_reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved2 == null ? MemoryAddress.NULL : _gtk_reserved2));
            return this;
        }
        
        public Build setGtkReserved3(java.lang.foreign.MemoryAddress _gtk_reserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved3 == null ? MemoryAddress.NULL : _gtk_reserved3));
            return this;
        }
        
        public Build setGtkReserved4(java.lang.foreign.MemoryAddress _gtk_reserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved4 == null ? MemoryAddress.NULL : _gtk_reserved4));
            return this;
        }
        
        public Build setGtkReserved5(java.lang.foreign.MemoryAddress _gtk_reserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved5 == null ? MemoryAddress.NULL : _gtk_reserved5));
            return this;
        }
        
        public Build setGtkReserved6(java.lang.foreign.MemoryAddress _gtk_reserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved6 == null ? MemoryAddress.NULL : _gtk_reserved6));
            return this;
        }
        
        public Build setGtkReserved7(java.lang.foreign.MemoryAddress _gtk_reserved7) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved7"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved7 == null ? MemoryAddress.NULL : _gtk_reserved7));
            return this;
        }
        
        public Build setGtkReserved8(java.lang.foreign.MemoryAddress _gtk_reserved8) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved8"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved8 == null ? MemoryAddress.NULL : _gtk_reserved8));
            return this;
        }
    }
}
