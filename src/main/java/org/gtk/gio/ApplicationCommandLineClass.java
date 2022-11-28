package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link ApplicationCommandLineClass}-struct
 * contains private data only.
 * @version 2.28
 */
public class ApplicationCommandLineClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GApplicationCommandLineClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("print_literal"),
        Interop.valueLayout.ADDRESS.withName("printerr_literal"),
        Interop.valueLayout.ADDRESS.withName("get_stdin"),
        MemoryLayout.sequenceLayout(11, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link ApplicationCommandLineClass}
     * @return A new, uninitialized @{link ApplicationCommandLineClass}
     */
    public static ApplicationCommandLineClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ApplicationCommandLineClass newInstance = new ApplicationCommandLineClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ApplicationCommandLineClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ApplicationCommandLineClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ApplicationCommandLineClass struct;
        
         /**
         * A {@link ApplicationCommandLineClass.Build} object constructs a {@link ApplicationCommandLineClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ApplicationCommandLineClass.allocate();
        }
        
         /**
         * Finish building the {@link ApplicationCommandLineClass} struct.
         * @return A new instance of {@code ApplicationCommandLineClass} with the fields 
         *         that were set in the Build object.
         */
        public ApplicationCommandLineClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setPrintLiteral(java.lang.foreign.MemoryAddress printLiteral) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("print_literal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (printLiteral == null ? MemoryAddress.NULL : printLiteral));
            return this;
        }
        
        public Build setPrinterrLiteral(java.lang.foreign.MemoryAddress printerrLiteral) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("printerr_literal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (printerrLiteral == null ? MemoryAddress.NULL : printerrLiteral));
            return this;
        }
        
        public Build setGetStdin(java.lang.foreign.MemoryAddress getStdin) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_stdin"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStdin == null ? MemoryAddress.NULL : getStdin));
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
