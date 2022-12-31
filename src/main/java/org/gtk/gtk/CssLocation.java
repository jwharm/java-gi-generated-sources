package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a location in a file or other source of data parsed
 * by the CSS engine.
 * <p>
 * The {@code bytes} and {@code line_bytes} offsets are meant to be used to
 * programmatically match data. The {@code lines} and {@code line_chars} offsets
 * can be used for printing the location in a file.
 * <p>
 * Note that the {@code lines} parameter starts from 0 and is increased
 * whenever a CSS line break is encountered. (CSS defines the C character
 * sequences "\\r\\n", "\\r", "\\n" and "\\f" as newlines.)
 * If your document uses different rules for line breaking, you might want
 * run into problems here.
 */
public class CssLocation extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCssLocation";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_LONG.withName("bytes"),
            Interop.valueLayout.C_LONG.withName("chars"),
            Interop.valueLayout.C_LONG.withName("lines"),
            Interop.valueLayout.C_LONG.withName("line_bytes"),
            Interop.valueLayout.C_LONG.withName("line_chars")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CssLocation}
     * @return A new, uninitialized @{link CssLocation}
     */
    public static CssLocation allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CssLocation newInstance = new CssLocation(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code bytes}
     * @return The value of the field {@code bytes}
     */
    public long getBytes() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bytes}
     * @param bytes The new value of the field {@code bytes}
     */
    public void setBytes(long bytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), bytes);
    }
    
    /**
     * Get the value of the field {@code chars}
     * @return The value of the field {@code chars}
     */
    public long getChars() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("chars"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code chars}
     * @param chars The new value of the field {@code chars}
     */
    public void setChars(long chars) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("chars"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), chars);
    }
    
    /**
     * Get the value of the field {@code lines}
     * @return The value of the field {@code lines}
     */
    public long getLines() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lines"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code lines}
     * @param lines The new value of the field {@code lines}
     */
    public void setLines(long lines) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lines"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lines);
    }
    
    /**
     * Get the value of the field {@code line_bytes}
     * @return The value of the field {@code line_bytes}
     */
    public long getLineBytes() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_bytes"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code line_bytes}
     * @param lineBytes The new value of the field {@code line_bytes}
     */
    public void setLineBytes(long lineBytes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_bytes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lineBytes);
    }
    
    /**
     * Get the value of the field {@code line_chars}
     * @return The value of the field {@code line_chars}
     */
    public long getLineChars() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_chars"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code line_chars}
     * @param lineChars The new value of the field {@code line_chars}
     */
    public void setLineChars(long lineChars) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("line_chars"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), lineChars);
    }
    
    /**
     * Create a CssLocation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CssLocation(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CssLocation> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CssLocation(input, ownership);
    
    /**
     * A {@link CssLocation.Builder} object constructs a {@link CssLocation} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CssLocation.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CssLocation struct;
        
        private Builder() {
            struct = CssLocation.allocate();
        }
        
         /**
         * Finish building the {@link CssLocation} struct.
         * @return A new instance of {@code CssLocation} with the fields 
         *         that were set in the Builder object.
         */
        public CssLocation build() {
            return struct;
        }
        
        /**
         * number of bytes parsed since the beginning
         * @param bytes The value for the {@code bytes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBytes(long bytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bytes);
            return this;
        }
        
        /**
         * number of characters parsed since the beginning
         * @param chars The value for the {@code chars} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChars(long chars) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("chars"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), chars);
            return this;
        }
        
        /**
         * number of full lines that have been parsed. If you want to
         *   display this as a line number, you need to add 1 to this.
         * @param lines The value for the {@code lines} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLines(long lines) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lines"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), lines);
            return this;
        }
        
        /**
         * Number of bytes parsed since the last line break
         * @param lineBytes The value for the {@code lineBytes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLineBytes(long lineBytes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("line_bytes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), lineBytes);
            return this;
        }
        
        /**
         * Number of characters parsed since the last line break
         * @param lineChars The value for the {@code lineChars} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLineChars(long lineChars) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("line_chars"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), lineChars);
            return this;
        }
    }
}
