package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Any of the fields in {@link MarkupParser} can be {@code null}, in which case they
 * will be ignored. Except for the {@code error} function, any of these callbacks
 * can set an error; in particular the {@link MarkupError#UNKNOWN_ELEMENT},
 * {@link MarkupError#UNKNOWN_ATTRIBUTE}, and {@link MarkupError#INVALID_CONTENT}
 * errors are intended to be set from these callbacks. If you set an error
 * from a callback, g_markup_parse_context_parse() will report that error
 * back to its caller.
 */
public class MarkupParser extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMarkupParser";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("start_element"),
        Interop.valueLayout.ADDRESS.withName("end_element"),
        Interop.valueLayout.ADDRESS.withName("text"),
        Interop.valueLayout.ADDRESS.withName("passthrough"),
        Interop.valueLayout.ADDRESS.withName("error")
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
     * Allocate a new {@link MarkupParser}
     * @return A new, uninitialized @{link MarkupParser}
     */
    public static MarkupParser allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MarkupParser newInstance = new MarkupParser(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MarkupParser proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MarkupParser(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MarkupParser struct;
        
         /**
         * A {@link MarkupParser.Build} object constructs a {@link MarkupParser} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MarkupParser.allocate();
        }
        
         /**
         * Finish building the {@link MarkupParser} struct.
         * @return A new instance of {@code MarkupParser} with the fields 
         *         that were set in the Build object.
         */
        public MarkupParser construct() {
            return struct;
        }
        
        public Build setStartElement(java.lang.foreign.MemoryAddress start_element) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start_element == null ? MemoryAddress.NULL : start_element));
            return this;
        }
        
        public Build setEndElement(java.lang.foreign.MemoryAddress end_element) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (end_element == null ? MemoryAddress.NULL : end_element));
            return this;
        }
        
        public Build setText(java.lang.foreign.MemoryAddress text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (text == null ? MemoryAddress.NULL : text));
            return this;
        }
        
        public Build setPassthrough(java.lang.foreign.MemoryAddress passthrough) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("passthrough"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (passthrough == null ? MemoryAddress.NULL : passthrough));
            return this;
        }
        
        public Build setError(java.lang.foreign.MemoryAddress error) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("error"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (error == null ? MemoryAddress.NULL : error));
            return this;
        }
    }
}
