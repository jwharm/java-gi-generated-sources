package org.gstreamer.mpegts;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A program entry from a Program Association Table (ITU H.222.0, ISO/IEC 13818-1).
 */
public class PatProgram extends Struct {
    
    static {
        GstMpegts.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpegtsPatProgram";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("program_number"),
            Interop.valueLayout.C_SHORT.withName("network_or_program_map_PID")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PatProgram}
     * @return A new, uninitialized @{link PatProgram}
     */
    public static PatProgram allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PatProgram newInstance = new PatProgram(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code program_number}
     * @return The value of the field {@code program_number}
     */
    public short getProgramNumber() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code program_number}
     * @param programNumber The new value of the field {@code program_number}
     */
    public void setProgramNumber(short programNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("program_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), programNumber);
    }
    
    /**
     * Get the value of the field {@code network_or_program_map_PID}
     * @return The value of the field {@code network_or_program_map_PID}
     */
    public short getNetworkOrProgramMapPID() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_or_program_map_PID"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code network_or_program_map_PID}
     * @param networkOrProgramMapPID The new value of the field {@code network_or_program_map_PID}
     */
    public void setNetworkOrProgramMapPID(short networkOrProgramMapPID) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("network_or_program_map_PID"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), networkOrProgramMapPID);
    }
    
    /**
     * Create a PatProgram proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PatProgram(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PatProgram> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PatProgram(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpegts_pat_program_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a new {@link PatProgram}.
     */
    public PatProgram() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpegts_pat_program_new = Interop.downcallHandle(
            "gst_mpegts_pat_program_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link PatProgram.Builder} object constructs a {@link PatProgram} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PatProgram.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PatProgram struct;
        
        private Builder() {
            struct = PatProgram.allocate();
        }
        
         /**
         * Finish building the {@link PatProgram} struct.
         * @return A new instance of {@code PatProgram} with the fields 
         *         that were set in the Builder object.
         */
        public PatProgram build() {
            return struct;
        }
        
        /**
         * the program number
         * @param programNumber The value for the {@code programNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProgramNumber(short programNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("program_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), programNumber);
            return this;
        }
        
        /**
         * the network of program map PID
         * @param networkOrProgramMapPID The value for the {@code networkOrProgramMapPID} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNetworkOrProgramMapPID(short networkOrProgramMapPID) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("network_or_program_map_PID"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), networkOrProgramMapPID);
            return this;
        }
    }
}
