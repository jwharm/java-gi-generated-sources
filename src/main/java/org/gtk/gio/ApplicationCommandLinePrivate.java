package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ApplicationCommandLinePrivate extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GApplicationCommandLinePrivate";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ApplicationCommandLinePrivate}
     * @return A new, uninitialized @{link ApplicationCommandLinePrivate}
     */
    public static ApplicationCommandLinePrivate allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ApplicationCommandLinePrivate newInstance = new ApplicationCommandLinePrivate(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ApplicationCommandLinePrivate proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ApplicationCommandLinePrivate(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ApplicationCommandLinePrivate struct;
        
         /**
         * A {@link ApplicationCommandLinePrivate.Build} object constructs a {@link ApplicationCommandLinePrivate} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ApplicationCommandLinePrivate.allocate();
        }
        
         /**
         * Finish building the {@link ApplicationCommandLinePrivate} struct.
         * @return A new instance of {@code ApplicationCommandLinePrivate} with the fields 
         *         that were set in the Build object.
         */
        public ApplicationCommandLinePrivate construct() {
            return struct;
        }
    }
}
