package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A location in a parse buffer.
 */
public class ParseLocation extends Struct {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskParseLocation";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_LONG.withName("bytes"),
        Interop.valueLayout.C_LONG.withName("chars"),
        Interop.valueLayout.C_LONG.withName("lines"),
        Interop.valueLayout.C_LONG.withName("line_bytes"),
        Interop.valueLayout.C_LONG.withName("line_chars")
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
     * Allocate a new {@link ParseLocation}
     * @return A new, uninitialized @{link ParseLocation}
     */
    public static ParseLocation allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ParseLocation newInstance = new ParseLocation(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code bytes}
     * @return The value of the field {@code bytes}
     */
    public long bytes$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bytes}
     * @param bytes The new value of the field {@code bytes}
     */
    public void bytes$set(long bytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bytes);
    }
    
    /**
     * Get the value of the field {@code chars}
     * @return The value of the field {@code chars}
     */
    public long chars$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("chars"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code chars}
     * @param chars The new value of the field {@code chars}
     */
    public void chars$set(long chars) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("chars"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), chars);
    }
    
    /**
     * Get the value of the field {@code lines}
     * @return The value of the field {@code lines}
     */
    public long lines$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lines"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code lines}
     * @param lines The new value of the field {@code lines}
     */
    public void lines$set(long lines) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lines"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lines);
    }
    
    /**
     * Get the value of the field {@code line_bytes}
     * @return The value of the field {@code line_bytes}
     */
    public long lineBytes$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code line_bytes}
     * @param lineBytes The new value of the field {@code line_bytes}
     */
    public void lineBytes$set(long lineBytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lineBytes);
    }
    
    /**
     * Get the value of the field {@code line_chars}
     * @return The value of the field {@code line_chars}
     */
    public long lineChars$get() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_chars"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code line_chars}
     * @param lineChars The new value of the field {@code line_chars}
     */
    public void lineChars$set(long lineChars) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_chars"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lineChars);
    }
    
    /**
     * Create a ParseLocation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ParseLocation(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ParseLocation struct;
        
         /**
         * A {@link ParseLocation.Build} object constructs a {@link ParseLocation} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ParseLocation.allocate();
        }
        
         /**
         * Finish building the {@link ParseLocation} struct.
         * @return A new instance of {@code ParseLocation} with the fields 
         *         that were set in the Build object.
         */
        public ParseLocation construct() {
            return struct;
        }
        
        /**
         * the offset of the location in the parse buffer, as bytes
         * @param bytes The value for the {@code bytes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBytes(long bytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bytes);
            return this;
        }
        
        /**
         * the offset of the location in the parse buffer, as characters
         * @param chars The value for the {@code chars} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setChars(long chars) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("chars"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), chars);
            return this;
        }
        
        /**
         * the line of the location in the parse buffer
         * @param lines The value for the {@code lines} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLines(long lines) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lines"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), lines);
            return this;
        }
        
        /**
         * the position in the line, as bytes
         * @param lineBytes The value for the {@code lineBytes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLineBytes(long lineBytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("line_bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), lineBytes);
            return this;
        }
        
        /**
         * the position in the line, as characters
         * @param lineChars The value for the {@code lineChars} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLineChars(long lineChars) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("line_chars"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), lineChars);
            return this;
        }
    }
}
