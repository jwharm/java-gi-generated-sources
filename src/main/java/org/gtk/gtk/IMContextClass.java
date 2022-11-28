package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class IMContextClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkIMContextClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("preedit_start"),
        Interop.valueLayout.ADDRESS.withName("preedit_end"),
        Interop.valueLayout.ADDRESS.withName("preedit_changed"),
        Interop.valueLayout.ADDRESS.withName("commit"),
        Interop.valueLayout.ADDRESS.withName("retrieve_surrounding"),
        Interop.valueLayout.ADDRESS.withName("delete_surrounding"),
        Interop.valueLayout.ADDRESS.withName("set_client_widget"),
        Interop.valueLayout.ADDRESS.withName("get_preedit_string"),
        Interop.valueLayout.ADDRESS.withName("filter_keypress"),
        Interop.valueLayout.ADDRESS.withName("focus_in"),
        Interop.valueLayout.ADDRESS.withName("focus_out"),
        Interop.valueLayout.ADDRESS.withName("reset"),
        Interop.valueLayout.ADDRESS.withName("set_cursor_location"),
        Interop.valueLayout.ADDRESS.withName("set_use_preedit"),
        Interop.valueLayout.ADDRESS.withName("set_surrounding"),
        Interop.valueLayout.ADDRESS.withName("get_surrounding"),
        Interop.valueLayout.ADDRESS.withName("set_surrounding_with_selection"),
        Interop.valueLayout.ADDRESS.withName("get_surrounding_with_selection"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved5")
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
     * Allocate a new {@link IMContextClass}
     * @return A new, uninitialized @{link IMContextClass}
     */
    public static IMContextClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IMContextClass newInstance = new IMContextClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a IMContextClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IMContextClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private IMContextClass struct;
        
         /**
         * A {@link IMContextClass.Build} object constructs a {@link IMContextClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = IMContextClass.allocate();
        }
        
         /**
         * Finish building the {@link IMContextClass} struct.
         * @return A new instance of {@code IMContextClass} with the fields 
         *         that were set in the Build object.
         */
        public IMContextClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setPreeditStart(java.lang.foreign.MemoryAddress preeditStart) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preedit_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preeditStart == null ? MemoryAddress.NULL : preeditStart));
            return this;
        }
        
        public Build setPreeditEnd(java.lang.foreign.MemoryAddress preeditEnd) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preedit_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preeditEnd == null ? MemoryAddress.NULL : preeditEnd));
            return this;
        }
        
        public Build setPreeditChanged(java.lang.foreign.MemoryAddress preeditChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preedit_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preeditChanged == null ? MemoryAddress.NULL : preeditChanged));
            return this;
        }
        
        public Build setCommit(java.lang.foreign.MemoryAddress commit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("commit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (commit == null ? MemoryAddress.NULL : commit));
            return this;
        }
        
        public Build setRetrieveSurrounding(java.lang.foreign.MemoryAddress retrieveSurrounding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("retrieve_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (retrieveSurrounding == null ? MemoryAddress.NULL : retrieveSurrounding));
            return this;
        }
        
        public Build setDeleteSurrounding(java.lang.foreign.MemoryAddress deleteSurrounding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteSurrounding == null ? MemoryAddress.NULL : deleteSurrounding));
            return this;
        }
        
        public Build setSetClientWidget(java.lang.foreign.MemoryAddress setClientWidget) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_client_widget"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setClientWidget == null ? MemoryAddress.NULL : setClientWidget));
            return this;
        }
        
        public Build setGetPreeditString(java.lang.foreign.MemoryAddress getPreeditString) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preedit_string"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreeditString == null ? MemoryAddress.NULL : getPreeditString));
            return this;
        }
        
        public Build setFilterKeypress(java.lang.foreign.MemoryAddress filterKeypress) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("filter_keypress"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (filterKeypress == null ? MemoryAddress.NULL : filterKeypress));
            return this;
        }
        
        public Build setFocusIn(java.lang.foreign.MemoryAddress focusIn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("focus_in"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (focusIn == null ? MemoryAddress.NULL : focusIn));
            return this;
        }
        
        public Build setFocusOut(java.lang.foreign.MemoryAddress focusOut) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("focus_out"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (focusOut == null ? MemoryAddress.NULL : focusOut));
            return this;
        }
        
        public Build setReset(java.lang.foreign.MemoryAddress reset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset));
            return this;
        }
        
        public Build setSetCursorLocation(java.lang.foreign.MemoryAddress setCursorLocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_cursor_location"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCursorLocation == null ? MemoryAddress.NULL : setCursorLocation));
            return this;
        }
        
        public Build setSetUsePreedit(java.lang.foreign.MemoryAddress setUsePreedit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_use_preedit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setUsePreedit == null ? MemoryAddress.NULL : setUsePreedit));
            return this;
        }
        
        public Build setSetSurrounding(java.lang.foreign.MemoryAddress setSurrounding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSurrounding == null ? MemoryAddress.NULL : setSurrounding));
            return this;
        }
        
        public Build setGetSurrounding(java.lang.foreign.MemoryAddress getSurrounding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSurrounding == null ? MemoryAddress.NULL : getSurrounding));
            return this;
        }
        
        public Build setSetSurroundingWithSelection(java.lang.foreign.MemoryAddress setSurroundingWithSelection) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_surrounding_with_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSurroundingWithSelection == null ? MemoryAddress.NULL : setSurroundingWithSelection));
            return this;
        }
        
        public Build setGetSurroundingWithSelection(java.lang.foreign.MemoryAddress getSurroundingWithSelection) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surrounding_with_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSurroundingWithSelection == null ? MemoryAddress.NULL : getSurroundingWithSelection));
            return this;
        }
        
        public Build setGtkReserved1(java.lang.foreign.MemoryAddress GtkReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1));
            return this;
        }
        
        public Build setGtkReserved2(java.lang.foreign.MemoryAddress GtkReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2));
            return this;
        }
        
        public Build setGtkReserved3(java.lang.foreign.MemoryAddress GtkReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3));
            return this;
        }
        
        public Build setGtkReserved4(java.lang.foreign.MemoryAddress GtkReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4));
            return this;
        }
        
        public Build setGtkReserved5(java.lang.foreign.MemoryAddress GtkReserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved5 == null ? MemoryAddress.NULL : GtkReserved5));
            return this;
        }
    }
}
