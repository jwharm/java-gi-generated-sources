package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PrintOperationPreviewIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintOperationPreviewIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("ready"),
        Interop.valueLayout.ADDRESS.withName("got_page_size"),
        Interop.valueLayout.ADDRESS.withName("render_page"),
        Interop.valueLayout.ADDRESS.withName("is_selected"),
        Interop.valueLayout.ADDRESS.withName("end_preview"),
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
     * Allocate a new {@link PrintOperationPreviewIface}
     * @return A new, uninitialized @{link PrintOperationPreviewIface}
     */
    public static PrintOperationPreviewIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PrintOperationPreviewIface newInstance = new PrintOperationPreviewIface(segment.address(), Ownership.NONE);
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
     * Create a PrintOperationPreviewIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PrintOperationPreviewIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PrintOperationPreviewIface struct;
        
         /**
         * A {@link PrintOperationPreviewIface.Build} object constructs a {@link PrintOperationPreviewIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PrintOperationPreviewIface.allocate();
        }
        
         /**
         * Finish building the {@link PrintOperationPreviewIface} struct.
         * @return A new instance of {@code PrintOperationPreviewIface} with the fields 
         *         that were set in the Build object.
         */
        public PrintOperationPreviewIface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setReady(java.lang.foreign.MemoryAddress ready) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ready"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ready == null ? MemoryAddress.NULL : ready));
            return this;
        }
        
        public Build setGotPageSize(java.lang.foreign.MemoryAddress got_page_size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("got_page_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (got_page_size == null ? MemoryAddress.NULL : got_page_size));
            return this;
        }
        
        public Build setRenderPage(java.lang.foreign.MemoryAddress render_page) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render_page"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (render_page == null ? MemoryAddress.NULL : render_page));
            return this;
        }
        
        public Build setIsSelected(java.lang.foreign.MemoryAddress is_selected) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_selected"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_selected == null ? MemoryAddress.NULL : is_selected));
            return this;
        }
        
        public Build setEndPreview(java.lang.foreign.MemoryAddress end_preview) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_preview"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (end_preview == null ? MemoryAddress.NULL : end_preview));
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
