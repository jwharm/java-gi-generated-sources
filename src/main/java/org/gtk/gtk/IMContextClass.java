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
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setPreeditStart(java.lang.foreign.MemoryAddress preedit_start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preedit_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preedit_start == null ? MemoryAddress.NULL : preedit_start));
            return this;
        }
        
        public Build setPreeditEnd(java.lang.foreign.MemoryAddress preedit_end) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preedit_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preedit_end == null ? MemoryAddress.NULL : preedit_end));
            return this;
        }
        
        public Build setPreeditChanged(java.lang.foreign.MemoryAddress preedit_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preedit_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preedit_changed == null ? MemoryAddress.NULL : preedit_changed));
            return this;
        }
        
        public Build setCommit(java.lang.foreign.MemoryAddress commit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("commit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (commit == null ? MemoryAddress.NULL : commit));
            return this;
        }
        
        public Build setRetrieveSurrounding(java.lang.foreign.MemoryAddress retrieve_surrounding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("retrieve_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (retrieve_surrounding == null ? MemoryAddress.NULL : retrieve_surrounding));
            return this;
        }
        
        public Build setDeleteSurrounding(java.lang.foreign.MemoryAddress delete_surrounding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delete_surrounding == null ? MemoryAddress.NULL : delete_surrounding));
            return this;
        }
        
        public Build setSetClientWidget(java.lang.foreign.MemoryAddress set_client_widget) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_client_widget"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_client_widget == null ? MemoryAddress.NULL : set_client_widget));
            return this;
        }
        
        public Build setGetPreeditString(java.lang.foreign.MemoryAddress get_preedit_string) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preedit_string"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_preedit_string == null ? MemoryAddress.NULL : get_preedit_string));
            return this;
        }
        
        public Build setFilterKeypress(java.lang.foreign.MemoryAddress filter_keypress) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("filter_keypress"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (filter_keypress == null ? MemoryAddress.NULL : filter_keypress));
            return this;
        }
        
        public Build setFocusIn(java.lang.foreign.MemoryAddress focus_in) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("focus_in"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (focus_in == null ? MemoryAddress.NULL : focus_in));
            return this;
        }
        
        public Build setFocusOut(java.lang.foreign.MemoryAddress focus_out) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("focus_out"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (focus_out == null ? MemoryAddress.NULL : focus_out));
            return this;
        }
        
        public Build setReset(java.lang.foreign.MemoryAddress reset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset));
            return this;
        }
        
        public Build setSetCursorLocation(java.lang.foreign.MemoryAddress set_cursor_location) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_cursor_location"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_cursor_location == null ? MemoryAddress.NULL : set_cursor_location));
            return this;
        }
        
        public Build setSetUsePreedit(java.lang.foreign.MemoryAddress set_use_preedit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_use_preedit"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_use_preedit == null ? MemoryAddress.NULL : set_use_preedit));
            return this;
        }
        
        public Build setSetSurrounding(java.lang.foreign.MemoryAddress set_surrounding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_surrounding == null ? MemoryAddress.NULL : set_surrounding));
            return this;
        }
        
        public Build setGetSurrounding(java.lang.foreign.MemoryAddress get_surrounding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surrounding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_surrounding == null ? MemoryAddress.NULL : get_surrounding));
            return this;
        }
        
        public Build setSetSurroundingWithSelection(java.lang.foreign.MemoryAddress set_surrounding_with_selection) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_surrounding_with_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_surrounding_with_selection == null ? MemoryAddress.NULL : set_surrounding_with_selection));
            return this;
        }
        
        public Build setGetSurroundingWithSelection(java.lang.foreign.MemoryAddress get_surrounding_with_selection) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_surrounding_with_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_surrounding_with_selection == null ? MemoryAddress.NULL : get_surrounding_with_selection));
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
    }
}
